package com.vk.catalog2.feature.search.dto.ui;

import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityPerson;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;
import xsna.oap;

/* compiled from: UIBlockSearchEntityPerson.kt */
/* loaded from: classes16.dex */
public final class UIBlockSearchEntityPerson extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockSearchEntityPerson> CREATOR = new a();
    public final UIBlockActionFollow A;
    public final UIBlockActionPlayAudiosFromBlock B;
    public final oap<UserProfile, Group> C;
    public final CatalogSearchEntityPerson y;
    public final List<UserProfile> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSearchEntityPerson> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSearchEntityPerson a(Serializer serializer) {
            return new UIBlockSearchEntityPerson(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSearchEntityPerson[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockSearchEntityPerson(com.vk.catalog2.common.dto.api.ui.a aVar, CatalogSearchEntityPerson catalogSearchEntityPerson, oap<? extends UserProfile, ? extends Group> oapVar, UIBlockActionFollow uIBlockActionFollow, List<? extends UserProfile> list, UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock) {
        super(aVar);
        this.y = catalogSearchEntityPerson;
        this.A = uIBlockActionFollow;
        this.z = list;
        this.C = oapVar;
        this.B = uIBlockActionPlayAudiosFromBlock;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.A);
        serializer.f0(this.z);
        oap<UserProfile, Group> oapVar = this.C;
        UserProfile a2 = oapVar.a();
        Group b = oapVar.b();
        serializer.i0(a2);
        serializer.i0(b);
        serializer.i0(this.B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UIBlockSearchEntityPerson) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockSearchEntityPerson uIBlockSearchEntityPerson = (UIBlockSearchEntityPerson) obj;
        if (!epx.f(this.y, uIBlockSearchEntityPerson.y) || !epx.f(this.z, uIBlockSearchEntityPerson.z) || !epx.f(this.A, uIBlockSearchEntityPerson.A) || !epx.f(this.B, uIBlockSearchEntityPerson.B)) {
            return false;
        }
        oap<UserProfile, Group> oapVar = uIBlockSearchEntityPerson.C;
        oap<UserProfile, Group> oapVar2 = this.C;
        if (oapVar2 instanceof oap.b) {
            Group group = (Group) ((oap.b) oapVar2).a;
            Group b = oapVar.b();
            return b != null && epx.f(group, b) && group.j == b.j;
        }
        if (!(oapVar2 instanceof oap.a)) {
            throw new NoWhenBranchMatchedException();
        }
        UserProfile userProfile = (UserProfile) ((oap.a) oapVar2).a;
        UserProfile a2 = oapVar.a();
        return a2 != null && epx.f(userProfile, a2) && userProfile.M() == a2.M();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.A, this.B, this.z, this.C);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.d;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder("UIBlockSearchEntity[id:");
        sb.append(this.b);
        sb.append(" trackcode:");
        CatalogSearchEntityPerson catalogSearchEntityPerson = this.y;
        sb.append(catalogSearchEntityPerson.d);
        sb.append(" entity:");
        sb.append(catalogSearchEntityPerson);
        sb.append(" followAction:");
        sb.append(this.A);
        sb.append(" playAudioAction:");
        sb.append(this.B);
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        oap aVar;
        oap<UserProfile, Group> oapVar = this.C;
        if (oapVar instanceof oap.b) {
            aVar = new oap.b(new Group((Group) ((oap.b) oapVar).a));
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new oap.a(new UserProfile((UserProfile) ((oap.a) oapVar).a));
        }
        oap oapVar2 = aVar;
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        CatalogSearchEntityPerson catalogSearchEntityPerson = this.y;
        CatalogSearchEntityPerson catalogSearchEntityPerson2 = new CatalogSearchEntityPerson(catalogSearchEntityPerson.b, catalogSearchEntityPerson.c, catalogSearchEntityPerson.d, catalogSearchEntityPerson.e, catalogSearchEntityPerson.f, catalogSearchEntityPerson.g, catalogSearchEntityPerson.h, catalogSearchEntityPerson.i, catalogSearchEntityPerson.j, catalogSearchEntityPerson.k, catalogSearchEntityPerson.l);
        UIBlockActionFollow uIBlockActionFollow = this.A;
        UIBlockActionFollow zb = uIBlockActionFollow != null ? uIBlockActionFollow.zb() : null;
        List<UserProfile> list = this.z;
        ArrayList a2 = list != null ? i7o0.a(list) : null;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.B;
        return new UIBlockSearchEntityPerson(Ab, catalogSearchEntityPerson2, oapVar2, zb, a2, uIBlockActionPlayAudiosFromBlock != null ? uIBlockActionPlayAudiosFromBlock.zb() : null);
    }

    public UIBlockSearchEntityPerson(Serializer serializer) {
        super(serializer);
        oap bVar;
        this.y = (CatalogSearchEntityPerson) serializer.G(CatalogSearchEntityPerson.class.getClassLoader());
        this.A = (UIBlockActionFollow) serializer.G(UIBlockActionFollow.class.getClassLoader());
        this.z = serializer.B(UserProfile.class.getClassLoader());
        UserProfile userProfile = (UserProfile) serializer.G(UserProfile.class.getClassLoader());
        Group group = (Group) serializer.G(Group.class.getClassLoader());
        if (userProfile != null) {
            bVar = new oap.a(userProfile);
        } else {
            bVar = group != null ? new oap.b(group) : null;
        }
        this.C = bVar;
        this.B = (UIBlockActionPlayAudiosFromBlock) serializer.G(UIBlockActionPlayAudiosFromBlock.class.getClassLoader());
    }
}
