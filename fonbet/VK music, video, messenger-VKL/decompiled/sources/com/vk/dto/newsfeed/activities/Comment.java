package com.vk.dto.newsfeed.activities;

import android.os.Parcel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import defpackage.q0;
import java.util.List;
import xsna.bh10;
import xsna.ej90;
import xsna.epx;
import xsna.grj0;
import xsna.mq;
import xsna.o25;
import xsna.o2f0;

/* compiled from: Comment.kt */
/* loaded from: classes18.dex */
public final class Comment implements Serializer.StreamParcelable, o2f0, grj0 {
    public static final Serializer.c<Comment> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final UserId d;
    public final int e;
    public final long f;
    public String g;
    public int h;
    public boolean i;
    public List<Attachment> j;
    public String k;
    public final int[] l;
    public final CommentDonut m;
    public ReactionSet n;
    public ItemReactions o;
    public final boolean p;
    public final boolean q;
    public boolean r;
    public final boolean s;
    public final boolean t;
    public ej90 u;
    public boolean v;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Comment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Comment a(Serializer serializer) {
            int u = serializer.u();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            UserId userId2 = (UserId) serializer.A(UserId.class.getClassLoader());
            if (userId2 == null) {
                userId2 = UserId.d;
            }
            return new Comment(u, userId, userId2, serializer.u(), serializer.w(), serializer.H(), serializer.u(), serializer.m(), serializer.l(Attachment.class.getClassLoader()), serializer.H(), serializer.c(), (CommentDonut) serializer.G(CommentDonut.class.getClassLoader()), (ReactionSet) serializer.G(ReactionSet.class.getClassLoader()), (ItemReactions) serializer.G(ItemReactions.class.getClassLoader()), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Comment[i];
        }
    }

    public Comment(int i, UserId userId, UserId userId2, int i2, long j, String str, int i3, boolean z, List<Attachment> list, String str2, int[] iArr, CommentDonut commentDonut, ReactionSet reactionSet, ItemReactions itemReactions, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.b = i;
        this.c = userId;
        this.d = userId2;
        this.e = i2;
        this.f = j;
        this.g = str;
        this.h = i3;
        this.i = z;
        this.j = list;
        this.k = str2;
        this.l = iArr;
        this.m = commentDonut;
        this.n = reactionSet;
        this.o = itemReactions;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        ej90.b bVar = new ej90.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, o25.a().i().U, null, 11019, 0, null, null, 471);
        ej90.c cVar = new ej90.c(0);
        String str3 = this.g;
        this.u = str3 != null ? ej90.a.a(str3, bVar, cVar) : null;
        this.v = cVar.a;
    }

    @Override // xsna.grj0
    public final boolean J() {
        return this.i;
    }

    @Override // xsna.o2f0
    public final ItemReactions K() {
        return this.o;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.e0(this.d);
        serializer.S(this.e);
        serializer.Y(this.f);
        serializer.j0(this.g);
        serializer.S(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.W(this.j);
        serializer.j0(this.k);
        serializer.T(this.l);
        serializer.i0(this.m);
        serializer.i0(this.n);
        serializer.i0(this.o);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.L(this.t ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.grj0
    public final int T9() {
        return this.h;
    }

    @Override // xsna.o2f0
    public final void b4(ItemReactions itemReactions) {
        this.o = itemReactions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Comment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Comment comment = (Comment) obj;
        return this.b == comment.b && epx.f(this.c, comment.c) && this.f == comment.f;
    }

    @Override // xsna.grj0
    public final void f(int i) {
        this.h = i;
    }

    @Override // xsna.grj0
    public final void f0(boolean z) {
        this.i = z;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + bh10.a(this.b * 31, 31, this.c.b);
    }

    @Override // xsna.o2f0
    public final void hb(ReactionSet reactionSet) {
        this.n = reactionSet;
    }

    @Override // xsna.o2f0
    public final ReactionSet s4() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comment(id=");
        sb.append(this.b);
        sb.append(", fromId=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", replyTo=");
        sb.append(this.e);
        sb.append(", date=");
        sb.append(this.f);
        sb.append(", text=");
        sb.append(this.g);
        sb.append(", numLikes=");
        sb.append(this.h);
        sb.append(", isLiked=");
        sb.append(this.i);
        sb.append(", attachments=");
        sb.append(this.j);
        sb.append(", attachmentsPlaceholder=");
        sb.append(this.k);
        sb.append(", parentsStack=");
        mq.f(this.l, sb, ", donut=");
        sb.append(this.m);
        sb.append(", reactionSet=");
        sb.append(this.n);
        sb.append(", reactions=");
        sb.append(this.o);
        sb.append(", canLikeByAuthor=");
        sb.append(this.p);
        sb.append(", isFromPostAuthor=");
        sb.append(this.q);
        sb.append(", isAuthorLiked=");
        sb.append(this.r);
        sb.append(", isGroupLiked=");
        sb.append(this.s);
        sb.append(", isPinned=");
        return q0.a(sb, this.t, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Comment(int r25, com.vk.dto.common.id.UserId r26, com.vk.dto.common.id.UserId r27, int r28, long r29, java.lang.String r31, int r32, boolean r33, java.util.List r34, java.lang.String r35, int[] r36, com.vk.dto.newsfeed.CommentDonut r37, com.vk.dto.reactions.ReactionSet r38, com.vk.dto.reactions.ItemReactions r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, int r45, xsna.zcl r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r25
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L13
            com.vk.dto.common.id.UserId r1 = com.vk.dto.common.id.UserId.d
            r5 = r1
            goto L15
        L13:
            r5 = r26
        L15:
            r1 = r0 & 4
            if (r1 == 0) goto L1d
            com.vk.dto.common.id.UserId r1 = com.vk.dto.common.id.UserId.d
            r6 = r1
            goto L1f
        L1d:
            r6 = r27
        L1f:
            r1 = r0 & 8
            if (r1 == 0) goto L25
            r7 = r2
            goto L27
        L25:
            r7 = r28
        L27:
            r1 = r0 & 16
            if (r1 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r29
        L30:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L37
            r10 = r3
            goto L39
        L37:
            r10 = r31
        L39:
            r1 = r0 & 64
            if (r1 == 0) goto L3f
            r11 = r2
            goto L41
        L3f:
            r11 = r32
        L41:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L47
            r12 = r2
            goto L49
        L47:
            r12 = r33
        L49:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L4f
            r13 = r3
            goto L51
        L4f:
            r13 = r34
        L51:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L57
            r14 = r3
            goto L59
        L57:
            r14 = r35
        L59:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L5f
            r15 = r3
            goto L61
        L5f:
            r15 = r36
        L61:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L78
            r16 = r3
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r44
            r3 = r24
            goto L8a
        L78:
            r16 = r37
            r3 = r24
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r44
        L8a:
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.newsfeed.activities.Comment.<init>(int, com.vk.dto.common.id.UserId, com.vk.dto.common.id.UserId, int, long, java.lang.String, int, boolean, java.util.List, java.lang.String, int[], com.vk.dto.newsfeed.CommentDonut, com.vk.dto.reactions.ReactionSet, com.vk.dto.reactions.ItemReactions, boolean, boolean, boolean, boolean, boolean, int, xsna.zcl):void");
    }
}
