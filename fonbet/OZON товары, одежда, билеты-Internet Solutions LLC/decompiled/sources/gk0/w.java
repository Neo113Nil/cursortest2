package gk0;

import De.C2862e;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes7.dex */
public final class w implements r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private ConcurrentHashMap<Context, M> f64561a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Resources, ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>>> f64562b = new ConcurrentHashMap<>();

    @Override // gk0.r
    @NotNull
    public final ConcurrentHashMap<Resources, ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>>> a() {
        return this.f64562b;
    }

    @Override // gk0.r
    public final void b() {
        ConcurrentHashMap<Context, M> concurrentHashMap = this.f64561a;
        Iterator<Map.Entry<Context, M>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            N.c(it.next().getValue(), null);
        }
        concurrentHashMap.clear();
        this.f64562b.clear();
    }

    @Override // gk0.r
    @NotNull
    public final M c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap<Context, M> concurrentHashMap = this.f64561a;
        M m11 = concurrentHashMap.get(context);
        if (m11 != null) {
            return m11;
        }
        C2862e a11 = N.a(new v(J.f105405n0).plus(X0.b()).plus(C10720e0.a()));
        concurrentHashMap.put(context, a11);
        return a11;
    }

    @Override // gk0.r
    public final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap<Context, M> concurrentHashMap = this.f64561a;
        M m11 = concurrentHashMap.get(context);
        if (m11 != null) {
            N.c(m11, null);
        }
        concurrentHashMap.remove(context);
        this.f64562b.remove(context.getResources());
    }
}
