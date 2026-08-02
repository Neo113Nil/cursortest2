package com.vk.clips.viewer.edit.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.shy;

/* compiled from: ClipEditSdkThumbsItem.kt */
/* loaded from: classes17.dex */
public final class ClipEditSdkThumbsItem implements Parcelable {
    public static final Parcelable.Creator<ClipEditSdkThumbsItem> CREATOR = new a();
    public static final ClipEditSdkThumbsItem h = new ClipEditSdkThumbsItem(0, 0, 0, 0, 0, EmptyList.b);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final List<String> g;

    /* compiled from: ClipEditSdkThumbsItem.kt */
    public static final class a implements Parcelable.Creator<ClipEditSdkThumbsItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkThumbsItem createFromParcel(Parcel parcel) {
            return new ClipEditSdkThumbsItem(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkThumbsItem[] newArray(int i) {
            return new ClipEditSdkThumbsItem[i];
        }
    }

    public ClipEditSdkThumbsItem(int i, int i2, int i3, int i4, int i5, List<String> list) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipEditSdkThumbsItem)) {
            return false;
        }
        ClipEditSdkThumbsItem clipEditSdkThumbsItem = (ClipEditSdkThumbsItem) obj;
        return this.b == clipEditSdkThumbsItem.b && this.c == clipEditSdkThumbsItem.c && this.d == clipEditSdkThumbsItem.d && this.e == clipEditSdkThumbsItem.e && this.f == clipEditSdkThumbsItem.f && epx.f(this.g, clipEditSdkThumbsItem.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipEditSdkThumbsItem(frameWidth=");
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
}
