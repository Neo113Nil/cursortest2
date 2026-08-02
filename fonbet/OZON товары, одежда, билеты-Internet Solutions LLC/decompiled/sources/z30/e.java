package z30;

import B30.r;
import android.content.SharedPreferences;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import z30.j;

/* loaded from: classes3.dex */
public final class e implements Jb.e<B30.f> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f107209a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f107210b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<C30.a> f107211c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<B30.a> f107212d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Q90.c> f107213e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<A30.b> f107214f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f107215g;

    public e(Pc.a<ru.ozon.fintech.settings.domain.a> aVar, Pc.a<SharedPreferences> aVar2, Pc.a<C30.a> aVar3, Pc.a<B30.a> aVar4, Pc.a<Q90.c> aVar5, Pc.a<A30.b> aVar6, Pc.a<InterfaceC6618a> aVar7) {
        this.f107209a = aVar;
        this.f107210b = aVar2;
        this.f107211c = aVar3;
        this.f107212d = aVar4;
        this.f107213e = aVar5;
        this.f107214f = aVar6;
        this.f107215g = aVar7;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((j.c) this.f107209a).get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((j.e) this.f107210b).get();
        C30.a executorsProvider = this.f107211c.get();
        B30.a biometricAuthManager = this.f107212d.get();
        Q90.c featureToggles = (Q90.c) ((j.a) this.f107213e).get();
        A30.b fastEntryManager = this.f107214f.get();
        InterfaceC6618a fintechAnalyticInteractor = (InterfaceC6618a) ((j.b) this.f107215g).get();
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(executorsProvider, "executorsProvider");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fastEntryManager, "fastEntryManager");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        return new r(fintechSettings, sharedPreferences, biometricAuthManager, executorsProvider, featureToggles, fastEntryManager, fintechAnalyticInteractor);
    }
}
