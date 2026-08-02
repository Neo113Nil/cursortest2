package com.vk.auth.validation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: PhoneValidationContract.kt */
/* loaded from: classes.dex */
public final class PhoneValidationContract$ValidationDialogMetaInfo implements Parcelable {
    public static final Parcelable.Creator<PhoneValidationContract$ValidationDialogMetaInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final PhoneValidationContract$SkipBehaviour e;
    public final String f;

    /* compiled from: PhoneValidationContract.kt */
    /* loaded from: classes15.dex */
    public static final class a implements Parcelable.Creator<PhoneValidationContract$ValidationDialogMetaInfo> {
        @Override // android.os.Parcelable.Creator
        public final PhoneValidationContract$ValidationDialogMetaInfo createFromParcel(Parcel parcel) {
            return new PhoneValidationContract$ValidationDialogMetaInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0, PhoneValidationContract$SkipBehaviour.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneValidationContract$ValidationDialogMetaInfo[] newArray(int i) {
            return new PhoneValidationContract$ValidationDialogMetaInfo[i];
        }
    }

    public PhoneValidationContract$ValidationDialogMetaInfo(String str, String str2, boolean z, PhoneValidationContract$SkipBehaviour phoneValidationContract$SkipBehaviour, String str3) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = phoneValidationContract$SkipBehaviour;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneValidationContract$ValidationDialogMetaInfo)) {
            return false;
        }
        PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo = (PhoneValidationContract$ValidationDialogMetaInfo) obj;
        return epx.f(this.b, phoneValidationContract$ValidationDialogMetaInfo.b) && epx.f(this.c, phoneValidationContract$ValidationDialogMetaInfo.c) && this.d == phoneValidationContract$ValidationDialogMetaInfo.d && this.e == phoneValidationContract$ValidationDialogMetaInfo.e && epx.f(this.f, phoneValidationContract$ValidationDialogMetaInfo.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationDialogMetaInfo(sid=");
        sb.append(this.b);
        sb.append(", phoneMask=");
        sb.append(this.c);
        sb.append(", isAuth=");
        sb.append(this.d);
        sb.append(", skipBehaviour=");
        sb.append(this.e);
        sb.append(", accessTokenForLk=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e.name());
        parcel.writeString(this.f);
    }
}
