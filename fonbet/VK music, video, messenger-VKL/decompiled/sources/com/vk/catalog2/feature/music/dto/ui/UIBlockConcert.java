package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockConcert.kt */
/* loaded from: classes16.dex */
public final class UIBlockConcert extends UIBlock implements dfp0 {
    public final boolean y;
    public final CatalogConcertItem z;

    public UIBlockConcert(a aVar, CatalogConcertItem catalogConcertItem, boolean z) {
        super(aVar);
        this.z = catalogConcertItem;
        this.y = z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z.b.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.L(this.y ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockConcert) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockConcert uIBlockConcert = (UIBlockConcert) obj;
        return epx.f(this.z, uIBlockConcert.z) && this.y == uIBlockConcert.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z, Boolean.valueOf(this.y));
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z.d;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("CONCERT["), this.b, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        a Ab = Ab();
        CatalogConcertItem catalogConcertItem = this.z;
        return new UIBlockConcert(Ab, new CatalogConcertItem(catalogConcertItem.b, catalogConcertItem.c, catalogConcertItem.d), this.y);
    }
}
