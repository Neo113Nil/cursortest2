package ru.ozon.app.android.common.actionHandlers.mallFilter;

import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/mallFilter/MallFilterResponse;", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MallFilterResponse {

    @NotNull
    private final NotificationDTO notification;

    public MallFilterResponse(@NotNull NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.notification = notification;
    }

    public static /* synthetic */ MallFilterResponse copy$default(MallFilterResponse mallFilterResponse, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationDTO = mallFilterResponse.notification;
        }
        return mallFilterResponse.copy(notificationDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final MallFilterResponse copy(@NotNull NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        return new MallFilterResponse(notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MallFilterResponse) && Intrinsics.d(this.notification, ((MallFilterResponse) other).notification);
    }

    @NotNull
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return this.notification.hashCode();
    }

    @NotNull
    public String toString() {
        return a.e("MallFilterResponse(notification=", ")", this.notification);
    }
}
