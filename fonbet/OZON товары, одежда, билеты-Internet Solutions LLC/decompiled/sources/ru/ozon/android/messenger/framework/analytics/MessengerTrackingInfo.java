package ru.ozon.android.messenger.framework.analytics;

import C.J;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "Landroid/os/Parcelable;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "key", "pageTimestamp", "", "sliceKey", "nested", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getActionType", "()Ljava/lang/String;", "getKey", "getPageTimestamp", "()J", "getSliceKey", "getNested", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MessengerTrackingInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MessengerTrackingInfo> CREATOR = new a();

    @NotNull
    private final String actionType;

    @NotNull
    private final String key;
    private final List<MessengerTrackingInfo> nested;
    private final long pageTimestamp;
    private final String sliceKey;

    public static final class a implements Parcelable.Creator<MessengerTrackingInfo> {
        @Override // android.os.Parcelable.Creator
        public final MessengerTrackingInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Ak.b.b(MessengerTrackingInfo.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            return new MessengerTrackingInfo(readString, readString2, readLong, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessengerTrackingInfo[] newArray(int i11) {
            return new MessengerTrackingInfo[i11];
        }
    }

    public MessengerTrackingInfo(@NotNull String actionType, @NotNull String key, long j11, String str, List<MessengerTrackingInfo> list) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(key, "key");
        this.actionType = actionType;
        this.key = key;
        this.pageTimestamp = j11;
        this.sliceKey = str;
        this.nested = list;
    }

    public static /* synthetic */ MessengerTrackingInfo copy$default(MessengerTrackingInfo messengerTrackingInfo, String str, String str2, long j11, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messengerTrackingInfo.actionType;
        }
        if ((i11 & 2) != 0) {
            str2 = messengerTrackingInfo.key;
        }
        if ((i11 & 4) != 0) {
            j11 = messengerTrackingInfo.pageTimestamp;
        }
        if ((i11 & 8) != 0) {
            str3 = messengerTrackingInfo.sliceKey;
        }
        if ((i11 & 16) != 0) {
            list = messengerTrackingInfo.nested;
        }
        long j12 = j11;
        return messengerTrackingInfo.copy(str, str2, j12, str3, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPageTimestamp() {
        return this.pageTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSliceKey() {
        return this.sliceKey;
    }

    public final List<MessengerTrackingInfo> component5() {
        return this.nested;
    }

    @NotNull
    public final MessengerTrackingInfo copy(@NotNull String actionType, @NotNull String key, long pageTimestamp, String sliceKey, List<MessengerTrackingInfo> nested) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(key, "key");
        return new MessengerTrackingInfo(actionType, key, pageTimestamp, sliceKey, nested);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessengerTrackingInfo)) {
            return false;
        }
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) other;
        return Intrinsics.d(this.actionType, messengerTrackingInfo.actionType) && Intrinsics.d(this.key, messengerTrackingInfo.key) && this.pageTimestamp == messengerTrackingInfo.pageTimestamp && Intrinsics.d(this.sliceKey, messengerTrackingInfo.sliceKey) && Intrinsics.d(this.nested, messengerTrackingInfo.nested);
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final List<MessengerTrackingInfo> getNested() {
        return this.nested;
    }

    public final long getPageTimestamp() {
        return this.pageTimestamp;
    }

    public final String getSliceKey() {
        return this.sliceKey;
    }

    public int hashCode() {
        int a11 = Pk0.c.a(G.g.a(this.actionType.hashCode() * 31, 31, this.key), 31, this.pageTimestamp);
        String str = this.sliceKey;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<MessengerTrackingInfo> list = this.nested;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.actionType;
        String str2 = this.key;
        long j11 = this.pageTimestamp;
        String str3 = this.sliceKey;
        List<MessengerTrackingInfo> list = this.nested;
        StringBuilder d11 = C3660k.d("MessengerTrackingInfo(actionType=", str, ", key=", str2, ", pageTimestamp=");
        d11.append(j11);
        d11.append(", sliceKey=");
        d11.append(str3);
        return D3.h.c(d11, ", nested=", list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.actionType);
        dest.writeString(this.key);
        dest.writeLong(this.pageTimestamp);
        dest.writeString(this.sliceKey);
        List<MessengerTrackingInfo> list = this.nested;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator c11 = J.c(dest, 1, list);
        while (c11.hasNext()) {
            ((MessengerTrackingInfo) c11.next()).writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MessengerTrackingInfo(String str, String str2, long j11, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? System.currentTimeMillis() : j11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : list);
    }
}
