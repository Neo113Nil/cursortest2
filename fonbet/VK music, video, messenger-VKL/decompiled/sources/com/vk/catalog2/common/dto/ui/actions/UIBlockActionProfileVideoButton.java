package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockActionProfileVideoButton.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionProfileVideoButton extends UIBlockActionTextButton {
    public static final Serializer.c<UIBlockActionProfileVideoButton> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionProfileVideoButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionProfileVideoButton a(Serializer serializer) {
            return new UIBlockActionProfileVideoButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionProfileVideoButton[i];
        }
    }

    public UIBlockActionProfileVideoButton(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3) {
        super(aVar, str, str2, str3);
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.action.UIBlockAction
    /* renamed from: Pb */
    public final UIBlockAction zb() {
        return new UIBlockActionProfileVideoButton(Ab(), this.y, this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton
    /* renamed from: Rb */
    public final UIBlockActionTextButton zb() {
        return new UIBlockActionProfileVideoButton(Ab(), this.y, this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton
    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionProfileVideoButton)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y);
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z);
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.z, '>');
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockActionProfileVideoButton(Ab(), this.y, this.z, this.A);
    }

    public UIBlockActionProfileVideoButton(Serializer serializer) {
        super(serializer);
    }
}
