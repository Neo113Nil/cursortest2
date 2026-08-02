package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00102\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001bR$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR$\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemViewHolder;", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onViewEvent", "onClickEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemViewHolder;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReorderTileItemAdapter extends t<ReorderTileVO.TileItem, ReorderTileItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<WZ.t, Unit> onClickEvent;

    @NotNull
    private final Function1<WZ.t, Unit> onViewEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderTileItemAdapter(@NotNull Function1<? super WZ.t, Unit> onViewEvent, @NotNull Function1<? super WZ.t, Unit> onClickEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new ReorderTileItemDiffCallback());
        Intrinsics.checkNotNullParameter(onViewEvent, "onViewEvent");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onViewEvent = onViewEvent;
        this.onClickEvent = onClickEvent;
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((ReorderTileItemViewHolder) c11, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ReorderTileItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ReorderTileItemView reorderTileItemView = new ReorderTileItemView(context, null, 0, 6, null);
        reorderTileItemView.setId(R$id.reorderTileItemView);
        reorderTileItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ReorderTileItemViewHolder(reorderTileItemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ReorderTileItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReorderTileVO.TileItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.onViewEvent, this.onClickEvent, this.actionHandler);
    }

    public void onBindViewHolder(@NotNull ReorderTileItemViewHolder holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, position);
    }
}
