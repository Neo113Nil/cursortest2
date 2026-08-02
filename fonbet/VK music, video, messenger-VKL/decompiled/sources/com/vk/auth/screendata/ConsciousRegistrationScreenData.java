package com.vk.auth.screendata;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: ConsciousRegistrationScreenData.kt */
/* loaded from: classes15.dex */
public final class ConsciousRegistrationScreenData implements Parcelable {
    public static final Parcelable.Creator<ConsciousRegistrationScreenData> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: ConsciousRegistrationScreenData.kt */
    public static final class a implements Parcelable.Creator<ConsciousRegistrationScreenData> {
        @Override // android.os.Parcelable.Creator
        public final ConsciousRegistrationScreenData createFromParcel(Parcel parcel) {
            return new ConsciousRegistrationScreenData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConsciousRegistrationScreenData[] newArray(int i) {
            return new ConsciousRegistrationScreenData[i];
        }
    }

    public ConsciousRegistrationScreenData(String str, String str2) {
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
        if (!(obj instanceof ConsciousRegistrationScreenData)) {
            return false;
        }
        ConsciousRegistrationScreenData consciousRegistrationScreenData = (ConsciousRegistrationScreenData) obj;
        return epx.f(this.b, consciousRegistrationScreenData.b) && epx.f(this.c, consciousRegistrationScreenData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsciousRegistrationScreenData(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
