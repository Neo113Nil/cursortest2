package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.travel.actionhandler.callAction.TravelCallActionHandler;
import ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class InfoPopupV4StickyWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ d $customActionHandlersStoreFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoPopupV4StickyWidgetViewHolder$actionHandler$1(d dVar) {
        super(0);
        this.$customActionHandlersStoreFactory = dVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return this.$customActionHandlersStoreFactory.create(TravelResultActionV2Handler.class, TravelCallActionHandler.class, ShareLinkActionHandler.class, CopyTextActionHandler.class, SwitchNotificationActionHandler.class);
    }
}
