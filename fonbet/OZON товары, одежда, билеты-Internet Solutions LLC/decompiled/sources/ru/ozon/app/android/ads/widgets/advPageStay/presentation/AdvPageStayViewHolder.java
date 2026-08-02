package ru.ozon.app.android.ads.widgets.advPageStay.presentation;

import RZ.c;
import WZ.l;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayVO;", "Ll10/i;", "container", "Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewModel;", "advPageStayViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Ll10/i;Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewModel;LWZ/l;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayVO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewModel;", "LWZ/l;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "ru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewHolder$lifecycleObserver$1;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvPageStayViewHolder extends AbstractC6065b<AdvPageStayVO> {

    @NotNull
    private final AdvPageStayViewModel advPageStayViewModel;

    @NotNull
    private final i container;

    @NotNull
    private final AdvPageStayViewHolder$lifecycleObserver$1 lifecycleObserver;
    private final View metricView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewHolder$lifecycleObserver$1] */
    public AdvPageStayViewHolder(@NotNull i container, @NotNull AdvPageStayViewModel advPageStayViewModel, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(advPageStayViewModel, "advPageStayViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.container = container;
        this.advPageStayViewModel = advPageStayViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                AdvPageStayViewModel advPageStayViewModel2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                AdvPageStayVO boundData = AdvPageStayViewHolder.this.getBoundData();
                if (boundData != null) {
                    advPageStayViewModel2 = AdvPageStayViewHolder.this.advPageStayViewModel;
                    advPageStayViewModel2.startTimer(boundData.getEvents());
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                AdvPageStayViewModel advPageStayViewModel2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                advPageStayViewModel2 = AdvPageStayViewHolder.this.advPageStayViewModel;
                advPageStayViewModel2.pauseTimer();
            }
        };
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AdvPageStayVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        AdvPageStayVO boundData = getBoundData();
        if (boundData != null) {
            this.tokenizedAnalytics.b(U.i(new Pair(Long.valueOf(boundData.getId()), new c(getTrackingData().d()))));
        }
        this.container.K().f().getLifecycle().a(this.lifecycleObserver);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.container.K().f().getLifecycle().e(this.lifecycleObserver);
    }
}
