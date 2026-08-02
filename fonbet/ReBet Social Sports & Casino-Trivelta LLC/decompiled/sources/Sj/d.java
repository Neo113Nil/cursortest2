package Sj;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import zendesk.core.ApplicationConfiguration;

/* loaded from: classes5.dex */
public final class d implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f10840a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f10841b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f10842c;

    public d(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        this.f10840a = eVar;
        this.f10841b = eVar2;
        this.f10842c = eVar3;
    }

    public static d a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        return new d(eVar, eVar2, eVar3);
    }

    public static Retrofit c(Gson gson, ApplicationConfiguration applicationConfiguration, OkHttpClient okHttpClient) {
        return (Retrofit) Gg.d.d(b.b(gson, applicationConfiguration, okHttpClient));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Retrofit get() {
        return c((Gson) this.f10840a.get(), (ApplicationConfiguration) this.f10841b.get(), (OkHttpClient) this.f10842c.get());
    }
}
