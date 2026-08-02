package com.vk.newsfeed.posting.impl.presentation.base.view;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.shy;
import xsna.vu5;

/* compiled from: MediaPickerBottomSheetState.kt */
/* loaded from: classes4.dex */
public final class ViewConstraint implements Parcelable {
    public static final Parcelable.Creator<ViewConstraint> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: MediaPickerBottomSheetState.kt */
    public static final class a implements Parcelable.Creator<ViewConstraint> {
        @Override // android.os.Parcelable.Creator
        public final ViewConstraint createFromParcel(Parcel parcel) {
            return new ViewConstraint(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ViewConstraint[] newArray(int i) {
            return new ViewConstraint[i];
        }
    }

    public ViewConstraint(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewConstraint)) {
            return false;
        }
        ViewConstraint viewConstraint = (ViewConstraint) obj;
        return this.b == viewConstraint.b && this.c == viewConstraint.c && this.d == viewConstraint.d && this.e == viewConstraint.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewConstraint(topToTop=");
        sb.append(this.b);
        sb.append(", topToBottom=");
        sb.append(this.c);
        sb.append(", bottomToTop=");
        sb.append(this.d);
        sb.append(", bottomToBottom=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
