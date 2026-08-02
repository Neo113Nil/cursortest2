package gk0;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f64554a = new q();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C6745A f64555b = new C6745A();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final e f64556c = new e();

    public final void a() {
        f64555b.e();
        f64556c.f();
    }

    public final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f64555b.f(context);
        f64556c.g(context);
    }

    public final void c(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        f64556c.h(tag);
    }

    public final void d(@NotNull Context context, Tc.j jVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        f64555b.g(context, jVar);
    }

    public final void e(@NotNull androidx.fragment.app.r context, @NotNull String tag, @NotNull List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(list, "list");
        f64556c.k(context, tag, list);
    }

    @InterfaceC3999a
    public final void f(@NotNull String tag, @NotNull List<? extends n> list) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(list, "list");
        f64556c.l(tag, list);
    }

    @NotNull
    public final <T extends View> T g(@NotNull kotlin.reflect.d<T> type, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        T t2 = (T) f64556c.n(type);
        return t2 == null ? (T) f64555b.h(type, context) : t2;
    }

    public final View h(int i11) {
        return f64556c.m(i11);
    }

    public final <T extends View> T i(@NotNull kotlin.reflect.d<T> type, Context context) {
        Intrinsics.checkNotNullParameter(type, "type");
        T t2 = (T) f64556c.n(type);
        return t2 == null ? (T) f64555b.i(type, context) : t2;
    }

    public final void j(boolean z11) {
        f64556c.p(z11);
    }

    public final void k(@NotNull List<? extends x<? extends View>> providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        f64555b.j(providers);
    }

    public final void l() {
        f64555b.k();
    }
}
