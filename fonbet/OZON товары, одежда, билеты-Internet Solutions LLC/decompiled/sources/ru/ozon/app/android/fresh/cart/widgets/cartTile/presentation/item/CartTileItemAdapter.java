package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import GE.b;
import WZ.t;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.C5469c;
import androidx.recyclerview.widget.C5470d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;
import java.util.List;
import jk0.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0097\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u001aJ\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u001fH\u0016¢\u0006\u0004\b/\u00100J/\u0010/\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u001f2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u000bH\u0016¢\u0006\u0004\b/\u00103J\u000f\u00104\u001a\u00020\u001fH\u0016¢\u0006\u0004\b4\u00105J+\u00108\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b8\u00109R$\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R&\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010:R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\f0\f0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemAdapter;", "Ljk0/d;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemViewHolder;", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onViewEvent", "onClickEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "tileUpdateCallback", "tileRemoveCallback", "Lkotlin/Function0;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "freshFavoriteDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;)V", "item", "closeRevealedTilesOnSwipeStart", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;)V", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "state", "changeSwipeState", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;)V", "", "pos", "", "isTap", "onSwipeDeleteItem", "(IZ)V", "removeItem", "processDeleteAnalytics", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Z)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemViewHolder;I)V", "", "payloads", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemViewHolder;ILjava/util/List;)V", "getItemCount", "()I", "list", "commitCallback", "submitList", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "differ", "Landroidx/recyclerview/widget/d;", "getItems", "()Ljava/util/List;", "items", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileItemAdapter extends d<CartTileItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final C5470d<CartTileVO.TileItem> differ;

    @NotNull
    private final Function0<FreshFavoriteDelegate> freshFavoriteDelegateProvider;

    @NotNull
    private final Function1<t, Unit> onClickEvent;

    @NotNull
    private final Function1<t, Unit> onViewEvent;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Function1<CartTileVO.TileItem, Unit> tileRemoveCallback;

    @NotNull
    private final Function1<List<CartTileVO.TileItem>, Unit> tileUpdateCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CartTileItemAdapter(@NotNull Function1<? super t, Unit> onViewEvent, @NotNull Function1<? super t, Unit> onClickEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super List<CartTileVO.TileItem>, Unit> tileUpdateCallback, @NotNull Function1<? super CartTileVO.TileItem, Unit> tileRemoveCallback, @NotNull Function0<FreshFavoriteDelegate> freshFavoriteDelegateProvider, @NotNull ComposerReferences references, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(onViewEvent, "onViewEvent");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tileUpdateCallback, "tileUpdateCallback");
        Intrinsics.checkNotNullParameter(tileRemoveCallback, "tileRemoveCallback");
        Intrinsics.checkNotNullParameter(freshFavoriteDelegateProvider, "freshFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onViewEvent = onViewEvent;
        this.onClickEvent = onClickEvent;
        this.actionHandler = actionHandler;
        this.tileUpdateCallback = tileUpdateCallback;
        this.tileRemoveCallback = tileRemoveCallback;
        this.freshFavoriteDelegateProvider = freshFavoriteDelegateProvider;
        this.references = references;
        this.differ = new C5470d<>(new u() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.CartTileItemAdapter$differ$1
            @Override // androidx.recyclerview.widget.u
            public void onChanged(int position, int count, Object payload) {
                CartTileItemAdapter.this.notifyItemRangeChanged(position, count, payload);
            }

            @Override // androidx.recyclerview.widget.u
            public void onInserted(int position, int count) {
                CartTileItemAdapter.this.notifyItemRangeInserted(position, count);
            }

            @Override // androidx.recyclerview.widget.u
            public void onMoved(int fromPosition, int toPosition) {
                CartTileItemAdapter.this.notifyItemMoved(fromPosition, toPosition);
            }

            @Override // androidx.recyclerview.widget.u
            public void onRemoved(int position, int count) {
                List items;
                items = CartTileItemAdapter.this.getItems();
                if (C7714v.P(items) == position) {
                    CartTileItemAdapter.this.notifyDataSetChanged();
                } else {
                    CartTileItemAdapter.this.notifyItemRangeRemoved(position, count);
                }
            }
        }, new C5469c.a(new CartTileItemDiffCallback()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeSwipeState(CartTileVO.TileItem item, CartTileVO.TileItem.SwipeTileState state) {
        ArrayList arrayList;
        if (state == CartTileVO.TileItem.SwipeTileState.Revealed) {
            List<CartTileVO.TileItem> items = getItems();
            arrayList = new ArrayList(C7714v.z(items, 10));
            for (CartTileVO.TileItem tileItem : items) {
                if (Intrinsics.d(CartTileVO.TileItem.copy$default(tileItem, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, item.getSwipeState(), null, false, 14680063, null), item)) {
                    tileItem = CartTileVO.TileItem.copy$default(tileItem, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, CartTileVO.TileItem.SwipeTileState.Revealed, null, false, 14680063, null);
                } else if (tileItem.getSwipeState() == CartTileVO.TileItem.SwipeTileState.Revealed) {
                    tileItem = CartTileVO.TileItem.copy$default(tileItem, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, CartTileVO.TileItem.SwipeTileState.Closed, null, false, 14680063, null);
                }
                arrayList.add(tileItem);
            }
        } else {
            List<CartTileVO.TileItem> items2 = getItems();
            arrayList = new ArrayList(C7714v.z(items2, 10));
            for (CartTileVO.TileItem tileItem2 : items2) {
                if (Intrinsics.d(CartTileVO.TileItem.copy$default(tileItem2, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, item.getSwipeState(), null, false, 14680063, null), item)) {
                    tileItem2 = CartTileVO.TileItem.copy$default(tileItem2, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, CartTileVO.TileItem.SwipeTileState.Closed, null, false, 14680063, null);
                }
                arrayList.add(tileItem2);
            }
        }
        if (Intrinsics.d(getItems(), arrayList)) {
            return;
        }
        this.tileUpdateCallback.invoke(arrayList);
        submitList$default(this, arrayList, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeRevealedTilesOnSwipeStart(CartTileVO.TileItem item) {
        List<CartTileVO.TileItem> items = getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (CartTileVO.TileItem tileItem : items) {
            if (tileItem.getSwipeState() == CartTileVO.TileItem.SwipeTileState.Revealed) {
                tileItem = !Intrinsics.d(CartTileVO.TileItem.copy$default(tileItem, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, item.getSwipeState(), null, false, 14680063, null), item) ? CartTileVO.TileItem.copy$default(tileItem, 0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, false, null, CartTileVO.TileItem.SwipeTileState.Closed, null, false, 14680063, null) : tileItem;
            }
            arrayList.add(tileItem);
        }
        if (Intrinsics.d(getItems(), arrayList)) {
            return;
        }
        this.tileUpdateCallback.invoke(arrayList);
        submitList$default(this, arrayList, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CartTileVO.TileItem> getItems() {
        List<CartTileVO.TileItem> b11 = this.differ.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getCurrentList(...)");
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSwipeDeleteItem(int pos, boolean isTap) {
        CartTileVO.TileItem tileItem = getItems().get(pos);
        List<CartTileVO.TileItem> items = getItems();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (i11 != pos) {
                arrayList.add(obj);
            }
            i11 = i12;
        }
        submitList(arrayList, new CartTileItemAdapter$onSwipeDeleteItem$2(tileItem, this, isTap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processDeleteAnalytics(CartTileVO.TileItem item, boolean isTap) {
        if (isTap) {
            t tapTokenizedEvent = item.getTapTokenizedEvent();
            if (tapTokenizedEvent != null) {
                this.onClickEvent.invoke(tapTokenizedEvent);
                return;
            }
            return;
        }
        t deleteTokenizedEvent = item.getDeleteTokenizedEvent();
        if (deleteTokenizedEvent != null) {
            this.onClickEvent.invoke(deleteTokenizedEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeItem(CartTileVO.TileItem item) {
        ArrayList W02 = C7714v.W0(getItems());
        W02.remove(item);
        submitList$default(this, W02, null, 2, null);
        this.tileRemoveCallback.invoke(item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(CartTileItemAdapter cartTileItemAdapter, List list, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = CartTileItemAdapter$submitList$1.INSTANCE;
        }
        cartTileItemAdapter.submitList(list, function0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return getItems().size();
    }

    public final void submitList(@NotNull List<CartTileVO.TileItem> list, @NotNull Function0<Unit> commitCallback) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(commitCallback, "commitCallback");
        this.differ.e(list, new b(commitCallback, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((CartTileItemViewHolder) c11, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CartTileItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SwipeTileLayout swipeTileLayout = new SwipeTileLayout(context, null, 0, 6, null);
        swipeTileLayout.setId(R$id.cartTileItemView);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SwipeTileLayout.setTileContent$default(swipeTileLayout, new CartTileItemView(context2, null, 0, 6, null), null, 2, null);
        swipeTileLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new CartTileItemViewHolder(swipeTileLayout, this.freshFavoriteDelegateProvider.invoke(), this.references);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CartTileItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getItems().get(position), this.onViewEvent, this.onClickEvent, this.actionHandler, new CartTileItemAdapter$onBindViewHolder$1(this), new CartTileItemAdapter$onBindViewHolder$2(this), new CartTileItemAdapter$onBindViewHolder$3(this), new CartTileItemAdapter$onBindViewHolder$4(this), new CartTileItemAdapter$onBindViewHolder$5(this, position));
    }

    public void onBindViewHolder(@NotNull CartTileItemViewHolder holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ArrayList arrayList = new ArrayList();
        for (Object obj : payloads) {
            if (obj instanceof SwipeStatePayload) {
                arrayList.add(obj);
            }
        }
        SwipeStatePayload swipeStatePayload = (SwipeStatePayload) C7714v.Z(arrayList);
        if (swipeStatePayload != null) {
            holder.bindSwipeState(swipeStatePayload.getState(), swipeStatePayload.getAnimate());
        } else {
            super.onBindViewHolder((CartTileItemAdapter) holder, position, (List<Object>) payloads);
        }
    }
}
