package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ClipVideoOrigin.kt */
/* loaded from: classes18.dex */
public final class ClipVideoOrigin implements Serializer.StreamParcelable {
    public static final Serializer.c<ClipVideoOrigin> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipVideoOrigin> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipVideoOrigin a(Serializer serializer) {
            return new ClipVideoOrigin(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipVideoOrigin[i];
        }
    }

    public ClipVideoOrigin(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipVideoOrigin)) {
            return false;
        }
        ClipVideoOrigin clipVideoOrigin = (ClipVideoOrigin) obj;
        return epx.f(this.b, clipVideoOrigin.b) && epx.f(this.c, clipVideoOrigin.c) && epx.f(this.d, clipVideoOrigin.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipVideoOrigin(ownerId=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", text=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public ClipVideoOrigin(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H());
    }
}
