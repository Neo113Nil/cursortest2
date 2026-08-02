package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Nb extends LocationProvider {
    void a(@Nullable Location location);

    void a(@NotNull Object obj);

    void a(boolean z5);

    void b(@NotNull Object obj);

    void init();
}
