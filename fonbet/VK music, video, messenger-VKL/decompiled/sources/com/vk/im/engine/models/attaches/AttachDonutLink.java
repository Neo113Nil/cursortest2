package com.vk.im.engine.models.attaches;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import java.util.List;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.sr;

/* compiled from: AttachDonutLink.kt */
/* loaded from: classes2.dex */
public final class AttachDonutLink implements AttachWithId {
    public static final Serializer.c<AttachDonutLink> CREATOR = new a();
    public int b;
    public AttachSyncState c;
    public final UserId d;
    public final Peer e;
    public String f;
    public boolean g;
    public final String h;
    public ImageList i;
    public final int j;
    public final int k;
    public List<Friend> l;
    public final LinkButton m;
    public final Action n;

    /* compiled from: AttachDonutLink.kt */
    public static final class Friend implements Serializer.StreamParcelable {
        public static final Serializer.c<Friend> CREATOR = new a();
        public final long b;
        public final ImageList c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Friend> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Friend a(Serializer serializer) {
                return new Friend(serializer.w(), (ImageList) serializer.G(ImageList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Friend[i];
            }
        }

        public Friend(long j, ImageList imageList) {
            this.b = j;
            this.c = imageList;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.Y(this.b);
            serializer.i0(this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Friend)) {
                return false;
            }
            Friend friend = (Friend) obj;
            return this.b == friend.b && epx.f(this.c, friend.c);
        }

        public final int hashCode() {
            return this.c.b.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "Friend(id=" + this.b + ", avatar=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachDonutLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachDonutLink a(Serializer serializer) {
            return new AttachDonutLink(serializer.u(), sr.b(serializer, AttachSyncState.Companion), (UserId) serializer.A(UserId.class.getClassLoader()), (Peer) serializer.G(Peer.class.getClassLoader()), serializer.H(), serializer.m(), serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.u(), serializer.u(), serializer.k(Friend.class), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), (Action) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachDonutLink[i];
        }
    }

    public AttachDonutLink(int i, AttachSyncState attachSyncState, UserId userId, Peer peer, String str, boolean z, String str2, ImageList imageList, int i2, int i3, List<Friend> list, LinkButton linkButton, Action action) {
        this.b = i;
        this.c = attachSyncState;
        this.d = userId;
        this.e = peer;
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = imageList;
        this.j = i2;
        this.k = i3;
        this.l = list;
        this.m = linkButton;
        this.n = action;
    }

    @Override // com.vk.dto.attaches.Attach
    public final AttachSyncState G0() {
        return this.c;
    }

    @Override // com.vk.dto.attaches.Attach
    public final String N4(String str) {
        String str2;
        Action action = this.m.c;
        if (action instanceof ActionOpenUrl) {
            return ((ActionOpenUrl) action).c;
        }
        StringBuilder sb = new StringBuilder();
        Peer peer = this.e;
        peer.getClass();
        long j = peer.d;
        if (peer.Ab(Peer.Type.GROUP)) {
            str2 = "https://" + str + "/public" + j;
        } else {
            str2 = "https://" + str + "/id" + j;
        }
        sb.append(str2);
        sb.append("?w=donut_payment");
        sb.append(this.d);
        return sb.toString();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c.h());
        serializer.e0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.j0(this.h);
        serializer.i0(this.i);
        serializer.S(this.j);
        serializer.S(this.k);
        serializer.W(this.l);
        serializer.i0(this.m);
        serializer.i0(this.n);
    }

    @Override // com.vk.dto.attaches.Attach
    public final void S2(AttachSyncState attachSyncState) {
        this.c = attachSyncState;
    }

    @Override // com.vk.dto.attaches.Attach
    public final Attach copy() {
        return new AttachDonutLink(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachDonutLink)) {
            return false;
        }
        AttachDonutLink attachDonutLink = (AttachDonutLink) obj;
        return this.b == attachDonutLink.b && this.c == attachDonutLink.c && epx.f(this.d, attachDonutLink.d) && epx.f(this.e, attachDonutLink.e) && epx.f(this.f, attachDonutLink.f) && this.g == attachDonutLink.g && epx.f(this.h, attachDonutLink.h) && epx.f(this.i, attachDonutLink.i) && this.j == attachDonutLink.j && this.k == attachDonutLink.k && epx.f(this.l, attachDonutLink.l) && epx.f(this.m, attachDonutLink.m) && epx.f(this.n, attachDonutLink.n);
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.d.b;
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(bo.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b), 31, this.e.b);
        String str = this.f;
        int b = qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageList imageList = this.i;
        int a3 = shy.a(this.k, shy.a(this.j, (hashCode + (imageList == null ? 0 : imageList.b.hashCode())) * 31, 31), 31);
        List<Friend> list = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((a3 + (list != null ? list.hashCode() : 0)) * 31)) * 31);
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
        return "AttachDonutLink(localId=" + this.b + ", syncState=" + this.c + ", ownerId=" + this.d + ", owner=" + this.e + ", name=" + this.f + ", isVerified=" + this.g + ", text=" + this.h + ", remoteAvatar=" + this.i + ", donorsCount=" + this.j + ", friendsCount=" + this.k + ", friends=" + this.l + ", button=" + this.m + ", action=" + this.n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    @Override // com.vk.dto.attaches.Attach
    public final int xb() {
        return this.b;
    }

    public AttachDonutLink(AttachDonutLink attachDonutLink) {
        this(attachDonutLink.b, attachDonutLink.c, attachDonutLink.d, attachDonutLink.e, attachDonutLink.f, attachDonutLink.g, attachDonutLink.h, attachDonutLink.i, attachDonutLink.j, attachDonutLink.k, attachDonutLink.l, attachDonutLink.m, attachDonutLink.n);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AttachDonutLink(int r18, com.vk.dto.attaches.AttachSyncState r19, com.vk.dto.common.id.UserId r20, com.vk.dto.common.Peer r21, java.lang.String r22, boolean r23, java.lang.String r24, com.vk.dto.common.im.ImageList r25, int r26, int r27, java.util.List r28, com.vk.dto.common.LinkButton r29, com.vk.dto.common.actions.Action r30, int r31, xsna.zcl r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r18
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L13
            com.vk.dto.attaches.AttachSyncState r1 = com.vk.dto.attaches.AttachSyncState.DONE
            r5 = r1
            goto L15
        L13:
            r5 = r19
        L15:
            r1 = r0 & 4
            if (r1 == 0) goto L1d
            com.vk.dto.common.id.UserId r1 = com.vk.dto.common.id.UserId.d
            r6 = r1
            goto L1f
        L1d:
            r6 = r20
        L1f:
            r1 = r0 & 8
            if (r1 == 0) goto L29
            com.vk.core.serialize.Serializer$c<com.vk.dto.common.Peer> r1 = com.vk.dto.common.Peer.CREATOR
            com.vk.dto.common.Peer$Unknown r1 = com.vk.dto.common.Peer.Unknown.e
            r7 = r1
            goto L2b
        L29:
            r7 = r21
        L2b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L32
            r8 = r3
            goto L34
        L32:
            r8 = r22
        L34:
            r1 = r0 & 32
            if (r1 == 0) goto L3a
            r9 = r2
            goto L3c
        L3a:
            r9 = r23
        L3c:
            r1 = r0 & 64
            if (r1 == 0) goto L42
            r10 = r3
            goto L44
        L42:
            r10 = r24
        L44:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L4a
            r11 = r3
            goto L4c
        L4a:
            r11 = r25
        L4c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L52
            r12 = r2
            goto L54
        L52:
            r12 = r26
        L54:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L5a
            r13 = r2
            goto L5c
        L5a:
            r13 = r27
        L5c:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L68
            r14 = r3
            r15 = r29
            r16 = r30
            r3 = r17
            goto L70
        L68:
            r14 = r28
            r3 = r17
            r15 = r29
            r16 = r30
        L70:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.im.engine.models.attaches.AttachDonutLink.<init>(int, com.vk.dto.attaches.AttachSyncState, com.vk.dto.common.id.UserId, com.vk.dto.common.Peer, java.lang.String, boolean, java.lang.String, com.vk.dto.common.im.ImageList, int, int, java.util.List, com.vk.dto.common.LinkButton, com.vk.dto.common.actions.Action, int, xsna.zcl):void");
    }
}
