package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.p4g;
import xsna.qjg;

/* compiled from: UIBlockActionGoToAuthor.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionGoToAuthor extends UIBlockAction {
    public static final Serializer.c<UIBlockActionGoToAuthor> CREATOR = new a();
    public final Group A;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionGoToAuthor> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionGoToAuthor a(Serializer serializer) {
            return new UIBlockActionGoToAuthor(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionGoToAuthor[i];
        }
    }

    public UIBlockActionGoToAuthor(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.A = (Group) serializer.G(Group.class.getClassLoader());
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.i0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        HashSet d = p4g.d(Db());
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        CatalogOnboardingInfo catalogOnboardingInfo = this.n;
        return new UIBlockActionGoToAuthor(new com.vk.catalog2.common.dto.api.ui.a(this.b, this.c, this.d, this.e, this.f, a2, a3, d, zb, copy, this.m, catalogOnboardingInfo != null ? CatalogOnboardingInfo.zb(catalogOnboardingInfo) : null, this.p), this.y, this.z, new Group(this.A));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionGoToAuthor) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockActionGoToAuthor uIBlockActionGoToAuthor = (UIBlockActionGoToAuthor) obj;
        return epx.f(this.z, uIBlockActionGoToAuthor.z) && epx.f(this.A, uIBlockActionGoToAuthor.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<title=");
        sb.append(this.z);
        sb.append(" group=");
        Group group = this.A;
        return ho8.a(sb, group != null ? group.d : null, '>');
    }

    public UIBlockActionGoToAuthor(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, Group group) {
        super(aVar, str);
        this.z = str2;
        this.A = group;
    }
}
