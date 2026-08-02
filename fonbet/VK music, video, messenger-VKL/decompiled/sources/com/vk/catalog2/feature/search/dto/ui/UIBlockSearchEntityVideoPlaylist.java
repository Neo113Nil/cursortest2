package com.vk.catalog2.feature.search.dto.ui;

import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityVideoPlaylist;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import java.util.List;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockSearchEntityVideoPlaylist.kt */
/* loaded from: classes16.dex */
public final class UIBlockSearchEntityVideoPlaylist extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockSearchEntityVideoPlaylist> CREATOR = new a();
    public final UIBlockActionPlayVideosFromBlock A;
    public final VideoAlbum B;
    public final CatalogSearchEntityVideoPlaylist y;
    public final UIBlockActionToggleAlbumSubscription z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSearchEntityVideoPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSearchEntityVideoPlaylist a(Serializer serializer) {
            return new UIBlockSearchEntityVideoPlaylist(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSearchEntityVideoPlaylist[i];
        }
    }

    public UIBlockSearchEntityVideoPlaylist(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist, UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription, UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock, VideoAlbum videoAlbum) {
        super(aVar);
        this.y = catalogSearchEntityVideoPlaylist;
        this.z = uIBlockActionToggleAlbumSubscription;
        this.A = uIBlockActionPlayVideosFromBlock;
        this.B = videoAlbum;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.i0(this.A);
        serializer.i0(this.B);
    }

    public final UIBlockSearchEntityVideoPlaylist Pb(VideoAlbum videoAlbum) {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist = this.y;
        CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist2 = new CatalogSearchEntityVideoPlaylist(catalogSearchEntityVideoPlaylist.b, catalogSearchEntityVideoPlaylist.c, catalogSearchEntityVideoPlaylist.d, catalogSearchEntityVideoPlaylist.e, catalogSearchEntityVideoPlaylist.f, catalogSearchEntityVideoPlaylist.g, catalogSearchEntityVideoPlaylist.h, catalogSearchEntityVideoPlaylist.i, catalogSearchEntityVideoPlaylist.j, catalogSearchEntityVideoPlaylist.k);
        UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = null;
        UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription = this.z;
        UIBlockActionToggleAlbumSubscription zb = uIBlockActionToggleAlbumSubscription != null ? uIBlockActionToggleAlbumSubscription.zb() : null;
        UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock2 = this.A;
        if (uIBlockActionPlayVideosFromBlock2 != null) {
            List<VideoFile> list = uIBlockActionPlayVideosFromBlock2.C;
            uIBlockActionPlayVideosFromBlock = uIBlockActionPlayVideosFromBlock2.Rb(list != null ? i7o0.a(list) : null);
        }
        return new UIBlockSearchEntityVideoPlaylist(Ab, catalogSearchEntityVideoPlaylist2, zb, uIBlockActionPlayVideosFromBlock, videoAlbum);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UIBlockSearchEntityVideoPlaylist) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist = (UIBlockSearchEntityVideoPlaylist) obj;
        if (epx.f(this.y, uIBlockSearchEntityVideoPlaylist.y) && epx.f(this.z, uIBlockSearchEntityVideoPlaylist.z) && epx.f(this.A, uIBlockSearchEntityVideoPlaylist.A)) {
            return epx.f(this.B, uIBlockSearchEntityVideoPlaylist.B);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.e;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("UIBlockSearchEntity[id:");
        sb.append(this.b);
        sb.append(" trackcode:");
        CatalogSearchEntityVideoPlaylist catalogSearchEntityVideoPlaylist = this.y;
        sb.append(catalogSearchEntityVideoPlaylist.e);
        sb.append(" entity:");
        sb.append(catalogSearchEntityVideoPlaylist);
        sb.append(" followAction:");
        sb.append(this.z);
        sb.append(" playVideoAction:");
        sb.append(this.A);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return Pb(VideoAlbum.Ab(this.B, false, null, 262143));
    }

    public UIBlockSearchEntityVideoPlaylist(Serializer serializer) {
        super(serializer);
        this.y = (CatalogSearchEntityVideoPlaylist) serializer.G(CatalogSearchEntityVideoPlaylist.class.getClassLoader());
        this.z = (UIBlockActionToggleAlbumSubscription) serializer.G(UIBlockActionToggleAlbumSubscription.class.getClassLoader());
        this.A = (UIBlockActionPlayVideosFromBlock) serializer.G(UIBlockActionPlayVideosFromBlock.class.getClassLoader());
        this.B = (VideoAlbum) serializer.G(VideoAlbum.class.getClassLoader());
    }
}
