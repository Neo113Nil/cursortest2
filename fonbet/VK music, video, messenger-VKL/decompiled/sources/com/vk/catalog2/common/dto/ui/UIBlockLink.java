package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
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
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockLink.kt */
/* loaded from: classes16.dex */
public final class UIBlockLink extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockLink> CREATOR = new a();
    public final CatalogLink y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockLink a(Serializer serializer) {
            return new UIBlockLink(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockLink[i];
        }
    }

    public UIBlockLink(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, CatalogLink catalogLink, CatalogViewStyle catalogViewStyle, CatalogLaunchOrigin catalogLaunchOrigin) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, str3, null, null, catalogLaunchOrigin, null, 22784, null);
        this.y = catalogLink;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final CatalogLink Pb() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockLink) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockLink) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        Meta meta = this.y.g;
        if (meta != null) {
            return meta.d;
        }
        return null;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "LINK[" + this.y + ']';
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
        CatalogLink catalogLink = this.y;
        CatalogLink catalogLink2 = new CatalogLink(catalogLink.b, catalogLink.c, catalogLink.d, catalogLink.e, catalogLink.f, catalogLink.g, catalogLink.h, catalogLink.i, catalogLink.j, catalogLink.k, catalogLink.l, catalogLink.m, catalogLink.n);
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockLink(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.c, catalogLink2, catalogViewStyle != null ? catalogViewStyle.copy() : null, this.p);
    }

    public UIBlockLink(Serializer serializer) {
        super(serializer);
        this.y = (CatalogLink) serializer.G(CatalogLink.class.getClassLoader());
    }
}
