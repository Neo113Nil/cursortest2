package com.vk.dto.uxpolls;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: PollTranslations.kt */
/* loaded from: classes18.dex */
public final class PollTranslations implements Parcelable {
    public static final Parcelable.Creator<PollTranslations> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: PollTranslations.kt */
    public static final class a implements Parcelable.Creator<PollTranslations> {
        @Override // android.os.Parcelable.Creator
        public final PollTranslations createFromParcel(Parcel parcel) {
            return new PollTranslations(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PollTranslations[] newArray(int i) {
            return new PollTranslations[i];
        }
    }

    public PollTranslations(String str, String str2, String str3, String str4) {
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
        if (!(obj instanceof PollTranslations)) {
            return false;
        }
        PollTranslations pollTranslations = (PollTranslations) obj;
        return epx.f(this.b, pollTranslations.b) && epx.f(this.c, pollTranslations.c) && epx.f(this.d, pollTranslations.d) && epx.f(this.e, pollTranslations.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollTranslations(completeTitle=");
        sb.append(this.b);
        sb.append(", continueButton=");
        sb.append(this.c);
        sb.append(", sendButton=");
        sb.append(this.d);
        sb.append(", stepCaption=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
