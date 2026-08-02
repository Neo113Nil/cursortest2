package com.vk.catalog2.common.dto.ui.stickers;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPreviewWithStickerId;
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

/* compiled from: UIBlockStickerPreview.kt */
/* loaded from: classes16.dex */
public final class UIBlockStickerPreview extends UIBlock {
    public static final Serializer.c<UIBlockStickerPreview> CREATOR = new a();
    public final StickerPackPreviewWithStickerId y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockStickerPreview> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockStickerPreview a(Serializer serializer) {
            return new UIBlockStickerPreview(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockStickerPreview[i];
        }
    }

    public UIBlockStickerPreview(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = stickerPackPreviewWithStickerId;
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

    public final StickerPackPreviewWithStickerId Pb() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockStickerPreview) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId = this.y;
        int i = stickerPackPreviewWithStickerId.c;
        StickerPackPreview stickerPackPreview = stickerPackPreviewWithStickerId.b;
        UIBlockStickerPreview uIBlockStickerPreview = (UIBlockStickerPreview) obj;
        StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId2 = uIBlockStickerPreview.y;
        if (i != stickerPackPreviewWithStickerId2.c) {
            return false;
        }
        int i2 = stickerPackPreview.b;
        StickerPackPreview stickerPackPreview2 = stickerPackPreviewWithStickerId2.b;
        if (i2 != stickerPackPreview2.b || stickerPackPreview.g != stickerPackPreview2.g || !epx.f(stickerPackPreview.n, stickerPackPreview2.n)) {
            return false;
        }
        boolean z = stickerPackPreview.i;
        StickerPackPreview stickerPackPreview3 = uIBlockStickerPreview.y.b;
        return z == stickerPackPreview3.i && epx.f(stickerPackPreview.o, stickerPackPreview3.o);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p));
        StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId = this.y;
        StickerPackPreview stickerPackPreview = stickerPackPreviewWithStickerId.b;
        Boolean valueOf2 = Boolean.valueOf(stickerPackPreview.g);
        StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId2 = this.y;
        StickerPackPreview stickerPackPreview2 = stickerPackPreviewWithStickerId2.b;
        return Objects.hash(valueOf, stickerPackPreviewWithStickerId, stickerPackPreview, valueOf2, stickerPackPreview2.n, Boolean.valueOf(stickerPackPreview2.i), stickerPackPreviewWithStickerId2.b.o);
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
        return new UIBlockStickerPreview(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, StickerPackPreviewWithStickerId.zb(this.y, null, 3));
    }

    public UIBlockStickerPreview(Serializer serializer) {
        super(serializer);
        this.y = (StickerPackPreviewWithStickerId) serializer.G(StickerPackPreviewWithStickerId.class.getClassLoader());
    }
}
