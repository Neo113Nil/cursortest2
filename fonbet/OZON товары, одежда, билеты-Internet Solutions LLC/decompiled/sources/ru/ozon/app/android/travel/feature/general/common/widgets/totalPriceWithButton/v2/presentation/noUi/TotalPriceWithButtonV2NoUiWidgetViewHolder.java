package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.noUi;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2ViewModel;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/noUi/TotalPriceWithButtonV2NoUiWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/noUi/TotalPriceWithButtonV2TimerVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;)V", "", "deadline", "", "startTimer", "(J)V", "stopTimer", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/noUi/TotalPriceWithButtonV2TimerVO;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2NoUiWidgetViewHolder extends AbstractC6065b<TotalPriceWithButtonV2TimerVO> {
    private final View metricView;
    private TimerHelper timerHelper;

    @NotNull
    private final TotalPriceWithButtonV2ViewModel viewModel;

    public TotalPriceWithButtonV2NoUiWidgetViewHolder(@NotNull TotalPriceWithButtonV2ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    private final void startTimer(long deadline) {
        stopTimer();
        this.timerHelper = new TimerHelper(getLifecycle());
        this.viewModel.onStart();
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.startTimer(Long.valueOf(deadline), new TotalPriceWithButtonV2NoUiWidgetViewHolder$startTimer$1(this.viewModel), new TotalPriceWithButtonV2NoUiWidgetViewHolder$startTimer$2(this.viewModel));
        }
    }

    private final void stopTimer() {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timerHelper = null;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        stopTimer();
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TotalPriceWithButtonV2TimerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        startTimer(item.getDeadline());
    }
}
