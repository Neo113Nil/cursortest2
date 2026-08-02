package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends NetworkClient {
    public b(@NotNull NetworkClientSettings networkClientSettings) {
        super(networkClientSettings);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    @NotNull
    public final Call newCall(@NotNull Request request) {
        return new a();
    }
}
