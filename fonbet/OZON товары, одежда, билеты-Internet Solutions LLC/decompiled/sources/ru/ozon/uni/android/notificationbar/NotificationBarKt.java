package ru.ozon.uni.android.notificationbar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isAboveBottomWidgets", "", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBarKt {
    public static final boolean isAboveBottomWidgets(@NotNull NotificationModelWrapper notificationModelWrapper) {
        Intrinsics.checkNotNullParameter(notificationModelWrapper, "<this>");
        return !(notificationModelWrapper instanceof NotificationAtom) || ((NotificationAtom) notificationModelWrapper).getPosition() == NotificationAtom.Position.POSITION_ABOVE_BOTTOM_WIDGETS;
    }
}
