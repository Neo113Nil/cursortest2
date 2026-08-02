package io.sentry.android.replay.util;

import K1.K;
import hd.C6915b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f67662a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67663b;

    public b(@NotNull K layout, boolean z11) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f67662a = layout;
        this.f67663b = z11;
    }

    @Override // io.sentry.android.replay.util.m
    public final int a(int i11) {
        return C6915b.c(this.f67662a.u(i11));
    }

    @Override // io.sentry.android.replay.util.m
    public final float b(int i11, int i12) {
        K k11 = this.f67662a;
        float i13 = k11.i(i12, true);
        return (this.f67663b || k11.m() != 1) ? i13 : i13 - k11.r(i11);
    }

    @Override // io.sentry.android.replay.util.m
    public final int c(int i11) {
        return this.f67662a.t(i11);
    }

    @Override // io.sentry.android.replay.util.m
    public final Integer d() {
        return null;
    }

    @Override // io.sentry.android.replay.util.m
    public final int e(int i11) {
        return C6915b.c(this.f67662a.l(i11));
    }

    @Override // io.sentry.android.replay.util.m
    public final int f() {
        return this.f67662a.m();
    }

    @Override // io.sentry.android.replay.util.m
    public final int g(int i11) {
        return this.f67662a.n(i11);
    }

    @Override // io.sentry.android.replay.util.m
    public final int h(int i11) {
        return this.f67662a.C(i11) ? 1 : 0;
    }
}
