package com.vk.libvideo.models.comment;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.uqi;

/* compiled from: ReplyInfo.kt */
/* loaded from: classes3.dex */
public final class ReplyInfo implements Parcelable {
    public static final Parcelable.Creator<ReplyInfo> CREATOR = new a();
    public final int b;
    public final Integer c;

    /* compiled from: ReplyInfo.kt */
    public static final class a implements Parcelable.Creator<ReplyInfo> {
        @Override // android.os.Parcelable.Creator
        public final ReplyInfo createFromParcel(Parcel parcel) {
            return new ReplyInfo(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReplyInfo[] newArray(int i) {
            return new ReplyInfo[i];
        }
    }

    public ReplyInfo(int i, Integer num) {
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
        if (!(obj instanceof ReplyInfo)) {
            return false;
        }
        ReplyInfo replyInfo = (ReplyInfo) obj;
        return this.b == replyInfo.b && epx.f(this.c, replyInfo.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyInfo(commentId=");
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
