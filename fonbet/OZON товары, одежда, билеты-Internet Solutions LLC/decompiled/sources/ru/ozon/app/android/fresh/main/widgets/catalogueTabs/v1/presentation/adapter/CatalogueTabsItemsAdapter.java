package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.adapter;

import Bl.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import gk0.q;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;
import ru.ozon.uni.android.controls.chip.ChipView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO$CatalogueTabsSingleTab;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "", "onTabClicked", "onTabViewed", "", "isPreCreateWidgetsCategoryMainPageFresh", "isPerfEnabled", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "", "list", "submitList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/adapter/CatalogueTabsItemViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Z", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogueTabsItemsAdapter extends i<CatalogueTabsVO.CatalogueTabsSingleTab, CatalogueTabsItemViewHolder> {
    private final boolean isPerfEnabled;
    private final boolean isPreCreateWidgetsCategoryMainPageFresh;

    @NotNull
    private final Function1<CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabClicked;

    @NotNull
    private final Function1<CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabViewed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatalogueTabsItemsAdapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabClicked, @NotNull Function1<? super CatalogueTabsVO.CatalogueTabsSingleTab, Unit> onTabViewed, boolean z11, boolean z12) {
        super(new GenericDiffUtil(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(onTabClicked, "onTabClicked");
        Intrinsics.checkNotNullParameter(onTabViewed, "onTabViewed");
        this.onTabClicked = onTabClicked;
        this.onTabViewed = onTabViewed;
        this.isPreCreateWidgetsCategoryMainPageFresh = z11;
        this.isPerfEnabled = z12;
    }

    @Override // androidx.recyclerview.widget.t
    public void submitList(List<CatalogueTabsVO.CatalogueTabsSingleTab> list) {
        super.submitList(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CatalogueTabsItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CatalogueTabsVO.CatalogueTabsSingleTab item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CatalogueTabsItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View a11 = b.a(ChipView.class, "type", q.f64554a, null);
        ChipView chipView = (ChipView) (this.isPreCreateWidgetsCategoryMainPageFresh ? a11 : null);
        if (chipView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            chipView = new ChipView(context, null, 0, 0, 14, null);
        }
        chipView.setId(R$id.chip);
        chipView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new CatalogueTabsItemViewHolder(chipView, this.onTabClicked, this.onTabViewed, this.isPerfEnabled);
    }
}
