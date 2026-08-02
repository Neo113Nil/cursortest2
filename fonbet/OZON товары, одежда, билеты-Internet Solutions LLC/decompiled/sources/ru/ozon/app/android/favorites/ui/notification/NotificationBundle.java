package ru.ozon.app.android.favorites.ui.notification;

import B6.b;
import C.J;
import De.C2860c;
import W10.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/favorites/ui/notification/NotificationBundle;", "Landroid/os/Parcelable;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "payloads", "", "widgetId", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;Ljava/lang/Long;LW10/c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "LW10/c;", "getTrackingData", "()LW10/c;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationBundle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationBundle> CREATOR = new Creator();

    @NotNull
    private final NotificationModelWrapper notification;
    private final Map<String, String> payloads;

    @NotNull
    private final c trackingData;
    private final Long widgetId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationBundle> {
        @Override // android.os.Parcelable.Creator
        public final NotificationBundle createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            NotificationModelWrapper notificationModelWrapper = (NotificationModelWrapper) parcel.readParcelable(NotificationBundle.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new NotificationBundle(notificationModelWrapper, linkedHashMap, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (c) parcel.readParcelable(NotificationBundle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationBundle[] newArray(int i11) {
            return new NotificationBundle[i11];
        }
    }

    public NotificationBundle(@NotNull NotificationModelWrapper notification, Map<String, String> map, Long l11, @NotNull c trackingData) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.notification = notification;
        this.payloads = map;
        this.widgetId = l11;
        this.trackingData = trackingData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationBundle)) {
            return false;
        }
        NotificationBundle notificationBundle = (NotificationBundle) other;
        return Intrinsics.d(this.notification, notificationBundle.notification) && Intrinsics.d(this.payloads, notificationBundle.payloads) && Intrinsics.d(this.widgetId, notificationBundle.widgetId) && Intrinsics.d(this.trackingData, notificationBundle.trackingData);
    }

    @NotNull
    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    public final Map<String, String> getPayloads() {
        return this.payloads;
    }

    @NotNull
    public final c getTrackingData() {
        return this.trackingData;
    }

    public final Long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.notification.hashCode() * 31;
        Map<String, String> map = this.payloads;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Long l11 = this.widgetId;
        return this.trackingData.hashCode() + ((hashCode2 + (l11 != null ? l11.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "NotificationBundle(notification=" + this.notification + ", payloads=" + this.payloads + ", widgetId=" + this.widgetId + ", trackingData=" + this.trackingData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.notification, flags);
        Map<String, String> map = this.payloads;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        Long l11 = this.widgetId;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l11);
        }
        dest.writeParcelable(this.trackingData, flags);
    }
}
