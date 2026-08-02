package com.vk.libvideo.author;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoPinType.kt */
/* loaded from: classes2.dex */
public final class VideoPinType implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoPinType[] $VALUES;
    public static final VideoPinType ALL;
    public static final VideoPinType CLIP;
    public static final Parcelable.Creator<VideoPinType> CREATOR;
    public static final VideoPinType NON_SUBSCRIBERS;
    public static final VideoPinType SUBSCRIBERS;

    /* compiled from: VideoPinType.kt */
    public static final class a implements Parcelable.Creator<VideoPinType> {
        @Override // android.os.Parcelable.Creator
        public final VideoPinType createFromParcel(Parcel parcel) {
            return VideoPinType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPinType[] newArray(int i) {
            return new VideoPinType[i];
        }
    }

    static {
        VideoPinType videoPinType = new VideoPinType("ALL", 0);
        ALL = videoPinType;
        VideoPinType videoPinType2 = new VideoPinType("SUBSCRIBERS", 1);
        SUBSCRIBERS = videoPinType2;
        VideoPinType videoPinType3 = new VideoPinType("NON_SUBSCRIBERS", 2);
        NON_SUBSCRIBERS = videoPinType3;
        VideoPinType videoPinType4 = new VideoPinType("CLIP", 3);
        CLIP = videoPinType4;
        VideoPinType[] videoPinTypeArr = {videoPinType, videoPinType2, videoPinType3, videoPinType4};
        $VALUES = videoPinTypeArr;
        $ENTRIES = new asp(videoPinTypeArr);
        CREATOR = new a();
    }

    public VideoPinType() {
        throw null;
    }

    public static VideoPinType valueOf(String str) {
        return (VideoPinType) Enum.valueOf(VideoPinType.class, str);
    }

    public static VideoPinType[] values() {
        return (VideoPinType[]) $VALUES.clone();
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
