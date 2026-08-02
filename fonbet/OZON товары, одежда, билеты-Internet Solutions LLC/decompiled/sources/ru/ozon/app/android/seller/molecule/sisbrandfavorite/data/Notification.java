package ru.ozon.app.android.seller.molecule.sisbrandfavorite.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/Notification;", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$Notification;", "notificationWithIcon", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationAtom$Notification;Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$Notification;", "getNotificationWithIcon", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Notification {
    private final NotificationAtom.Notification notification;
    private final NotificationDTO notificationBar;
    private final NotificationAtom.NotificationWithIcon notificationWithIcon;

    public Notification(NotificationAtom.Notification notification, NotificationAtom.NotificationWithIcon notificationWithIcon, NotificationDTO notificationDTO) {
        this.notification = notification;
        this.notificationWithIcon = notificationWithIcon;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ Notification copy$default(Notification notification, NotificationAtom.Notification notification2, NotificationAtom.NotificationWithIcon notificationWithIcon, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notification2 = notification.notification;
        }
        if ((i11 & 2) != 0) {
            notificationWithIcon = notification.notificationWithIcon;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = notification.notificationBar;
        }
        return notification.copy(notification2, notificationWithIcon, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationAtom.Notification getNotification() {
        return this.notification;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationAtom.NotificationWithIcon getNotificationWithIcon() {
        return this.notificationWithIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final Notification copy(NotificationAtom.Notification notification, NotificationAtom.NotificationWithIcon notificationWithIcon, NotificationDTO notificationBar) {
        return new Notification(notification, notificationWithIcon, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) other;
        return Intrinsics.d(this.notification, notification.notification) && Intrinsics.d(this.notificationWithIcon, notification.notificationWithIcon) && Intrinsics.d(this.notificationBar, notification.notificationBar);
    }

    public final NotificationAtom.Notification getNotification() {
        return this.notification;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final NotificationAtom.NotificationWithIcon getNotificationWithIcon() {
        return this.notificationWithIcon;
    }

    public int hashCode() {
        NotificationAtom.Notification notification = this.notification;
        int hashCode = (notification == null ? 0 : notification.hashCode()) * 31;
        NotificationAtom.NotificationWithIcon notificationWithIcon = this.notificationWithIcon;
        int hashCode2 = (hashCode + (notificationWithIcon == null ? 0 : notificationWithIcon.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Notification(notification=" + this.notification + ", notificationWithIcon=" + this.notificationWithIcon + ", notificationBar=" + this.notificationBar + ")";
    }
}
