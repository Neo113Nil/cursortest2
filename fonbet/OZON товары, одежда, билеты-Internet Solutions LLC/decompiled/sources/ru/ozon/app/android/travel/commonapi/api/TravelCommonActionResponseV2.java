package ru.ozon.app.android.travel.commonapi.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResponseV2;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "commonapi_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelCommonActionResponseV2 {

    @NotNull
    private final AtomActionDTO action;
    private final NotificationDTO notification;

    public TravelCommonActionResponseV2(@NotNull AtomActionDTO action, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.notification = notificationDTO;
    }

    public static /* synthetic */ TravelCommonActionResponseV2 copy$default(TravelCommonActionResponseV2 travelCommonActionResponseV2, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = travelCommonActionResponseV2.action;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = travelCommonActionResponseV2.notification;
        }
        return travelCommonActionResponseV2.copy(atomActionDTO, notificationDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final TravelCommonActionResponseV2 copy(@NotNull AtomActionDTO action, NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new TravelCommonActionResponseV2(action, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCommonActionResponseV2)) {
            return false;
        }
        TravelCommonActionResponseV2 travelCommonActionResponseV2 = (TravelCommonActionResponseV2) other;
        return Intrinsics.d(this.action, travelCommonActionResponseV2.action) && Intrinsics.d(this.notification, travelCommonActionResponseV2.notification);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        NotificationDTO notificationDTO = this.notification;
        return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TravelCommonActionResponseV2(action=" + this.action + ", notification=" + this.notification + ")";
    }
}
