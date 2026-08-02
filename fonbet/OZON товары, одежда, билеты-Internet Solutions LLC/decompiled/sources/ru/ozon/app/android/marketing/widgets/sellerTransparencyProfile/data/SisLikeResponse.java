package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SisLikeResponse;", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SisLikeResponse {
    public static final int $stable = 8;

    @NotNull
    private final NotificationModelWrapper notification;

    public SisLikeResponse(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @NotNull @ProtoOneOf(label = "type") NotificationModelWrapper notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.notification = notification;
    }

    public static /* synthetic */ SisLikeResponse copy$default(SisLikeResponse sisLikeResponse, NotificationModelWrapper notificationModelWrapper, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationModelWrapper = sisLikeResponse.notification;
        }
        return sisLikeResponse.copy(notificationModelWrapper);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    @NotNull
    public final SisLikeResponse copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @NotNull @ProtoOneOf(label = "type") NotificationModelWrapper notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        return new SisLikeResponse(notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SisLikeResponse) && Intrinsics.d(this.notification, ((SisLikeResponse) other).notification);
    }

    @NotNull
    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return this.notification.hashCode();
    }

    @NotNull
    public String toString() {
        return "SisLikeResponse(notification=" + this.notification + ")";
    }
}
