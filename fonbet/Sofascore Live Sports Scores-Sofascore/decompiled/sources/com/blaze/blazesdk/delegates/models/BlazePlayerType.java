package com.blaze.blazesdk.delegates.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MOMENTS", "STORIES", "VIDEOS", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazePlayerType implements Parcelable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazePlayerType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<BlazePlayerType> CREATOR;
    public static final BlazePlayerType MOMENTS = new BlazePlayerType("MOMENTS", 0);
    public static final BlazePlayerType STORIES = new BlazePlayerType("STORIES", 1);
    public static final BlazePlayerType VIDEOS = new BlazePlayerType("VIDEOS", 2);

    private static final /* synthetic */ BlazePlayerType[] $values() {
        return new BlazePlayerType[]{MOMENTS, STORIES, VIDEOS};
    }

    static {
        BlazePlayerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        CREATOR = new Parcelable.Creator() { // from class: com.blaze.blazesdk.delegates.models.BlazePlayerType.a
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return BlazePlayerType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlazePlayerType[i];
            }
        };
    }

    private BlazePlayerType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazePlayerType valueOf(String str) {
        return (BlazePlayerType) Enum.valueOf(BlazePlayerType.class, str);
    }

    public static BlazePlayerType[] values() {
        return (BlazePlayerType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(name());
    }
}
