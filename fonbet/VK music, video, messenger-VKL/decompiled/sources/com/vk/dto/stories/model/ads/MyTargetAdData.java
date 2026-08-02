package com.vk.dto.stories.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.urd0;

/* compiled from: MyTargetAdData.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdData implements Parcelable {
    public static final Parcelable.Creator<MyTargetAdData> CREATOR = new a();
    public final String b;
    public final MyTargetAdType c;
    public final MyTargetAdFormat d;
    public final String e;
    public Integer f;

    /* compiled from: MyTargetAdData.kt */
    public static final class a implements Parcelable.Creator<MyTargetAdData> {
        @Override // android.os.Parcelable.Creator
        public final MyTargetAdData createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            MyTargetAdType createFromParcel = parcel.readInt() == 0 ? null : MyTargetAdType.CREATOR.createFromParcel(parcel);
            MyTargetAdFormat createFromParcel2 = parcel.readInt() == 0 ? null : MyTargetAdFormat.CREATOR.createFromParcel(parcel);
            Integer num = null;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new MyTargetAdData(readString, createFromParcel, createFromParcel2, readString2, num);
        }

        @Override // android.os.Parcelable.Creator
        public final MyTargetAdData[] newArray(int i) {
            return new MyTargetAdData[i];
        }
    }

    public MyTargetAdData(String str, MyTargetAdType myTargetAdType, MyTargetAdFormat myTargetAdFormat, String str2, Integer num) {
        this.b = str;
        this.c = myTargetAdType;
        this.d = myTargetAdFormat;
        this.e = str2;
        this.f = num;
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(Integer num) {
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTargetAdData)) {
            return false;
        }
        MyTargetAdData myTargetAdData = (MyTargetAdData) obj;
        return epx.f(this.b, myTargetAdData.b) && this.c == myTargetAdData.c && this.d == myTargetAdData.d && epx.f(this.e, myTargetAdData.e) && epx.f(this.f, myTargetAdData.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        MyTargetAdType myTargetAdType = this.c;
        int hashCode2 = (hashCode + (myTargetAdType == null ? 0 : myTargetAdType.hashCode())) * 31;
        MyTargetAdFormat myTargetAdFormat = this.d;
        int a2 = urd0.a((hashCode2 + (myTargetAdFormat == null ? 0 : myTargetAdFormat.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        return a2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetAdData(source=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", format=");
        sb.append(this.d);
        sb.append(", adData=");
        sb.append(this.e);
        sb.append(", bannerId=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        MyTargetAdType myTargetAdType = this.c;
        if (myTargetAdType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            myTargetAdType.writeToParcel(parcel, i);
        }
        MyTargetAdFormat myTargetAdFormat = this.d;
        if (myTargetAdFormat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            myTargetAdFormat.writeToParcel(parcel, i);
        }
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
