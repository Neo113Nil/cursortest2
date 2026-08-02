package gk0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10745r0;
import xe.a1;

/* renamed from: gk0.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6745A {

    /* renamed from: a, reason: collision with root package name */
    private final Map<kotlin.reflect.d<? extends View>, x<? extends View>> f64496a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private r f64497b = new u();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C10745r0 f64498c = a1.a(1, "PreCreationViewPoolContext");

    public static final void a(C6745A c6745a, Context context, kotlin.reflect.d dVar) {
        c6745a.getClass();
        Resources resources = context.getTheme().getResources();
        C10727i.c(c6745a.f64497b.c(context), c6745a.f64498c, null, new z(c6745a, dVar, resources, context, null), 2);
    }

    public static final boolean c(C6745A c6745a, kotlin.reflect.d dVar, int i11, Resources resources) {
        ConcurrentLinkedDeque<View> concurrentLinkedDeque;
        ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>> concurrentHashMap = c6745a.f64497b.a().get(resources);
        return ((concurrentHashMap == null || (concurrentLinkedDeque = concurrentHashMap.get(dVar)) == null) ? 0 : concurrentLinkedDeque.size()) >= i11;
    }

    public static final void d(C6745A c6745a, Context context, Resources resources, kotlin.reflect.d dVar) {
        InterfaceC6746B<? extends View> c11;
        View provide;
        ConcurrentLinkedDeque<View> concurrentLinkedDeque;
        x<? extends View> xVar = c6745a.f64496a.get(dVar);
        if (xVar == null || (c11 = xVar.c()) == null || (provide = c11.provide(context)) == null) {
            throw new IllegalStateException("Wrong view type in RefillableViewPool");
        }
        if (!c6745a.f64497b.a().containsKey(resources)) {
            c6745a.f64497b.a().put(resources, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>> concurrentHashMap = c6745a.f64497b.a().get(resources);
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(dVar)) {
            ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>> concurrentHashMap2 = c6745a.f64497b.a().get(resources);
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.put(dVar, new ConcurrentLinkedDeque<>(C7714v.a0(provide)));
                return;
            }
            return;
        }
        ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>> concurrentHashMap3 = c6745a.f64497b.a().get(resources);
        if (concurrentHashMap3 == null || (concurrentLinkedDeque = concurrentHashMap3.get(dVar)) == null) {
            return;
        }
        concurrentLinkedDeque.addFirst(provide);
    }

    public final void e() {
        this.f64497b.b();
    }

    public final void f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f64497b.d(context);
    }

    public final void g(@NotNull Context context, Tc.j jVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        C10727i.c(this.f64497b.c(context), this.f64498c, null, new y(jVar, this, context, null), 2);
    }

    @NotNull
    public final <T extends View> T h(@NotNull kotlin.reflect.d<T> type, @NotNull Context context) {
        InterfaceC6746B<? extends View> c11;
        T t2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        T t11 = (T) i(type, context);
        if (t11 != null) {
            return t11;
        }
        x<? extends View> xVar = this.f64496a.get(type);
        if (xVar == null || (c11 = xVar.c()) == null || (t2 = (T) c11.provide(context)) == null) {
            throw new IllegalStateException("Wrong view type in RefillableViewPool");
        }
        return t2;
    }

    public final <T extends View> T i(@NotNull kotlin.reflect.d<T> type, Context context) {
        Resources.Theme theme;
        Resources resources;
        ConcurrentLinkedDeque<View> concurrentLinkedDeque;
        Intrinsics.checkNotNullParameter(type, "type");
        if (context != null && (theme = context.getTheme()) != null && (resources = theme.getResources()) != null) {
            ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>> concurrentHashMap = this.f64497b.a().get(resources);
            T t2 = (concurrentHashMap == null || (concurrentLinkedDeque = concurrentHashMap.get(type)) == null) ? null : (T) concurrentLinkedDeque.pollLast();
            if (t2 == null) {
                t2 = null;
            }
            g(context, null);
            if (t2 != null) {
                Intrinsics.checkNotNullParameter(t2, "<this>");
                Context context2 = t2.getContext();
                Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity == null || !activity.isFinishing()) {
                    return t2;
                }
                f(context);
                return null;
            }
        }
        return null;
    }

    public final void j(@NotNull List<? extends x<? extends View>> providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Map<kotlin.reflect.d<? extends View>, x<? extends View>> viewInfo = this.f64496a;
        Intrinsics.checkNotNullExpressionValue(viewInfo, "viewInfo");
        synchronized (viewInfo) {
            try {
                this.f64496a.clear();
                Map<kotlin.reflect.d<? extends View>, x<? extends View>> map = this.f64496a;
                List<? extends x<? extends View>> list = providers;
                int h11 = U.h(C7714v.z(list, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                for (Object obj : list) {
                    linkedHashMap.put(((x) obj).b(), obj);
                }
                map.putAll(linkedHashMap);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        this.f64497b.b();
        this.f64497b = new w();
    }
}
