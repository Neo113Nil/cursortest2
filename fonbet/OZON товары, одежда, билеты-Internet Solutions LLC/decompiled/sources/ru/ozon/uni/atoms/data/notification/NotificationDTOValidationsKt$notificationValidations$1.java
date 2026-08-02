package ru.ozon.uni.atoms.data.notification;

import com.squareup.moshi.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class NotificationDTOValidationsKt$notificationValidations$1 extends AbstractC7737t implements Function1<NotificationDTO, Unit> {
    public static final NotificationDTOValidationsKt$notificationValidations$1 INSTANCE = new NotificationDTOValidationsKt$notificationValidations$1();

    NotificationDTOValidationsKt$notificationValidations$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationDTO notificationDTO) {
        invoke2(notificationDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationDTO validations) {
        Intrinsics.checkNotNullParameter(validations, "$this$validations");
        NotificationDTO.RightContent rightContent = validations.getRightContent();
        if ((rightContent != null ? rightContent.getButtonType() : null) == NotificationDTO.RightContent.ButtonType.BUTTON && validations.getRightContent().getButton() == null) {
            throw new k("buttonType has value 'BUTTON', but 'button' data is missing.");
        }
    }
}
