package com.vk.libvideo.adfree.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.lm50;
import xsna.urd0;

/* compiled from: BottomSheetViewState.kt */
/* loaded from: classes18.dex */
public final class BottomSheetViewState implements lm50, Parcelable {
    public static final Parcelable.Creator<BottomSheetViewState> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    /* compiled from: BottomSheetViewState.kt */
    public static final class a implements Parcelable.Creator<BottomSheetViewState> {
        @Override // android.os.Parcelable.Creator
        public final BottomSheetViewState createFromParcel(Parcel parcel) {
            return new BottomSheetViewState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BottomSheetViewState[] newArray(int i) {
            return new BottomSheetViewState[i];
        }
    }

    public BottomSheetViewState(String str, String str2, String str3, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetViewState)) {
            return false;
        }
        BottomSheetViewState bottomSheetViewState = (BottomSheetViewState) obj;
        return epx.f(this.b, bottomSheetViewState.b) && epx.f(this.c, bottomSheetViewState.c) && epx.f(this.d, bottomSheetViewState.d) && this.e == bottomSheetViewState.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetViewState(title=");
        sb.append(this.b);
        sb.append(", proceedTitle=");
        sb.append(this.c);
        sb.append(", termsOfServiceButtonTitle=");
        sb.append(this.d);
        sb.append(", forceDarkTheme=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
