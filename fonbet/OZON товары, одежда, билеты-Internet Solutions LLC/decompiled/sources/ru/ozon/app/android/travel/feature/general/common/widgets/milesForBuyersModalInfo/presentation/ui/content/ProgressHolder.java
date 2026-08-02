package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoVO;
import ru.ozon.app.android.travel.molecules.view.progressView.TravelHorizontalProgressView;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/ProgressHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/BaseContentItemHolder;", "progressView", "Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;", "<init>", "(Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;)V", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressHolder extends BaseContentItemHolder {
    public static final int $stable = TravelHorizontalProgressView.$stable;

    @NotNull
    private final TravelHorizontalProgressView progressView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressHolder(@NotNull TravelHorizontalProgressView progressView) {
        super(progressView);
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.progressView = progressView;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content.BaseContentItemHolder
    public void bind(@NotNull MilesForBuyersModalInfoVO.ContentItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        MilesForBuyersModalInfoVO.ContentItem.ProgressItem progressItem = (MilesForBuyersModalInfoVO.ContentItem.ProgressItem) item;
        TravelHorizontalProgressView travelHorizontalProgressView = this.progressView;
        travelHorizontalProgressView.setFillRadius(progressItem.getProgressHeight() / 2.0f);
        travelHorizontalProgressView.setText(progressItem.getProgress().getText());
        travelHorizontalProgressView.setProgress(progressItem.getProgress().getPercent());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = travelHorizontalProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        travelHorizontalProgressView.setFillColor(styleParser.parseColor(context, progressItem.getProgress().getProgressBarColor()));
        Context context2 = travelHorizontalProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        travelHorizontalProgressView.setBarColor(styleParser.parseColor(context2, progressItem.getProgressBackgroundColor()));
        TravelHorizontalProgressView travelHorizontalProgressView2 = this.progressView;
        travelHorizontalProgressView2.setPadding(progressItem.getPaddingLeft(), travelHorizontalProgressView2.getPaddingTop(), travelHorizontalProgressView2.getPaddingRight(), travelHorizontalProgressView2.getPaddingBottom());
        if (this.progressView.getHeight() != progressItem.getProgressHeight()) {
            TravelHorizontalProgressView travelHorizontalProgressView3 = this.progressView;
            ViewGroup.LayoutParams layoutParams = travelHorizontalProgressView3.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = progressItem.getProgressHeight();
            travelHorizontalProgressView3.setLayoutParams(layoutParams);
        }
    }
}
