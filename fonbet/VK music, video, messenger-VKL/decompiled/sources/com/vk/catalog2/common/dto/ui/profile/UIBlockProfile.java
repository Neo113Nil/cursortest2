package com.vk.catalog2.common.dto.ui.profile;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
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
import xsna.p4g;
import xsna.zcl;

/* compiled from: UIBlockProfile.kt */
/* loaded from: classes16.dex */
public final class UIBlockProfile extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockProfile> CREATOR = new a();
    public final UserProfile A;
    public final String B;
    public final List<UserProfile> C;
    public final int D;
    public int E;
    public final List<UIBlockAction> F;
    public final CatalogUserMeta y;
    public final CatalogProfileLocalState z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockProfile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockProfile a(Serializer serializer) {
            return new UIBlockProfile(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockProfile[i];
        }
    }

    public /* synthetic */ UIBlockProfile(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List list, Set set, UIBlockHint uIBlockHint, CatalogUserMeta catalogUserMeta, UserProfile userProfile, String str3, List list2, int i, List list3, int i2, CatalogProfileLocalState catalogProfileLocalState, int i3, zcl zclVar) {
        this(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, catalogUserMeta, userProfile, str3, list2, i, list3, (i3 & 16384) != 0 ? 0 : i2, (i3 & 32768) != 0 ? new CatalogProfileLocalState(null, 1, null) : catalogProfileLocalState);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.A);
        serializer.j0(this.B);
        serializer.W(this.C);
        serializer.S(this.D);
        serializer.W(this.F);
        serializer.S(this.E);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockProfile) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockProfile uIBlockProfile = (UIBlockProfile) obj;
        CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
        UserProfile userProfile = uIBlockProfile.A;
        if (!epx.f(this.y, catalogUserMeta)) {
            return false;
        }
        UserProfile userProfile2 = this.A;
        return epx.f(userProfile2, userProfile) && userProfile2.v == userProfile.v && epx.f(this.z, uIBlockProfile.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p));
        UserProfile userProfile = this.A;
        return Objects.hash(valueOf, this.y, userProfile, Integer.valueOf(userProfile.v), this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.B;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "USER[" + this.y + ']';
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
        CatalogUserMeta catalogUserMeta = this.y;
        CatalogUserMeta catalogUserMeta2 = new CatalogUserMeta(catalogUserMeta.b, catalogUserMeta.c, catalogUserMeta.d, catalogUserMeta.e, catalogUserMeta.f, catalogUserMeta.g, catalogUserMeta.h, catalogUserMeta.i, catalogUserMeta.j, catalogUserMeta.k, catalogUserMeta.l, catalogUserMeta.m);
        UserProfile userProfile = new UserProfile(this.A);
        List<UserProfile> list = this.C;
        ArrayList a4 = list != null ? i7o0.a(list) : null;
        ArrayList q = p4g.q(this.F);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = q.iterator();
        while (it2.hasNext()) {
            arrayList.add(((UIBlock) it2.next()).zb());
        }
        return new UIBlockProfile(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, catalogUserMeta2, userProfile, this.B, a4, this.D, arrayList, this.E, CatalogProfileLocalState.zb(this.z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockProfile(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, CatalogUserMeta catalogUserMeta, UserProfile userProfile, String str3, List<? extends UserProfile> list2, int i, List<? extends UIBlockAction> list3, int i2, CatalogProfileLocalState catalogProfileLocalState) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = catalogUserMeta;
        this.A = userProfile;
        this.B = str3;
        this.C = list2;
        this.D = Math.max(i, list2 != 0 ? list2.size() : 0);
        this.F = list3;
        this.E = i2;
        this.z = catalogProfileLocalState;
    }

    public UIBlockProfile(Serializer serializer) {
        super(serializer);
        this.y = (CatalogUserMeta) serializer.G(CatalogUserMeta.class.getClassLoader());
        this.A = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        this.B = serializer.H();
        this.C = serializer.l(UserProfile.class.getClassLoader());
        this.D = serializer.u();
        this.F = serializer.l(UIBlockAction.class.getClassLoader());
        this.E = serializer.u();
        this.z = (CatalogProfileLocalState) serializer.G(CatalogProfileLocalState.class.getClassLoader());
    }
}
