package com.vk.voip.dto.call_member;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import xsna.arm0;
import xsna.drm0;
import xsna.epx;
import xsna.fkq0;
import xsna.gzs;
import xsna.j5g;
import xsna.s3q0;
import xsna.vu5;

/* compiled from: CallMemberId.kt */
/* loaded from: classes7.dex */
public final class CallMemberId extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CallMemberId> CREATOR = new b();
    public final String b;
    public final int c;

    /* compiled from: CallMemberId.kt */
    public static final class a {
        public static CallMemberId a(String str) {
            List c0 = drm0.c0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
            return new CallMemberId((String) j5g.Y(c0), c0.size() > 1 ? Integer.parseInt((String) c0.get(1)) : 0);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CallMemberId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CallMemberId a(Serializer serializer) {
            return new CallMemberId(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CallMemberId[i];
        }
    }

    public CallMemberId(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final String Ab() {
        return this.b;
    }

    public final UserId Bb() {
        Long n = arm0.n(this.b);
        if (n == null) {
            return null;
        }
        long longValue = n.longValue();
        gzs<s3q0> gzsVar = fkq0.a;
        return new UserId(longValue);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallMemberId)) {
            return false;
        }
        CallMemberId callMemberId = (CallMemberId) obj;
        return epx.f(this.b, callMemberId.b) && this.c == callMemberId.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallMemberId(participantId=");
        sb.append(this.b);
        sb.append(", deviceIndex=");
        return vu5.b(sb, this.c, ')');
    }

    public final int zb() {
        return this.c;
    }

    public CallMemberId(Serializer serializer) {
        this(serializer.H(), serializer.u());
    }
}
