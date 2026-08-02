package com.vk.catalog2.common.dto.ui.stickers;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.stickers.views.sticker.StickerPackPreview;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockStickerPackPreview.kt */
/* loaded from: classes16.dex */
public final class UIBlockStickerPackPreview extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockStickerPackPreview> CREATOR = new a();
    public final StickerPackPreview y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockStickerPackPreview> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockStickerPackPreview a(Serializer serializer) {
            return new UIBlockStickerPackPreview(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockStickerPackPreview[i];
        }
    }

    public UIBlockStickerPackPreview(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, StickerPackPreview stickerPackPreview) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = stickerPackPreview;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final StickerPackPreview Pb() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockStickerPackPreview) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        StickerPackPreview stickerPackPreview = this.y;
        int i = stickerPackPreview.b;
        UIBlockStickerPackPreview uIBlockStickerPackPreview = (UIBlockStickerPackPreview) obj;
        StickerPackPreview stickerPackPreview2 = uIBlockStickerPackPreview.y;
        if (i != stickerPackPreview2.b || stickerPackPreview.g != stickerPackPreview2.g || !epx.f(stickerPackPreview.n, stickerPackPreview2.n)) {
            return false;
        }
        boolean z = stickerPackPreview.i;
        StickerPackPreview stickerPackPreview3 = uIBlockStickerPackPreview.y;
        return z == stickerPackPreview3.i && epx.f(stickerPackPreview.o, stickerPackPreview3.o);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p));
        StickerPackPreview stickerPackPreview = this.y;
        return Objects.hash(valueOf, Integer.valueOf(stickerPackPreview.b), Boolean.valueOf(stickerPackPreview.g), stickerPackPreview.n, Boolean.valueOf(stickerPackPreview.i), stickerPackPreview.o);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.r;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y.c, '>');
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
        return new UIBlockStickerPackPreview(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, StickerPackPreview.zb(this.y, 262143));
    }

    public UIBlockStickerPackPreview(Serializer serializer) {
        super(serializer);
        this.y = (StickerPackPreview) serializer.G(StickerPackPreview.class.getClassLoader());
    }
}
