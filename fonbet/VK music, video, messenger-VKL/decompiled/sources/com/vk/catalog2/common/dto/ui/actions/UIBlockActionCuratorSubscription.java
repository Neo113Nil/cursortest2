package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockActionCuratorSubscription.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionCuratorSubscription extends UIBlockAction {
    public static final Serializer.c<UIBlockActionCuratorSubscription> CREATOR = new a();
    public boolean A;
    public final String B;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionCuratorSubscription> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionCuratorSubscription a(Serializer serializer) {
            return new UIBlockActionCuratorSubscription(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionCuratorSubscription[i];
        }
    }

    public UIBlockActionCuratorSubscription(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, boolean z) {
        super(aVar, str);
        this.B = str2;
        this.z = str3;
        this.A = z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.B);
        serializer.j0(this.z);
        serializer.L(this.A ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return new UIBlockActionCuratorSubscription(Ab(), this.y, this.B, this.z, this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionCuratorSubscription)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionCuratorSubscription uIBlockActionCuratorSubscription = (UIBlockActionCuratorSubscription) obj;
        return epx.f(this.B, uIBlockActionCuratorSubscription.B) && epx.f(this.z, uIBlockActionCuratorSubscription.z) && this.A == uIBlockActionCuratorSubscription.A;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.B, this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<[");
        sb.append(this.d);
        sb.append("]: ");
        return ho8.a(sb, this.z, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockActionCuratorSubscription(Ab(), this.y, this.B, this.z, this.A);
    }

    public UIBlockActionCuratorSubscription(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.B = H == null ? "" : H;
        String H2 = serializer.H();
        this.z = H2 != null ? H2 : "";
        this.A = serializer.m();
    }
}
