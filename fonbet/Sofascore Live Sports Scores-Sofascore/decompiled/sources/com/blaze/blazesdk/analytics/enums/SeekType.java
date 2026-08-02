package com.blaze.blazesdk.analytics.enums;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/analytics/enums/SeekType;", "Lcom/blaze/blazesdk/utils/parsing/EnumWithValue;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SEEK_BAR", "DOUBLE_TAP", "SEEK_BUTTON", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SeekType implements EnumWithValue, Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ SeekType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SeekType> CREATOR;

    @NotNull
    private final String value;
    public static final SeekType SEEK_BAR = new SeekType("SEEK_BAR", 0, "Seek Bar");
    public static final SeekType DOUBLE_TAP = new SeekType("DOUBLE_TAP", 1, "Double Tap");
    public static final SeekType SEEK_BUTTON = new SeekType("SEEK_BUTTON", 2, "Seek Button");

    private static final /* synthetic */ SeekType[] $values() {
        return new SeekType[]{SEEK_BAR, DOUBLE_TAP, SEEK_BUTTON};
    }

    static {
        SeekType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.analytics.enums.SeekType.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return SeekType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeekType[i];
            }
        };
    }

    private SeekType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static SeekType valueOf(String str) {
        return (SeekType) Enum.valueOf(SeekType.class, str);
    }

    public static SeekType[] values() {
        return (SeekType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.blaze.blazesdk.utils.parsing.EnumWithValue
    @NotNull
    public String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
