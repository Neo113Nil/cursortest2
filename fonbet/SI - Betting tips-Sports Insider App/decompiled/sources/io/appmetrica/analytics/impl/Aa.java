package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Aa extends SimpleAdvertisingIdGetter, InterfaceC0290km {
    @NotNull
    AdvertisingIdsHolder a();

    @NotNull
    AdvertisingIdsHolder a(@NotNull Gi gi2);

    @Override // io.appmetrica.analytics.impl.InterfaceC0290km
    /* synthetic */ void a(@NonNull C0161fm c0161fm);

    void b(boolean z5);

    void c(boolean z5);

    @NotNull
    AdvertisingIdsHolder getIdentifiers();

    void init();
}
