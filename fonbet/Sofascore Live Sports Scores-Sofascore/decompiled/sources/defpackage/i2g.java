package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class i2g implements Closeable {

    @NotNull
    public static final h2g Companion = new h2g();

    @NotNull
    public static final i2g EMPTY = h2g.a(gc2.d, null);

    @Nullable
    private Reader reader;

    @wx4
    @NotNull
    public static final i2g create(@Nullable zdc zdcVar, long j, @NotNull l62 l62Var) {
        Companion.getClass();
        l62Var.getClass();
        return new g2g(zdcVar, j, l62Var);
    }

    @NotNull
    public final InputStream byteStream() {
        return source().W0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @NotNull
    public final gc2 byteString() throws IOException {
        long contentLength = contentLength();
        gc2 th = null;
        if (contentLength > 2147483647L) {
            is8.e(vxd.l(contentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        l62 source = source();
        try {
            gc2 G0 = source.G0();
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            gc2 gc2Var = th;
            th = G0;
            th = gc2Var;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    de6.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int h = th.h();
        if (contentLength == -1 || contentLength == h) {
            return th;
        }
        throw new IOException("Content-Length (" + contentLength + ") and stream length (" + h + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @NotNull
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        byte[] th = null;
        if (contentLength > 2147483647L) {
            is8.e(vxd.l(contentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        l62 source = source();
        try {
            byte[] q0 = source.q0();
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = q0;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    de6.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (contentLength == -1 || contentLength == length) {
            return th;
        }
        throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
    }

    @NotNull
    public final Reader charStream() {
        Charset charset;
        Reader reader = this.reader;
        if (reader == null) {
            l62 source = source();
            zdc contentType = contentType();
            if (contentType == null || (charset = zdc.a(contentType)) == null) {
                charset = Charsets.UTF_8;
            }
            reader = new f2g(source, charset);
            this.reader = reader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        wol.b(source());
    }

    public abstract long contentLength();

    public abstract zdc contentType();

    public abstract l62 source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @NotNull
    public final String string() throws IOException {
        Charset charset;
        l62 source = source();
        String th = null;
        try {
            zdc contentType = contentType();
            if (contentType == null || (charset = zdc.a(contentType)) == null) {
                charset = Charsets.UTF_8;
            }
            String C0 = source.C0(yol.f(source, charset));
            try {
                source.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = C0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th4) {
                    de6.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    @NotNull
    public static final i2g create(@NotNull gc2 gc2Var, @Nullable zdc zdcVar) {
        Companion.getClass();
        return h2g.a(gc2Var, zdcVar);
    }

    @wx4
    @NotNull
    public static final i2g create(@Nullable zdc zdcVar, @NotNull gc2 gc2Var) {
        Companion.getClass();
        gc2Var.getClass();
        return h2g.a(gc2Var, zdcVar);
    }

    @wx4
    @NotNull
    public static final i2g create(@Nullable zdc zdcVar, @NotNull String str) {
        Companion.getClass();
        str.getClass();
        return h2g.b(str, zdcVar);
    }

    @wx4
    @NotNull
    public static final i2g create(@Nullable zdc zdcVar, @NotNull byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return h2g.c(bArr, zdcVar);
    }

    @NotNull
    public static final i2g create(@NotNull String str, @Nullable zdc zdcVar) {
        Companion.getClass();
        return h2g.b(str, zdcVar);
    }

    @NotNull
    public static final i2g create(@NotNull byte[] bArr, @Nullable zdc zdcVar) {
        Companion.getClass();
        return h2g.c(bArr, zdcVar);
    }

    @NotNull
    public static final i2g create(@NotNull l62 l62Var, @Nullable zdc zdcVar, long j) {
        Companion.getClass();
        l62Var.getClass();
        return new g2g(zdcVar, j, l62Var);
    }
}
