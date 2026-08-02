package io.sentry.android.core;

import io.sentry.JsonObjectReader;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.SentryEvent;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes9.dex */
public final class NativeEventCollector {
    private static final String NATIVE_PLATFORM = "native";
    private static final long TIMESTAMP_TOLERANCE_MS = 5000;
    private final SentryAndroidOptions options;
    private final List<NativeEnvelopeMetadata> nativeEnvelopes = new ArrayList();
    private boolean collected = false;

    public NativeEventCollector(SentryAndroidOptions sentryAndroidOptions) {
        this.options = sentryAndroidOptions;
    }

    static final class NativeEnvelopeMetadata {
        private final File file;
        private final long timestampMs;

        NativeEnvelopeMetadata(File file, long j) {
            this.file = file;
            this.timestampMs = j;
        }

        File getFile() {
            return this.file;
        }

        long getTimestampMs() {
            return this.timestampMs;
        }
    }

    public static final class NativeEventData {
        private final SentryEnvelope envelope;
        private final SentryEvent event;
        private final File file;

        NativeEventData(SentryEvent sentryEvent, File file, SentryEnvelope sentryEnvelope) {
            this.event = sentryEvent;
            this.file = file;
            this.envelope = sentryEnvelope;
        }

        public SentryEvent getEvent() {
            return this.event;
        }

        public File getFile() {
            return this.file;
        }

        public SentryEnvelope getEnvelope() {
            return this.envelope;
        }
    }

    public void collect() {
        NativeEnvelopeMetadata extractNativeEnvelopeMetadata;
        if (this.collected) {
            return;
        }
        this.collected = true;
        String outboxPath = this.options.getOutboxPath();
        if (outboxPath == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            return;
        }
        File[] listFiles = new File(outboxPath).listFiles();
        if (listFiles == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
            return;
        }
        if (listFiles.length == 0) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No envelope files found in outbox.", new Object[0]);
            return;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(listFiles.length));
        for (File file : listFiles) {
            if (file.isFile() && isRelevantFileName(file.getName()) && (extractNativeEnvelopeMetadata = extractNativeEnvelopeMetadata(file)) != null) {
                this.nativeEnvelopes.add(extractNativeEnvelopeMetadata);
                this.options.getLogger().log(SentryLevel.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(extractNativeEnvelopeMetadata.getTimestampMs()));
            }
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(this.nativeEnvelopes.size()));
    }

    public NativeEventData findAndRemoveMatchingNativeEvent(long j) {
        collect();
        for (NativeEnvelopeMetadata nativeEnvelopeMetadata : this.nativeEnvelopes) {
            long abs = Math.abs(j - nativeEnvelopeMetadata.getTimestampMs());
            if (abs <= 5000) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(abs));
                this.nativeEnvelopes.remove(nativeEnvelopeMetadata);
                return loadFullNativeEventData(nativeEnvelopeMetadata.getFile());
            }
        }
        return null;
    }

    public boolean deleteNativeEventFile(NativeEventData nativeEventData) {
        File file = nativeEventData.getFile();
        try {
            if (file.delete()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Deleted native event file from outbox: %s", file.getName());
                return true;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to delete native event file: %s", file.getAbsolutePath());
            return false;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Error deleting native event file: %s", file.getAbsolutePath());
            return false;
        }
    }

    private NativeEnvelopeMetadata extractNativeEnvelopeMetadata(File file) {
        BufferedInputStream bufferedInputStream;
        int skipLine;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                skipLine = skipLine(bufferedInputStream);
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
        }
        if (skipLine < 0) {
            bufferedInputStream.close();
            return null;
        }
        long j = skipLine;
        while (j < 209715200) {
            String readLine = readLine(bufferedInputStream);
            if (readLine != null && !readLine.isEmpty()) {
                long length = j + readLine.length() + 1;
                ItemHeaderInfo parseItemHeader = parseItemHeader(readLine);
                if (parseItemHeader == null) {
                    break;
                }
                if ("event".equals(parseItemHeader.type)) {
                    NativeEnvelopeMetadata extractMetadataFromEventPayload = extractMetadataFromEventPayload(bufferedInputStream, parseItemHeader.length, file);
                    if (extractMetadataFromEventPayload != null) {
                        bufferedInputStream.close();
                        return extractMetadataFromEventPayload;
                    }
                } else {
                    skipBytes(bufferedInputStream, parseItemHeader.length);
                }
                long j2 = length + parseItemHeader.length;
                int read = bufferedInputStream.read();
                if (read == -1) {
                    break;
                }
                j = j2 + 1;
                if (read != 10) {
                    break;
                }
            } else {
                break;
            }
        }
        bufferedInputStream.close();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private NativeEnvelopeMetadata extractMetadataFromEventPayload(InputStream inputStream, int i, File file) {
        NativeEnvelopeMetadata nativeEnvelopeMetadata = null;
        try {
            BoundedInputStream boundedInputStream = new BoundedInputStream(inputStream, i);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(boundedInputStream, StandardCharsets.UTF_8);
                try {
                    JsonObjectReader jsonObjectReader = new JsonObjectReader(inputStreamReader);
                    jsonObjectReader.beginObject();
                    String str = null;
                    Date date = null;
                    while (jsonObjectReader.peek() == JsonToken.NAME) {
                        String nextName = jsonObjectReader.nextName();
                        int hashCode = nextName.hashCode();
                        if (hashCode == 55126294) {
                            if (nextName.equals("timestamp")) {
                                date = jsonObjectReader.nextDateOrNull(this.options.getLogger());
                                if (str == null) {
                                }
                            }
                            jsonObjectReader.skipValue();
                            if (str == null) {
                            }
                        } else {
                            if (hashCode == 1874684019 && nextName.equals("platform")) {
                                str = jsonObjectReader.nextStringOrNull();
                                if (str == null && date != null) {
                                    break;
                                }
                            }
                            jsonObjectReader.skipValue();
                            if (str == null) {
                            }
                        }
                    }
                    if ("native".equals(str) && date != null) {
                        nativeEnvelopeMetadata = new NativeEnvelopeMetadata(file, date.getTime());
                    }
                    inputStreamReader.close();
                    boundedInputStream.close();
                    return nativeEnvelopeMetadata;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, th, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    private NativeEventData loadFullNativeEventData(File file) {
        BufferedInputStream bufferedInputStream;
        SentryEnvelope read;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                read = this.options.getEnvelopeReader().read(bufferedInputStream);
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, th, "Error loading envelope file: %s", file.getAbsolutePath());
        }
        if (read != null) {
            for (SentryEnvelopeItem sentryEnvelopeItem : read.getItems()) {
                if (SentryItemType.Event.equals(sentryEnvelopeItem.getHeader().getType())) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.getData()), StandardCharsets.UTF_8));
                    try {
                        SentryEvent sentryEvent = (SentryEvent) this.options.getSerializer().deserialize(bufferedReader, SentryEvent.class);
                        if (sentryEvent != null && "native".equals(sentryEvent.getPlatform())) {
                            NativeEventData nativeEventData = new NativeEventData(sentryEvent, file, read);
                            bufferedReader.close();
                            bufferedInputStream.close();
                            return nativeEventData;
                        }
                        bufferedReader.close();
                    } finally {
                    }
                }
            }
            bufferedInputStream.close();
            return null;
        }
        bufferedInputStream.close();
        return null;
    }

    private static final class ItemHeaderInfo {
        final int length;
        final String type;

        ItemHeaderInfo(String str, int i) {
            this.type = str;
            this.length = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x001d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ItemHeaderInfo parseItemHeader(String str) {
        InputStreamReader inputStreamReader;
        int i;
        String str2;
        try {
            inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            try {
                JsonObjectReader jsonObjectReader = new JsonObjectReader(inputStreamReader);
                jsonObjectReader.beginObject();
                i = -1;
                str2 = null;
                while (jsonObjectReader.peek() == JsonToken.NAME) {
                    String nextName = jsonObjectReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode == -1106363674) {
                        if (nextName.equals(SentryEnvelopeItemHeader.JsonKeys.LENGTH)) {
                            i = jsonObjectReader.nextInt();
                            if (str2 == null) {
                            }
                        }
                        jsonObjectReader.skipValue();
                        if (str2 == null) {
                        }
                    } else {
                        if (hashCode == 3575610 && nextName.equals("type")) {
                            str2 = jsonObjectReader.nextStringOrNull();
                            if (str2 == null && i >= 0) {
                                break;
                            }
                        }
                        jsonObjectReader.skipValue();
                        if (str2 == null) {
                        }
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, th, "Error parsing item header", new Object[0]);
        }
        if (i < 0) {
            inputStreamReader.close();
            return null;
        }
        ItemHeaderInfo itemHeaderInfo = new ItemHeaderInfo(str2, i);
        inputStreamReader.close();
        return itemHeaderInfo;
    }

    private String readLine(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                if (sb.length() > 0) {
                    return sb.toString();
                }
                return null;
            }
            if (read == 10) {
                return sb.toString();
            }
            sb.append((char) read);
        }
    }

    private int skipLine(InputStream inputStream) throws IOException {
        int read;
        int i = 0;
        do {
            read = inputStream.read();
            if (read == -1) {
                if (i > 0) {
                    return i;
                }
                return -1;
            }
            i++;
        } while (read != 10);
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipBytes(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip != 0) {
                j -= skip;
            } else {
                if (inputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j--;
            }
        }
    }

    private boolean isRelevantFileName(String str) {
        return (str == null || str.startsWith(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE) || str.startsWith(EnvelopeCache.PREFIX_PREVIOUS_SESSION_FILE) || str.startsWith(EnvelopeCache.STARTUP_CRASH_MARKER_FILE)) ? false : true;
    }

    private static final class BoundedInputStream extends InputStream {
        private final InputStream inner;
        private long remaining;

        BoundedInputStream(InputStream inputStream, int i) {
            this.inner = inputStream;
            this.remaining = i;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.remaining <= 0) {
                return -1;
            }
            int read = this.inner.read();
            if (read != -1) {
                this.remaining--;
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.remaining;
            if (j <= 0) {
                return -1;
            }
            int read = this.inner.read(bArr, i, Math.min(i2, (int) j));
            if (read > 0) {
                this.remaining -= read;
            }
            return read;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = this.inner.skip(Math.min(j, this.remaining));
            this.remaining -= skip;
            return skip;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return Math.min(this.inner.available(), (int) this.remaining);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            NativeEventCollector.skipBytes(this.inner, this.remaining);
            this.remaining = 0L;
        }
    }
}
