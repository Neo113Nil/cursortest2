package f30;

import We.E;
import f30.q;
import i30.C7005b;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import ru.ozon.fintech.analytic.network.MobileHealthNetwork;

/* loaded from: classes3.dex */
public final class n implements Jb.e<MobileHealthNetwork> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<E> f62537a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f62538b;

    public n(Jb.f fVar, Pc.a aVar) {
        this.f62537a = aVar;
        this.f62538b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        E okHttpClient = (E) ((q.b) this.f62537a).get();
        C7005b mobileHealthConfig = (C7005b) this.f62538b.get();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(mobileHealthConfig, "mobileHealthConfig");
        String url = mobileHealthConfig.d();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(url, "url");
        Object create = new Retrofit.Builder().baseUrl(url).client(okHttpClient).addConverterFactory(ScalarsConverterFactory.create()).build().create(MobileHealthNetwork.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        MobileHealthNetwork mobileHealthNetwork = (MobileHealthNetwork) create;
        Jb.j.d(mobileHealthNetwork);
        return mobileHealthNetwork;
    }
}
