package com.vk.im.engine.models.contacts;

import com.vk.contacts.AndroidContact;
import com.vk.dto.common.Peer;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.UserNameCase;
import java.util.Iterator;
import xsna.drm0;
import xsna.epx;
import xsna.q2a0;

/* compiled from: AndroidContactProfile.kt */
/* loaded from: classes2.dex */
public final class a implements q2a0 {
    public final AndroidContact b;
    public final long c;

    public a(AndroidContact androidContact) {
        Object obj;
        this.b = androidContact;
        this.c = androidContact.h;
        Iterator<T> it = androidContact.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (!drm0.N((String) obj)) {
                    break;
                }
            }
        }
    }

    @Override // xsna.qtd0
    public final UserSex B2() {
        return UserSex.UNKNOWN;
    }

    @Override // xsna.qtd0
    public final String B3() {
        return this.b.c;
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
        Object obj;
        Iterator<T> it = this.b.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!drm0.N((String) obj)) {
                break;
            }
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }

    @Override // xsna.qtd0
    public final String d6(UserNameCase userNameCase) {
        return this.b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.c);
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
        return this.b.hashCode();
    }

    @Override // xsna.qtd0
    public final boolean ib() {
        return false;
    }

    @Override // xsna.qtd0
    public final long id() {
        return this.c;
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
        return this.b.c;
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
        return Peer.Type.UNKNOWN;
    }

    public final String toString() {
        return "AndroidContactProfile(contact=" + this.b + ')';
    }

    @Override // xsna.qtd0
    public final Long v5() {
        return null;
    }
}
