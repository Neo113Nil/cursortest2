package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class VerificationEdoCheckingOperatorViewHolder$onAttachViewModel$1 extends C7719a implements Function2<NotificationDTO, d<? super Unit>, Object> {
    VerificationEdoCheckingOperatorViewHolder$onAttachViewModel$1(Object obj) {
        super(2, obj, VerificationEdoCheckingOperatorViewHolder.class, "showNotificationBar", "showNotificationBar(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationDTO notificationDTO, d<? super Unit> dVar) {
        Object onAttachViewModel$showNotificationBar;
        onAttachViewModel$showNotificationBar = VerificationEdoCheckingOperatorViewHolder.onAttachViewModel$showNotificationBar((VerificationEdoCheckingOperatorViewHolder) this.receiver, notificationDTO, dVar);
        return onAttachViewModel$showNotificationBar;
    }
}
