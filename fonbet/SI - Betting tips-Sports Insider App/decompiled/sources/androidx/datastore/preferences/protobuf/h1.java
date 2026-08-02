package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 extends j1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1617b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Unsafe unsafe, int i5) {
        super(unsafe);
        this.f1617b = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean c(long j, Object obj) {
        switch (this.f1617b) {
            case 0:
                if (!k1.f1648g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!k1.f1648g) {
                    break;
                } else {
                    break;
                }
        }
        return k1.c(j, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final double d(long j, Object obj) {
        switch (this.f1617b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final float e(long j, Object obj) {
        switch (this.f1617b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void j(Object obj, long j, boolean z5) {
        switch (this.f1617b) {
            case 0:
                if (!k1.f1648g) {
                    k1.l(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!k1.f1648g) {
                    k1.l(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    k1.k(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void k(Object obj, long j, byte b10) {
        switch (this.f1617b) {
            case 0:
                if (!k1.f1648g) {
                    k1.l(obj, j, b10);
                    break;
                } else {
                    k1.k(obj, j, b10);
                    break;
                }
            default:
                if (!k1.f1648g) {
                    k1.l(obj, j, b10);
                    break;
                } else {
                    k1.k(obj, j, b10);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void l(Object obj, long j, double d10) {
        switch (this.f1617b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final void m(Object obj, long j, float f6) {
        switch (this.f1617b) {
            case 0:
                n(Float.floatToIntBits(f6), j, obj);
                break;
            default:
                n(Float.floatToIntBits(f6), j, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j1
    public final boolean r() {
        switch (this.f1617b) {
        }
        return false;
    }
}
