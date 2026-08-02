package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class sck {
    public final /* synthetic */ int a;
    public final Unsafe b;

    public /* synthetic */ sck(Unsafe unsafe, int i) {
        this.a = i;
        this.b = unsafe;
    }

    public abstract void A(Object obj, long j, double d);

    public abstract void B(Object obj, long j, float f);

    public abstract double C(Object obj, long j);

    public abstract void D(Object obj, long j, double d);

    public abstract void E(Object obj, long j, float f);

    public abstract boolean F(Object obj, long j);

    public abstract void G(Object obj, long j, double d);

    public abstract boolean H(Object obj, long j);

    public abstract void a(long j, byte[] bArr, long j2, long j3);

    public abstract void b(byte[] bArr, long j, long j2, long j3);

    public abstract boolean c(Object obj, long j);

    public abstract byte d(long j);

    public abstract double e(Object obj, long j);

    public abstract float f(Object obj, long j);

    public abstract void g(Object obj, long j, boolean z);

    public abstract void h(byte b, long j);

    public abstract void i(Object obj, long j, byte b);

    public abstract void j(Object obj, long j, double d);

    public abstract void k(Object obj, long j, float f);

    public boolean l() {
        int i = this.a;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Unsafe unsafe = this.b;
        switch (i) {
            case 0:
                if (unsafe != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        cls3.getMethod("getInt", Object.class, cls2);
                        cls3.getMethod("putInt", Object.class, cls2, cls);
                        cls3.getMethod("getLong", Object.class, cls2);
                        cls3.getMethod("putLong", Object.class, cls2, cls2);
                        cls3.getMethod("getObject", Object.class, cls2);
                        cls3.getMethod("putObject", Object.class, cls2, Object.class);
                        break;
                    } catch (Throwable th) {
                        tck.i(th);
                    }
                }
                break;
            case 1:
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls2);
                        cls4.getMethod("putInt", Object.class, cls2, cls);
                        cls4.getMethod("getLong", Object.class, cls2);
                        cls4.getMethod("putLong", Object.class, cls2, cls2);
                        cls4.getMethod("getObject", Object.class, cls2);
                        cls4.getMethod("putObject", Object.class, cls2, Object.class);
                        break;
                    } catch (Throwable th2) {
                        uck.k(th2);
                    }
                }
                break;
            default:
                if (unsafe != null) {
                    try {
                        Class<?> cls5 = unsafe.getClass();
                        cls5.getMethod("objectFieldOffset", Field.class);
                        cls5.getMethod("arrayBaseOffset", Class.class);
                        cls5.getMethod("arrayIndexScale", Class.class);
                        cls5.getMethod("getInt", Object.class, cls2);
                        cls5.getMethod("putInt", Object.class, cls2, cls);
                        cls5.getMethod("getLong", Object.class, cls2);
                        cls5.getMethod("putLong", Object.class, cls2, cls2);
                        cls5.getMethod("getObject", Object.class, cls2);
                        cls5.getMethod("putObject", Object.class, cls2, Object.class);
                        break;
                    } catch (Throwable th3) {
                        vck.i(th3);
                    }
                }
                break;
        }
        return false;
    }

    public abstract boolean m();

    public abstract double n(Object obj, long j);

    public abstract void o(Object obj, long j, byte b);

    public abstract boolean p(Object obj, long j);

    public abstract float q(Object obj, long j);

    public abstract void r(Object obj, long j, boolean z);

    public abstract boolean s(Object obj, long j);

    public abstract float t(Object obj, long j);

    public abstract void u(Object obj, long j, boolean z);

    public abstract float v(Object obj, long j);

    public abstract void w(Object obj, long j, byte b);

    public abstract void x(Object obj, long j, double d);

    public abstract void y(Object obj, long j, float f);

    public abstract double z(Object obj, long j);
}
