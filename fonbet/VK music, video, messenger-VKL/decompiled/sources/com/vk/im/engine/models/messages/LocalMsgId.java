package com.vk.im.engine.models.messages;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: LocalMsgId.kt */
/* loaded from: classes2.dex */
public final class LocalMsgId implements Serializer.StreamParcelable {
    public static final Serializer.c<LocalMsgId> CREATOR = new a();
    public final long b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LocalMsgId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LocalMsgId a(Serializer serializer) {
            return new LocalMsgId(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocalMsgId[i];
        }
    }

    public LocalMsgId(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.S(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMsgId)) {
            return false;
        }
        LocalMsgId localMsgId = (LocalMsgId) obj;
        return this.b == localMsgId.b && this.c == localMsgId.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalMsgId(dialogId=");
        sb.append(this.b);
        sb.append(", localId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public LocalMsgId(Serializer serializer) {
        this(serializer.w(), serializer.u());
    }
}
