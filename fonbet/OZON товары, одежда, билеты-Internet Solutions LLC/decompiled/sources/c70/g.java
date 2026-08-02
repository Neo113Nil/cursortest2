package c70;

import We.E;
import c70.C5759a;
import f70.C6442a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.features.offline.network.OfflineNetwork;

/* loaded from: classes3.dex */
public final class g implements Jb.e<OfflineNetwork> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f56674a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<E> f56675b;

    /* renamed from: c, reason: collision with root package name */
    private final c80.e f56676c;

    public g(Pc.a aVar, Pc.a aVar2, c80.e eVar) {
        this.f56674a = aVar;
        this.f56675b = aVar2;
        this.f56676c = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((C5759a.g) this.f56674a).get();
        E okHttpClient = (E) ((C5759a.h) this.f56675b).get();
        C6442a cbottomDataInterceptor = (C6442a) this.f56676c.get();
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(cbottomDataInterceptor, "cbottomDataInterceptor");
        okHttpClient.getClass();
        E.a aVar = new E.a(okHttpClient);
        aVar.a(cbottomDataInterceptor);
        E okHttpClient2 = new E(aVar);
        String baseUrl = fintechSettings.e();
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient2, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient2).addConverterFactory(MoshiConverterFactory.create()).build().create(OfflineNetwork.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        OfflineNetwork offlineNetwork = (OfflineNetwork) create;
        Jb.j.d(offlineNetwork);
        return offlineNetwork;
    }
}
