package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.util.Log;
import io.sentry.android.replay.r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f67724a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f67725b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f67726c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f67727d = 0;

    static final class a extends AbstractC7737t implements Function0<Field> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f67728b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() {
            Class a11 = w.a();
            if (a11 == null) {
                return null;
            }
            Field declaredField = a11.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Class<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f67729b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Class<?> invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th2) {
                Log.w("WindowManagerSpy", th2);
                return null;
            }
        }
    }

    static final class c extends AbstractC7737t implements Function0<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f67730b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class a11 = w.a();
            if (a11 == null || (method = a11.getMethod("getInstance", new Class[0])) == null) {
                return null;
            }
            return method.invoke(null, new Object[0]);
        }
    }

    static {
        Sc.n nVar = Sc.n.NONE;
        f67724a = Sc.k.a(nVar, b.f67729b);
        f67725b = Sc.k.a(nVar, c.f67730b);
        f67726c = Sc.k.a(nVar, a.f67728b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final Class a() {
        return (Class) f67724a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    @SuppressLint({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public static void b(@NotNull Function1 swap) {
        Field field;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object value = f67725b.getValue();
            if (value == null || (field = (Field) f67726c.getValue()) == null) {
                return;
            }
            Object obj = field.get(value);
            Intrinsics.g(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            field.set(value, ((r.a.C1108a) swap).invoke((ArrayList) obj));
        } catch (Throwable th2) {
            Log.w("WindowManagerSpy", th2);
        }
    }
}
