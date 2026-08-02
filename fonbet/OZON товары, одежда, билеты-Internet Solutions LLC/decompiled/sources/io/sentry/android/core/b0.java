package io.sentry.android.core;

import io.sentry.C7204t0;
import io.sentry.C7222x2;
import io.sentry.C7230z2;
import io.sentry.H2;
import io.sentry.I2;
import io.sentry.V1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67056a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f67057b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f67058c = false;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f67061a;

        /* renamed from: b, reason: collision with root package name */
        final int f67062b;

        b(String str, int i11) {
            this.f67061a = str;
            this.f67062b = i11;
        }
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final File f67063a;

        /* renamed from: b, reason: collision with root package name */
        private final long f67064b;

        c(@NotNull File file, long j11) {
            this.f67063a = file;
            this.f67064b = j11;
        }

        @NotNull
        final File a() {
            return this.f67063a;
        }

        final long b() {
            return this.f67064b;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C7230z2 f67065a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final File f67066b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final V1 f67067c;

        d(@NotNull C7230z2 c7230z2, @NotNull File file, @NotNull V1 v12) {
            this.f67065a = c7230z2;
            this.f67066b = file;
            this.f67067c = v12;
        }

        @NotNull
        public final V1 a() {
            return this.f67067c;
        }

        @NotNull
        public final C7230z2 b() {
            return this.f67065a;
        }

        @NotNull
        public final File c() {
            return this.f67066b;
        }
    }

    public b0(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f67056a = sentryAndroidOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0019 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:7:0x000f, B:8:0x0019, B:10:0x0021, B:18:0x0050, B:36:0x0054, B:37:0x005d, B:38:0x0035, B:41:0x0041, B:23:0x0065, B:26:0x006f), top: B:6:0x000f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private c c(@NotNull BufferedInputStream bufferedInputStream, int i11, @NotNull File file) {
        char c11;
        SentryAndroidOptions sentryAndroidOptions = this.f67056a;
        c cVar = null;
        try {
            a aVar = new a(bufferedInputStream, i11);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(aVar, StandardCharsets.UTF_8);
                try {
                    C7204t0 c7204t0 = new C7204t0(inputStreamReader);
                    c7204t0.beginObject();
                    String str = null;
                    Date date = null;
                    while (c7204t0.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String nextName = c7204t0.nextName();
                        int hashCode = nextName.hashCode();
                        if (hashCode != 55126294) {
                            if (hashCode == 1874684019 && nextName.equals("platform")) {
                                c11 = 0;
                                if (c11 != 0) {
                                    str = c7204t0.k0();
                                } else if (c11 != 1) {
                                    c7204t0.skipValue();
                                } else {
                                    date = c7204t0.M(sentryAndroidOptions.getLogger());
                                }
                                if (str == null && date != null) {
                                    break;
                                }
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                            if (str == null) {
                            }
                        } else {
                            if (nextName.equals("timestamp")) {
                                c11 = 1;
                                if (c11 != 0) {
                                }
                                if (str == null) {
                                }
                            }
                            c11 = 65535;
                            if (c11 != 0) {
                            }
                            if (str == null) {
                            }
                        }
                    }
                    if ("native".equals(str) && date != null) {
                        cVar = new c(file, date.getTime());
                    }
                    inputStreamReader.close();
                    aVar.close();
                    return cVar;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.DEBUG, th2, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x001d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:5:0x0012, B:6:0x001d, B:8:0x0025, B:16:0x0054, B:32:0x0058, B:33:0x005d, B:34:0x0039, B:37:0x0045, B:22:0x0067), top: B:4:0x0012, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private b e(@NotNull String str) {
        boolean z11;
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                C7204t0 c7204t0 = new C7204t0(inputStreamReader);
                c7204t0.beginObject();
                String str2 = null;
                int i11 = -1;
                while (c7204t0.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String nextName = c7204t0.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1106363674) {
                        if (hashCode == 3575610 && nextName.equals("type")) {
                            z11 = false;
                            if (z11) {
                                str2 = c7204t0.k0();
                            } else if (!z11) {
                                c7204t0.skipValue();
                            } else {
                                i11 = c7204t0.nextInt();
                            }
                            if (str2 == null && i11 >= 0) {
                                break;
                            }
                        }
                        z11 = -1;
                        if (z11) {
                        }
                        if (str2 == null) {
                        }
                    } else {
                        if (nextName.equals("length")) {
                            z11 = true;
                            if (z11) {
                            }
                            if (str2 == null) {
                            }
                        }
                        z11 = -1;
                        if (z11) {
                        }
                        if (str2 == null) {
                        }
                    }
                }
                if (i11 < 0) {
                    inputStreamReader.close();
                    return null;
                }
                b bVar = new b(str2, i11);
                inputStreamReader.close();
                return bVar;
            } finally {
            }
        } catch (Throwable th2) {
            this.f67056a.getLogger().b(I2.DEBUG, th2, "Error parsing item header", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(@NotNull BufferedInputStream bufferedInputStream, long j11) throws IOException {
        while (j11 > 0) {
            long skip = bufferedInputStream.skip(j11);
            if (skip != 0) {
                j11 -= skip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j11--;
            }
        }
    }

    public final boolean b(@NotNull d dVar) {
        SentryAndroidOptions sentryAndroidOptions = this.f67056a;
        File c11 = dVar.c();
        try {
            if (c11.delete()) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "Deleted native event file from outbox: %s", c11.getName());
                return true;
            }
            sentryAndroidOptions.getLogger().c(I2.WARNING, "Failed to delete native event file: %s", c11.getAbsolutePath());
            return false;
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Error deleting native event file: %s", c11.getAbsolutePath());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0152, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0126, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0167, code lost:
    
        r15.getLogger().b(io.sentry.I2.DEBUG, r0, "Error extracting metadata from envelope file: %s", r10.getAbsolutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00fb, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d d(long j11) {
        SentryAndroidOptions sentryAndroidOptions;
        d dVar;
        SentryAndroidOptions sentryAndroidOptions2;
        boolean z11;
        File[] fileArr;
        String name;
        c cVar;
        c cVar2;
        BufferedInputStream bufferedInputStream;
        int i11;
        String sb2;
        Iterator it;
        BufferedInputStream bufferedInputStream2;
        boolean z12 = this.f67058c;
        ArrayList arrayList = this.f67057b;
        SentryAndroidOptions sentryAndroidOptions3 = this.f67056a;
        if (!z12) {
            boolean z13 = true;
            this.f67058c = true;
            String outboxPath = sentryAndroidOptions3.getOutboxPath();
            int i12 = 0;
            if (outboxPath == null) {
                sentryAndroidOptions3.getLogger().c(I2.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            } else {
                File[] listFiles = new File(outboxPath).listFiles();
                if (listFiles == null) {
                    sentryAndroidOptions3.getLogger().c(I2.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                } else {
                    if (listFiles.length != 0) {
                        sentryAndroidOptions3.getLogger().c(I2.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(listFiles.length));
                        int length = listFiles.length;
                        int i13 = 0;
                        while (i13 < length) {
                            File file = listFiles[i13];
                            if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
                                sentryAndroidOptions2 = sentryAndroidOptions3;
                                z11 = z13;
                                fileArr = listFiles;
                            } else {
                                try {
                                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                    i11 = i12;
                                    while (true) {
                                        try {
                                            int read = bufferedInputStream.read();
                                            if (read != -1) {
                                                i11++;
                                                if (read == 10) {
                                                    break;
                                                }
                                            } else if (i11 <= 0) {
                                                i11 = -1;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sentryAndroidOptions2 = sentryAndroidOptions3;
                                            z11 = z13;
                                            fileArr = listFiles;
                                            cVar = null;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sentryAndroidOptions2 = sentryAndroidOptions3;
                                    z11 = z13;
                                    fileArr = listFiles;
                                    cVar = null;
                                }
                                if (i11 < 0) {
                                    bufferedInputStream.close();
                                    sentryAndroidOptions2 = sentryAndroidOptions3;
                                    z11 = z13;
                                    fileArr = listFiles;
                                    cVar2 = null;
                                } else {
                                    sentryAndroidOptions2 = sentryAndroidOptions3;
                                    cVar = null;
                                    long j12 = i11;
                                    while (true) {
                                        if (j12 >= 209715200) {
                                            z11 = z13;
                                            break;
                                        }
                                        try {
                                            StringBuilder sb3 = new StringBuilder();
                                            z11 = z13;
                                            while (true) {
                                                try {
                                                    int read2 = bufferedInputStream.read();
                                                    if (read2 == -1) {
                                                        sb2 = sb3.length() > 0 ? sb3.toString() : null;
                                                    } else {
                                                        if (read2 == 10) {
                                                            sb2 = sb3.toString();
                                                            break;
                                                        }
                                                        sb3.append((char) read2);
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                            if (sb2 == null) {
                                                break;
                                            }
                                            try {
                                                if (sb2.isEmpty()) {
                                                    break;
                                                }
                                                fileArr = listFiles;
                                                long length2 = j12 + sb2.length() + 1;
                                                try {
                                                    b e11 = e(sb2);
                                                    if (e11 == null) {
                                                        break;
                                                    }
                                                    int i14 = e11.f67062b;
                                                    if ("event".equals(e11.f67061a)) {
                                                        cVar2 = c(bufferedInputStream, i14, file);
                                                        if (cVar2 != null) {
                                                            bufferedInputStream.close();
                                                            break;
                                                        }
                                                    } else {
                                                        f(bufferedInputStream, i14);
                                                    }
                                                    long j13 = length2 + i14;
                                                    int read3 = bufferedInputStream.read();
                                                    if (read3 != -1) {
                                                        j12 = j13 + 1;
                                                        if (read3 == 10) {
                                                            z13 = z11;
                                                            listFiles = fileArr;
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    Throwable th6 = th;
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th7) {
                                                        th6.addSuppressed(th7);
                                                    }
                                                    throw th6;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                fileArr = listFiles;
                                                Throwable th62 = th;
                                                bufferedInputStream.close();
                                                throw th62;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            z11 = z13;
                                        }
                                    }
                                    cVar2 = cVar;
                                }
                                if (cVar2 == null) {
                                    arrayList.add(cVar2);
                                    sentryAndroidOptions2.getLogger().c(I2.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(cVar2.b()));
                                }
                            }
                            i13++;
                            sentryAndroidOptions3 = sentryAndroidOptions2;
                            z13 = z11;
                            listFiles = fileArr;
                            i12 = 0;
                        }
                        sentryAndroidOptions = sentryAndroidOptions3;
                        dVar = null;
                        sentryAndroidOptions.getLogger().c(I2.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            c cVar3 = (c) it.next();
                            long abs = Math.abs(j11 - cVar3.b());
                            if (abs <= 5000) {
                                sentryAndroidOptions.getLogger().c(I2.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(abs));
                                arrayList.remove(cVar3);
                                File a11 = cVar3.a();
                                try {
                                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(a11));
                                } catch (Throwable th10) {
                                    sentryAndroidOptions.getLogger().b(I2.DEBUG, th10, "Error loading envelope file: %s", a11.getAbsolutePath());
                                }
                                try {
                                    V1 a12 = sentryAndroidOptions.getEnvelopeReader().a(bufferedInputStream2);
                                    if (a12 != null) {
                                        for (C7222x2 c7222x2 : a12.b()) {
                                            if (H2.Event.equals(c7222x2.p().e())) {
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c7222x2.o()), StandardCharsets.UTF_8));
                                                try {
                                                    C7230z2 c7230z2 = (C7230z2) sentryAndroidOptions.getSerializer().c(bufferedReader, C7230z2.class);
                                                    if (c7230z2 != null && "native".equals(c7230z2.I())) {
                                                        d dVar2 = new d(c7230z2, a11, a12);
                                                        bufferedReader.close();
                                                        bufferedInputStream2.close();
                                                        return dVar2;
                                                    }
                                                    bufferedReader.close();
                                                } finally {
                                                }
                                            }
                                        }
                                    }
                                    bufferedInputStream2.close();
                                    return dVar;
                                } finally {
                                }
                            }
                        }
                        return dVar;
                    }
                    sentryAndroidOptions3.getLogger().c(I2.DEBUG, "No envelope files found in outbox.", new Object[0]);
                }
            }
        }
        sentryAndroidOptions = sentryAndroidOptions3;
        dVar = null;
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        return dVar;
    }

    private static final class a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final BufferedInputStream f67059a;

        /* renamed from: b, reason: collision with root package name */
        private long f67060b;

        a(@NotNull BufferedInputStream bufferedInputStream, int i11) {
            this.f67059a = bufferedInputStream;
            this.f67060b = i11;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return Math.min(this.f67059a.available(), (int) this.f67060b);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            b0.f(this.f67059a, this.f67060b);
            this.f67060b = 0L;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f67060b <= 0) {
                return -1;
            }
            int read = this.f67059a.read();
            if (read != -1) {
                this.f67060b--;
            }
            return read;
        }

        @Override // java.io.InputStream
        public final long skip(long j11) throws IOException {
            long skip = this.f67059a.skip(Math.min(j11, this.f67060b));
            this.f67060b -= skip;
            return skip;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i11, int i12) throws IOException {
            long j11 = this.f67060b;
            if (j11 <= 0) {
                return -1;
            }
            int read = this.f67059a.read(bArr, i11, Math.min(i12, (int) j11));
            if (read > 0) {
                this.f67060b -= read;
            }
            return read;
        }
    }
}
