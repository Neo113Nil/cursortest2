package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100dc implements InterfaceC0451r9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0273k5 f13591a;

    public C0100dc(@NotNull InterfaceC0551v9 interfaceC0551v9, @NotNull L6 l6, @NotNull Qg qg2, @NotNull C0372o4 c0372o4, @NotNull Q4 q42, @NotNull We we2) {
        C0074cc c0074cc = new C0074cc(l6, qg2, this, c0372o4, we2);
        this.f13591a = new C0273k5(interfaceC0551v9, c0074cc.a(), c0074cc.b(), q42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0451r9
    public final InterfaceC0427q9 a() {
        return this.f13591a;
    }

    @NotNull
    public final C0273k5 b() {
        return this.f13591a;
    }
}
