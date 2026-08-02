package com.vk.ecomm.cart.impl.checkout.feature.state;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class FieldKey implements Parcelable {
    public static final Parcelable.Creator<FieldKey> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: CheckoutFormStructure.kt */
    public static final class a implements Parcelable.Creator<FieldKey> {
        @Override // android.os.Parcelable.Creator
        public final FieldKey createFromParcel(Parcel parcel) {
            return new FieldKey(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FieldKey[] newArray(int i) {
            return new FieldKey[i];
        }
    }

    public FieldKey(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldKey)) {
            return false;
        }
        FieldKey fieldKey = (FieldKey) obj;
        return epx.f(this.b, fieldKey.b) && epx.f(this.c, fieldKey.c) && epx.f(this.d, fieldKey.d) && epx.f(this.e, fieldKey.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldKey(sectionId=");
        sb.append(this.b);
        sb.append(", fieldId=");
        sb.append(this.c);
        sb.append(", innerFieldId=");
        sb.append(this.d);
        sb.append(", uniqueId=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FieldKey(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? str3.length() == 0 ? str2 : str3 : str4);
        str3 = (i & 4) != 0 ? "" : str3;
    }
}
