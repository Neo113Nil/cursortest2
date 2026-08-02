package com.logrocket.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u1 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(Unsafe unsafe, int i5) {
        super(unsafe);
        this.f6803b = i5;
    }

    @Override // com.logrocket.protobuf.w1
    public final void c(byte[] bArr, long j, long j6, long j10) {
        switch (this.f6803b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.logrocket.protobuf.w1
    public final boolean d(long j, Object obj) {
        switch (this.f6803b) {
            case 0:
                if (x1.f6826h) {
                    if (x1.h(j, obj) == 0) {
                    }
                } else if (x1.i(j, obj) == 0) {
                }
                break;
            default:
                if (x1.f6826h) {
                    if (x1.h(j, obj) == 0) {
                    }
                } else if (x1.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.logrocket.protobuf.w1
    public final byte e(long j, Object obj) {
        switch (this.f6803b) {
            case 0:
                if (!x1.f6826h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!x1.f6826h) {
                    break;
                } else {
                    break;
                }
        }
        return x1.i(j, obj);
    }

    @Override // com.logrocket.protobuf.w1
    public final double f(long j, Object obj) {
        switch (this.f6803b) {
        }
        return Double.longBitsToDouble(i(j, obj));
    }

    @Override // com.logrocket.protobuf.w1
    public final float g(long j, Object obj) {
        switch (this.f6803b) {
        }
        return Float.intBitsToFloat(h(j, obj));
    }

    @Override // com.logrocket.protobuf.w1
    public final void l(Object obj, long j, boolean z5) {
        switch (this.f6803b) {
            case 0:
                if (!x1.f6826h) {
                    x1.n(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    x1.m(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!x1.f6826h) {
                    x1.n(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    x1.m(obj, j, z5 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.logrocket.protobuf.w1
    public final void m(byte b10, long j) {
        switch (this.f6803b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.logrocket.protobuf.w1
    public final void n(Object obj, long j, byte b10) {
        switch (this.f6803b) {
            case 0:
                if (!x1.f6826h) {
                    x1.n(obj, j, b10);
                    break;
                } else {
                    x1.m(obj, j, b10);
                    break;
                }
            default:
                if (!x1.f6826h) {
                    x1.n(obj, j, b10);
                    break;
                } else {
                    x1.m(obj, j, b10);
                    break;
                }
        }
    }

    @Override // com.logrocket.protobuf.w1
    public final void o(Object obj, long j, double d10) {
        switch (this.f6803b) {
            case 0:
                r(obj, j, Double.doubleToLongBits(d10));
                break;
            default:
                r(obj, j, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.logrocket.protobuf.w1
    public final void p(Object obj, long j, float f6) {
        switch (this.f6803b) {
            case 0:
                q(Float.floatToIntBits(f6), j, obj);
                break;
            default:
                q(Float.floatToIntBits(f6), j, obj);
                break;
        }
    }

    @Override // com.logrocket.protobuf.w1
    public final boolean u() {
        switch (this.f6803b) {
        }
        return false;
    }
}
