package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.fyo0;
import xsna.ho8;
import xsna.j5g;
import xsna.mwp0;
import xsna.zcl;

/* compiled from: UIBlockHeader.kt */
/* loaded from: classes16.dex */
public final class UIBlockHeader extends UIBlock {
    public static final Serializer.c<UIBlockHeader> CREATOR = new a();
    public final String A;
    public final TopTitle B;
    public final UIBlockBadge C;
    public final UIBlockActionShowFilters D;
    public final UIBlockActionOpenSection E;
    public final UIBlockActionSwitchSection F;
    public final UIBlockActionOpenSearchTab G;
    public final UIBlockActionClearRecent H;
    public final UIBlockActionOpenScreen I;
    public final UIBlockActionOpenUrl J;
    public final UIBlockHideBlockButton K;
    public final UIBlockAction L;
    public final String M;
    public final String y;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockHeader> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockHeader a(Serializer serializer) {
            return new UIBlockHeader(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockHeader[i];
        }
    }

    public /* synthetic */ UIBlockHeader(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, TopTitle topTitle, mwp0 mwp0Var, String str3, String str4, int i, zcl zclVar) {
        this(aVar, str, str2, topTitle, mwp0Var, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b + this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.i0(this.B);
        serializer.i0(this.C);
        serializer.i0(this.D);
        serializer.i0(this.E);
        serializer.i0(this.F);
        serializer.i0(this.G);
        serializer.i0(this.H);
        serializer.i0(this.I);
        serializer.i0(this.J);
        serializer.i0(this.K);
        serializer.i0(this.L);
        serializer.j0(this.M);
    }

    public final UIBlockActionOpenUrl Pb() {
        return this.J;
    }

    public final UIBlockActionOpenSection Qb() {
        return this.E;
    }

    public final UIBlockActionSwitchSection Rb() {
        return this.F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockHeader) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockHeader uIBlockHeader = (UIBlockHeader) obj;
        return epx.f(this.y, uIBlockHeader.y) && epx.f(this.z, uIBlockHeader.z) && epx.f(this.A, uIBlockHeader.A) && epx.f(this.B, uIBlockHeader.B) && epx.f(this.C, uIBlockHeader.C) && epx.f(this.D, uIBlockHeader.D) && epx.f(this.E, uIBlockHeader.E) && epx.f(this.F, uIBlockHeader.F) && epx.f(this.G, uIBlockHeader.G) && epx.f(this.H, uIBlockHeader.H) && epx.f(this.I, uIBlockHeader.I) && epx.f(this.J, uIBlockHeader.J) && epx.f(this.K, uIBlockHeader.K) && epx.f(this.L, uIBlockHeader.L) && epx.f(this.M, uIBlockHeader.M);
    }

    public final String getTitle() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r3 == null) goto L6;
     */
    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("Header[");
        sb.append(this.y);
        sb.append("] [");
        UIBlockActionOpenScreen uIBlockActionOpenScreen = this.I;
        if (uIBlockActionOpenScreen != null) {
            StringBuilder sb2 = new StringBuilder("OpenScreen<");
            sb2.append(uIBlockActionOpenScreen.z);
            sb2.append(" -> ");
            str2 = ho8.a(sb2, uIBlockActionOpenScreen.A, '>');
        }
        UIBlockActionOpenSection uIBlockActionOpenSection = this.E;
        if (uIBlockActionOpenSection != null) {
            StringBuilder sb3 = new StringBuilder("ShowAll<");
            sb3.append(uIBlockActionOpenSection.z);
            sb3.append(" -> ");
            str2 = ho8.a(sb3, uIBlockActionOpenSection.B, '>');
        } else {
            UIBlockActionSwitchSection uIBlockActionSwitchSection = this.F;
            if (uIBlockActionSwitchSection != null) {
                StringBuilder sb4 = new StringBuilder("SwitchSection<");
                sb4.append(uIBlockActionSwitchSection.z);
                sb4.append(" -> ");
                str = ho8.a(sb4, uIBlockActionSwitchSection.c, '>');
            } else {
                str = null;
            }
            if (str == null) {
                UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = this.G;
                str = uIBlockActionOpenSearchTab != null ? ho8.a(new StringBuilder("Open tab<"), uIBlockActionOpenSearchTab.A, '>') : null;
                if (str == null) {
                    UIBlockActionShowFilters uIBlockActionShowFilters = this.D;
                    if (uIBlockActionShowFilters != null) {
                        str = "Filters<" + j5g.g0(uIBlockActionShowFilters.A, null, null, null, 0, new fyo0(1), 31);
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        UIBlockHideBlockButton uIBlockHideBlockButton = this.K;
                        if (uIBlockHideBlockButton != null) {
                            StringBuilder sb5 = new StringBuilder("Hide<");
                            sb5.append(uIBlockHideBlockButton);
                            sb5.append(" -> ");
                            str3 = ho8.a(sb5, uIBlockHideBlockButton.A, '>');
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str2 = this.H != null ? "Clear" : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                        } else {
                            str2 = str3;
                        }
                    }
                }
            }
            str2 = str;
        }
        return ho8.a(sb, str2, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        TopTitle topTitle = this.B;
        TopTitle topTitle2 = topTitle != null ? new TopTitle(topTitle.b, topTitle.c) : null;
        UIBlockBadge uIBlockBadge = this.C;
        UIBlockBadge zb = uIBlockBadge != null ? uIBlockBadge.zb() : null;
        UIBlockActionShowFilters uIBlockActionShowFilters = this.D;
        UIBlockActionShowFilters zb2 = uIBlockActionShowFilters != null ? uIBlockActionShowFilters.zb() : null;
        UIBlockActionOpenSection uIBlockActionOpenSection = this.E;
        UIBlockActionOpenSection Rb = uIBlockActionOpenSection != null ? uIBlockActionOpenSection.Rb(uIBlockActionOpenSection.e) : null;
        UIBlockActionSwitchSection uIBlockActionSwitchSection = this.F;
        UIBlockActionSwitchSection zb3 = uIBlockActionSwitchSection != null ? uIBlockActionSwitchSection.zb() : null;
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = this.G;
        UIBlockActionOpenSearchTab zb4 = uIBlockActionOpenSearchTab != null ? uIBlockActionOpenSearchTab.zb() : null;
        UIBlockActionClearRecent uIBlockActionClearRecent = this.H;
        UIBlockActionClearRecent zb5 = uIBlockActionClearRecent != null ? uIBlockActionClearRecent.zb() : null;
        UIBlockActionOpenScreen uIBlockActionOpenScreen = this.I;
        UIBlockActionOpenScreen zb6 = uIBlockActionOpenScreen != null ? uIBlockActionOpenScreen.zb() : null;
        UIBlockActionOpenUrl uIBlockActionOpenUrl = this.J;
        UIBlockActionOpenUrl zb7 = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.zb() : null;
        UIBlockHideBlockButton uIBlockHideBlockButton = this.K;
        UIBlockHideBlockButton zb8 = uIBlockHideBlockButton != null ? uIBlockHideBlockButton.zb() : null;
        UIBlockAction uIBlockAction = this.L;
        return new UIBlockHeader(Ab, this.y, this.z, topTitle2, new mwp0(zb, zb2, Rb, zb3, zb4, zb5, zb6, zb7, zb8, uIBlockAction != null ? uIBlockAction.zb() : null), this.A, this.M);
    }

    public UIBlockHeader(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, TopTitle topTitle, mwp0 mwp0Var, String str3, String str4) {
        super(aVar);
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = topTitle;
        this.C = mwp0Var.a;
        this.D = mwp0Var.b;
        this.F = mwp0Var.d;
        this.E = mwp0Var.c;
        this.G = mwp0Var.e;
        this.H = mwp0Var.f;
        this.I = mwp0Var.g;
        this.J = mwp0Var.h;
        this.K = mwp0Var.i;
        this.L = mwp0Var.j;
        this.M = str4;
    }

    public UIBlockHeader(Serializer serializer) {
        super(serializer);
        this.y = serializer.H();
        this.z = serializer.H();
        this.A = serializer.H();
        this.B = (TopTitle) serializer.G(TopTitle.class.getClassLoader());
        this.C = (UIBlockBadge) serializer.G(UIBlockBadge.class.getClassLoader());
        this.D = (UIBlockActionShowFilters) serializer.G(UIBlockActionShowFilters.class.getClassLoader());
        this.E = (UIBlockActionOpenSection) serializer.G(UIBlockActionTextButton.class.getClassLoader());
        this.F = (UIBlockActionSwitchSection) serializer.G(UIBlockActionSwitchSection.class.getClassLoader());
        this.G = (UIBlockActionOpenSearchTab) serializer.G(UIBlockActionOpenSearchTab.class.getClassLoader());
        this.H = (UIBlockActionClearRecent) serializer.G(UIBlockActionClearRecent.class.getClassLoader());
        this.I = (UIBlockActionOpenScreen) serializer.G(UIBlockActionOpenScreen.class.getClassLoader());
        this.J = (UIBlockActionOpenUrl) serializer.G(UIBlockActionOpenUrl.class.getClassLoader());
        this.K = (UIBlockHideBlockButton) serializer.G(UIBlockHideBlockButton.class.getClassLoader());
        this.L = (UIBlockAction) serializer.G(UIBlockAction.class.getClassLoader());
        this.M = serializer.H();
    }
}
