package Ej;

import retrofit2.Retrofit;
import zendesk.core.CustomNetworkConfig;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class r implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f3207a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3208b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f3209c;

    public r(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        this.f3207a = eVar;
        this.f3208b = eVar2;
        this.f3209c = eVar3;
    }

    public static r a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        return new r(eVar, eVar2, eVar3);
    }

    public static q c(RestServiceProvider restServiceProvider, Retrofit retrofit, CustomNetworkConfig customNetworkConfig) {
        return new q(restServiceProvider, retrofit, customNetworkConfig);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c((RestServiceProvider) this.f3207a.get(), (Retrofit) this.f3208b.get(), (CustomNetworkConfig) this.f3209c.get());
    }
}
