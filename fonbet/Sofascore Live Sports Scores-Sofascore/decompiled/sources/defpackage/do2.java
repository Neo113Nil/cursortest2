package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class do2 extends v01 {
    public int[] i;
    public int[] j;

    @Override // defpackage.v01
    public final ho0 d(ho0 ho0Var) {
        int i = ho0Var.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return ho0.e;
        }
        int i2 = ho0Var.b;
        if (!nik.P(i)) {
            throw new ko0(ho0Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new ko0("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", ho0Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new ho0(ho0Var.a, iArr.length, i) : ho0.e;
    }

    @Override // defpackage.v01
    public final void e() {
        this.j = this.i;
    }

    @Override // defpackage.v01
    public final void g() {
        this.j = null;
        this.i = null;
    }

    @Override // defpackage.mo0
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer h = h(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                int v = (nik.v(this.b.c) * i) + position;
                int i2 = this.b.c;
                if (i2 != 2) {
                    if (i2 == 3) {
                        h.put(byteBuffer.get(v));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            if (i2 != 1879048192) {
                                                zzl.q(this.b.c, "Unexpected encoding: ");
                                                return;
                                            }
                                            h.putDouble(byteBuffer.getDouble(v));
                                        }
                                    }
                                }
                            }
                            h.putInt(byteBuffer.getInt(v));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b = byteBuffer.get(order == byteOrder ? v : v + 2);
                        byte b2 = byteBuffer.get(v + 1);
                        if (byteBuffer.order() == byteOrder) {
                            v += 2;
                        }
                        int i3 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(v) << 8) & 65280)) >> 8;
                        z1a.q(Integer.toHexString(i3), "Value out of range of 24-bit integer: %s", (i3 & (-16777216)) == 0 || (i3 & (-8388608)) == -8388608);
                        z1a.s(h.remaining() >= 3);
                        h.put((byte) (h.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((i3 & 65280) >> 8)).put((byte) (h.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
                    } else {
                        h.putFloat(byteBuffer.getFloat(v));
                    }
                }
                h.putShort(byteBuffer.getShort(v));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        h.flip();
    }
}
