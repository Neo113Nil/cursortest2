package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o92 {
    public static final byte[] d = "null".getBytes(StandardCharsets.ISO_8859_1);
    public final Charset a;
    public final int b;
    public ByteBuffer c;

    public o92(int i, Charset charset) {
        this.a = charset;
        int i2 = (charset == StandardCharsets.US_ASCII || charset == StandardCharsets.ISO_8859_1) ? 32 : 64;
        if (i <= i2) {
            this.b = i2;
        } else {
            this.b = d(i, 32);
        }
    }

    public static int d(int i, int i2) {
        return i < i2 ? i2 : ((i + i2) / i2) * i2;
    }

    public final void a() {
        e(1);
        this.c.put((byte) 32);
    }

    public final void b(String str) {
        if (str != null) {
            c(str.getBytes(this.a));
        } else {
            e(4);
            this.c.put(d, 0, 4);
        }
    }

    public final void c(byte[] bArr) {
        if (bArr.length > 0) {
            e(bArr.length);
            this.c.put(bArr, 0, bArr.length);
        }
    }

    public final void e(int i) {
        if (this.c.capacity() - this.c.position() < i) {
            ByteBuffer allocate = ByteBuffer.allocate(d(this.c.position() + i, this.b));
            allocate.put(this.c.array(), 0, this.c.position());
            this.c = allocate;
        }
    }

    public final String toString() {
        return new String(this.c.array(), 0, this.c.position(), this.a);
    }

    public o92(int i, int i2, Charset charset) {
        this(i2, charset);
        this.c = ByteBuffer.allocate(d(i, this.b));
    }
}
