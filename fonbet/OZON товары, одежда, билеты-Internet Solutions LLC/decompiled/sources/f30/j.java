package f30;

import We.E;
import f30.q;
import kotlin.jvm.internal.Intrinsics;
import p30.C8849a;
import p30.C8850b;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import ru.ozon.fintech.analytic.network.GraylogNetwork;

/* loaded from: classes3.dex */
public final class j implements Jb.e<GraylogNetwork> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f62526a;

    public j(Pc.a aVar, C8850b c8850b) {
        this.f62526a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        E okHttpClient = (E) ((q.b) this.f62526a).get();
        C8849a authInterceptor = new C8849a();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(authInterceptor, "authInterceptor");
        okHttpClient.getClass();
        E.a aVar = new E.a(okHttpClient);
        aVar.a(authInterceptor);
        E okHttpClient2 = new E(aVar);
        Intrinsics.checkNotNullParameter(okHttpClient2, "okHttpClient");
        Object create = new Retrofit.Builder().baseUrl("https://xapi.ozon.ru/api/logs-shredder/").client(okHttpClient2).addConverterFactory(ScalarsConverterFactory.create()).build().create(GraylogNetwork.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        GraylogNetwork graylogNetwork = (GraylogNetwork) create;
        Jb.j.d(graylogNetwork);
        return graylogNetwork;
    }
}
