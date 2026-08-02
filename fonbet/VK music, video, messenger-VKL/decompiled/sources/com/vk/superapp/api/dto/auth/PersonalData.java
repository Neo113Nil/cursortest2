package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: PersonalData.kt */
/* loaded from: classes6.dex */
public final class PersonalData implements Parcelable {
    public static final Parcelable.Creator<PersonalData> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: PersonalData.kt */
    public static final class a implements Parcelable.Creator<PersonalData> {
        @Override // android.os.Parcelable.Creator
        public final PersonalData createFromParcel(Parcel parcel) {
            return new PersonalData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PersonalData[] newArray(int i) {
            return new PersonalData[i];
        }
    }

    public PersonalData(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalData)) {
            return false;
        }
        PersonalData personalData = (PersonalData) obj;
        return epx.f(this.b, personalData.b) && epx.f(this.c, personalData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonalData(phone=");
        sb.append(this.b);
        sb.append(", email=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
