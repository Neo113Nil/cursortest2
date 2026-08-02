package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.channel.CatalogChannel;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;

/* compiled from: UIBlockChannel.kt */
/* loaded from: classes16.dex */
public final class UIBlockChannel extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockChannel> CREATOR = new a();
    public final CatalogChannel y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockChannel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockChannel a(Serializer serializer) {
            return new UIBlockChannel(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockChannel[i];
        }
    }

    public UIBlockChannel(Serializer serializer) {
        super(serializer);
        this.y = (CatalogChannel) serializer.G(CatalogChannel.class.getClassLoader());
        String H = serializer.H();
        this.z = H == null ? "" : H;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.j0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockChannel) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockChannel uIBlockChannel = (UIBlockChannel) obj;
        CatalogChannel catalogChannel = uIBlockChannel.y;
        CatalogChannel catalogChannel2 = this.y;
        return epx.f(catalogChannel2, catalogChannel) && catalogChannel2.g == uIBlockChannel.y.g;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)));
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CatalogChannel catalogChannel = this.y;
        sb.append(catalogChannel.b);
        sb.append(" - ");
        return q0.a(sb, catalogChannel.g, ' ');
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
        CatalogChannel catalogChannel = this.y;
        CatalogChannel catalogChannel2 = new CatalogChannel(catalogChannel.b, catalogChannel.c, catalogChannel.d, catalogChannel.e, catalogChannel.f, catalogChannel.g, catalogChannel.h);
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockChannel(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, catalogChannel2, this.z, catalogViewStyle != null ? catalogViewStyle.copy() : null);
    }

    public UIBlockChannel(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, CatalogChannel catalogChannel, String str3, CatalogViewStyle catalogViewStyle) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, null, null, 32000, null);
        this.y = catalogChannel;
        this.z = str3;
    }
}
