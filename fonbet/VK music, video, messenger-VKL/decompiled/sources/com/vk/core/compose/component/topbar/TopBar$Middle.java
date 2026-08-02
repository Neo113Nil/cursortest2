package com.vk.core.compose.component.topbar;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.b;
import com.vk.core.compose.component.topbar.k;
import com.vk.movika.tools.controls.seekbar.v;
import com.vk.movika.tools.controls.seekbar.w;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.commons.http.Http;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a5f;
import xsna.a5x;
import xsna.alb0;
import xsna.asp;
import xsna.bap;
import xsna.bbk0;
import xsna.bko0;
import xsna.bo7;
import xsna.cdi;
import xsna.ck70;
import xsna.cp10;
import xsna.cri;
import xsna.cy20;
import xsna.dei0;
import xsna.do7;
import xsna.dt1;
import xsna.e7p0;
import xsna.ed4;
import xsna.efj;
import xsna.esx0;
import xsna.f9t;
import xsna.fiv0;
import xsna.frv0;
import xsna.fvr;
import xsna.g4o;
import xsna.g7c;
import xsna.gly;
import xsna.gzs;
import xsna.ht1;
import xsna.if2;
import xsna.ini;
import xsna.ir;
import xsna.iyk0;
import xsna.izs;
import xsna.ja8;
import xsna.jo7;
import xsna.k18;
import xsna.k9q0;
import xsna.kqu0;
import xsna.kr;
import xsna.l5g;
import xsna.ldu0;
import xsna.lg90;
import xsna.lwj0;
import xsna.lys;
import xsna.m7p0;
import xsna.mcj0;
import xsna.mtk0;
import xsna.mxr;
import xsna.n34;
import xsna.njv0;
import xsna.ojc;
import xsna.om9;
import xsna.pg90;
import xsna.plg0;
import xsna.pzu0;
import xsna.q630;
import xsna.qer0;
import xsna.qf2;
import xsna.qri;
import xsna.rdu;
import xsna.rrv0;
import xsna.rzb0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sy90;
import xsna.szw;
import xsna.tho0;
import xsna.tlh0;
import xsna.txj0;
import xsna.ty6;
import xsna.u890;
import xsna.ur;
import xsna.v4j0;
import xsna.vqv;
import xsna.w6h;
import xsna.wh50;
import xsna.whx;
import xsna.wow;
import xsna.wug0;
import xsna.wuv0;
import xsna.wzs;
import xsna.xf4;
import xsna.xim0;
import xsna.xpy;
import xsna.ylu0;
import xsna.yqv0;
import xsna.yy0;
import xsna.z190;
import xsna.zak0;
import xsna.zhf0;
import xsna.znk0;
import xsna.zrp;
import xsna.zy60;

/* compiled from: TopBar.kt */
/* loaded from: classes17.dex */
public abstract class TopBar$Middle {
    public final wh50<Float> a = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final wh50 b = androidx.compose.runtime.k.b(k.b.a);

    /* compiled from: TopBar.kt */
    public static final class Cell extends e7p0 {
        public final wh50 c;
        public final wh50 d;

        /* compiled from: TopBar.kt */
        public interface Middle {

            /* compiled from: TopBar.kt */
            public static final class Text implements Middle {
                public final wh50 a;
                public final wh50 b;
                public final wh50 c;

                /* compiled from: TopBar.kt */
                public static final class Title {
                    public final wh50 a;
                    public final wh50 b;
                    public final wh50 c;
                    public final wh50 d;
                    public final wh50 e;
                    public final wh50 f;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    /* compiled from: TopBar.kt */
                    public static final class Overflow {
                        private static final /* synthetic */ zrp $ENTRIES;
                        private static final /* synthetic */ Overflow[] $VALUES;
                        public static final Overflow Fade;
                        public static final Overflow None;

                        static {
                            Overflow overflow = new Overflow("None", 0);
                            None = overflow;
                            Overflow overflow2 = new Overflow("Fade", 1);
                            Fade = overflow2;
                            Overflow[] overflowArr = {overflow, overflow2};
                            $VALUES = overflowArr;
                            $ENTRIES = new asp(overflowArr);
                        }

                        public Overflow() {
                            throw null;
                        }

                        public static Overflow valueOf(String str) {
                            return (Overflow) Enum.valueOf(Overflow.class, str);
                        }

                        public static Overflow[] values() {
                            return (Overflow[]) $VALUES.clone();
                        }
                    }

                    /* compiled from: TopBar.kt */
                    public interface a {

                        /* compiled from: TopBar.kt */
                        /* renamed from: com.vk.core.compose.component.topbar.TopBar$Middle$Cell$Middle$Text$Title$a$a, reason: collision with other inner class name */
                        public static final class C0751a implements a {
                            public final wh50 a;

                            public C0751a(String str) {
                                this.a = androidx.compose.runtime.k.b(str);
                            }

                            @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.a
                            public final void a(int i, androidx.compose.runtime.a aVar) {
                                androidx.compose.runtime.a M = aVar.M(404397174);
                                int i2 = (M.J(this) ? 32 : 16) | i;
                                if (M.t(i2 & 1, (i2 & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(404397174, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.Along.Dropdown.Content (TopBar.kt:1400)");
                                    }
                                    q630 q = txj0.q(q630.a.a, 16);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-507862468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown16> (VkSdkIcons.kt:744)");
                                    }
                                    lg90 a = pg90.a(R.drawable.vk_icon_dropdown_16, 0, M);
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
                                    vqv.a(a, (String) ((zak0) this.a).getValue(), q, ylu0Var.getIcon().j, M, 392, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    M.h();
                                }
                                androidx.compose.runtime.f s = M.s();
                                if (s != null) {
                                    s.d = new v(this, i, 16);
                                }
                            }
                        }

                        /* compiled from: TopBar.kt */
                        public static final class b implements a {
                            public final wh50 a;
                            public final wh50 b;

                            public b(lg90 lg90Var, String str) {
                                this.a = androidx.compose.runtime.k.b(lg90Var);
                                this.b = androidx.compose.runtime.k.b(str);
                            }

                            @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.a
                            public final void a(int i, androidx.compose.runtime.a aVar) {
                                androidx.compose.runtime.a M = aVar.M(1648088846);
                                int i2 = (M.J(this) ? 32 : 16) | i;
                                if (M.t(i2 & 1, (i2 & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1648088846, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.Along.Icon.Content (TopBar.kt:1430)");
                                    }
                                    q630 q = txj0.q(q630.a.a, 16);
                                    lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    vqv.a(lg90Var, (String) ((zak0) this.b).getValue(), q, ylu0Var.getIcon().n, M, 392, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    M.h();
                                }
                                androidx.compose.runtime.f s = M.s();
                                if (s != null) {
                                    s.d = new w(this, i, 16);
                                }
                            }
                        }

                        void a(int i, androidx.compose.runtime.a aVar);
                    }

                    /* compiled from: TopBar.kt */
                    public static final class b {
                    }

                    public Title() {
                        throw null;
                    }

                    public Title(String str, Overflow overflow, a aVar, a aVar2, gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
                        this.a = androidx.compose.runtime.k.b(str);
                        this.b = androidx.compose.runtime.k.b(overflow);
                        this.c = androidx.compose.runtime.k.b(aVar);
                        this.d = androidx.compose.runtime.k.b(aVar2);
                        this.e = androidx.compose.runtime.k.b(gzsVar);
                        this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
                    }

                    public final void a(k kVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                        androidx.compose.runtime.a aVar2;
                        q630 q630Var2;
                        androidx.compose.runtime.a M = aVar.M(684195074);
                        int i2 = i | (M.J(kVar) ? 4 : 2) | 48 | (M.J(this) ? 256 : 128);
                        if (M.t(i2 & 1, (i2 & 147) != 146)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(684195074, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.Content (TopBar.kt:1295)");
                            }
                            M.K(381479651);
                            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.f).getValue();
                            q630.a aVar3 = q630.a.a;
                            q630 b2 = com.vk.core.compose.component.semantics.b.b(aVar3, semanticsConfiguration);
                            gzs gzsVar = (gzs) ((zak0) this.e).getValue();
                            if (gzsVar != null) {
                                Object x = M.x();
                                if (x == a.C0011a.a) {
                                    x = ir.h(M);
                                }
                                q630 g = b2.g(ojc.b(aVar3, (sg50) x, null, true, new plg0(0), gzsVar, 8));
                                if (g != null) {
                                    b2 = g;
                                }
                            }
                            M.j();
                            a.j g2 = androidx.compose.foundation.layout.a.g(4);
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g2, dt1.a.l, M, 54);
                            int hashCode = Long.hashCode(n34.n(M));
                            sy90 D = M.D();
                            q630 c = qri.c(M, b2);
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
                            k9q0.w(M, a2, cri.a.f);
                            k9q0.w(M, D, cri.a.e);
                            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(M, cri.a.h);
                            k9q0.w(M, c, cri.a.d);
                            esx0 esx0Var = new esx0(ht1.a);
                            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            q630 g3 = esx0Var.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false));
                            if (((Overflow) ((zak0) this.b).getValue()) == Overflow.Fade) {
                                g3 = g3.g(qri.a(aVar3, a5x.a, new ini(this, 7)));
                            }
                            q630 q630Var3 = g3;
                            String str = (String) ((zak0) this.a).getValue();
                            znk0.z().getClass();
                            long a3 = m7p0.a(kVar, M, i2 & 14);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            yqv0.c(str, q630Var3, a3, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.J, M, 0, 0, 8184);
                            aVar2 = M;
                            a aVar5 = (a) ((zak0) this.c).getValue();
                            if (aVar5 == null) {
                                aVar2.K(-1833525526);
                            } else {
                                aVar2.K(-1833525525);
                                aVar5.a(6, aVar2);
                            }
                            aVar2.j();
                            a aVar6 = (a) ((zak0) this.d).getValue();
                            if (aVar6 == null) {
                                aVar2.K(-1833463030);
                            } else {
                                aVar2.K(-1833463029);
                                aVar6.a(6, aVar2);
                            }
                            aVar2.j();
                            aVar2.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var2 = aVar3;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            q630Var2 = q630Var;
                        }
                        androidx.compose.runtime.f s = aVar2.s();
                        if (s != null) {
                            s.d = new xsna.v(i, 10, this, kVar, q630Var2);
                        }
                    }
                }

                /* compiled from: TopBar.kt */
                public static final class a {
                }

                /* compiled from: TopBar.kt */
                public static final class b {
                    public final wh50 a;
                    public final wh50 b;

                    public b(String str, SemanticsConfiguration semanticsConfiguration) {
                        this.a = androidx.compose.runtime.k.b(str);
                        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
                    }

                    public final void a(k kVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                        androidx.compose.runtime.a aVar2;
                        q630 q630Var2;
                        androidx.compose.runtime.a M = aVar.M(-1992132466);
                        int i2 = i | (M.J(kVar) ? 4 : 2) | 48 | (M.J(this) ? 256 : 128);
                        if (M.t(i2 & 1, (i2 & 147) != 146)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1992132466, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Subtitle.Content (TopBar.kt:1494)");
                            }
                            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.b).getValue();
                            q630.a aVar3 = q630.a.a;
                            q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, semanticsConfiguration);
                            String str = (String) ((zak0) this.a).getValue();
                            long h = znk0.z().h(kVar, M, i2 & 14);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar2 = M;
                            yqv0.c(str, b, h, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.m0, aVar2, 0, 0, 8184);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var2 = aVar3;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            q630Var2 = q630Var;
                        }
                        androidx.compose.runtime.f s = aVar2.s();
                        if (s != null) {
                            s.d = new w6h(i, 3, this, kVar, q630Var2);
                        }
                    }
                }

                public Text(Title title, b bVar, SemanticsConfiguration semanticsConfiguration) {
                    this.a = androidx.compose.runtime.k.b(title);
                    this.b = androidx.compose.runtime.k.b(bVar);
                    this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
                }

                @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle
                public final void a(k kVar, androidx.compose.runtime.a aVar, int i) {
                    androidx.compose.runtime.a M = aVar.M(1606494131);
                    int i2 = (M.J(kVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
                    if (M.t(i2 & 1, (i2 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1606494131, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Content (TopBar.kt:1269)");
                        }
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630.a aVar2 = q630.a.a;
                        q630 c = qri.c(M, aVar2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, a2, cri.a.f);
                        k9q0.w(M, D, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c, cri.a.d);
                        int i3 = i2 & 14;
                        ((Title) ((zak0) this.a).getValue()).a(kVar, null, M, i3);
                        wh50 wh50Var = this.b;
                        if (((b) ((zak0) wh50Var).getValue()) != null) {
                            M.K(1685918309);
                            ck70.b(aVar2, 1, M, 6);
                        } else {
                            M.K(669646981);
                            M.j();
                        }
                        b bVar = (b) ((zak0) wh50Var).getValue();
                        if (bVar == null) {
                            M.K(723937559);
                        } else {
                            M.K(1685920810);
                            bVar.a(kVar, null, M, i3);
                        }
                        M.j();
                        M.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        M.h();
                    }
                    androidx.compose.runtime.f s = M.s();
                    if (s != null) {
                        s.d = new xf4(this, kVar, i, 11);
                    }
                }
            }

            void a(k kVar, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: TopBar.kt */
        public interface a {

            /* compiled from: TopBar.kt */
            /* renamed from: com.vk.core.compose.component.topbar.TopBar$Middle$Cell$a$a, reason: collision with other inner class name */
            public static final class C0752a implements a {
                public final wh50 a;
                public final wh50 b;
                public final wh50 c;
                public final wh50 d;
                public final wh50 e = androidx.compose.runtime.k.b(null);
                public final wh50 f;

                /* compiled from: TopBar.kt */
                /* renamed from: com.vk.core.compose.component.topbar.TopBar$Middle$Cell$a$a$a, reason: collision with other inner class name */
                public static final class C0753a {
                }

                public C0752a(efj efjVar, List list, k18 k18Var, z190 z190Var, SemanticsConfiguration semanticsConfiguration) {
                    this.a = androidx.compose.runtime.k.b(efjVar);
                    this.b = androidx.compose.runtime.k.b(new wow(list));
                    this.c = androidx.compose.runtime.k.b(k18Var);
                    this.d = androidx.compose.runtime.k.b(z190Var);
                    this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
                @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Cell.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void a(int i, androidx.compose.runtime.a aVar) {
                    q630 q630Var;
                    androidx.compose.runtime.a M = aVar.M(-15167638);
                    int i2 = (M.J(this) ? 4 : 2) | i;
                    if (M.t(i2 & 1, (i2 & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-15167638, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Left.Avatar.Content (TopBar.kt:1184)");
                        }
                        M.K(-1691189965);
                        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.f).getValue();
                        q630.a aVar2 = q630.a.a;
                        q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
                        wh50 wh50Var = this.e;
                        if (((gzs) ((zak0) wh50Var).getValue()) != null) {
                            gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (gzsVar == null) {
                                M.K(-1752547557);
                                Object x = M.x();
                                if (x == c0012a) {
                                    x = new cy20(16);
                                    M.R(x);
                                }
                                gzsVar = (gzs) x;
                            } else {
                                M.K(-887818126);
                            }
                            M.j();
                            gzs gzsVar2 = gzsVar;
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = ir.h(M);
                            }
                            q630 g = b.g(ojc.b(aVar2, (sg50) x2, qer0.a(36 / 2.0f, 5, 0L, false), true, null, gzsVar2, 24));
                            if (g != null) {
                                q630Var = g;
                                M.j();
                                ldu0.a((efj) ((zak0) this.a).getValue(), 36, ((wow) ((zak0) this.b).getValue()).b, q630Var, (k18) ((zak0) this.c).getValue(), false, (z190) ((zak0) this.d).getValue(), null, null, M, 48, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            }
                        }
                        q630Var = b;
                        M.j();
                        ldu0.a((efj) ((zak0) this.a).getValue(), 36, ((wow) ((zak0) this.b).getValue()).b, q630Var, (k18) ((zak0) this.c).getValue(), false, (z190) ((zak0) this.d).getValue(), null, null, M, 48, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                        if (androidx.compose.runtime.b.d()) {
                        }
                    } else {
                        M.h();
                    }
                    androidx.compose.runtime.f s = M.s();
                    if (s != null) {
                        s.d = new om9(this, i, 17);
                    }
                }
            }

            void a(int i, androidx.compose.runtime.a aVar);
        }

        public Cell(a.C0752a c0752a, Middle.Text text) {
            this.c = androidx.compose.runtime.k.b(c0752a);
            this.d = androidx.compose.runtime.k.b(text);
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Middle
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-577667985);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-577667985, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Content (TopBar.kt:1149)");
                }
                q630 E = s200.E(q630Var, 2, kqu0.r);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                ((a) ((zak0) this.c).getValue()).a(0, M);
                f9t.e(txj0.v(q630.a.a, 12), M, 6);
                ((Middle) ((zak0) this.d).getValue()).a((k) ((zak0) this.b).getValue(), M, 0);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new g7c(this, q630Var, i, 4);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class Text extends e7p0 {
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;

        /* compiled from: TopBar.kt */
        public static final class Title implements rzb0 {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;
            public final wh50 d;
            public final wh50 e;
            public final wh50<zhf0> f;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: TopBar.kt */
            public static final class Size {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Size[] $VALUES;
                public static final Size Medium;
                public static final Size Small;

                static {
                    Size size = new Size("Small", 0);
                    Small = size;
                    Size size2 = new Size("Medium", 1);
                    Medium = size2;
                    Size[] sizeArr = {size, size2};
                    $VALUES = sizeArr;
                    $ENTRIES = new asp(sizeArr);
                }

                public Size() {
                    throw null;
                }

                public static Size valueOf(String str) {
                    return (Size) Enum.valueOf(Size.class, str);
                }

                public static Size[] values() {
                    return (Size[]) $VALUES.clone();
                }
            }

            /* compiled from: TopBar.kt */
            public interface a {

                /* compiled from: TopBar.kt */
                /* renamed from: com.vk.core.compose.component.topbar.TopBar$Middle$Text$Title$a$a, reason: collision with other inner class name */
                public static final class C0754a implements a {
                    public final wh50 a;

                    public C0754a(String str) {
                        this.a = androidx.compose.runtime.k.b(str);
                    }

                    /* JADX WARN: Type inference failed for: r2v10 */
                    /* JADX WARN: Type inference failed for: r2v8 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
                    @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.a
                    public final void a(mtk0 mtk0Var, k kVar, androidx.compose.runtime.a aVar, int i) {
                        int i2;
                        ?? r2;
                        androidx.compose.runtime.a M = aVar.M(1013967211);
                        if ((i & 48) == 0) {
                            i2 = (M.J(mtk0Var) ? 32 : 16) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= M.J(this) ? 2048 : 1024;
                        }
                        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION) != 1040)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1013967211, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Dropdown.Content (TopBar.kt:689)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            iyk0 iyk0Var = rrv0.a;
                            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j = ylu0Var.getIcon().j;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j2 = ylu0Var2.getIcon().c;
                            Object x = M.x();
                            Object obj = a.C0011a.a;
                            if (x == obj) {
                                x = lwj0.a(j);
                                M.R(x);
                            }
                            if2 if2Var = (if2) x;
                            Object value = mtk0Var.getValue();
                            l5g l5gVar = new l5g(j);
                            l5g l5gVar2 = new l5g(j2);
                            boolean y = M.y(if2Var) | M.p(j) | M.p(j2) | ((i2 & 112) == 32);
                            Object x2 = M.x();
                            if (y || x2 == obj) {
                                r2 = 0;
                                i iVar = new i(if2Var, j, j2, mtk0Var, null);
                                M.R(iVar);
                                x2 = iVar;
                            } else {
                                r2 = 0;
                            }
                            bap.e(value, l5gVar, l5gVar2, (wzs) x2, M, 0);
                            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.q, 7);
                            dt1.a.getClass();
                            cp10 d = ja8.d(dt1.a.i, r2);
                            int hashCode = Long.hashCode(n34.n(M));
                            sy90 D = M.D();
                            q630 c = qri.c(M, H);
                            cri.h7.getClass();
                            LayoutNode.a aVar2 = cri.a.b;
                            if (M.N() == null) {
                                n34.r();
                                throw null;
                            }
                            M.H();
                            if (M.L()) {
                                M.I(aVar2);
                            } else {
                                M.f();
                            }
                            k9q0.w(M, d, cri.a.f);
                            k9q0.w(M, D, cri.a.e);
                            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(M, cri.a.h);
                            k9q0.w(M, c, cri.a.d);
                            znk0.z().getClass();
                            M.K(1607449423);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1607449423, r2, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.titleDropdownIcon (MilkshakeTopBarDefaults.kt:69)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-507862468, r2, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown16> (VkSdkIcons.kt:744)");
                            }
                            lg90 a = pg90.a(R.drawable.vk_icon_dropdown_16, r2, M);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            pzu0.b(a, (String) ((zak0) this.a).getValue(), null, ((l5g) if2Var.d()).a, M, 8, 4);
                            M = M;
                            M.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            M.h();
                        }
                        androidx.compose.runtime.f s = M.s();
                        if (s != null) {
                            s.d = new jo7(i, 5, this, mtk0Var, kVar);
                        }
                    }
                }

                /* compiled from: TopBar.kt */
                public static final class b implements a {
                    public final wh50 a;
                    public final wh50 b;

                    public b(c cVar, c cVar2) {
                        this.a = androidx.compose.runtime.k.b(cVar);
                        this.b = androidx.compose.runtime.k.b(cVar2);
                    }

                    @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.a
                    public final void a(mtk0 mtk0Var, k kVar, androidx.compose.runtime.a aVar, int i) {
                        int i2;
                        androidx.compose.runtime.a M = aVar.M(1391121238);
                        if ((i & 48) == 0) {
                            i2 = (M.J(mtk0Var) ? 32 : 16) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i & 384) == 0) {
                            i2 |= M.J(kVar) ? 256 : 128;
                        }
                        if ((i & 3072) == 0) {
                            i2 |= M.J(this) ? 2048 : 1024;
                        }
                        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1391121238, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Icons.Content (TopBar.kt:737)");
                            }
                            dt1.a.getClass();
                            ty6.b bVar = dt1.a.l;
                            a.l lVar = androidx.compose.foundation.layout.a.a;
                            znk0.z().getClass();
                            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.r), bVar, M, 48);
                            int hashCode = Long.hashCode(n34.n(M));
                            sy90 D = M.D();
                            q630 c = qri.c(M, q630.a.a);
                            cri.h7.getClass();
                            LayoutNode.a aVar2 = cri.a.b;
                            if (M.N() == null) {
                                n34.r();
                                throw null;
                            }
                            M.H();
                            if (M.L()) {
                                M.I(aVar2);
                            } else {
                                M.f();
                            }
                            k9q0.w(M, a, cri.a.f);
                            k9q0.w(M, D, cri.a.e);
                            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(M, cri.a.h);
                            k9q0.w(M, c, cri.a.d);
                            long d = znk0.z().d(kVar, ((Number) mtk0Var.getValue()).floatValue(), M, (i2 >> 6) & 14);
                            ((c) ((zak0) this.a).getValue()).a(0, d, M, null);
                            c cVar = (c) ((zak0) this.b).getValue();
                            if (cVar == null) {
                                M.K(-325902891);
                            } else {
                                M.K(543676332);
                                cVar.a(0, d, M, null);
                            }
                            M.j();
                            M.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            M.h();
                        }
                        androidx.compose.runtime.f s = M.s();
                        if (s != null) {
                            s.d = new lys(i, 6, this, mtk0Var, kVar);
                        }
                    }
                }

                void a(mtk0 mtk0Var, k kVar, androidx.compose.runtime.a aVar, int i);
            }

            /* compiled from: TopBar.kt */
            public static final class b {
                public static Title a(String str, a aVar, Size size, gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar2, int i, int i2) {
                    String str2;
                    a aVar3 = (i2 & 2) != 0 ? null : aVar;
                    if ((i2 & 4) != 0) {
                        size = Size.Medium;
                    }
                    Size size2 = size;
                    gzs gzsVar2 = (i2 & 8) != 0 ? null : gzsVar;
                    SemanticsConfiguration semanticsConfiguration2 = (i2 & 16) != 0 ? null : semanticsConfiguration;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(426465416, i, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Companion.invoke (TopBar.kt:770)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        str2 = str;
                        Title title = new Title(str2, aVar3, size2, gzsVar2, semanticsConfiguration2);
                        aVar2.R(title);
                        x = title;
                    } else {
                        str2 = str;
                    }
                    Title title2 = (Title) x;
                    ((zak0) title2.a).setValue(str2);
                    ((zak0) title2.b).setValue(aVar3);
                    ((zak0) title2.c).setValue(size2);
                    ((zak0) title2.d).setValue(gzsVar2);
                    ((zak0) title2.e).setValue(semanticsConfiguration2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return title2;
                }
            }

            public Title() {
                throw null;
            }

            public Title(String str, a aVar, Size size, gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
                this.a = androidx.compose.runtime.k.b(str);
                this.b = androidx.compose.runtime.k.b(aVar);
                this.c = androidx.compose.runtime.k.b(size);
                this.d = androidx.compose.runtime.k.b(gzsVar);
                this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
                this.f = androidx.compose.runtime.k.b(zhf0.e);
            }

            @Override // xsna.rzb0
            public final zhf0 d() {
                return (zhf0) ((zak0) this.f).getValue();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v2, types: [int] */
            /* JADX WARN: Type inference failed for: r15v6 */
            public final void e(mtk0 mtk0Var, k kVar, final boolean z, final boolean z2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
                k kVar2;
                androidx.compose.runtime.a aVar2;
                final q630 q630Var2;
                frv0 frv0Var;
                int i2;
                l5g l5gVar;
                ?? r15;
                boolean z3;
                v4j0 v4j0Var;
                int i3;
                int i4;
                com.vk.core.compose.component.topbar.b bVar;
                if2 if2Var;
                long j;
                mtk0 mtk0Var2;
                q630.a aVar3;
                wh50 wh50Var;
                q630.a aVar4;
                frv0 frv0Var2;
                boolean z4;
                int i5;
                mtk0 mtk0Var3 = mtk0Var;
                androidx.compose.runtime.a M = aVar.M(-771702430);
                int i6 = i | (M.J(mtk0Var3) ? 4 : 2) | (M.J(kVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | 24576 | (M.J(this) ? 131072 : 65536);
                if (M.t(i6 & 1, (74899 & i6) != 74898)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-771702430, i6, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Content (TopBar.kt:597)");
                    }
                    com.vk.core.compose.component.topbar.b z5 = znk0.z();
                    k.b bVar2 = k.b.a;
                    z5.getClass();
                    long a2 = m7p0.a(bVar2, M, 6);
                    long a3 = m7p0.a(k.a.C0761a.a, M, 6);
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = lwj0.a(a2);
                        M.R(x);
                    }
                    if2 if2Var2 = (if2) x;
                    Size size = (Size) ((zak0) this.c).getValue();
                    int i7 = (i6 >> 3) & 1008;
                    M.K(-1813360040);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1813360040, i7, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.titleTextStyle (MilkshakeTopBarDefaults.kt:63)");
                    }
                    int i8 = b.a.$EnumSwitchMapping$0[size.ordinal()];
                    if (i8 == 1) {
                        M.K(1117731425);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var.J;
                        M.j();
                    } else {
                        if (i8 != 2) {
                            throw alb0.c(1117729242, M);
                        }
                        M.K(1117733669);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var2.f;
                        M.j();
                    }
                    frv0 frv0Var3 = frv0Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(559436726, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-shadow> (VkTheme.kt:175)");
                    }
                    njv0 njv0Var = (njv0) M.r(rrv0.d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    v4j0 a4 = njv0Var.a(M);
                    Object value = mtk0Var3.getValue();
                    l5g l5gVar2 = new l5g(a2);
                    l5g l5gVar3 = new l5g(a3);
                    androidx.compose.runtime.a aVar5 = M;
                    int i9 = i6 & 14;
                    boolean y = aVar5.y(if2Var2) | aVar5.p(a2) | aVar5.p(a3) | (i9 == 4);
                    Object x2 = aVar5.x();
                    if (y || x2 == c0012a) {
                        i2 = i6;
                        l5gVar = l5gVar2;
                        r15 = 0;
                        z3 = true;
                        v4j0Var = a4;
                        i3 = i9;
                        i4 = 6;
                        bVar = z5;
                        j jVar = new j(if2Var2, a2, a3, mtk0Var3, null);
                        if2Var = if2Var2;
                        j = a3;
                        mtk0Var2 = mtk0Var3;
                        aVar5.R(jVar);
                        x2 = jVar;
                    } else {
                        bVar = z5;
                        i2 = i6;
                        if2Var = if2Var2;
                        l5gVar = l5gVar2;
                        j = a3;
                        r15 = 0;
                        z3 = true;
                        i4 = 6;
                        v4j0Var = a4;
                        i3 = i9;
                        mtk0Var2 = mtk0Var3;
                    }
                    bap.e(value, l5gVar, l5gVar3, (wzs) x2, aVar5, 0);
                    boolean J = aVar5.J(bVar) | ((i2 & 112) == 32 ? z3 : r15) | (i3 == 4 ? z3 : r15);
                    Object x3 = aVar5.x();
                    if (J || x3 == c0012a) {
                        x3 = bbk0.b(new yy0(bVar, kVar, mtk0Var2, 8));
                        aVar5.R(x3);
                    }
                    mtk0 mtk0Var4 = (mtk0) x3;
                    aVar5.K(1423358659);
                    wh50<zhf0> wh50Var2 = this.f;
                    q630.a aVar6 = q630.a.a;
                    q630 b2 = com.vk.core.compose.component.semantics.b.b(cdi.H(aVar6, wh50Var2), (SemanticsConfiguration) ((zak0) this.e).getValue());
                    gzs gzsVar = (gzs) ((zak0) this.d).getValue();
                    if (gzsVar != null) {
                        Object x4 = aVar5.x();
                        if (x4 == c0012a) {
                            x4 = ir.h(aVar5);
                        }
                        q630 b3 = ojc.b(aVar6, (sg50) x4, null, true, new plg0(r15), gzsVar, 8);
                        aVar3 = aVar6;
                        q630 g = b2.g(b3);
                        if (g != null) {
                            b2 = g;
                        }
                    } else {
                        aVar3 = aVar6;
                    }
                    aVar5.j();
                    dt1.a.getClass();
                    ty6.b bVar3 = dt1.a.l;
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    znk0.z().getClass();
                    androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.r), bVar3, aVar5, 48);
                    int hashCode = Long.hashCode(n34.n(aVar5));
                    sy90 D = aVar5.D();
                    q630 c = qri.c(aVar5, b2);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar7);
                    } else {
                        aVar5.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar5, a5, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar5, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar4 = cri.a.g;
                    k9q0.w(aVar5, valueOf, bVar4);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar5, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar5, c, dVar);
                    esx0 esx0Var = new esx0(ht1.a);
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar5));
                    v4j0 v4j0Var2 = v4j0Var;
                    sy90 D2 = aVar5.D();
                    q630 c2 = qri.c(aVar5, esx0Var);
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar7);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, d, cVar);
                    k9q0.w(aVar5, D2, eVar);
                    ur.d(hashCode2, aVar5, bVar4, aVar5, c2678a);
                    k9q0.w(aVar5, c2, dVar);
                    boolean booleanValue = ((Boolean) mtk0Var4.getValue()).booleanValue();
                    wh50 wh50Var3 = this.a;
                    if (booleanValue) {
                        aVar5.K(-1991460286);
                        boolean z6 = i3 == 4 ? z3 : false;
                        Object x5 = aVar5.x();
                        if (z6 || x5 == c0012a) {
                            x5 = new mcj0(mtk0Var2, 12);
                            aVar5.R(x5);
                        }
                        q630 a6 = rdu.a(aVar3, (izs) x5);
                        String str = (String) ((zak0) wh50Var3).getValue();
                        boolean n = aVar5.n(((Number) mtk0Var2.getValue()).floatValue());
                        Object x6 = aVar5.x();
                        if (n || x6 == c0012a) {
                            x6 = v4j0.a(v4j0Var2, l5g.c(14, l5g.b, ((Number) mtk0Var2.getValue()).floatValue() * 0.3f));
                            aVar5.R(x6);
                        }
                        frv0Var2 = frv0Var3;
                        aVar4 = aVar3;
                        i5 = 2;
                        z4 = z3;
                        long j2 = j;
                        wh50Var = wh50Var3;
                        yqv0.c(str, a6, j2, null, (v4j0) x6, 0, 0, null, 2, true, 0, 1, null, frv0Var2, aVar5, 905969664, 48, 5352);
                        aVar5 = aVar5;
                    } else {
                        wh50Var = wh50Var3;
                        aVar4 = aVar3;
                        frv0Var2 = frv0Var3;
                        z4 = z3;
                        i5 = 2;
                        aVar5.K(-2018020714);
                    }
                    aVar5.j();
                    androidx.compose.runtime.a aVar8 = aVar5;
                    yqv0.c((String) ((zak0) wh50Var).getValue(), mxr.b(i5, aVar4, z4), ((l5g) if2Var.d()).a, null, null, 0, 0, null, 2, true, 0, 1, null, frv0Var2, aVar8, 905969712, 48, 5368);
                    aVar2 = aVar8;
                    aVar2.G();
                    a aVar9 = (a) ((zak0) this.b).getValue();
                    if (aVar9 == null) {
                        aVar2.K(-1204058532);
                        aVar2.j();
                        mtk0Var3 = mtk0Var;
                        kVar2 = kVar;
                    } else {
                        aVar2.K(-1204058531);
                        int i10 = i2 << 3;
                        mtk0Var3 = mtk0Var;
                        kVar2 = kVar;
                        aVar9.a(mtk0Var3, kVar2, aVar2, (i10 & 896) | i4 | (i10 & 112));
                        s3q0 s3q0Var = s3q0.a;
                        aVar2.j();
                    }
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = aVar4;
                } else {
                    kVar2 = kVar;
                    aVar2 = M;
                    aVar2.h();
                    q630Var2 = q630Var;
                }
                androidx.compose.runtime.f s = aVar2.s();
                if (s != null) {
                    final k kVar3 = kVar2;
                    final mtk0 mtk0Var5 = mtk0Var3;
                    s.d = new wzs(mtk0Var5, kVar3, z, z2, q630Var2, i) { // from class: xsna.d7p0
                        public final /* synthetic */ mtk0 c;
                        public final /* synthetic */ com.vk.core.compose.component.topbar.k d;
                        public final /* synthetic */ boolean e;
                        public final /* synthetic */ boolean f;
                        public final /* synthetic */ q630 g;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(1);
                            TopBar$Middle.Text.Title.this.e(this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                }
            }
        }

        /* compiled from: TopBar.kt */
        public interface a {

            /* compiled from: TopBar.kt */
            /* renamed from: com.vk.core.compose.component.topbar.TopBar$Middle$Text$a$a, reason: collision with other inner class name */
            public static final class C0755a implements a {
                public final wh50 a;
                public final wh50 b;
                public final wh50 c;
                public final wh50 d;
                public final wh50 e;

                public C0755a(efj efjVar, ArrayList arrayList, k18 k18Var, z190 z190Var, SemanticsConfiguration semanticsConfiguration) {
                    this.a = androidx.compose.runtime.k.b(efjVar);
                    this.b = androidx.compose.runtime.k.b(new wow(arrayList));
                    this.c = androidx.compose.runtime.k.b(k18Var);
                    this.d = androidx.compose.runtime.k.b(z190Var);
                    this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
                }

                @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Text.a
                public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                    androidx.compose.runtime.a M = aVar.M(1212059956);
                    int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
                    if (M.t(i2 & 1, (i2 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1212059956, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Before.Avatar.Content (TopBar.kt:946)");
                        }
                        ldu0.a((efj) ((zak0) this.a).getValue(), 40, ((wow) ((zak0) this.b).getValue()).b, com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.e).getValue()), (k18) ((zak0) this.c).getValue(), false, (z190) ((zak0) this.d).getValue(), null, null, M, 48, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        M.h();
                    }
                    androidx.compose.runtime.f s = M.s();
                    if (s != null) {
                        s.d = new do7(this, q630Var, i, 11);
                    }
                }
            }

            /* compiled from: TopBar.kt */
            public static final class b implements a {
                public final wh50 a;
                public final wh50 b;
                public final wh50 c;
                public final wh50 d;

                /* compiled from: TopBar.kt */
                /* renamed from: com.vk.core.compose.component.topbar.TopBar$Middle$Text$a$b$a, reason: collision with other inner class name */
                public static final class C0756a {
                }

                public b(lg90 lg90Var, long j, String str, SemanticsConfiguration semanticsConfiguration) {
                    this.a = androidx.compose.runtime.k.b(lg90Var);
                    this.b = zy60.d(j);
                    this.c = androidx.compose.runtime.k.b(str);
                    this.d = androidx.compose.runtime.k.b(semanticsConfiguration);
                }

                @Override // com.vk.core.compose.component.topbar.TopBar.Middle.Text.a
                public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                    androidx.compose.runtime.a M = aVar.M(1202273044);
                    int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
                    if (M.t(i2 & 1, (i2 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1202273044, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Before.Icon.Content (TopBar.kt:902)");
                        }
                        pzu0.b((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.c).getValue(), com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.d).getValue()), ((l5g) ((zak0) this.b).getValue()).a, M, 8, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        M.h();
                    }
                    androidx.compose.runtime.f s = M.s();
                    if (s != null) {
                        s.d = new ed4(this, q630Var, i, 10);
                    }
                }
            }

            void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
        }

        /* compiled from: TopBar.kt */
        public static final class b {
            public static Text a(Title title, d dVar, a aVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar2, int i) {
                if ((i & 2) != 0) {
                    dVar = null;
                }
                if ((i & 4) != 0) {
                    aVar = null;
                }
                if ((i & 8) != 0) {
                    semanticsConfiguration = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-940126611, 24576, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Companion.invoke (TopBar.kt:1033)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new Text(title, dVar, aVar, semanticsConfiguration);
                    aVar2.R(x);
                }
                Text text = (Text) x;
                ((zak0) text.c).setValue(title);
                ((zak0) text.d).setValue(dVar);
                ((zak0) text.e).setValue(aVar);
                ((zak0) text.f).setValue(semanticsConfiguration);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return text;
            }
        }

        /* compiled from: TopBar.kt */
        public static final class c {
            public final wh50 a;

            public c(lg90 lg90Var) {
                this.a = androidx.compose.runtime.k.b(lg90Var);
            }

            public final void a(final int i, final long j, androidx.compose.runtime.a aVar, q630 q630Var) {
                final q630 q630Var2;
                androidx.compose.runtime.a M = aVar.M(-913518458);
                int i2 = (M.p(j) ? 4 : 2) | i | 48 | (M.J(this) ? 256 : 128);
                if (M.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-913518458, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Icon.Content (TopBar.kt:1007)");
                    }
                    lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
                    int i3 = 440 | ((i2 << 9) & 7168);
                    q630Var2 = q630.a.a;
                    pzu0.b(lg90Var, null, q630Var2, j, M, i3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                    q630Var2 = q630Var;
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new wzs(j, q630Var2, i) { // from class: xsna.c7p0
                        public final /* synthetic */ long c;
                        public final /* synthetic */ q630 d;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(1);
                            TopBar$Middle.Text.c.this.a(I, this.c, (androidx.compose.runtime.a) obj, this.d);
                            return s3q0.a;
                        }
                    };
                }
            }
        }

        /* compiled from: TopBar.kt */
        public static final class d {
            public final wh50 a;
            public final wh50 b;
            public final wh50 c;
            public final wh50 d;
            public final wh50 e;

            /* compiled from: TopBar.kt */
            public static final class a {
                public static d a(String str, int i, int i2, c cVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i3, int i4) {
                    String str2;
                    if ((i4 & 2) != 0) {
                        i = Integer.MAX_VALUE;
                    }
                    int i5 = i;
                    if ((i4 & 4) != 0) {
                        i2 = 1;
                    }
                    int i6 = i2;
                    c cVar2 = (i4 & 8) != 0 ? null : cVar;
                    SemanticsConfiguration semanticsConfiguration2 = (i4 & 16) != 0 ? null : semanticsConfiguration;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-930374389, i3, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Subtitle.Companion.invoke (TopBar.kt:872)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        str2 = str;
                        d dVar = new d(str2, i5, i6, cVar2, semanticsConfiguration2);
                        aVar.R(dVar);
                        x = dVar;
                    } else {
                        str2 = str;
                    }
                    d dVar2 = (d) x;
                    ((zak0) dVar2.a).setValue(str2);
                    ((zak0) dVar2.b).setValue(Integer.valueOf(i5));
                    ((zak0) dVar2.c).setValue(new bko0(i6));
                    ((zak0) dVar2.d).setValue(cVar2);
                    ((zak0) dVar2.e).setValue(semanticsConfiguration2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return dVar2;
                }
            }

            public d(String str, int i, int i2, c cVar, SemanticsConfiguration semanticsConfiguration) {
                this.a = androidx.compose.runtime.k.b(str);
                this.b = androidx.compose.runtime.k.b(Integer.valueOf(i));
                this.c = androidx.compose.runtime.k.b(new bko0(i2));
                this.d = androidx.compose.runtime.k.b(cVar);
                this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
            }

            public final void a(mtk0 mtk0Var, k kVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
                k kVar2;
                mtk0 mtk0Var2;
                androidx.compose.runtime.a aVar2;
                q630 q630Var2;
                com.vk.core.compose.component.topbar.b bVar;
                int i2;
                v4j0 v4j0Var;
                int i3;
                Object obj;
                int i4;
                a.C0011a.C0012a c0012a;
                l5g l5gVar;
                com.vk.core.compose.component.topbar.b bVar2;
                if2 if2Var;
                wh50 wh50Var;
                wh50 wh50Var2;
                q630.a aVar3;
                frv0 frv0Var;
                int i5;
                char c;
                d dVar = this;
                androidx.compose.runtime.a M = aVar.M(124056188);
                int i6 = i | (M.J(mtk0Var) ? 4 : 2) | (M.J(kVar) ? 32 : 16) | 384 | (M.J(dVar) ? 2048 : 1024);
                if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(124056188, i6, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Subtitle.Content (TopBar.kt:796)");
                    }
                    com.vk.core.compose.component.topbar.b z = znk0.z();
                    long h = z.h(k.b.a, M, 6);
                    long h2 = z.h(k.a.C0761a.a, M, 6);
                    Object x = M.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (x == c0012a2) {
                        x = lwj0.a(h);
                        M.R(x);
                    }
                    if2 if2Var2 = (if2) x;
                    M.K(-1812978635);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1812978635, 0, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.subtitleTextStyle (MilkshakeTopBarDefaults.kt:72)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var2 = wuv0Var.m0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(559436726, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-shadow> (VkTheme.kt:175)");
                    }
                    iyk0 iyk0Var = rrv0.d;
                    njv0 njv0Var = (njv0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    v4j0 b = njv0Var.b(M);
                    if (androidx.compose.runtime.b.d()) {
                        bVar = z;
                        i2 = i6;
                        androidx.compose.runtime.b.f(559436726, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-shadow> (VkTheme.kt:175)");
                    } else {
                        bVar = z;
                        i2 = i6;
                    }
                    njv0 njv0Var2 = (njv0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    v4j0 a2 = njv0Var2.a(M);
                    Object x2 = M.x();
                    if (x2 == c0012a2) {
                        x2 = qf2.a(b.c);
                        M.R(x2);
                    }
                    if2 if2Var3 = (if2) x2;
                    Object value = mtk0Var.getValue();
                    l5g l5gVar2 = new l5g(h);
                    l5g l5gVar3 = new l5g(h2);
                    int i7 = i2 & 14;
                    boolean y = M.y(if2Var2) | M.p(h) | M.p(h2) | (i7 == 4) | M.y(if2Var3) | M.J(b) | M.J(a2);
                    Object x3 = M.x();
                    if (y || x3 == c0012a2) {
                        v4j0Var = a2;
                        i3 = i2;
                        obj = value;
                        i4 = i7;
                        c0012a = c0012a2;
                        l5gVar = l5gVar3;
                        bVar2 = bVar;
                        h hVar = new h(if2Var2, h, h2, mtk0Var, if2Var3, b, v4j0Var, null);
                        if2Var = if2Var2;
                        mtk0Var2 = mtk0Var;
                        M.R(hVar);
                        x3 = hVar;
                    } else {
                        v4j0Var = a2;
                        if2Var = if2Var2;
                        c0012a = c0012a2;
                        l5gVar = l5gVar3;
                        bVar2 = bVar;
                        i3 = i2;
                        mtk0Var2 = mtk0Var;
                        obj = value;
                        i4 = i7;
                    }
                    androidx.compose.runtime.a aVar4 = M;
                    bap.e(obj, l5gVar2, l5gVar, (wzs) x3, aVar4, 0);
                    boolean J = aVar4.J(bVar2) | ((i3 & 112) == 32) | (i4 == 4);
                    Object x4 = aVar4.x();
                    int i8 = 3;
                    if (J || x4 == c0012a) {
                        x4 = bbk0.b(new a5f(bVar2, kVar, mtk0Var2, i8));
                        aVar4.R(x4);
                    }
                    mtk0 mtk0Var3 = (mtk0) x4;
                    dt1.a.getClass();
                    ty6.b bVar3 = dt1.a.l;
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    znk0.z().getClass();
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.q), bVar3, aVar4, 48);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630.a aVar5 = q630.a.a;
                    q630 c2 = qri.c(aVar4, aVar5);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar6);
                    } else {
                        aVar4.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar4, a3, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar4, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar4 = cri.a.g;
                    k9q0.w(aVar4, valueOf, bVar4);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar4, c2678a);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(aVar4, c2, dVar2);
                    q630 b2 = com.vk.core.compose.component.semantics.b.b(aVar5, (SemanticsConfiguration) ((zak0) this.e).getValue());
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                    v4j0 v4j0Var2 = v4j0Var;
                    sy90 D2 = aVar4.D();
                    q630 c3 = qri.c(aVar4, b2);
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar6);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, d, cVar);
                    k9q0.w(aVar4, D2, eVar);
                    ur.d(hashCode2, aVar4, bVar4, aVar4, c2678a);
                    k9q0.w(aVar4, c3, dVar2);
                    boolean booleanValue = ((Boolean) mtk0Var3.getValue()).booleanValue();
                    wh50 wh50Var3 = this.a;
                    wh50 wh50Var4 = this.c;
                    wh50 wh50Var5 = this.b;
                    if (booleanValue) {
                        aVar4.K(1757323784);
                        int intValue = ((Number) ((zak0) wh50Var5).getValue()).intValue();
                        int i9 = ((bko0) ((zak0) wh50Var4).getValue()).a;
                        boolean z2 = i4 == 4;
                        Object x5 = aVar4.x();
                        if (z2 || x5 == c0012a) {
                            x5 = new wug0(mtk0Var2, 19);
                            aVar4.R(x5);
                        }
                        q630 a4 = rdu.a(aVar5, (izs) x5);
                        String str = (String) ((zak0) wh50Var3).getValue();
                        long j = ((l5g) if2Var.d()).a;
                        boolean n = aVar4.n(((Number) mtk0Var2.getValue()).floatValue());
                        Object x6 = aVar4.x();
                        if (n || x6 == c0012a) {
                            i5 = intValue;
                            c = 14;
                            x6 = v4j0.a(v4j0Var2, l5g.c(14, l5g.b, ((Number) mtk0Var2.getValue()).floatValue() * 0.3f));
                            aVar4.R(x6);
                        } else {
                            i5 = intValue;
                            c = 14;
                        }
                        wh50Var2 = wh50Var5;
                        frv0Var = frv0Var2;
                        aVar3 = aVar5;
                        dVar = this;
                        wh50Var = wh50Var4;
                        yqv0.c(str, a4, j, null, (v4j0) x6, 0, 0, null, i9, false, 0, i5, null, frv0Var, aVar4, 0, 0, 5864);
                        aVar4 = aVar4;
                    } else {
                        wh50Var = wh50Var4;
                        wh50Var2 = wh50Var5;
                        aVar3 = aVar5;
                        dVar = this;
                        frv0Var = frv0Var2;
                        aVar4.K(1721931952);
                    }
                    aVar4.j();
                    androidx.compose.runtime.a aVar7 = aVar4;
                    yqv0.c((String) ((zak0) wh50Var3).getValue(), null, ((l5g) if2Var.d()).a, null, null, 0, 0, null, ((bko0) ((zak0) wh50Var).getValue()).a, false, 0, ((Number) ((zak0) wh50Var2).getValue()).intValue(), null, frv0Var, aVar7, 0, 0, 5882);
                    aVar2 = aVar7;
                    aVar2.G();
                    com.vk.core.compose.component.topbar.b z3 = znk0.z();
                    float floatValue = ((Number) mtk0Var2.getValue()).floatValue();
                    int i10 = (i3 >> 3) & 14;
                    z3.getClass();
                    aVar2.K(2058444052);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2058444052, i10, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.subtitleIconColor (MilkshakeTopBarDefaults.kt:83)");
                    }
                    kVar2 = kVar;
                    long d2 = z3.d(kVar2, floatValue, aVar2, i10);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                    c cVar2 = (c) ((zak0) dVar.d).getValue();
                    if (cVar2 == null) {
                        aVar2.K(1823475031);
                        aVar2.j();
                    } else {
                        aVar2.K(-1188104214);
                        cVar2.a(0, d2, aVar2, null);
                        aVar2.j();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var2 = aVar3;
                } else {
                    kVar2 = kVar;
                    mtk0Var2 = mtk0Var;
                    aVar2 = M;
                    aVar2.h();
                    q630Var2 = q630Var;
                }
                androidx.compose.runtime.f s = aVar2.s();
                if (s != null) {
                    s.d = new whx(dVar, mtk0Var2, kVar2, q630Var2, i);
                }
            }
        }

        public Text(Title title, d dVar, a aVar, SemanticsConfiguration semanticsConfiguration) {
            this.c = androidx.compose.runtime.k.b(title);
            this.d = androidx.compose.runtime.k.b(dVar);
            this.e = androidx.compose.runtime.k.b(aVar);
            this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Middle
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            q630 q630Var2;
            cri.a.d dVar;
            wh50 wh50Var;
            androidx.compose.runtime.a M = aVar.M(421405562);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(421405562, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Content (TopBar.kt:550)");
                }
                dt1.a.getClass();
                ty6.b bVar = dt1.a.l;
                a.l lVar = androidx.compose.foundation.layout.a.a;
                znk0.z().getClass();
                float f = 0;
                a.j g = androidx.compose.foundation.layout.a.g(f);
                M.K(1243829059);
                wh50 wh50Var2 = this.d;
                d dVar2 = (d) ((zak0) wh50Var2).getValue();
                q630.a aVar3 = q630.a.a;
                if (dVar2 == null) {
                    znk0.z().getClass();
                    q630Var2 = s200.C(aVar3, new u890(f, f, f, f));
                } else {
                    q630Var2 = aVar3;
                }
                M.j();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, bVar, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, q630Var2);
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
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, a2, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar2 = cri.a.g;
                k9q0.w(M, valueOf, bVar2);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar3 = cri.a.d;
                k9q0.w(M, c2, dVar3);
                wh50 wh50Var3 = this.e;
                a aVar5 = (a) ((zak0) wh50Var3).getValue();
                if (aVar5 == null) {
                    M.K(2009229529);
                    M.j();
                    wh50Var = wh50Var3;
                    dVar = dVar3;
                } else {
                    M.K(341908520);
                    znk0.z().getClass();
                    dVar = dVar3;
                    wh50Var = wh50Var3;
                    aVar5.a(s200.H(aVar3, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), M, 0);
                    M.j();
                }
                com.vk.core.compose.component.topbar.b z = znk0.z();
                z.getClass();
                float f2 = 9;
                float f3 = kqu0.t;
                q630 b2 = com.vk.core.compose.component.semantics.b.b(s200.C(q630Var, new u890(f3, f2, f3, f2)), (SemanticsConfiguration) ((zak0) this.f).getValue());
                znk0.z().getClass();
                androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.q), dt1.a.n, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c3 = qri.c(M, b2);
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
                k9q0.w(M, a3, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar2, M, c2678a);
                k9q0.w(M, c3, dVar);
                Title title = (Title) ((zak0) this.c).getValue();
                wh50 wh50Var4 = this.b;
                k kVar = (k) ((zak0) wh50Var4).getValue();
                boolean z2 = ((d) ((zak0) wh50Var2).getValue()) != null;
                boolean z3 = ((a) ((zak0) wh50Var).getValue()) != null;
                aVar2 = M;
                wh50<Float> wh50Var5 = this.a;
                title.e(wh50Var5, kVar, z2, z3, null, aVar2, 0);
                d dVar4 = (d) ((zak0) wh50Var2).getValue();
                if (dVar4 == null) {
                    aVar2.K(-505491158);
                } else {
                    aVar2.K(1507714487);
                    dVar4.a(wh50Var5, (k) ((zak0) wh50Var4).getValue(), null, aVar2, 0);
                }
                aVar2.j();
                if (kr.f(aVar2)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new bo7(this, q630Var, i, 10);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class a extends e7p0 {
        public static final a c = new a();

        @Override // com.vk.core.compose.component.topbar.TopBar$Middle
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            androidx.compose.runtime.a M = aVar.M(-1644637980);
            int i2 = i & 1;
            if (M.t(i2, i2 != 0)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1644637980, i, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Empty.Content (TopBar.kt:533)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new g4o(this, q630Var, i, 3);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class b extends TopBar$Middle {
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

        /* compiled from: TopBar.kt */
        public static final class a {
            public static b a(String str, tho0 tho0Var, izs izsVar, tlh0.b bVar, tlh0 tlh0Var, gzs gzsVar, izs izsVar2, gzs gzsVar2, SemanticsConfiguration semanticsConfiguration, boolean z, izs izsVar3, boolean z2, androidx.compose.runtime.a aVar, int i, int i2, int i3) {
                tlh0.b bVar2 = (i3 & 8) != 0 ? null : bVar;
                tlh0 tlh0Var2 = (i3 & 16) != 0 ? null : tlh0Var;
                gzs gzsVar3 = (i3 & 32) != 0 ? null : gzsVar;
                izs izsVar4 = (i3 & 64) != 0 ? null : izsVar2;
                gzs gzsVar4 = (i3 & 128) != 0 ? null : gzsVar2;
                SemanticsConfiguration semanticsConfiguration2 = (i3 & 256) != 0 ? null : semanticsConfiguration;
                boolean z3 = (i3 & 512) != 0 ? false : z;
                izs izsVar5 = (i3 & 1024) != 0 ? null : izsVar3;
                boolean z4 = (i3 & 2048) != 0 ? false : z2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1426914205, i, i2, "com.vk.core.compose.component.topbar.TopBar.Middle.Search.Companion.invoke (TopBar.kt:1110)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    b bVar3 = new b(str, tho0Var, izsVar, bVar2, tlh0Var2, gzsVar4, gzsVar3, izsVar4, semanticsConfiguration2, z3, izsVar5, z4);
                    aVar.R(bVar3);
                    x = bVar3;
                }
                b bVar4 = (b) x;
                ((zak0) bVar4.c).setValue(str);
                ((zak0) bVar4.d).setValue(tho0Var);
                ((zak0) bVar4.e).setValue(izsVar);
                ((zak0) bVar4.j).setValue(tlh0Var2);
                ((zak0) bVar4.f).setValue(gzsVar3);
                ((zak0) bVar4.h).setValue(gzsVar4);
                ((zak0) bVar4.k).setValue(semanticsConfiguration2);
                ((zak0) bVar4.l).setValue(Boolean.valueOf(z3));
                ((zak0) bVar4.n).setValue(Boolean.valueOf(z4));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return bVar4;
            }
        }

        public b() {
            throw null;
        }

        public b(String str, tho0 tho0Var, izs izsVar, tlh0.b bVar, tlh0 tlh0Var, gzs gzsVar, gzs gzsVar2, izs izsVar2, SemanticsConfiguration semanticsConfiguration, boolean z, izs izsVar3, boolean z2) {
            this.c = androidx.compose.runtime.k.b(str);
            this.d = androidx.compose.runtime.k.b(tho0Var);
            this.e = androidx.compose.runtime.k.b(izsVar);
            this.f = androidx.compose.runtime.k.b(gzsVar2);
            this.g = androidx.compose.runtime.k.b(izsVar2);
            this.h = androidx.compose.runtime.k.b(gzsVar);
            this.i = androidx.compose.runtime.k.b(bVar);
            this.j = androidx.compose.runtime.k.b(tlh0Var);
            this.k = androidx.compose.runtime.k.b(semanticsConfiguration);
            this.l = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.m = androidx.compose.runtime.k.b(izsVar3);
            this.n = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Middle
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-637367179);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-637367179, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Search.Content (TopBar.kt:1071)");
                }
                znk0.z().getClass();
                q630 F = s200.F(kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new xim0(this, 2);
                    M.R(x);
                }
                q630 u = fvr.u(F, (izs) x);
                String str = (String) ((zak0) this.c).getValue();
                tho0 tho0Var = (tho0) ((zak0) this.d).getValue();
                izs izsVar = (izs) ((zak0) this.e).getValue();
                gzs gzsVar = (gzs) ((zak0) this.f).getValue();
                izs izsVar2 = (izs) ((zak0) this.g).getValue();
                tlh0.b bVar = (tlh0.b) ((zak0) this.i).getValue();
                tlh0 tlh0Var = (tlh0) ((zak0) this.j).getValue();
                SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.k).getValue();
                boolean booleanValue = ((Boolean) ((zak0) this.l).getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) ((zak0) this.n).getValue()).booleanValue();
                boolean z2 = i3 == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new dei0(this, 16);
                    M.R(x2);
                }
                aVar2 = M;
                fiv0.a(str, tho0Var, izsVar, u, null, bVar, tlh0Var, null, (gzs) x2, izsVar2, gzsVar, false, semanticsConfiguration, booleanValue, booleanValue2, aVar2, 0, 0, 2192);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.d = new gly(this, q630Var, i, 2);
            }
        }
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
