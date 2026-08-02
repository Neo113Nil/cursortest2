package com.vk.fave.entities;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.fave.FaveItem;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.NarrativeAttachment;
import java.util.ArrayList;
import java.util.List;
import xsna.e43;
import xsna.epx;
import xsna.fsx0;
import xsna.gmq;
import xsna.gnq;
import xsna.gux0;
import xsna.l490;
import xsna.ttl;
import xsna.wsx0;

/* compiled from: FaveEntry.kt */
/* loaded from: classes18.dex */
public final class FaveEntry extends NewsEntry implements fsx0, l490, gux0, wsx0 {
    public static final Serializer.c<FaveEntry> CREATOR = new a();
    public final FaveItem i;
    public final boolean j;
    public final EntryHeader k;
    public final ttl<EntryAttachment> l;
    public final String m;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FaveEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FaveEntry a(Serializer serializer) {
            return new FaveEntry(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FaveEntry[i];
        }
    }

    /* compiled from: FaveEntry.kt */
    public static final class b {
        public b() {
        }
    }

    public FaveEntry(FaveItem faveItem, boolean z, EntryHeader entryHeader) {
        this.i = faveItem;
        this.j = z;
        this.k = entryHeader;
        b bVar = new b();
        gnq gnqVar = gnq.a;
        Object obj = faveItem.f;
        gnqVar.getClass();
        this.l = new ttl<>(obj instanceof Attachment ? e43.a(new EntryAttachment((Attachment) obj, null, null, null, 14, null)) : obj instanceof Narrative ? e43.a(new EntryAttachment(new NarrativeAttachment((Narrative) obj), null, null, null, 14, null)) : obj instanceof Post ? ((Post) obj).z : new ArrayList<>(), bVar);
        this.m = "";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.m;
    }

    public final FaveItem Eb() {
        return this.i;
    }

    @Override // xsna.fsx0
    public final List<EntryAttachment> N7() {
        return this.l;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.i0(this.k);
    }

    @Override // xsna.gux0
    public final List<FaveTag> U1() {
        return this.i.e;
    }

    @Override // xsna.gux0
    public final gux0 copy(List list) {
        FaveItem faveItem = this.i;
        return new FaveEntry(new FaveItem(faveItem.b, faveItem.c, faveItem.d, list, faveItem.f), this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return FaveEntry.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.i, ((FaveEntry) obj).i);
    }

    @Override // xsna.wsx0
    public final EntryHeader getHeader() {
        return this.k;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // xsna.l490
    public final Owner s() {
        gnq gnqVar = gnq.a;
        gmq gmqVar = this.i.f;
        gnqVar.getClass();
        return gnq.c(gmqVar);
    }

    public final String toString() {
        return "FaveEntry(faveItem=" + this.i + ", forceSmall=" + this.j + ", header=" + this.k + ')';
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 22;
    }

    public FaveEntry(Serializer serializer) {
        this((FaveItem) serializer.G(FaveItem.class.getClassLoader()), serializer.m(), (EntryHeader) serializer.G(EntryHeader.class.getClassLoader()));
    }
}
