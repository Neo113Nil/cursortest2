package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockActionTextButton.kt */
/* loaded from: classes16.dex */
public class UIBlockActionTextButton extends UIBlockAction {
    public static final Serializer.c<UIBlockActionTextButton> CREATOR = new a();
    public final String A;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionTextButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionTextButton a(Serializer serializer) {
            return new UIBlockActionTextButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionTextButton[i];
        }
    }

    public UIBlockActionTextButton(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        this.A = serializer.H();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public UIBlockActionTextButton zb() {
        return new UIBlockActionTextButton(Ab(), this.y, this.z, this.A);
    }

    public final String Sb() {
        return this.A;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionTextButton)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionTextButton uIBlockActionTextButton = (UIBlockActionTextButton) obj;
        return epx.f(this.z, uIBlockActionTextButton.z) && epx.f(this.A, uIBlockActionTextButton.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<[");
        sb.append(this.d);
        sb.append("]: ");
        return ho8.a(sb, this.z, '>');
    }

    public UIBlockActionTextButton(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3) {
        super(aVar.a, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, str, null, null, null, 3584, null);
        this.z = str2;
        this.A = str3;
    }
}
