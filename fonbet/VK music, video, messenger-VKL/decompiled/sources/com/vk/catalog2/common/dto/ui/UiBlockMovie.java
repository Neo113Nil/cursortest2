package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.catalog2.common.dto.api.video.CatalogMovieItem;
import java.util.Objects;
import xsna.epx;

/* compiled from: UiBlockMovie.kt */
/* loaded from: classes16.dex */
public final class UiBlockMovie extends UIBlock {
    public final CatalogMovieItem y;

    public UiBlockMovie(a aVar, CatalogMovieItem catalogMovieItem) {
        super(aVar);
        this.y = catalogMovieItem;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    public final CatalogMovieItem Pb() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UiBlockMovie) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UiBlockMovie) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return this.y.toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        a Ab = Ab();
        CatalogMovieItem catalogMovieItem = this.y;
        return new UiBlockMovie(Ab, new CatalogMovieItem(catalogMovieItem.b, catalogMovieItem.c, catalogMovieItem.d, catalogMovieItem.e, catalogMovieItem.f, catalogMovieItem.g, catalogMovieItem.h, catalogMovieItem.i));
    }
}
