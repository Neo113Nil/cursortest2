package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockBadge.kt */
/* loaded from: classes16.dex */
public final class UIBlockBadge extends UIBlock {
    public static final Serializer.c<UIBlockBadge> CREATOR = new a();
    public CatalogBadge y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockBadge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockBadge a(Serializer serializer) {
            return new UIBlockBadge(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockBadge[i];
        }
    }

    public UIBlockBadge(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, CatalogBadge catalogBadge) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = catalogBadge;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Pb, reason: merged with bridge method [inline-methods] */
    public final UIBlockBadge zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogBadge catalogBadge = this.y;
        return new UIBlockBadge(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, catalogBadge != null ? CatalogBadge.zb(catalogBadge, null, 3) : null);
    }

    public final CatalogBadge Qb() {
        return this.y;
    }

    public final void Rb(CatalogBadge catalogBadge) {
        this.y = catalogBadge;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UIBlockBadge) && UIBlock.a.b(this, (UIBlock) obj) && epx.f(this.y, ((UIBlockBadge) obj).y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "Badge[" + this.y + ']';
    }

    public UIBlockBadge(Serializer serializer) {
        super(serializer);
        this.y = (CatalogBadge) serializer.G(CatalogBadge.class.getClassLoader());
    }
}
