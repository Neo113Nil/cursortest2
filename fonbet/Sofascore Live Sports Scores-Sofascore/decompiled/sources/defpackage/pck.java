package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pck extends sck {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pck(Unsafe unsafe, int i) {
        super(unsafe, 0);
        this.c = i;
    }

    @Override // defpackage.sck
    public final boolean c(Object obj, long j) {
        switch (this.c) {
            case 0:
                return tck.g ? tck.e(obj, j) : ((byte) ((tck.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                return tck.g ? tck.e(obj, j) : ((byte) ((tck.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return this.b.getBoolean(obj, j);
        }
    }

    @Override // defpackage.sck
    public final double e(Object obj, long j) {
        switch (this.c) {
            case 0:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.b.getLong(obj, j));
            default:
                return this.b.getDouble(obj, j);
        }
    }

    @Override // defpackage.sck
    public final float f(Object obj, long j) {
        switch (this.c) {
            case 0:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.b.getInt(obj, j));
            default:
                return this.b.getFloat(obj, j);
        }
    }

    @Override // defpackage.sck
    public final void g(Object obj, long j, boolean z) {
        switch (this.c) {
            case 0:
                if (!tck.g) {
                    tck.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    tck.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            case 1:
                if (!tck.g) {
                    tck.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    tck.k(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                this.b.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // defpackage.sck
    public final void i(Object obj, long j, byte b) {
        switch (this.c) {
            case 0:
                if (!tck.g) {
                    tck.l(obj, j, b);
                    break;
                } else {
                    tck.k(obj, j, b);
                    break;
                }
            case 1:
                if (!tck.g) {
                    tck.l(obj, j, b);
                    break;
                } else {
                    tck.k(obj, j, b);
                    break;
                }
            default:
                this.b.putByte(obj, j, b);
                break;
        }
    }

    @Override // defpackage.sck
    public final void j(Object obj, long j, double d) {
        switch (this.c) {
            case 0:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.b.putDouble(obj, j, d);
                break;
        }
    }

    @Override // defpackage.sck
    public final void k(Object obj, long j, float f) {
        switch (this.c) {
            case 0:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.b.putFloat(obj, j, f);
                break;
        }
    }

    @Override // defpackage.sck
    public boolean l() {
        switch (this.c) {
            case 2:
                if (!super.l()) {
                    return false;
                }
                try {
                    Class<?> cls = this.b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    tck.i(th);
                    return false;
                }
            default:
                return super.l();
        }
    }

    @Override // defpackage.sck
    public final boolean m() {
        switch (this.c) {
            case 0:
            case 1:
                break;
            default:
                Unsafe unsafe = this.b;
                if (unsafe != null) {
                    try {
                        Class<?> cls = unsafe.getClass();
                        cls.getMethod("objectFieldOffset", Field.class);
                        Class cls2 = Long.TYPE;
                        cls.getMethod("getLong", Object.class, cls2);
                        if (tck.c() != null) {
                            try {
                                Class<?> cls3 = unsafe.getClass();
                                cls3.getMethod("getByte", cls2);
                                cls3.getMethod("putByte", cls2, Byte.TYPE);
                                cls3.getMethod("getInt", cls2);
                                cls3.getMethod("putInt", cls2, Integer.TYPE);
                                cls3.getMethod("getLong", cls2);
                                cls3.getMethod("putLong", cls2, cls2);
                                cls3.getMethod("copyMemory", cls2, cls2, cls2);
                                cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                                break;
                            } catch (Throwable th) {
                                tck.i(th);
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        tck.i(th2);
                        return false;
                    }
                }
                break;
        }
        return false;
    }
}
