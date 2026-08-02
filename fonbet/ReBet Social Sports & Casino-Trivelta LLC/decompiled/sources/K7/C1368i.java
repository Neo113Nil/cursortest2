package K7;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: K7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1368i {

    /* renamed from: a, reason: collision with root package name */
    public static final C1368i f6322a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6323b;

    /* renamed from: c, reason: collision with root package name */
    public static int f6324c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1367h f6325d;

    static {
        C1368i c1368i = new C1368i();
        f6322a = c1368i;
        f6323b = c1368i.b();
        f6324c = 384;
    }

    public static final C1367h a() {
        if (f6325d == null) {
            synchronized (C1368i.class) {
                try {
                    if (f6325d == null) {
                        f6325d = new C1367h(f6324c, f6323b);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C1367h c1367h = f6325d;
        Intrinsics.checkNotNull(c1367h);
        return c1367h;
    }

    public final int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) min) > CxxInspectorPackagerConnection.MAX_QUEUE_SIZE ? (min / 4) * 3 : min / 2;
    }
}
