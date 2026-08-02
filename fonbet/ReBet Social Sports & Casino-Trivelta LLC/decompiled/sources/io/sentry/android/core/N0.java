package io.sentry.android.core;

import com.twilio.voice.EventKeys;
import io.sentry.C4665a3;
import io.sentry.C4733c3;
import io.sentry.C4866x2;
import io.sentry.EnumC4783m3;
import io.sentry.EnumC4788n3;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f50714a;

    /* renamed from: b, reason: collision with root package name */
    public final List f50715b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f50716c = false;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f50719a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50720b;

        public b(String str, int i10) {
            this.f50719a = str;
            this.f50720b = i10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f50721a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50722b;

        public c(File file, long j10) {
            this.f50721a = file;
            this.f50722b = j10;
        }

        public File a() {
            return this.f50721a;
        }

        public long b() {
            return this.f50722b;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final C4733c3 f50723a;

        /* renamed from: b, reason: collision with root package name */
        public final File f50724b;

        /* renamed from: c, reason: collision with root package name */
        public final C4866x2 f50725c;

        public d(C4733c3 c4733c3, File file, C4866x2 c4866x2) {
            this.f50723a = c4733c3;
            this.f50724b = file;
            this.f50725c = c4866x2;
        }

        public C4866x2 a() {
            return this.f50725c;
        }

        public C4733c3 b() {
            return this.f50723a;
        }

        public File c() {
            return this.f50724b;
        }
    }

    public N0(SentryAndroidOptions sentryAndroidOptions) {
        this.f50714a = sentryAndroidOptions;
    }

    public static void k(InputStream inputStream, long j10) {
        while (j10 > 0) {
            long skip = inputStream.skip(j10);
            if (skip != 0) {
                j10 -= skip;
            } else {
                if (inputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j10--;
            }
        }
    }

    public void b() {
        c e10;
        if (this.f50716c) {
            return;
        }
        this.f50716c = true;
        String outboxPath = this.f50714a.getOutboxPath();
        if (outboxPath == null) {
            this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            return;
        }
        File[] listFiles = new File(outboxPath).listFiles();
        if (listFiles == null) {
            this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
            return;
        }
        if (listFiles.length == 0) {
            this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "No envelope files found in outbox.", new Object[0]);
            return;
        }
        this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(listFiles.length));
        for (File file : listFiles) {
            if (file.isFile() && g(file.getName()) && (e10 = e(file)) != null) {
                this.f50715b.add(e10);
                this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(e10.b()));
            }
        }
        this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(this.f50715b.size()));
    }

    public boolean c(d dVar) {
        File c10 = dVar.c();
        try {
            if (c10.delete()) {
                this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "Deleted native event file from outbox: %s", c10.getName());
                return true;
            }
            this.f50714a.getLogger().c(EnumC4788n3.WARNING, "Failed to delete native event file: %s", c10.getAbsolutePath());
            return false;
        } catch (Throwable th2) {
            this.f50714a.getLogger().a(EnumC4788n3.ERROR, th2, "Error deleting native event file: %s", c10.getAbsolutePath());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0017 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c d(InputStream inputStream, int i10, File file) {
        c cVar = null;
        try {
            a aVar = new a(inputStream, i10);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(aVar, StandardCharsets.UTF_8);
                try {
                    io.sentry.C0 c02 = new io.sentry.C0(inputStreamReader);
                    c02.m();
                    String str = null;
                    Date date = null;
                    while (c02.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String f02 = c02.f0();
                        int hashCode = f02.hashCode();
                        if (hashCode != 55126294) {
                            if (hashCode == 1874684019 && f02.equals(EventKeys.PLATFORM)) {
                                str = c02.a1();
                                if (str == null && date != null) {
                                    break;
                                }
                            }
                            c02.C();
                            if (str == null) {
                            }
                        } else {
                            if (f02.equals(EventKeys.TIMESTAMP)) {
                                date = c02.j0(this.f50714a.getLogger());
                                if (str == null) {
                                }
                            }
                            c02.C();
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
            this.f50714a.getLogger().a(EnumC4788n3.DEBUG, th2, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    public final c e(File file) {
        BufferedInputStream bufferedInputStream;
        int l10;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                l10 = l(bufferedInputStream);
            } finally {
            }
        } catch (Throwable th2) {
            this.f50714a.getLogger().a(EnumC4788n3.DEBUG, th2, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
        }
        if (l10 < 0) {
            bufferedInputStream.close();
            return null;
        }
        long j10 = l10;
        while (j10 < 209715200) {
            String j11 = j(bufferedInputStream);
            if (j11 != null && !j11.isEmpty()) {
                long length = j10 + j11.length() + 1;
                b i10 = i(j11);
                if (i10 == null) {
                    break;
                }
                if ("event".equals(i10.f50719a)) {
                    c d10 = d(bufferedInputStream, i10.f50720b, file);
                    if (d10 != null) {
                        bufferedInputStream.close();
                        return d10;
                    }
                } else {
                    k(bufferedInputStream, i10.f50720b);
                }
                long j12 = length + i10.f50720b;
                int read = bufferedInputStream.read();
                if (read == -1) {
                    break;
                }
                j10 = j12 + 1;
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

    public d f(long j10) {
        b();
        for (c cVar : this.f50715b) {
            long abs = Math.abs(j10 - cVar.b());
            if (abs <= 5000) {
                this.f50714a.getLogger().c(EnumC4788n3.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(abs));
                this.f50715b.remove(cVar);
                return h(cVar.a());
            }
        }
        return null;
    }

    public final boolean g(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    public final d h(File file) {
        BufferedInputStream bufferedInputStream;
        C4866x2 a10;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                a10 = this.f50714a.getEnvelopeReader().a(bufferedInputStream);
            } finally {
            }
        } catch (Throwable th2) {
            this.f50714a.getLogger().a(EnumC4788n3.DEBUG, th2, "Error loading envelope file: %s", file.getAbsolutePath());
        }
        if (a10 == null) {
            bufferedInputStream.close();
            return null;
        }
        for (C4665a3 c4665a3 : a10.c()) {
            if (EnumC4783m3.Event.equals(c4665a3.O().e())) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c4665a3.M()), StandardCharsets.UTF_8));
                try {
                    C4733c3 c4733c3 = (C4733c3) this.f50714a.getSerializer().c(bufferedReader, C4733c3.class);
                    if (c4733c3 != null && "native".equals(c4733c3.I())) {
                        d dVar = new d(c4733c3, file, a10);
                        bufferedReader.close();
                        bufferedInputStream.close();
                        return dVar;
                    }
                    bufferedReader.close();
                } finally {
                }
            }
        }
        bufferedInputStream.close();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x001b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b i(String str) {
        InputStreamReader inputStreamReader;
        int i10;
        String str2;
        try {
            Charset charset = StandardCharsets.UTF_8;
            inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                io.sentry.C0 c02 = new io.sentry.C0(inputStreamReader);
                c02.m();
                i10 = -1;
                str2 = null;
                while (c02.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String f02 = c02.f0();
                    int hashCode = f02.hashCode();
                    if (hashCode != -1106363674) {
                        if (hashCode == 3575610 && f02.equals("type")) {
                            str2 = c02.a1();
                            if (str2 == null && i10 >= 0) {
                                break;
                            }
                        }
                        c02.C();
                        if (str2 == null) {
                        }
                    } else {
                        if (f02.equals("length")) {
                            i10 = c02.nextInt();
                            if (str2 == null) {
                            }
                        }
                        c02.C();
                        if (str2 == null) {
                        }
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f50714a.getLogger().a(EnumC4788n3.DEBUG, th2, "Error parsing item header", new Object[0]);
        }
        if (i10 < 0) {
            inputStreamReader.close();
            return null;
        }
        b bVar = new b(str2, i10);
        inputStreamReader.close();
        return bVar;
    }

    public final String j(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                if (sb2.length() > 0) {
                    return sb2.toString();
                }
                return null;
            }
            if (read == 10) {
                return sb2.toString();
            }
            sb2.append((char) read);
        }
    }

    public final int l(InputStream inputStream) {
        int read;
        int i10 = 0;
        do {
            read = inputStream.read();
            if (read == -1) {
                if (i10 > 0) {
                    return i10;
                }
                return -1;
            }
            i10++;
        } while (read != 10);
        return i10;
    }

    public static final class a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f50717a;

        /* renamed from: b, reason: collision with root package name */
        public long f50718b;

        public a(InputStream inputStream, int i10) {
            this.f50717a = inputStream;
            this.f50718b = i10;
        }

        @Override // java.io.InputStream
        public int available() {
            return Math.min(this.f50717a.available(), (int) this.f50718b);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            N0.k(this.f50717a, this.f50718b);
            this.f50718b = 0L;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f50718b <= 0) {
                return -1;
            }
            int read = this.f50717a.read();
            if (read != -1) {
                this.f50718b--;
            }
            return read;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long skip = this.f50717a.skip(Math.min(j10, this.f50718b));
            this.f50718b -= skip;
            return skip;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            long j10 = this.f50718b;
            if (j10 <= 0) {
                return -1;
            }
            int read = this.f50717a.read(bArr, i10, Math.min(i11, (int) j10));
            if (read > 0) {
                this.f50718b -= read;
            }
            return read;
        }
    }
}
