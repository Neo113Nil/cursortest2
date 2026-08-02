package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.i7o0;
import xsna.ms9;
import xsna.qjg;

/* compiled from: UIBlockActionMarketOptions.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionMarketOptions extends UIBlockAction {
    public static final Serializer.c<UIBlockActionMarketOptions> CREATOR = new a();
    public final List<String> A;
    public final int z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionMarketOptions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionMarketOptions a(Serializer serializer) {
            return new UIBlockActionMarketOptions(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionMarketOptions[i];
        }
    }

    public UIBlockActionMarketOptions(com.vk.catalog2.common.dto.api.ui.a aVar, int i, List<String> list) {
        super(aVar, null);
        this.z = i;
        this.A = list;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.S(this.z);
        serializer.l0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return new UIBlockActionMarketOptions(Ab(), this.z, i7o0.a(this.A));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionMarketOptions)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionMarketOptions uIBlockActionMarketOptions = (UIBlockActionMarketOptions) obj;
        return this.z == uIBlockActionMarketOptions.z && epx.f(this.A, uIBlockActionMarketOptions.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), Integer.valueOf(this.z), this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<albumId=");
        sb.append(this.z);
        sb.append(", marketAlbumOptions=");
        return ms9.a('>', sb, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockActionMarketOptions(Ab(), this.z, i7o0.a(this.A));
    }

    public UIBlockActionMarketOptions(Serializer serializer) {
        super(serializer);
        this.z = serializer.u();
        this.A = com.vk.core.serialize.a.a(serializer);
    }
}
