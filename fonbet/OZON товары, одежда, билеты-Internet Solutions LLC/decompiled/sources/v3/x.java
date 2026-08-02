package v3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import k3.e;

/* loaded from: classes.dex */
public final class x extends k3.g {

    /* renamed from: i, reason: collision with root package name */
    private int[] f101992i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f101993j;

    @Override // k3.e
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f101993j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k11 = k(((limit - position) / this.f70388b.f70387d) * this.f70389c.f70387d);
        while (position < limit) {
            for (int i11 : iArr) {
                int u11 = (m3.N.u(this.f70388b.f70386c) * i11) + position;
                int i12 = this.f70388b.f70386c;
                if (i12 != 2) {
                    if (i12 == 3) {
                        k11.put(byteBuffer.get(u11));
                    } else if (i12 != 4) {
                        if (i12 != 21) {
                            if (i12 != 22) {
                                if (i12 != 268435456) {
                                    if (i12 != 1342177280) {
                                        if (i12 != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + this.f70388b.f70386c);
                                        }
                                    }
                                }
                            }
                            k11.putInt(byteBuffer.getInt(u11));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b11 = byteBuffer.get(order == byteOrder ? u11 : u11 + 2);
                        byte b12 = byteBuffer.get(u11 + 1);
                        if (byteBuffer.order() == byteOrder) {
                            u11 += 2;
                        }
                        int i13 = ((((b11 << 24) & (-16777216)) | ((b12 << 16) & 16711680)) | ((byteBuffer.get(u11) << 8) & 65280)) >> 8;
                        G10.a.b("Value out of range of 24-bit integer: " + Integer.toHexString(i13), (i13 & (-16777216)) == 0 || (i13 & (-8388608)) == -8388608);
                        G10.a.c(k11.remaining() >= 3);
                        k11.put((byte) (k11.order() == byteOrder ? (i13 & 16711680) >> 16 : i13 & 255)).put((byte) ((i13 & 65280) >> 8)).put((byte) (k11.order() == byteOrder ? i13 & 255 : (i13 & 16711680) >> 16));
                    } else {
                        k11.putFloat(byteBuffer.getFloat(u11));
                    }
                }
                k11.putShort(byteBuffer.getShort(u11));
            }
            position += this.f70388b.f70387d;
        }
        byteBuffer.position(limit);
        k11.flip();
    }

    @Override // k3.g
    public final e.a g(e.a aVar) throws e.b {
        int[] iArr = this.f101992i;
        if (iArr == null) {
            return e.a.f70383e;
        }
        int i11 = aVar.f70386c;
        if (!m3.N.M(i11)) {
            throw new e.b(aVar);
        }
        int length = iArr.length;
        int i12 = aVar.f70385b;
        boolean z11 = i12 != length;
        int i13 = 0;
        while (i13 < iArr.length) {
            int i14 = iArr[i13];
            if (i14 >= i12) {
                throw new e.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z11 |= i14 != i13;
            i13++;
        }
        if (z11) {
            return new e.a(aVar.f70384a, iArr.length, i11);
        }
        return e.a.f70383e;
    }

    @Override // k3.g
    protected final void h() {
        this.f101993j = this.f101992i;
    }

    @Override // k3.g
    protected final void j() {
        this.f101993j = null;
        this.f101992i = null;
    }

    public final void l(int[] iArr) {
        this.f101992i = iArr;
    }
}
