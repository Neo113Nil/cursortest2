package xh;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f68165a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f68166b;

    static {
        int arrayIndexScale = AbstractC6827b.f68164c.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f68166b = 2;
        } else {
            if (8 != arrayIndexScale) {
                throw new IllegalStateException("Unknown pointer size: " + arrayIndexScale);
            }
            f68166b = 3;
        }
        f68165a = r0.arrayBaseOffset(Object[].class);
    }

    public static Object[] a(int i10) {
        return new Object[i10];
    }

    public static long b(long j10, long j11) {
        return f68165a + ((j10 & j11) << f68166b);
    }

    public static Object c(Object[] objArr, long j10) {
        return AbstractC6827b.f68164c.getObjectVolatile(objArr, j10);
    }

    public static void d(Object[] objArr, long j10, Object obj) {
        AbstractC6827b.f68164c.putOrderedObject(objArr, j10, obj);
    }

    public static void e(Object[] objArr, long j10, Object obj) {
        AbstractC6827b.f68164c.putObject(objArr, j10, obj);
    }
}
