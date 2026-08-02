package com.vk.catalog2.common.dto.ui;

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
import xsna.ho8;
import xsna.i7o0;
import xsna.j5g;
import xsna.viu;

/* compiled from: UIBlockButtons.kt */
/* loaded from: classes16.dex */
public final class UIBlockButtons extends UIBlock {
    public static final Serializer.c<UIBlockButtons> CREATOR = new a();
    public final ArrayList<UIBlock> y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockButtons> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockButtons a(Serializer serializer) {
            return new UIBlockButtons(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockButtons[i];
        }
    }

    public UIBlockButtons(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, List<? extends UIBlock> list2, CatalogViewStyle catalogViewStyle) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, null, null, 32000, null);
        this.y = new ArrayList<>(list2);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.y);
    }

    public final ArrayList<UIBlock> Pb() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockButtons) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockButtons) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("Buttons {"), j5g.g0(this.y, null, null, null, 0, new viu(29), 31), '}');
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
        ArrayList arrayList = new ArrayList();
        Iterator<UIBlock> it2 = this.y.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().zb());
        }
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockButtons(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, arrayList, catalogViewStyle != null ? catalogViewStyle.copy() : null);
    }

    public UIBlockButtons(Serializer serializer) {
        super(serializer);
        ArrayList<UIBlock> k = serializer.k(UIBlock.class);
        this.y = k == null ? new ArrayList<>() : k;
    }
}
