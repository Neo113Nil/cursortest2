package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class imo extends sck {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ imo(Unsafe unsafe, int i) {
        super(unsafe, 8);
        this.c = i;
    }

    @Override // defpackage.sck
    public final void B(Object obj, long j, float f) {
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
    public final boolean F(Object obj, long j) {
        switch (this.c) {
            case 0:
                if (!omo.f) {
                    break;
                } else {
                    break;
                }
            default:
                if (!omo.f) {
                    break;
                } else {
                    break;
                }
        }
        return omo.i(obj, j);
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
                if (!omo.f) {
                    omo.e(obj, j, z);
                    break;
                } else {
                    omo.d(obj, j, z);
                    break;
                }
            default:
                if (!omo.f) {
                    omo.e(obj, j, z);
                    break;
                } else {
                    omo.d(obj, j, z);
                    break;
                }
        }
    }

    @Override // defpackage.sck
    public final void x(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }
}
