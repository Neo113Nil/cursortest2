package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import defpackage.a70;
import defpackage.is8;
import defpackage.vxd;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l {
    static final Logger a = Logger.getLogger(l.class.getName());

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a implements r {
        final /* synthetic */ t a;
        final /* synthetic */ OutputStream b;

        public a(t tVar, OutputStream outputStream) {
            this.a = tVar;
            this.b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            u.a(cVar.b, 0L, j);
            while (j > 0) {
                this.a.e();
                o oVar = cVar.a;
                int min = (int) Math.min(j, oVar.c - oVar.b);
                this.b.write(oVar.a, oVar.b, min);
                int i = oVar.b + min;
                oVar.b = i;
                long j2 = min;
                j -= j2;
                cVar.b -= j2;
                if (i == oVar.c) {
                    cVar.a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.b.flush();
        }

        public String toString() {
            return "sink(" + this.b + ")";
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class c extends com.mbridge.msdk.thrid.okio.a {
        final /* synthetic */ Socket k;

        public c(Socket socket) {
            this.k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            try {
                this.k.close();
            } catch (AssertionError e) {
                if (!l.a(e)) {
                    throw e;
                }
                l.a.log(Level.WARNING, "Failed to close timed out socket " + this.k, (Throwable) e);
            } catch (Exception e2) {
                l.a.log(Level.WARNING, "Failed to close timed out socket " + this.k, (Throwable) e2);
            }
        }
    }

    private l() {
    }

    public static r a(Socket socket) throws IOException {
        if (socket == null) {
            a70.p("socket == null");
            return null;
        }
        if (socket.getOutputStream() != null) {
            com.mbridge.msdk.thrid.okio.a c2 = c(socket);
            return c2.a(a(socket.getOutputStream(), c2));
        }
        is8.e("socket's output stream == null");
        return null;
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            a70.p("socket == null");
            return null;
        }
        if (socket.getInputStream() != null) {
            com.mbridge.msdk.thrid.okio.a c2 = c(socket);
            return c2.a(a(socket.getInputStream(), c2));
        }
        is8.e("socket's input stream == null");
        return null;
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            a70.p("out == null");
            return null;
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        a70.p("timeout == null");
        return null;
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            a70.p("in == null");
            return null;
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        a70.p("timeout == null");
        return null;
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b implements s {
        final /* synthetic */ t a;
        final /* synthetic */ InputStream b;

        public b(t tVar, InputStream inputStream) {
            this.a = tVar;
            this.b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j) throws IOException {
            if (j < 0) {
                a70.p(vxd.l(j, "byteCount < 0: "));
                return 0L;
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.a.e();
                o b = cVar.b(1);
                int read = this.b.read(b.a, b.c, (int) Math.min(j, 8192 - b.c));
                if (read == -1) {
                    return -1L;
                }
                b.c += read;
                long j2 = read;
                cVar.b += j2;
                return j2;
            } catch (AssertionError e) {
                if (l.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        public String toString() {
            return "source(" + this.b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.a;
        }
    }
}
