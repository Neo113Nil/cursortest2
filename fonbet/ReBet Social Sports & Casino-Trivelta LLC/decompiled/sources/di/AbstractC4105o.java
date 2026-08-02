package di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4105o {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f45399a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f45399a = z10;
    }

    public static final V0 a(Function1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f45399a ? new C4114t(factory) : new C4124y(factory);
    }

    public static final C0 b(Function2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f45399a ? new C4116u(factory) : new C4126z(factory);
    }
}
