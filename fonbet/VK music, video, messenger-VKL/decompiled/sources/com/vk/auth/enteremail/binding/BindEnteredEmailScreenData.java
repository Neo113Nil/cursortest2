package com.vk.auth.enteremail.binding;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: BindEnteredEmailScreenData.kt */
/* loaded from: classes15.dex */
public final class BindEnteredEmailScreenData implements Parcelable {
    public static final Parcelable.Creator<BindEnteredEmailScreenData> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;

    /* compiled from: BindEnteredEmailScreenData.kt */
    public static final class a implements Parcelable.Creator<BindEnteredEmailScreenData> {
        @Override // android.os.Parcelable.Creator
        public final BindEnteredEmailScreenData createFromParcel(Parcel parcel) {
            return new BindEnteredEmailScreenData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BindEnteredEmailScreenData[] newArray(int i) {
            return new BindEnteredEmailScreenData[i];
        }
    }

    public BindEnteredEmailScreenData(String str, String str2, boolean z, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
