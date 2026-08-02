package com.vk.auth.screendata;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: DefaultFirstScreenData.kt */
/* loaded from: classes.dex */
public final class DefaultFirstScreenData implements Parcelable {
    public static final Parcelable.Creator<DefaultFirstScreenData> CREATOR = new a();
    public final boolean b;
    public final String c;
    public final String d;

    /* compiled from: DefaultFirstScreenData.kt */
    public static final class a implements Parcelable.Creator<DefaultFirstScreenData> {
        @Override // android.os.Parcelable.Creator
        public final DefaultFirstScreenData createFromParcel(Parcel parcel) {
            return new DefaultFirstScreenData(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultFirstScreenData[] newArray(int i) {
            return new DefaultFirstScreenData[i];
        }
    }

    public DefaultFirstScreenData(boolean z, String str, String str2) {
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
