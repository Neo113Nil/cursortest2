package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.Response;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Call {
    @Override // io.appmetrica.analytics.networkapi.Call
    @NotNull
    public final Response execute() {
        return new Response.Builder(new IllegalStateException("This is dummy call")).build();
    }
}
