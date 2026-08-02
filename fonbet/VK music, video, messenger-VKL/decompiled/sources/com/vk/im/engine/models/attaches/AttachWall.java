package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.models.SourceType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.bo;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.i5s;
import xsna.j5g;
import xsna.qoy;
import xsna.s3j0;
import xsna.shy;
import xsna.sr;
import xsna.t33;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AttachWall.kt */
/* loaded from: classes2.dex */
public final class AttachWall implements AttachWithId {
    public static final Serializer.c<AttachWall> CREATOR = new a();
    public boolean A;
    public Peer B;
    public String C;
    public String D;
    public String E;
    public int b;
    public AttachSyncState c;
    public UserId d;
    public int e;
    public UserId f;
    public Collection<UserId> g;
    public boolean h;
    public boolean i;
    public AuthorAd j;
    public SourceType k;
    public long l;
    public String m;
    public String n;
    public List<Attach> o;
    public long p;
    public boolean q;
    public String r;
    public PostDonut s;
    public TextLive t;
    public boolean u;
    public AttachComments v;
    public int w;
    public ItemReactions x;
    public int y;
    public boolean z;

    /* compiled from: AttachWall.kt */
    public static final class TextLive extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<TextLive> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<TextLive> {
            @Override // com.vk.core.serialize.Serializer.c
            public final TextLive a(Serializer serializer) {
                return new TextLive(serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextLive[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextLive() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextLive)) {
                return false;
            }
            TextLive textLive = (TextLive) obj;
            return epx.f(this.b, textLive.b) && epx.f(this.c, textLive.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextLive(title=");
            sb.append(this.b);
            sb.append(", url=");
            return ho8.a(sb, this.c, ')');
        }

        public TextLive(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public /* synthetic */ TextLive(String str, String str2, int i, zcl zclVar) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachWall> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachWall a(Serializer serializer) {
            return new AttachWall(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachWall[i];
        }
    }

    public AttachWall() {
        this.c = AttachSyncState.DONE;
        UserId userId = UserId.d;
        this.d = userId;
        this.f = userId;
        this.g = EmptyList.b;
        this.k = SourceType.UNKNOWN;
        this.m = "";
        this.n = "";
        this.o = new ArrayList();
        this.r = "";
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.B = Peer.Unknown.e;
        this.C = "";
        this.D = "";
        this.E = "";
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        TextLive textLive = this.t;
        if (textLive != null) {
            return textLive.c;
        }
        StringBuilder a2 = t33.a("https://", str, "/wall");
        a2.append(this.d);
        a2.append('_');
        a2.append(this.e);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.S(this.e);
        serializer.e0(this.f);
        Collection<UserId> collection = this.g;
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((UserId) it.next()).b));
        }
        serializer.Z(j5g.P0(arrayList));
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.i0(this.j);
        serializer.e0(this.d);
        serializer.S(this.k.j());
        serializer.Y(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.W(this.o);
        serializer.Y(this.p);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.j0(this.r);
        serializer.i0(this.s);
        serializer.i0(this.t);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.i0(this.v);
        serializer.S(this.w);
        serializer.i0(this.x);
        serializer.S(this.y);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
        serializer.e0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.E);
        serializer.j0(this.D);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    public final void a(AttachWall attachWall) {
        this.b = attachWall.b;
        this.c = attachWall.c;
        this.e = attachWall.e;
        this.f = attachWall.f;
        this.g = attachWall.g;
        this.h = attachWall.h;
        this.i = attachWall.i;
        this.j = attachWall.j;
        this.d = attachWall.d;
        this.k = attachWall.k;
        this.l = attachWall.l;
        this.m = attachWall.m;
        this.n = attachWall.n;
        List<Attach> list = attachWall.o;
        ArrayList arrayList = new ArrayList(this.o.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Attach) it.next()).copy());
        }
        this.o = arrayList;
        this.p = attachWall.p;
        this.q = attachWall.q;
        this.r = attachWall.r;
        this.s = attachWall.s;
        this.t = attachWall.t;
        this.u = attachWall.u;
        this.v = attachWall.v;
        this.w = attachWall.w;
        this.x = attachWall.x;
        this.y = attachWall.y;
        this.z = attachWall.z;
        this.A = attachWall.A;
        this.B = attachWall.B;
        this.C = attachWall.C;
        this.D = attachWall.D;
        this.E = attachWall.E;
    }

    @Override // com.vk.dto.attaches.Attach
    public final void c(UserId userId) {
        throw null;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachWall(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AttachWall.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AttachWall attachWall = (AttachWall) obj;
        return this.b == attachWall.b && this.c == attachWall.c && this.e == attachWall.e && epx.f(this.f, attachWall.f) && epx.f(this.g, attachWall.g) && this.h == attachWall.h && this.i == attachWall.i && epx.f(this.j, attachWall.j) && epx.f(this.d, attachWall.d) && this.k == attachWall.k && this.l == attachWall.l && epx.f(this.m, attachWall.m) && epx.f(this.n, attachWall.n) && epx.f(this.o, attachWall.o) && this.p == attachWall.p && this.q == attachWall.q && epx.f(this.r, attachWall.r) && epx.f(this.s, attachWall.s) && epx.f(this.t, attachWall.t) && this.u == attachWall.u && epx.f(this.v, attachWall.v) && this.w == attachWall.w && epx.f(this.x, attachWall.x) && this.y == attachWall.y && this.z == attachWall.z && this.A == attachWall.A && epx.f(this.B, attachWall.B) && epx.f(this.C, attachWall.C) && epx.f(this.E, attachWall.E) && epx.f(this.D, attachWall.D);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(s3j0.a(bh10.a((bo.a(this.c, this.b * 31, 31) + this.e) * 31, 31, this.f.b), this.g, 31), 31, this.h), 31, this.i);
        AuthorAd authorAd = this.j;
        int a2 = urd0.a(qoy.b(bh10.a(fw3.a(urd0.a(urd0.a(bh10.a((this.k.hashCode() + bh10.a((b + (authorAd != null ? authorAd.hashCode() : 0)) * 31, 31, this.d.b)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        PostDonut postDonut = this.s;
        int hashCode = (a2 + (postDonut != null ? postDonut.hashCode() : 0)) * 31;
        TextLive textLive = this.t;
        int b2 = qoy.b((hashCode + (textLive != null ? textLive.hashCode() : 0)) * 31, 31, this.u);
        AttachComments attachComments = this.v;
        int a3 = shy.a(this.w, (b2 + (attachComments != null ? attachComments.hashCode() : 0)) * 31, 31);
        ItemReactions itemReactions = this.x;
        return this.D.hashCode() + urd0.a(urd0.a(bh10.a(qoy.b(qoy.b(shy.a(this.y, (a3 + (itemReactions != null ? itemReactions.hashCode() : 0)) * 31, 31), 31, this.z), 31, this.A), 31, this.B.b), 31, this.C), 31, this.E);
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
            StringBuilder sb = new StringBuilder("AttachWall(localId=");
            sb.append(this.b);
            sb.append(", syncState=");
            sb.append(this.c);
            sb.append(", postId=");
            sb.append(this.e);
            sb.append(", fromId='");
            sb.append(this.f);
            sb.append("', coowners='");
            sb.append(this.g);
            sb.append("', isAdvertisement=");
            sb.append(this.h);
            sb.append(", isMarkedAsAuthorAd=");
            sb.append(this.i);
            sb.append(", authorAd=");
            sb.append(this.j);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", sourceType=");
            sb.append(this.k);
            sb.append(", sourceId=");
            sb.append(this.l);
            sb.append(", textLive=");
            sb.append(this.t);
            sb.append(", attachList=");
            sb.append(this.o);
            sb.append(", comments=");
            sb.append(this.v);
            sb.append(", repostsCount=");
            sb.append(this.w);
            sb.append(", reactions=");
            sb.append(this.x);
            sb.append(", viewsCount=");
            sb.append(this.y);
            sb.append(",isVerified='");
            sb.append(this.z);
            sb.append("', isDeleted='");
            sb.append(this.A);
            sb.append("', signerId='");
            sb.append(this.B);
            sb.append("', trackCode='");
            sb.append(this.C);
            sb.append("', deletedDetails='");
            sb.append(this.E);
            sb.append("',deletedReason='");
            return i5s.a(sb, this.D, "')");
        }
        StringBuilder sb2 = new StringBuilder("AttachWall(localId=");
        sb2.append(this.b);
        sb2.append(", syncState=");
        sb2.append(this.c);
        sb2.append(", postId=");
        sb2.append(this.e);
        sb2.append(", fromId='");
        sb2.append(this.f);
        sb2.append("', coowners='");
        sb2.append(this.g);
        sb2.append("', isAdvertisement=");
        sb2.append(this.h);
        sb2.append(", isMarkedAsAuthorAd=");
        sb2.append(this.i);
        sb2.append(", authorAd=");
        sb2.append(this.j);
        sb2.append(", ownerId=");
        sb2.append(this.d);
        sb2.append(", sourceType=");
        sb2.append(this.k);
        sb2.append(", sourceId=");
        sb2.append(this.l);
        sb2.append(", text='");
        sb2.append(this.m);
        sb2.append("', accessKey='");
        sb2.append(this.n);
        sb2.append(", attachList=");
        sb2.append(this.o);
        sb2.append(", date='");
        sb2.append(this.p);
        sb2.append("',postType='");
        sb2.append(this.r);
        sb2.append("',isViewed='");
        sb2.append(this.r);
        sb2.append("',suggestSubscribe='");
        sb2.append(this.u);
        sb2.append(", comments='");
        sb2.append(this.v);
        sb2.append(", repostsCount='");
        sb2.append(this.w);
        sb2.append(", reactions='");
        sb2.append(this.x);
        sb2.append(", viewsCount='");
        sb2.append(this.y);
        sb2.append("',isVerified='");
        sb2.append(this.z);
        sb2.append("', isDeleted='");
        sb2.append(this.A);
        sb2.append("', signerId='");
        sb2.append(this.B);
        sb2.append("', trackCode='");
        sb2.append(this.C);
        sb2.append("', deletedDetails='");
        sb2.append(this.E);
        sb2.append("', deletedReason='");
        return i5s.a(sb2, this.D, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachWall(AttachWall attachWall) {
        this.c = AttachSyncState.DONE;
        UserId userId = UserId.d;
        this.d = userId;
        this.f = userId;
        this.g = EmptyList.b;
        this.k = SourceType.UNKNOWN;
        this.m = "";
        this.n = "";
        this.o = new ArrayList();
        this.r = "";
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.B = Peer.Unknown.e;
        this.C = "";
        this.D = "";
        this.E = "";
        a(attachWall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.Collection<com.vk.dto.common.id.UserId>, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Collection<com.vk.dto.common.id.UserId>] */
    /* JADX WARN: Type inference failed for: r10v57, types: [java.util.ArrayList] */
    public AttachWall(Serializer serializer, zcl zclVar) {
        this.c = AttachSyncState.DONE;
        UserId userId = UserId.d;
        this.d = userId;
        this.f = userId;
        ?? r10 = EmptyList.b;
        this.g = r10;
        this.k = SourceType.UNKNOWN;
        this.m = "";
        this.n = "";
        this.o = new ArrayList();
        this.r = "";
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.B = Peer.Unknown.e;
        this.C = "";
        this.D = "";
        this.E = "";
        this.b = serializer.u();
        this.c = sr.b(serializer, AttachSyncState.Companion);
        this.e = serializer.u();
        this.f = (UserId) serializer.A(UserId.class.getClassLoader());
        long[] e = serializer.e();
        if (e != null) {
            r10 = new ArrayList(e.length);
            for (long j : e) {
                r10.add(new UserId(j));
            }
        }
        this.g = r10;
        this.h = serializer.m();
        this.i = serializer.m();
        this.j = (AuthorAd) serializer.G(AuthorAd.class.getClassLoader());
        this.d = (UserId) serializer.A(UserId.class.getClassLoader());
        SourceType.a aVar = SourceType.Companion;
        int u = serializer.u();
        aVar.getClass();
        this.k = SourceType.a.a(u);
        this.l = serializer.w();
        this.m = serializer.H();
        this.n = serializer.H();
        this.o = serializer.l(Attach.class.getClassLoader());
        this.p = serializer.w();
        this.q = serializer.m();
        this.r = serializer.H();
        this.s = (PostDonut) serializer.G(PostDonut.class.getClassLoader());
        this.t = (TextLive) serializer.G(TextLive.class.getClassLoader());
        this.u = serializer.m();
        this.v = (AttachComments) serializer.G(AttachComments.class.getClassLoader());
        this.w = serializer.u();
        this.x = (ItemReactions) serializer.G(ItemReactions.class.getClassLoader());
        this.y = serializer.u();
        this.z = serializer.m();
        this.A = serializer.m();
        Peer peer = (Peer) serializer.A(Peer.class.getClassLoader());
        if (peer == null) {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        this.B = peer;
        String H = serializer.H();
        this.C = H == null ? "" : H;
        String H2 = serializer.H();
        this.E = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.D = H3 != null ? H3 : "";
    }
}
