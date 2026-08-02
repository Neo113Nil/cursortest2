package com.vk.music.bottomsheets.domain.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.uf3;
import xsna.urd0;

/* compiled from: LinkButtonEntity.kt */
/* loaded from: classes3.dex */
public final class LinkButtonEntity implements Parcelable {
    public static final Parcelable.Creator<LinkButtonEntity> CREATOR = new a();
    public final String b;
    public final String c;
    public final Bundle d;

    /* compiled from: LinkButtonEntity.kt */
    public static final class a implements Parcelable.Creator<LinkButtonEntity> {
        @Override // android.os.Parcelable.Creator
        public final LinkButtonEntity createFromParcel(Parcel parcel) {
            return new LinkButtonEntity(parcel.readString(), parcel.readString(), parcel.readBundle(LinkButtonEntity.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LinkButtonEntity[] newArray(int i) {
            return new LinkButtonEntity[i];
        }
    }

    public LinkButtonEntity(String str, String str2, Bundle bundle) {
        this.b = str;
        this.c = str2;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkButtonEntity)) {
            return false;
        }
        LinkButtonEntity linkButtonEntity = (LinkButtonEntity) obj;
        return epx.f(this.b, linkButtonEntity.b) && epx.f(this.c, linkButtonEntity.c) && epx.f(this.d, linkButtonEntity.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        Bundle bundle = this.d;
        return a2 + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkButtonEntity(title=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", awayParams=");
        return uf3.c(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeBundle(this.d);
    }
}
