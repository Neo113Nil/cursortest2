package com.vk.clips.upload.edit.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipCoverPreviewType.kt */
/* loaded from: classes17.dex */
public final class ClipCoverPreviewType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipCoverPreviewType[] $VALUES;
    public static final Parcelable.Creator<ClipCoverPreviewType> CREATOR;
    public static final ClipCoverPreviewType FIRST_FRAME;
    public static final ClipCoverPreviewType GALLERY;
    public static final ClipCoverPreviewType ORIGINAL;

    /* compiled from: ClipCoverPreviewType.kt */
    public static final class a implements Parcelable.Creator<ClipCoverPreviewType> {
        @Override // android.os.Parcelable.Creator
        public final ClipCoverPreviewType createFromParcel(Parcel parcel) {
            return ClipCoverPreviewType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipCoverPreviewType[] newArray(int i) {
            return new ClipCoverPreviewType[i];
        }
    }

    static {
        ClipCoverPreviewType clipCoverPreviewType = new ClipCoverPreviewType("FIRST_FRAME", 0);
        FIRST_FRAME = clipCoverPreviewType;
        ClipCoverPreviewType clipCoverPreviewType2 = new ClipCoverPreviewType("ORIGINAL", 1);
        ORIGINAL = clipCoverPreviewType2;
        ClipCoverPreviewType clipCoverPreviewType3 = new ClipCoverPreviewType("GALLERY", 2);
        GALLERY = clipCoverPreviewType3;
        ClipCoverPreviewType[] clipCoverPreviewTypeArr = {clipCoverPreviewType, clipCoverPreviewType2, clipCoverPreviewType3};
        $VALUES = clipCoverPreviewTypeArr;
        $ENTRIES = new asp(clipCoverPreviewTypeArr);
        CREATOR = new a();
    }

    public ClipCoverPreviewType() {
        throw null;
    }

    public static ClipCoverPreviewType valueOf(String str) {
        return (ClipCoverPreviewType) Enum.valueOf(ClipCoverPreviewType.class, str);
    }

    public static ClipCoverPreviewType[] values() {
        return (ClipCoverPreviewType[]) $VALUES.clone();
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
