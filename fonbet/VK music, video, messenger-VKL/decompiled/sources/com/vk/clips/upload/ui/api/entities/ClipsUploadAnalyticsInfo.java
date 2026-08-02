package com.vk.clips.upload.ui.api.entities;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ClipsUploadAnalyticsInfo.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadAnalyticsInfo implements Parcelable {
    public static final Parcelable.Creator<ClipsUploadAnalyticsInfo> CREATOR = new a();
    public final String b;
    public final int c;

    /* compiled from: ClipsUploadAnalyticsInfo.kt */
    public static final class a implements Parcelable.Creator<ClipsUploadAnalyticsInfo> {
        @Override // android.os.Parcelable.Creator
        public final ClipsUploadAnalyticsInfo createFromParcel(Parcel parcel) {
            return new ClipsUploadAnalyticsInfo(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsUploadAnalyticsInfo[] newArray(int i) {
            return new ClipsUploadAnalyticsInfo[i];
        }
    }

    public ClipsUploadAnalyticsInfo(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
