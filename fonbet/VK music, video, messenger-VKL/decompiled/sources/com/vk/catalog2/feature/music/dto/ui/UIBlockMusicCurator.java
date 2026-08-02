package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.music.Curator;
import java.util.Objects;
import xsna.dfp0;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockMusicCurator.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicCurator extends UIBlockMusicPage implements dfp0 {
    public static final Serializer.c<UIBlockMusicCurator> CREATOR = new a();
    public final Curator z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicCurator> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicCurator a(Serializer serializer) {
            return new UIBlockMusicCurator(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicCurator[i];
        }
    }

    public UIBlockMusicCurator(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockHint uIBlockHint, Curator curator, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock) {
        super(aVar, uIBlockHint, uIBlockActionPlayAudiosFromBlock);
        this.z = curator;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z.b;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Pb() {
        return this.z.h;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Qb() {
        return this.z.f.length() > 0;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Rb() {
        return true;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final Image Sb() {
        return this.z.e;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final boolean Tb() {
        return this.z.g;
    }

    @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPage
    public final void Ub() {
        this.z.g = true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockMusicCurator) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.z, ((UIBlockMusicCurator) obj).z);
        }
        return false;
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
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.i;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("Curator<"), this.z.c, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        Curator curator = this.z;
        Curator curator2 = new Curator(curator.b, curator.c, curator.d, curator.e, curator.f, curator.g, curator.h, curator.i);
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.y;
        return new UIBlockMusicCurator(Ab, zb, curator2, uIBlockActionPlayAudiosFromBlock != null ? uIBlockActionPlayAudiosFromBlock.zb() : null);
    }

    public UIBlockMusicCurator(Serializer serializer) {
        super(serializer);
        this.z = (Curator) serializer.G(Curator.class.getClassLoader());
    }
}
