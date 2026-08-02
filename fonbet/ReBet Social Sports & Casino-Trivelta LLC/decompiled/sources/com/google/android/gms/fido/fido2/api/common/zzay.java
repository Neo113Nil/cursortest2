package com.google.android.gms.fido.fido2.api.common;

import R9.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzay;

/* loaded from: classes2.dex */
public enum zzay implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<zzay> CREATOR = new Parcelable.Creator() { // from class: R9.r
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return zzay.a(parcel.readString());
            } catch (s e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new zzay[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f32980a;

    zzay(String str) {
        this.f32980a = str;
    }

    public static zzay a(String str) {
        for (zzay zzayVar : values()) {
            if (str.equals(zzayVar.f32980a)) {
                return zzayVar;
            }
        }
        throw new s(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32980a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f32980a);
    }
}
