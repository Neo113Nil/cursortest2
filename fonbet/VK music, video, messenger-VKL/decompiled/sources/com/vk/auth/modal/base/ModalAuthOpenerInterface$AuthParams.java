package com.vk.auth.modal.base;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: ModalAuthOpenerInterface.kt */
/* loaded from: classes15.dex */
public final class ModalAuthOpenerInterface$AuthParams implements Parcelable {
    public static final Parcelable.Creator<ModalAuthOpenerInterface$AuthParams> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    /* compiled from: ModalAuthOpenerInterface.kt */
    public static final class a implements Parcelable.Creator<ModalAuthOpenerInterface$AuthParams> {
        @Override // android.os.Parcelable.Creator
        public final ModalAuthOpenerInterface$AuthParams createFromParcel(Parcel parcel) {
            return new ModalAuthOpenerInterface$AuthParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModalAuthOpenerInterface$AuthParams[] newArray(int i) {
            return new ModalAuthOpenerInterface$AuthParams[i];
        }
    }

    public ModalAuthOpenerInterface$AuthParams(String str, String str2, boolean z, String str3) {
        this.b = str;
        this.c = str2;
        this.d = z;
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
        if (!(obj instanceof ModalAuthOpenerInterface$AuthParams)) {
            return false;
        }
        ModalAuthOpenerInterface$AuthParams modalAuthOpenerInterface$AuthParams = (ModalAuthOpenerInterface$AuthParams) obj;
        return epx.f(this.b, modalAuthOpenerInterface$AuthParams.b) && epx.f(this.c, modalAuthOpenerInterface$AuthParams.c) && this.d == modalAuthOpenerInterface$AuthParams.d && epx.f(this.e, modalAuthOpenerInterface$AuthParams.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int b = qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        return b + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthParams(code=");
        sb.append(this.b);
        sb.append(", authId=");
        sb.append(this.c);
        sb.append(", isExternalAuth=");
        sb.append(this.d);
        sb.append(", appId=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
    }
}
