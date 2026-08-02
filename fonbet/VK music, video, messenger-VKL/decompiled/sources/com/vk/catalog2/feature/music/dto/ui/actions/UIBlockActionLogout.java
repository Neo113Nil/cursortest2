package com.vk.catalog2.feature.music.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockActionLogout.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionLogout extends UIBlockAction {
    public static final Serializer.c<UIBlockActionLogout> CREATOR = new a();
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionLogout> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionLogout a(Serializer serializer) {
            return new UIBlockActionLogout(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionLogout[i];
        }
    }

    public UIBlockActionLogout(Serializer serializer) {
        super(serializer);
        this.z = serializer.H();
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
        return new UIBlockActionLogout(Ab(), this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionLogout)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y)) {
            return epx.f(this.z, ((UIBlockActionLogout) obj).z);
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
        sb.append('<');
        return ho8.a(sb, this.c, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockActionLogout(Ab(), this.y, this.z);
    }

    public UIBlockActionLogout(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, str, null, null, null, 3584, null);
        this.z = str2;
    }
}
