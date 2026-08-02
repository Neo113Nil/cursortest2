package Ej;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import zendesk.core.CustomNetworkConfig;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final RestServiceProvider f3204a;

    /* renamed from: b, reason: collision with root package name */
    public final Retrofit f3205b;

    /* renamed from: c, reason: collision with root package name */
    public final CustomNetworkConfig f3206c;

    public q(RestServiceProvider restServiceProvider, Retrofit retrofit, CustomNetworkConfig customNetworkConfig) {
        Intrinsics.checkNotNullParameter(restServiceProvider, "restServiceProvider");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(customNetworkConfig, "customNetworkConfig");
        this.f3204a = restServiceProvider;
        this.f3205b = retrofit;
        this.f3206c = customNetworkConfig;
    }
}
