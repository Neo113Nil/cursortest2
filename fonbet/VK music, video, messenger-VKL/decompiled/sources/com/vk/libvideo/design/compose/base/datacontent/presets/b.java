package com.vk.libvideo.design.compose.base.datacontent.presets;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a8d;
import xsna.ahn;
import xsna.alb0;
import xsna.ckv0;
import xsna.cri;
import xsna.dt1;
import xsna.eai;
import xsna.erv0;
import xsna.esa0;
import xsna.fwu0;
import xsna.h08;
import xsna.ir;
import xsna.jai;
import xsna.jgp;
import xsna.jn7;
import xsna.jnc;
import xsna.jzj0;
import xsna.k9q0;
import xsna.kai;
import xsna.l2l0;
import xsna.ldu0;
import xsna.lzj0;
import xsna.mno0;
import xsna.n34;
import xsna.ns70;
import xsna.ofj;
import xsna.on00;
import xsna.p6c;
import xsna.phw;
import xsna.pvi;
import xsna.pzu0;
import xsna.q630;
import xsna.qri;
import xsna.qzu0;
import xsna.r0x;
import xsna.ra5;
import xsna.rnu0;
import xsna.rrv0;
import xsna.s0x;
import xsna.s200;
import xsna.sg50;
import xsna.sy90;
import xsna.syq;
import xsna.szw;
import xsna.txj0;
import xsna.us2;
import xsna.uxn;
import xsna.wdj0;
import xsna.wkj;
import xsna.wlb0;
import xsna.wuv0;
import xsna.xpy;
import xsna.yb1;
import xsna.ylu0;
import xsna.yqv0;
import xsna.z05;
import xsna.z7d;
import xsna.zq8;

/* compiled from: VideoMetaView.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final void a(VideoMetaViewState.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(2046243867);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2046243867, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.AboutVideoView (VideoMetaView.kt:141)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            q630 a = eai.a(q630Var, (sg50) x, aVar.b());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a2 = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            jzj0.a(null, aVar.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-416090546, new z05(aVar, 1), M), M, 3072, 5);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ns70(aVar, q630Var, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void b(VideoMetaViewState.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        q630.a aVar3;
        ?? r15;
        q630.a aVar4;
        androidx.compose.runtime.a M = aVar2.M(-925664548);
        int i2 = (M.J(aVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-925664548, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ChannelName (VideoMetaView.kt:213)");
            }
            dt1.a.getClass();
            k a = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar5 = q630.a.a;
            q630 c = qri.c(M, aVar5);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            String str = null;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (aVar.c != null) {
                M.K(-1599362132);
                aVar3 = aVar5;
                r15 = 0;
                ldu0.b(phw.a.a(fwu0.l(aVar.c, null, null, null, M, 0, 62), null, wkj.a.a, null, null, M, 197000, 26), 20, s200.H(aVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                M = M;
            } else {
                aVar3 = aVar5;
                r15 = 0;
                M.K(-1607198870);
            }
            M.j();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E = ahn.E(new xpy(1.0f, r15), "mvi_video_card_owner_name");
            mno0 mno0Var = aVar.d;
            if (mno0Var == 0) {
                M.K(-1598866753);
            } else {
                M.K(918254978);
                str = mno0Var.a(r15, M);
            }
            M.j();
            if (str == null) {
                str = "";
            }
            androidx.compose.runtime.a aVar7 = M;
            yqv0.c(str, E, wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).s0, aVar7, 100663296, 48, 5880);
            M = aVar7;
            if (aVar.e) {
                M.K(-1598623216);
                qzu0.a.getClass();
                aVar4 = aVar3;
                pzu0.b(qzu0.C1(M), null, s200.H(aVar4, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getIcon().a, M, 440, 0);
            } else {
                aVar4 = aVar3;
                M.K(-1607198870);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        f s = M.s();
        if (s != null) {
            s.d = new h08(aVar, q630Var2, i, 13);
        }
    }

    public static final void c(VideoMetaViewState.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(241547501);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(241547501, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.DescriptionView (VideoMetaView.kt:124)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String a2 = bVar.b.a(0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(a2, null, j, null, null, 0, 0, null, 2, false, 0, 3, null, wuv0Var.s0, aVar2, 100663296, 0, 5882);
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
            s.d = new ofj(bVar, q630Var, i, 3);
        }
    }

    public static final void d(VideoMetaViewState.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(114348987);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(114348987, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.DownloadProgressView (VideoMetaView.kt:299)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            jzj0.a(null, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1116987758, new a(dVar, 0), M), M, 3120, 5);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new uxn(dVar, q630Var, i, 4);
        }
    }

    public static final void e(VideoMetaViewState.DownloadStatus downloadStatus, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-950400997);
        if ((i & 6) == 0) {
            i2 = (M.o(downloadStatus.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-950400997, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.DownloadStatusView (VideoMetaView.kt:251)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String a2 = downloadStatus.j().a(0, M);
            boolean J = M.J(downloadStatus.j()) | M.J(downloadStatus.i());
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                us2.b bVar = new us2.b();
                if (downloadStatus.i() != null) {
                    s0x.a(bVar, "PrefixIcon", "�");
                }
                bVar.g(a2);
                x = bVar.n();
                M.R(x);
            }
            us2 us2Var = (us2) x;
            boolean J2 = M.J(downloadStatus.i());
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = downloadStatus.i() != null ? on00.f(new Pair("PrefixIcon", new r0x(new esa0(l2l0.l(16), l2l0.l(16), 7), new jai(1326937914, new syq(downloadStatus, 3), true)))) : jgp.b;
                M.R(x2);
            }
            Map map = (Map) x2;
            long a3 = downloadStatus.h().a(0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.d(us2Var, null, a3, 0, null, 0, false, 0, null, map, wuv0Var.s0, aVar2, 0, 0, 4090);
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
            s.d = new z7d(downloadStatus, q630Var, i, 5);
        }
    }

    public static final void f(VideoMetaViewState.e eVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(803362757);
        if ((i & 6) == 0) {
            i2 = (M.J(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(803362757, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.EpisodeTimeView (VideoMetaView.kt:343)");
            }
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            rnu0.c(ContentBadgeSize.Medium, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Overlay, null, null, null, eVar.b.a(0, M), null, null, null, false, null, false, null, aVar2, 438, 0, 16312);
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
            s.d = new a8d(eVar, q630Var, i, 6);
        }
    }

    public static final void g(lzj0 lzj0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-180115935);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lzj0Var) : M.y(lzj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-180115935, i3, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.Separator (VideoMetaView.kt:200)");
            }
            q630 a = lzj0Var.a();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(" · ", a, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.s0, aVar2, 6, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new pvi(lzj0Var, q630Var2, i, 4);
        }
    }

    public static final void h(VideoMetaViewState.f fVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(875633027);
        if ((i & 6) == 0) {
            i2 = (M.J(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(875633027, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.SubtitleSkeletonView (VideoMetaView.kt:374)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630 f = txj0.f(q630.a.a, fVar.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            erv0.b("", f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, 0, 1, null, wuv0Var.s0, M, 805306374, 0, 1532);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ra5(fVar, q630Var, i, 5);
        }
    }

    public static final void i(VideoMetaViewState.g gVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1276045979);
        int i2 = (M.J(gVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1276045979, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.SubtitleView (VideoMetaView.kt:91)");
            }
            if (gVar instanceof VideoMetaViewState.a) {
                M.K(-2080455046);
                a((VideoMetaViewState.a) gVar, q630Var, M, 48);
                M.j();
            } else if (gVar instanceof VideoMetaViewState.d) {
                M.K(-2080452416);
                d((VideoMetaViewState.d) gVar, q630Var, M, 48);
                M.j();
            } else if (gVar instanceof VideoMetaViewState.DownloadStatus) {
                M.K(-2080449666);
                e((VideoMetaViewState.DownloadStatus) gVar, q630Var, M, 48);
                M.j();
            } else if (gVar instanceof VideoMetaViewState.e) {
                M.K(-2080447077);
                f((VideoMetaViewState.e) gVar, q630Var, M, 48);
                M.j();
            } else {
                if (!(gVar instanceof VideoMetaViewState.f)) {
                    throw alb0.c(-2080456539, M);
                }
                M.K(-2080444672);
                h((VideoMetaViewState.f) gVar, q630Var, M, 48);
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
            s.d = new jn7(gVar, q630Var, i, 12);
        }
    }

    public static final void j(VideoMetaViewState.f fVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-465165217);
        if ((i & 6) == 0) {
            i2 = (M.J(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-465165217, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.TitleSkeletonView (VideoMetaView.kt:359)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630 f = txj0.f(q630.a.a, fVar.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            erv0.b("", f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, 0, 1, null, wuv0Var.h0, M, 805306374, 0, 1532);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new p6c(fVar, q630Var, i, 1);
        }
    }

    public static final void k(VideoMetaViewState.h hVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-594015131);
        int i2 = (M.J(hVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-594015131, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.TitleView (VideoMetaView.kt:79)");
            }
            boolean z = hVar instanceof VideoMetaViewState.f;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(382115015);
                j((VideoMetaViewState.f) hVar, aVar2, M, 48);
                M.j();
            } else if (hVar instanceof VideoMetaViewState.i) {
                M.K(382117507);
                m((VideoMetaViewState.i) hVar, aVar2, M, 48);
                M.j();
            } else {
                if (!(hVar instanceof VideoMetaViewState.b)) {
                    throw alb0.c(382113406, M);
                }
                M.K(382119941);
                c((VideoMetaViewState.b) hVar, aVar2, M, 48);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new yb1(hVar, q630Var, i, 12);
        }
    }

    public static final void l(VideoMetaViewState videoMetaViewState, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        VideoMetaViewState.g gVar = videoMetaViewState.c;
        VideoMetaViewState.g gVar2 = videoMetaViewState.b;
        VideoMetaViewState.h hVar = videoMetaViewState.a;
        androidx.compose.runtime.a M = aVar.M(1597871875);
        if ((i & 6) == 0) {
            i2 = (M.J(videoMetaViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1597871875, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaView (VideoMetaView.kt:56)");
            }
            boolean z = hVar instanceof VideoMetaViewState.f;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(1078738341);
                q630Var2 = wdj0.a(aVar2, ckv0.b(null, M, 1));
                M.j();
            } else {
                M.K(1078800775);
                M.j();
                q630Var2 = aVar2;
            }
            q630 g = q630Var.g(q630Var2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            k(hVar, null, M, 0);
            if (gVar2 != null) {
                M.K(-21794152);
                i(gVar2, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 48);
            } else {
                M.K(-24843467);
            }
            M.j();
            if (gVar != null) {
                M.K(-21660077);
                i(gVar, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 48);
            } else {
                M.K(-24843467);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new zq8(videoMetaViewState, q630Var, i, 3);
        }
    }

    public static final void m(VideoMetaViewState.i iVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-954879);
        if ((i & 6) == 0) {
            i2 = (M.J(iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-954879, i2, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.VideoNameView (VideoMetaView.kt:106)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String a2 = iVar.b.a(0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(a2, ahn.E(q630.a.a, "videoName"), j, null, null, 0, 0, null, 2, false, 0, iVar.c, null, wuv0Var.h0, aVar2, 100663344, 0, 5880);
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
            s.d = new jnc(iVar, q630Var, i, 4);
        }
    }
}
