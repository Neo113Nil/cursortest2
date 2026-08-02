package com.vk.clips.sdk.models.ads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SdkAdsChoicesOptions.kt */
/* loaded from: classes17.dex */
public final class SdkAdsChoicesOptions implements Parcelable {
    public static final Parcelable.Creator<SdkAdsChoicesOptions> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final String g;
    public final Integer h;

    /* compiled from: SdkAdsChoicesOptions.kt */
    public static final class a implements Parcelable.Creator<SdkAdsChoicesOptions> {
        @Override // android.os.Parcelable.Creator
        public final SdkAdsChoicesOptions createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer num;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new SdkAdsChoicesOptions(readString, readString2, readString3, readString4, valueOf, readString5, num);
        }

        @Override // android.os.Parcelable.Creator
        public final SdkAdsChoicesOptions[] newArray(int i) {
            return new SdkAdsChoicesOptions[i];
        }
    }

    public SdkAdsChoicesOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkAdsChoicesOptions)) {
            return false;
        }
        SdkAdsChoicesOptions sdkAdsChoicesOptions = (SdkAdsChoicesOptions) obj;
        return epx.f(this.b, sdkAdsChoicesOptions.b) && epx.f(this.c, sdkAdsChoicesOptions.c) && epx.f(this.d, sdkAdsChoicesOptions.d) && epx.f(this.e, sdkAdsChoicesOptions.e) && epx.f(this.f, sdkAdsChoicesOptions.f) && epx.f(this.g, sdkAdsChoicesOptions.g) && epx.f(this.h, sdkAdsChoicesOptions.h);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.h;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkAdsChoicesOptions(alias=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", clickLink=");
        sb.append(this.e);
        sb.append(", shouldCloseAd=");
        sb.append(this.f);
        sb.append(", copyText=");
        sb.append(this.g);
        sb.append(", id=");
        return uqi.b(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Boolean bool = this.f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.g);
        Integer num = this.h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public SdkAdsChoicesOptions(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bool;
        this.g = str5;
        this.h = num;
    }

    public /* synthetic */ SdkAdsChoicesOptions(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num);
    }
}
