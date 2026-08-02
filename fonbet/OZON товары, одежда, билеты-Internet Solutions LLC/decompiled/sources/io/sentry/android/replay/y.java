package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"PrivateApi"})
/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f67753a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f67754b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f67755c = 0;

    static final class a extends AbstractC7737t implements Function0<Class<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f67756b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Class<?> invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable th2) {
                Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th2);
                return null;
            }
        }
    }

    static final class b extends AbstractC7737t implements Function0<Field> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f67757b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() {
            Class a11 = y.a();
            if (a11 == null) {
                return null;
            }
            try {
                Field declaredField = a11.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e11) {
                Log.d("WindowSpy", "Unexpected exception retrieving " + a11 + "#mWindow on API " + Build.VERSION.SDK_INT, e11);
                return null;
            }
        }
    }

    static {
        Sc.n nVar = Sc.n.NONE;
        f67753a = Sc.k.a(nVar, a.f67756b);
        f67754b = Sc.k.a(nVar, b.f67757b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final Class a() {
        return (Class) f67753a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Sc.j, java.lang.Object] */
    public static Window b(@NotNull View maybeDecorView) {
        Field field;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class cls = (Class) f67753a.getValue();
        if (cls == null || !cls.isInstance(maybeDecorView) || (field = (Field) f67754b.getValue()) == null) {
            return null;
        }
        Object obj = field.get(maybeDecorView);
        Intrinsics.g(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
