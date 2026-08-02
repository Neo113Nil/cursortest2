package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dfp0;
import xsna.epx;
import xsna.qjg;

/* compiled from: UIBlockGroupFilter.kt */
/* loaded from: classes16.dex */
public final class UIBlockGroupFilter extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockGroupFilter> CREATOR = new a();
    public final CatalogFilterData A;
    public final String B;
    public final boolean C;
    public final UIBlockGroup y;
    public final CatalogFilterData z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockGroupFilter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockGroupFilter a(Serializer serializer) {
            return new UIBlockGroupFilter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockGroupFilter[i];
        }
    }

    public UIBlockGroupFilter(UIBlockGroup uIBlockGroup, CatalogFilterData catalogFilterData, CatalogFilterData catalogFilterData2, String str, boolean z) {
        super(uIBlockGroup.b, uIBlockGroup.d, uIBlockGroup.e, uIBlockGroup.f, uIBlockGroup.g, uIBlockGroup.h, uIBlockGroup.Db(), uIBlockGroup.j, null, null, null, null, null, null, null, 32512, null);
        this.y = uIBlockGroup;
        this.z = catalogFilterData;
        this.A = catalogFilterData2;
        this.B = str;
        this.C = z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.Fb();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
        serializer.i0(this.A);
        serializer.j0(this.B);
        serializer.L(this.C ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockGroupFilter)) {
            return false;
        }
        UIBlockGroupFilter uIBlockGroupFilter = (UIBlockGroupFilter) obj;
        return epx.f(this.y, uIBlockGroupFilter.y) && epx.f(this.z, uIBlockGroupFilter.z) && epx.f(this.A, uIBlockGroupFilter.A) && epx.f(this.B, uIBlockGroupFilter.B) && this.C == uIBlockGroupFilter.C;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B, Boolean.valueOf(this.C));
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.r();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '[' + this.d + "] " + this.y.y.d;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockGroupFilter(this.y.zb(), CatalogFilterData.zb(this.z, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED), CatalogFilterData.zb(this.A, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED), this.B, this.C);
    }

    public UIBlockGroupFilter(Serializer serializer) {
        super(serializer);
        this.y = (UIBlockGroup) serializer.G(UIBlockGroup.class.getClassLoader());
        this.z = (CatalogFilterData) serializer.G(CatalogFilterData.class.getClassLoader());
        this.A = (CatalogFilterData) serializer.G(CatalogFilterData.class.getClassLoader());
        this.B = serializer.H();
        this.C = serializer.m();
    }
}
