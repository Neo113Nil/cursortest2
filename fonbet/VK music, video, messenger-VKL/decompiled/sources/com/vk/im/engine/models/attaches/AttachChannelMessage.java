package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.newsfeed.PostDonut;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.shy;
import xsna.t33;
import xsna.urd0;

/* compiled from: AttachChannelMessage.kt */
/* loaded from: classes2.dex */
public final class AttachChannelMessage implements AttachWithId {
    public static final Serializer.c<AttachChannelMessage> CREATOR = new a();
    public final UserId b;
    public final long c;
    public final Peer d;
    public final String e;
    public final String f;
    public final List<Attach> g;
    public final String h;
    public final String i;
    public final int j;
    public final PostDonut k;
    public final ImageList l;
    public final String m;
    public int n;
    public AttachSyncState o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachChannelMessage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachChannelMessage a(Serializer serializer) {
            return new AttachChannelMessage(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachChannelMessage[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachChannelMessage(UserId userId, long j, Peer peer, String str, String str2, List<? extends Attach> list, String str3, String str4, int i, PostDonut postDonut, ImageList imageList, String str5) {
        this.b = userId;
        this.c = j;
        this.d = peer;
        this.e = str;
        this.f = str2;
        this.g = list;
        this.h = str3;
        this.i = str4;
        this.j = i;
        this.k = postDonut;
        this.l = imageList;
        this.m = str5;
        this.o = AttachSyncState.DONE;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.o;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        StringBuilder a2 = t33.a("https://", str, "/im/channels/");
        a2.append(this.b);
        a2.append("?cmid=");
        a2.append(this.c);
        return a2.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b.b);
        serializer.Y(this.c);
        serializer.Y(this.d.b);
        serializer.j0(this.e);
        serializer.m0(this.f);
        serializer.W(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.S(this.j);
        serializer.i0(this.k);
        serializer.i0(this.l);
        serializer.j0(this.m);
        serializer.S(this.n);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.o = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        PostDonut postDonut = this.k;
        AttachChannelMessage attachChannelMessage = new AttachChannelMessage(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, postDonut != null ? new PostDonut(postDonut.b, postDonut.c, postDonut.d, postDonut.e, postDonut.f, postDonut.g, postDonut.h, postDonut.i, postDonut.j, postDonut.k) : null, this.l, this.m);
        attachChannelMessage.n = this.n;
        attachChannelMessage.o = this.o;
        return attachChannelMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachChannelMessage)) {
            return false;
        }
        AttachChannelMessage attachChannelMessage = (AttachChannelMessage) obj;
        return epx.f(this.b, attachChannelMessage.b) && this.c == attachChannelMessage.c && epx.f(this.d, attachChannelMessage.d) && epx.f(this.e, attachChannelMessage.e) && epx.f(this.f, attachChannelMessage.f) && epx.f(this.g, attachChannelMessage.g) && epx.f(this.h, attachChannelMessage.h) && epx.f(this.i, attachChannelMessage.i) && this.j == attachChannelMessage.j && epx.f(this.k, attachChannelMessage.k) && epx.f(this.l, attachChannelMessage.l) && epx.f(this.m, attachChannelMessage.m);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.c;
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d.b), 31, this.e);
        String str = this.f;
        int a3 = shy.a(this.j, urd0.a(urd0.a(fw3.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31);
        PostDonut postDonut = this.k;
        int hashCode = (a3 + (postDonut == null ? 0 : postDonut.hashCode())) * 31;
        ImageList imageList = this.l;
        int hashCode2 = (hashCode + (imageList == null ? 0 : imageList.b.hashCode())) * 31;
        String str2 = this.m;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void m0(int i) {
        this.n = i;
    }

    @Override // com.vk.dto.attaches.Attach
    public final UserId q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachChannelMessage(ownerId=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", parentId=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", bodyFormat=");
        sb.append(this.f);
        sb.append(", attaches=");
        sb.append(this.g);
        sb.append(", deletedReason=");
        sb.append(this.h);
        sb.append(", donutUrl=");
        sb.append(this.i);
        sb.append(", viewsCount=");
        sb.append(this.j);
        sb.append(", donut=");
        sb.append(this.k);
        sb.append(", channelAvatar=");
        sb.append(this.l);
        sb.append(", channelName=");
        return ho8.a(sb, this.m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.n;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AttachChannelMessage(com.vk.dto.common.id.UserId r18, long r19, com.vk.dto.common.Peer r21, java.lang.String r22, java.lang.String r23, java.util.List r24, java.lang.String r25, java.lang.String r26, int r27, com.vk.dto.newsfeed.PostDonut r28, com.vk.dto.common.im.ImageList r29, java.lang.String r30, int r31, xsna.zcl r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 8
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r8 = r2
            goto Lc
        La:
            r8 = r22
        Lc:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L13
            r9 = r3
            goto L15
        L13:
            r9 = r23
        L15:
            r1 = r0 & 32
            if (r1 == 0) goto L1d
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.b
            r10 = r1
            goto L1f
        L1d:
            r10 = r24
        L1f:
            r1 = r0 & 64
            if (r1 == 0) goto L25
            r11 = r2
            goto L27
        L25:
            r11 = r25
        L27:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2d
            r12 = r2
            goto L2f
        L2d:
            r12 = r26
        L2f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L36
            r1 = 0
            r13 = r1
            goto L38
        L36:
            r13 = r27
        L38:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L3e
            r14 = r3
            goto L40
        L3e:
            r14 = r28
        L40:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L46
            r15 = r3
            goto L48
        L46:
            r15 = r29
        L48:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L57
            r16 = r3
            r4 = r18
            r5 = r19
            r7 = r21
            r3 = r17
            goto L61
        L57:
            r16 = r30
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
        L61:
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.im.engine.models.attaches.AttachChannelMessage.<init>(com.vk.dto.common.id.UserId, long, com.vk.dto.common.Peer, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, com.vk.dto.newsfeed.PostDonut, com.vk.dto.common.im.ImageList, java.lang.String, int, xsna.zcl):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachChannelMessage(Serializer serializer) {
        this(r1, r2, r4, r0, r6, r7, r8, r9 == null ? "" : r9, serializer.u(), (PostDonut) serializer.G(PostDonut.class.getClassLoader()), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.H());
        UserId userId = new UserId(serializer.w());
        long w = serializer.w();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b = Peer.a.b(serializer.w());
        String H = serializer.H();
        H = H == null ? "" : H;
        String I = serializer.I();
        List k = serializer.k(Attach.class);
        k = k == null ? EmptyList.b : k;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        this.n = serializer.u();
    }
}
