package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
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

/* compiled from: UIBlockActionToggleAlbumShuffle.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionToggleAlbumShuffle extends UIBlockAction {
    public static final Serializer.c<UIBlockActionToggleAlbumShuffle> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionToggleAlbumShuffle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionToggleAlbumShuffle a(Serializer serializer) {
            return new UIBlockActionToggleAlbumShuffle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionToggleAlbumShuffle[i];
        }
    }

    public UIBlockActionToggleAlbumShuffle(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, null, 3584, null);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockActionToggleAlbumShuffle(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, this.y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionToggleAlbumShuffle)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "UIBlockActionToggleAlbumShuffle";
    }

    public UIBlockActionToggleAlbumShuffle(Serializer serializer) {
        super(serializer);
    }
}
