package com.vk.search.params.api.domain.model.education;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.search.params.api.City;
import xsna.epx;
import xsna.nr;
import xsna.uqi;

/* compiled from: EducationParam.kt */
/* loaded from: classes5.dex */
public final class EducationParam implements Parcelable {
    public static final Parcelable.Creator<EducationParam> CREATOR = new a();
    public final EducationalInstitution b;
    public final City c;
    public final Integer d;

    /* compiled from: EducationParam.kt */
    public static final class a implements Parcelable.Creator<EducationParam> {
        @Override // android.os.Parcelable.Creator
        public final EducationParam createFromParcel(Parcel parcel) {
            return new EducationParam((EducationalInstitution) parcel.readParcelable(EducationParam.class.getClassLoader()), City.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final EducationParam[] newArray(int i) {
            return new EducationParam[i];
        }
    }

    public EducationParam(EducationalInstitution educationalInstitution, City city, Integer num) {
        this.b = educationalInstitution;
        this.c = city;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationParam)) {
            return false;
        }
        EducationParam educationParam = (EducationParam) obj;
        return epx.f(this.b, educationParam.b) && epx.f(this.c, educationParam.c) && epx.f(this.d, educationParam.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Integer num = this.d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationParam(institution=");
        sb.append(this.b);
        sb.append(", institutionCity=");
        sb.append(this.c);
        sb.append(", year=");
        return uqi.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
