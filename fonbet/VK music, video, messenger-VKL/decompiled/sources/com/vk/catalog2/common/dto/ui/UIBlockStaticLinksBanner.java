package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockStaticLinksBanner.kt */
/* loaded from: classes16.dex */
public final class UIBlockStaticLinksBanner extends UIBlock {
    public static final Serializer.c<UIBlockStaticLinksBanner> CREATOR = new a();
    public final ArrayList<UIBlockLink> y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockStaticLinksBanner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockStaticLinksBanner a(Serializer serializer) {
            return new UIBlockStaticLinksBanner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockStaticLinksBanner[i];
        }
    }

    public UIBlockStaticLinksBanner(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, List<UIBlockLink> list2) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = new ArrayList<>(list2);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.o0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockStaticLinksBanner) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockStaticLinksBanner) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return j.b(']', new StringBuilder("LINKS["), this.y);
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
        return new UIBlockStaticLinksBanner(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, i7o0.a(this.y));
    }

    public UIBlockStaticLinksBanner(Serializer serializer) {
        super(serializer);
        this.y = serializer.j(UIBlockLink.CREATOR);
    }
}
