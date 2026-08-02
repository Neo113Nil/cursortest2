package com.vk.community.design.compose.onboarding;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.ahn;
import xsna.alb0;
import xsna.bap;
import xsna.bhu0;
import xsna.c3;
import xsna.cp10;
import xsna.cp8;
import xsna.cri;
import xsna.d0h;
import xsna.d370;
import xsna.dt1;
import xsna.e0h;
import xsna.frv0;
import xsna.fwu0;
import xsna.g0h;
import xsna.gio0;
import xsna.gor0;
import xsna.gzs;
import xsna.j0h;
import xsna.ja8;
import xsna.k9q0;
import xsna.kai;
import xsna.kdi;
import xsna.kqu0;
import xsna.l0h;
import xsna.lg90;
import xsna.lzg;
import xsna.mzg;
import xsna.n0h;
import xsna.n34;
import xsna.nx7;
import xsna.ojc;
import xsna.pg90;
import xsna.pja;
import xsna.pzu0;
import xsna.q630;
import xsna.q7z;
import xsna.qri;
import xsna.ra8;
import xsna.rrv0;
import xsna.rz7;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.us2;
import xsna.wh50;
import xsna.wlb0;
import xsna.wmg;
import xsna.wow;
import xsna.wuv0;
import xsna.wzs;
import xsna.xe4;
import xsna.xpy;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zzg;

/* compiled from: CommunityCreationOnboarding.kt */
/* loaded from: classes17.dex */
public final class a {
    public static final void a(String str, boolean z, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        final int i3;
        final String str2;
        final boolean z2;
        q630 G;
        final gzs<s3q0> gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(1217712634);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(1217712634, i2, -1, "com.vk.community.design.compose.onboarding.ActionButton (CommunityCreationOnboarding.kt:177)");
            }
            if (str == null) {
                if (b.d()) {
                    b.e();
                }
                f s = M.s();
                if (s != null) {
                    s.d = new e0h(i, 0, str, gzsVar, z);
                    return;
                }
                return;
            }
            i3 = i;
            str2 = str;
            z2 = z;
            q630.a aVar2 = q630.a.a;
            if (z2) {
                float f = kqu0.w;
                G = s200.H(aVar2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2);
            } else {
                float f2 = kqu0.w;
                G = s200.G(aVar2, f2, kqu0.v, f2, f2);
            }
            q630 q630Var = G;
            int i4 = i2;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            gio0 a = cp8.d.a.a(str2, null, M, (i4 & 14) | 3072, 6);
            int i5 = ((i4 >> 6) & 14) | 25008;
            gzsVar2 = gzsVar;
            bhu0.d(gzsVar2, buttonStyle, buttonAppearance, q630Var, buttonSize, null, null, a, false, null, M, i5, 3936);
            if (b.d()) {
                b.e();
            }
        } else {
            i3 = i;
            str2 = str;
            z2 = z;
            M.h();
        }
        f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.f0h
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i3 | 1);
                    com.vk.community.design.compose.onboarding.a.a(str2, z2, gzsVar2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(mzg mzgVar, zzg zzgVar, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        CommunityCreationOnboardingBlock<?> communityCreationOnboardingBlock = mzgVar.e;
        androidx.compose.runtime.a M = aVar.M(-1758941831);
        int i3 = i | (M.J(mzgVar) ? 4 : 2) | (M.J(zzgVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (b.d()) {
                b.f(-1758941831, i3, -1, "com.vk.community.design.compose.onboarding.CommunityCreationOnboarding (CommunityCreationOnboarding.kt:51)");
            }
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new d0h(0, gzsVar);
                M.R(x);
            }
            q630 c = ojc.c(q630Var, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, c2, dVar);
            c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c3 = qri.c(M, aVar3);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            c(mzgVar.a, zzgVar, gzsVar2, M, (i3 & 112) | ((i3 >> 3) & 896));
            q630 E = ahn.E(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), "community_creation_onboarding_block_subtitle");
            String str = mzgVar.b;
            if (b.d()) {
                b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (b.d()) {
                b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (b.d()) {
                i2 = 0;
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i2 = 0;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            int i5 = i2;
            yqv0.c(str, E, ylu0Var.getText().p, null, null, q7z.c, 0, null, 0, false, 0, 0, null, frv0Var, M, 196608, 0, 8152);
            M = M;
            d(communityCreationOnboardingBlock, M, i5);
            String str2 = mzgVar.c;
            List<?> a2 = communityCreationOnboardingBlock != null ? communityCreationOnboardingBlock.a() : null;
            wow wowVar = a2 != null ? new wow(a2) : null;
            gzsVar3 = gzsVar;
            a(str2, ((wowVar == null || wowVar.b.isEmpty()) ? 1 : i5) ^ 1, gzsVar3, M, i4);
            M.G();
            if (mzgVar.d != null) {
                M.K(-619231803);
                fwu0.c(ahn.E(txj0.s(ra8.a.b(aVar3, dt1.a.j), 100, 70), "community_creation_onboarding_block_image"), null, mzgVar.d, null, null, null, null, kdi.a, M, 100663296, 250);
            } else {
                M.K(-622664061);
            }
            M.j();
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            gzsVar3 = gzsVar;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new rz7(mzgVar, zzgVar, gzsVar3, gzsVar2, q630Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(j0h j0hVar, zzg zzgVar, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar2;
        int i3;
        Object g0hVar;
        ty6.b bVar;
        wh50 wh50Var;
        int i4;
        Object obj;
        int i5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(410259179);
        if ((i & 6) == 0) {
            i2 = (M.J(j0hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(zzgVar) : M.y(zzgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(410259179, i2, -1, "com.vk.community.design.compose.onboarding.HighlightedHeader (CommunityCreationOnboarding.kt:108)");
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar2 = dt1.a.k;
            k a = j.a(lVar, bVar2, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, xpyVar);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar3, M, c2678a);
            k9q0.w(M, c2, dVar);
            int intValue = j0hVar.b.i().intValue();
            Object obj2 = a.C0011a.a;
            if (intValue == -1) {
                M.K(2076365488);
                q630 E = ahn.E(aVar2, "community_creation_onboarding_block_title");
                String str = j0hVar.a;
                if (b.d()) {
                    b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (b.d()) {
                    b.e();
                }
                frv0 frv0Var = wuv0Var.p;
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                i3 = 1;
                yqv0.c(str, E, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
                M = M;
                M.j();
                bVar = bVar2;
                i4 = i2;
                obj = obj2;
                i5 = 0;
            } else {
                i3 = 1;
                M.K(2076723290);
                boolean s = wlb0.h(M).s();
                int i7 = i2 & 14;
                boolean l = M.l(s) | (i7 == 4);
                Object x = M.x();
                if (l || x == obj2) {
                    x = androidx.compose.runtime.k.b(new us2.b(j0hVar.a).n());
                    M.R(x);
                }
                wh50 wh50Var2 = (wh50) x;
                long j = wlb0.h(M).l().F0;
                Boolean valueOf2 = Boolean.valueOf(wlb0.h(M).s());
                us2 us2Var = (us2) wh50Var2.getValue();
                boolean J = M.J(wh50Var2) | (i7 == 4) | M.l(s) | M.p(j);
                Object x2 = M.x();
                if (J || x2 == obj2) {
                    bVar = bVar2;
                    wh50Var = wh50Var2;
                    i4 = i2;
                    obj = obj2;
                    i5 = 0;
                    g0hVar = new g0h(j0hVar, s, j, wh50Var, null);
                    M.R(g0hVar);
                } else {
                    obj = obj2;
                    i5 = 0;
                    wh50Var = wh50Var2;
                    bVar = bVar2;
                    g0hVar = x2;
                    i4 = i2;
                }
                bap.f(valueOf2, us2Var, (wzs) g0hVar, M, i5);
                zzgVar.a(j0hVar.b, kai.c(1362863841, new pja(wh50Var, 1), M), M, ((i4 << 6) & 7168) | Tensorflow.FRAME_WIDTH);
                M.j();
            }
            M.G();
            q630 H2 = s200.H(new gor0(bVar), kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            int i8 = (i4 & 896) == 256 ? i3 : i5;
            Object x3 = M.x();
            if (i8 != 0 || x3 == obj) {
                gzsVar2 = gzsVar;
                x3 = new xe4(1, gzsVar2);
                M.R(x3);
            } else {
                gzsVar2 = gzsVar;
            }
            q630 E2 = ahn.E(ojc.c(H2, false, null, null, (gzs) x3, 15), "community_creation_onboarding_block_skip_icon");
            if (b.d()) {
                i6 = -1;
                b.f(-2029247040, i5, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss28> (VkSdkIcons.kt:652)");
            } else {
                i6 = -1;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_dismiss_28, i5, M);
            if (b.d()) {
                b.e();
            }
            if (b.d()) {
                b.f(1040687336, i5, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            pzu0.b(a2, d370.N(R.string.community_close_creation_onboarding_accessibility, i5, M), E2, ylu0Var2.getIcon().f, M, 8, 0);
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        f s2 = M.s();
        if (s2 != null) {
            s2.d = new c3(i, 1, j0hVar, zzgVar, gzsVar2);
        }
    }

    public static final void d(CommunityCreationOnboardingBlock<?> communityCreationOnboardingBlock, androidx.compose.runtime.a aVar, int i) {
        f fVar;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar.M(245649739);
        int i2 = (M.J(communityCreationOnboardingBlock) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(245649739, i2, -1, "com.vk.community.design.compose.onboarding.OnboardingItemsBlock (CommunityCreationOnboarding.kt:210)");
            }
            if (communityCreationOnboardingBlock == null || communityCreationOnboardingBlock.a().isEmpty()) {
                if (b.d()) {
                    b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new nx7(communityCreationOnboardingBlock, i, 2);
                    fVar.d = wzsVar;
                }
                return;
            }
            boolean z = communityCreationOnboardingBlock instanceof CommunityCreationOnboardingBlock.b;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(-153792921);
                l0h.a(0, M, ((CommunityCreationOnboardingBlock.b) communityCreationOnboardingBlock).a, s200.E(aVar2, kqu0.w, kqu0.v));
                M.j();
            } else if (communityCreationOnboardingBlock instanceof CommunityCreationOnboardingBlock.a) {
                M.K(-153783100);
                lzg.a(0, M, ((CommunityCreationOnboardingBlock.a) communityCreationOnboardingBlock).a, s200.E(aVar2, kqu0.w, kqu0.v));
                M.j();
            } else {
                if (!(communityCreationOnboardingBlock instanceof CommunityCreationOnboardingBlock.c)) {
                    throw alb0.c(-153794808, M);
                }
                M.K(-153773207);
                n0h.a(0, M, ((CommunityCreationOnboardingBlock.c) communityCreationOnboardingBlock).a, s200.E(aVar2, kqu0.w, kqu0.v));
                M.j();
            }
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        fVar = M.s();
        if (fVar != null) {
            wzsVar = new wmg(communityCreationOnboardingBlock, i, 1);
            fVar.d = wzsVar;
        }
    }
}
