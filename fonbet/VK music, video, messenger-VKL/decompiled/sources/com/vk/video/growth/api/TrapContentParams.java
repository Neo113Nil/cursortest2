package com.vk.video.growth.api;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: VideoGrowthTrapArguments.kt */
/* loaded from: classes6.dex */
public final class TrapContentParams implements Parcelable {
    public static final Parcelable.Creator<TrapContentParams> CREATOR = new a();
    public final int b;
    public final int c;
    public final String d;

    /* compiled from: VideoGrowthTrapArguments.kt */
    public static final class a implements Parcelable.Creator<TrapContentParams> {
        @Override // android.os.Parcelable.Creator
        public final TrapContentParams createFromParcel(Parcel parcel) {
            return new TrapContentParams(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrapContentParams[] newArray(int i) {
            return new TrapContentParams[i];
        }
    }

    public TrapContentParams(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrapContentParams)) {
            return false;
        }
        TrapContentParams trapContentParams = (TrapContentParams) obj;
        return this.b == trapContentParams.b && this.c == trapContentParams.c && epx.f(this.d, trapContentParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrapContentParams(titleResId=");
        sb.append(this.b);
        sb.append(", subtitleResId=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}
