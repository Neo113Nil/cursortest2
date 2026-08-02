package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074cc {

    /* renamed from: a, reason: collision with root package name */
    public final Qg f13511a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0451r9 f13512b;

    /* renamed from: c, reason: collision with root package name */
    public final C0372o4 f13513c;

    /* renamed from: d, reason: collision with root package name */
    public final We f13514d;

    /* renamed from: e, reason: collision with root package name */
    public final N4 f13515e;

    /* renamed from: f, reason: collision with root package name */
    public final C0554vc f13516f = new C0554vc();

    /* renamed from: g, reason: collision with root package name */
    public final gf.i f13517g = gf.k.b(new C0048bc(this));

    public C0074cc(@NotNull L6 l6, @NotNull Qg qg2, @NotNull InterfaceC0451r9 interfaceC0451r9, @NotNull C0372o4 c0372o4, @NotNull We we2) {
        this.f13511a = qg2;
        this.f13512b = interfaceC0451r9;
        this.f13513c = c0372o4;
        this.f13514d = we2;
        this.f13515e = new N4(l6, qg2);
    }

    @NotNull
    public final List<F8> a() {
        return this.f13515e.a();
    }

    @NotNull
    public final List<F8> b() {
        return CollectionsKt.N(kotlin.collections.t.c(this.f13515e.f12625c), kotlin.collections.t.c((F8) this.f13517g.getValue()));
    }
}
