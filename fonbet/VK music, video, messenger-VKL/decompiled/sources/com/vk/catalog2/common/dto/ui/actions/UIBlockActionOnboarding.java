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

/* compiled from: UIBlockActionOnboarding.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionOnboarding extends UIBlockAction {
    public static final Serializer.c<UIBlockActionOnboarding> CREATOR = new a();
    public final String A;
    public final List<CatalogFilterData> B;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionOnboarding> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionOnboarding a(Serializer serializer) {
            return new UIBlockActionOnboarding(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionOnboarding[i];
        }
    }

    public UIBlockActionOnboarding(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.A = serializer.H();
        this.B = serializer.k(CatalogFilterData.class);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.W(this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return new UIBlockActionOnboarding(Ab(), this.y, this.z, this.A, i7o0.a(this.B));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionOnboarding)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionOnboarding uIBlockActionOnboarding = (UIBlockActionOnboarding) obj;
        return epx.f(this.z, uIBlockActionOnboarding.z) && epx.f(this.A, uIBlockActionOnboarding.A) && epx.f(this.B, uIBlockActionOnboarding.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '[' + this.d + "]: " + this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockActionOnboarding(Ab(), this.y, this.z, this.A, i7o0.a(this.B));
    }

    public UIBlockActionOnboarding(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, List<CatalogFilterData> list) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, str, null, null, null, 3584, null);
        this.z = str2;
        this.A = str3;
        this.B = list;
    }
}
