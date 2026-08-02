package com.vk.catalog2.common.dto.ui.stickers;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockStickersBonusBalance.kt */
/* loaded from: classes16.dex */
public final class UIBlockStickersBonusBalance extends UIBlock {
    public static final Serializer.c<UIBlockStickersBonusBalance> CREATOR = new a();
    public final StickersBonusBalance y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockStickersBonusBalance> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockStickersBonusBalance a(Serializer serializer) {
            return new UIBlockStickersBonusBalance(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockStickersBonusBalance[i];
        }
    }

    public UIBlockStickersBonusBalance(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, StickersBonusBalance stickersBonusBalance) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = stickersBonusBalance;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.hashCode());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockStickersBonusBalance) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockStickersBonusBalance) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this);
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
        StickersBonusBalance stickersBonusBalance = this.y;
        return new UIBlockStickersBonusBalance(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, new StickersBonusBalance(stickersBonusBalance.b, stickersBonusBalance.c, stickersBonusBalance.d, stickersBonusBalance.e, stickersBonusBalance.f));
    }

    public UIBlockStickersBonusBalance(Serializer serializer) {
        super(serializer);
        this.y = (StickersBonusBalance) serializer.G(StickersBonusBalance.class.getClassLoader());
    }
}
