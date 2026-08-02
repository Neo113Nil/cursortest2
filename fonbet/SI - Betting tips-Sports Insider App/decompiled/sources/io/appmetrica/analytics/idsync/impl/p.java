package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f11904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11905b = "id_sync";

    public p(@NotNull ServiceContext serviceContext) {
        this.f11904a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(@NotNull String str, @NotNull SdkIdentifiers sdkIdentifiers) {
        this.f11904a.getSelfReporter().reportEvent(this.f11905b, str);
    }
}
