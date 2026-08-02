package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
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
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockOfflineSyncPlaceholder.kt */
/* loaded from: classes16.dex */
public final class UIBlockOfflineSyncPlaceholder extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockOfflineSyncPlaceholder> CREATOR = new a();
    public final String A;
    public final String B;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockOfflineSyncPlaceholder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockOfflineSyncPlaceholder a(Serializer serializer) {
            return new UIBlockOfflineSyncPlaceholder(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockOfflineSyncPlaceholder[i];
        }
    }

    public UIBlockOfflineSyncPlaceholder(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, String str4, String str5, String str6, CatalogViewStyle catalogViewStyle, CatalogLaunchOrigin catalogLaunchOrigin) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, catalogLaunchOrigin, null, 23808, null);
        this.z = str3;
        this.A = str4;
        this.B = str5;
        this.y = str6;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.A);
        serializer.j0(this.B);
        serializer.j0(this.z);
        serializer.j0(this.y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockOfflineSyncPlaceholder) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockOfflineSyncPlaceholder uIBlockOfflineSyncPlaceholder = (UIBlockOfflineSyncPlaceholder) obj;
        return epx.f(this.z, uIBlockOfflineSyncPlaceholder.z) && epx.f(this.A, uIBlockOfflineSyncPlaceholder.A) && epx.f(this.B, uIBlockOfflineSyncPlaceholder.B) && epx.f(this.y, uIBlockOfflineSyncPlaceholder.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.z, this.A, this.B, this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.A, '>');
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
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockOfflineSyncPlaceholder(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.z, this.A, this.B, this.y, catalogViewStyle != null ? catalogViewStyle.copy() : null, this.p);
    }

    public UIBlockOfflineSyncPlaceholder(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.A = H == null ? "" : H;
        String H2 = serializer.H();
        this.B = H2 != null ? H2 : "";
        String H3 = serializer.H();
        this.z = H3 == null ? this.b : H3;
        this.y = serializer.H();
    }
}
