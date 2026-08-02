package ru.ozon.android.networkinfo.models;

import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000ej\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0015"}, d2 = {"Lru/ozon/android/networkinfo/models/NetworkConnectionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTION_TYPE_UNKNOWN", "CELLULAR_SLOW_2G", "CELLULAR_2G", "CELLULAR_3G", "CELLULAR_4G", "CELLULAR_5G", "CELLULAR_UNSPECIFIED", "WIFI", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkConnectionType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NetworkConnectionType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<NetworkConnectionType> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Map<String, NetworkConnectionType> lookupMap;
    public static final NetworkConnectionType CONNECTION_TYPE_UNKNOWN = new NetworkConnectionType("CONNECTION_TYPE_UNKNOWN", 0);
    public static final NetworkConnectionType CELLULAR_SLOW_2G = new NetworkConnectionType("CELLULAR_SLOW_2G", 1);
    public static final NetworkConnectionType CELLULAR_2G = new NetworkConnectionType("CELLULAR_2G", 2);
    public static final NetworkConnectionType CELLULAR_3G = new NetworkConnectionType("CELLULAR_3G", 3);
    public static final NetworkConnectionType CELLULAR_4G = new NetworkConnectionType("CELLULAR_4G", 4);
    public static final NetworkConnectionType CELLULAR_5G = new NetworkConnectionType("CELLULAR_5G", 5);
    public static final NetworkConnectionType CELLULAR_UNSPECIFIED = new NetworkConnectionType("CELLULAR_UNSPECIFIED", 6);
    public static final NetworkConnectionType WIFI = new NetworkConnectionType("WIFI", 7);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/android/networkinfo/models/NetworkConnectionType$Companion;", "", "<init>", "()V", "lookupMap", "", "", "Lru/ozon/android/networkinfo/models/NetworkConnectionType;", "from", "type", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkConnectionType from(String type) {
            NetworkConnectionType networkConnectionType = (NetworkConnectionType) NetworkConnectionType.lookupMap.get(type);
            return networkConnectionType == null ? NetworkConnectionType.CONNECTION_TYPE_UNKNOWN : networkConnectionType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ NetworkConnectionType[] $values() {
        return new NetworkConnectionType[]{CONNECTION_TYPE_UNKNOWN, CELLULAR_SLOW_2G, CELLULAR_2G, CELLULAR_3G, CELLULAR_4G, CELLULAR_5G, CELLULAR_UNSPECIFIED, WIFI};
    }

    static {
        NetworkConnectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<NetworkConnectionType>() { // from class: ru.ozon.android.networkinfo.models.NetworkConnectionType.Creator
            @Override // android.os.Parcelable.Creator
            public final NetworkConnectionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return NetworkConnectionType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NetworkConnectionType[] newArray(int i11) {
                return new NetworkConnectionType[i11];
            }
        };
        NetworkConnectionType[] values = values();
        int h11 = U.h(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (NetworkConnectionType networkConnectionType : values) {
            linkedHashMap.put(networkConnectionType.name(), networkConnectionType);
        }
        lookupMap = linkedHashMap;
    }

    private NetworkConnectionType(String str, int i11) {
    }

    @NotNull
    public static a<NetworkConnectionType> getEntries() {
        return $ENTRIES;
    }

    public static NetworkConnectionType valueOf(String str) {
        return (NetworkConnectionType) Enum.valueOf(NetworkConnectionType.class, str);
    }

    public static NetworkConnectionType[] values() {
        return (NetworkConnectionType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
