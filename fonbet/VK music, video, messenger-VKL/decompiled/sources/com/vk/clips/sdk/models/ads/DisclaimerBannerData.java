package com.vk.clips.sdk.models.ads;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.vu5;
import xsna.zrp;

/* compiled from: DisclaimerBannerData.kt */
/* loaded from: classes17.dex */
public final class DisclaimerBannerData implements Parcelable {
    public static final Parcelable.Creator<DisclaimerBannerData> CREATOR = new a();
    public final DisclaimerType b;
    public final float c;
    public final int d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DisclaimerBannerData.kt */
    public static final class DisclaimerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisclaimerType[] $VALUES;
        public static final DisclaimerType BANKRUPTCY;
        public static final DisclaimerType DRUG;
        public static final DisclaimerType ENERGETICS;
        public static final DisclaimerType LOANS;
        public static final DisclaimerType SUPPLEMENTS;

        static {
            DisclaimerType disclaimerType = new DisclaimerType("SUPPLEMENTS", 0);
            SUPPLEMENTS = disclaimerType;
            DisclaimerType disclaimerType2 = new DisclaimerType("DRUG", 1);
            DRUG = disclaimerType2;
            DisclaimerType disclaimerType3 = new DisclaimerType("LOANS", 2);
            LOANS = disclaimerType3;
            DisclaimerType disclaimerType4 = new DisclaimerType("BANKRUPTCY", 3);
            BANKRUPTCY = disclaimerType4;
            DisclaimerType disclaimerType5 = new DisclaimerType("ENERGETICS", 4);
            ENERGETICS = disclaimerType5;
            DisclaimerType[] disclaimerTypeArr = {disclaimerType, disclaimerType2, disclaimerType3, disclaimerType4, disclaimerType5};
            $VALUES = disclaimerTypeArr;
            $ENTRIES = new asp(disclaimerTypeArr);
        }

        public DisclaimerType() {
            throw null;
        }

        public static DisclaimerType valueOf(String str) {
            return (DisclaimerType) Enum.valueOf(DisclaimerType.class, str);
        }

        public static DisclaimerType[] values() {
            return (DisclaimerType[]) $VALUES.clone();
        }
    }

    /* compiled from: DisclaimerBannerData.kt */
    public static final class a implements Parcelable.Creator<DisclaimerBannerData> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerBannerData createFromParcel(Parcel parcel) {
            return new DisclaimerBannerData(DisclaimerType.valueOf(parcel.readString()), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerBannerData[] newArray(int i) {
            return new DisclaimerBannerData[i];
        }
    }

    public DisclaimerBannerData(DisclaimerType disclaimerType, float f, int i) {
        this.b = disclaimerType;
        this.c = f;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclaimerBannerData)) {
            return false;
        }
        DisclaimerBannerData disclaimerBannerData = (DisclaimerBannerData) obj;
        return this.b == disclaimerBannerData.b && Float.compare(this.c, disclaimerBannerData.c) == 0 && this.d == disclaimerBannerData.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisclaimerBannerData(disclaimerType=");
        sb.append(this.b);
        sb.append(", heightRatio=");
        sb.append(this.c);
        sb.append(", minHeight=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
    }
}
