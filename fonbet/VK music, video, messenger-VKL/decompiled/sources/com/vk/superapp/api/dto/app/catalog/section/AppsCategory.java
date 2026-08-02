package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: AppsCategory.kt */
/* loaded from: classes6.dex */
public final class AppsCategory implements Parcelable {
    public static final Parcelable.Creator<AppsCategory> CREATOR = new a();
    public final String b;
    public final String c;
    public final WebImage d;
    public final String e;

    /* compiled from: AppsCategory.kt */
    public static final class a implements Parcelable.Creator<AppsCategory> {
        @Override // android.os.Parcelable.Creator
        public final AppsCategory createFromParcel(Parcel parcel) {
            return new AppsCategory(parcel.readString(), parcel.readString(), (WebImage) parcel.readParcelable(AppsCategory.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCategory[] newArray(int i) {
            return new AppsCategory[i];
        }
    }

    public AppsCategory(String str, String str2, WebImage webImage, String str3) {
        this.b = str;
        this.c = str2;
        this.d = webImage;
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
        if (!(obj instanceof AppsCategory)) {
            return false;
        }
        AppsCategory appsCategory = (AppsCategory) obj;
        return epx.f(this.b, appsCategory.b) && epx.f(this.c, appsCategory.c) && epx.f(this.d, appsCategory.d) && epx.f(this.e, appsCategory.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        WebImage webImage = this.d;
        return this.e.hashCode() + ((a2 + (webImage == null ? 0 : webImage.b.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsCategory(title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", logo=");
        sb.append(this.d);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }
}
