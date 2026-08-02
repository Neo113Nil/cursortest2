package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionV2Response;", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteActionV2Response {
    private final NotificationModelWrapper notification;

    public FavoriteActionV2Response(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @ProtoOneOf(label = "type") NotificationModelWrapper notificationModelWrapper) {
        this.notification = notificationModelWrapper;
    }

    public static /* synthetic */ FavoriteActionV2Response copy$default(FavoriteActionV2Response favoriteActionV2Response, NotificationModelWrapper notificationModelWrapper, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationModelWrapper = favoriteActionV2Response.notification;
        }
        return favoriteActionV2Response.copy(notificationModelWrapper);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    @NotNull
    public final FavoriteActionV2Response copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @ProtoOneOf(label = "type") NotificationModelWrapper notification) {
        return new FavoriteActionV2Response(notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FavoriteActionV2Response) && Intrinsics.d(this.notification, ((FavoriteActionV2Response) other).notification);
    }

    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    public int hashCode() {
        NotificationModelWrapper notificationModelWrapper = this.notification;
        if (notificationModelWrapper == null) {
            return 0;
        }
        return notificationModelWrapper.hashCode();
    }

    @NotNull
    public String toString() {
        return "FavoriteActionV2Response(notification=" + this.notification + ")";
    }
}
