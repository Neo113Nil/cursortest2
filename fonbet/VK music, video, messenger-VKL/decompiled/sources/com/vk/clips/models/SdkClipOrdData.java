package com.vk.clips.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: SdkClipOrdData.kt */
/* loaded from: classes16.dex */
public final class SdkClipOrdData implements Parcelable {
    public static final Parcelable.Creator<SdkClipOrdData> CREATOR = new a();
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: SdkClipOrdData.kt */
    public static final class a implements Parcelable.Creator<SdkClipOrdData> {
        @Override // android.os.Parcelable.Creator
        public final SdkClipOrdData createFromParcel(Parcel parcel) {
            return new SdkClipOrdData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkClipOrdData[] newArray(int i) {
            return new SdkClipOrdData[i];
        }
    }

    public SdkClipOrdData(boolean z, String str, String str2, String str3) {
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkClipOrdData)) {
            return false;
        }
        SdkClipOrdData sdkClipOrdData = (SdkClipOrdData) obj;
        return this.b == sdkClipOrdData.b && epx.f(this.c, sdkClipOrdData.c) && epx.f(this.d, sdkClipOrdData.d) && epx.f(this.e, sdkClipOrdData.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkClipOrdData(added=");
        sb.append(this.b);
        sb.append(", predId=");
        sb.append(this.c);
        sb.append(", erId=");
        sb.append(this.d);
        sb.append(", title=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public /* synthetic */ SdkClipOrdData(boolean z, String str, String str2, String str3, int i, zcl zclVar) {
        this(z, str, str2, (i & 8) != 0 ? null : str3);
    }
}
