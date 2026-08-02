package ru.ozon.app.android.cart.totalV3.presentation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.network.referrer.ReferrerValueController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ TotalViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalViewHolder$actionHandler$1(TotalViewHolder totalViewHolder) {
        super(1);
        this.this$0 = totalViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        String str;
        Uri parse;
        ReferrerValueController referrerValueController;
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        str = this.this$0.referer;
        if (str != null) {
            TotalViewHolder totalViewHolder = this.this$0;
            String str2 = null;
            AtomAction.Move move = action instanceof AtomAction.Move ? (AtomAction.Move) action : null;
            if (move == null || (link = move.getLink()) == null) {
                AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
                if (click != null) {
                    str2 = click.getLink();
                }
            } else {
                str2 = link;
            }
            if (str2 != null && (parse = Uri.parse(str2)) != null && parse.getHost() != null) {
                referrerValueController = totalViewHolder.referrerValueController;
                referrerValueController.setCurrentPageReferrer(str);
            }
        }
        return Boolean.FALSE;
    }
}
