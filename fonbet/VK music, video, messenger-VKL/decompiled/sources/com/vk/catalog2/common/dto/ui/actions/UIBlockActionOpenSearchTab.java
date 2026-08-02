package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockActionOpenSearchTab.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionOpenSearchTab extends UIBlockAction implements dfp0 {
    public static final Serializer.c<UIBlockActionOpenSearchTab> CREATOR = new b();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String z;

    /* compiled from: UIBlockActionOpenSearchTab.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ActionOpenSearchTab(tabId="), this.a, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<UIBlockActionOpenSearchTab> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionOpenSearchTab a(Serializer serializer) {
            return new UIBlockActionOpenSearchTab(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionOpenSearchTab[i];
        }
    }

    public UIBlockActionOpenSearchTab(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, String str4, String str5, String str6) {
        super(aVar, str);
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.D = str5;
        this.C = str6;
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
        serializer.j0(this.B);
        serializer.j0(this.D);
        serializer.j0(this.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionOpenSearchTab zb() {
        return new UIBlockActionOpenSearchTab(Ab(), this.y, this.z, this.A, this.B, this.D, this.C);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionOpenSearchTab)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = (UIBlockActionOpenSearchTab) obj;
        return epx.f(this.z, uIBlockActionOpenSearchTab.z) && epx.f(this.A, uIBlockActionOpenSearchTab.A) && epx.f(this.B, uIBlockActionOpenSearchTab.B) && epx.f(this.D, uIBlockActionOpenSearchTab.D) && epx.f(this.C, uIBlockActionOpenSearchTab.C);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.D, this.C);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.D;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "ACTION[" + this.d + "]: " + this.z;
    }

    public UIBlockActionOpenSearchTab(Serializer serializer) {
        super(serializer);
        String H = serializer.H();
        this.z = H == null ? "" : H;
        String H2 = serializer.H();
        this.A = H2 != null ? H2 : "";
        this.B = serializer.H();
        this.D = serializer.H();
        this.C = serializer.H();
    }
}
