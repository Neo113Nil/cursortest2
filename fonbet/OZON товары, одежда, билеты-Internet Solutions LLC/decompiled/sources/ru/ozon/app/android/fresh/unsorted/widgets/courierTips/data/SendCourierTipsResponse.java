package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/data/SendCourierTipsResponse;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SendCourierTipsResponse {
    public static final int $stable = NotificationAtom.NotificationWithIcon.$stable;

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final NotificationAtom.NotificationWithIcon notification;

    public SendCourierTipsResponse(@NotNull AtomActionDTO action, @NotNull NotificationAtom.NotificationWithIcon notification) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.action = action;
        this.notification = notification;
    }

    public static /* synthetic */ SendCourierTipsResponse copy$default(SendCourierTipsResponse sendCourierTipsResponse, AtomActionDTO atomActionDTO, NotificationAtom.NotificationWithIcon notificationWithIcon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = sendCourierTipsResponse.action;
        }
        if ((i11 & 2) != 0) {
            notificationWithIcon = sendCourierTipsResponse.notification;
        }
        return sendCourierTipsResponse.copy(atomActionDTO, notificationWithIcon);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NotificationAtom.NotificationWithIcon getNotification() {
        return this.notification;
    }

    @NotNull
    public final SendCourierTipsResponse copy(@NotNull AtomActionDTO action, @NotNull NotificationAtom.NotificationWithIcon notification) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(notification, "notification");
        return new SendCourierTipsResponse(action, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendCourierTipsResponse)) {
            return false;
        }
        SendCourierTipsResponse sendCourierTipsResponse = (SendCourierTipsResponse) other;
        return Intrinsics.d(this.action, sendCourierTipsResponse.action) && Intrinsics.d(this.notification, sendCourierTipsResponse.notification);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final NotificationAtom.NotificationWithIcon getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return this.notification.hashCode() + (this.action.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SendCourierTipsResponse(action=" + this.action + ", notification=" + this.notification + ")";
    }
}
