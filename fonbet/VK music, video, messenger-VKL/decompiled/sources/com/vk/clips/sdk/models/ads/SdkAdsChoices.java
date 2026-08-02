package com.vk.clips.sdk.models.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.zcl;

/* compiled from: SdkAdsChoices.kt */
/* loaded from: classes17.dex */
public final class SdkAdsChoices implements Parcelable {
    public static final Parcelable.Creator<SdkAdsChoices> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<SdkAdsChoicesOptions> f;

    /* compiled from: SdkAdsChoices.kt */
    public static final class a implements Parcelable.Creator<SdkAdsChoices> {
        @Override // android.os.Parcelable.Creator
        public final SdkAdsChoices createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SdkAdsChoicesOptions.CREATOR, parcel, arrayList, i, 1);
            }
            return new SdkAdsChoices(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SdkAdsChoices[] newArray(int i) {
            return new SdkAdsChoices[i];
        }
    }

    public SdkAdsChoices() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkAdsChoices)) {
            return false;
        }
        SdkAdsChoices sdkAdsChoices = (SdkAdsChoices) obj;
        return epx.f(this.b, sdkAdsChoices.b) && epx.f(this.c, sdkAdsChoices.c) && epx.f(this.d, sdkAdsChoices.d) && epx.f(this.e, sdkAdsChoices.e) && epx.f(this.f, sdkAdsChoices.f);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkAdsChoices(iconLink=");
        sb.append(this.b);
        sb.append(", clickLink=");
        sb.append(this.c);
        sb.append(", closeUrl=");
        sb.append(this.d);
        sb.append(", closeActionText=");
        sb.append(this.e);
        sb.append(", options=");
        return ms9.a(')', sb, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator a2 = ao.a(parcel, this.f);
        while (a2.hasNext()) {
            ((SdkAdsChoicesOptions) a2.next()).writeToParcel(parcel, i);
        }
    }

    public SdkAdsChoices(String str, String str2, String str3, String str4, List<SdkAdsChoicesOptions> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    public SdkAdsChoices(String str, String str2, String str3, String str4, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? EmptyList.b : list);
    }
}
