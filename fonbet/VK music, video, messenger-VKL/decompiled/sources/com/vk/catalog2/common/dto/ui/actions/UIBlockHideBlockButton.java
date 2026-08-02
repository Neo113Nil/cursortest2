package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockHideBlockButton.kt */
/* loaded from: classes16.dex */
public final class UIBlockHideBlockButton extends UIBlockAction {
    public static final Serializer.c<UIBlockHideBlockButton> CREATOR = new a();
    public final String A;
    public final List<String> B;
    public final String C;
    public final String D;
    public final UserId z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockHideBlockButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockHideBlockButton a(Serializer serializer) {
            return new UIBlockHideBlockButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockHideBlockButton[i];
        }
    }

    public UIBlockHideBlockButton(com.vk.catalog2.common.dto.api.ui.a aVar, String str, UserId userId, String str2, List<String> list, String str3, String str4) {
        super(aVar, str);
        this.z = userId;
        this.A = str2;
        this.B = list;
        this.C = str3;
        this.D = str4;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.e0(this.z);
        serializer.j0(this.A);
        serializer.l0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockHideBlockButton zb() {
        return new UIBlockHideBlockButton(Ab(), this.y, UserId.a(this.z), this.A, i7o0.a(this.B), this.C, this.D);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockHideBlockButton)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) obj;
        return epx.f(this.z, uIBlockHideBlockButton.z) && epx.f(this.A, uIBlockHideBlockButton.A) && epx.f(this.B, uIBlockHideBlockButton.B) && epx.f(this.C, uIBlockHideBlockButton.C) && epx.f(this.D, uIBlockHideBlockButton.D);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<[" + this.d + "]>";
    }

    public UIBlockHideBlockButton(Serializer serializer) {
        super(serializer);
        this.z = (UserId) serializer.A(UserId.class.getClassLoader());
        this.A = serializer.H();
        this.B = com.vk.core.serialize.a.a(serializer);
        this.C = serializer.H();
        this.D = serializer.H();
    }
}
