package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.attaches.Product;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ButtonActionType;
import com.vk.im.engine.models.LinkTarget;
import com.vk.im.engine.models.attaches.ButtonIconType;
import com.vk.im.engine.models.attaches.ImageScaleType;
import io.reactivex.rxjava3.subjects.b;
import java.util.Map;
import kotlin.Lazy;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.lhg;
import xsna.sr;
import xsna.urd0;
import xsna.zcl;
import xsna.ztx0;

/* compiled from: AttachLink.kt */
/* loaded from: classes2.dex */
public final class AttachLink implements AttachWithId, ztx0 {
    public static final Serializer.c<AttachLink> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ImageList i;
    public ImageScaleType j;
    public float k;
    public int l;
    public String m;
    public String n;
    public String o;
    public ButtonActionType p;
    public String q;
    public int r;
    public ButtonIconType s;
    public LinkTarget t;
    public AMP u;
    public Article v;
    public Product w;
    public VmojiAttach x;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachLink a(Serializer serializer) {
            return new AttachLink(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachLink[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachLink() {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = new ImageList(null, 1, 0 == true ? 1 : 0);
        this.j = ImageScaleType.CENTER_CROP;
        this.o = "";
        this.p = ButtonActionType.OPEN_URL;
        this.q = "";
        this.s = ButtonIconType.NONE;
        this.t = LinkTarget.DEFAULT;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.i0(this.i);
        serializer.S(this.j.j());
        serializer.P(this.k);
        serializer.j0(this.o);
        serializer.S(this.p.j());
        serializer.j0(this.q);
        serializer.S(this.r);
        serializer.S(this.s.j());
        serializer.S(this.t.j());
        serializer.i0(this.u);
        serializer.i0(this.v);
        serializer.i0(this.w);
        serializer.i0(this.x);
        serializer.j0(this.m);
        serializer.S(this.l);
        serializer.j0(this.n);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachLink(this);
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
        if (!AttachLink.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachLink attachLink = (AttachLink) obj;
        return this.b == attachLink.b && this.c == attachLink.c && epx.f(this.e, attachLink.e) && epx.f(this.f, attachLink.f) && epx.f(this.g, attachLink.g) && epx.f(this.h, attachLink.h) && epx.f(this.i, attachLink.i) && this.j == attachLink.j && this.k == attachLink.k && epx.f(this.o, attachLink.o) && this.p == attachLink.p && epx.f(this.q, attachLink.q) && this.r == attachLink.r && this.s == attachLink.s && this.t == attachLink.t && epx.f(this.u, attachLink.u) && epx.f(this.v, attachLink.v) && epx.f(this.w, attachLink.w) && epx.f(this.x, attachLink.x) && epx.f(this.m, attachLink.m) && epx.f(this.n, attachLink.n);
    }

    @Override // xsna.ztx0
    public final ImageList f() {
        return new ImageList(this.i);
    }

    @Override // xsna.htx0
    public final long getId() {
        return Long.hashCode(this.d.b) + this.e.hashCode() + this.f.hashCode() + this.g.hashCode() + this.h.hashCode();
    }

    public final int hashCode() {
        int hashCode = (this.t.hashCode() + ((this.s.hashCode() + ((urd0.a((this.p.hashCode() + urd0.a(b.a(this.k, (this.j.hashCode() + fw3.a(urd0.a(urd0.a(urd0.a(urd0.a(bo.a(this.c, this.b * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i.b)) * 31, 31), 31, this.o)) * 31, 31, this.q) + this.r) * 31)) * 31)) * 31;
        AMP amp = this.u;
        int hashCode2 = (hashCode + (amp != null ? amp.hashCode() : 0)) * 31;
        Article article = this.v;
        int hashCode3 = (hashCode2 + (article != null ? article.hashCode() : 0)) * 31;
        Product product = this.w;
        int hashCode4 = (hashCode3 + (product != null ? product.hashCode() : 0)) * 31;
        VmojiAttach vmojiAttach = this.x;
        int hashCode5 = (hashCode4 + (vmojiAttach != null ? vmojiAttach.hashCode() : 0)) * 31;
        String str = this.m;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
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
            return "AttachLink(localId=" + this.b + ", syncState=" + this.c + ", buttonActionType=" + this.p + ", buttonActionGroupId=" + this.r + ", buttonIconType=" + this.s + ", target=" + this.t + ')';
        }
        return "AttachLink(localId=" + this.b + ", syncState=" + this.c + ", url='" + this.e + "', title='" + this.f + "', caption='" + this.g + "', description='" + this.h + "', imageList=" + this.i + ", imageScaleType=" + this.j + ", buttonTitle='" + this.o + "', buttonActionType=" + this.p + ", buttonActionUrl='" + this.q + "', buttonActionGroupId=" + this.r + ", target=" + this.t + ')';
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
    public AttachLink(AttachLink attachLink) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = new ImageList(null, 1, 0 == true ? 1 : 0);
        this.j = ImageScaleType.CENTER_CROP;
        this.o = "";
        this.p = ButtonActionType.OPEN_URL;
        this.q = "";
        this.s = ButtonIconType.NONE;
        this.t = LinkTarget.DEFAULT;
        this.b = attachLink.b;
        this.c = attachLink.c;
        this.e = attachLink.e;
        this.f = attachLink.f;
        this.g = attachLink.g;
        this.h = attachLink.h;
        this.i = attachLink.i;
        this.j = attachLink.j;
        this.k = attachLink.k;
        this.o = attachLink.o;
        this.p = attachLink.p;
        this.q = attachLink.q;
        this.r = attachLink.r;
        this.s = attachLink.s;
        this.t = attachLink.t;
        this.u = attachLink.u;
        this.v = attachLink.v;
        this.w = attachLink.w;
        this.x = attachLink.x;
        this.m = attachLink.m;
        this.n = attachLink.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachLink(String str) {
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = new ImageList(null, 1, 0 == true ? 1 : 0);
        this.j = ImageScaleType.CENTER_CROP;
        this.o = "";
        this.p = ButtonActionType.OPEN_URL;
        this.q = "";
        this.s = ButtonIconType.NONE;
        this.t = LinkTarget.DEFAULT;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachLink(Serializer serializer, zcl zclVar) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        this.c = AttachSyncState.DONE;
        this.d = UserId.d;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = new ImageList(null, 1, 0 == true ? 1 : 0);
        this.j = ImageScaleType.CENTER_CROP;
        this.o = "";
        this.p = ButtonActionType.OPEN_URL;
        this.q = "";
        this.s = ButtonIconType.NONE;
        this.t = LinkTarget.DEFAULT;
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.H();
        this.f = serializer.H();
        this.g = serializer.H();
        this.h = serializer.H();
        this.i = (ImageList) serializer.G(ImageList.class.getClassLoader());
        ImageScaleType.a aVar = ImageScaleType.Companion;
        int u = serializer.u();
        aVar.getClass();
        lazy = ImageScaleType.values$delegate;
        Object obj = ((Map) lazy.getValue()).get(Integer.valueOf(u));
        if (obj != null) {
            this.j = (ImageScaleType) obj;
            this.k = serializer.s();
            this.o = serializer.H();
            ButtonActionType.a aVar2 = ButtonActionType.Companion;
            int u2 = serializer.u();
            aVar2.getClass();
            lazy2 = ButtonActionType.values$delegate;
            Object obj2 = ((Map) lazy2.getValue()).get(Integer.valueOf(u2));
            if (obj2 != null) {
                this.p = (ButtonActionType) obj2;
                this.q = serializer.H();
                this.r = serializer.u();
                ButtonIconType.a aVar3 = ButtonIconType.Companion;
                int u3 = serializer.u();
                aVar3.getClass();
                lazy3 = ButtonIconType.values$delegate;
                Object obj3 = ((Map) lazy3.getValue()).get(Integer.valueOf(u3));
                if (obj3 != null) {
                    this.s = (ButtonIconType) obj3;
                    LinkTarget.a aVar4 = LinkTarget.Companion;
                    int u4 = serializer.u();
                    aVar4.getClass();
                    lazy4 = LinkTarget.values$delegate;
                    Object obj4 = ((Map) lazy4.getValue()).get(Integer.valueOf(u4));
                    if (obj4 != null) {
                        this.t = (LinkTarget) obj4;
                        this.u = (AMP) serializer.G(AMP.class.getClassLoader());
                        this.v = (Article) serializer.G(Article.class.getClassLoader());
                        this.w = (Product) serializer.G(Product.class.getClassLoader());
                        this.x = (VmojiAttach) serializer.G(VmojiAttach.class.getClassLoader());
                        this.m = serializer.H();
                        this.l = serializer.u();
                        this.n = serializer.H();
                        return;
                    }
                    throw new IllegalArgumentException(lhg.a(u4, "Unknown typeAsInt value: ").toString());
                }
                throw new IllegalArgumentException(lhg.a(u3, "Unknown typeAsInt value: ").toString());
            }
            throw new IllegalArgumentException(lhg.a(u2, "Unknown typeAsInt value: ").toString());
        }
        throw new IllegalArgumentException(lhg.a(u, "Unknown typeAsInt value: ").toString());
    }
}
