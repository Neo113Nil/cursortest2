package com.vk.dto.newsfeed.entries;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.nft.Nft;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.NftAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.List;
import xsna.c6z;
import xsna.e43;
import xsna.l490;
import xsna.pwu;
import xsna.rsx0;
import xsna.wee0;

/* compiled from: Photos.kt */
/* loaded from: classes18.dex */
public final class Photos extends NewsEntryWithAttachments implements c6z, l490, wee0, rsx0 {
    public static final Serializer.c<Photos> CREATOR = new b();
    public final int l;
    public final int m;
    public final long n;
    public final Owner o;
    public final int p;
    public final ArrayList<EntryAttachment> q;
    public final int r;
    public final Float s;
    public final EntryHeader t;
    public final List<EntryAttachment> u;
    public final NewsEntryWithAttachments.Cut v;
    public final NewsEntry.TrackData w;

    /* compiled from: Photos.kt */
    public static final class a {
        public static Photos a(Photo photo) {
            Owner owner;
            ArrayList a = e43.a(new EntryAttachment(new PhotoAttachment(photo), null, null, null, 14, null));
            UserProfile userProfile = photo.B;
            if (userProfile != null) {
                owner = userProfile.l0();
            } else {
                owner = new Owner(photo.e, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194302, null);
            }
            return new Photos(9, photo.C, photo.e.b, owner, photo.g, a, 1, null, pwu.b(owner), new ArrayList(), new NewsEntryWithAttachments.Cut(-1, -1, 1.0f, false, 8, null), new NewsEntry.TrackData(null, 0, 0L, false, false, null, null, 0, 255, null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Photos> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Photos a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            long w = serializer.w();
            Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
            int u3 = serializer.u();
            ArrayList k = serializer.k(EntryAttachment.class);
            if (k == null) {
                k = new ArrayList();
            }
            int u4 = serializer.u();
            Float t = serializer.t();
            EntryHeader entryHeader = (EntryHeader) serializer.G(EntryHeader.class.getClassLoader());
            ArrayList k2 = serializer.k(EntryAttachment.class);
            if (k2 == null) {
                k2 = new ArrayList();
            }
            return new Photos(u, u2, w, owner, u3, k, u4, t, entryHeader, k2, (NewsEntryWithAttachments.Cut) serializer.G(NewsEntryWithAttachments.Cut.class.getClassLoader()), (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Photos[i];
        }
    }

    public Photos(int i, int i2, long j, Owner owner, int i3, ArrayList<EntryAttachment> arrayList, int i4, Float f, EntryHeader entryHeader, List<EntryAttachment> list, NewsEntryWithAttachments.Cut cut, NewsEntry.TrackData trackData) {
        super(trackData, entryHeader, list, cut);
        this.l = i;
        this.m = i2;
        this.n = j;
        this.o = owner;
        this.p = i3;
        this.q = arrayList;
        this.r = i4;
        this.s = f;
        this.t = entryHeader;
        this.u = list;
        this.v = cut;
        this.w = trackData;
    }

    public static Photos Lb(Photos photos, int i, ArrayList arrayList, EntryHeader entryHeader, int i2) {
        int i3 = photos.l;
        int i4 = (i2 & 2) != 0 ? photos.m : i;
        long j = photos.n;
        Owner owner = photos.o;
        int i5 = photos.p;
        ArrayList arrayList2 = (i2 & 32) != 0 ? photos.q : arrayList;
        int i6 = photos.r;
        Float f = photos.s;
        EntryHeader entryHeader2 = (i2 & 256) != 0 ? photos.t : entryHeader;
        List<EntryAttachment> list = photos.u;
        NewsEntryWithAttachments.Cut cut = photos.v;
        NewsEntry.TrackData trackData = photos.w;
        photos.getClass();
        return new Photos(i3, i4, j, owner, i5, arrayList2, i6, f, entryHeader2, list, cut, trackData);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        PhotoAttachment Mb;
        Photo photo;
        if (this.q.size() != 1 || (Mb = Mb()) == null || (photo = Mb.l) == null) {
            return null;
        }
        return "photo" + photo.e + '_' + photo.c;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        PhotoAttachment Mb;
        Photo photo;
        if (this.q.size() != 1 || (Mb = Mb()) == null || (photo = Mb.l) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(photo.e);
        sb.append('_');
        sb.append(photo.c);
        return sb.toString();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.w;
    }

    @Override // xsna.rsx0
    public final int D() {
        return this.p;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        int i = this.l;
        return i != 7 ? i != 9 ? "photo" : "wall_photo" : "photo_tag";
    }

    @Override // xsna.c6z
    public final int E1() {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return 0;
        }
        return photo.j;
    }

    @Override // xsna.wee0
    public final Owner G() {
        return this.o;
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments
    public final List<EntryAttachment> Gb() {
        return this.u;
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments
    public final NewsEntryWithAttachments.Cut Hb() {
        return this.v;
    }

    @Override // xsna.grj0
    public final boolean J() {
        Photo photo;
        PhotoAttachment Mb = Mb();
        return (Mb == null || (photo = Mb.l) == null || !photo.n) ? false : true;
    }

    public final PhotoAttachment Mb() {
        Attachment R1 = R1();
        if (R1 instanceof PhotoAttachment) {
            return (PhotoAttachment) R1;
        }
        return null;
    }

    @Override // xsna.fsx0
    public final List<EntryAttachment> N7() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Nb(Photo photo) {
        Attachment photoAttachment;
        ArrayList<EntryAttachment> arrayList = this.q;
        if (arrayList.size() == 0) {
            return;
        }
        Attachment attachment = arrayList.remove(0).b;
        if (attachment instanceof NftAttachment) {
            Nft nft = ((NftAttachment) attachment).y;
            photoAttachment = new NftAttachment(new Nft(nft.b, nft.c, nft.d, photo, nft.f, nft.g, nft.h, nft.i, nft.j, nft.k, nft.l, nft.m, nft.n), null, 2, 0 == true ? 1 : 0);
        } else {
            photoAttachment = new PhotoAttachment(photo);
        }
        arrayList.add(0, new EntryAttachment(photoAttachment, null, null, null, 14, null));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.l);
        serializer.S(this.m);
        serializer.Y(this.n);
        serializer.i0(this.o);
        serializer.S(this.p);
        serializer.W(this.q);
        serializer.S(this.r);
        serializer.R(this.s);
        serializer.i0(this.t);
        serializer.W(this.u);
        serializer.i0(this.v);
        serializer.i0(this.w);
    }

    @Override // xsna.grj0
    public final int T9() {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return 0;
        }
        return photo.h;
    }

    @Override // xsna.c6z
    public final void U8(int i) {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return;
        }
        photo.i = i;
    }

    @Override // xsna.c6z
    public final boolean b9() {
        Photo photo;
        PhotoAttachment Mb = Mb();
        return (Mb == null || (photo = Mb.l) == null || !photo.q) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Photos) {
            Photos photos = (Photos) obj;
            if (this.m == photos.m && this.n == photos.n && this.p == photos.p) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.grj0
    public final void f(int i) {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return;
        }
        photo.h = i;
    }

    @Override // xsna.grj0
    public final void f0(boolean z) {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return;
        }
        photo.n = z;
    }

    @Override // xsna.c6z
    public final int fa() {
        return 0;
    }

    @Override // com.vk.feed.core.models.news.NewsEntryWithAttachments, xsna.wsx0
    public final EntryHeader getHeader() {
        return this.t;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.m) * 31) + ((int) this.n)) * 31) + this.p;
    }

    @Override // xsna.c6z
    public final int i7() {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return 0;
        }
        return photo.i;
    }

    @Override // xsna.c6z
    public final boolean l0() {
        Photo photo;
        PhotoAttachment Mb = Mb();
        return (Mb == null || (photo = Mb.l) == null || !photo.o) ? false : true;
    }

    @Override // xsna.c6z
    public final boolean qa() {
        return E1() > 0 || l0();
    }

    @Override // xsna.c6z
    public final String r() {
        return this.w.b;
    }

    @Override // xsna.c6z
    public final void r0(boolean z) {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return;
        }
        photo.o = z;
    }

    @Override // xsna.l490
    public final Owner s() {
        return this.o;
    }

    public final String toString() {
        return "Photos(type=" + this.l + ", postId=" + this.m + ", sourceId=" + this.n + ", publisher=" + this.o + ", date=" + this.p + ", items=" + this.q + ", count=" + this.r + ", thumbsMaxHeight=" + this.s + ", header=" + this.t + ", attachments=" + this.u + ", cut=" + this.v + ", trackData=" + this.w + ')';
    }

    @Override // xsna.c6z
    public final void v6(int i) {
        Photo photo;
        PhotoAttachment Mb = Mb();
        if (Mb == null || (photo = Mb.l) == null) {
            return;
        }
        photo.j = i;
    }

    @Override // xsna.c6z
    public final int w0() {
        return 0;
    }

    @Override // xsna.c6z
    public final boolean x1() {
        return false;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return this.l;
    }

    @Override // xsna.c6z
    public final void W2() {
    }

    @Override // xsna.c6z
    public final void sb(int i) {
    }
}
