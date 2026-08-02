package gk0;

import De.C2862e;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
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
public final class u implements r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C2862e f64559a = N.a(new t(J.f105405n0).plus(X0.b()).plus(C10720e0.a()));

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Resources, ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>>> f64560b = new ConcurrentHashMap<>();

    @Override // gk0.r
    @NotNull
    public final ConcurrentHashMap<Resources, ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<View>>> a() {
        return this.f64560b;
    }

    @Override // gk0.r
    public final void b() {
        N.c(this.f64559a, null);
        this.f64559a = N.a(new t(J.f105405n0).plus(X0.b()).plus(C10720e0.a()));
        this.f64560b.clear();
    }

    @Override // gk0.r
    @NotNull
    public final M c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f64559a;
    }

    @Override // gk0.r
    public final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b();
    }
}
