package com.vk.feed.core.models.dzen;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.dzen.DzenNews;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: DzenNewsItem.kt */
/* loaded from: classes18.dex */
public final class DzenNewsItem implements Serializer.StreamParcelable {
    public static final Serializer.c<DzenNewsItem> CREATOR = new a();
    public final ImagePhoto b;
    public final DzenNews.ItemHeader c;
    public final String d;
    public final DzenStory e;
    public final String f;
    public final int g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DzenNewsItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DzenNewsItem a(Serializer serializer) {
            return new DzenNewsItem((ImagePhoto) serializer.G(ImagePhoto.class.getClassLoader()), (DzenNews.ItemHeader) serializer.G(DzenNews.ItemHeader.class.getClassLoader()), serializer.H(), (DzenStory) serializer.G(DzenStory.class.getClassLoader()), serializer.H(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DzenNewsItem[i];
        }
    }

    public DzenNewsItem(ImagePhoto imagePhoto, DzenNews.ItemHeader itemHeader, String str, DzenStory dzenStory, String str2, int i) {
        this.b = imagePhoto;
        this.c = itemHeader;
        this.d = str;
        this.e = dzenStory;
        this.f = str2;
        this.g = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.S(this.g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DzenNewsItem)) {
            return false;
        }
        DzenNewsItem dzenNewsItem = (DzenNewsItem) obj;
        return epx.f(this.b, dzenNewsItem.b) && epx.f(this.c, dzenNewsItem.c) && epx.f(this.d, dzenNewsItem.d) && epx.f(this.e, dzenNewsItem.e) && epx.f(this.f, dzenNewsItem.f) && this.g == dzenNewsItem.g;
    }

    public final int hashCode() {
        ImagePhoto imagePhoto = this.b;
        int hashCode = (this.e.hashCode() + urd0.a((this.c.hashCode() + ((imagePhoto == null ? 0 : imagePhoto.hashCode()) * 31)) * 31, 31, this.d)) * 31;
        String str = this.f;
        return Integer.hashCode(this.g) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenNewsItem(icon=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", feedId=");
        sb.append(this.d);
        sb.append(", story=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", date=");
        return vu5.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
