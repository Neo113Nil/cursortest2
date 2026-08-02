package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: Links.kt */
/* loaded from: classes18.dex */
public final class Links implements Serializer.StreamParcelable {
    public static final Serializer.c<Links> CREATOR = new a();
    public final Link b;
    public final Link c;
    public final Link d;
    public final Link e;
    public final Link f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Links> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Links a(Serializer serializer) {
            return new Links((Link) serializer.G(Link.class.getClassLoader()), (Link) serializer.G(Link.class.getClassLoader()), (Link) serializer.G(Link.class.getClassLoader()), (Link) serializer.G(Link.class.getClassLoader()), (Link) serializer.G(Link.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Links[i];
        }
    }

    public Links(Link link, Link link2, Link link3, Link link4, Link link5) {
        this.b = link;
        this.c = link2;
        this.d = link3;
        this.e = link4;
        this.f = link5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
