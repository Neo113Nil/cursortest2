package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ReturnFromAnotherPageOrBackgroundObserver;", "", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;)V", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher;", "homeScreenStatePublisher", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher;", "getHomeScreenStatePublisher", "()Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher;", "processLifecyclePublisher", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessAndStateObserver;", "processAndStateObserver$delegate", "LSc/j;", "getProcessAndStateObserver", "()Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessAndStateObserver;", "processAndStateObserver", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReturnFromAnotherPageOrBackgroundObserver {

    @NotNull
    private final HomeScreenStatePublisher homeScreenStatePublisher;

    /* renamed from: processAndStateObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j processAndStateObserver;

    @NotNull
    private final ProcessLifecyclePublisher processLifecyclePublisher;

    @NotNull
    private final AdvRefreshWithDelayViewModel viewModel;

    public ReturnFromAnotherPageOrBackgroundObserver(@NotNull AdvRefreshWithDelayViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
        this.homeScreenStatePublisher = new HomeScreenStatePublisher(new ReturnFromAnotherPageOrBackgroundObserver$homeScreenStatePublisher$1(this));
        this.processLifecyclePublisher = new ProcessLifecyclePublisher();
        this.processAndStateObserver = k.a(n.NONE, new ReturnFromAnotherPageOrBackgroundObserver$processAndStateObserver$2(this));
        getProcessAndStateObserver().observe();
    }

    private final ProcessAndStateObserver getProcessAndStateObserver() {
        return (ProcessAndStateObserver) this.processAndStateObserver.getValue();
    }

    @NotNull
    public final HomeScreenStatePublisher getHomeScreenStatePublisher() {
        return this.homeScreenStatePublisher;
    }
}
