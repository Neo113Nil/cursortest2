package com.vk.newsfeed.posting.additional_settings.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.sn;
import xsna.zcl;

/* compiled from: AdditionalSettingsConfiguration.kt */
/* loaded from: classes4.dex */
public final class AdvertisingOrd implements Parcelable {
    public static final Parcelable.Creator<AdvertisingOrd> CREATOR = new a();
    public static final AdvertisingOrd f = new AdvertisingOrd(null, null, null, false);
    public final String b;
    public final Boolean c;
    public final String d;
    public final boolean e;

    /* compiled from: AdditionalSettingsConfiguration.kt */
    public static final class a implements Parcelable.Creator<AdvertisingOrd> {
        @Override // android.os.Parcelable.Creator
        public final AdvertisingOrd createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertisingOrd(readString, valueOf, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertisingOrd[] newArray(int i) {
            return new AdvertisingOrd[i];
        }
    }

    public AdvertisingOrd(String str, Boolean bool, String str2, boolean z) {
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = z;
    }

    public static AdvertisingOrd a(AdvertisingOrd advertisingOrd, String str, Boolean bool, String str2) {
        boolean z = advertisingOrd.e;
        advertisingOrd.getClass();
        return new AdvertisingOrd(str, bool, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertisingOrd)) {
            return false;
        }
        AdvertisingOrd advertisingOrd = (AdvertisingOrd) obj;
        return epx.f(this.b, advertisingOrd.b) && epx.f(this.c, advertisingOrd.c) && epx.f(this.d, advertisingOrd.d) && this.e == advertisingOrd.e;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertisingOrd(predId=");
        sb.append(this.b);
        sb.append(", isAddAdvertisingOrd=");
        sb.append(this.c);
        sb.append(", erId=");
        sb.append(this.d);
        sb.append(", isAppliedBefore=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Boolean bool = this.c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ AdvertisingOrd(String str, Boolean bool, String str2, boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, bool, str2, z);
    }
}
