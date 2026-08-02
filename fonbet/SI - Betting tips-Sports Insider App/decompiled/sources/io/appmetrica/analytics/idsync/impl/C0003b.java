package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003b implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f11846a;

    public C0003b(@NotNull ServiceContext serviceContext) {
        this.f11846a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.y
    public final boolean a() {
        return this.f11846a.getActiveNetworkTypeProvider().getNetworkType(this.f11846a.getContext()) == NetworkType.CELL;
    }
}
