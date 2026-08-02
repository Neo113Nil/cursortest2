package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockArtistBio.kt */
/* loaded from: classes16.dex */
public final class UIBlockArtistBio extends UIBlock {
    public static final Serializer.c<UIBlockArtistBio> CREATOR = new a();
    public final String A;
    public final String B;
    public final Artist y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockArtistBio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockArtistBio a(Serializer serializer) {
            return new UIBlockArtistBio(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockArtistBio[i];
        }
    }

    public /* synthetic */ UIBlockArtistBio(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, Artist artist, CatalogLaunchOrigin catalogLaunchOrigin, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, artist, catalogLaunchOrigin, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.j0(this.B);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockArtistBio) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockArtistBio uIBlockArtistBio = (UIBlockArtistBio) obj;
        return epx.f(this.y, uIBlockArtistBio.y) && epx.f(this.z, uIBlockArtistBio.z) && epx.f(this.A, uIBlockArtistBio.A) && epx.f(this.B, uIBlockArtistBio.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<id ");
        return ho8.a(sb, this.y.b, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        return new UIBlockArtistBio(this.b, this.d, this.e, this.f, a2, a3, hashSet, Artist.zb(this.y), this.p, this.z, this.A, this.B);
    }

    public UIBlockArtistBio(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, Artist artist, CatalogLaunchOrigin catalogLaunchOrigin, String str3, String str4, String str5) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, null, null, null, null, null, null, catalogLaunchOrigin, null, 24320, null);
        this.y = artist;
        this.z = str3;
        this.A = str4;
        this.B = str5;
    }

    public UIBlockArtistBio(Serializer serializer) {
        super(serializer);
        this.y = (Artist) serializer.G(Artist.class.getClassLoader());
        this.z = serializer.H();
        this.A = serializer.H();
        this.B = serializer.H();
    }
}
