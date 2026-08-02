package com.vk.im.engine.models.messages;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;

/* compiled from: CnvMsgId.kt */
/* loaded from: classes2.dex */
public final class CnvMsgId implements Serializer.StreamParcelable {
    public static final Serializer.c<CnvMsgId> CREATOR = new a();
    public final long b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CnvMsgId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CnvMsgId a(Serializer serializer) {
            return new CnvMsgId(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CnvMsgId[i];
        }
    }

    public CnvMsgId(long j, int i) {
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
        if (!(obj instanceof CnvMsgId)) {
            return false;
        }
        CnvMsgId cnvMsgId = (CnvMsgId) obj;
        return this.b == cnvMsgId.b && this.c == cnvMsgId.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgId(dialogId=");
        sb.append(this.b);
        sb.append(", msgCnvId=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public CnvMsgId(Serializer serializer) {
        this(serializer.w(), serializer.u());
    }
}
