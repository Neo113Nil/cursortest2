package com.vk.catalog2.feature.search.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
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

/* compiled from: UIBlockSearchSpellcheck.kt */
/* loaded from: classes16.dex */
public final class UIBlockSearchSpellcheck extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockSearchSpellcheck> CREATOR = new a();
    public final CatalogSearchSpellcheckResult y;
    public boolean z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSearchSpellcheck> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSearchSpellcheck a(Serializer serializer) {
            return new UIBlockSearchSpellcheck(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSearchSpellcheck[i];
        }
    }

    public UIBlockSearchSpellcheck(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, CatalogSearchSpellcheckResult catalogSearchSpellcheckResult) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = catalogSearchSpellcheckResult;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UIBlockSearchSpellcheck) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSearchSpellcheck uIBlockSearchSpellcheck = (UIBlockSearchSpellcheck) obj;
        return epx.f(this.y, uIBlockSearchSpellcheck.y) && this.z == uIBlockSearchSpellcheck.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.c;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("UIBlockSearchSpellcheck[id:");
        sb.append(this.b);
        sb.append(" trackcode:");
        CatalogSearchSpellcheckResult catalogSearchSpellcheckResult = this.y;
        sb.append(catalogSearchSpellcheckResult.c);
        sb.append(" spellcheckResult:");
        sb.append(catalogSearchSpellcheckResult);
        sb.append(']');
        return sb.toString();
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
        CatalogSearchSpellcheckResult catalogSearchSpellcheckResult = this.y;
        UIBlockSearchSpellcheck uIBlockSearchSpellcheck = new UIBlockSearchSpellcheck(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, new CatalogSearchSpellcheckResult(catalogSearchSpellcheckResult.b, catalogSearchSpellcheckResult.c, catalogSearchSpellcheckResult.d, catalogSearchSpellcheckResult.e, catalogSearchSpellcheckResult.f, catalogSearchSpellcheckResult.g, catalogSearchSpellcheckResult.h));
        uIBlockSearchSpellcheck.z = this.z;
        return uIBlockSearchSpellcheck;
    }

    public UIBlockSearchSpellcheck(Serializer serializer) {
        super(serializer);
        this.y = (CatalogSearchSpellcheckResult) serializer.G(CatalogSearchSpellcheckResult.class.getClassLoader());
        this.z = serializer.m();
    }
}
