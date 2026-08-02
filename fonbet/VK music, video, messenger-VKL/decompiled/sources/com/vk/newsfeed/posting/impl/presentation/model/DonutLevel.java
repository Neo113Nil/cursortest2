package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class DonutLevel implements Parcelable {
    public static final Parcelable.Creator<DonutLevel> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: PostingViewState.kt */
    public static final class a implements Parcelable.Creator<DonutLevel> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevel createFromParcel(Parcel parcel) {
            return new DonutLevel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevel[] newArray(int i) {
            return new DonutLevel[i];
        }
    }

    public DonutLevel(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutLevel)) {
            return false;
        }
        DonutLevel donutLevel = (DonutLevel) obj;
        return this.b == donutLevel.b && epx.f(this.c, donutLevel.c) && epx.f(this.d, donutLevel.d) && epx.f(this.e, donutLevel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevel(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", defaultTeaserText=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
