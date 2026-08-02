package ru.ozon.android.networkinfo.models;

import Sc.InterfaceC3999a;
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
@InterfaceC3999a
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/android/networkinfo/models/ConnectionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTION_TYPE_UNKNOWN", "CELLULAR_SLOW_2G", "CELLULAR_2G", "CELLULAR_3G", "CELLULAR_4G", "WIFI", "NO_INTERNET", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectionType implements Parcelable {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConnectionType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ConnectionType> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Map<String, ConnectionType> lookupMap;
    public static final ConnectionType CONNECTION_TYPE_UNKNOWN = new ConnectionType("CONNECTION_TYPE_UNKNOWN", 0);
    public static final ConnectionType CELLULAR_SLOW_2G = new ConnectionType("CELLULAR_SLOW_2G", 1);
    public static final ConnectionType CELLULAR_2G = new ConnectionType("CELLULAR_2G", 2);
    public static final ConnectionType CELLULAR_3G = new ConnectionType("CELLULAR_3G", 3);
    public static final ConnectionType CELLULAR_4G = new ConnectionType("CELLULAR_4G", 4);
    public static final ConnectionType WIFI = new ConnectionType("WIFI", 5);
    public static final ConnectionType NO_INTERNET = new ConnectionType("NO_INTERNET", 6);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/android/networkinfo/models/ConnectionType$Companion;", "", "<init>", "()V", "lookupMap", "", "", "Lru/ozon/android/networkinfo/models/ConnectionType;", "from", "type", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConnectionType from(String type) {
            ConnectionType connectionType = (ConnectionType) ConnectionType.lookupMap.get(type);
            return connectionType == null ? ConnectionType.CONNECTION_TYPE_UNKNOWN : connectionType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ConnectionType[] $values() {
        return new ConnectionType[]{CONNECTION_TYPE_UNKNOWN, CELLULAR_SLOW_2G, CELLULAR_2G, CELLULAR_3G, CELLULAR_4G, WIFI, NO_INTERNET};
    }

    static {
        ConnectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<ConnectionType>() { // from class: ru.ozon.android.networkinfo.models.ConnectionType.Creator
            @Override // android.os.Parcelable.Creator
            public final ConnectionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ConnectionType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ConnectionType[] newArray(int i11) {
                return new ConnectionType[i11];
            }
        };
        ConnectionType[] values = values();
        int h11 = U.h(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (ConnectionType connectionType : values) {
            linkedHashMap.put(connectionType.name(), connectionType);
        }
        lookupMap = linkedHashMap;
    }

    private ConnectionType(String str, int i11) {
    }

    @NotNull
    public static a<ConnectionType> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionType valueOf(String str) {
        return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
    }

    public static ConnectionType[] values() {
        return (ConnectionType[]) $VALUES.clone();
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
