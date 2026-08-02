package io.appmetrica.analytics.networkokhttp.impl;

import gh.g0;
import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f15176a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull NetworkClientSettings networkClientSettings) {
        this(networkClientSettings, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    @NotNull
    public final Call newCall(@NotNull Request request) {
        return new c(this.f15176a, request, getSettings());
    }

    @NotNull
    public final String toString() {
        return "OkHttpNetworkClient(settings=" + getSettings() + ')';
    }

    public /* synthetic */ e(NetworkClientSettings networkClientSettings, g0 g0Var, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkClientSettings, (i5 & 2) != 0 ? d.a(networkClientSettings) : g0Var);
    }

    public e(@NotNull NetworkClientSettings networkClientSettings, @NotNull g0 g0Var) {
        super(networkClientSettings);
        this.f15176a = g0Var;
    }
}
