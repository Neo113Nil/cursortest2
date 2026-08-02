package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/IconHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/BaseContentItemHolder;", "iconViewWrapper", "Landroid/widget/FrameLayout;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/uni/android/atom/icon/IconView;)V", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconHolder extends BaseContentItemHolder {
    public static final int $stable = IconView.$stable;

    @NotNull
    private final IconView iconView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconHolder(@NotNull FrameLayout iconViewWrapper, @NotNull IconView iconView) {
        super(iconViewWrapper);
        Intrinsics.checkNotNullParameter(iconViewWrapper, "iconViewWrapper");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        this.iconView = iconView;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content.BaseContentItemHolder
    public void bind(@NotNull MilesForBuyersModalInfoVO.ContentItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bind$default(this.iconView, ((MilesForBuyersModalInfoVO.ContentItem.IconItem) item).getIcon(), null, 2, null);
    }
}
