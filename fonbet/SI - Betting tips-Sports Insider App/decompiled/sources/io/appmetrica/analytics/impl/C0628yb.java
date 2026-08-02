package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628yb implements ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f14951a;

    /* renamed from: b, reason: collision with root package name */
    public final gf.i f14952b = gf.k.b(new C0603xb(this));

    public C0628yb(@NotNull X4 x42) {
        this.f14951a = x42;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0285kh getConfig() {
        return (C0285kh) this.f14952b.getValue();
    }
}
