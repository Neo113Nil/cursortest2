package com.vk.clips.sdk.models.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;

/* compiled from: SdkClipsAdsFeaturesParams.kt */
/* loaded from: classes17.dex */
public final class SdkClipsAdsFeaturesParams implements Parcelable {
    public static final Parcelable.Creator<SdkClipsAdsFeaturesParams> CREATOR = new a();
    public final List<String> b;
    public final List<SdkAdsFlags> c;
    public final String d;

    /* compiled from: SdkClipsAdsFeaturesParams.kt */
    public static final class a implements Parcelable.Creator<SdkClipsAdsFeaturesParams> {
        @Override // android.os.Parcelable.Creator
        public final SdkClipsAdsFeaturesParams createFromParcel(Parcel parcel) {
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(SdkAdsFlags.valueOf(parcel.readString()));
            }
            return new SdkClipsAdsFeaturesParams(createStringArrayList, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkClipsAdsFeaturesParams[] newArray(int i) {
            return new SdkClipsAdsFeaturesParams[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkClipsAdsFeaturesParams(List<String> list, List<? extends SdkAdsFlags> list2, String str) {
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkClipsAdsFeaturesParams)) {
            return false;
        }
        SdkClipsAdsFeaturesParams sdkClipsAdsFeaturesParams = (SdkClipsAdsFeaturesParams) obj;
        return epx.f(this.b, sdkClipsAdsFeaturesParams.b) && epx.f(this.c, sdkClipsAdsFeaturesParams.c) && epx.f(this.d, sdkClipsAdsFeaturesParams.d);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkClipsAdsFeaturesParams(wbItemIds=");
        sb.append(this.b);
        sb.append(", adsFlags=");
        sb.append(this.c);
        sb.append(", articles=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeString(((SdkAdsFlags) a2.next()).name());
        }
        parcel.writeString(this.d);
    }
}
