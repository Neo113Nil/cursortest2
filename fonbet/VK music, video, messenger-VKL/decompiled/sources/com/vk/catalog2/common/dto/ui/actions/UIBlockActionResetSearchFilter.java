package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.Objects;
import xsna.epx;
import xsna.qjg;

/* compiled from: UIBlockActionResetSearchFilter.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionResetSearchFilter extends UIBlockAction {
    public static final Serializer.c<UIBlockActionResetSearchFilter> CREATOR = new a();
    public final String A;
    public final boolean z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionResetSearchFilter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionResetSearchFilter a(Serializer serializer) {
            return new UIBlockActionResetSearchFilter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionResetSearchFilter[i];
        }
    }

    public UIBlockActionResetSearchFilter(com.vk.catalog2.common.dto.api.ui.a aVar, boolean z, String str) {
        super(aVar, null);
        this.z = z;
        this.A = str;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return new UIBlockActionResetSearchFilter(Ab(), this.z, this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionResetSearchFilter)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionResetSearchFilter uIBlockActionResetSearchFilter = (UIBlockActionResetSearchFilter) obj;
        return this.z == uIBlockActionResetSearchFilter.z && epx.f(this.A, uIBlockActionResetSearchFilter.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), Boolean.valueOf(this.z), this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<[");
        sb.append(this.d);
        sb.append("]: enabled: ");
        return q0.a(sb, this.z, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockActionResetSearchFilter(Ab(), this.z, this.A);
    }

    public UIBlockActionResetSearchFilter(Serializer serializer) {
        super(serializer);
        this.z = serializer.m();
        String I = serializer.I();
        this.A = I == null ? "" : I;
    }
}
