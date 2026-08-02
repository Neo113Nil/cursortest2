package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockActionShowFilters.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionShowFilters extends UIBlockAction {
    public static final Serializer.c<UIBlockActionShowFilters> CREATOR = new a();
    public final List<CatalogFilterData> A;
    public final String B;
    public final String C;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionShowFilters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionShowFilters a(Serializer serializer) {
            return new UIBlockActionShowFilters(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionShowFilters[i];
        }
    }

    public /* synthetic */ UIBlockActionShowFilters(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, List list, String str3, String str4, int i, zcl zclVar) {
        this(aVar, str, str2, list, str3, (i & 32) != 0 ? null : str4);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.W(this.A);
        serializer.j0(this.B);
        serializer.j0(this.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionShowFilters zb() {
        return new UIBlockActionShowFilters(Ab(), this.y, this.z, i7o0.a(this.A), this.B, this.C);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionShowFilters)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionShowFilters uIBlockActionShowFilters = (UIBlockActionShowFilters) obj;
        return epx.f(this.z, uIBlockActionShowFilters.z) && epx.f(this.A, uIBlockActionShowFilters.A) && epx.f(this.B, uIBlockActionShowFilters.B) && epx.f(this.C, uIBlockActionShowFilters.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B, this.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '[' + this.d + "]: " + this.b;
    }

    public UIBlockActionShowFilters(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.A = serializer.k(CatalogFilterData.class);
        String H2 = serializer.H();
        this.B = H2 != null ? H2 : "";
        this.C = serializer.H();
    }

    public UIBlockActionShowFilters(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, List<CatalogFilterData> list, String str3, String str4) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, str, null, null, null, 3584, null);
        this.z = str2;
        this.A = list;
        this.B = str3;
        this.C = str4;
    }
}
