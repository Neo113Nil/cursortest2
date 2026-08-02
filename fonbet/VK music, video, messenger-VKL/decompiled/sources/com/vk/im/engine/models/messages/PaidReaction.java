package com.vk.im.engine.models.messages;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PaidReaction.kt */
/* loaded from: classes2.dex */
public final class PaidReaction implements Serializer.StreamParcelable {
    public final int b;
    public final int c;
    public static final PaidReaction d = new PaidReaction(0, 0);
    public static final Serializer.c<PaidReaction> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PaidReaction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PaidReaction a(Serializer serializer) {
            return new PaidReaction(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaidReaction[i];
        }
    }

    public PaidReaction(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
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
        if (!(obj instanceof PaidReaction)) {
            return false;
        }
        PaidReaction paidReaction = (PaidReaction) obj;
        return this.b == paidReaction.b && this.c == paidReaction.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaidReaction(count=");
        sb.append(this.b);
        sb.append(", userCount=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public PaidReaction(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.u());
    }
}
