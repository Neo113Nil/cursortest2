package ru.ozon.app.android.widgets.commonTextWidget.cellList.presentation;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.actionHandlers.CopyAndDismissActionHandler;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.common.actionHandlers.SetBugReportActionHandler;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingActionHandler;
import ru.ozon.app.android.common.actionHandlers.setPublicProfile.SetPublicProfileStatusActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.InstantLoginActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.UserAuthBiometryActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.removePost.RemovePostActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class CellV2ViewHolder$actionHandler$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ CellV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellV2ViewHolder$actionHandler$1(CellV2ViewHolder cellV2ViewHolder) {
        super(0);
        this.this$0 = cellV2ViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        d dVar;
        dVar = this.this$0.customActionHandlersStoreFactory;
        return dVar.create(CopyTextActionHandler.class, CopyAndDismissActionHandler.class, ShareLinkActionHandler.class, ComposerActionAndRedirectActionHandler.class, RemovePostActionHandler.class, ApplySortingActionHandler.class, SetPublicProfileStatusActionHandler.class, InstantLoginActionHandler.class, UserAuthBiometryActionHandler.class, SetBugReportActionHandler.class);
    }
}
