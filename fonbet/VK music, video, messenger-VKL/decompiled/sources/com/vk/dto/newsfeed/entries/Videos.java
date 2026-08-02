package com.vk.dto.newsfeed.entries;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.EntryDescription;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.c6z;
import xsna.e43;
import xsna.epx;
import xsna.fkq0;
import xsna.g620;
import xsna.iux0;
import xsna.l490;
import xsna.pwu;
import xsna.rsx0;
import xsna.urd0;
import xsna.wee0;
import xsna.yg5;
import xsna.zcl;

/* compiled from: Videos.kt */
/* loaded from: classes18.dex */
public final class Videos extends NewsEntryWithAttachments implements c6z, l490, wee0, iux0, rsx0 {
    public static final Serializer.c<Videos> CREATOR = new b();
    public final long l;
    public final Owner m;
    public final int n;
    public final ArrayList<EntryAttachment> o;
    public final Caption p;
    public final String q;
    public final EntryHeader r;
    public final String s;
    public final NewsEntryWithAttachments.Cut t;
    public final List<EntryAttachment> u;
    public final NewsEntry.TrackData v;
    public final EntryDescription w;
    public boolean x;
    public int y;
    public EasyPromote z;

    /* compiled from: Videos.kt */
    public static final class a {
        public static Videos a(VideoFile videoFile) {
            Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
            owner.c = videoFile.P();
            owner.e = videoFile.M0();
            owner.b = fkq0.d(videoFile.getUid()) ? videoFile.getUid() : videoFile.I0();
            return new Videos(videoFile.I0().b, owner, videoFile.b0(), e43.a(new EntryAttachment(new VideoAttachment(videoFile), null, null, null, 14, null)), null, null, pwu.b(owner), "video", new NewsEntryWithAttachments.Cut(-1, -1, 1.0f, false), new ArrayList(), new NewsEntry.TrackData(null, 0, 0L, false, false, null, null, 0, 255, null), null, false, 0, null, 16384, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Videos> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Videos a(Serializer serializer) {
            long w = serializer.w();
            Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
            int u = serializer.u();
            ArrayList k = serializer.k(EntryAttachment.class);
            Caption caption = (Caption) serializer.G(Caption.class.getClassLoader());
            String H = serializer.H();
            EntryHeader entryHeader = (EntryHeader) serializer.G(EntryHeader.class.getClassLoader());
            ArrayList k2 = serializer.k(EntryAttachment.class);
            if (k2 == null) {
                k2 = new ArrayList();
            }
            return new Videos(w, owner, u, k, caption, H, entryHeader, serializer.H(), (NewsEntryWithAttachments.Cut) serializer.G(NewsEntryWithAttachments.Cut.class.getClassLoader()), k2, (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()), (EntryDescription) serializer.G(EntryDescription.class.getClassLoader()), serializer.m(), serializer.u(), (EasyPromote) serializer.G(EasyPromote.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Videos[i];
        }
    }

    public /* synthetic */ Videos(long j, Owner owner, int i, ArrayList arrayList, Caption caption, String str, EntryHeader entryHeader, String str2, NewsEntryWithAttachments.Cut cut, List list, NewsEntry.TrackData trackData, EntryDescription entryDescription, boolean z, int i2, EasyPromote easyPromote, int i3, zcl zclVar) {
        this(j, owner, i, arrayList, caption, str, entryHeader, str2, cut, list, trackData, entryDescription, z, (i3 & 8192) != 0 ? 0 : i2, (i3 & 16384) != 0 ? null : easyPromote);
    }

    public static Videos Mb(Videos videos, long j, int i, String str, EntryHeader entryHeader, int i2) {
        long j2 = (i2 & 1) != 0 ? videos.l : j;
        Owner owner = videos.m;
        int i3 = (i2 & 4) != 0 ? videos.n : i;
        ArrayList<EntryAttachment> arrayList = videos.o;
        Caption caption = videos.p;
        String str2 = (i2 & 32) != 0 ? videos.q : str;
        EntryHeader entryHeader2 = (i2 & 64) != 0 ? videos.r : entryHeader;
        String str3 = videos.s;
        NewsEntryWithAttachments.Cut cut = videos.t;
        List<EntryAttachment> list = videos.u;
        NewsEntry.TrackData trackData = videos.v;
        EntryDescription entryDescription = videos.w;
        boolean z = videos.x;
        int i4 = videos.y;
        EasyPromote easyPromote = videos.z;
        videos.getClass();
        return new Videos(j2, owner, i3, arrayList, caption, str2, entryHeader2, str3, cut, list, trackData, entryDescription, z, i4, easyPromote);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        VideoAttachment Nb;
        ArrayList<EntryAttachment> arrayList = this.o;
        if (arrayList == null || arrayList.size() != 1 || (Nb = Nb()) == null) {
            return null;
        }
        return "video" + Nb.k.I0() + '_' + Nb.k.o0();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        VideoAttachment Nb;
        ArrayList<EntryAttachment> arrayList = this.o;
        if (arrayList == null || arrayList.size() != 1 || (Nb = Nb()) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Nb.k.I0());
        sb.append('_');
        sb.append(Nb.k.o0());
        return sb.toString();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.v;
    }

    @Override // xsna.rsx0
    public final int D() {
        return this.n;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.s;
    }

    @Override // xsna.c6z
    public final int E1() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return 0;
        }
        return videoFile.c1();
    }

    public final boolean Ea() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null || !g620.f().c(videoFile)) {
            return false;
        }
        String str = this.s;
        return epx.f(str, "clip") || epx.f(str, "short_video");
    }

    @Override // xsna.wee0
    public final Owner G() {
        return this.m;
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments
    public final List<EntryAttachment> Gb() {
        return this.u;
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments
    public final NewsEntryWithAttachments.Cut Hb() {
        return this.t;
    }

    @Override // xsna.grj0
    public final boolean J() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        return (Nb == null || (videoFile = Nb.k) == null || !videoFile.O9()) ? false : true;
    }

    public final boolean Lb() {
        ClipVideoFile Ob = Ob();
        if (Ob != null) {
            Owner owner = Ob.v0;
            Object obj = null;
            UserId userId = owner != null ? owner.b : null;
            Owner owner2 = this.m;
            if (epx.f(userId, owner2 != null ? owner2.b : null) && Ob.R1 != ClipMainTabState.NO_ACCESS) {
                return true;
            }
            Iterator<T> it = Ob.N1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((CoOwnerItem) next).d.b, owner2 != null ? owner2.b : null)) {
                    obj = next;
                    break;
                }
            }
            CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
            if (coOwnerItem != null && coOwnerItem.f != ClipMainTabState.NO_ACCESS) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.fsx0
    public final List<EntryAttachment> N7() {
        return this.o;
    }

    public final VideoAttachment Nb() {
        Attachment R1 = R1();
        if (R1 instanceof VideoAttachment) {
            return (VideoAttachment) R1;
        }
        return null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.l);
        serializer.i0(this.m);
        serializer.S(this.n);
        serializer.W(this.o);
        serializer.i0(this.p);
        serializer.j0(this.q);
        serializer.i0(this.r);
        serializer.W(this.u);
        serializer.j0(this.s);
        serializer.i0(this.t);
        serializer.i0(this.v);
        serializer.i0(this.w);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.S(this.y);
        serializer.i0(this.z);
    }

    public final ClipVideoFile Ob() {
        VideoAttachment Nb;
        VideoFile videoFile;
        if (Ea() && (Nb = Nb()) != null && (videoFile = Nb.k) != null && (videoFile instanceof ClipVideoFile)) {
            return (ClipVideoFile) videoFile;
        }
        return null;
    }

    public final List<VideoAttachment> Pb() {
        ArrayList<EntryAttachment> arrayList = this.o;
        if (arrayList == null) {
            return EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<EntryAttachment> it = arrayList.iterator();
        while (it.hasNext()) {
            Attachment attachment = it.next().b;
            if (attachment instanceof VideoAttachment) {
                arrayList2.add(attachment);
            }
        }
        return arrayList2;
    }

    public final boolean Qb() {
        ClipVideoFile Ob = Ob();
        if (Ob != null) {
            Owner owner = Ob.v0;
            Object obj = null;
            UserId userId = owner != null ? owner.b : null;
            Owner owner2 = this.m;
            if (epx.f(userId, owner2 != null ? owner2.b : null) && Ob.R1 == ClipMainTabState.ON_TAB) {
                return true;
            }
            Iterator<T> it = Ob.N1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((CoOwnerItem) next).d.b, owner2 != null ? owner2.b : null)) {
                    obj = next;
                    break;
                }
            }
            CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
            if (coOwnerItem != null && coOwnerItem.f == ClipMainTabState.ON_TAB) {
                return true;
            }
        }
        return false;
    }

    public final boolean Rb() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return false;
        }
        return epx.f(videoFile.Q(), Boolean.TRUE);
    }

    public final void Sb(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.y;
        } else {
            i2 = (~i) & this.y;
        }
        this.y = i2;
    }

    @Override // xsna.grj0
    public final int T9() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return 0;
        }
        return videoFile.l1();
    }

    @Override // xsna.c6z
    public final void U8(int i) {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return;
        }
        videoFile.S5(i);
    }

    @Override // xsna.c6z
    public final boolean b9() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        return (Nb == null || (videoFile = Nb.k) == null || !videoFile.Fa()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Videos) {
            Videos videos = (Videos) obj;
            if (this.l == videos.l && this.n == videos.n && epx.f(this.q, videos.q) && epx.f(this.s, videos.s) && epx.f(this.w, videos.w)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.grj0
    public final void f(int i) {
        VideoFile A;
        VideoAttachment Nb = Nb();
        if (Nb != null) {
            Nb.k.W8(i);
            yg5 yg5Var = Nb.i;
            if (yg5Var == null || (A = yg5Var.A()) == null) {
                return;
            }
            A.W8(i);
        }
    }

    @Override // xsna.grj0
    public final void f0(boolean z) {
        yg5 yg5Var;
        VideoFile A;
        VideoAttachment Nb = Nb();
        if (Nb != null) {
            VideoFile videoFile = Nb.k;
            if (videoFile != null) {
                videoFile.setTimestamp(0L);
                videoFile.f0(z);
            }
            yg5 yg5Var2 = Nb.i;
            if ((yg5Var2 != null ? yg5Var2.A() : null) == Nb.k || (yg5Var = Nb.i) == null || (A = yg5Var.A()) == null) {
                return;
            }
            A.setTimestamp(0L);
            A.f0(z);
        }
    }

    @Override // xsna.c6z
    public final int fa() {
        return w0();
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments, xsna.wsx0
    public final EntryHeader getHeader() {
        return this.r;
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.q;
    }

    public final int hashCode() {
        int a2 = (bh10.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.l) + this.n) * 31;
        String str = this.q;
        int a3 = urd0.a((a2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.s);
        EntryDescription entryDescription = this.w;
        return a3 + (entryDescription != null ? entryDescription.hashCode() : 0);
    }

    @Override // xsna.c6z
    public final int i7() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return 0;
        }
        return videoFile.W7();
    }

    @Override // xsna.c6z
    public final boolean l0() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        return (Nb == null || (videoFile = Nb.k) == null || !videoFile.c0()) ? false : true;
    }

    @Override // xsna.c6z
    public final boolean qa() {
        return E1() > 0 || l0();
    }

    @Override // xsna.c6z
    public final String r() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return null;
        }
        return videoFile.r();
    }

    @Override // xsna.c6z
    public final void r0(boolean z) {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return;
        }
        videoFile.r0(z);
    }

    @Override // xsna.l490
    public final Owner s() {
        return this.m;
    }

    @Override // xsna.c6z
    public final void sb(int i) {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return;
        }
        videoFile.ta(i);
    }

    public final String toString() {
        return "Videos(sourceId=" + this.l + ", publisher=" + this.m + ", date=" + this.n + ", items=" + this.o + ", caption=" + this.p + ", title=" + this.q + ", header=" + this.r + ", typeName=" + this.s + ", cut=" + this.t + ", attachments=" + this.u + ", trackData=" + this.v + ", description=" + this.w + ", suggestSubscribe=" + this.x + ", flags=" + this.y + ", easyPromote=" + this.z + ')';
    }

    @Override // xsna.c6z
    public final void v6(int i) {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return;
        }
        videoFile.P2(i);
    }

    @Override // xsna.c6z
    public final int w0() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        if (Nb == null || (videoFile = Nb.k) == null) {
            return 0;
        }
        return videoFile.L8();
    }

    @Override // xsna.c6z
    public final boolean x1() {
        VideoFile videoFile;
        VideoAttachment Nb = Nb();
        return (Nb == null || (videoFile = Nb.k) == null || !videoFile.v2()) ? false : true;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        String str = this.s;
        if (epx.f(str, "videos_for_you")) {
            return 46;
        }
        return epx.f(str, "video_postcard") ? 47 : 2;
    }

    public Videos(long j, Owner owner, int i, ArrayList<EntryAttachment> arrayList, Caption caption, String str, EntryHeader entryHeader, String str2, NewsEntryWithAttachments.Cut cut, List<EntryAttachment> list, NewsEntry.TrackData trackData, EntryDescription entryDescription, boolean z, int i2, EasyPromote easyPromote) {
        super(trackData, entryHeader, list, cut);
        this.l = j;
        this.m = owner;
        this.n = i;
        this.o = arrayList;
        this.p = caption;
        this.q = str;
        this.r = entryHeader;
        this.s = str2;
        this.t = cut;
        this.u = list;
        this.v = trackData;
        this.w = entryDescription;
        this.x = z;
        this.y = i2;
        this.z = easyPromote;
    }

    @Override // xsna.c6z
    public final void W2() {
    }
}
