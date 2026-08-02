package com.vk.clips.sdk.shared.api.comment;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.uqi;

/* compiled from: SdkReplyInfo.kt */
/* loaded from: classes17.dex */
public final class SdkReplyInfo implements Parcelable {
    public static final Parcelable.Creator<SdkReplyInfo> CREATOR = new a();
    public final int b;
    public final Integer c;

    /* compiled from: SdkReplyInfo.kt */
    public static final class a implements Parcelable.Creator<SdkReplyInfo> {
        @Override // android.os.Parcelable.Creator
        public final SdkReplyInfo createFromParcel(Parcel parcel) {
            return new SdkReplyInfo(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SdkReplyInfo[] newArray(int i) {
            return new SdkReplyInfo[i];
        }
    }

    public SdkReplyInfo(int i, Integer num) {
        this.b = i;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkReplyInfo)) {
            return false;
        }
        SdkReplyInfo sdkReplyInfo = (SdkReplyInfo) obj;
        return this.b == sdkReplyInfo.b && epx.f(this.c, sdkReplyInfo.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkReplyInfo(commentId=");
        sb.append(this.b);
        sb.append(", parentCommentId=");
        return uqi.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
