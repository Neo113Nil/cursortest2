package io.appmetrica.analytics.impl;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public final C0597x5 f12623a;

    /* renamed from: b, reason: collision with root package name */
    public final Ec f12624b;

    /* renamed from: c, reason: collision with root package name */
    public final Ec f12625c;

    public N4(@NotNull L6 l6, @NotNull Qg qg2) {
        C0506te c0506te = new C0506te(l6);
        this.f12623a = new C0597x5(l6);
        this.f12624b = new Ec(c0506te, new M4(qg2));
        this.f12625c = new Ec(c0506te, L4.f12505a);
    }

    @NotNull
    public final List<F8> a() {
        return kotlin.collections.u.f(this.f12623a, this.f12624b);
    }

    @NotNull
    public final List<F8> b() {
        return kotlin.collections.t.c(this.f12625c);
    }
}
