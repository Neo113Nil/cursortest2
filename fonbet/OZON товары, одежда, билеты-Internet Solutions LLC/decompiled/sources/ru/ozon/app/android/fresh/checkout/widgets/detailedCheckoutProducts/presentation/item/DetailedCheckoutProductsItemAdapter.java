package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.item;

import N.r;
import WZ.t;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C5469c;
import androidx.recyclerview.widget.C5470d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.domain.DetailedCheckoutProductsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\u0004\b \u0010!R$\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\"\u0010%\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsItemViewHolder;", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onViewEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsItemViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsItemViewHolder;ILjava/util/List;)V", "getItemCount", "()I", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem;", "list", "Lkotlin/Function0;", "commitCallback", "submitList", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "differ", "Landroidx/recyclerview/widget/d;", "getItems", "()Ljava/util/List;", "items", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailedCheckoutProductsItemAdapter extends RecyclerView.g<DetailedCheckoutProductsItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final C5470d<DetailedCheckoutProductsVO.TileItem> differ;

    @NotNull
    private final Function1<t, Unit> onViewEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public DetailedCheckoutProductsItemAdapter(@NotNull Function1<? super t, Unit> onViewEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(onViewEvent, "onViewEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onViewEvent = onViewEvent;
        this.actionHandler = actionHandler;
        this.differ = new C5470d<>(new u() { // from class: ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.item.DetailedCheckoutProductsItemAdapter$differ$1
            @Override // androidx.recyclerview.widget.u
            public void onChanged(int position, int count, Object payload) {
                DetailedCheckoutProductsItemAdapter.this.notifyItemRangeChanged(position, count, payload);
            }

            @Override // androidx.recyclerview.widget.u
            public void onInserted(int position, int count) {
                DetailedCheckoutProductsItemAdapter.this.notifyItemRangeInserted(position, count);
            }

            @Override // androidx.recyclerview.widget.u
            public void onMoved(int fromPosition, int toPosition) {
                DetailedCheckoutProductsItemAdapter.this.notifyItemMoved(fromPosition, toPosition);
            }

            @Override // androidx.recyclerview.widget.u
            public void onRemoved(int position, int count) {
                List items;
                items = DetailedCheckoutProductsItemAdapter.this.getItems();
                if (C7714v.P(items) == position) {
                    DetailedCheckoutProductsItemAdapter.this.notifyDataSetChanged();
                } else {
                    DetailedCheckoutProductsItemAdapter.this.notifyItemRangeRemoved(position, count);
                }
            }
        }, new C5469c.a(new DetailedCheckoutItemDiffCallback()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DetailedCheckoutProductsVO.TileItem> getItems() {
        List<DetailedCheckoutProductsVO.TileItem> b11 = this.differ.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getCurrentList(...)");
        return b11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(DetailedCheckoutProductsItemAdapter detailedCheckoutProductsItemAdapter, List list, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = DetailedCheckoutProductsItemAdapter$submitList$1.INSTANCE;
        }
        detailedCheckoutProductsItemAdapter.submitList(list, function0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return getItems().size();
    }

    public final void submitList(@NotNull List<DetailedCheckoutProductsVO.TileItem> list, @NotNull Function0<Unit> commitCallback) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(commitCallback, "commitCallback");
        this.differ.e(list, new r(commitCallback, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(DetailedCheckoutProductsItemViewHolder detailedCheckoutProductsItemViewHolder, int i11, List list) {
        onBindViewHolder2(detailedCheckoutProductsItemViewHolder, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DetailedCheckoutProductsItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DetailedCheckoutProductItemView detailedCheckoutProductItemView = new DetailedCheckoutProductItemView(context, null, 0, 6, null);
        detailedCheckoutProductItemView.setId(R$id.detailedCheckoutProductItemView);
        detailedCheckoutProductItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new DetailedCheckoutProductsItemViewHolder(detailedCheckoutProductItemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DetailedCheckoutProductsItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getItems().get(position), this.onViewEvent, this.actionHandler);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@NotNull DetailedCheckoutProductsItemViewHolder holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, position);
    }
}
