package p80;

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

/* renamed from: p80.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8872b implements e<C8871a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<S80.b> f80306a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f80307b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<d> f80308c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<S60.a> f80309d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Application> f80310e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<m> f80311f;

    /* renamed from: g, reason: collision with root package name */
    private final f f80312g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<InterfaceC8640a> f80313h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f80314i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<c> f80315j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<d70.d> f80316k;

    public C8872b(f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8, Pc.a aVar9, Pc.a aVar10) {
        this.f80306a = aVar;
        this.f80307b = aVar2;
        this.f80308c = aVar3;
        this.f80309d = aVar4;
        this.f80310e = aVar5;
        this.f80311f = aVar6;
        this.f80312g = fVar;
        this.f80313h = aVar7;
        this.f80314i = aVar8;
        this.f80315j = aVar9;
        this.f80316k = aVar10;
    }

    @Override // Pc.a
    public final Object get() {
        S80.b fintechNavigation = this.f80306a.get();
        ru.ozon.fintech.settings.domain.a fintechSettings = this.f80307b.get();
        d fintechAntiFraudInteractor = this.f80308c.get();
        S60.a fintechMetrixInteractor = this.f80309d.get();
        Application application = this.f80310e.get();
        m fintechAuthInteractor = this.f80311f.get();
        C10675b onBoardingConfig = (C10675b) this.f80312g.get();
        InterfaceC8640a forceUpdateInteractor = this.f80313h.get();
        InterfaceC6618a fintechAnalyticInteractor = this.f80314i.get();
        c featureToggles = this.f80315j.get();
        d70.d offlineManager = this.f80316k.get();
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
        return new C8871a(application, fintechNavigation, fintechSettings, offlineManager, fintechAuthInteractor, onBoardingConfig, fintechAntiFraudInteractor, forceUpdateInteractor, fintechAnalyticInteractor, featureToggles, fintechMetrixInteractor);
    }
}
