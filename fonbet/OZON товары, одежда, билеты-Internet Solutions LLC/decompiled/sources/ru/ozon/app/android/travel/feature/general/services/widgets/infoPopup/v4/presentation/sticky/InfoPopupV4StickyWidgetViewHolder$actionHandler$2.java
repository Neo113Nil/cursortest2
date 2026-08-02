package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InfoPopupV4StickyWidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ InfoPopupV4StickyWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfoPopupV4StickyWidgetViewHolder$actionHandler$2(InfoPopupV4StickyWidgetViewHolder infoPopupV4StickyWidgetViewHolder) {
        super(1);
        this.this$0 = infoPopupV4StickyWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        boolean z11;
        InfoPopupV4StickyViewModel infoPopupV4StickyViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.d(action.getId(), "checkSystemNotificationsAndSubscribe")) {
            infoPopupV4StickyViewModel = this.this$0.viewModel;
            infoPopupV4StickyViewModel.onTravelNotificationCheckAndSubscribeAction(action);
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
