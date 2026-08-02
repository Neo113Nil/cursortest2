package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.GroupsCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockGroupsCategory.kt */
/* loaded from: classes16.dex */
public final class UIBlockGroupsCategory extends UIBlock {
    public static final Serializer.c<UIBlockGroupsCategory> CREATOR = new a();
    public final List<UIBlockGroup> A;
    public final GroupsCategory y;
    public final UIBlockAction z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockGroupsCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockGroupsCategory a(Serializer serializer) {
            return new UIBlockGroupsCategory(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockGroupsCategory[i];
        }
    }

    public UIBlockGroupsCategory(Serializer serializer) {
        super(serializer);
        this.y = (GroupsCategory) serializer.G(GroupsCategory.class.getClassLoader());
        this.z = (UIBlockAction) serializer.G(UIBlockAction.class.getClassLoader());
        List<UIBlockGroup> k = serializer.k(UIBlockGroup.class);
        this.A = k == null ? EmptyList.b : k;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b.toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.W(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockGroupsCategory) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockGroupsCategory uIBlockGroupsCategory = (UIBlockGroupsCategory) obj;
        return epx.f(this.y, uIBlockGroupsCategory.y) && epx.f(this.z, uIBlockGroupsCategory.z) && epx.f(this.A, uIBlockGroupsCategory.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsCategory(id = ");
        GroupsCategory groupsCategory = this.y;
        sb.append(groupsCategory.b);
        sb.append(", title = ");
        return ho8.a(sb, groupsCategory.c, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a a2 = a.C0482a.a(this);
        GroupsCategory groupsCategory = this.y;
        GroupsCategory groupsCategory2 = new GroupsCategory(groupsCategory.b, groupsCategory.c, groupsCategory.d, groupsCategory.e, groupsCategory.f, groupsCategory.g, groupsCategory.h);
        UIBlockAction uIBlockAction = this.z;
        UIBlockAction zb = uIBlockAction != null ? uIBlockAction.zb() : null;
        ArrayList arrayList = new ArrayList();
        Iterator<UIBlockGroup> it = this.A.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().zb());
        }
        return new UIBlockGroupsCategory(a2, groupsCategory2, zb, arrayList);
    }

    public UIBlockGroupsCategory(com.vk.catalog2.common.dto.api.ui.a aVar, GroupsCategory groupsCategory, UIBlockAction uIBlockAction, List<UIBlockGroup> list) {
        super(aVar);
        this.y = groupsCategory;
        this.z = uIBlockAction;
        this.A = list;
    }
}
