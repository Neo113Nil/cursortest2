package io.sentry.android.replay;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f51876a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f51877b;

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f51878c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f51879d;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f51880d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("com.android.internal.policy.DecorView");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f51881d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class b10 = y.f51876a.b();
            if (b10 == null) {
                return null;
            }
            try {
                Field declaredField = b10.getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                b10.toString();
                return null;
            }
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        f51877b = LazyKt.lazy(lazyThreadSafetyMode, (Function0) a.f51880d);
        f51878c = LazyKt.lazy(lazyThreadSafetyMode, (Function0) b.f51881d);
        f51879d = 8;
    }

    public final Class b() {
        return (Class) f51877b.getValue();
    }

    public final Field c() {
        return (Field) f51878c.getValue();
    }

    public final Window d(View maybeDecorView) {
        Field c10;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class b10 = b();
        if (b10 == null || !b10.isInstance(maybeDecorView) || (c10 = f51876a.c()) == null) {
            return null;
        }
        Object obj = c10.get(maybeDecorView);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
