package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qqo extends sck {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqo(Unsafe unsafe, int i) {
        super(unsafe, 9);
        this.c = i;
    }

    @Override // defpackage.sck
    public final void D(Object obj, long j, double d) {
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
    public final boolean p(Object obj, long j) {
        switch (this.c) {
            case 0:
                if (!rqo.e) {
                    break;
                } else {
                    break;
                }
            default:
                if (!rqo.e) {
                    break;
                } else {
                    break;
                }
        }
        return rqo.j(obj, j);
    }

    @Override // defpackage.sck
    public final void r(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!rqo.e) {
                    rqo.l(obj, j, z);
                    break;
                } else {
                    rqo.k(obj, j, z);
                    break;
                }
            default:
                if (!rqo.e) {
                    rqo.l(obj, j, z);
                    break;
                } else {
                    rqo.k(obj, j, z);
                    break;
                }
        }
    }

    @Override // defpackage.sck
    public final float t(Object obj, long j) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // defpackage.sck
    public final void y(Object obj, long j, float f) {
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
    public final double z(Object obj, long j) {
        int i = this.c;
        Unsafe unsafe = this.b;
        switch (i) {
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }
}
