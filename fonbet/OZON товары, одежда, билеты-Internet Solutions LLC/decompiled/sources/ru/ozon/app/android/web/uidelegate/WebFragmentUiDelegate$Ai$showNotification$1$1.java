package ru.ozon.app.android.web.uidelegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebFragmentUiDelegate$Ai$showNotification$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ NotificationDTO $notificationDTO;
    final /* synthetic */ Function1<AtomActionDTO, Unit> $onNotificationClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WebFragmentUiDelegate$Ai$showNotification$1$1(NotificationDTO notificationDTO, Function1<? super AtomActionDTO, Unit> function1) {
        super(1);
        this.$notificationDTO = notificationDTO;
        this.$onNotificationClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        CommonControlSettings common;
        AtomActionDTO action2;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.ViewAction) || (common = this.$notificationDTO.getCommon()) == null || (action2 = common.getAction()) == null) {
            return;
        }
        this.$onNotificationClick.invoke(action2);
    }
}
