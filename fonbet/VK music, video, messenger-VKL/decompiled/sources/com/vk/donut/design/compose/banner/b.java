package com.vk.donut.design.compose.banner;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.group.header.g;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.movika.tools.controls.seekbar.h;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.akv0;
import xsna.alb0;
import xsna.b15;
import xsna.ckv0;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dhu0;
import xsna.dt1;
import xsna.dyn;
import xsna.e7c;
import xsna.erv0;
import xsna.eyn;
import xsna.f9t;
import xsna.frv0;
import xsna.fyn;
import xsna.gp;
import xsna.gyn;
import xsna.hr80;
import xsna.ja8;
import xsna.k9q0;
import xsna.kai;
import xsna.kci;
import xsna.kqu0;
import xsna.lb5;
import xsna.n34;
import xsna.om9;
import xsna.q630;
import xsna.qed;
import xsna.qri;
import xsna.ra8;
import xsna.rrv0;
import xsna.rte0;
import xsna.s200;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.vog0;
import xsna.wuv0;
import xsna.xpy;
import xsna.xyc;
import xsna.ylu0;
import xsna.zak0;

/* compiled from: DonutBannerSkeleton.kt */
/* loaded from: classes18.dex */
public final class b {

    /* compiled from: DonutBannerSkeleton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutBannerSkeletonContent.Type.values().length];
            try {
                iArr[DonutBannerSkeletonContent.Type.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutBannerSkeletonContent.Type.Goals.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1943430490);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1943430490, i2, -1, "com.vk.donut.design.compose.banner.DonutBannerCardRegularContentSkeleton (DonutBannerSkeleton.kt:264)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630Var2 = q630.a.a;
            q630 c = qri.c(M, q630Var2);
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
            k a3 = j.a(androidx.compose.foundation.layout.a.g(kqu0.t), dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, q630Var2);
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
            M.K(-1407105778);
            for (int i3 = 0; i3 < 2; i3++) {
                c(null, M, 0);
            }
            M.j();
            M.G();
            f9t.e(txj0.h(q630Var2, kqu0.t), M, 0);
            c(null, M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        f s = M.s();
        if (s != null) {
            s.d = new lb5(q630Var2, i, 1);
        }
    }

    public static final void b(DonutBannerSkeletonContent.Type type, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2096124870);
        int i2 = (M.J(q630Var) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2096124870, i2, -1, "com.vk.donut.design.compose.banner.DonutBannerCardSkeletonShimmer (DonutBannerSkeleton.kt:200)");
            }
            q630 d = rte0.d(q630Var, vog0.b(12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().B, e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ckv0.a(txj0.h(txj0.f(q630.a.a, 1.0f), 160), null, kai.c(-1524128059, new gyn(type, 0), M), M, 390, 2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new qed(type, q630Var, i, 5);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(187103444);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(187103444, i2, -1, "com.vk.donut.design.compose.banner.DonutBannerContentItem (DonutBannerSkeleton.kt:286)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            k a2 = j.a(androidx.compose.foundation.layout.a.g(kqu0.s), bVar, M, 48);
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
            akv0.a(SkeletonType.Circle, txj0.q(aVar2, 12), M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            erv0.a(1, wuv0Var.i0, txj0.v(aVar2, 47), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 8);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new om9(q630Var, i, 4);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1130998778);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1130998778, i2, -1, "com.vk.donut.design.compose.banner.DonutBannerGoalsContentSkeleton (DonutBannerSkeleton.kt:164)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            float f = Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE;
            q630.a aVar2 = q630.a.a;
            erv0.a(1, frv0Var, txj0.v(aVar2, f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new eyn(q630Var, i, 0);
        }
    }

    public static final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1493641883);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1493641883, i2, -1, "com.vk.donut.design.compose.banner.DonutBannerRegularDonateContentSkeleton (DonutBannerSkeleton.kt:150)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            k a2 = j.a(g, dt1.a.k, M, 0);
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
            M.K(1445541819);
            for (int i3 = 0; i3 < 3; i3++) {
                c(null, M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new fyn(q630Var, i, 0);
        }
    }

    public static final void f(DonutBannerSkeletonContent.Type type, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1589008384);
        int i3 = (M.o(type.ordinal()) ? 4 : 2) | i | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1589008384, i3, -1, "com.vk.donut.design.compose.banner.DonutBannerSingleContentSkeleton (DonutBannerSkeleton.kt:92)");
            }
            q630Var2 = q630.a.a;
            q630 f = txj0.f(q630Var2, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, c, dVar);
            q630 H = s200.H(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 18, 7);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, H);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.h0;
            int[] iArr = a.$EnumSwitchMapping$0;
            int i4 = iArr[type.ordinal()];
            if (i4 == 1) {
                i2 = 162;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 87;
            }
            erv0.a(1, frv0Var, txj0.v(q630Var2, i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 8);
            f9t.e(txj0.h(q630Var2, kqu0.s), M, 0);
            int i5 = iArr[type.ordinal()];
            if (i5 == 1) {
                M.K(-2123153011);
                e(null, M, 0);
                M.j();
            } else {
                if (i5 != 2) {
                    throw alb0.c(-207038256, M);
                }
                M.K(-2123014379);
                d(null, M, 0);
                M.j();
            }
            f9t.e(txj0.h(q630Var2, kqu0.w), M, 0);
            dhu0.a(ButtonSize.Small, ButtonStyle.Secondary, txj0.v(q630Var2, 93), M, 438);
            M.G();
            float f2 = 10;
            akv0.a(SkeletonType.Circle, ra8.a.b(txj0.q(kci.l(q630Var2, f2, f2), 96), dt1.a.j), M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        f s = M.s();
        if (s != null) {
            s.d = new e7c(type, q630Var2, i, 1);
        }
    }

    public static final void g(DonutBannerSkeletonContent donutBannerSkeletonContent, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        androidx.compose.runtime.a M = aVar.M(1752473362);
        int i3 = (M.J(donutBannerSkeletonContent) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                q630Var = q630.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1752473362, i3, -1, "com.vk.donut.design.compose.banner.DonutBannerSkeletonShimmer (DonutBannerSkeleton.kt:44)");
            }
            M.K(-1688229355);
            i(donutBannerSkeletonContent, q630Var, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        f s = M.s();
        if (s != null) {
            s.d = new dyn(donutBannerSkeletonContent, q630Var2, i, i2, 0);
        }
    }

    public static final void h(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1439741303);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1439741303, i2, -1, "com.vk.donut.design.compose.banner.DonutBannerTwoCardContentSkeletonShimmer (DonutBannerSkeleton.kt:176)");
            }
            float f = kqu0.s;
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            k a2 = j.a(g, dt1.a.k, M, 0);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            DonutBannerSkeletonContent.Type type = DonutBannerSkeletonContent.Type.Regular;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            b(type, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 6);
            DonutBannerSkeletonContent.Type type2 = DonutBannerSkeletonContent.Type.Goals;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            b(type2, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new h(q630Var, i, 4);
        }
    }

    public static final void i(DonutBannerSkeletonContent donutBannerSkeletonContent, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(563271201);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(donutBannerSkeletonContent) : M.y(donutBannerSkeletonContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(563271201, i2, -1, "com.vk.donut.design.compose.banner.MilkshakeDonutBannerSkeletonShimmer (DonutBannerSkeleton.kt:56)");
            }
            q630 d = rte0.d(q630Var, vog0.b(20));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            com.vk.core.compose.component.group.header.f a3 = f.a.a(d370.N(R.string.donut_banner_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                q630Var2 = null;
                x = new com.vk.core.compose.component.group.header.a(a3, null);
                M.R(x);
            } else {
                q630Var2 = null;
            }
            com.vk.core.compose.component.group.header.a aVar3 = (com.vk.core.compose.component.group.header.a) x;
            ((zak0) aVar3.a).setValue(a3);
            ((zak0) aVar3.b).setValue(q630Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            g.a(aVar3, null, b.c.a, null, null, false, M, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            if (donutBannerSkeletonContent instanceof DonutBannerSkeletonContent.a) {
                M.K(-1925122387);
                ckv0.a(null, null, kai.c(1977359594, new b15(donutBannerSkeletonContent, 2), M), M, 384, 3);
                M.j();
            } else {
                if (!(donutBannerSkeletonContent instanceof DonutBannerSkeletonContent.b)) {
                    throw alb0.c(-893386714, M);
                }
                M.K(-1924881951);
                h(q630Var2, M, 0);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xyc(donutBannerSkeletonContent, q630Var, i, 2);
        }
    }
}
