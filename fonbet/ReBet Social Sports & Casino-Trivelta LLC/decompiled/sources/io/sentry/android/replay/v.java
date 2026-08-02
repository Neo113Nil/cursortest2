package io.sentry.android.replay;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f51790a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f51791b;

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f51792c;

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f51793d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f51794e;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f51795d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class c10 = v.f51790a.c();
            if (c10 == null) {
                return null;
            }
            Field declaredField = c10.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f51796d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Class invoke() {
            try {
                return Class.forName("android.view.WindowManagerGlobal");
            } catch (Throwable th2) {
                Log.w("WindowManagerSpy", th2);
                return null;
            }
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f51797d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Method method;
            Class c10 = v.f51790a.c();
            if (c10 == null || (method = c10.getMethod("getInstance", null)) == null) {
                return null;
            }
            return method.invoke(null, null);
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        f51791b = LazyKt.lazy(lazyThreadSafetyMode, (Function0) b.f51796d);
        f51792c = LazyKt.lazy(lazyThreadSafetyMode, (Function0) c.f51797d);
        f51793d = LazyKt.lazy(lazyThreadSafetyMode, (Function0) a.f51795d);
        f51794e = 8;
    }

    public final Field b() {
        return (Field) f51793d.getValue();
    }

    public final Class c() {
        return (Class) f51791b.getValue();
    }

    public final Object d() {
        return f51792c.getValue();
    }

    public final void e(Function1 swap) {
        Field b10;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object d10 = d();
            if (d10 == null || (b10 = f51790a.b()) == null) {
                return;
            }
            Object obj = b10.get(d10);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            b10.set(d10, swap.invoke((ArrayList) obj));
        } catch (Throwable th2) {
            Log.w("WindowManagerSpy", th2);
        }
    }
}
