package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z5p extends sck {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5p(Unsafe unsafe, int i) {
        super(unsafe, 11);
        this.c = i;
    }

    @Override // defpackage.sck
    public final void A(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.sck
    public final void E(Object obj, long j, float f) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.sck
    public final boolean H(Object obj, long j) {
        switch (this.c) {
            case 0:
                if (!d6p.g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!d6p.g) {
                    break;
                } else {
                    break;
                }
        }
        return d6p.l(obj, j);
    }

    @Override // defpackage.sck
    public final double n(Object obj, long j) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // defpackage.sck
    public final float q(Object obj, long j) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // defpackage.sck
    public final void u(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!d6p.g) {
                    d6p.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d6p.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!d6p.g) {
                    d6p.d(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d6p.c(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.sck
    public final void w(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (!d6p.g) {
                    d6p.d(obj, j, b);
                    break;
                } else {
                    d6p.c(obj, j, b);
                    break;
                }
            default:
                if (!d6p.g) {
                    d6p.d(obj, j, b);
                    break;
                } else {
                    d6p.c(obj, j, b);
                    break;
                }
        }
    }
}
