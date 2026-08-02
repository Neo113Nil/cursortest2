package com.vk.search.params.api.domain.model.education;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.vu5;

/* compiled from: School.kt */
/* loaded from: classes5.dex */
public final class School implements EducationalInstitution {
    public static final Parcelable.Creator<School> CREATOR = new a();
    public final String b;
    public final int c;

    /* compiled from: School.kt */
    public static final class a implements Parcelable.Creator<School> {
        @Override // android.os.Parcelable.Creator
        public final School createFromParcel(Parcel parcel) {
            return new School(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final School[] newArray(int i) {
            return new School[i];
        }
    }

    public School(String str, int i) {
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
        if (!(obj instanceof School)) {
            return false;
        }
        School school = (School) obj;
        return epx.f(this.b, school.b) && this.c == school.c;
    }

    @Override // com.vk.search.params.api.domain.model.education.EducationalInstitution
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("School(title=");
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
