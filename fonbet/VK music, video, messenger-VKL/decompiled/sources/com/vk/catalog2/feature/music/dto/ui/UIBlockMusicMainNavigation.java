package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.j5g;
import xsna.qjg;
import xsna.z7w;

/* compiled from: UIBlockMusicMainNavigation.kt */
/* loaded from: classes16.dex */
public final class UIBlockMusicMainNavigation extends UIBlock {
    public static final Serializer.c<UIBlockMusicMainNavigation> CREATOR = new a();
    public final ArrayList y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMusicMainNavigation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMusicMainNavigation a(Serializer serializer) {
            return new UIBlockMusicMainNavigation(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMusicMainNavigation[i];
        }
    }

    public UIBlockMusicMainNavigation(Serializer serializer) {
        super(serializer);
        ArrayList k = serializer.k(UIBlockActionSwitchSection.class);
        this.y = k == null ? new ArrayList() : k;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b + j5g.g0(this.y, null, null, null, 0, new z7w(25), 31);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockMusicMainNavigation) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockMusicMainNavigation) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockMusicMainNavigation(Ab(), this.y);
    }

    public UIBlockMusicMainNavigation(com.vk.catalog2.common.dto.api.ui.a aVar, List<UIBlockActionSwitchSection> list) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, null, null, null, null, null, null, null, 32512, null);
        this.y = new ArrayList(list);
    }
}
