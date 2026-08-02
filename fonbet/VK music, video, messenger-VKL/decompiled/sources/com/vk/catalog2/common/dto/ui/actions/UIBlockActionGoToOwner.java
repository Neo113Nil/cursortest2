package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.cqm0;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockActionGoToOwner.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionGoToOwner extends UIBlockAction {
    public static final Serializer.c<UIBlockActionGoToOwner> CREATOR = new a();
    public final Group A;
    public final UserProfile z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionGoToOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionGoToOwner a(Serializer serializer) {
            return new UIBlockActionGoToOwner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionGoToOwner[i];
        }
    }

    public UIBlockActionGoToOwner(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, UserProfile userProfile, Group group) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, null, 3584, null);
        this.z = userProfile;
        this.A = group;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        UserId userId;
        UserProfile userProfile = this.z;
        if (userProfile == null || (userId = userProfile.c) == null) {
            Group group = this.A;
            userId = group != null ? group.c : null;
            if (userId == null) {
                userId = this.g;
            }
        }
        return String.valueOf(userId.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.i0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionGoToOwner zb() {
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
        UserProfile userProfile = this.z;
        UserProfile userProfile2 = userProfile != null ? new UserProfile(userProfile) : null;
        Group group = this.A;
        return new UIBlockActionGoToOwner(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.y, userProfile2, group != null ? new Group(group) : null);
    }

    public final String Sb() {
        String str;
        UserProfile userProfile = this.z;
        if (userProfile == null || (str = userProfile.h) == null) {
            Group group = this.A;
            str = group != null ? group.e : null;
        }
        if (str != null) {
            return cqm0.a(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionGoToOwner)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionGoToOwner uIBlockActionGoToOwner = (UIBlockActionGoToOwner) obj;
        return epx.f(this.z, uIBlockActionGoToOwner.z) && epx.f(this.A, uIBlockActionGoToOwner.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<profile=" + this.z + ", group=" + this.A + '>';
    }

    public UIBlockActionGoToOwner(Serializer serializer) {
        super(serializer);
        this.z = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        this.A = (Group) serializer.G(Group.class.getClassLoader());
    }
}
