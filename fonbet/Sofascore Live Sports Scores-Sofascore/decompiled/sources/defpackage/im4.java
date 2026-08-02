package defpackage;

import androidx.media3.common.b;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class im4 extends ffb {
    public b g;
    public final d74 h;
    public ByteBuffer i;
    public boolean j;
    public long k;
    public ByteBuffer l;
    public final int m;

    static {
        i6c.a("media3.decoder");
    }

    public im4(int i) {
        super(3);
        this.h = new d74(1);
        this.m = i;
    }

    public void A() {
        this.b = 0;
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.l;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.j = false;
    }

    public final ByteBuffer B(int i) {
        int i2 = this.m;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.i;
        throw new gm4(lnb.j(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    public final void C(int i) {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null) {
            this.i = B(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.i = byteBuffer;
            return;
        }
        ByteBuffer B = B(i2);
        B.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            B.put(byteBuffer);
        }
        this.i = B;
    }

    public final void D() {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.l;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
