package com.vk.profile.community.impl.ui.trust_mark;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.h1;
import com.vk.core.compose.component.cell.content.k;
import com.vk.core.compose.component.cell.content.k0;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.cell.content.t;
import com.vk.core.compose.component.cell.content.u0;
import com.vk.core.compose.component.cell.content.v;
import com.vk.core.compose.component.cell.content.x;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.group.header.g;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.movika.sdk.base.ui.i;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ahn;
import xsna.aqm0;
import xsna.bhu0;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.d6;
import xsna.de1;
import xsna.dp0;
import xsna.dt1;
import xsna.dz5;
import xsna.e48;
import xsna.efj;
import xsna.fwu0;
import xsna.gp;
import xsna.grb;
import xsna.gzs;
import xsna.h2v0;
import xsna.hr80;
import xsna.i9z;
import xsna.ijv0;
import xsna.ikg0;
import xsna.iyk0;
import xsna.izs;
import xsna.j5g;
import xsna.ja8;
import xsna.k9q0;
import xsna.klv0;
import xsna.kqu0;
import xsna.kr;
import xsna.l1e;
import xsna.l4;
import xsna.l5g;
import xsna.lg90;
import xsna.m4i;
import xsna.muv0;
import xsna.n34;
import xsna.o9d;
import xsna.oj;
import xsna.or;
import xsna.p490;
import xsna.p9;
import xsna.pg90;
import xsna.phw;
import xsna.pzu0;
import xsna.q1h;
import xsna.q630;
import xsna.qri;
import xsna.qzu0;
import xsna.rac;
import xsna.rek0;
import xsna.rl3;
import xsna.rrv0;
import xsna.rs0;
import xsna.s200;
import xsna.s3q0;
import xsna.s8u0;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ty6;
import xsna.uh3;
import xsna.ur;
import xsna.vi1;
import xsna.vog0;
import xsna.wi1;
import xsna.wiu0;
import xsna.wlb0;
import xsna.wow;
import xsna.wzs;
import xsna.x76;
import xsna.xpv;
import xsna.xpy;
import xsna.xzs;
import xsna.ylu0;
import xsna.yqv0;
import xsna.yu50;

/* compiled from: CommunityTrustMarksScreen.kt */
/* loaded from: classes5.dex */
public final class e {

    /* compiled from: CommunityTrustMarksScreen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityTrustMarksArgs.TrustMarkData.Type.values().length];
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.LINKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.DOCS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        androidx.compose.runtime.a aVar2;
        f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> o9dVar;
        androidx.compose.runtime.a M = aVar.M(627570855);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(627570855, i2, -1, "com.vk.profile.community.impl.ui.trust_mark.ActionButtons (CommunityTrustMarksScreen.kt:387)");
            }
            if (list.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    o9dVar = new d6(list, izsVar, i, 3);
                    s.d = o9dVar;
                }
                return;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630.a aVar4 = q630.a.a;
            q630 m = hr80.m(aVar4, j, aVar3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f = txj0.f(aVar4, 1.0f);
            float f2 = kqu0.b;
            float f3 = kqu0.v;
            q630 E = s200.E(f, f2, f3);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(f3, dt1.a.k), dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            CommunityTrustMarksArgs.ActionButton actionButton = (CommunityTrustMarksArgs.ActionButton) j5g.b0(0, new wow(list));
            if (actionButton == null) {
                M.K(-2018753968);
                M.j();
                aVar2 = M;
            } else {
                M.K(-2018753967);
                String N = d370.N(actionButton.c, 0, M);
                ButtonSize buttonSize = ButtonSize.Large;
                ButtonStyle buttonStyle = ButtonStyle.Primary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                q630 E2 = ahn.E(txj0.f(aVar4, 1.0f), String.format("TRUST_MARK_ACTION_BUTTON_%s", Arrays.copyOf(new Object[]{actionButton.b}, 1)));
                int i3 = i2 & 112;
                boolean y = (i3 == 32) | M.y(actionButton);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (y || x == c0012a) {
                    x = new i(12, izsVar, actionButton);
                    M.R(x);
                }
                boolean z = true;
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E2, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
                CommunityTrustMarksArgs.ActionButton actionButton2 = (CommunityTrustMarksArgs.ActionButton) j5g.b0(1, new wow(list));
                if (actionButton2 == null) {
                    M.K(-1448331079);
                    M.j();
                    aVar2 = M;
                } else {
                    M.K(-1448331078);
                    String N2 = d370.N(actionButton2.c, 0, M);
                    ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                    q630 E3 = ahn.E(txj0.f(aVar4, 1.0f), String.format("TRUST_MARK_ACTION_BUTTON_%s", Arrays.copyOf(new Object[]{actionButton2.b}, 1)));
                    if (i3 != 32) {
                        z = false;
                    }
                    boolean y2 = z | M.y(actionButton2);
                    Object x2 = M.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new dp0(6, izsVar, actionButton2);
                        M.R(x2);
                    }
                    aVar2 = M;
                    bhu0.e((gzs) x2, buttonSize, buttonStyle2, buttonAppearance, E3, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
                    s3q0 s3q0Var = s3q0.a;
                    aVar2.j();
                }
                s3q0 s3q0Var2 = s3q0.a;
                aVar2.j();
            }
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            o9dVar = new o9d(list, izsVar, i, 2);
            s.d = o9dVar;
        }
    }

    public static final void b(List list, CommunityTrustMarksArgs.AdminButtons adminButtons, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.a aVar3;
        Iterator it;
        q630.a aVar4;
        CommunityTrustMarksArgs.TrustMarkData trustMarkData;
        int i6;
        int i7;
        x xVar;
        h1 h1Var;
        char c;
        androidx.compose.runtime.a M = aVar.M(-291455340);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(adminButtons) : M.y(adminButtons) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i8 = 1;
        int i9 = 0;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            int i10 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-291455340, i2, -1, "com.vk.profile.community.impl.ui.trust_mark.AdminGroup (CommunityTrustMarksScreen.kt:344)");
            }
            if (list.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f s = M.s();
                if (s != null) {
                    s.d = new de1(list, adminButtons, izsVar, i);
                    return;
                }
                return;
            }
            float f = kqu0.b;
            float f2 = kqu0.x;
            q630.a aVar5 = q630.a.a;
            q630 H = s200.H(aVar5, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, 2);
            q630.a aVar6 = aVar5;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f3 = kqu0.t;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(f3, dt1.a.k), dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a3 = yu50.a(M, c2, cri.a.d, -1177391470, list);
            while (a3.hasNext()) {
                CommunityTrustMarksArgs.TrustMarkData trustMarkData2 = (CommunityTrustMarksArgs.TrustMarkData) a3.next();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i9, i10, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(aVar6, ylu0Var.getBackground().B, vog0.b(kqu0.f));
                CommunityTrustMarksArgs.TrustMarkData.Type type = trustMarkData2.b;
                Integer num = trustMarkData2.i;
                q630 E = ahn.E(m, String.format("TRUST_MARK_ADMIN_BUTTON_%s", Arrays.copyOf(new Object[]{type}, i8)));
                if (num == null) {
                    M.K(-1351120665);
                    M.j();
                    it = a3;
                    aVar4 = aVar6;
                    trustMarkData = trustMarkData2;
                    i5 = i9;
                    xVar = null;
                    i6 = 256;
                    i7 = 1;
                    i4 = -1;
                    aVar3 = M;
                } else {
                    M.K(-1351120664);
                    lg90 a4 = pg90.a(num.intValue(), i9, M);
                    if (androidx.compose.runtime.b.d()) {
                        i3 = -1;
                        androidx.compose.runtime.b.f(1040687336, i9, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        i3 = -1;
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    i4 = i3;
                    i5 = 0;
                    aVar3 = M;
                    it = a3;
                    aVar4 = aVar6;
                    trustMarkData = trustMarkData2;
                    i6 = 256;
                    i7 = 1;
                    x a5 = com.vk.core.compose.component.cell.content.f.a(a4, Cell$Left.Main.Size.Medium, ylu0Var2.getIcon().j, null, null, aVar3, 196664, 24);
                    aVar3.j();
                    xVar = a5;
                }
                h1 a6 = Cell$Middle.d.b.a(trustMarkData.c, null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                String str = trustMarkData.j;
                if (str == null) {
                    aVar3.K(-1350700677);
                    aVar3.j();
                    h1Var = null;
                } else {
                    aVar3.K(-1350700676);
                    androidx.compose.runtime.a aVar8 = aVar3;
                    h1 b = Cell$Middle.c.b.b(str, 0, null, null, null, aVar8, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    aVar3 = aVar8;
                    aVar3.j();
                    h1Var = b;
                }
                androidx.compose.runtime.a aVar9 = aVar3;
                k0 a7 = Cell$Middle.a.a(a6, h1Var, null, null, aVar9, 196608, 28);
                u0 a8 = o.b.a.a(null, null, 0L, false, aVar9, 196608, 31);
                int i11 = ((i2 & 896) == i6 ? i7 : i5) | (aVar9.y(trustMarkData) ? 1 : 0) | (((i2 & 112) == 32 || ((i2 & 64) != 0 && aVar9.y(adminButtons))) ? i7 : i5);
                Object x = aVar9.x();
                if (i11 != 0 || x == a.C0011a.a) {
                    c = 4;
                    x = new grb(izsVar, trustMarkData, adminButtons, 4);
                    aVar9.R(x);
                } else {
                    c = 4;
                }
                wiu0.b(E, false, xVar, a7, a8, (gzs) x, null, aVar9, 0, 66);
                a3 = it;
                M = aVar9;
                aVar6 = aVar4;
                i9 = i5;
                i8 = i7;
                i10 = i4;
            }
            aVar2 = M;
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new q1h(i, 1, list, adminButtons, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [xsna.q630] */
    public static final void c(CommunityTrustMarksArgs communityTrustMarksArgs, izs<? super c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a aVar2;
        q630.a aVar3;
        List list;
        q630.a aVar4;
        int i4;
        androidx.compose.runtime.a aVar5;
        androidx.compose.runtime.a M = aVar.M(-1302096998);
        int i5 = i | (M.J(communityTrustMarksArgs) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1302096998, i5, -1, "com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarkScreen (CommunityTrustMarksScreen.kt:71)");
            }
            q630.a aVar6 = q630.a.a;
            q630 d = txj0.d(aVar6, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar7 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar7, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar8 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar8);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            TopBar$Middle.a aVar9 = TopBar$Middle.a.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.community_trust_marks_modal_close_button, 0, M);
            int i6 = i5 & 112;
            boolean z = i6 == 32;
            q630.a aVar10 = aVar6;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new m4i(izsVar, 0);
                M.R(x);
            }
            muv0.h(aVar9, null, null, null, null, null, d.a.a(d.c.C0760d.a.a(b, N, (gzs) x, null, null, null, M, 1572872, 56), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 0, 8126);
            androidx.compose.runtime.a aVar11 = M;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            if (androidx.compose.runtime.b.d()) {
                i3 = i6;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i3 = i6;
            }
            ylu0 ylu0Var = (ylu0) aVar11.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D2 = p490.D(n34.t(hr80.m(xpyVar, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), dz5.I(6, 0, aVar11, true), null), p490.x(aVar11), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar7, aVar11, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar11));
            sy90 D3 = aVar11.D();
            q630 c2 = qri.c(aVar11, D2);
            if (aVar11.N() == null) {
                n34.r();
                throw null;
            }
            aVar11.H();
            if (aVar11.L()) {
                aVar11.I(aVar8);
            } else {
                aVar11.f();
            }
            k9q0.w(aVar11, a3, cVar);
            k9q0.w(aVar11, D3, eVar);
            ur.d(hashCode2, aVar11, bVar, aVar11, c2678a);
            k9q0.w(aVar11, c2, dVar);
            e(communityTrustMarksArgs.c, aVar11, 0);
            aVar11.K(-2061094500);
            Iterator it = communityTrustMarksArgs.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                CommunityTrustMarksArgs.GroupInfo groupInfo = (CommunityTrustMarksArgs.GroupInfo) entry.getKey();
                List list2 = (List) entry.getValue();
                if (groupInfo.c) {
                    aVar11.K(-66701344);
                    b(list2, communityTrustMarksArgs.e, izsVar, aVar11, (i5 << 3) & 896);
                    aVar11.j();
                    s3q0 s3q0Var = s3q0.a;
                    aVar5 = aVar11;
                    i4 = i3;
                    aVar3 = aVar10;
                } else {
                    aVar11.K(-66458583);
                    String str = groupInfo.b;
                    if (str == null) {
                        aVar11.K(-66424546);
                        aVar11.j();
                        aVar5 = aVar11;
                        i4 = i3;
                        aVar3 = aVar10;
                    } else {
                        aVar11.K(-66424545);
                        if (groupInfo.f) {
                            aVar2 = aVar11;
                            aVar3 = aVar10;
                            list = list2;
                            aVar4 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, 7);
                        } else {
                            aVar2 = aVar11;
                            aVar3 = aVar10;
                            list = list2;
                            aVar4 = aVar3;
                        }
                        i4 = i3;
                        aVar5 = aVar2;
                        d(str, list, aVar4, groupInfo.h, groupInfo.g, groupInfo.d, groupInfo.e, izsVar, aVar5, 29360128 & (i5 << 18));
                        s3q0 s3q0Var2 = s3q0.a;
                        aVar5.j();
                    }
                    aVar5.j();
                }
                aVar10 = aVar3;
                i3 = i4;
                aVar11 = aVar5;
            }
            M = aVar11;
            i2 = 2;
            M.j();
            M.G();
            a(i3, M, rl3.I(new CommunityTrustMarksArgs.ActionButton[]{communityTrustMarksArgs.f, communityTrustMarksArgs.g, communityTrustMarksArgs.h}), izsVar);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 2;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new p9(communityTrustMarksArgs, izsVar, i, i2);
        }
    }

    public static final void d(final String str, final List list, final q630 q630Var, final Integer num, final boolean z, final boolean z2, final boolean z3, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        int i4;
        com.vk.core.compose.component.group.header.d a2;
        androidx.compose.runtime.a M = aVar.M(785840190);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(num) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(izsVar) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(785840190, i2, -1, "com.vk.profile.community.impl.ui.trust_mark.Group (CommunityTrustMarksScreen.kt:183)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            ikg0 ikg0Var = null;
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            if (z3) {
                M.K(878500682);
                i3 = i2;
                i4 = 8388608;
                ijv0.c(SeparatorDpi.At3x, SeparatorAppearance.Primary, s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), M, 54, 0);
                M = M;
            } else {
                i3 = i2;
                i4 = 8388608;
                M.K(870905434);
            }
            M.j();
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            if (num == null) {
                M.K(878946833);
                M.j();
                a2 = null;
            } else {
                M.K(878946834);
                androidx.compose.runtime.a aVar4 = M;
                a2 = d.a.a(num.intValue(), CounterAppearance.Design.Neutral, CounterMode.Tertiary, CounterSize.Small, null, aVar4, 200112, 16);
                M = aVar4;
                M.j();
            }
            androidx.compose.runtime.a aVar5 = M;
            com.vk.core.compose.component.group.header.f a4 = f.a.a(str, null, a2, null, null, null, null, null, false, aVar5, (i3 & 14) | 805306368, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            androidx.compose.runtime.a aVar6 = aVar5;
            if (z) {
                aVar6.K(444006666);
                boolean z4 = (i3 & 29360128) == i4;
                Object x = aVar6.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z4 || x == c0012a) {
                    x = new e48(izsVar, 1);
                    aVar6.R(x);
                }
                gzs gzsVar = (gzs) x;
                Object x2 = aVar6.x();
                if (x2 == c0012a) {
                    x2 = new oj(17);
                    aVar6.R(x2);
                }
                ikg0Var = GroupHeader$Right.c.a(null, null, GroupHeader$Right.b.a.C0746a.a(3072, 2, aVar6, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, gzsVar), null, aVar6, 11);
                aVar6 = aVar6;
                aVar6.j();
            } else {
                aVar6.K(879589525);
                aVar6.j();
            }
            androidx.compose.runtime.a aVar7 = aVar6;
            g.b(a4, H, z2 ? b.c.a : b.d.a, null, null, ikg0Var, false, aVar7, 0, 88);
            M = aVar7;
            M.K(444019812);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CommunityTrustMarksArgs.TrustMarkData trustMarkData = (CommunityTrustMarksArgs.TrustMarkData) it.next();
                int i5 = a.$EnumSwitchMapping$0[trustMarkData.b.ordinal()];
                if (i5 == 1) {
                    M.K(1782672273);
                    h(trustMarkData, izsVar, M, (i3 >> 18) & 112);
                    M.j();
                } else if (i5 != 2) {
                    M.K(1782676140);
                    f(trustMarkData, izsVar, M, (i3 >> 18) & 112);
                    M.j();
                } else {
                    M.K(1782674320);
                    g(trustMarkData, izsVar, M, (i3 >> 18) & 112);
                    M.j();
                }
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o4i
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.profile.community.impl.ui.trust_mark.e.d(str, list, q630Var, num, z, z2, z3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(CommunityTrustMarksArgs.TrustMarkData trustMarkData, androidx.compose.runtime.a aVar, int i) {
        int i2;
        LayoutNode.a aVar2;
        cri.a.e eVar;
        cri.a.d dVar;
        cri.a.C2678a c2678a;
        cri.a.b bVar;
        cri.a.c cVar;
        androidx.compose.runtime.a M = aVar.M(2046554683);
        int i3 = (M.J(trustMarkData) ? 4 : 2) | i;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2046554683, i3, -1, "com.vk.profile.community.impl.ui.trust_mark.Top (CommunityTrustMarksScreen.kt:129)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            float f2 = kqu0.v;
            q630 H = s200.H(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, kqu0.y, 2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f3 = kqu0.u;
            dt1.a.getClass();
            ty6.b bVar2 = dt1.a.k;
            a.j i4 = androidx.compose.foundation.layout.a.i(f3, bVar2);
            ty6.a aVar4 = dt1.a.o;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(i4, aVar4, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            Integer num = trustMarkData.d;
            if (num == null) {
                M.K(-749761720);
                M.j();
                eVar = eVar2;
                c2678a = c2678a2;
                bVar = bVar3;
                aVar2 = aVar5;
                cVar = cVar2;
                dVar = dVar2;
            } else {
                M.K(-749761719);
                aVar2 = aVar5;
                eVar = eVar2;
                dVar = dVar2;
                c2678a = c2678a2;
                bVar = bVar3;
                cVar = cVar2;
                pzu0.b(pg90.a(num.intValue(), 0, M), null, null, l5g.k, M, 3128, 4);
                M.j();
            }
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.i(kqu0.r, bVar2), aVar4, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar3);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            i2 = 4;
            yqv0.c(trustMarkData.c, ahn.E(aVar3, "MAIN_TRUST_MARK_HEADER"), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).k, M, 48, 0, 8120);
            M = M;
            String str = trustMarkData.j;
            if (str == null || str.length() == 0) {
                M.K(885073843);
            } else {
                M.K(892000359);
                yqv0.c(trustMarkData.j, null, wlb0.h(M).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).d0, M, 0, 0, 8122);
                M = M;
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i2 = 4;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x76(trustMarkData, i, i2);
        }
    }

    public static final void f(CommunityTrustMarksArgs.TrustMarkData trustMarkData, izs<? super c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        int i4;
        x xVar;
        h1 h1Var;
        v vVar;
        String f;
        Integer num = trustMarkData.i;
        androidx.compose.runtime.a M = aVar.M(-8304164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(trustMarkData) : M.y(trustMarkData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i5 = 1;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-8304164, i2, -1, "com.vk.profile.community.impl.ui.trust_mark.TrustMarkCell (CommunityTrustMarksScreen.kt:300)");
            }
            if (num == null) {
                M.K(1718941770);
                M.j();
                i3 = i2;
                i4 = 0;
                xVar = null;
            } else {
                M.K(1718941771);
                i3 = i2;
                i4 = 0;
                x a2 = com.vk.core.compose.component.cell.content.f.a(pg90.a(num.intValue(), 0, M), Cell$Left.Main.Size.Medium, i(trustMarkData.b, M), null, null, M, 196664, 24);
                M = M;
                M.j();
                xVar = a2;
            }
            String str = trustMarkData.c;
            VkTypographyToken vkTypographyToken = VkTypographyToken.Text;
            VkColorToken vkColorToken = VkColorToken.TextPrimary;
            int i6 = i3 & 112;
            int i7 = i6 == 32 ? 1 : i4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i7 != 0 || x == c0012a) {
                x = new l1e(izsVar, 1);
                M.R(x);
            }
            androidx.compose.runtime.a aVar2 = M;
            h1 b = Cell$Middle.d.b.b(aqm0.a(str, vkTypographyToken, vkColorToken, vkTypographyToken, null, (izs) x, 8).j(8, M), null, null, null, 0, 0, null, null, null, aVar2, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            M = aVar2;
            String str2 = trustMarkData.j;
            if (((str2 == null || str2.length() == 0) ? 1 : i4) == 0) {
                M.K(1719749135);
                h1 b2 = Cell$Middle.c.b.b(trustMarkData.j, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M = M;
                M.j();
                h1Var = b2;
            } else {
                M.K(1719869569);
                M.j();
                h1Var = null;
            }
            k0 a3 = Cell$Middle.a.a(b, h1Var, null, null, M, 196608, 28);
            if (trustMarkData.g) {
                M.K(1719934298);
                ButtonStyle buttonStyle = ButtonStyle.Link;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                Integer num2 = trustMarkData.h;
                if (num2 == null) {
                    M.K(1720113291);
                    M.j();
                    f = null;
                } else {
                    f = l4.f(M, 1720113292, num2, M, i4);
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_chevron_16, i4, M);
                int i8 = i6 == 32 ? 1 : i4;
                if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !M.y(trustMarkData))) {
                    i5 = i4;
                }
                int i9 = i8 | i5;
                Object x2 = M.x();
                if (i9 != 0 || x2 == c0012a) {
                    x2 = new rs0(7, (Object) trustMarkData, (izs) izsVar);
                    M.R(x2);
                }
                androidx.compose.runtime.a aVar3 = M;
                v a5 = k.a(buttonStyle, buttonAppearance, null, f, null, null, a4, false, null, null, (gzs) x2, aVar3, 134217782, 1572864, 32500);
                M = aVar3;
                M.j();
                vVar = a5;
            } else {
                M.K(1720351681);
                M.j();
                vVar = null;
            }
            wiu0.b(null, false, xVar, a3, vVar, null, null, M, 0, 99);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rac((Object) trustMarkData, (xzs) izsVar, i, 1);
        }
    }

    public static final void g(CommunityTrustMarksArgs.TrustMarkData trustMarkData, izs<? super c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        efj a2;
        androidx.compose.runtime.a M = aVar.M(1577375490);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(trustMarkData) : M.y(trustMarkData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1577375490, i4, -1, "com.vk.profile.community.impl.ui.trust_mark.TrustMarkLinkCell (CommunityTrustMarksScreen.kt:268)");
            }
            h1 h1Var = null;
            if (trustMarkData.e == null) {
                M.K(356269400);
                M.j();
                i3 = -1;
                a2 = null;
            } else {
                M.K(356269401);
                i3 = -1;
                a2 = phw.a.a(fwu0.l(null, trustMarkData.e, null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
                M = M;
                M.j();
            }
            if (a2 == null) {
                M.K(356381032);
                qzu0.a.getClass();
                lg90 f = qzu0.f(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = xpv.a.a(f, j, new rek0(ylu0Var2.getBackground().x), M, 24584, 8);
                M.j();
            } else {
                M.K(-265602284);
                M.j();
            }
            androidx.compose.runtime.a aVar2 = M;
            t a3 = com.vk.core.compose.component.cell.content.e.a(a2, Cell$Left.Main.Size.Medium, null, null, null, null, null, aVar2, 100663344, 252);
            h1 a4 = Cell$Middle.d.b.a(trustMarkData.c, null, null, 1, null, null, aVar2, 12610560, 102);
            androidx.compose.runtime.a aVar3 = aVar2;
            String str = trustMarkData.j;
            if (str == null || str.length() == 0) {
                aVar3.K(357043067);
                aVar3.j();
            } else {
                aVar3.K(356969722);
                h1Var = Cell$Middle.c.b.b(trustMarkData.j, 0, null, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                aVar3 = aVar3;
                aVar3.j();
            }
            k0 a5 = Cell$Middle.a.a(a4, h1Var, null, null, aVar3, 196608, 28);
            boolean z = ((i4 & 14) == 4 || ((i4 & 8) != 0 && aVar3.y(trustMarkData))) | ((i4 & 112) == 32);
            Object x = aVar3.x();
            if (z || x == a.C0011a.a) {
                x = new uh3(10, trustMarkData, izsVar);
                aVar3.R(x);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            wiu0.b(null, false, a3, a5, null, (gzs) x, null, aVar4, 0, 83);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vi1(trustMarkData, izsVar, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r6 == androidx.compose.runtime.a.C0011a.a) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final CommunityTrustMarksArgs.TrustMarkData trustMarkData, final izs<? super c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(2120307420);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(trustMarkData) : M.y(trustMarkData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2120307420, i2, -1, "com.vk.profile.community.impl.ui.trust_mark.TrustMarkPhoneCell (CommunityTrustMarksScreen.kt:229)");
            }
            String str = trustMarkData.c;
            Integer num = trustMarkData.i;
            boolean J = M.J(str);
            Object x = M.x();
            x xVar = null;
            if (!J) {
                obj = x;
            }
            int length = str.length();
            s8u0 s8u0Var = new s8u0(0);
            s8u0Var.e(str);
            s8u0Var.d(new klv0(VkTypographyToken.Text, VkColorToken.TextAccent), 0, length);
            s8u0Var.a(new h2v0("mark.text", null, new i9z() { // from class: xsna.n4i
                @Override // xsna.i9z
                public final void a(q8z q8zVar) {
                    izs.this.invoke(new c.d(trustMarkData.c));
                }
            }), 0, length);
            M.R(s8u0Var);
            obj = s8u0Var;
            s8u0 s8u0Var2 = (s8u0) obj;
            if (num == null) {
                M.K(-4869686);
            } else {
                M.K(-4869685);
                xVar = com.vk.core.compose.component.cell.content.f.a(pg90.a(num.intValue(), 0, M), Cell$Left.Main.Size.Medium, i(trustMarkData.b, M), null, null, M, 196664, 24);
            }
            M.j();
            wiu0.b(null, false, xVar, Cell$Middle.a.a(Cell$Middle.d.b.b(s8u0Var2.j(8, M), null, null, null, 0, 0, null, null, null, M, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW), null, null, null, M, 196608, 30), null, null, null, M, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            androidx.compose.runtime.a aVar3 = M;
            aVar2 = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                aVar2 = aVar3;
            }
        } else {
            M.h();
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wi1(trustMarkData, izsVar, i, 1);
        }
    }

    public static final long i(CommunityTrustMarksArgs.TrustMarkData.Type type, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-944124708, 0, -1, "com.vk.profile.community.impl.ui.trust_mark.getIconTint (CommunityTrustMarksScreen.kt:427)");
        }
        if (a.$EnumSwitchMapping$0[type.ordinal()] == 3) {
            aVar.K(-1065739032);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().i;
            aVar.j();
        } else {
            aVar.K(-1065737591);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getIcon().l;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
