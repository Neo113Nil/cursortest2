package com.vk.profile.community.details.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;

/* compiled from: CommunityAddContactsParams.kt */
/* loaded from: classes5.dex */
public final class CommunityAddContactsParams implements Parcelable {
    public static final Parcelable.Creator<CommunityAddContactsParams> CREATOR = new a();
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: CommunityAddContactsParams.kt */
    public static final class a implements Parcelable.Creator<CommunityAddContactsParams> {
        @Override // android.os.Parcelable.Creator
        public final CommunityAddContactsParams createFromParcel(Parcel parcel) {
            return new CommunityAddContactsParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityAddContactsParams[] newArray(int i) {
            return new CommunityAddContactsParams[i];
        }
    }

    public CommunityAddContactsParams(Integer num, String str, String str2, String str3, String str4) {
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final String d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityAddContactsParams)) {
            return false;
        }
        CommunityAddContactsParams communityAddContactsParams = (CommunityAddContactsParams) obj;
        return epx.f(this.b, communityAddContactsParams.b) && epx.f(this.c, communityAddContactsParams.c) && epx.f(this.d, communityAddContactsParams.d) && epx.f(this.e, communityAddContactsParams.e) && epx.f(this.f, communityAddContactsParams.f);
    }

    public final Integer f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityAddContactsParams(selectedCityId=");
        sb.append(this.b);
        sb.append(", selectedCityTitle=");
        sb.append(this.c);
        sb.append(", phone=");
        sb.append(this.d);
        sb.append(", website=");
        sb.append(this.e);
        sb.append(", address=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
