package defpackage;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class f7 implements Closeable {
    public abstract int C();

    public abstract int H();

    public abstract void M(int i);

    public final void e(int i) {
        if (H() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean k() {
        return this instanceof bof;
    }

    public abstract f7 m(int i);

    public abstract void n(OutputStream outputStream, int i);

    public abstract void p(ByteBuffer byteBuffer);

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public abstract void t(byte[] bArr, int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void h() {
    }
}
