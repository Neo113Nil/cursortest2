package Sj;

import okhttp3.OkHttpClient;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public final class c implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f10838a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f10839b;

    public c(Gg.e eVar, Gg.e eVar2) {
        this.f10838a = eVar;
        this.f10839b = eVar2;
    }

    public static c a(Gg.e eVar, Gg.e eVar2) {
        return new c(eVar, eVar2);
    }

    public static OkHttpClient c(RestServiceProvider restServiceProvider, h hVar) {
        return (OkHttpClient) Gg.d.d(b.a(restServiceProvider, hVar));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public OkHttpClient get() {
        return c((RestServiceProvider) this.f10838a.get(), (h) this.f10839b.get());
    }
}
