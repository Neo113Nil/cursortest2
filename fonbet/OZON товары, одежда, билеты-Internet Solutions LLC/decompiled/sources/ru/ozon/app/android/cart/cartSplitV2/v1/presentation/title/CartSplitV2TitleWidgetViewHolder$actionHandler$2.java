package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleWidgetViewHolder;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2TitleWidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ CartEventsController $cartEventsController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartSplitV2TitleWidgetViewHolder$actionHandler$2(CartEventsController cartEventsController) {
        super(1);
        this.$cartEventsController = cartEventsController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        CartSplitV2TitleWidgetViewHolder.Companion companion;
        Uri parse;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Move) {
            companion = CartSplitV2TitleWidgetViewHolder.Companion;
            String[] miniApps = companion.getMiniApps();
            String link = ((AtomAction.Move) it).getLink();
            if (C7705l.m(miniApps, (link == null || (parse = Uri.parse(link)) == null) ? null : parse.getAuthority())) {
                this.$cartEventsController.setEvent(CartRefreshReason.MinCheckAddMore.INSTANCE);
            }
        }
        return Boolean.FALSE;
    }
}
