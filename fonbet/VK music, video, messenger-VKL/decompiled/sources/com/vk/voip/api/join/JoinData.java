package com.vk.voip.api.join;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.im.ImageList;

/* compiled from: JoinData.kt */
/* loaded from: classes7.dex */
public final class JoinData implements Parcelable {
    public static final Parcelable.Creator<JoinData> CREATOR = new a();
    public final String b;
    public final String c;
    public final ImageList d;

    /* compiled from: JoinData.kt */
    public static final class a implements Parcelable.Creator<JoinData> {
        @Override // android.os.Parcelable.Creator
        public final JoinData createFromParcel(Parcel parcel) {
            return new JoinData(parcel.readString(), parcel.readString(), (ImageList) parcel.readParcelable(JoinData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final JoinData[] newArray(int i) {
            return new JoinData[i];
        }
    }

    public JoinData(String str, String str2, ImageList imageList) {
        this.b = str;
        this.c = str2;
        this.d = imageList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
