package com.vk.dto.newsfeed.entries;

import android.os.Bundle;
import android.os.Parcel;
import com.vk.common.links.LinksParserData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import xsna.cn70;
import xsna.ej90;
import xsna.epx;
import xsna.ho8;
import xsna.j5g;
import xsna.o25;
import xsna.saz;
import xsna.taz;
import xsna.tfw;
import xsna.ucp;
import xsna.uij0;
import xsna.vdz;
import xsna.xwk;

/* compiled from: DigestItem.kt */
/* loaded from: classes18.dex */
public final class DigestItem implements Serializer.StreamParcelable {
    public static final Serializer.c<DigestItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final Attachment e;
    public final int f;
    public final Post g;
    public final boolean h;
    public final String i;
    public final CharSequence j;
    public String k;
    public final CharSequence l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DigestItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DigestItem a(Serializer serializer) {
            DigestItem digestItem = new DigestItem(serializer.H(), serializer.H(), serializer.H(), (Attachment) serializer.G(Attachment.class.getClassLoader()), serializer.u(), (Post) serializer.G(Post.class.getClassLoader()), serializer.m(), serializer.H());
            digestItem.k = serializer.H();
            return digestItem;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DigestItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DigestItem(String str, String str2, String str3, Attachment attachment, int i, Post post, boolean z, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = attachment;
        this.f = i;
        this.g = post;
        this.h = z;
        this.i = str4;
        FeedFeatures feedFeatures = FeedFeatures.PARSE_LINKS;
        feedFeatures.getClass();
        b bVar = b.A;
        CharSequence charSequence = null;
        if (bVar.a(feedFeatures)) {
            if (str3 != null) {
                uij0.a aVar = uij0.a.a;
                LinksParserData linksParserData = new LinksParserData(43787, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Posts, (saz) null, 0, (taz) (0 == true ? 1 : 0), ObsceneTextFilter.UNAVAILABLE == ObsceneTextFilter.ENABLED, 1788);
                vdz vdzVar = new vdz(0);
                ucp ucpVar = ucp.a;
                charSequence = ucp.i(xwk.d().a().o(str3, linksParserData, vdzVar));
            }
        } else if (str3 != null) {
            charSequence = ej90.a.b(str3, null, 6).a;
        }
        this.j = charSequence;
        if (charSequence == null) {
            if (bVar.a(feedFeatures)) {
                String str5 = post.s;
                Bundle bundle = post.K;
                float f = post.N.d;
                cn70.b(6);
                LinksParserData linksParserData2 = new LinksParserData(43787, bundle, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Posts, (saz) null, 0, (taz) null, o25.a().i().U == ObsceneTextFilter.ENABLED, 1788);
                vdz vdzVar2 = new vdz(0);
                ucp ucpVar2 = ucp.a;
                charSequence = ucp.i(xwk.d().a().o(str5, linksParserData2, vdzVar2));
                post.l.Ab(68719476736L, vdzVar2.a);
            } else {
                ej90 ej90Var = post.P;
                if (ej90Var == null || (charSequence = ej90Var.a) == null) {
                    charSequence = "";
                }
            }
        }
        this.l = charSequence;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.S(this.f);
        serializer.i0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
        serializer.j0(this.k);
    }

    public final Attachment d() {
        Attachment attachment = this.e;
        if (attachment instanceof tfw) {
            return attachment;
        }
        Post post = this.g;
        int i = this.f;
        if (i == -1) {
            return post.Ib();
        }
        EntryAttachment entryAttachment = (EntryAttachment) j5g.b0(i, post.Gb());
        if (entryAttachment != null) {
            return entryAttachment.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DigestItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        DigestItem digestItem = (DigestItem) obj;
        return epx.f(this.g, digestItem.g) && this.h == digestItem.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DigestItem(style=");
        sb.append(this.b);
        sb.append(", sourceName=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", attachment=");
        sb.append(this.e);
        sb.append(", attachmentIndex=");
        sb.append(this.f);
        sb.append(", post=");
        sb.append(this.g);
        sb.append(", isBig=");
        sb.append(this.h);
        sb.append(", badgeText=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
