package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class I implements InterfaceC0674i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f15308a;

    /* renamed from: b, reason: collision with root package name */
    public final U f15309b;

    public I(@NotNull ClientContext clientContext, @NotNull U u10) {
        this.f15308a = clientContext;
        this.f15309b = u10;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0674i
    @NotNull
    public final List<T> a() {
        return kotlin.collections.u.f(new C0686v(this.f15308a, this.f15309b), new g0(this.f15308a, this.f15309b));
    }
}
