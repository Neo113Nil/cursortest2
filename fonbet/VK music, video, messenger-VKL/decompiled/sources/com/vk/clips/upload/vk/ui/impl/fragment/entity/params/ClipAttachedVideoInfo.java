package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.urd0;

/* compiled from: ClipAttachedVideoInfo.kt */
/* loaded from: classes17.dex */
public final class ClipAttachedVideoInfo implements Parcelable {
    public static final Parcelable.Creator<ClipAttachedVideoInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    /* compiled from: ClipAttachedVideoInfo.kt */
    public static final class a implements Parcelable.Creator<ClipAttachedVideoInfo> {
        @Override // android.os.Parcelable.Creator
        public final ClipAttachedVideoInfo createFromParcel(Parcel parcel) {
            return new ClipAttachedVideoInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipAttachedVideoInfo[] newArray(int i) {
            return new ClipAttachedVideoInfo[i];
        }
    }

    public ClipAttachedVideoInfo(String str, String str2, String str3, Integer num) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipAttachedVideoInfo)) {
            return false;
        }
        ClipAttachedVideoInfo clipAttachedVideoInfo = (ClipAttachedVideoInfo) obj;
        return epx.f(this.b, clipAttachedVideoInfo.b) && epx.f(this.c, clipAttachedVideoInfo.c) && epx.f(this.d, clipAttachedVideoInfo.d) && epx.f(this.e, clipAttachedVideoInfo.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Integer num = this.e;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipAttachedVideoInfo(title=");
        sb.append(this.b);
        sb.append(", picture=");
        sb.append(this.c);
        sb.append(", videoId=");
        sb.append(this.d);
        sb.append(", albumId=");
        return uqi.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
