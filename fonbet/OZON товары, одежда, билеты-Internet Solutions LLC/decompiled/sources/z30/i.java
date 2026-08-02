package z30;

import A30.m;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.auth.network.AuthNetworkApiV2;
import z30.j;

/* loaded from: classes3.dex */
public final class i implements Jb.e<m> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f107220a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f107221b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<S80.b> f107222c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<AuthNetworkApiV2> f107223d;

    /* renamed from: e, reason: collision with root package name */
    private final Jb.f f107224e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<Retrofit> f107225f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<B30.f> f107226g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<A30.b> f107227h;

    /* renamed from: i, reason: collision with root package name */
    private final g f107228i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<Q90.c> f107229j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<B30.a> f107230k;

    public i(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Jb.f fVar, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, g gVar, Pc.a aVar8, Pc.a aVar9) {
        this.f107220a = aVar;
        this.f107221b = aVar2;
        this.f107222c = aVar3;
        this.f107223d = aVar4;
        this.f107224e = fVar;
        this.f107225f = aVar5;
        this.f107226g = aVar6;
        this.f107227h = aVar7;
        this.f107228i = gVar;
        this.f107229j = aVar8;
        this.f107230k = aVar9;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC6618a fintechAnalyticInteractor = (InterfaceC6618a) ((j.b) this.f107220a).get();
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((j.c) this.f107221b).get();
        S80.b fintechNavigation = (S80.b) ((j.g) this.f107222c).get();
        AuthNetworkApiV2 authNetworkApiV2 = this.f107223d.get();
        ExternalFintechAuth externalFintechAuth = (ExternalFintechAuth) this.f107224e.get();
        Retrofit retrofit = this.f107225f.get();
        B30.f biometricSecurityStorage = this.f107226g.get();
        A30.b fastEntryManager = this.f107227h.get();
        Moshi moshi = (Moshi) this.f107228i.get();
        Q90.c featureToggles = (Q90.c) ((j.a) this.f107229j).get();
        B30.a biometricAuthManager = this.f107230k.get();
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(authNetworkApiV2, "authNetworkApiV2");
        Intrinsics.checkNotNullParameter(externalFintechAuth, "externalFintechAuth");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(fastEntryManager, "fastEntryManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        return new m(fintechAnalyticInteractor, fintechSettings, featureToggles, retrofit, moshi, fintechNavigation, authNetworkApiV2, biometricSecurityStorage, externalFintechAuth, fastEntryManager, biometricAuthManager);
    }
}
