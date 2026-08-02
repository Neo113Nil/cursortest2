package com.vk.dto.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import defpackage.q0;
import xsna.bh10;
import xsna.bo;
import xsna.cqm0;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.sr;
import xsna.t33;
import xsna.urd0;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachMarket.kt */
/* loaded from: classes18.dex */
public final class AttachMarket implements AttachWithId, ztx0 {
    public static final Serializer.c<AttachMarket> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public long e;
    public String f;
    public String g;
    public long h;
    public long i;
    public int j;
    public String k;
    public String l;
    public String m;
    public String n;
    public AttachMarketRejectInfo o;
    public boolean p;
    public ImageList q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public long v;
    public String w;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachMarket> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachMarket a(Serializer serializer) {
            return new AttachMarket(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachMarket[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachMarket() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = "";
        this.g = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.q = new ImageList(null, 1, 0 == true ? 1 : 0);
        this.r = "";
        this.w = "";
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        String a2 = cqm0.a(this.w);
        if (a2 != null) {
            return a2;
        }
        StringBuilder a3 = t33.a("https://", str, "/market?w=product");
        a3.append(this.d);
        a3.append('_');
        a3.append(this.e);
        return a3.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.Y(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.e0(this.d);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.i0(this.o);
        serializer.i0(this.q);
        serializer.j0(this.r);
        serializer.Y(this.h);
        serializer.Y(this.i);
        serializer.S(this.j);
        serializer.j0(this.k);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.Y(this.v);
        serializer.j0(this.w);
        serializer.j0(this.n);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachMarket(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachMarket.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachMarket attachMarket = (AttachMarket) obj;
        return this.b == attachMarket.b && this.c == attachMarket.c && this.e == attachMarket.e && epx.f(this.f, attachMarket.f) && epx.f(this.g, attachMarket.g) && epx.f(this.d, attachMarket.d) && this.h == attachMarket.h && this.i == attachMarket.i && this.j == attachMarket.j && epx.f(this.k, attachMarket.k) && epx.f(this.l, attachMarket.l) && epx.f(this.m, attachMarket.m) && epx.f(this.o, attachMarket.o) && epx.f(this.q, attachMarket.q) && epx.f(this.r, attachMarket.r) && this.p == attachMarket.p && this.s == attachMarket.s && this.t == attachMarket.t && this.u == attachMarket.u && this.v == attachMarket.v && epx.f(this.w, attachMarket.w) && epx.f(this.n, attachMarket.n);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return this.q;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.n.hashCode() + urd0.a(bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(fw3.a(urd0.a(urd0.a(urd0.a(shy.a(this.j, (((bh10.a(urd0.a(urd0.a((bo.a(this.c, this.b * 31, 31) + ((int) this.e)) * 31, 31, this.f), 31, this.g), 31, this.d.b) + ((int) this.h)) * 31) + ((int) this.i)) * 31, 31), 31, this.k), 31, this.l), 31, this.m), 31, this.q.b), 31, this.r), 31, this.p), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.b = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.d;
    }

    public final String toString() {
        if (!BuildInfo.h()) {
            StringBuilder sb = new StringBuilder("AttachMarket(localId=");
            sb.append(this.b);
            sb.append(", syncState=");
            sb.append(this.c);
            sb.append(", id=");
            sb.append(this.e);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", priceText='");
            sb.append(this.l);
            sb.append("', priceOldText='");
            sb.append(this.m);
            sb.append("', loyaltyTextAmount=");
            sb.append(this.n);
            sb.append(", rejectInfo=");
            sb.append(this.o);
            sb.append(", isOwner=");
            sb.append(this.s);
            sb.append(", isAdult=");
            sb.append(this.t);
            sb.append(", isHardBlocked=");
            return q0.a(sb, this.u, ')');
        }
        return "AttachMarket(localId=" + this.b + ", syncState=" + this.c + ", id=" + this.e + ", title='" + this.f + "', description='" + this.g + "', ownerId=" + this.d + ", priceText='" + this.l + "', priceOldText='" + this.m + "', loyaltyTextAmount ='" + this.n + "', imageList=" + this.q + ", accessKey=" + this.r + ", isPriceListService=" + this.p + "), marketUrl=" + this.w + ", isAdult=" + this.t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachMarket(AttachMarket attachMarket) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = "";
        this.g = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.q = new ImageList(null, 1, 0 == true ? 1 : 0);
        this.r = "";
        this.w = "";
        this.b = attachMarket.b;
        this.c = attachMarket.c;
        this.e = attachMarket.e;
        this.f = attachMarket.f;
        this.g = attachMarket.g;
        this.d = attachMarket.d;
        this.h = attachMarket.h;
        this.i = attachMarket.i;
        this.j = attachMarket.j;
        this.k = attachMarket.k;
        this.l = attachMarket.l;
        this.m = attachMarket.m;
        this.n = attachMarket.n;
        this.o = attachMarket.o;
        ImageList imageList = attachMarket.q;
        imageList.getClass();
        this.q = new ImageList(imageList);
        this.r = attachMarket.r;
        this.p = attachMarket.p;
        this.s = attachMarket.s;
        this.t = attachMarket.t;
        this.u = attachMarket.u;
        this.v = attachMarket.v;
        this.w = attachMarket.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachMarket(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = "";
        this.g = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.q = new ImageList(null, 1, 0 == true ? 1 : 0);
        this.r = "";
        this.w = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.w();
        this.f = serializer.H();
        this.g = serializer.H();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.l = serializer.H();
        this.m = serializer.H();
        this.o = (AttachMarketRejectInfo) serializer.G(AttachMarketRejectInfo.class.getClassLoader());
        this.q = (ImageList) serializer.G(ImageList.class.getClassLoader());
        this.r = serializer.H();
        this.h = serializer.w();
        this.i = serializer.w();
        this.j = serializer.u();
        String H = serializer.H();
        this.k = H != null ? H : "";
        this.p = serializer.m();
        this.s = serializer.m();
        this.t = serializer.m();
        this.u = serializer.m();
        this.v = serializer.w();
        this.w = serializer.H();
        this.n = serializer.H();
    }
}
