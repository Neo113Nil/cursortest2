package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.FriendsLiked;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockFriendsLiked.kt */
/* loaded from: classes16.dex */
public final class UIBlockFriendsLiked extends UIBlock {
    public static final Serializer.c<UIBlockFriendsLiked> CREATOR = new a();
    public final UIBlock y;
    public final FriendsLiked z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockFriendsLiked> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockFriendsLiked a(Serializer serializer) {
            return new UIBlockFriendsLiked(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockFriendsLiked[i];
        }
    }

    public UIBlockFriendsLiked(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, FriendsLiked friendsLiked, UIBlock uIBlock) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.z = friendsLiked;
        this.y = uIBlock;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z.e();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockFriendsLiked) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockFriendsLiked uIBlockFriendsLiked = (UIBlockFriendsLiked) obj;
        return epx.f(this.z, uIBlockFriendsLiked.z) && epx.f(this.y, uIBlockFriendsLiked.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z, this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '<' + this.y + '>';
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
        return new UIBlockFriendsLiked(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, this.z.d(), this.y.zb());
    }

    public UIBlockFriendsLiked(Serializer serializer) {
        super(serializer);
        this.z = (FriendsLiked) serializer.G(FriendsLiked.class.getClassLoader());
        this.y = (UIBlock) serializer.G(UIBlock.class.getClassLoader());
    }
}
