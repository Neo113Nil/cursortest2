package com.vk.im.engine.models.emails;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserNameCase;
import xsna.epx;
import xsna.ho8;
import xsna.qtd0;
import xsna.zcl;

/* compiled from: Email.kt */
/* loaded from: classes2.dex */
public final class Email extends Serializer.StreamParcelableAdapter implements qtd0 {
    public static final Serializer.c<Email> CREATOR = new a();
    public final long b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Email> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Email a(Serializer serializer) {
            return new Email(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Email[i];
        }
    }

    public Email() {
        this(0L, null, 3, null);
    }

    public static Email zb(Email email, String str) {
        return new Email(email.b, str);
    }

    public final String Ab() {
        return this.c;
    }

    @Override // xsna.qtd0
    public final UserSex B2() {
        return UserSex.UNKNOWN;
    }

    @Override // xsna.qtd0
    public final String B3() {
        return "";
    }

    public final Long Bb() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.qtd0
    public final boolean C6() {
        return false;
    }

    @Override // xsna.qtd0
    public final ImageStatus E5() {
        return null;
    }

    @Override // xsna.qtd0
    public final String H5(UserNameCase userNameCase) {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean H7() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean K6() {
        return false;
    }

    @Override // xsna.qtd0
    public final String La() {
        return name();
    }

    @Override // xsna.qtd0
    public final boolean N0() {
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.qtd0
    public final String P5(UserNameCase userNameCase) {
        return name();
    }

    @Override // xsna.qtd0
    public final String Q2(UserNameCase userNameCase) {
        return name();
    }

    @Override // xsna.qtd0
    public final String Ra() {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean W1() {
        return true;
    }

    @Override // xsna.qtd0
    public final String c5() {
        return "";
    }

    @Override // xsna.qtd0
    public final String d6(UserNameCase userNameCase) {
        return name();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Email)) {
            return false;
        }
        Email email = (Email) obj;
        return this.b == email.b && epx.f(this.c, email.c);
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.b);
    }

    @Override // xsna.qtd0
    public final String h8() {
        return "";
    }

    @Override // xsna.qtd0
    public final String ha() {
        return I9(UserNameCase.NOM);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.qtd0
    public final boolean ib() {
        return false;
    }

    @Override // xsna.qtd0
    public final long id() {
        return this.b;
    }

    @Override // xsna.qtd0
    public final boolean ja() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean k5() {
        return false;
    }

    @Override // xsna.qtd0
    public final boolean ka() {
        return false;
    }

    @Override // xsna.qtd0
    public final String m2() {
        return "";
    }

    @Override // xsna.qtd0
    public final OnlineInfo mb() {
        return VisibleStatus.f;
    }

    @Override // xsna.qtd0
    public final String n6() {
        return "";
    }

    @Override // xsna.qtd0
    public final boolean n9() {
        return false;
    }

    @Override // xsna.qtd0
    public final String name() {
        return this.c;
    }

    @Override // xsna.qtd0
    public final boolean r5() {
        return false;
    }

    @Override // xsna.qtd0
    public final long r8() {
        return B7().b;
    }

    @Override // xsna.qtd0
    public final boolean t6() {
        return false;
    }

    @Override // xsna.qtd0
    public final Peer.Type t8() {
        return Peer.Type.EMAIL;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Email(id=");
        sb.append(this.b);
        sb.append(", email=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // xsna.qtd0
    public final Long v5() {
        return null;
    }

    public /* synthetic */ Email(long j, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }

    public Email(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public Email(Serializer serializer, zcl zclVar) {
        this(serializer.w(), serializer.H());
    }
}
