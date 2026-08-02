package com.blaze.blazesdk.analytics.enums;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.ironsource.Q3;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/blaze/blazesdk/analytics/enums/ConnectionType;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WIRED", "WIRELESS", "CELLULAR", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConnectionType implements Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ConnectionType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ConnectionType> CREATOR;

    @NotNull
    private final String value;
    public static final ConnectionType WIRED = new ConnectionType("WIRED", 0, "wired");
    public static final ConnectionType WIRELESS = new ConnectionType("WIRELESS", 1, "wireless");
    public static final ConnectionType CELLULAR = new ConnectionType("CELLULAR", 2, Q3.g);

    private static final /* synthetic */ ConnectionType[] $values() {
        return new ConnectionType[]{WIRED, WIRELESS, CELLULAR};
    }

    static {
        ConnectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.analytics.enums.ConnectionType.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return ConnectionType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConnectionType[i];
            }
        };
    }

    private ConnectionType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
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

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
