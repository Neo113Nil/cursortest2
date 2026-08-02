package com.vk.clips.coauthors.list.common.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipCoauthorListLaunchType.kt */
/* loaded from: classes16.dex */
public final class ClipCoauthorListLaunchType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipCoauthorListLaunchType[] $VALUES;
    public static final ClipCoauthorListLaunchType Author;
    public static final Parcelable.Creator<ClipCoauthorListLaunchType> CREATOR;
    public static final ClipCoauthorListLaunchType Viewer;

    /* compiled from: ClipCoauthorListLaunchType.kt */
    public static final class a implements Parcelable.Creator<ClipCoauthorListLaunchType> {
        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorListLaunchType createFromParcel(Parcel parcel) {
            return ClipCoauthorListLaunchType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorListLaunchType[] newArray(int i) {
            return new ClipCoauthorListLaunchType[i];
        }
    }

    static {
        ClipCoauthorListLaunchType clipCoauthorListLaunchType = new ClipCoauthorListLaunchType("Author", 0);
        Author = clipCoauthorListLaunchType;
        ClipCoauthorListLaunchType clipCoauthorListLaunchType2 = new ClipCoauthorListLaunchType("Viewer", 1);
        Viewer = clipCoauthorListLaunchType2;
        ClipCoauthorListLaunchType[] clipCoauthorListLaunchTypeArr = {clipCoauthorListLaunchType, clipCoauthorListLaunchType2};
        $VALUES = clipCoauthorListLaunchTypeArr;
        $ENTRIES = new asp(clipCoauthorListLaunchTypeArr);
        CREATOR = new a();
    }

    public ClipCoauthorListLaunchType() {
        throw null;
    }

    public static ClipCoauthorListLaunchType valueOf(String str) {
        return (ClipCoauthorListLaunchType) Enum.valueOf(ClipCoauthorListLaunchType.class, str);
    }

    public static ClipCoauthorListLaunchType[] values() {
        return (ClipCoauthorListLaunchType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
