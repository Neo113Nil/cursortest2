package ru.ozon.app.android.seller.molecule.sisbrandfavorite.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\fJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteResponse;", "", "notification", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/Notification;", "isError", "", "<init>", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/Notification;Ljava/lang/Boolean;)V", "getNotification", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/Notification;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "component1", "component2", "copy", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/Notification;Ljava/lang/Boolean;)Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteResponse;", "equals", "other", "hashCode", "", "toString", "", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SisBrandFavoriteResponse {
    private final Boolean isError;
    private final Notification notification;

    public SisBrandFavoriteResponse(Notification notification, Boolean bool) {
        this.notification = notification;
        this.isError = bool;
    }

    public static /* synthetic */ SisBrandFavoriteResponse copy$default(SisBrandFavoriteResponse sisBrandFavoriteResponse, Notification notification, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notification = sisBrandFavoriteResponse.notification;
        }
        if ((i11 & 2) != 0) {
            bool = sisBrandFavoriteResponse.isError;
        }
        return sisBrandFavoriteResponse.copy(notification, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Notification getNotification() {
        return this.notification;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsError() {
        return this.isError;
    }

    @NotNull
    public final SisBrandFavoriteResponse copy(Notification notification, Boolean isError) {
        return new SisBrandFavoriteResponse(notification, isError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SisBrandFavoriteResponse)) {
            return false;
        }
        SisBrandFavoriteResponse sisBrandFavoriteResponse = (SisBrandFavoriteResponse) other;
        return Intrinsics.d(this.notification, sisBrandFavoriteResponse.notification) && Intrinsics.d(this.isError, sisBrandFavoriteResponse.isError);
    }

    public final Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        Notification notification = this.notification;
        int hashCode = (notification == null ? 0 : notification.hashCode()) * 31;
        Boolean bool = this.isError;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        return "SisBrandFavoriteResponse(notification=" + this.notification + ", isError=" + this.isError + ")";
    }

    /* renamed from: getNotification, reason: collision with other method in class */
    public final NotificationModelWrapper m995getNotification() {
        Notification notification = this.notification;
        if (notification == null) {
            return null;
        }
        NotificationAtom.Notification notification2 = notification.getNotification();
        if (notification2 != null) {
            return notification2;
        }
        NotificationAtom.NotificationWithIcon notificationWithIcon = notification.getNotificationWithIcon();
        return notificationWithIcon != null ? notificationWithIcon : notification.getNotificationBar();
    }
}
