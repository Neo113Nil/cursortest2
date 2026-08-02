package com.vk.core.util.state;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ByteArrayParcelable.kt */
/* loaded from: classes17.dex */
public final class ByteArrayParcelable implements Parcelable {
    public static final a CREATOR = new a();
    public final byte[] b;

    /* compiled from: ByteArrayParcelable.kt */
    public static final class a implements Parcelable.Creator<ByteArrayParcelable> {
        @Override // android.os.Parcelable.Creator
        public final ByteArrayParcelable createFromParcel(Parcel parcel) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new ByteArrayParcelable(bArr);
        }

        @Override // android.os.Parcelable.Creator
        public final ByteArrayParcelable[] newArray(int i) {
            return new ByteArrayParcelable[i];
        }
    }

    public ByteArrayParcelable(byte[] bArr) {
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.b;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }
}
