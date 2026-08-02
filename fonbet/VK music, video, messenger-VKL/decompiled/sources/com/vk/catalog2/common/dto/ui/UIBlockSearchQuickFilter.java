package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.search.SearchQuickFilterItem;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;

/* compiled from: UIBlockSearchQuickFilter.kt */
/* loaded from: classes16.dex */
public final class UIBlockSearchQuickFilter extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockSearchQuickFilter> CREATOR = new a();
    public final SearchQuickFilterItem A;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSearchQuickFilter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSearchQuickFilter a(Serializer serializer) {
            return new UIBlockSearchQuickFilter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSearchQuickFilter[i];
        }
    }

    public UIBlockSearchQuickFilter(com.vk.catalog2.common.dto.api.ui.a aVar, String str, SearchQuickFilterItem searchQuickFilterItem, String str2) {
        super(aVar);
        this.z = str;
        this.y = str2;
        this.A = searchQuickFilterItem;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.y);
        serializer.i0(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockSearchQuickFilter) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSearchQuickFilter uIBlockSearchQuickFilter = (UIBlockSearchQuickFilter) obj;
        return epx.f(this.z, uIBlockSearchQuickFilter.z) && epx.f(this.y, uIBlockSearchQuickFilter.y) && epx.f(this.A, uIBlockSearchQuickFilter.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "<SearchQuickFilter: " + this.z + " - " + this.A + '>';
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        SearchQuickFilterItem searchQuickFilterItem = this.A;
        return new UIBlockSearchQuickFilter(Ab, this.z, new SearchQuickFilterItem(searchQuickFilterItem.b, searchQuickFilterItem.c, searchQuickFilterItem.d, searchQuickFilterItem.e, searchQuickFilterItem.f, searchQuickFilterItem.g, searchQuickFilterItem.h, searchQuickFilterItem.i, searchQuickFilterItem.j, searchQuickFilterItem.k, searchQuickFilterItem.l, searchQuickFilterItem.m, searchQuickFilterItem.n), this.y);
    }

    public UIBlockSearchQuickFilter(Serializer serializer) {
        super(serializer);
        this.z = serializer.H();
        this.y = serializer.H();
        this.A = (SearchQuickFilterItem) serializer.G(UIBlockSearchQuickFilter.class.getClassLoader());
    }
}
