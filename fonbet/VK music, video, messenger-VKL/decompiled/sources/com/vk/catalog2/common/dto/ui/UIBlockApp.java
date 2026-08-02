package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.games.CatalogMiniAppItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockApp.kt */
/* loaded from: classes16.dex */
public final class UIBlockApp extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockApp> CREATOR = new a();
    public final ApiApplication y;
    public final CatalogMiniAppItem z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockApp> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockApp a(Serializer serializer) {
            return new UIBlockApp(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockApp[i];
        }
    }

    public UIBlockApp(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, ApiApplication apiApplication, CatalogMiniAppItem catalogMiniAppItem) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = apiApplication;
        this.z = catalogMiniAppItem;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockApp) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        if (!epx.f(this.y, ((UIBlockApp) obj).y)) {
            return false;
        }
        CatalogMiniAppItem catalogMiniAppItem = this.z;
        return epx.f(catalogMiniAppItem, catalogMiniAppItem);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        String str;
        CatalogMiniAppItem catalogMiniAppItem = this.z;
        return (catalogMiniAppItem == null || (str = catalogMiniAppItem.c) == null) ? this.y.B : str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "APP[" + this.y + ']';
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
        ApiApplication apiApplication = new ApiApplication(this.y);
        CatalogMiniAppItem catalogMiniAppItem = this.z;
        return new UIBlockApp(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, apiApplication, catalogMiniAppItem != null ? new CatalogMiniAppItem(catalogMiniAppItem.b, catalogMiniAppItem.c, catalogMiniAppItem.d) : null);
    }

    public UIBlockApp(Serializer serializer) {
        super(serializer);
        this.y = (ApiApplication) serializer.G(ApiApplication.class.getClassLoader());
        this.z = (CatalogMiniAppItem) serializer.G(CatalogMiniAppItem.class.getClassLoader());
    }
}
