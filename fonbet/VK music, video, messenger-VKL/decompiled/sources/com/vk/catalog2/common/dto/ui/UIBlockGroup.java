package com.vk.catalog2.common.dto.ui;

import com.unity3d.ads.BuildConfig;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import defpackage.q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.drm0;
import xsna.epx;
import xsna.i7o0;
import xsna.zcl;

/* compiled from: UIBlockGroup.kt */
/* loaded from: classes16.dex */
public final class UIBlockGroup extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockGroup> CREATOR = new a();
    public final CatalogProfileLocalState A;
    public boolean B;
    public final String C;
    public final String D;
    public final Group y;
    public final GroupCatalogItem z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockGroup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockGroup a(Serializer serializer) {
            return new UIBlockGroup(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockGroup[i];
        }
    }

    public UIBlockGroup(Serializer serializer) {
        super(serializer);
        this.y = (Group) serializer.G(Group.class.getClassLoader());
        this.z = (GroupCatalogItem) serializer.G(GroupCatalogItem.class.getClassLoader());
        this.B = serializer.m();
        this.A = (CatalogProfileLocalState) serializer.G(CatalogProfileLocalState.class.getClassLoader());
        this.C = serializer.H();
        this.D = serializer.H();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.c.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.L(this.B ? (byte) 1 : (byte) 0);
        serializer.i0(this.A);
        serializer.j0(this.C);
        serializer.j0(this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Pb, reason: merged with bridge method [inline-methods] */
    public final UIBlockGroup zb() {
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
        Group group = new Group(this.y);
        GroupCatalogItem groupCatalogItem = this.z;
        GroupCatalogItem groupCatalogItem2 = groupCatalogItem != null ? new GroupCatalogItem(groupCatalogItem) : null;
        boolean z = this.B;
        CatalogProfileLocalState zb2 = CatalogProfileLocalState.zb(this.A);
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockGroup(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, group, groupCatalogItem2, z, zb2, this.C, this.D, catalogViewStyle != null ? catalogViewStyle.copy() : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockGroup) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockGroup uIBlockGroup = (UIBlockGroup) obj;
        Group group = uIBlockGroup.y;
        Group group2 = this.y;
        return epx.f(group2, group) && epx.f(this.z, uIBlockGroup.z) && group2.j == uIBlockGroup.y.j && this.B == uIBlockGroup.B && epx.f(this.A, uIBlockGroup.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.A);
    }

    @Override // xsna.dfp0
    public final String r() {
        GroupCatalogItem groupCatalogItem = this.z;
        String str = groupCatalogItem != null ? groupCatalogItem.e : null;
        if (str != null && !drm0.N(str)) {
            if (groupCatalogItem != null) {
                return groupCatalogItem.e;
            }
            return null;
        }
        Group group = this.y;
        String str2 = group.O;
        if (str2 != null && !drm0.N(str2)) {
            return group.O;
        }
        String str3 = this.f;
        return !drm0.N(str3) ? str3 : "";
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Group group = this.y;
        sb.append(group.c);
        sb.append(" - ");
        return q0.a(sb, group.j, ' ');
    }

    public /* synthetic */ UIBlockGroup(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, Group group, GroupCatalogItem groupCatalogItem, boolean z, CatalogProfileLocalState catalogProfileLocalState, String str3, String str4, CatalogViewStyle catalogViewStyle, int i, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, group, groupCatalogItem, z, (i & 2048) != 0 ? new CatalogProfileLocalState(null, 1, null) : catalogProfileLocalState, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? BuildConfig.FLAVOR : str4, catalogViewStyle);
    }

    public UIBlockGroup(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, Group group, GroupCatalogItem groupCatalogItem, boolean z, CatalogProfileLocalState catalogProfileLocalState, String str3, String str4, CatalogViewStyle catalogViewStyle) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, catalogViewStyle, null, null, null, null, null, 32000, null);
        this.y = group;
        this.z = groupCatalogItem;
        this.B = z;
        this.A = catalogProfileLocalState;
        this.C = str3;
        this.D = str4;
    }
}
