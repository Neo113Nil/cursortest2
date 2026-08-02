package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item;

import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemView;", "view", "<init>", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemView;)V", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "item", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onClickEvent", "actionHandler", "processReorderTileAction", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "quantity", "updateWithQuantity", "(Lru/ozon/uni/atoms/af/AtomAction;I)Lru/ozon/uni/atoms/af/AtomAction;", "onViewEvent", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemView;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReorderTileItemViewHolder extends RecyclerView.C {

    @NotNull
    private final ReorderTileItemView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemViewHolder$Companion;", "", "<init>", "()V", "QUANTITY_PLACEHOLDER", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderTileItemViewHolder(@NotNull ReorderTileItemView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processReorderTileAction(ReorderTileVO.TileItem item, AtomAction action, Function1<? super t, Unit> onClickEvent, Function1<? super AtomAction, Unit> actionHandler) {
        t tokenizedEvent$default;
        String id2 = action.getId();
        if (Intrinsics.d(id2, "postRefreshWithScroll")) {
            if ((item.getTileControl() instanceof ReorderTileVO.TileItem.TileControl.AvailableControl) && ((ReorderTileVO.TileItem.TileControl.AvailableControl) item.getTileControl()).getCartPicker() != null) {
                action = updateWithQuantity(action, ((ReorderTileVO.TileItem.TileControl.AvailableControl) item.getTileControl()).getCartPicker().getQuantity().getValue());
            }
        } else if (Intrinsics.d(id2, "removeCartItems") && (action instanceof AtomAction.Click)) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, TokenizedTrackingInfo> trackingInfo = click.getTrackingInfo();
            if (trackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getWidgetId()), null, 2, null)) != null) {
                onClickEvent.invoke(tokenizedEvent$default);
            }
            action = AtomAction.Click.copy$default(click, null, null, null, null, null, null, 47, null);
        }
        actionHandler.invoke(action);
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

    public final void bind(@NotNull ReorderTileVO.TileItem item, @NotNull Function1<? super t, Unit> onViewEvent, @NotNull Function1<? super t, Unit> onClickEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onViewEvent, "onViewEvent");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            onViewEvent.invoke(tokenizedEvent);
        }
        this.view.bind(item, onClickEvent, new ReorderTileItemViewHolder$bind$1(this, onClickEvent, actionHandler));
    }
}
