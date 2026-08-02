package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockActionOpenChallenge.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionOpenChallenge extends UIBlockAction {
    public static final Serializer.c<UIBlockActionOpenChallenge> CREATOR = new a();
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionOpenChallenge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionOpenChallenge a(Serializer serializer) {
            return new UIBlockActionOpenChallenge(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionOpenChallenge[i];
        }
    }

    public UIBlockActionOpenChallenge(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2) {
        super(aVar, str);
        this.z = str2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return new UIBlockActionOpenChallenge(Ab(), this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionOpenChallenge)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y)) {
            return epx.f(this.z, ((UIBlockActionOpenChallenge) obj).z);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z);
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
        return new UIBlockActionOpenChallenge(Ab(), this.y, this.z);
    }

    public UIBlockActionOpenChallenge(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
    }
}
