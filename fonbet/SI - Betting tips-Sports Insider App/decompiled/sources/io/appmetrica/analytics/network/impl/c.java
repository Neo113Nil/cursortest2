package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.networkapi.NetworkClient;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends NetworkClient.Builder {
    @NotNull
    public final b a() {
        return new b(getSettings());
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public final NetworkClient build() {
        return new b(getSettings());
    }

    @NotNull
    public final String toString() {
        return "Dummy Network Client Builder";
    }
}
