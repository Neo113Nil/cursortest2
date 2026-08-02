package ru.ozon.uni.atoms.data.notification;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOExceptionJsonAdapterKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\",\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "notificationValidations", "Ljava/util/List;", "getNotificationValidations", "()Ljava/util/List;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationDTOValidationsKt {

    @NotNull
    private static final List<Function1<NotificationDTO, Unit>> notificationValidations = AtomDTOExceptionJsonAdapterKt.validations(NotificationDTOValidationsKt$notificationValidations$1.INSTANCE);

    @NotNull
    public static final List<Function1<NotificationDTO, Unit>> getNotificationValidations() {
        return notificationValidations;
    }
}
