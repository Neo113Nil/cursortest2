package com.vk.im.engine.models.messages;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.vu5;
import xsna.zcl;

/* compiled from: WithReactions.kt */
/* loaded from: classes2.dex */
public final class MsgReactionImpl implements MsgReaction {
    public static final Serializer.c<MsgReactionImpl> CREATOR = new a();
    public final int b;
    public final List<Long> c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MsgReactionImpl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MsgReactionImpl a(Serializer serializer) {
            return new MsgReactionImpl(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsgReactionImpl[i];
        }
    }

    public MsgReactionImpl(int i, List<Long> list, int i2) {
        this.b = i;
        this.c = list;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.a0(this.c);
        serializer.S(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgReactionImpl)) {
            return false;
        }
        MsgReactionImpl msgReactionImpl = (MsgReactionImpl) obj;
        return this.b == msgReactionImpl.b && epx.f(this.c, msgReactionImpl.c) && this.d == msgReactionImpl.d;
    }

    @Override // com.vk.im.engine.models.messages.MsgReaction
    public final int getCount() {
        return this.d;
    }

    @Override // com.vk.im.engine.models.messages.MsgReaction
    public final int getId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fw3.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgReactionImpl(id=");
        sb.append(this.b);
        sb.append(", peerIds=");
        sb.append(this.c);
        sb.append(", count=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // com.vk.im.engine.models.messages.MsgReaction
    public final List<Long> u2() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public MsgReactionImpl(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.f(), serializer.u());
    }
}
