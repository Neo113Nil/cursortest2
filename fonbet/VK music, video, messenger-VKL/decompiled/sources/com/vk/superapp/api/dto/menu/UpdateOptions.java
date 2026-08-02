package com.vk.superapp.api.dto.menu;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: UpdateOptions.kt */
/* loaded from: classes6.dex */
public final class UpdateOptions implements Parcelable {
    public static final a CREATOR = new a();
    public final long b;
    public final int c;
    public final boolean d;

    /* compiled from: UpdateOptions.kt */
    public static final class a implements Parcelable.Creator<UpdateOptions> {
        @Override // android.os.Parcelable.Creator
        public final UpdateOptions createFromParcel(Parcel parcel) {
            return new UpdateOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateOptions[] newArray(int i) {
            return new UpdateOptions[i];
        }
    }

    public UpdateOptions(long j, int i, boolean z) {
        this.b = j;
        this.c = i;
        this.d = z;
    }

    public final int d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public UpdateOptions(Parcel parcel) {
        this(parcel.readLong(), parcel.readInt(), parcel.readByte() != 0);
    }
}
