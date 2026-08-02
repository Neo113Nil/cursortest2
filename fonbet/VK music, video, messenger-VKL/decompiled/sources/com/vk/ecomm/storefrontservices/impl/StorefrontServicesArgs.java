package com.vk.ecomm.storefrontservices.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.epx;
import xsna.nr;

/* compiled from: StorefrontServicesArgs.kt */
/* loaded from: classes18.dex */
public final class StorefrontServicesArgs implements Parcelable {
    public static final Parcelable.Creator<StorefrontServicesArgs> CREATOR = new a();
    public final UserId b;
    public final Integer c;
    public final String d;
    public final String e;
    public final boolean f;

    /* compiled from: StorefrontServicesArgs.kt */
    public static final class a implements Parcelable.Creator<StorefrontServicesArgs> {
        @Override // android.os.Parcelable.Creator
        public final StorefrontServicesArgs createFromParcel(Parcel parcel) {
            return new StorefrontServicesArgs((UserId) parcel.readParcelable(StorefrontServicesArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StorefrontServicesArgs[] newArray(int i) {
            return new StorefrontServicesArgs[i];
        }
    }

    public StorefrontServicesArgs(UserId userId, Integer num, String str, String str2, boolean z) {
        this.b = userId;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorefrontServicesArgs)) {
            return false;
        }
        StorefrontServicesArgs storefrontServicesArgs = (StorefrontServicesArgs) obj;
        return epx.f(this.b, storefrontServicesArgs.b) && epx.f(this.c, storefrontServicesArgs.c) && epx.f(this.d, storefrontServicesArgs.d) && epx.f(this.e, storefrontServicesArgs.e) && this.f == storefrontServicesArgs.f;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontServicesArgs(ownerId=");
        sb.append(this.b);
        sb.append(", albumId=");
        sb.append(this.c);
        sb.append(", sectionId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", onlyAlbums=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
