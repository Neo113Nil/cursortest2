package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content;

import android.view.ViewGroup;
import android.widget.Space;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/SeparatorHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/BaseContentItemHolder;", "spaceView", "Landroid/widget/Space;", "<init>", "(Landroid/widget/Space;)V", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SeparatorHolder extends BaseContentItemHolder {

    @NotNull
    private final Space spaceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorHolder(@NotNull Space spaceView) {
        super(spaceView);
        Intrinsics.checkNotNullParameter(spaceView, "spaceView");
        this.spaceView = spaceView;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content.BaseContentItemHolder
    public void bind(@NotNull MilesForBuyersModalInfoVO.ContentItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        MilesForBuyersModalInfoVO.ContentItem.SeparatorItem separatorItem = (MilesForBuyersModalInfoVO.ContentItem.SeparatorItem) item;
        if (this.spaceView.getHeight() != separatorItem.getHeight()) {
            Space space = this.spaceView;
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = separatorItem.getHeight();
            space.setLayoutParams(layoutParams);
        }
    }
}
