package com.vk.catalog2.common.ui.mvp.holder.video.assistant;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.c;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.k0;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.cell.content.p;
import com.vk.core.compose.component.cell.content.x;
import com.vk.core.compose.component.cell.content.y0;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a5x;
import xsna.ac1;
import xsna.alb0;
import xsna.bc1;
import xsna.bhu0;
import xsna.cc1;
import xsna.cri;
import xsna.d370;
import xsna.dc1;
import xsna.dt1;
import xsna.dy0;
import xsna.e3;
import xsna.ec1;
import xsna.f9t;
import xsna.fc1;
import xsna.frv0;
import xsna.gzs;
import xsna.iyk0;
import xsna.izs;
import xsna.k9q0;
import xsna.kqu0;
import xsna.lg90;
import xsna.mku0;
import xsna.n34;
import xsna.or;
import xsna.pg90;
import xsna.q630;
import xsna.qg;
import xsna.qri;
import xsna.qzu0;
import xsna.rg50;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.us2;
import xsna.wb1;
import xsna.wiu0;
import xsna.wlb0;
import xsna.wuv0;
import xsna.wzs;
import xsna.xp2;
import xsna.xpy;
import xsna.ylu0;
import xsna.yqv0;

/* compiled from: AiAssistantCard.kt */
/* loaded from: classes16.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, String str, lg90 lg90Var, boolean z, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a aVar2;
        final lg90 lg90Var2;
        final String str3;
        final boolean z3;
        final gzs<s3q0> gzsVar3;
        f s;
        lg90 lg90Var3;
        boolean z4;
        gzs<s3q0> gzsVar4;
        androidx.compose.runtime.a M = aVar.M(96346715);
        if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= M.J(str2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= M.l(z2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    gzsVar2 = gzsVar;
                    i3 |= M.y(gzsVar2) ? 16384 : 8192;
                    if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                        aVar2 = M;
                        aVar2.h();
                        lg90Var2 = lg90Var;
                        str3 = str2;
                        z3 = z2;
                        gzsVar3 = gzsVar2;
                    } else {
                        String str4 = i7 != 0 ? null : str2;
                        if (i4 != 0) {
                            z4 = false;
                            lg90Var3 = null;
                        } else {
                            lg90Var3 = lg90Var;
                            z4 = false;
                        }
                        boolean z5 = i5 != 0 ? z4 : z2;
                        if (i6 != 0) {
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = new wb1(0);
                                M.R(x);
                            }
                            gzsVar4 = (gzs) x;
                        } else {
                            gzsVar4 = gzsVar2;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(96346715, i3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantActionButton (AiAssistantCard.kt:428)");
                        }
                        int i8 = i3 << 12;
                        aVar2 = M;
                        bhu0.e(gzsVar4, ButtonSize.Medium, ButtonStyle.Secondary, ButtonAppearance.Neutral, q630Var, null, z5, false, lg90Var3, null, null, str4, null, null, null, null, false, null, null, null, aVar2, ((i3 >> 12) & 14) | X2.b.f | (57344 & i8) | (i8 & 29360128) | 1073741824 | ((i3 << 21) & 1879048192), (i3 << 3) & 896, 0, 4189536);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        gzsVar3 = gzsVar4;
                        z3 = z5;
                        lg90Var2 = lg90Var3;
                        str3 = str4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.xb1
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                com.vk.catalog2.common.ui.mvp.holder.video.assistant.b.a(q630.this, str3, lg90Var2, z3, gzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                gzsVar2 = gzsVar;
                if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            gzsVar2 = gzsVar;
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        gzsVar2 = gzsVar;
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void b(c cVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-510571639);
        int i2 = (M.J(cVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-510571639, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCard (AiAssistantCard.kt:76)");
            }
            q630 a = xp2.a(s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 7), null, 3);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            if (cVar instanceof c.d) {
                ((c.d) cVar).getClass();
            }
            e((i2 >> 3) & 14, M, izsVar, false);
            if (cVar instanceof c.C0512c) {
                M.K(1825970007);
                f(0, M);
                M.j();
            } else {
                if (!(cVar instanceof c.b)) {
                    throw alb0.c(890184299, M);
                }
                M.K(1826081204);
                d((c.b) cVar, izsVar, M, i2 & 112);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new e3(cVar, izsVar, i, 1);
        }
    }

    public static final void c(c.a aVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-820752977);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-820752977, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardCommonContent (AiAssistantCard.kt:204)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            M.W(1530382568, Integer.valueOf(rg50Var.getIntValue()));
            aVar.getClass();
            M.K(198362758);
            q630 E = s200.E(txj0.f(q630.a.a, 1.0f), kqu0.w, kqu0.t);
            String N = d370.N(R.string.video_ai_assistant_card_button, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new dy0(1, izsVar, rg50Var);
                M.R(x2);
            }
            a(E, N, null, false, (gzs) x2, M, 0, 12);
            M.j();
            M.a0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new qg(aVar, izsVar, i, 1);
        }
    }

    public static final void d(c.b bVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1664967685);
        int i3 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1664967685, i3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardContent (AiAssistantCard.kt:167)");
            }
            us2 text = bVar.getText();
            if (text == null || text.c.length() == 0) {
                i2 = i3;
                M.K(-1531478403);
            } else {
                M.K(-1524784077);
                float f = 16;
                q630 G = s200.G(q630.a.a, f, 2, f, 8);
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
                i2 = i3;
                yqv0.d(text, G, ylu0Var.getText().m, 0, null, 0, false, 0, null, null, frv0Var, M, 0, 0, 8184);
                M = M;
            }
            M.j();
            if (bVar instanceof c.a) {
                M.K(-1524387246);
                c((c.a) bVar, izsVar, M, i2 & 112);
                M.j();
            } else {
                if (!(bVar instanceof c.d)) {
                    throw alb0.c(-1988838404, M);
                }
                M.K(-1524195821);
                g((c.d) bVar, izsVar, M, i2 & 112);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new bc1(bVar, izsVar, i, 0);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-901067848);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-901067848, i3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardHeader (AiAssistantCard.kt:108)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-715293476, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-StarsOutline24> (VkSdkIcons.kt:3444)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_stars_outline_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            x a2 = com.vk.core.compose.component.cell.content.f.a(a, Cell$Left.Main.Size.Small, ylu0Var.getIcon().j, null, null, M, 196664, 24);
            k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.video_ai_assistant_card_title, 0, M), null, null, 1, null, null, M, 12610560, 102), null, null, null, M, 196608, 30);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2122448660, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ChevronRightOutline28> (VkIcons.kt:1452)");
            }
            lg90 b = or.b(M, -640320951, R.drawable.vk_icon_chevron_right_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getIcon().b;
            boolean z2 = (i3 & 14) == 4;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new cc1(izsVar, 0);
                M.R(x);
            }
            y0 a4 = o.c.a(null, p.a(b, j, 0L, null, (gzs) x, null, M, 1572872, 44), null, null, null, M, 61);
            if (!z) {
                a4 = null;
            }
            wiu0.b(null, false, a2, a3, a4, null, null, M, 0, 99);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new dc1(i, 0, izsVar, z);
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-162096662);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-162096662, i, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardLoading (AiAssistantCard.kt:133)");
            }
            q630.a aVar3 = q630.a.a;
            q630 a = qri.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar3, 1.0f), 32)), a5x.a, new ec1(0));
            dt1.a.getClass();
            k a2 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            float f = 2;
            mku0.a(f, 390, 24, wlb0.h(M).getIcon().l, M, s200.D(txj0.q(aVar3, 24), f));
            f9t.e(txj0.v(aVar3, 8), M, 6);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            aVar2 = M;
            yqv0.c(d370.N(R.string.video_ai_assistant_card_generation_text, 0, M), s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, new xpy(1.0f, true)), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).T, aVar2, 0, 0, 8184);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new ac1(i);
        }
    }

    public static final void g(c.d dVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-583737309);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-583737309, i2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardMusicContent (AiAssistantCard.kt:255)");
            }
            dVar.getClass();
            M.K(194954335);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new fc1(dVar, izsVar, i, 0);
        }
    }
}
