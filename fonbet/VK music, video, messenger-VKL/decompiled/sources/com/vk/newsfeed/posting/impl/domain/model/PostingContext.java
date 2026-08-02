package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.MediaOwner;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Signer;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import xsna.epx;
import xsna.gp;
import xsna.qoy;
import xsna.sn;
import xsna.zcl;

/* compiled from: PostingContext.kt */
/* loaded from: classes4.dex */
public final class PostingContext implements Parcelable {
    public static final Parcelable.Creator<PostingContext> CREATOR = new a();
    public final WallOwner b;
    public final boolean c;
    public final boolean d;
    public final Publisher e;
    public final Signer f;
    public final MediaOwner g;
    public final PostingMetricEntryPoint h;
    public final boolean i;
    public final boolean j;
    public final Boolean k;
    public final boolean l;
    public final EditingPost m;
    public final String n;
    public final String o;
    public final UserId p;

    /* compiled from: PostingContext.kt */
    public static final class a implements Parcelable.Creator<PostingContext> {
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.vk.newsfeed.posting.impl.domain.model.PostingContext, still in use, count: 2, list:
              (r1v0 com.vk.newsfeed.posting.impl.domain.model.PostingContext) from 0x0018: MOVE (r3v1 com.vk.newsfeed.posting.impl.domain.model.PostingContext) = (r1v0 com.vk.newsfeed.posting.impl.domain.model.PostingContext) (LINE:25)
              (r1v0 com.vk.newsfeed.posting.impl.domain.model.PostingContext) from 0x0014: MOVE (r3v6 com.vk.newsfeed.posting.impl.domain.model.PostingContext) = (r1v0 com.vk.newsfeed.posting.impl.domain.model.PostingContext) (LINE:21)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final com.vk.newsfeed.posting.impl.domain.model.PostingContext createFromParcel(android.os.Parcel r19) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.newsfeed.posting.impl.domain.model.PostingContext.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final PostingContext[] newArray(int i) {
            return new PostingContext[i];
        }
    }

    public PostingContext(WallOwner wallOwner, boolean z, boolean z2, Publisher publisher, Signer signer, MediaOwner mediaOwner, PostingMetricEntryPoint postingMetricEntryPoint, boolean z3, boolean z4, Boolean bool, boolean z5, EditingPost editingPost, String str, String str2, UserId userId) {
        this.b = wallOwner;
        this.c = z;
        this.d = z2;
        this.e = publisher;
        this.f = signer;
        this.g = mediaOwner;
        this.h = postingMetricEntryPoint;
        this.i = z3;
        this.j = z4;
        this.k = bool;
        this.l = z5;
        this.m = editingPost;
        this.n = str;
        this.o = str2;
        this.p = userId;
    }

    public static PostingContext a(PostingContext postingContext, WallOwner wallOwner, boolean z, Publisher publisher, Signer signer, MediaOwner mediaOwner, int i) {
        WallOwner wallOwner2 = (i & 1) != 0 ? postingContext.b : wallOwner;
        boolean z2 = postingContext.c;
        boolean z3 = (i & 4) != 0 ? postingContext.d : z;
        Publisher publisher2 = (i & 8) != 0 ? postingContext.e : publisher;
        Signer signer2 = (i & 16) != 0 ? postingContext.f : signer;
        MediaOwner mediaOwner2 = (i & 32) != 0 ? postingContext.g : mediaOwner;
        PostingMetricEntryPoint postingMetricEntryPoint = postingContext.h;
        boolean z4 = postingContext.i;
        boolean z5 = postingContext.j;
        Boolean bool = postingContext.k;
        boolean z6 = postingContext.l;
        EditingPost editingPost = postingContext.m;
        String str = postingContext.n;
        String str2 = (i & 8192) != 0 ? postingContext.o : null;
        UserId userId = postingContext.p;
        postingContext.getClass();
        return new PostingContext(wallOwner2, z2, z3, publisher2, signer2, mediaOwner2, postingMetricEntryPoint, z4, z5, bool, z6, editingPost, str, str2, userId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingContext)) {
            return false;
        }
        PostingContext postingContext = (PostingContext) obj;
        return epx.f(this.b, postingContext.b) && this.c == postingContext.c && this.d == postingContext.d && epx.f(this.e, postingContext.e) && epx.f(this.f, postingContext.f) && epx.f(this.g, postingContext.g) && this.h == postingContext.h && this.i == postingContext.i && this.j == postingContext.j && epx.f(this.k, postingContext.k) && this.l == postingContext.l && epx.f(this.m, postingContext.m) && epx.f(this.n, postingContext.n) && epx.f(this.o, postingContext.o) && epx.f(this.p, postingContext.p);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Publisher publisher = this.e;
        int hashCode = (b + (publisher == null ? 0 : publisher.hashCode())) * 31;
        Signer signer = this.f;
        int hashCode2 = (hashCode + (signer == null ? 0 : signer.hashCode())) * 31;
        MediaOwner mediaOwner = this.g;
        int hashCode3 = (hashCode2 + (mediaOwner == null ? 0 : mediaOwner.hashCode())) * 31;
        PostingMetricEntryPoint postingMetricEntryPoint = this.h;
        int b2 = qoy.b(qoy.b((hashCode3 + (postingMetricEntryPoint == null ? 0 : postingMetricEntryPoint.hashCode())) * 31, 31, this.i), 31, this.j);
        Boolean bool = this.k;
        int b3 = qoy.b((b2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.l);
        EditingPost editingPost = this.m;
        int hashCode4 = (b3 + (editingPost == null ? 0 : editingPost.hashCode())) * 31;
        String str = this.n;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.p;
        return hashCode6 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingContext(owner=");
        sb.append(this.b);
        sb.append(", isCurrentUserPost=");
        sb.append(this.c);
        sb.append(", myWall=");
        sb.append(this.d);
        sb.append(", publisher=");
        sb.append(this.e);
        sb.append(", signer=");
        sb.append(this.f);
        sb.append(", pickerMediaOwner=");
        sb.append(this.g);
        sb.append(", creationEntryPoint=");
        sb.append(this.h);
        sb.append(", isOpenedFromMiniApp=");
        sb.append(this.i);
        sb.append(", isOpenedFromArchive=");
        sb.append(this.j);
        sb.append(", isCoauthorsAllowed=");
        sb.append(this.k);
        sb.append(", isPostingSuccessToastRequired=");
        sb.append(this.l);
        sb.append(", editingPost=");
        sb.append(this.m);
        sb.append(", authorName=");
        sb.append(this.n);
        sb.append(", businessOnboardingTooltip=");
        sb.append(this.o);
        sb.append(", currentUserId=");
        return gp.b(sb, this.p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WallOwner wallOwner = this.b;
        wallOwner.getClass();
        Serializer.StreamParcelable.a.a(wallOwner, parcel);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        Publisher publisher = this.e;
        if (publisher == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Serializer.StreamParcelable.a.a(publisher, parcel);
        }
        Signer signer = this.f;
        if (signer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Serializer.StreamParcelable.a.a(signer, parcel);
        }
        MediaOwner mediaOwner = this.g;
        if (mediaOwner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Serializer.StreamParcelable.a.a(mediaOwner, parcel);
        }
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        Boolean bool = this.k;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeInt(this.l ? 1 : 0);
        EditingPost editingPost = this.m;
        if (editingPost == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editingPost.writeToParcel(parcel, i);
        }
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeParcelable(this.p, i);
    }

    public /* synthetic */ PostingContext(WallOwner wallOwner, boolean z, boolean z2, Publisher publisher, Signer signer, MediaOwner mediaOwner, PostingMetricEntryPoint postingMetricEntryPoint, boolean z3, boolean z4, Boolean bool, boolean z5, EditingPost editingPost, String str, String str2, UserId userId, int i, zcl zclVar) {
        this(wallOwner, z, z2, publisher, signer, mediaOwner, postingMetricEntryPoint, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? null : editingPost, (i & 4096) != 0 ? null : str, (i & 8192) != 0 ? null : str2, (i & 16384) != 0 ? null : userId);
    }
}
