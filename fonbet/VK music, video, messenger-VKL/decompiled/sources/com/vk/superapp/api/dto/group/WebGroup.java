package com.vk.superapp.api.dto.group;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WebGroup.kt */
/* loaded from: classes6.dex */
public final class WebGroup implements Parcelable {
    public static final a CREATOR = new a();
    public final long b;
    public final String c;
    public final String d;
    public final int e;

    /* compiled from: WebGroup.kt */
    public static final class a implements Parcelable.Creator<WebGroup> {
        @Override // android.os.Parcelable.Creator
        public final WebGroup createFromParcel(Parcel parcel) {
            return new WebGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebGroup[] newArray(int i) {
            return new WebGroup[i];
        }
    }

    public WebGroup(long j, String str, String str2, int i) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }

    public WebGroup(Parcel parcel) {
        this(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt());
    }
}
