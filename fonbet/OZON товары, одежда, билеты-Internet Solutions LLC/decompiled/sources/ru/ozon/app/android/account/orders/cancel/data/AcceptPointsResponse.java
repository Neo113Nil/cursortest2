package ru.ozon.app.android.account.orders.cancel.data;

import Nh.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/data/AcceptPointsResponse;", "Landroid/os/Parcelable;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AcceptPointsResponse implements Parcelable {
    public static final int $stable = NotificationDTO.$stable;

    @NotNull
    public static final Parcelable.Creator<AcceptPointsResponse> CREATOR = new Creator();
    private final NotificationDTO notification;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AcceptPointsResponse> {
        @Override // android.os.Parcelable.Creator
        public final AcceptPointsResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcceptPointsResponse((NotificationDTO) parcel.readParcelable(AcceptPointsResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AcceptPointsResponse[] newArray(int i11) {
            return new AcceptPointsResponse[i11];
        }
    }

    public AcceptPointsResponse(NotificationDTO notificationDTO) {
        this.notification = notificationDTO;
    }

    public static /* synthetic */ AcceptPointsResponse copy$default(AcceptPointsResponse acceptPointsResponse, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationDTO = acceptPointsResponse.notification;
        }
        return acceptPointsResponse.copy(notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final AcceptPointsResponse copy(NotificationDTO notification) {
        return new AcceptPointsResponse(notification);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AcceptPointsResponse) && Intrinsics.d(this.notification, ((AcceptPointsResponse) other).notification);
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        NotificationDTO notificationDTO = this.notification;
        if (notificationDTO == null) {
            return 0;
        }
        return notificationDTO.hashCode();
    }

    @NotNull
    public String toString() {
        return a.e("AcceptPointsResponse(notification=", ")", this.notification);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.notification, flags);
    }
}
