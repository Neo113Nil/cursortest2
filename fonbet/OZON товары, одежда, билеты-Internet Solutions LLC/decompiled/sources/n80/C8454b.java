package n80;

import A30.m;
import Jb.e;
import Jb.f;
import Q90.c;
import android.app.Application;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import o40.InterfaceC8640a;
import v30.d;
import x70.C10675b;

/* renamed from: n80.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8454b implements e<C8453a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<S80.b> f76629a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f76630b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<d> f76631c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<S60.a> f76632d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Application> f76633e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<m> f76634f;

    /* renamed from: g, reason: collision with root package name */
    private final f f76635g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<InterfaceC8640a> f76636h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f76637i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<c> f76638j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<d70.d> f76639k;

    public C8454b(f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8, Pc.a aVar9, Pc.a aVar10) {
        this.f76629a = aVar;
        this.f76630b = aVar2;
        this.f76631c = aVar3;
        this.f76632d = aVar4;
        this.f76633e = aVar5;
        this.f76634f = aVar6;
        this.f76635g = fVar;
        this.f76636h = aVar7;
        this.f76637i = aVar8;
        this.f76638j = aVar9;
        this.f76639k = aVar10;
    }

    @Override // Pc.a
    public final Object get() {
        S80.b fintechNavigation = this.f76629a.get();
        ru.ozon.fintech.settings.domain.a fintechSettings = this.f76630b.get();
        d fintechAntiFraudInteractor = this.f76631c.get();
        S60.a fintechMetrixInteractor = this.f76632d.get();
        Application application = this.f76633e.get();
        m fintechAuthInteractor = this.f76634f.get();
        C10675b onBoardingConfig = (C10675b) this.f76635g.get();
        InterfaceC8640a forceUpdateInteractor = this.f76636h.get();
        InterfaceC6618a fintechAnalyticInteractor = this.f76637i.get();
        c featureToggles = this.f76638j.get();
        d70.d offlineManager = this.f76639k.get();
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        return new C8453a(application, fintechNavigation, fintechSettings, offlineManager, fintechAuthInteractor, onBoardingConfig, fintechAntiFraudInteractor, forceUpdateInteractor, fintechAnalyticInteractor, featureToggles, fintechMetrixInteractor);
    }
}
