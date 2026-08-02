package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qck extends sck {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qck(Unsafe unsafe, int i) {
        super(unsafe, 1);
        this.c = i;
    }

    @Override // defpackage.sck
    public final void a(long j, byte[] bArr, long j2, long j3) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.sck
    public final void b(byte[] bArr, long j, long j2, long j3) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.sck
    public final boolean c(Object obj, long j) {
        switch (this.c) {
            case 0:
                if (uck.h) {
                    if (uck.f(obj, j) == 0) {
                    }
                } else if (uck.g(obj, j) == 0) {
                }
                break;
            default:
                if (uck.h) {
                    if (uck.f(obj, j) == 0) {
                    }
                } else if (uck.g(obj, j) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.sck
    public final byte d(long j) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.sck
    public final double e(Object obj, long j) {
        switch (this.c) {
        }
        return Double.longBitsToDouble(this.b.getLong(obj, j));
    }

    @Override // defpackage.sck
    public final float f(Object obj, long j) {
        switch (this.c) {
        }
        return Float.intBitsToFloat(this.b.getInt(obj, j));
    }

    @Override // defpackage.sck
    public final void g(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!uck.h) {
                    uck.o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    uck.n(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!uck.h) {
                    uck.o(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    uck.n(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.sck
    public final void h(byte b, long j) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.sck
    public final void i(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (!uck.h) {
                    uck.o(obj, j, b);
                    break;
                } else {
                    uck.n(obj, j, b);
                    break;
                }
            default:
                if (!uck.h) {
                    uck.o(obj, j, b);
                    break;
                } else {
                    uck.n(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.sck
    public final void j(Object obj, long j, double d) {
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
    public final void k(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.sck
    public final boolean m() {
        switch (this.c) {
        }
        return false;
    }
}
