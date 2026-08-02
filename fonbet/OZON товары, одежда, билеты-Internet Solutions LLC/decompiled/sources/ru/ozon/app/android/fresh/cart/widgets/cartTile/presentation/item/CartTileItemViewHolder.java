package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import WZ.t;
import androidx.lifecycle.B;
import androidx.lifecycle.K;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 B2\u00020\u0001:\u0001BB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJK\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\n0\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u001b\u0010 \u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJÉ\u0001\u0010,\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010$\u001a\u0012\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\n0\u00132\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\n0\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00132\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\n0%2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\n0%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u00132\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\n2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020&¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/SwipeTileLayout;", "view", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "favoriteDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/SwipeTileLayout;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "recycle", "()V", "attachDelegate", "detachDelegate", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "item", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onClickEvent", "actionHandler", "processCartTileAction", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "localDeleteItem", "removeItemOnTimer", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lkotlin/jvm/functions/Function1;)V", "resetJobs", "", "quantity", "updateWithQuantity", "(Lru/ozon/uni/atoms/af/AtomAction;I)Lru/ozon/uni/atoms/af/AtomAction;", "onAttach", "onRecycle", "onViewEvent", "Lkotlin/Function2;", "", "onDelete", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "onStateChanged", "onClosedTileSwipeStarted", "tileUpdateCallback", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "state", "animate", "bindSwipeState", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;Z)V", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/SwipeTileLayout;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lxe/B0;", "removeJob", "Lxe/B0;", "refreshJob", "Landroidx/lifecycle/B;", "getContainerLifecycleScope", "()Landroidx/lifecycle/B;", "containerLifecycleScope", "LAe/h;", "LA00/a;", "getEventFlow", "()LAe/h;", "eventFlow", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileItemViewHolder extends j {

    @NotNull
    private final FreshFavoriteDelegate favoriteDelegate;

    @NotNull
    private final ComposerReferences references;
    private B0 refreshJob;
    private B0 removeJob;

    @NotNull
    private final SwipeTileLayout view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemViewHolder$Companion;", "", "<init>", "()V", "QUANTITY_PLACEHOLDER", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartTileItemViewHolder(@NotNull SwipeTileLayout view, @NotNull FreshFavoriteDelegate favoriteDelegate, @NotNull ComposerReferences references) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(favoriteDelegate, "favoriteDelegate");
        Intrinsics.checkNotNullParameter(references, "references");
        this.view = view;
        this.favoriteDelegate = favoriteDelegate;
        this.references = references;
    }

    private final void attachDelegate() {
        this.favoriteDelegate.onAttach(getLifecycle(), new CartTileItemViewHolder$attachDelegate$1(this), new CartTileItemViewHolder$attachDelegate$2(this), new CartTileItemViewHolder$attachDelegate$3(this));
    }

    private final void detachDelegate() {
        this.favoriteDelegate.onDetach();
    }

    private final B getContainerLifecycleScope() {
        return K.a(this.references.getContainer().g());
    }

    private final InterfaceC2395h<a> getEventFlow() {
        return this.references.getController().getEventsFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCartTileAction(CartTileVO.TileItem item, AtomAction action, Function1<? super t, Unit> onClickEvent, Function1<? super AtomAction, Unit> actionHandler) {
        t mapToTokenizedEvent$default;
        String id2 = action.getId();
        if (Intrinsics.d(id2, "postRefreshWithScroll")) {
            if (item.getTileControl() instanceof CartTileVO.TileItem.TileControl.AvailableControl) {
                action = updateWithQuantity(action, ((CartTileVO.TileItem.TileControl.AvailableControl) item.getTileControl()).getCartPicker().getQuantity().getValue());
            }
        } else if (Intrinsics.d(id2, "removeCartItems") && (action instanceof AtomAction.Click)) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, TokenizedTrackingInfo> trackingInfo = click.getTrackingInfo();
            if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getWidgetId()), null, 2, null)) != null) {
                onClickEvent.invoke(mapToTokenizedEvent$default);
            }
            action = AtomAction.Click.copy$default(click, null, null, null, null, null, null, 47, null);
        }
        actionHandler.invoke(action);
    }

    private final void recycle() {
        SwipeTileLayout swipeTileLayout = this.view;
        swipeTileLayout.cancelSwipeAnimation();
        swipeTileLayout.setOnStateChanged(null);
        swipeTileLayout.setOnDeleteRequested(null);
        swipeTileLayout.setOnSwipeStartedFromClosed(null);
        this.favoriteDelegate.setState(null, null);
        swipeTileLayout.renderState(CartTileVO.TileItem.SwipeTileState.Closed, false);
    }

    private final void removeItemOnTimer(CartTileVO.TileItem item, Function1<? super CartTileVO.TileItem, Unit> localDeleteItem) {
        resetJobs();
        this.removeJob = C10727i.c(getContainerLifecycleScope(), null, null, new CartTileItemViewHolder$removeItemOnTimer$1(item, localDeleteItem, this, null), 3);
        this.refreshJob = C2399j.C(new C2408n0(getEventFlow(), new CartTileItemViewHolder$removeItemOnTimer$2(this, null)), getContainerLifecycleScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetJobs() {
        B0 b02 = this.removeJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.refreshJob;
        if (b03 != null) {
            b03.j(null);
        }
    }

    private final AtomAction updateWithQuantity(AtomAction atomAction, int i11) {
        LinkedHashMap linkedHashMap;
        if (!(atomAction instanceof AtomAction.Click)) {
            return atomAction;
        }
        AtomAction.Click click = (AtomAction.Click) atomAction;
        Map<String, String> params = click.getParams();
        if (params != null) {
            linkedHashMap = new LinkedHashMap(U.h(params.size()));
            Iterator<T> it = params.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), h.X((String) entry.getValue(), "{qty}", String.valueOf(i11), false));
            }
        } else {
            linkedHashMap = null;
        }
        return AtomAction.Click.copy$default(click, null, null, null, linkedHashMap, null, null, 55, null);
    }

    public final void bind(@NotNull CartTileVO.TileItem item, @NotNull Function1<? super t, Unit> onViewEvent, @NotNull Function1<? super t, Unit> onClickEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super Integer, ? super Boolean, Unit> onDelete, @NotNull Function2<? super CartTileVO.TileItem, ? super CartTileVO.TileItem.SwipeTileState, Unit> onStateChanged, @NotNull Function1<? super CartTileVO.TileItem, Unit> onClosedTileSwipeStarted, @NotNull Function1<? super CartTileVO.TileItem, Unit> localDeleteItem, @NotNull Function1<? super CartTileVO.TileItem, Unit> tileUpdateCallback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onViewEvent, "onViewEvent");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        Intrinsics.checkNotNullParameter(onClosedTileSwipeStarted, "onClosedTileSwipeStarted");
        Intrinsics.checkNotNullParameter(localDeleteItem, "localDeleteItem");
        Intrinsics.checkNotNullParameter(tileUpdateCallback, "tileUpdateCallback");
        attachDelegate();
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            onViewEvent.invoke(tokenizedEvent);
        }
        this.view.cancelSwipeAnimation();
        this.view.setOnStateChanged(null);
        this.view.setOnDeleteRequested(null);
        this.view.setOnButtonsRevealed(null);
        this.view.setOnSwipeStartedFromClosed(null);
        SwipeTileLayout swipeTileLayout = this.view;
        CartTileVO.TileItem.FavoriteButton favoriteButton = item.getFavoriteButton();
        String icon = favoriteButton != null ? favoriteButton.getIcon() : null;
        CartTileVO.TileItem.FavoriteButton favoriteButton2 = item.getFavoriteButton();
        String selectedIconColor = favoriteButton2 != null ? favoriteButton2.getSelectedIconColor() : null;
        CartTileVO.TileItem.FavoriteButton favoriteButton3 = item.getFavoriteButton();
        swipeTileLayout.setupIcon(icon, selectedIconColor, favoriteButton3 != null ? favoriteButton3.getUnselectedIconColor() : null);
        FreshFavoriteDelegate freshFavoriteDelegate = this.favoriteDelegate;
        CartTileVO.TileItem.FavoriteButton favoriteButton4 = item.getFavoriteButton();
        FreshFavoriteDelegate.setState$default(freshFavoriteDelegate, favoriteButton4 != null ? favoriteButton4.getFavoriteState() : null, null, 2, null);
        this.view.renderState(item.getSwipeState(), false);
        this.view.bind(item, onClickEvent, new CartTileItemViewHolder$bind$1(this, onClickEvent, actionHandler), new CartTileItemViewHolder$bind$2(item, tileUpdateCallback));
        this.view.setOnStateChanged(new CartTileItemViewHolder$bind$3(onStateChanged, item));
        this.view.setOnDeleteRequested(new CartTileItemViewHolder$bind$4(onDelete, this));
        this.view.setOnButtonsRevealed(new CartTileItemViewHolder$bind$5(item, onViewEvent));
        this.view.setOnSwipeStartedFromClosed(new CartTileItemViewHolder$bind$6(onClosedTileSwipeStarted, item));
        if (item.getTimer() != null) {
            removeItemOnTimer(item, localDeleteItem);
        }
    }

    public final void bindSwipeState(@NotNull CartTileVO.TileItem.SwipeTileState state, boolean animate) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.view.renderState(state, animate);
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        attachDelegate();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        recycle();
        detachDelegate();
    }
}
