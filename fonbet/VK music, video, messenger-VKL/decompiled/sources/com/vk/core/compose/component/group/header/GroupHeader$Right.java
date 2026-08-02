package com.vk.core.compose.component.group.header;

import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.button.DropdownButton$Appearance;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.movika.sdk.base.ui.v;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.af0;
import xsna.asp;
import xsna.bhu0;
import xsna.cp10;
import xsna.cq;
import xsna.cri;
import xsna.cx;
import xsna.dt1;
import xsna.e8k;
import xsna.egi;
import xsna.frv0;
import xsna.gs5;
import xsna.gzs;
import xsna.hxl;
import xsna.ikg0;
import xsna.in20;
import xsna.izs;
import xsna.ja8;
import xsna.jgz;
import xsna.jqh;
import xsna.k9q0;
import xsna.kqu0;
import xsna.l5g;
import xsna.lg90;
import xsna.n34;
import xsna.nzu0;
import xsna.pco;
import xsna.pg90;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.s200;
import xsna.sac;
import xsna.sk4;
import xsna.sy90;
import xsna.t41;
import xsna.tq8;
import xsna.txj0;
import xsna.wh50;
import xsna.wuv0;
import xsna.xs6;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zak0;
import xsna.zrp;
import xsna.zy60;

/* compiled from: GroupHeader.kt */
/* loaded from: classes17.dex */
public interface GroupHeader$Right {

    /* compiled from: GroupHeader.kt */
    public static final class Icon {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final wh50 g;
        public final wh50 h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GroupHeader.kt */
        public static final class ContainerSize {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ContainerSize[] $VALUES;
            public static final ContainerSize ExtraSmall;
            public static final ContainerSize Large;
            public static final ContainerSize Medium;
            public static final ContainerSize Small;

            static {
                ContainerSize containerSize = new ContainerSize("Large", 0);
                Large = containerSize;
                ContainerSize containerSize2 = new ContainerSize("Medium", 1);
                Medium = containerSize2;
                ContainerSize containerSize3 = new ContainerSize("Small", 2);
                Small = containerSize3;
                ContainerSize containerSize4 = new ContainerSize("ExtraSmall", 3);
                ExtraSmall = containerSize4;
                ContainerSize[] containerSizeArr = {containerSize, containerSize2, containerSize3, containerSize4};
                $VALUES = containerSizeArr;
                $ENTRIES = new asp(containerSizeArr);
            }

            public ContainerSize() {
                throw null;
            }

            public static ContainerSize valueOf(String str) {
                return (ContainerSize) Enum.valueOf(ContainerSize.class, str);
            }

            public static ContainerSize[] values() {
                return (ContainerSize[]) $VALUES.clone();
            }
        }

        /* compiled from: GroupHeader.kt */
        public static final class a {
            public static Icon a(lg90 lg90Var, long j, String str, gzs gzsVar, ContainerSize containerSize, com.vk.core.compose.component.semantics.a aVar, izs izsVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                String str2 = (i2 & 8) != 0 ? null : str;
                gzs gzsVar2 = (i2 & 16) != 0 ? null : gzsVar;
                ContainerSize containerSize2 = (i2 & 32) != 0 ? ContainerSize.Medium : containerSize;
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 64) != 0 ? null : aVar;
                izs izsVar2 = (i2 & 128) != 0 ? null : izsVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1364235493, i, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.Icon.Companion.invoke (GroupHeader.kt:1023)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    Icon icon = new Icon(lg90Var, j, str2, gzsVar2, aVar3, containerSize2, izsVar2);
                    aVar2.R(icon);
                    x = icon;
                }
                Icon icon2 = (Icon) x;
                ((zak0) icon2.a).setValue(lg90Var);
                ((zak0) icon2.d).setValue(new l5g(j));
                ((zak0) icon2.e).setValue(str2);
                ((zak0) icon2.g).setValue(aVar3);
                ((zak0) icon2.f).setValue(gzsVar2);
                ((zak0) icon2.b).setValue(containerSize2);
                ((zak0) icon2.c).setValue(new pco(Float.NaN));
                ((zak0) icon2.h).setValue(izsVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return icon2;
            }
        }

        public Icon() {
            throw null;
        }

        public Icon(lg90 lg90Var, long j, String str, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, ContainerSize containerSize, izs izsVar) {
            this.a = k.b(lg90Var);
            this.b = k.b(containerSize);
            this.c = cq.f(Float.NaN);
            this.d = zy60.d(j);
            this.e = k.b(str);
            this.f = k.b(gzsVar);
            this.g = k.b(semanticsConfiguration);
            this.h = k.b(izsVar);
        }

        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            androidx.compose.runtime.a aVar2;
            int i2;
            androidx.compose.runtime.a M = aVar.M(-440766331);
            int i3 = (M.J(this) ? 32 : 16) | i;
            if (M.t(i3 & 1, (i3 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-440766331, i3, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.Icon.Content (GroupHeader.kt:971)");
                }
                M.K(1625326724);
                in20 s = jgz.s();
                ContainerSize containerSize = (ContainerSize) ((zak0) this.b).getValue();
                s.getClass();
                int i4 = in20.a.$EnumSwitchMapping$0[containerSize.ordinal()];
                if (i4 == 1) {
                    i2 = 44;
                } else if (i4 == 2) {
                    i2 = 36;
                } else if (i4 == 3) {
                    i2 = 30;
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 20;
                }
                q630 q = txj0.q(q630Var, i2);
                izs izsVar = (izs) ((zak0) this.h).getValue();
                q630.a aVar3 = q630.a.a;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (izsVar != null) {
                    boolean z = (i3 & 112) == 32;
                    Object x = M.x();
                    if (z || x == c0012a) {
                        x = new hxl(this, 10);
                        M.R(x);
                    }
                    q = q.g(egi.o(aVar3, (izs) x));
                }
                M.j();
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q);
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                wh50 wh50Var = this.f;
                gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                if (gzsVar == null) {
                    M.K(1691938229);
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new v(16);
                        M.R(x2);
                    }
                    gzsVar = (gzs) x2;
                } else {
                    M.K(608767640);
                }
                M.j();
                aVar2 = M;
                nzu0.c(gzsVar, (lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.e).getValue(), com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.g).getValue()), ((pco) ((zak0) this.c).getValue()).b, ((l5g) ((zak0) this.d).getValue()).a, false, null, ((gzs) ((zak0) wh50Var).getValue()) != null, null, null, aVar2, 64, 1728);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s2 = aVar2.s();
            if (s2 != null) {
                s2.d = new cx(this, q630Var, i, 9);
            }
        }
    }

    /* compiled from: GroupHeader.kt */
    public interface a {

        /* compiled from: GroupHeader.kt */
        /* renamed from: com.vk.core.compose.component.group.header.GroupHeader$Right$a$a, reason: collision with other inner class name */
        public static final class C0743a implements a {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;
            public final wh50 d;
            public final wh50 e;
            public final wh50 f;
            public final wh50 g;
            public final wh50 h;
            public final wh50 i;
            public final wh50 j;
            public final wh50 k;
            public final wh50 l;
            public final wh50 m;
            public final wh50 n;
            public final wh50 o;

            /* compiled from: GroupHeader.kt */
            /* renamed from: com.vk.core.compose.component.group.header.GroupHeader$Right$a$a$a, reason: collision with other inner class name */
            public static final class C0744a {
                public static C0743a a(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, String str2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                    if ((i2 & 4) != 0) {
                        buttonSize = ButtonSize.Medium;
                    }
                    ButtonSize buttonSize2 = buttonSize;
                    if ((i2 & 8) != 0) {
                        buttonStyle = ButtonStyle.Link;
                    }
                    ButtonStyle buttonStyle2 = buttonStyle;
                    ButtonAppearance buttonAppearance2 = (i2 & 16) != 0 ? null : buttonAppearance;
                    String str3 = (i2 & 4096) != 0 ? null : str2;
                    com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16384) != 0 ? null : aVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1452457544, i, 196608, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.Button.Companion.invoke (GroupHeader.kt:723)");
                    }
                    if (buttonAppearance2 == null) {
                        aVar2.K(52703402);
                        jgz.s().getClass();
                        aVar2.K(839097391);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(839097391, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeGroupHeaderDefaults.buttonAppearance (MilkshakeGroupHeaderDefaults.kt:74)");
                        }
                        buttonAppearance2 = ButtonAppearance.Accent;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                    } else {
                        aVar2.K(52702100);
                    }
                    aVar2.j();
                    ButtonAppearance buttonAppearance3 = buttonAppearance2;
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        C0743a c0743a = new C0743a(str, gzsVar, buttonSize2, buttonStyle2, buttonAppearance3, str3, aVar3);
                        aVar2.R(c0743a);
                        x = c0743a;
                    }
                    C0743a c0743a2 = (C0743a) x;
                    ((zak0) c0743a2.a).setValue(str);
                    ((zak0) c0743a2.b).setValue(gzsVar);
                    ((zak0) c0743a2.c).setValue(buttonStyle2);
                    ((zak0) c0743a2.d).setValue(buttonSize2);
                    ((zak0) c0743a2.e).setValue(buttonAppearance3);
                    ((zak0) c0743a2.f).setValue(null);
                    ((zak0) c0743a2.g).setValue(null);
                    ((zak0) c0743a2.h).setValue(null);
                    ((zak0) c0743a2.i).setValue(null);
                    ((zak0) c0743a2.j).setValue(null);
                    ((zak0) c0743a2.k).setValue(null);
                    ((zak0) c0743a2.l).setValue(null);
                    ((zak0) c0743a2.m).setValue(str3);
                    ((zak0) c0743a2.n).setValue(true);
                    ((zak0) c0743a2.o).setValue(aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return c0743a2;
                }
            }

            public C0743a() {
                throw null;
            }

            public C0743a(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, String str2, SemanticsConfiguration semanticsConfiguration) {
                this.a = k.b(str);
                this.b = k.b(gzsVar);
                this.c = k.b(buttonStyle);
                this.d = k.b(buttonSize);
                this.e = k.b(buttonAppearance);
                this.f = k.b(null);
                this.g = k.b(null);
                this.h = k.b(null);
                this.i = k.b(null);
                this.j = k.b(null);
                this.k = k.b(null);
                this.l = k.b(null);
                this.m = k.b(str2);
                this.n = k.b(Boolean.TRUE);
                this.o = k.b(semanticsConfiguration);
            }

            @Override // com.vk.core.compose.component.group.header.GroupHeader$Right.a
            public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
                int i2;
                androidx.compose.runtime.a aVar2;
                androidx.compose.runtime.a M = aVar.M(-1365926433);
                int i3 = i & 6;
                q630.a aVar3 = q630.a.a;
                if (i3 == 0) {
                    i2 = (M.J(aVar3) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 384) == 0) {
                    i2 |= M.J(this) ? 256 : 128;
                }
                if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1365926433, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.Button.Content (GroupHeader.kt:684)");
                    }
                    q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.o).getValue());
                    ButtonSize buttonSize = (ButtonSize) ((zak0) this.d).getValue();
                    aVar2 = M;
                    bhu0.e((gzs) ((zak0) this.b).getValue(), buttonSize, (ButtonStyle) ((zak0) this.c).getValue(), (ButtonAppearance) ((zak0) this.e).getValue(), b, null, false, false, (lg90) ((zak0) this.f).getValue(), (l5g) ((zak0) this.g).getValue(), (pco) ((zak0) this.h).getValue(), (String) ((zak0) this.a).getValue(), (Integer) ((zak0) this.i).getValue(), (lg90) ((zak0) this.j).getValue(), (l5g) ((zak0) this.k).getValue(), (pco) ((zak0) this.l).getValue(), ((Boolean) ((zak0) this.n).getValue()).booleanValue(), null, (String) ((zak0) this.m).getValue(), null, aVar2, 1073741824, 32768, 0, 3408352);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2 = M;
                    aVar2.h();
                }
                androidx.compose.runtime.f s = aVar2.s();
                if (s != null) {
                    s.d = new tq8(this, bVar, i);
                }
            }
        }

        /* compiled from: GroupHeader.kt */
        public static final class b implements a {
            public final wh50 a = k.b("Detail");
            public final wh50 b = k.b(null);

            @Override // com.vk.core.compose.component.group.header.GroupHeader$Right.a
            public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
                int i2;
                androidx.compose.runtime.a aVar2;
                androidx.compose.runtime.a M = aVar.M(-775547522);
                int i3 = i & 6;
                q630.a aVar3 = q630.a.a;
                if (i3 == 0) {
                    i2 = (M.J(aVar3) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 384) == 0) {
                    i2 |= M.J(this) ? 256 : 128;
                }
                if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-775547522, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.Detail.Content (GroupHeader.kt:625)");
                    }
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 1, com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.b).getValue()));
                    String str = (String) ((zak0) this.a).getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.T;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2 = M;
                    yqv0.c(str, F, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2 = M;
                    aVar2.h();
                }
                androidx.compose.runtime.f s = aVar2.s();
                if (s != null) {
                    s.d = new gs5(this, bVar, i);
                }
            }
        }

        /* compiled from: GroupHeader.kt */
        public static final class c implements a {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;
            public final wh50 d;

            public c() {
                throw null;
            }

            public c(gzs gzsVar, DropdownButton$Appearance dropdownButton$Appearance) {
                this.a = k.b("Dropdown");
                this.b = k.b(dropdownButton$Appearance);
                this.c = k.b(gzsVar);
                this.d = k.b(null);
            }

            @Override // com.vk.core.compose.component.group.header.GroupHeader$Right.a
            public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
                int i2;
                androidx.compose.runtime.a M = aVar.M(484406590);
                int i3 = i & 6;
                q630.a aVar2 = q630.a.a;
                if (i3 == 0) {
                    i2 = (M.J(aVar2) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 384) == 0) {
                    i2 |= M.J(this) ? 256 : 128;
                }
                if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(484406590, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.Dropdown.Content (GroupHeader.kt:777)");
                    }
                    bhu0.g((String) ((zak0) this.a).getValue(), (gzs) ((zak0) this.c).getValue(), com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.d).getValue()), (DropdownButton$Appearance) ((zak0) this.b).getValue(), M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new sac(this, bVar, i);
                }
            }
        }

        /* compiled from: GroupHeader.kt */
        public static final class d implements a {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;
            public final wh50 d;

            /* compiled from: GroupHeader.kt */
            /* renamed from: com.vk.core.compose.component.group.header.GroupHeader$Right$a$d$a, reason: collision with other inner class name */
            public static final class C0745a {
            }

            public d() {
                throw null;
            }

            public d(long j) {
                this.a = k.b(null);
                this.b = zy60.d(j);
                this.c = k.b(null);
                this.d = k.b(null);
            }

            @Override // com.vk.core.compose.component.group.header.GroupHeader$Right.a
            public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
                int i2;
                androidx.compose.runtime.a aVar2;
                androidx.compose.runtime.a M = aVar.M(-449656190);
                int i3 = i & 6;
                q630.a aVar3 = q630.a.a;
                if (i3 == 0) {
                    i2 = (M.J(aVar3) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= M.J(bVar) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= M.J(this) ? 256 : 128;
                }
                if (M.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-449656190, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionButton.More.Content (GroupHeader.kt:572)");
                    }
                    M.K(295732297);
                    jgz.s().getClass();
                    M.K(1536712975);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1536712975, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeGroupHeaderDefaults.moreIconPainter (MilkshakeGroupHeaderDefaults.kt:70)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(864001564, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical24> (VkSdkIcons.kt:2666)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_more_vertical_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    M.j();
                    q630 q = txj0.q(aVar3, 36);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, q);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    wh50 wh50Var = this.c;
                    gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                    if (gzsVar == null) {
                        M.K(-242186344);
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new af0(18);
                            M.R(x);
                        }
                        gzsVar = (gzs) x;
                    } else {
                        M.K(823471189);
                    }
                    M.j();
                    aVar2 = M;
                    nzu0.c(gzsVar, a, (String) ((zak0) this.a).getValue(), com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.d).getValue()), Float.NaN, ((l5g) ((zak0) this.b).getValue()).a, false, null, ((gzs) ((zak0) wh50Var).getValue()) != null, null, null, aVar2, 24640, 1728);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2 = M;
                    aVar2.h();
                }
                androidx.compose.runtime.f s = aVar2.s();
                if (s != null) {
                    s.d = new t41(this, bVar, i);
                }
            }
        }

        void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: GroupHeader.kt */
    public interface b {

        /* compiled from: GroupHeader.kt */
        public static final class a implements b {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;

            /* compiled from: GroupHeader.kt */
            /* renamed from: com.vk.core.compose.component.group.header.GroupHeader$Right$b$a$a, reason: collision with other inner class name */
            public static final class C0746a {
                public static a a(int i, int i2, androidx.compose.runtime.a aVar, com.vk.core.compose.component.semantics.a aVar2, String str, gzs gzsVar) {
                    if ((i2 & 1) != 0) {
                        gzsVar = null;
                    }
                    if ((i2 & 2) != 0) {
                        str = null;
                    }
                    if ((i2 & 4) != 0) {
                        aVar2 = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1740108885, i, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionIcon.Chevron.Companion.invoke (GroupHeader.kt:865)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new a(aVar2, str, gzsVar);
                        aVar.R(x);
                    }
                    a aVar3 = (a) x;
                    ((zak0) aVar3.a).setValue(str);
                    ((zak0) aVar3.b).setValue(gzsVar);
                    ((zak0) aVar3.c).setValue(aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return aVar3;
                }
            }

            public a() {
                throw null;
            }

            public a(SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar) {
                this.a = k.b(str);
                this.b = k.b(gzsVar);
                this.c = k.b(semanticsConfiguration);
            }

            @Override // com.vk.core.compose.component.group.header.GroupHeader$Right.b
            public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
                int i2;
                androidx.compose.runtime.a aVar2;
                androidx.compose.runtime.a M = aVar.M(1208778465);
                int i3 = i & 6;
                q630.a aVar3 = q630.a.a;
                if (i3 == 0) {
                    i2 = (M.J(aVar3) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= M.J(bVar) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= M.J(this) ? 256 : 128;
                }
                if (M.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1208778465, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionIcon.Chevron.Content (GroupHeader.kt:822)");
                    }
                    M.K(1714766682);
                    q630 q = txj0.q(aVar3, 36);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.g, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, q);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    wh50 wh50Var = this.b;
                    gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                    if (gzsVar == null) {
                        M.K(-1013870263);
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new sk4(16);
                            M.R(x);
                        }
                        gzsVar = (gzs) x;
                    } else {
                        M.K(1491314820);
                    }
                    M.j();
                    q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.c).getValue());
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1820128868, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronRightCircle28> (VkSdkIcons.kt:506)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_chevron_right_circle_28, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2 = M;
                    nzu0.c(gzsVar, a, (String) ((zak0) this.a).getValue(), b, Float.NaN, ylu0Var.getIcon().f, false, null, ((gzs) ((zak0) wh50Var).getValue()) != null, null, null, aVar2, 24640, 1728);
                    aVar2.G();
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2 = M;
                    aVar2.h();
                }
                androidx.compose.runtime.f s = aVar2.s();
                if (s != null) {
                    s.d = new e8k(this, bVar, i);
                }
            }
        }

        /* compiled from: GroupHeader.kt */
        /* renamed from: com.vk.core.compose.component.group.header.GroupHeader$Right$b$b, reason: collision with other inner class name */
        public static final class C0747b implements b {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;

            /* compiled from: GroupHeader.kt */
            /* renamed from: com.vk.core.compose.component.group.header.GroupHeader$Right$b$b$a */
            public static final class a {
            }

            public C0747b() {
                throw null;
            }

            public C0747b(int i) {
                this.a = k.b(null);
                this.b = k.b(null);
                this.c = k.b(null);
            }

            @Override // com.vk.core.compose.component.group.header.GroupHeader$Right.b
            public final void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i) {
                int i2;
                androidx.compose.runtime.a aVar2;
                androidx.compose.runtime.a M = aVar.M(1391057264);
                int i3 = i & 6;
                q630.a aVar3 = q630.a.a;
                if (i3 == 0) {
                    i2 = (M.J(aVar3) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= M.J(bVar) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= M.J(this) ? 256 : 128;
                }
                if (M.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1391057264, i2, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.ActionIcon.Dismiss.Content (GroupHeader.kt:891)");
                    }
                    M.K(-1151162090);
                    q630 q = txj0.q(aVar3, 36);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.g, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, q);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    wh50 wh50Var = this.b;
                    gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                    if (gzsVar == null) {
                        M.K(415168602);
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new xs6(10);
                            M.R(x);
                        }
                        gzsVar = (gzs) x;
                    } else {
                        M.K(567581523);
                    }
                    M.j();
                    q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.c).getValue());
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2029247040, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss28> (VkSdkIcons.kt:652)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_dismiss_28, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2 = M;
                    nzu0.c(gzsVar, a2, (String) ((zak0) this.a).getValue(), b, Float.NaN, ylu0Var.getIcon().f, false, null, ((gzs) ((zak0) wh50Var).getValue()) != null, null, null, aVar2, 24640, 1728);
                    aVar2.G();
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2 = M;
                    aVar2.h();
                }
                androidx.compose.runtime.f s = aVar2.s();
                if (s != null) {
                    s.d = new jqh(this, bVar, i);
                }
            }
        }

        void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: GroupHeader.kt */
    public static final class c {
        public static ikg0 a(a aVar, Icon icon, b bVar, com.vk.core.compose.component.semantics.a aVar2, androidx.compose.runtime.a aVar3, int i) {
            if ((i & 1) != 0) {
                aVar = null;
            }
            if ((i & 2) != 0) {
                icon = null;
            }
            if ((i & 4) != 0) {
                bVar = null;
            }
            if ((i & 8) != 0) {
                aVar2 = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1726965063, 24576, -1, "com.vk.core.compose.component.group.header.GroupHeader.Right.Companion.invoke (GroupHeader.kt:1054)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1010072904, 6, -1, "com.vk.core.compose.component.group.header.right.remember (RightImpl.kt:58)");
            }
            Object x = aVar3.x();
            if (x == a.C0011a.a) {
                x = new ikg0(aVar, icon, bVar, aVar2);
                aVar3.R(x);
            }
            ikg0 ikg0Var = (ikg0) x;
            ((zak0) ikg0Var.a).setValue(aVar);
            ((zak0) ikg0Var.b).setValue(icon);
            ((zak0) ikg0Var.c).setValue(bVar);
            ((zak0) ikg0Var.d).setValue(aVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ikg0Var;
        }
    }

    void a(com.vk.core.compose.component.group.header.b bVar, androidx.compose.runtime.a aVar, int i);
}
