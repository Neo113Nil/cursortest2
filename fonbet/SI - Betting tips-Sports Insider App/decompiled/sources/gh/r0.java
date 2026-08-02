package gh;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class r0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f10297b;

    /* renamed from: a, reason: collision with root package name */
    public p0 f10298a;

    static {
        ByteString byteString = ByteString.EMPTY;
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Buffer write = new Buffer().write(byteString);
        long size = byteString.size();
        Intrinsics.checkNotNullParameter(write, "<this>");
        f10297b = new q0(null, size, write);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final byte[] c() {
        q0 q0Var = (q0) this;
        long j = q0Var.f10294d;
        if (j > 2147483647L) {
            throw new IOException(d9.e.g(j, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSource = q0Var.f10295e;
        byte[] th2 = null;
        try {
            byte[] readByteArray = bufferedSource.readByteArray();
            try {
                bufferedSource.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = readByteArray;
        } catch (Throwable th4) {
            th = th4;
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (Throwable th5) {
                    gf.d.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th2.length;
        if (j == -1 || j == length) {
            return th2;
        }
        throw new IOException("Content-Length (" + j + ") and stream length (" + length + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        hh.e.b(m0());
    }

    public abstract long k();

    public abstract BufferedSource m0();

    public abstract b0 n();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r2 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String r() {
        Charset charset;
        BufferedSource m02 = m0();
        String th2 = null;
        try {
            b0 n9 = n();
            if (n9 != null) {
                Regex regex = b0.f10117d;
                charset = n9.a(null);
            }
            charset = Charsets.UTF_8;
            String readString = m02.readString(hh.g.f(m02, charset));
            try {
                m02.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = readString;
        } catch (Throwable th4) {
            th = th4;
            if (m02 != null) {
                try {
                    m02.close();
                } catch (Throwable th5) {
                    gf.d.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }
}
