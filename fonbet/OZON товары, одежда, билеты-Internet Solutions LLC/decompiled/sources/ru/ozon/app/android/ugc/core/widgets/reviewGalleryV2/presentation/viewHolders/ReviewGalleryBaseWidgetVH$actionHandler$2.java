package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.SubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.UnsubscribeAuthorActionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterLikeActionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler.CommentModalActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewGalleryBaseWidgetVH$actionHandler$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ d $customActionHandlersStoreFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewGalleryBaseWidgetVH$actionHandler$2(d dVar) {
        super(0);
        this.$customActionHandlersStoreFactory = dVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return this.$customActionHandlersStoreFactory.create(ShareLinkActionHandler.class, SubscribeAuthorActionHandler.class, UnsubscribeAuthorActionHandler.class, CommentModalActionHandler.class, ActionsFooterLikeActionHandler.class);
    }
}
