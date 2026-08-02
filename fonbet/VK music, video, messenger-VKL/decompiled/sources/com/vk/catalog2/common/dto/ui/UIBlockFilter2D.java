package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
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

/* compiled from: UIBlockFilter2D.kt */
/* loaded from: classes16.dex */
public final class UIBlockFilter2D extends UIBlock {
    public static final Serializer.c<UIBlockFilter2D> CREATOR = new a();
    public final UIBlockList y;
    public final UIBlockList z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockFilter2D> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockFilter2D a(Serializer serializer) {
            return new UIBlockFilter2D(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockFilter2D[i];
        }
    }

    public UIBlockFilter2D(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, UIBlockList uIBlockList, UIBlockList uIBlockList2, CatalogViewStyle catalogViewStyle) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, null, null, 32000, null);
        this.z = uIBlockList;
        this.y = uIBlockList2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockFilter2D) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockFilter2D uIBlockFilter2D = (UIBlockFilter2D) obj;
        return epx.f(this.z, uIBlockFilter2D.z) && epx.f(this.y, uIBlockFilter2D.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z, this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "UIBlockFilter2D [show_filter = " + this.y + ", block_filter = " + this.z + ']';
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
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        UIBlockList zb2 = this.z.zb();
        UIBlockList zb3 = this.y.zb();
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockFilter2D(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, zb2, zb3, catalogViewStyle != null ? catalogViewStyle.copy() : null);
    }

    public UIBlockFilter2D(Serializer serializer) {
        super(serializer);
        UIBlockList uIBlockList = (UIBlockList) serializer.G(UIBlockList.class.getClassLoader());
        if (uIBlockList == null) {
            Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
            uIBlockList = UIBlockList.a.a();
        }
        this.z = uIBlockList;
        UIBlockList uIBlockList2 = (UIBlockList) serializer.G(UIBlockList.class.getClassLoader());
        if (uIBlockList2 == null) {
            Serializer.c<UIBlockList> cVar2 = UIBlockList.CREATOR;
            uIBlockList2 = UIBlockList.a.a();
        }
        this.y = uIBlockList2;
    }
}
