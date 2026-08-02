package com.vk.dto.nft;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: Nft.kt */
/* loaded from: classes18.dex */
public final class Nft extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Nft> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final Photo e;
    public final String f;
    public final String g;
    public final String h;
    public final NftCollection i;
    public final List<NftOrigin> j;
    public final NftAttachmentPresentationMode k;
    public final String l;
    public final NftMediaType m;
    public final String n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Nft> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Nft a(Serializer serializer) {
            return new Nft((UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), (Photo) serializer.G(Photo.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), (NftCollection) serializer.A(NftCollection.class.getClassLoader()), serializer.k(NftOrigin.class), (NftAttachmentPresentationMode) serializer.C(), serializer.H(), (NftMediaType) serializer.C(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Nft[i];
        }
    }

    public /* synthetic */ Nft(UserId userId, String str, String str2, Photo photo, String str3, String str4, String str5, NftCollection nftCollection, List list, NftAttachmentPresentationMode nftAttachmentPresentationMode, String str6, NftMediaType nftMediaType, String str7, int i, zcl zclVar) {
        this(userId, str, str2, photo, str3, str4, str5, (i & 128) != 0 ? null : nftCollection, (i & 256) != 0 ? null : list, (i & 512) != 0 ? NftAttachmentPresentationMode.STANDARD : nftAttachmentPresentationMode, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? NftMediaType.IMAGE : nftMediaType, (i & 4096) != 0 ? null : str7);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.e0(this.i);
        serializer.W(this.j);
        serializer.g0(this.k);
        serializer.j0(this.l);
        serializer.g0(this.m);
        serializer.j0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nft)) {
            return false;
        }
        Nft nft = (Nft) obj;
        return epx.f(this.b, nft.b) && epx.f(this.c, nft.c) && epx.f(this.d, nft.d) && epx.f(this.e, nft.e) && epx.f(this.f, nft.f) && epx.f(this.g, nft.g) && epx.f(this.h, nft.h) && epx.f(this.i, nft.i) && epx.f(this.j, nft.j) && this.k == nft.k && epx.f(this.l, nft.l) && this.m == nft.m && epx.f(this.n, nft.n);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Nft(owner=");
        sb.append(this.b);
        sb.append(", walletPublicId=");
        sb.append(this.c);
        sb.append(", nftPublicId=");
        sb.append(this.d);
        sb.append(", photo=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", description=");
        sb.append(this.g);
        sb.append(", appLogo=");
        sb.append(this.h);
        sb.append(", nftCollection=");
        sb.append(this.i);
        sb.append(", origins=");
        sb.append(this.j);
        sb.append(", attachmentPresentationMode=");
        sb.append(this.k);
        sb.append(", price=");
        sb.append(this.l);
        sb.append(", mediaType=");
        sb.append(this.m);
        sb.append(", collectionInternalId=");
        return ho8.a(sb, this.n, ')');
    }

    public Nft(UserId userId, String str, String str2, Photo photo, String str3, String str4, String str5, NftCollection nftCollection, List<NftOrigin> list, NftAttachmentPresentationMode nftAttachmentPresentationMode, String str6, NftMediaType nftMediaType, String str7) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = photo;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = nftCollection;
        this.j = list;
        this.k = nftAttachmentPresentationMode;
        this.l = str6;
        this.m = nftMediaType;
        this.n = str7;
    }
}
