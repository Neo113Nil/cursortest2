package com.vk.catalog2.common.dto.ui.stickers;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;
import xsna.vu5;

/* compiled from: UIBlockSticker.kt */
/* loaded from: classes16.dex */
public final class UIBlockSticker extends UIBlock {
    public static final Serializer.c<UIBlockSticker> CREATOR = new a();
    public final StickerStockItemWithStickerId y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSticker a(Serializer serializer) {
            return new UIBlockSticker(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSticker[i];
        }
    }

    public UIBlockSticker(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, StickerStockItemWithStickerId stickerStockItemWithStickerId) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = stickerStockItemWithStickerId;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.c);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final StickerStockItemWithStickerId Pb() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockSticker) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSticker uIBlockSticker = (UIBlockSticker) obj;
        StickerStockItemWithStickerId stickerStockItemWithStickerId = uIBlockSticker.y;
        StickerStockItemWithStickerId stickerStockItemWithStickerId2 = this.y;
        if (!epx.f(stickerStockItemWithStickerId2, stickerStockItemWithStickerId)) {
            return false;
        }
        StickerStockItem stickerStockItem = stickerStockItemWithStickerId2.b;
        StickerStockItem stickerStockItem2 = stickerStockItemWithStickerId2.b;
        if (!epx.f(stickerStockItem, uIBlockSticker.y.b)) {
            return false;
        }
        boolean z = stickerStockItem2.h;
        StickerStockItem stickerStockItem3 = uIBlockSticker.y.b;
        if (z != stickerStockItem3.h || !epx.f(stickerStockItem2.E, stickerStockItem3.E)) {
            return false;
        }
        boolean z2 = stickerStockItem2.j;
        StickerStockItem stickerStockItem4 = uIBlockSticker.y.b;
        return z2 == stickerStockItem4.j && epx.f(stickerStockItem2.n, stickerStockItem4.n);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p));
        StickerStockItemWithStickerId stickerStockItemWithStickerId = this.y;
        StickerStockItem stickerStockItem = stickerStockItemWithStickerId.b;
        Boolean valueOf2 = Boolean.valueOf(stickerStockItem.h);
        StickerStockItemWithStickerId stickerStockItemWithStickerId2 = this.y;
        StickerStockItem stickerStockItem2 = stickerStockItemWithStickerId2.b;
        return Objects.hash(valueOf, stickerStockItemWithStickerId, stickerStockItem, valueOf2, stickerStockItem2.E, Boolean.valueOf(stickerStockItem2.j), stickerStockItemWithStickerId2.b.n);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return vu5.b(sb, this.y.c, '>');
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
        return new UIBlockSticker(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, StickerStockItemWithStickerId.zb(this.y, null, 3));
    }

    public UIBlockSticker(Serializer serializer) {
        super(serializer);
        this.y = (StickerStockItemWithStickerId) serializer.G(StickerStockItemWithStickerId.class.getClassLoader());
    }
}
