package k80;

import A30.m;
import Jb.e;
import Jb.f;
import android.app.Application;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import o40.InterfaceC8640a;
import v30.d;
import x70.C10675b;

/* renamed from: k80.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7609c implements e<C7608b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f71090a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f71091b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<d> f71092c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<S60.a> f71093d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Application> f71094e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<S80.b> f71095f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<m> f71096g;

    /* renamed from: h, reason: collision with root package name */
    private final f f71097h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<InterfaceC8640a> f71098i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<Q90.c> f71099j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<d70.d> f71100k;

    public C7609c(f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8, Pc.a aVar9, Pc.a aVar10) {
        this.f71090a = aVar;
        this.f71091b = aVar2;
        this.f71092c = aVar3;
        this.f71093d = aVar4;
        this.f71094e = aVar5;
        this.f71095f = aVar6;
        this.f71096g = aVar7;
        this.f71097h = fVar;
        this.f71098i = aVar8;
        this.f71099j = aVar9;
        this.f71100k = aVar10;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.fintech.settings.domain.a fintechSettings = this.f71090a.get();
        InterfaceC6618a fintechAnalyticInteractor = this.f71091b.get();
        d fintechAntiFraudInteractor = this.f71092c.get();
        S60.a fintechMetrixInteractor = this.f71093d.get();
        Application application = this.f71094e.get();
        S80.b fintechNavigation = this.f71095f.get();
        m fintechAuthInteractor = this.f71096g.get();
        C10675b onBoardingConfig = (C10675b) this.f71097h.get();
        InterfaceC8640a forceUpdateInteractor = this.f71098i.get();
        Q90.c featureToggles = this.f71099j.get();
        d70.d offlineManager = this.f71100k.get();
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        return new C7608b(application, fintechNavigation, fintechSettings, offlineManager, fintechAuthInteractor, onBoardingConfig, fintechAntiFraudInteractor, forceUpdateInteractor, fintechAnalyticInteractor, featureToggles, fintechMetrixInteractor);
    }
}
