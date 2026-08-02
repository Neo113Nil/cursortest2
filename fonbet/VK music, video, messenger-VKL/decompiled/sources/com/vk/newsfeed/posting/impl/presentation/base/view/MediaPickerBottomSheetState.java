package com.vk.newsfeed.posting.impl.presentation.base.view;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.shy;
import xsna.so;

/* compiled from: MediaPickerBottomSheetState.kt */
/* loaded from: classes4.dex */
public final class MediaPickerBottomSheetState implements Parcelable {
    public static final Parcelable.Creator<MediaPickerBottomSheetState> CREATOR = new a();
    public final int b;
    public final int c;
    public final ViewConstraint d;
    public final int e;
    public final int f;
    public final ViewConstraint g;
    public final float h;
    public final float i;
    public final float j;
    public final Float k;

    /* compiled from: MediaPickerBottomSheetState.kt */
    public static final class a implements Parcelable.Creator<MediaPickerBottomSheetState> {
        @Override // android.os.Parcelable.Creator
        public final MediaPickerBottomSheetState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Parcelable.Creator<ViewConstraint> creator = ViewConstraint.CREATOR;
            return new MediaPickerBottomSheetState(readInt, readInt2, creator.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), creator.createFromParcel(parcel), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPickerBottomSheetState[] newArray(int i) {
            return new MediaPickerBottomSheetState[i];
        }
    }

    public MediaPickerBottomSheetState(int i, int i2, ViewConstraint viewConstraint, int i3, int i4, ViewConstraint viewConstraint2, float f, float f2, float f3, Float f4) {
        this.b = i;
        this.c = i2;
        this.d = viewConstraint;
        this.e = i3;
        this.f = i4;
        this.g = viewConstraint2;
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPickerBottomSheetState)) {
            return false;
        }
        MediaPickerBottomSheetState mediaPickerBottomSheetState = (MediaPickerBottomSheetState) obj;
        return this.b == mediaPickerBottomSheetState.b && this.c == mediaPickerBottomSheetState.c && epx.f(this.d, mediaPickerBottomSheetState.d) && this.e == mediaPickerBottomSheetState.e && this.f == mediaPickerBottomSheetState.f && epx.f(this.g, mediaPickerBottomSheetState.g) && Float.compare(this.h, mediaPickerBottomSheetState.h) == 0 && Float.compare(this.i, mediaPickerBottomSheetState.i) == 0 && Float.compare(this.j, mediaPickerBottomSheetState.j) == 0 && epx.f(this.k, mediaPickerBottomSheetState.k);
    }

    public final int hashCode() {
        int a2 = b.a(this.j, b.a(this.i, b.a(this.h, (this.g.hashCode() + shy.a(this.f, shy.a(this.e, (this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31)) * 31, 31), 31)) * 31, 31), 31), 31);
        Float f = this.k;
        return a2 + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaPickerBottomSheetState(mediaPickerPagerMarginTop=");
        sb.append(this.b);
        sb.append(", mediaPickerPagerMarginBottom=");
        sb.append(this.c);
        sb.append(", mediaPickerPagerConstraint=");
        sb.append(this.d);
        sb.append(", mediaPickerNavigationHostMarginTop=");
        sb.append(this.e);
        sb.append(", mediaPickerNavigationHostMarginBottom=");
        sb.append(this.f);
        sb.append(", mediaPickerNavigationConstraint=");
        sb.append(this.g);
        sb.append(", mediaPickerDragHandleViewAlpha=");
        sb.append(this.h);
        sb.append(", mediaPickerTabLayoutAlpha=");
        sb.append(this.i);
        sb.append(", mediaPickerTopBarAlpha=");
        sb.append(this.j);
        sb.append(", expandProgress=");
        return so.b(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        this.g.writeToParcel(parcel, i);
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.i);
        parcel.writeFloat(this.j);
        Float f = this.k;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }
}
