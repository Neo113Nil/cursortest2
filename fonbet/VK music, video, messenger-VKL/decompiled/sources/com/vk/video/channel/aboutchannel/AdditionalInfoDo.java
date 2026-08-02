package com.vk.video.channel.aboutchannel;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.zrp;

/* compiled from: AboutChannelArguments.kt */
/* loaded from: classes5.dex */
public final class AdditionalInfoDo implements Parcelable {
    public static final Parcelable.Creator<AdditionalInfoDo> CREATOR = new a();
    public final long b;
    public final AdditionalInfoType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AboutChannelArguments.kt */
    public static final class AdditionalInfoType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdditionalInfoType[] $VALUES;
        public static final AdditionalInfoType DATE_MS;
        public static final AdditionalInfoType SUBSCRIBERS_COUNT;
        public static final AdditionalInfoType VIDEO_COUNT;
        public static final AdditionalInfoType VIEWERS_COUNT;

        static {
            AdditionalInfoType additionalInfoType = new AdditionalInfoType("DATE_MS", 0);
            DATE_MS = additionalInfoType;
            AdditionalInfoType additionalInfoType2 = new AdditionalInfoType("VIEWERS_COUNT", 1);
            VIEWERS_COUNT = additionalInfoType2;
            AdditionalInfoType additionalInfoType3 = new AdditionalInfoType("SUBSCRIBERS_COUNT", 2);
            SUBSCRIBERS_COUNT = additionalInfoType3;
            AdditionalInfoType additionalInfoType4 = new AdditionalInfoType("VIDEO_COUNT", 3);
            VIDEO_COUNT = additionalInfoType4;
            AdditionalInfoType[] additionalInfoTypeArr = {additionalInfoType, additionalInfoType2, additionalInfoType3, additionalInfoType4};
            $VALUES = additionalInfoTypeArr;
            $ENTRIES = new asp(additionalInfoTypeArr);
        }

        public AdditionalInfoType() {
            throw null;
        }

        public static AdditionalInfoType valueOf(String str) {
            return (AdditionalInfoType) Enum.valueOf(AdditionalInfoType.class, str);
        }

        public static AdditionalInfoType[] values() {
            return (AdditionalInfoType[]) $VALUES.clone();
        }
    }

    /* compiled from: AboutChannelArguments.kt */
    public static final class a implements Parcelable.Creator<AdditionalInfoDo> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalInfoDo createFromParcel(Parcel parcel) {
            return new AdditionalInfoDo(parcel.readLong(), AdditionalInfoType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalInfoDo[] newArray(int i) {
            return new AdditionalInfoDo[i];
        }
    }

    public AdditionalInfoDo(long j, AdditionalInfoType additionalInfoType) {
        this.b = j;
        this.c = additionalInfoType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfoDo)) {
            return false;
        }
        AdditionalInfoDo additionalInfoDo = (AdditionalInfoDo) obj;
        return this.b == additionalInfoDo.b && this.c == additionalInfoDo.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "AdditionalInfoDo(data=" + this.b + ", type=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c.name());
    }
}
