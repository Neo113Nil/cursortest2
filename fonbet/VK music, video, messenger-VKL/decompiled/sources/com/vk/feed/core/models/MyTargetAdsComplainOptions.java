package com.vk.feed.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: MyTargetAdsComplainOptions.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdsComplainOptions implements Parcelable {
    public static final Parcelable.Creator<MyTargetAdsComplainOptions> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: MyTargetAdsComplainOptions.kt */
    public static final class a implements Parcelable.Creator<MyTargetAdsComplainOptions> {
        @Override // android.os.Parcelable.Creator
        public final MyTargetAdsComplainOptions createFromParcel(Parcel parcel) {
            return new MyTargetAdsComplainOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MyTargetAdsComplainOptions[] newArray(int i) {
            return new MyTargetAdsComplainOptions[i];
        }
    }

    public MyTargetAdsComplainOptions(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTargetAdsComplainOptions)) {
            return false;
        }
        MyTargetAdsComplainOptions myTargetAdsComplainOptions = (MyTargetAdsComplainOptions) obj;
        return this.b == myTargetAdsComplainOptions.b && epx.f(this.c, myTargetAdsComplainOptions.c) && epx.f(this.d, myTargetAdsComplainOptions.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetAdsComplainOptions(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", alias=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MyTargetAdsComplainOptions(Parcel parcel) {
        this(r0, r1, r4 != null ? r4 : "");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        readString = readString == null ? "" : readString;
        String readString2 = parcel.readString();
    }
}
