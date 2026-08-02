package com.vk.dto.polls;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;

/* compiled from: PollInfo.kt */
/* loaded from: classes18.dex */
public final class PollInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PollInfo> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PollInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PollInfo a(Serializer serializer) {
            return new PollInfo(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollInfo[i];
        }
    }

    public PollInfo(int i, UserId userId, boolean z) {
        this.b = i;
        this.c = userId;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollInfo)) {
            return false;
        }
        PollInfo pollInfo = (PollInfo) obj;
        return this.b == pollInfo.b && epx.f(this.c, pollInfo.c) && this.d == pollInfo.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollInfo(id=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", isBoard=");
        return q0.a(sb, this.d, ')');
    }
}
