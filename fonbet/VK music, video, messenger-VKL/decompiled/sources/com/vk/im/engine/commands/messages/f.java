package com.vk.im.engine.commands.messages;

import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import defpackage.q0;
import xsna.bn30;
import xsna.d040;
import xsna.epx;
import xsna.le6;
import xsna.s3q0;
import xsna.w2w;

/* compiled from: MsgMarkAsPlayedViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class f extends le6<s3q0> {
    public final Integer b;
    public final Integer c;
    public final Object d;
    public final boolean e;

    /* compiled from: MsgMarkAsPlayedViaBgCmd.kt */
    public static final class a {
        public static f a(int i) {
            return new f(null, Integer.valueOf(i), "xn00", false);
        }
    }

    public f(Integer num, Integer num2, Object obj, boolean z) {
        this.b = num;
        this.c = num2;
        this.d = obj;
        this.e = z;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Msg v;
        d040 o = w2wVar.I0().o();
        Integer num = this.b;
        if (num != null) {
            v = o.L(num.intValue());
        } else {
            Integer num2 = this.c;
            if (num2 == null) {
                throw new IllegalStateException("One of parameters must be provided");
            }
            v = o.v(num2.intValue());
        }
        MsgFromUser msgFromUser = v instanceof MsgFromUser ? (MsgFromUser) v : null;
        if (msgFromUser != null) {
            boolean z = msgFromUser.S0() || msgFromUser.F0() || (this.e && msgFromUser.Ea());
            if (msgFromUser.i && !msgFromUser.cc() && z) {
                o.z(msgFromUser.b, Boolean.TRUE);
                w2wVar.S0().w(this.d, msgFromUser);
                w2wVar.O0().a(new bn30(msgFromUser.b));
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && this.e == fVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Object obj = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgMarkAsPlayedViaBgCmd(msgLocalId=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", changerTag=");
        sb.append(this.d);
        sb.append(", includeClips=");
        return q0.a(sb, this.e, ')');
    }
}
