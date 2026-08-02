package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.HomeScreenStatePublisher;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.ProcessLifecyclePublisher;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessAndStateObserver;", "", "Lxe/M;", "coroutineScope", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher;", "processLifecyclePublisher", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher;", "homeScreenStatePublisher", "Lkotlin/Function0;", "", "returnFromAnotherPageCallback", "Lkotlin/Function1;", "", "returnFromBackgroundCallback", "<init>", "(Lxe/M;Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher;Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;", "processState", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$PreviousAndCurrentHomeState;", "homeScreenState", "isReturnFromAnotherPage", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher$PreviousAndCurrentHomeState;)Z", "isReturnFromBackground", "resetPublishersState", "()V", "observe", "Lxe/M;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ProcessLifecyclePublisher;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/HomeScreenStatePublisher;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "fromAnotherPage", "Z", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessAndStateObserver {

    @NotNull
    private final M coroutineScope;
    private boolean fromAnotherPage;

    @NotNull
    private final HomeScreenStatePublisher homeScreenStatePublisher;

    @NotNull
    private final ProcessLifecyclePublisher processLifecyclePublisher;

    @NotNull
    private final Function0<Unit> returnFromAnotherPageCallback;

    @NotNull
    private final Function1<Boolean, Unit> returnFromBackgroundCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public ProcessAndStateObserver(@NotNull M coroutineScope, @NotNull ProcessLifecyclePublisher processLifecyclePublisher, @NotNull HomeScreenStatePublisher homeScreenStatePublisher, @NotNull Function0<Unit> returnFromAnotherPageCallback, @NotNull Function1<? super Boolean, Unit> returnFromBackgroundCallback) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(processLifecyclePublisher, "processLifecyclePublisher");
        Intrinsics.checkNotNullParameter(homeScreenStatePublisher, "homeScreenStatePublisher");
        Intrinsics.checkNotNullParameter(returnFromAnotherPageCallback, "returnFromAnotherPageCallback");
        Intrinsics.checkNotNullParameter(returnFromBackgroundCallback, "returnFromBackgroundCallback");
        this.coroutineScope = coroutineScope;
        this.processLifecyclePublisher = processLifecyclePublisher;
        this.homeScreenStatePublisher = homeScreenStatePublisher;
        this.returnFromAnotherPageCallback = returnFromAnotherPageCallback;
        this.returnFromBackgroundCallback = returnFromBackgroundCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isReturnFromAnotherPage(ProcessLifecyclePublisher.PreviousAndCurrentProcessState processState, HomeScreenStatePublisher.PreviousAndCurrentHomeState homeScreenState) {
        return (processState.getPreviousState() == ProcessLifecyclePublisher.ProcessState.NOT_INITIATED || processState.getPreviousState() == ProcessLifecyclePublisher.ProcessState.FOREGROUND) && processState.getCurrentState() == ProcessLifecyclePublisher.ProcessState.FOREGROUND && homeScreenState.getPreviousState() == HomeScreenStatePublisher.HomeScreenState.STOPPED && homeScreenState.getCurrentState() == HomeScreenStatePublisher.HomeScreenState.STARTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isReturnFromBackground(ProcessLifecyclePublisher.PreviousAndCurrentProcessState processState, HomeScreenStatePublisher.PreviousAndCurrentHomeState homeScreenState) {
        return processState.getPreviousState() == ProcessLifecyclePublisher.ProcessState.BACKGROUND && processState.getCurrentState() == ProcessLifecyclePublisher.ProcessState.FOREGROUND && homeScreenState.getPreviousState() == HomeScreenStatePublisher.HomeScreenState.STOPPED && homeScreenState.getCurrentState() == HomeScreenStatePublisher.HomeScreenState.STARTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetPublishersState() {
        this.processLifecyclePublisher.resetProcessState();
        this.homeScreenStatePublisher.resetHomeState();
    }

    public final void observe() {
        C10727i.c(this.coroutineScope, null, null, new ProcessAndStateObserver$observe$1(this, null), 3);
    }
}
