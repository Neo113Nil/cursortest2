package com.vk.clips.sdk.models.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: SdkOrdAdsInfo.kt */
/* loaded from: classes17.dex */
public final class SdkOrdAdsInfo implements Parcelable {
    public static final Parcelable.Creator<SdkOrdAdsInfo> CREATOR = new a();
    public final String b;
    public final List<SdkOrdAdvertiser> c;

    /* compiled from: SdkOrdAdsInfo.kt */
    public static final class a implements Parcelable.Creator<SdkOrdAdsInfo> {
        @Override // android.os.Parcelable.Creator
        public final SdkOrdAdsInfo createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SdkOrdAdvertiser.CREATOR, parcel, arrayList, i, 1);
            }
            return new SdkOrdAdsInfo(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SdkOrdAdsInfo[] newArray(int i) {
            return new SdkOrdAdsInfo[i];
        }
    }

    public SdkOrdAdsInfo(String str, List<SdkOrdAdvertiser> list) {
        this.b = str;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkOrdAdsInfo)) {
            return false;
        }
        SdkOrdAdsInfo sdkOrdAdsInfo = (SdkOrdAdsInfo) obj;
        return epx.f(this.b, sdkOrdAdsInfo.b) && epx.f(this.c, sdkOrdAdsInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkOrdAdsInfo(title=");
        sb.append(this.b);
        sb.append(", advertisers=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            ((SdkOrdAdvertiser) a2.next()).writeToParcel(parcel, i);
        }
    }
}
