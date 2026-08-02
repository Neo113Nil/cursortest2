package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687w implements InterfaceC0674i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f15399a;

    /* renamed from: b, reason: collision with root package name */
    public final U f15400b;

    public C0687w(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f15399a = clientContext;
        this.f15400b = u10;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0674i
    @NotNull
    public final List<T> a() {
        return kotlin.collections.u.f(new C0669d(this.f15399a, this.f15400b), new C0686v(this.f15399a, this.f15400b), new g0(this.f15399a, this.f15400b));
    }
}
