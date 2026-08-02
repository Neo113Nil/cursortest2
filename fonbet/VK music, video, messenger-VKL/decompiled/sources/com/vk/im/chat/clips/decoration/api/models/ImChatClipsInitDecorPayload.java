package com.vk.im.chat.clips.decoration.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.shy;
import xsna.zcl;

/* compiled from: ImChatClipsInitDecorPayload.kt */
/* loaded from: classes2.dex */
public final class ImChatClipsInitDecorPayload implements ClipsFeedDecorationPayload {
    public static final Parcelable.Creator<ImChatClipsInitDecorPayload> CREATOR = new a();
    public final int b;
    public final int c;
    public final Integer d;
    public final long e;
    public final boolean f;

    /* compiled from: ImChatClipsInitDecorPayload.kt */
    public static final class a implements Parcelable.Creator<ImChatClipsInitDecorPayload> {
        @Override // android.os.Parcelable.Creator
        public final ImChatClipsInitDecorPayload createFromParcel(Parcel parcel) {
            return new ImChatClipsInitDecorPayload(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImChatClipsInitDecorPayload[] newArray(int i) {
            return new ImChatClipsInitDecorPayload[i];
        }
    }

    public ImChatClipsInitDecorPayload(int i, int i2, Integer num, long j, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = j;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImChatClipsInitDecorPayload)) {
            return false;
        }
        ImChatClipsInitDecorPayload imChatClipsInitDecorPayload = (ImChatClipsInitDecorPayload) obj;
        return this.b == imChatClipsInitDecorPayload.b && this.c == imChatClipsInitDecorPayload.c && epx.f(this.d, imChatClipsInitDecorPayload.d) && this.e == imChatClipsInitDecorPayload.e && this.f == imChatClipsInitDecorPayload.f;
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        Integer num = this.d;
        return Boolean.hashCode(this.f) + bh10.a((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImChatClipsInitDecorPayload(cnvMsgId=");
        sb.append(this.b);
        sb.append(", attachPosition=");
        sb.append(this.c);
        sb.append(", linkedCmid=");
        sb.append(this.d);
        sb.append(", dialogId=");
        sb.append(this.e);
        sb.append(", isClipInReply=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeLong(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ ImChatClipsInitDecorPayload(int i, int i2, Integer num, long j, boolean z, int i3, zcl zclVar) {
        this(i, i2, num, j, (i3 & 16) != 0 ? false : z);
    }
}
