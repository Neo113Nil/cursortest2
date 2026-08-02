package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B0.C2454a;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.t;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayWidgetHolder;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayVO;", "Ll10/i;", "screenContainer", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;", "viewModel", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ReturnFromAnotherPageOrBackgroundObserver;", "lifecycleObserver", "<init>", "(Ll10/i;Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ReturnFromAnotherPageOrBackgroundObserver;)V", "", "observeLifecycleFragment", "()V", "observeRefreshEvent", "", "refreshCount", "trackPageReload", "(I)V", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "modifyAnalyticsData", "(I)LWZ/e;", "item", "bind", "(Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayVO;)V", "onWidgetCreated", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/ReturnFromAnotherPageOrBackgroundObserver;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "", "isSilent", "()Z", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvRefreshWithDelayWidgetHolder extends AbstractC6065b<AdvRefreshWithDelayVO> {

    @NotNull
    private final Handler handler;
    private final ReturnFromAnotherPageOrBackgroundObserver lifecycleObserver;
    private final View metricView;

    @NotNull
    private final i screenContainer;

    @NotNull
    private final AdvRefreshWithDelayViewModel viewModel;

    public AdvRefreshWithDelayWidgetHolder(@NotNull i screenContainer, @NotNull AdvRefreshWithDelayViewModel viewModel, ReturnFromAnotherPageOrBackgroundObserver returnFromAnotherPageOrBackgroundObserver) {
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.screenContainer = screenContainer;
        this.viewModel = viewModel;
        this.lifecycleObserver = returnFromAnotherPageOrBackgroundObserver;
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSilent() {
        AdvRefreshWithDelayVO viewObject = this.viewModel.getViewObject();
        if (viewObject != null) {
            return viewObject.getIsSilent();
        }
        return false;
    }

    private final e modifyAnalyticsData(int refreshCount) {
        final Map b11 = C2454a.b("refreshCount", String.valueOf(refreshCount));
        return new e() { // from class: El.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g modifyAnalyticsData$lambda$1;
                modifyAnalyticsData$lambda$1 = AdvRefreshWithDelayWidgetHolder.modifyAnalyticsData$lambda$1(b11, (d) aVar, gVar);
                return modifyAnalyticsData$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g modifyAnalyticsData$lambda$1(Map map, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    private final void observeLifecycleFragment() {
        if (this.lifecycleObserver != null) {
            this.screenContainer.Q().g().getLifecycle().a(this.lifecycleObserver.getHomeScreenStatePublisher());
        }
    }

    private final void observeRefreshEvent() {
        C2399j.C(new C2408n0(this.viewModel.getRefreshEventFlow(), new AdvRefreshWithDelayWidgetHolder$observeRefreshEvent$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPageReload(int refreshCount) {
        t tokenizedEvent;
        AdvRefreshWithDelayVO viewObject = this.viewModel.getViewObject();
        if (viewObject == null || (tokenizedEvent = viewObject.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents(this.screenContainer.X(), tokenizedEvent, modifyAnalyticsData(refreshCount));
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        observeLifecycleFragment();
        observeRefreshEvent();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AdvRefreshWithDelayVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.updateVoData(item);
    }
}
