package s9;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 extends v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23377b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(Unsafe unsafe, int i5) {
        super(unsafe);
        this.f23377b = i5;
    }

    @Override // s9.v0
    public final boolean c(long j, Object obj) {
        switch (this.f23377b) {
            case 0:
                if (!w0.f23385f) {
                    break;
                } else {
                    break;
                }
            default:
                if (!w0.f23385f) {
                    break;
                } else {
                    break;
                }
        }
        return w0.c(j, obj);
    }

    @Override // s9.v0
    public final double d(long j, Object obj) {
        switch (this.f23377b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // s9.v0
    public final float e(long j, Object obj) {
        switch (this.f23377b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // s9.v0
    public final void j(Object obj, long j, boolean z5) {
        switch (this.f23377b) {
            case 0:
                if (!w0.f23385f) {
                    w0.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    w0.j(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!w0.f23385f) {
                    w0.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    w0.j(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // s9.v0
    public final void k(Object obj, long j, double d10) {
        switch (this.f23377b) {
            case 0:
                n(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                n(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // s9.v0
    public final void l(Object obj, long j, float f6) {
        switch (this.f23377b) {
            case 0:
                m(Float.floatToIntBits(f6), j, obj);
                break;
            default:
                m(Float.floatToIntBits(f6), j, obj);
                break;
        }
    }

    @Override // s9.v0
    public final boolean q() {
        switch (this.f23377b) {
        }
        return false;
    }
}
