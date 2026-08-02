package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xf implements InterfaceC0483sg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0129eg f13189a;

    public Xf(C0129eg c0129eg) {
        this.f13189a = c0129eg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0483sg
    public final void a(@Nullable C0359ng c0359ng) {
        C0129eg c0129eg = this.f13189a;
        C0129eg.a(c0129eg, c0359ng, (Wf) c0129eg.f13693d.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0483sg
    public final void a(@NotNull Throwable th2) {
        C0129eg c0129eg = this.f13189a;
        C0129eg.a(c0129eg, null, (Wf) c0129eg.f13693d.getValue());
    }
}
