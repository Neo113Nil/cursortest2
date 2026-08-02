package u5;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f66174a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f66175b = LazyKt.lazy(new Function0() { // from class: u5.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Class c10;
            c10 = o.c();
            return c10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f66176c = LazyKt.lazy(new Function0() { // from class: u5.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Field g10;
            g10 = o.g();
            return g10;
        }
    });

    public static final Class c() {
        try {
            return Class.forName("com.android.internal.policy.DecorView");
        } catch (Throwable th2) {
            E5.b.f3006a.c("Unexpected exception loading com.android.internal.policy.DecorView", th2);
            return null;
        }
    }

    public static final Field g() {
        Class d10 = f66174a.d();
        if (d10 == null) {
            return null;
        }
        try {
            Field declaredField = d10.getDeclaredField("mWindow");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e10) {
            E5.b.f3006a.c("Unexpected exception retrieving " + d10 + "#mWindow", e10);
            return null;
        }
    }

    public final Class d() {
        return (Class) f66175b.getValue();
    }

    public final Field e() {
        return (Field) f66176c.getValue();
    }

    public final Window f(View maybeDecorView) {
        Field e10;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class d10 = d();
        if (d10 == null || !d10.isInstance(maybeDecorView) || (e10 = f66174a.e()) == null) {
            return null;
        }
        Object obj = e10.get(maybeDecorView);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
