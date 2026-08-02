package com.vk.auth.main;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: TermsLink.kt */
/* loaded from: classes15.dex */
public final class TermsLink implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: TermsLink.kt */
    public static final class a implements Parcelable.Creator<TermsLink> {
        @Override // android.os.Parcelable.Creator
        public final TermsLink createFromParcel(Parcel parcel) {
            return new TermsLink(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TermsLink[] newArray(int i) {
            return new TermsLink[i];
        }
    }

    public TermsLink(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsLink)) {
            return false;
        }
        TermsLink termsLink = (TermsLink) obj;
        return epx.f(this.b, termsLink.b) && epx.f(this.c, termsLink.c) && epx.f(this.d, termsLink.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TermsLink(nominativeCaseName=");
        sb.append(this.b);
        sb.append(", accusativeCaseName=");
        sb.append(this.c);
        sb.append(", url=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public TermsLink(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
    }
}
