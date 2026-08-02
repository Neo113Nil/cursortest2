package com.vk.clips.viewer.edit.presentation.feature.state;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.shy;

/* compiled from: ClipEditSdkCoverImage.kt */
/* loaded from: classes17.dex */
public final class CoverImageUrl implements Parcelable {
    public static final Parcelable.Creator<CoverImageUrl> CREATOR = new a();
    public final String b;
    public final int c;
    public final boolean d;

    /* compiled from: ClipEditSdkCoverImage.kt */
    public static final class a implements Parcelable.Creator<CoverImageUrl> {
        @Override // android.os.Parcelable.Creator
        public final CoverImageUrl createFromParcel(Parcel parcel) {
            return new CoverImageUrl(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CoverImageUrl[] newArray(int i) {
            return new CoverImageUrl[i];
        }
    }

    public CoverImageUrl(String str, int i, boolean z) {
        this.b = str;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverImageUrl)) {
            return false;
        }
        CoverImageUrl coverImageUrl = (CoverImageUrl) obj;
        return epx.f(this.b, coverImageUrl.b) && this.c == coverImageUrl.c && this.d == coverImageUrl.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoverImageUrl(url=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", isBase=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
