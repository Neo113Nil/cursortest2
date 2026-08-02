package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266jo implements InterfaceC0290km {

    /* renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f14080a;

    public C0266jo(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.f14080a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0290km
    public final void a(@NotNull C0161fm c0161fm) {
        this.f14080a.updateConfiguration(new UtilityServiceConfiguration(c0161fm.f13772v, c0161fm.f13771u));
    }
}
