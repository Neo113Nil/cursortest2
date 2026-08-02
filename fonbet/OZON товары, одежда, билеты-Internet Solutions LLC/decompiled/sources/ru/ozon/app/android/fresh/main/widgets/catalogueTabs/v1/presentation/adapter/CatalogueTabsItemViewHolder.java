package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.adapter;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.v3.holders.controls.chip.ChipHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/controls/chip/ChipView;", "view", "Lkotlin/Function1;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;", "", "onTabClicked", "onTabViewed", "", "isPerfEnabled", "<init>", "(Lru/ozon/uni/android/controls/chip/ChipView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;)V", "Lru/ozon/uni/android/controls/chip/ChipView;", "Lkotlin/jvm/functions/Function1;", "Z", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsItemViewHolder extends j {
    private final boolean isPerfEnabled;
    private CatalogueTabsVO.CatalogueTabsSingleTab item;

    @NotNull
    private final Function1<CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabClicked;

    @NotNull
    private final Function1<CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabViewed;

    @NotNull
    private final ChipView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatalogueTabsItemViewHolder(@NotNull ChipView view, @NotNull Function1<? super CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabClicked, @NotNull Function1<? super CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabViewed, boolean z11) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onTabClicked, "onTabClicked");
        Intrinsics.checkNotNullParameter(onTabViewed, "onTabViewed");
        this.view = view;
        this.onTabClicked = onTabClicked;
        this.onTabViewed = onTabViewed;
        this.isPerfEnabled = z11;
        if (z11) {
            view.setUnselectByClick(false);
            view.setOnSelect(new CatalogueTabsItemViewHolder$1$1(this));
        }
    }

    public final void bind(@NotNull CatalogueTabsVO.CatalogueTabsSingleTab item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ChipView chipView = this.view;
        chipView.setContentDescription(item.getChip().getState() == ChipState.SELECTED ? "CatalogueTabsChipSelected" : null);
        ChipHolderKt.bind$default(chipView, item.getChip(), null, 2, null);
        if (this.isPerfEnabled) {
            return;
        }
        chipView.setUnselectByClick(false);
        chipView.setOnSelect(new CatalogueTabsItemViewHolder$bind$1$1(this, item));
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        CatalogueTabsVO.CatalogueTabsSingleTab catalogueTabsSingleTab = this.item;
        if (catalogueTabsSingleTab != null) {
            this.onTabViewed.invoke(catalogueTabsSingleTab);
        }
    }
}
