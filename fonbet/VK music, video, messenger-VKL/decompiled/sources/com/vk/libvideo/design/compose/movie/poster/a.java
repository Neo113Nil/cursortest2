package com.vk.libvideo.design.compose.movie.poster;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.movie.poster.PosterCardState;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ad2;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.eai;
import xsna.ex;
import xsna.ir;
import xsna.k9q0;
import xsna.kbe;
import xsna.lg90;
import xsna.mno0;
import xsna.n34;
import xsna.n74;
import xsna.nzu0;
import xsna.q630;
import xsna.qri;
import xsna.rmw;
import xsna.rrv0;
import xsna.s200;
import xsna.sg50;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.xpy;
import xsna.ylu0;
import xsna.zoi;

/* compiled from: PosterCard.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: PosterCard.kt */
    /* renamed from: com.vk.libvideo.design.compose.movie.poster.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1226a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PosterCardState.Size.values().length];
            try {
                iArr[PosterCardState.Size.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PosterCardState.Size.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    public static final void a(PosterCardState.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(996129852);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(996129852, i2, -1, "com.vk.libvideo.design.compose.movie.poster.MiddleContentView (PosterCard.kt:99)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            q630 a = eai.a(q630Var, (sg50) x, (dai.c) bVar.d.getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a2 = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            String str = null;
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
            VideoMetaViewState videoMetaViewState = bVar.a;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            com.vk.libvideo.design.compose.base.datacontent.presets.b.l(videoMetaViewState, new xpy(1.0f, true), M, 0);
            rmw rmwVar = bVar.b;
            if (rmwVar == null) {
                M.K(-2132898799);
                M.j();
                aVar2 = M;
            } else {
                M.K(-2132898798);
                float f = 8;
                q630 H = s200.H(q630.a.a, 12, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 4);
                kbe kbeVar = ((dai.c) bVar.e.getValue()).c;
                lg90 a3 = rmw.b.a(null, rmwVar, M, 0, 3);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                long j = ylu0Var.getIcon().j;
                mno0 mno0Var = bVar.c;
                if (mno0Var == null) {
                    M.K(-843883135);
                } else {
                    M.K(665514624);
                    str = mno0Var.a(0, M);
                }
                M.j();
                aVar2 = M;
                nzu0.c(kbeVar, a3, str, H, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar2, 3136, 2000);
                aVar2.j();
            }
            aVar2.G();
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new n74(bVar, q630Var, i, 4);
        }
    }

    public static final void b(PosterCardState.Size size, PosterCardState.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-410817677);
        int i2 = (M.o(size.ordinal()) ? 4 : 2) | i | (M.J(bVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(-410817677, i2, -1, "com.vk.libvideo.design.compose.movie.poster.MiddleView (PosterCard.kt:88)");
            }
            M.K(341210229);
            a(bVar, q630Var, M, 48);
            M.j();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ex(i, 7, size, bVar, q630Var);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final void c(PosterCardState posterCardState, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        PreviewViewState.Size size;
        q630 x;
        PosterCardState.b bVar = posterCardState.b;
        PreviewViewState previewViewState = posterCardState.a;
        androidx.compose.runtime.a M = aVar.M(1281475420);
        int i4 = i | (M.J(posterCardState) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i4 | (M.J(q630Var2) ? 32 : 16);
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            q630.a aVar2 = q630.a.a;
            if (i5 != 0) {
                q630Var2 = aVar2;
            }
            if (b.d()) {
                b.f(1281475420, i3, -1, "com.vk.libvideo.design.compose.movie.poster.PosterCard (PosterCard.kt:47)");
            }
            PosterCardState.Size size2 = (PosterCardState.Size) ((zoi) posterCardState.c.getValue()).getValue();
            if (size2 == null) {
                size2 = PosterCardState.Size.Medium;
            }
            zoi<PreviewViewState.Size> h = previewViewState.h();
            int[] iArr = C1226a.$EnumSwitchMapping$0;
            int i6 = iArr[size2.ordinal()];
            if (i6 == 1) {
                size = PreviewViewState.Size.PosterMedium2x3;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                size = PreviewViewState.Size.PosterSmall2x3;
            }
            h.c(size, M, 0);
            int i7 = iArr[size2.ordinal()];
            if (i7 == 1) {
                x = txj0.x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2);
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                x = txj0.w(q630Var2, 96, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, x);
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
            M.K(976086175);
            com.vk.libvideo.design.compose.base.preview.c.D(previewViewState, null, M, 0, 2);
            M.j();
            b(size2, bVar, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 384);
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var3 = q630Var2;
        f s = M.s();
        if (s != null) {
            s.d = new ad2(posterCardState, q630Var3, i, i2, 3);
        }
    }
}
