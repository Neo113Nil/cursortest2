package com.vk.newsfeed.common.posting.listfriends;

import defpackage.q0;
import xsna.bpn0;
import xsna.ecm;
import xsna.epx;
import xsna.hfz;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: ListsFriendsItem.kt */
/* loaded from: classes4.dex */
public final class a implements hfz {
    public final int b;
    public final String c;
    public final int d;
    public boolean e;
    public final boolean f;
    public final bpn0 g = new bpn0(new ecm(this, 21));

    public a(int i, int i2, String str, boolean z, boolean z2) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(shy.a(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListsFriendsItem(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", index=");
        sb.append(this.d);
        sb.append(", isCheckVisible=");
        sb.append(this.e);
        sb.append(", isCreated=");
        return q0.a(sb, this.f, ')');
    }
}
