package ru.ozon.app.android.search.catalog.components.clusters.presentation;

import android.widget.LinearLayout;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersVO;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/catalog/components/clusters/presentation/ItemClusterViewHolder;", "Ljk0/j;", "Lru/ozon/uni/android/cell/CellView;", "containerView", "<init>", "(Lru/ozon/uni/android/cell/CellView;)V", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO$ClusterVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO$ClusterVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/cell/CellView;", "getContainerView", "()Lru/ozon/uni/android/cell/CellView;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemClusterViewHolder extends j {
    public static final int $stable = CellView.$stable;

    @NotNull
    private final CellView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemClusterViewHolder(@NotNull CellView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void bind(@NotNull ClustersVO.ClusterVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        CellView cellView = this.containerView;
        CellHolderKt.bind(cellView, item.getCell(), onAction);
        CommonControlSettings common = item.getCell().getCommon();
        boolean z11 = (common != null ? common.getAction() : null) != null;
        CellView.LeftBlock leftBlock = cellView.getLeftBlock();
        leftBlock.setEnabled(z11);
        leftBlock.setLayoutParams(new LinearLayout.LayoutParams(item.getLeftBlockWidth(), item.getLeftBlockHeight()));
        leftBlock.setAlignment(CellView.AddonBlock.Alignment.ALIGNMENT_CENTER);
        CellView.CenterBlock centerBlock = cellView.getCenterBlock();
        centerBlock.setEnabled(z11);
        CellView.TextView titleView = centerBlock.getTitleView();
        titleView.setMinLines(2);
        titleView.setMaxWidth(item.getTextMaxWidth());
        titleView.setGravity(16);
    }
}
