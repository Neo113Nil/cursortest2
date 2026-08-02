package com.vk.catalog2.common.dto.ui.subscriptions;

import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
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
import xsna.ms9;

/* compiled from: UIBlockHorizontalButtonSmall.kt */
/* loaded from: classes16.dex */
public final class UIBlockHorizontalButtonSmall extends UIBlock {
    public static final Serializer.c<UIBlockHorizontalButtonSmall> CREATOR = new a();
    public final List<CatalogButtonOpenUrl> y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockHorizontalButtonSmall> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockHorizontalButtonSmall a(Serializer serializer) {
            return new UIBlockHorizontalButtonSmall(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockHorizontalButtonSmall[i];
        }
    }

    public UIBlockHorizontalButtonSmall(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, List<CatalogButtonOpenUrl> list2, String str3, CatalogViewStyle catalogViewStyle) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, str3, null, null, null, null, 30976, null);
        this.y = list2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.f0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockHorizontalButtonSmall) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockHorizontalButtonSmall) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)));
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ms9.a(']', new StringBuilder("Buttons["), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.y);
        ArrayList a4 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockHorizontalButtonSmall(this.b, this.d, this.e, this.f, a2, a4, hashSet, zb, a3, this.c, catalogViewStyle != null ? catalogViewStyle.copy() : null);
    }

    public UIBlockHorizontalButtonSmall(Serializer serializer) {
        super(serializer);
        this.y = serializer.B(CatalogButtonOpenUrl.class.getClassLoader());
    }
}
