package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.music.Artist;
import java.util.Objects;
import xsna.dfp0;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockMusicArtist.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicArtist extends UIBlockMusicPage implements dfp0 {
    public static final Serializer.c<UIBlockMusicArtist> CREATOR = new a();
    public final String A;
    public final Artist z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicArtist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicArtist a(Serializer serializer) {
            return new UIBlockMusicArtist(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicArtist[i];
        }
    }

    public UIBlockMusicArtist(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockHint uIBlockHint, Artist artist, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock, String str) {
        super(aVar, uIBlockHint, uIBlockActionPlayAudiosFromBlock);
        this.z = artist;
        this.A = str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z.b;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Pb() {
        return this.z.h;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Qb() {
        return true;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Rb() {
        if (this.z.e != null) {
            return !r0.isEmpty();
        }
        return false;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final Image Sb() {
        return this.z.f;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Tb() {
        return this.z.i;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final void Ub() {
        this.z.i = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicArtist) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicArtist uIBlockMusicArtist = (UIBlockMusicArtist) obj;
        return epx.f(this.z, uIBlockMusicArtist.z) && epx.f(this.A, uIBlockMusicArtist.A);
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final String getName() {
        String str = this.z.c;
        if (str != null) {
            return drm0.p0(str).toString();
        }
        return null;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z, this.A);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.j;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("Artist["), this.z.c, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        Artist zb2 = Artist.zb(this.z);
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.y;
        return new UIBlockMusicArtist(Ab, zb, zb2, uIBlockActionPlayAudiosFromBlock != null ? uIBlockActionPlayAudiosFromBlock.zb() : null, this.A);
    }

    public UIBlockMusicArtist(Serializer serializer) {
        super(serializer);
        this.z = (Artist) serializer.G(Artist.class.getClassLoader());
        this.A = serializer.H();
    }
}
