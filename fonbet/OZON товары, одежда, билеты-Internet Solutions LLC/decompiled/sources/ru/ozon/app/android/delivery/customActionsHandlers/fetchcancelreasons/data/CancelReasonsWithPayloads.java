package ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data;

import B6.b;
import C.J;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsWithPayloads;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;", "cancelReasons", "", "", "trackingPayloads", "<init>", "(Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;", "getCancelReasons", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;", "Ljava/util/Map;", "getTrackingPayloads", "()Ljava/util/Map;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CancelReasonsWithPayloads implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CancelReasonsWithPayloads> CREATOR = new Creator();

    @NotNull
    private final CancelReasonsDTO cancelReasons;
    private final Map<String, String> trackingPayloads;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CancelReasonsWithPayloads> {
        @Override // android.os.Parcelable.Creator
        public final CancelReasonsWithPayloads createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CancelReasonsDTO createFromParcel = CancelReasonsDTO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.a(parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CancelReasonsWithPayloads(createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CancelReasonsWithPayloads[] newArray(int i11) {
            return new CancelReasonsWithPayloads[i11];
        }
    }

    public CancelReasonsWithPayloads(@NotNull CancelReasonsDTO cancelReasons, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(cancelReasons, "cancelReasons");
        this.cancelReasons = cancelReasons;
        this.trackingPayloads = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelReasonsWithPayloads)) {
            return false;
        }
        CancelReasonsWithPayloads cancelReasonsWithPayloads = (CancelReasonsWithPayloads) other;
        return Intrinsics.d(this.cancelReasons, cancelReasonsWithPayloads.cancelReasons) && Intrinsics.d(this.trackingPayloads, cancelReasonsWithPayloads.trackingPayloads);
    }

    @NotNull
    public final CancelReasonsDTO getCancelReasons() {
        return this.cancelReasons;
    }

    public final Map<String, String> getTrackingPayloads() {
        return this.trackingPayloads;
    }

    public int hashCode() {
        int hashCode = this.cancelReasons.hashCode() * 31;
        Map<String, String> map = this.trackingPayloads;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "CancelReasonsWithPayloads(cancelReasons=" + this.cancelReasons + ", trackingPayloads=" + this.trackingPayloads + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.cancelReasons.writeToParcel(dest, flags);
        Map<String, String> map = this.trackingPayloads;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
