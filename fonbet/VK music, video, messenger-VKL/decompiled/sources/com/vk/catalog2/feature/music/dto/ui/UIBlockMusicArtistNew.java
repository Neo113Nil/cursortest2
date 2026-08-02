package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.music.Artist;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.c5g;
import xsna.dfp0;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;

/* compiled from: UIBlockMusicArtistNew.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicArtistNew extends UIBlockMusicPage implements dfp0 {
    public static final Serializer.c<UIBlockMusicArtistNew> CREATOR = new a();
    public final String A;
    public final List<UIBlockAction> B;
    public List<MusicArtistInfo> C;
    public final List<String> D;
    public final Artist z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicArtistNew> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicArtistNew a(Serializer serializer) {
            return new UIBlockMusicArtistNew(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicArtistNew[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockMusicArtistNew(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockHint uIBlockHint, Artist artist, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock, String str, List<? extends UIBlockAction> list, List<MusicArtistInfo> list2, List<String> list3) {
        super(aVar, uIBlockHint, uIBlockActionPlayAudiosFromBlock);
        this.z = artist;
        this.A = str;
        this.B = list;
        this.C = list2;
        this.D = list3;
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
        serializer.f0(this.B);
        serializer.f0(this.C);
        serializer.l0(this.D);
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

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Vb, reason: merged with bridge method [inline-methods] */
    public final UIBlockMusicArtistNew zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        Artist zb2 = Artist.zb(this.z);
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.y;
        UIBlockActionPlayAudiosFromBlock zb3 = uIBlockActionPlayAudiosFromBlock != null ? uIBlockActionPlayAudiosFromBlock.zb() : null;
        ArrayList a2 = i7o0.a(this.B);
        List<MusicArtistInfo> list = this.C;
        int i = 10;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MusicArtistInfo musicArtistInfo : list) {
            List<MusicArtistChip> list2 = musicArtistInfo.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, i));
            for (MusicArtistChip musicArtistChip : list2) {
                UIBlockAction uIBlockAction = musicArtistChip.d;
                arrayList2.add(new MusicArtistChip(musicArtistChip.b, musicArtistChip.c, uIBlockAction != null ? uIBlockAction.zb() : null, musicArtistChip.e, musicArtistChip.f, musicArtistChip.g, musicArtistChip.h, musicArtistChip.i));
            }
            arrayList.add(new MusicArtistInfo(arrayList2, musicArtistInfo.c, musicArtistInfo.d, musicArtistInfo.e, musicArtistInfo.f, musicArtistInfo.g, musicArtistInfo.h, musicArtistInfo.i));
            i = 10;
        }
        return new UIBlockMusicArtistNew(Ab, zb, zb2, zb3, this.A, a2, arrayList, i7o0.a(this.D));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMusicArtistNew) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMusicArtistNew uIBlockMusicArtistNew = (UIBlockMusicArtistNew) obj;
        return epx.f(this.z, uIBlockMusicArtistNew.z) && epx.f(this.A, uIBlockMusicArtistNew.A) && epx.f(this.B, uIBlockMusicArtistNew.B) && epx.f(this.C, uIBlockMusicArtistNew.C) && epx.f(this.D, uIBlockMusicArtistNew.D);
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
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z, this.A, this.B, this.C, this.D);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.j;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("ArtistNew["), this.z.c, ']');
    }

    public UIBlockMusicArtistNew(Serializer serializer) {
        super(serializer);
        this.z = (Artist) serializer.G(Artist.class.getClassLoader());
        this.A = serializer.H();
        this.B = serializer.B(UIBlockAction.class.getClassLoader());
        this.C = serializer.B(MusicArtistInfo.class.getClassLoader());
        this.D = com.vk.core.serialize.a.a(serializer);
    }
}
