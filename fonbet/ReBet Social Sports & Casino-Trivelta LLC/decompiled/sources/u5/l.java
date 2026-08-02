package u5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f66170a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f66171b = LazyKt.lazy(new Function0() { // from class: u5.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Class i10;
            i10 = l.i();
            return i10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f66172c = LazyKt.lazy(new Function0() { // from class: u5.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object j10;
            j10 = l.j();
            return j10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f66173d = LazyKt.lazy(new Function0() { // from class: u5.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Field g10;
            g10 = l.g();
            return g10;
        }
    });

    public static final Field g() {
        Class e10 = f66170a.e();
        if (e10 == null) {
            return null;
        }
        Field declaredField = e10.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }

    public static final Class i() {
        try {
            return Class.forName("android.view.WindowManagerGlobal");
        } catch (Throwable th2) {
            E5.b.f3006a.c("unable to find android.view.WindowManagerGlobal", th2);
            return null;
        }
    }

    public static final Object j() {
        Method method;
        Class e10 = f66170a.e();
        if (e10 == null || (method = e10.getMethod("getInstance", null)) == null) {
            return null;
        }
        return method.invoke(null, null);
    }

    public final Field d() {
        return (Field) f66173d.getValue();
    }

    public final Class e() {
        return (Class) f66171b.getValue();
    }

    public final Object f() {
        return f66172c.getValue();
    }

    public final void h(Function1 swap) {
        Field d10;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object f10 = f();
            if (f10 == null || (d10 = f66170a.d()) == null) {
                return;
            }
            Object obj = d10.get(f10);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
            d10.set(f10, swap.invoke((ArrayList) obj));
        } catch (Throwable th2) {
            E5.b.f3006a.c("unable to swap mViews", th2);
        }
    }
}
