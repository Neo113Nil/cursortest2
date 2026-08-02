package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0672g f15339a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f15340b;

    /* renamed from: c, reason: collision with root package name */
    public final r f15341c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(@NotNull W w10) {
        Q q = new Q();
        C0670e c0670e = w10.f15333a;
        q.f15326a = c0670e != null ? this.f15339a.fromModel(c0670e) : null;
        a0 a0Var = w10.f15334b;
        q.f15327b = a0Var != null ? this.f15340b.fromModel(a0Var) : null;
        C0681p c0681p = w10.f15335c;
        q.f15328c = c0681p != null ? this.f15341c.fromModel(c0681p) : null;
        return q;
    }

    public Y(@NotNull C0672g c0672g, @NotNull c0 c0Var, @NotNull r rVar) {
        this.f15339a = c0672g;
        this.f15340b = c0Var;
        this.f15341c = rVar;
    }

    public /* synthetic */ Y(C0672g c0672g, c0 c0Var, r rVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C0672g() : c0672g, (i5 & 2) != 0 ? new c0() : c0Var, (i5 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(@NotNull Q q) {
        C0670e c0670e;
        a0 a0Var;
        N n9 = q.f15326a;
        if (n9 != null) {
            this.f15339a.getClass();
            c0670e = new C0670e(n9.f15317a);
        } else {
            c0670e = null;
        }
        P p10 = q.f15327b;
        if (p10 != null) {
            this.f15340b.getClass();
            a0Var = new a0(p10.f15323a, p10.f15324b);
        } else {
            a0Var = null;
        }
        O o3 = q.f15328c;
        return new W(c0670e, a0Var, o3 != null ? this.f15341c.toModel(o3) : null);
    }
}
