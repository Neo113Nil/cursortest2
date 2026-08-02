package com.vk.clips.upload.edit.api.preview;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.shy;
import xsna.zcl;

/* compiled from: PreviewThumbs.kt */
/* loaded from: classes17.dex */
public final class PreviewThumbs implements Parcelable {
    public static final Parcelable.Creator<PreviewThumbs> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final List<String> g;

    /* compiled from: PreviewThumbs.kt */
    public static final class a implements Parcelable.Creator<PreviewThumbs> {
        @Override // android.os.Parcelable.Creator
        public final PreviewThumbs createFromParcel(Parcel parcel) {
            return new PreviewThumbs(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final PreviewThumbs[] newArray(int i) {
            return new PreviewThumbs[i];
        }
    }

    public PreviewThumbs() {
        this(0, 0, 0, 0, 0, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewThumbs)) {
            return false;
        }
        PreviewThumbs previewThumbs = (PreviewThumbs) obj;
        return this.b == previewThumbs.b && this.c == previewThumbs.c && this.d == previewThumbs.d && this.e == previewThumbs.e && this.f == previewThumbs.f && epx.f(this.g, previewThumbs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewThumbs(frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        sb.append(this.c);
        sb.append(", countPerRow=");
        sb.append(this.d);
        sb.append(", countPerImage=");
        sb.append(this.e);
        sb.append(", countTotal=");
        sb.append(this.f);
        sb.append(", links=");
        return ms9.a(')', sb, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeStringList(this.g);
    }

    public PreviewThumbs(int i, int i2, int i3, int i4, int i5, List<String> list) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = list;
    }

    public PreviewThumbs(int i, int i2, int i3, int i4, int i5, List list, int i6, zcl zclVar) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? EmptyList.b : list);
    }
}
