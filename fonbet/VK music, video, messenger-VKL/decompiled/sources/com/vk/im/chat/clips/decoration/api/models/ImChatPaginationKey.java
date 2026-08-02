package com.vk.im.chat.clips.decoration.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import xsna.bh10;
import xsna.vu5;

/* compiled from: ImChatPaginationKey.kt */
/* loaded from: classes2.dex */
public final class ImChatPaginationKey implements ClipsDecorationPaginationKey {
    public static final Parcelable.Creator<ImChatPaginationKey> CREATOR = new a();
    public final int b;
    public final long c;
    public final int d;

    /* compiled from: ImChatPaginationKey.kt */
    public static final class a implements Parcelable.Creator<ImChatPaginationKey> {
        @Override // android.os.Parcelable.Creator
        public final ImChatPaginationKey createFromParcel(Parcel parcel) {
            return new ImChatPaginationKey(parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImChatPaginationKey[] newArray(int i) {
            return new ImChatPaginationKey[i];
        }
    }

    public ImChatPaginationKey(int i, long j, int i2) {
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImChatPaginationKey)) {
            return false;
        }
        ImChatPaginationKey imChatPaginationKey = (ImChatPaginationKey) obj;
        return this.b == imChatPaginationKey.b && this.c == imChatPaginationKey.c && this.d == imChatPaginationKey.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImChatPaginationKey(cnvMsgId=");
        sb.append(this.b);
        sb.append(", dialogId=");
        sb.append(this.c);
        sb.append(", attachPosition=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }
}
