package g90;

import Jb.j;
import We.E;
import g90.C6680a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.fintech.notifications.network.FintechNotificationApi;

/* loaded from: classes3.dex */
public final class f implements Jb.e<FintechNotificationApi> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f64141a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f64142b;

    public f(Pc.a<E> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2) {
        this.f64141a = aVar;
        this.f64142b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        E okHttpClient = (E) ((C6680a.e) this.f64141a).get();
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((C6680a.d) this.f64142b).get();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Object create = new Retrofit.Builder().baseUrl(fintechSettings.e() + "/").addConverterFactory(MoshiConverterFactory.create()).client(okHttpClient).build().create(FintechNotificationApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        FintechNotificationApi fintechNotificationApi = (FintechNotificationApi) create;
        j.d(fintechNotificationApi);
        return fintechNotificationApi;
    }
}
