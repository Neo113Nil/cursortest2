package m80;

import A30.m;
import Q90.c;
import Q90.n;
import android.app.Application;
import b40.InterfaceC5539a;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import l80.g;
import o40.InterfaceC8640a;
import org.jetbrains.annotations.NotNull;
import v30.d;
import x70.C10675b;

/* renamed from: m80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8107a extends g {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC5539a f74631p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f74632q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8107a(@NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC5539a esiaApi, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull n fintechUltraManager, @NotNull d fintechAntiFraudInteractor, @NotNull S60.a fintechMetrixInteractor, @NotNull Application application, @NotNull S80.b fintechNavigation, @NotNull m fintechAuthInteractor, @NotNull C10675b onBoardingConfig, @NotNull InterfaceC8640a forceUpdateInteractor, @NotNull c featureToggles, @NotNull d70.d offlineManager) {
        super(application, fintechNavigation, fintechSettings, offlineManager, fintechAuthInteractor, onBoardingConfig, fintechAntiFraudInteractor, forceUpdateInteractor, fintechAnalyticInteractor, featureToggles, fintechMetrixInteractor);
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechUltraManager, "fintechUltraManager");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(onBoardingConfig, "onBoardingConfig");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        this.f74631p = esiaApi;
        this.f74632q = fintechAnalyticInteractor;
    }
}
