package com.vk.catalog2.common.dto.ui.profile;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
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
import xsna.ms9;

/* compiled from: UIBlockProfilesList.kt */
/* loaded from: classes16.dex */
public final class UIBlockProfilesList extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockProfilesList> CREATOR = new a();
    public final CatalogBadge A;
    public final String B;
    public final List<CatalogUserMeta> y;
    public final List<UserProfile> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockProfilesList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockProfilesList a(Serializer serializer) {
            return new UIBlockProfilesList(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockProfilesList[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockProfilesList(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, List<CatalogUserMeta> list2, List<? extends UserProfile> list3, String str3, CatalogBadge catalogBadge) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = list2;
        this.z = list3;
        this.B = str3;
        this.A = catalogBadge;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.get(0).b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.y);
        serializer.W(this.z);
        serializer.j0(this.B);
        serializer.i0(this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockProfilesList) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockProfilesList uIBlockProfilesList = (UIBlockProfilesList) obj;
        return epx.f(this.y, uIBlockProfilesList.y) && epx.f(this.z, uIBlockProfilesList.z) && epx.f(this.B, uIBlockProfilesList.B) && epx.f(this.A, uIBlockProfilesList.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ms9.a(']', new StringBuilder("USER_PROFILES_LIST["), this.y);
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
        ArrayList a4 = i7o0.a(this.y);
        ArrayList a5 = i7o0.a(this.z);
        CatalogBadge catalogBadge = this.A;
        return new UIBlockProfilesList(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, a4, a5, this.B, catalogBadge != null ? CatalogBadge.zb(catalogBadge, null, 3) : null);
    }

    public UIBlockProfilesList(Serializer serializer) {
        super(serializer);
        this.y = serializer.l(CatalogUserMeta.class.getClassLoader());
        this.z = serializer.l(UserProfile.class.getClassLoader());
        this.B = serializer.H();
        this.A = (CatalogBadge) serializer.G(CatalogBadge.class.getClassLoader());
    }
}
