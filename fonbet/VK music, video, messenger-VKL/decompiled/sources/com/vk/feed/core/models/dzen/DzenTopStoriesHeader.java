package com.vk.feed.core.models.dzen;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: DzenTopStoriesHeader.kt */
/* loaded from: classes18.dex */
public final class DzenTopStoriesHeader implements Serializer.StreamParcelable {
    public static final Serializer.c<DzenTopStoriesHeader> CREATOR = new a();
    public final DzenImage b;
    public final String c;
    public final String d;
    public final DzenInfo e;
    public final boolean f;
    public final boolean g;

    /* compiled from: DzenTopStoriesHeader.kt */
    public static final class DzenImage implements Serializer.StreamParcelable {
        public static final Serializer.c<DzenImage> CREATOR = new a();
        public final Image b;
        public final String c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<DzenImage> {
            @Override // com.vk.core.serialize.Serializer.c
            public final DzenImage a(Serializer serializer) {
                return new DzenImage((Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DzenImage[i];
            }
        }

        public DzenImage(Image image, String str, String str2) {
            this.b = image;
            this.c = str;
            this.d = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DzenTopStoriesHeader> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DzenTopStoriesHeader a(Serializer serializer) {
            return new DzenTopStoriesHeader((DzenImage) serializer.G(DzenImage.class.getClassLoader()), serializer.H(), serializer.H(), (DzenInfo) serializer.G(DzenInfo.class.getClassLoader()), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DzenTopStoriesHeader[i];
        }
    }

    public DzenTopStoriesHeader(DzenImage dzenImage, String str, String str2, DzenInfo dzenInfo, boolean z, boolean z2) {
        this.b = dzenImage;
        this.c = str;
        this.d = str2;
        this.e = dzenInfo;
        this.f = z;
        this.g = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DzenTopStoriesHeader)) {
            return false;
        }
        DzenTopStoriesHeader dzenTopStoriesHeader = (DzenTopStoriesHeader) obj;
        return epx.f(this.b, dzenTopStoriesHeader.b) && epx.f(this.c, dzenTopStoriesHeader.c) && epx.f(this.d, dzenTopStoriesHeader.d) && epx.f(this.e, dzenTopStoriesHeader.e) && this.f == dzenTopStoriesHeader.f && this.g == dzenTopStoriesHeader.g;
    }

    public final int hashCode() {
        DzenImage dzenImage = this.b;
        int a2 = urd0.a((dzenImage == null ? 0 : dzenImage.hashCode()) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        DzenInfo dzenInfo = this.e;
        return Boolean.hashCode(this.g) + qoy.b((hashCode + (dzenInfo != null ? dzenInfo.b.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenTopStoriesHeader(image=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", info=");
        sb.append(this.e);
        sb.append(", hidden=");
        sb.append(this.f);
        sb.append(", isBold=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
