package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV2ViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ TotalStickyV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV2ViewHolder$actionHandler$2(TotalStickyV2ViewHolder totalStickyV2ViewHolder) {
        super(1);
        this.this$0 = totalStickyV2ViewHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (kotlin.text.h.K(r2) == false) goto L23;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(AtomAction action) {
        String link;
        CartEventsController cartEventsController;
        Uri parse;
        ReferrerValueController referrerValueController;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        AtomAction.Move move = action instanceof AtomAction.Move ? (AtomAction.Move) action : null;
        if (move == null || (link = move.getLink()) == null) {
            AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
            link = click != null ? click.getLink() : null;
        }
        if (link != null) {
            TotalStickyV2ViewHolder totalStickyV2ViewHolder = this.this$0;
            if (!h.K(link)) {
                str2 = totalStickyV2ViewHolder.currentPageUrl;
            }
            link = null;
            if (link != null && (parse = Uri.parse(link)) != null && parse.getHost() != null) {
                TotalStickyV2ViewHolder totalStickyV2ViewHolder2 = this.this$0;
                referrerValueController = totalStickyV2ViewHolder2.referrerValueController;
                str = totalStickyV2ViewHolder2.currentPageUrl;
                referrerValueController.setCurrentPageReferrer(str);
            }
        }
        AtomAction.Click click2 = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
        if (Intrinsics.d(click2 != null ? click2.getId() : null, "shareLink")) {
            cartEventsController = this.this$0.cartEventController;
            cartEventsController.handleEvent(CartRefreshReason.CartShared.INSTANCE);
        }
        return Boolean.FALSE;
    }
}
