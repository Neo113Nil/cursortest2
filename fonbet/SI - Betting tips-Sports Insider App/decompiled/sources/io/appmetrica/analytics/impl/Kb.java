package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Kb extends Nb, LocationServiceApi {
    @Override // io.appmetrica.analytics.impl.Nb
    /* synthetic */ void a(@Nullable Location location);

    @Override // io.appmetrica.analytics.impl.Nb
    /* synthetic */ void a(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Nb
    /* synthetic */ void a(boolean z5);

    @Override // io.appmetrica.analytics.impl.Nb
    /* synthetic */ void b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Nb
    /* synthetic */ void init();
}
