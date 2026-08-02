package com.vk.im.engine.models.dialogs;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import defpackage.q0;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: DialogMember.kt */
/* loaded from: classes2.dex */
public final class DialogMember extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<DialogMember> CREATOR = new a();
    public final Peer b;
    public final Peer c;
    public final long d;
    public final boolean e;
    public final Integer f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DialogMember> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DialogMember a(Serializer serializer) {
            return new DialogMember(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DialogMember[i];
        }
    }

    public DialogMember() {
        this(null, null, 0L, false, null, null, false, false, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.Y(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.V(this.f);
        serializer.m0(this.g);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogMember)) {
            return false;
        }
        DialogMember dialogMember = (DialogMember) obj;
        return epx.f(this.b, dialogMember.b) && epx.f(this.c, dialogMember.c) && this.d == dialogMember.d && this.e == dialogMember.e && epx.f(this.f, dialogMember.f) && epx.f(this.g, dialogMember.g) && this.h == dialogMember.h && this.i == dialogMember.i && this.j == dialogMember.j;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        Integer num = this.f;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.g;
        return Boolean.hashCode(this.j) + qoy.b(qoy.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMember(member=");
        sb.append(this.b);
        sb.append(", invitedBy=");
        sb.append(this.c);
        sb.append(", date=");
        sb.append(this.d);
        sb.append(", isRequest=");
        sb.append(this.e);
        sb.append(", incognitoId=");
        sb.append(this.f);
        sb.append(", incognitoName=");
        sb.append(this.g);
        sb.append(", isAdmin=");
        sb.append(this.h);
        sb.append(", canKick=");
        sb.append(this.i);
        sb.append(", isRestrictedToWrite=");
        return q0.a(sb, this.j, ')');
    }

    public final boolean zb() {
        Peer peer = this.b;
        peer.getClass();
        return peer.Ab(Peer.Type.UNKNOWN) && this.f != null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DialogMember(Peer peer, Peer peer2, long j, boolean z, Integer num, String str, boolean z2, boolean z3, boolean z4, int i, zcl zclVar) {
        this(peer, peer2, j, r9, r10, r11, r12, r13, r14);
        boolean z5;
        boolean z6;
        String str2;
        boolean z7;
        boolean z8;
        Integer num2;
        peer = (i & 1) != 0 ? Peer.Unknown.e : peer;
        peer2 = (i & 2) != 0 ? Peer.Unknown.e : peer2;
        j = (i & 4) != 0 ? 0L : j;
        z = (i & 8) != 0 ? false : z;
        num = (i & 16) != 0 ? null : num;
        str = (i & 32) != 0 ? null : str;
        z2 = (i & 64) != 0 ? false : z2;
        z3 = (i & 128) != 0 ? false : z3;
        if ((i & 256) != 0) {
            z5 = false;
            z7 = z2;
            z6 = z3;
            num2 = num;
            str2 = str;
            z8 = z;
        } else {
            z5 = z4;
            z6 = z3;
            str2 = str;
            z7 = z2;
            z8 = z;
            num2 = num;
        }
    }

    public DialogMember(Peer peer, Peer peer2, long j, boolean z, Integer num, String str, boolean z2, boolean z3, boolean z4) {
        this.b = peer;
        this.c = peer2;
        this.d = j;
        this.e = z;
        this.f = num;
        this.g = str;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public DialogMember(Serializer serializer, zcl zclVar) {
        this((Peer) serializer.G(Peer.class.getClassLoader()), (Peer) serializer.G(Peer.class.getClassLoader()), serializer.w(), serializer.m(), serializer.v(), serializer.I(), serializer.m(), serializer.m(), serializer.m());
    }
}
