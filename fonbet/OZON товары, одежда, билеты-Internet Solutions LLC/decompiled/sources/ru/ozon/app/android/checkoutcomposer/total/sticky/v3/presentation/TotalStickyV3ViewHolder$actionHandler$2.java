package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV3ViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ TotalStickyV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV3ViewHolder$actionHandler$2(TotalStickyV3ViewHolder totalStickyV3ViewHolder) {
        super(1);
        this.this$0 = totalStickyV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        String link;
        Uri parse;
        ReferrerValueController referrerValueController;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        String str3 = null;
        AtomAction.Move move = action instanceof AtomAction.Move ? (AtomAction.Move) action : null;
        if (move == null || (link = move.getLink()) == null) {
            AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
            link = click != null ? click.getLink() : null;
        }
        if (link != null) {
            TotalStickyV3ViewHolder totalStickyV3ViewHolder = this.this$0;
            if (!h.K(link)) {
                str2 = totalStickyV3ViewHolder.currentPageUrl;
                if (!h.K(str2)) {
                    str3 = link;
                }
            }
            if (str3 != null && (parse = Uri.parse(str3)) != null && parse.getHost() != null) {
                TotalStickyV3ViewHolder totalStickyV3ViewHolder2 = this.this$0;
                referrerValueController = totalStickyV3ViewHolder2.referrerValueController;
                str = totalStickyV3ViewHolder2.currentPageUrl;
                referrerValueController.setCurrentPageReferrer(str);
            }
        }
        return Boolean.FALSE;
    }
}
