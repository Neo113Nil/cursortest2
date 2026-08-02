package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.i7o0;
import xsna.ms9;
import xsna.qjg;

/* compiled from: UIBlockActionUpdateNonActiveGroups.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionUpdateNonActiveGroups extends UIBlockAction {
    public static final Serializer.c<UIBlockActionUpdateNonActiveGroups> CREATOR = new a();
    public final List<String> A;
    public final List<CatalogFilterData> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionUpdateNonActiveGroups> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionUpdateNonActiveGroups a(Serializer serializer) {
            return new UIBlockActionUpdateNonActiveGroups(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionUpdateNonActiveGroups[i];
        }
    }

    public UIBlockActionUpdateNonActiveGroups(com.vk.catalog2.common.dto.api.ui.a aVar, String str, List<CatalogFilterData> list, List<String> list2) {
        super(aVar, str);
        this.z = list;
        this.A = list2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.z);
        serializer.l0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        List<CatalogFilterData> list = this.z;
        return new UIBlockActionUpdateNonActiveGroups(Ab, this.y, list != null ? i7o0.a(list) : null, i7o0.a(this.A));
    }

    public final List<String> Rb() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionUpdateNonActiveGroups)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionUpdateNonActiveGroups uIBlockActionUpdateNonActiveGroups = (UIBlockActionUpdateNonActiveGroups) obj;
        return epx.f(this.z, uIBlockActionUpdateNonActiveGroups.z) && epx.f(this.A, uIBlockActionUpdateNonActiveGroups.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        sb.append(this.z);
        sb.append(", ");
        return ms9.a('>', sb, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        List<CatalogFilterData> list = this.z;
        return new UIBlockActionUpdateNonActiveGroups(Ab, this.y, list != null ? i7o0.a(list) : null, i7o0.a(this.A));
    }

    public UIBlockActionUpdateNonActiveGroups(Serializer serializer) {
        super(serializer);
        this.z = serializer.l(CatalogFilterData.class.getClassLoader());
        this.A = com.vk.core.serialize.a.a(serializer);
    }
}
