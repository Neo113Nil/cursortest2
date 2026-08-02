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
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockActionFollow.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionFollow extends UIBlockAction implements dfp0 {
    public static final Serializer.c<UIBlockActionFollow> CREATOR = new a();
    public final UserProfile A;
    public final String B;
    public final Group z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionFollow> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionFollow a(Serializer serializer) {
            return new UIBlockActionFollow(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionFollow[i];
        }
    }

    public UIBlockActionFollow(Serializer serializer) {
        super(serializer);
        this.z = (Group) serializer.G(Group.class.getClassLoader());
        this.A = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        this.B = serializer.H();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        UserId userId;
        UserId userId2;
        String valueOf;
        UserProfile userProfile = this.A;
        if (userProfile != null && (userId2 = userProfile.c) != null && (valueOf = String.valueOf(userId2.b)) != null) {
            return valueOf;
        }
        Group group = this.z;
        return (group == null || (userId = group.c) == null) ? this.b : String.valueOf(userId.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.i0(this.A);
        serializer.j0(this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionFollow zb() {
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
        Group group = this.z;
        Group group2 = group != null ? new Group(group) : null;
        UserProfile userProfile = this.A;
        return new UIBlockActionFollow(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.y, group2, userProfile != null ? new UserProfile(userProfile) : null, this.B);
    }

    public final boolean U() {
        Group group = this.z;
        if (group != null) {
            return group.j || group.C > 0;
        }
        UserProfile userProfile = this.A;
        if (userProfile == null) {
            return false;
        }
        int i = userProfile.v;
        return i == 1 || i == 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionFollow)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionFollow uIBlockActionFollow = (UIBlockActionFollow) obj;
        return epx.f(this.z, uIBlockActionFollow.z) && epx.f(this.A, uIBlockActionFollow.A) && epx.f(this.B, uIBlockActionFollow.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "<" + qjg.a(this) + ">[" + this.d + "]: blockId = " + this.b;
    }

    public UIBlockActionFollow(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, Group group, UserProfile userProfile, String str4) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, null, 3584, null);
        String str5;
        this.z = group;
        this.A = userProfile;
        if (str4 == null) {
            str5 = group != null ? group.O : null;
            if (str5 == null) {
                str5 = userProfile != null ? userProfile.J : null;
            }
        } else {
            str5 = str4;
        }
        this.B = str5;
    }
}
