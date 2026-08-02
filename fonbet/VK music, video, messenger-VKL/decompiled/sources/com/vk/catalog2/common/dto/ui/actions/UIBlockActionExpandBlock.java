package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.List;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;
import xsna.zcl;

/* compiled from: UIBlockActionExpandBlock.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionExpandBlock extends UIBlockAction implements dfp0 {
    public static final Serializer.c<UIBlockActionExpandBlock> CREATOR = new a();
    public final String A;
    public final int B;
    public final List<UIBlock> C;
    public final String D;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionExpandBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionExpandBlock a(Serializer serializer) {
            return new UIBlockActionExpandBlock(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionExpandBlock[i];
        }
    }

    public /* synthetic */ UIBlockActionExpandBlock(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, int i, List list, int i2, zcl zclVar) {
        this(aVar, str, str2, str3, i, (i2 & 32) != 0 ? null : list);
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
        serializer.j0(this.D);
        serializer.S(this.B);
        serializer.f0(this.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return Rb(this.C);
    }

    public final UIBlockActionExpandBlock Rb(List<? extends UIBlock> list) {
        return new UIBlockActionExpandBlock(Ab(), this.z, this.A, this.D, this.B, list != null ? i7o0.a(list) : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionExpandBlock)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionExpandBlock uIBlockActionExpandBlock = (UIBlockActionExpandBlock) obj;
        return epx.f(this.z, uIBlockActionExpandBlock.z) && epx.f(this.A, uIBlockActionExpandBlock.A) && epx.f(this.D, uIBlockActionExpandBlock.D) && this.B == uIBlockActionExpandBlock.B && epx.f(this.C, uIBlockActionExpandBlock.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.D, Integer.valueOf(this.B), this.C);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.D;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "ACTION[" + this.d + "]: " + this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return Rb(this.C);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockActionExpandBlock(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, int i, List<? extends UIBlock> list) {
        super(aVar, null);
        this.z = str;
        this.A = str2;
        this.D = str3;
        this.B = i;
        this.C = list;
    }

    public UIBlockActionExpandBlock(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.A = H2 != null ? H2 : "";
        this.D = serializer.H();
        this.B = serializer.u();
        this.C = serializer.B(UIBlock.class.getClassLoader());
    }
}
