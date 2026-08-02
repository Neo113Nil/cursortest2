package com.vk.sharing.api.dto;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class WallRepostSettings implements Parcelable {
    public static final Parcelable.Creator<WallRepostSettings> CREATOR = new a();
    public static final WallRepostSettings g = new WallRepostSettings(false, false, false, false, false);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public class a implements Parcelable.Creator<WallRepostSettings> {
        @Override // android.os.Parcelable.Creator
        public final WallRepostSettings createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4 = false;
            boolean z5 = true;
            boolean z6 = parcel.readByte() != 0;
            if (parcel.readByte() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readByte() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readByte() == 0) {
                z2 = z3;
            }
            return new WallRepostSettings(z6, z4, z5, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final WallRepostSettings[] newArray(int i) {
            return new WallRepostSettings[i];
        }
    }

    public WallRepostSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
    }
}
