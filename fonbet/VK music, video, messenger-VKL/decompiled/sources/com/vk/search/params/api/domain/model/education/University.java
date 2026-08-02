package com.vk.search.params.api.domain.model.education;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.vu5;

/* compiled from: University.kt */
/* loaded from: classes5.dex */
public final class University implements EducationalInstitution {
    public static final Parcelable.Creator<University> CREATOR = new a();
    public final String b;
    public final int c;

    /* compiled from: University.kt */
    public static final class a implements Parcelable.Creator<University> {
        @Override // android.os.Parcelable.Creator
        public final University createFromParcel(Parcel parcel) {
            return new University(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final University[] newArray(int i) {
            return new University[i];
        }
    }

    public University(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof University)) {
            return false;
        }
        University university = (University) obj;
        return epx.f(this.b, university.b) && this.c == university.c;
    }

    @Override // com.vk.search.params.api.domain.model.education.EducationalInstitution
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("University(title=");
        sb.append(this.b);
        sb.append(", id=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
