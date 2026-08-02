package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import defpackage.q0;
import java.util.regex.Pattern;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.sr;
import xsna.urd0;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachArticle.kt */
/* loaded from: classes2.dex */
public final class AttachArticle implements AttachWithId, ztx0 {
    public static final Serializer.c<AttachArticle> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public UserId d;
    public long e;
    public String f;
    public String g;
    public String h;
    public long i;
    public String j;
    public String k;
    public boolean l;
    public int m;
    public ImageList n;
    public String o;
    public boolean p;
    public boolean q;
    public ArticleDonut r;
    public final String s;
    public final int t;
    public final boolean u;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachArticle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachArticle a(Serializer serializer) {
            return new AttachArticle(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachArticle[i];
        }
    }

    static {
        Pattern.compile("https?://([a-z0-9.-]+)?vk.com/@[a-zA-Z0-9-_]+(\\?[a-zA-Z0-9=-_&]+)?");
    }

    public AttachArticle() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = "";
        this.g = "";
        this.h = "";
        this.j = "";
        this.k = "";
        this.n = new ImageList(null, 1, null);
        this.o = "";
        this.p = true;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return this.j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.Y(this.e);
        serializer.e0(this.d);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.Y(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.f);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.S(this.m);
        serializer.i0(this.n);
        serializer.j0(this.o);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.i0(this.r);
        serializer.j0(this.s);
        serializer.S(this.t);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
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
        return new AttachArticle(this);
    }

    @Override // xsna.ztx0
    public final ImageList d() {
        return new ImageList(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachArticle)) {
            return false;
        }
        AttachArticle attachArticle = (AttachArticle) obj;
        return this.b == attachArticle.b && this.c == attachArticle.c && this.e == attachArticle.e && epx.f(this.d, attachArticle.d) && epx.f(this.f, attachArticle.f) && epx.f(this.g, attachArticle.g) && epx.f(this.h, attachArticle.h) && this.i == attachArticle.i && epx.f(this.j, attachArticle.j) && epx.f(this.k, attachArticle.k) && this.l == attachArticle.l && this.m == attachArticle.m && epx.f(this.n, attachArticle.n) && epx.f(this.o, attachArticle.o) && this.p == attachArticle.p && this.q == attachArticle.q && epx.f(this.r, attachArticle.r) && epx.f(this.s, attachArticle.s) && this.t == attachArticle.t && this.u == attachArticle.u;
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return this.n;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(fw3.a((qoy.b(urd0.a(urd0.a(bh10.a(urd0.a(urd0.a(urd0.a(bh10.a((bo.a(this.c, this.b * 31, 31) + ((int) this.e)) * 31, 31, this.d.b), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l) + this.m) * 31, 31, this.n.b), 31, this.o), 31, this.p), 31, this.q);
        ArticleDonut articleDonut = this.r;
        int hashCode = (b + (articleDonut != null ? articleDonut.hashCode() : 0)) * 31;
        String str = this.s;
        return Boolean.hashCode(this.u) + ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.t) * 31);
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
            StringBuilder sb = new StringBuilder("AttachArticle(localId=");
            sb.append(this.b);
            sb.append(", syncState=");
            sb.append(this.c);
            sb.append(", id=");
            sb.append(this.e);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", state='");
            sb.append(this.f);
            sb.append("', isFavorite=");
            sb.append(this.l);
            sb.append(", views=");
            sb.append(this.m);
            sb.append(", canReport=");
            sb.append(this.p);
            sb.append(", noFooter = ");
            sb.append(this.q);
            sb.append(", donut = ");
            sb.append(this.r);
            sb.append(", leadDescription=");
            sb.append(this.s);
            sb.append(", timeToRead=");
            sb.append(this.t);
            sb.append(", canEdit=");
            return q0.a(sb, this.u, ')');
        }
        StringBuilder sb2 = new StringBuilder("AttachArticle(localId=");
        sb2.append(this.b);
        sb2.append(", syncState=");
        sb2.append(this.c);
        sb2.append(", id=");
        sb2.append(this.e);
        sb2.append(", ownerId=");
        sb2.append(this.d);
        sb2.append(", state='");
        sb2.append(this.f);
        sb2.append("', title='");
        sb2.append(this.g);
        sb2.append("', subtitle='");
        sb2.append(this.h);
        sb2.append("', published=");
        sb2.append(this.i);
        sb2.append(", url='");
        sb2.append(this.j);
        sb2.append("', viewUrl='");
        sb2.append(this.k);
        sb2.append("', isFavorite=");
        sb2.append(this.l);
        sb2.append(", views=");
        sb2.append(this.m);
        sb2.append(", imageList=");
        sb2.append(this.n);
        sb2.append(", accessKey='");
        sb2.append(this.o);
        sb2.append("', leadDescription=");
        sb2.append(this.s);
        sb2.append(", timeToRead=");
        sb2.append(this.t);
        sb2.append(", canEdit=");
        return q0.a(sb2, this.u, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachArticle(AttachArticle attachArticle) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = "";
        this.g = "";
        this.h = "";
        this.j = "";
        this.k = "";
        this.n = new ImageList(null, 1, null);
        this.o = "";
        this.p = true;
        this.b = attachArticle.b;
        this.c = attachArticle.c;
        this.e = attachArticle.e;
        this.d = attachArticle.d;
        this.g = attachArticle.g;
        this.h = attachArticle.h;
        this.i = attachArticle.i;
        this.j = attachArticle.j;
        this.k = attachArticle.k;
        this.f = attachArticle.f;
        this.l = attachArticle.l;
        this.m = attachArticle.m;
        ImageList imageList = attachArticle.n;
        imageList.getClass();
        this.n = new ImageList(imageList);
        this.o = attachArticle.o;
        this.p = attachArticle.p;
        this.q = attachArticle.q;
        this.r = attachArticle.r;
        this.t = attachArticle.t;
        this.u = attachArticle.u;
    }

    public AttachArticle(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.f = "";
        this.g = "";
        this.h = "";
        this.j = "";
        this.k = "";
        this.n = new ImageList(null, 1, null);
        this.o = "";
        this.p = true;
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.w();
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = serializer.w();
        this.j = serializer.H();
        this.k = serializer.H();
        this.f = serializer.H();
        this.l = serializer.m();
        this.m = serializer.u();
        this.n = (ImageList) serializer.G(ImageList.class.getClassLoader());
        this.o = serializer.H();
        this.p = serializer.m();
        this.q = serializer.m();
        this.r = (ArticleDonut) serializer.G(ArticleDonut.class.getClassLoader());
        this.s = serializer.H();
        this.t = serializer.u();
        this.u = serializer.m();
    }
}
