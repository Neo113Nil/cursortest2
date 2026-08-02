package ru.ozon.app.android.commonwidgets.widgets.iconButton.presentation;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger.ShareLinkBloggerActionHandler;
import ru.ozon.app.android.cart.ui.customActionHandler.navigateToCartAndRefresh.NavigateToCartAndRefreshActionHandler;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareSellerLink.ShareSellerLinkActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.CloseFlowActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.CloseMiniappActionHandler;
import ru.ozon.app.android.storefront.actionHandlers.PopAndRedirectActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class IconButtonWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ IconButtonWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconButtonWidgetViewHolder$actionHandler$1(IconButtonWidgetViewHolder iconButtonWidgetViewHolder) {
        super(0);
        this.this$0 = iconButtonWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        d dVar;
        dVar = this.this$0.customActionHandlersStoreFactory;
        return dVar.create(CloseMiniappActionHandler.class, ShareLinkActionHandler.class, ShareLinkBloggerActionHandler.class, ShareSellerLinkActionHandler.class, ComposerActionWithActionHandler.class, ComposerActionAndRedirectActionHandler.class, PopAndRedirectActionHandler.class, CopyTextActionHandler.class, NavigateToCartAndRefreshActionHandler.class, CloseFlowActionHandler.class);
    }
}
