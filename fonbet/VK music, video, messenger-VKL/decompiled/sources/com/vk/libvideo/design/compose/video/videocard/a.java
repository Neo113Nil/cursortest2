package com.vk.libvideo.design.compose.video.videocard;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.ahn;
import xsna.akv0;
import xsna.alb0;
import xsna.ckv0;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.eai;
import xsna.epx;
import xsna.fwu0;
import xsna.h7c;
import xsna.i7c;
import xsna.k9q0;
import xsna.kbe;
import xsna.ldu0;
import xsna.lg90;
import xsna.mno0;
import xsna.n34;
import xsna.nzu0;
import xsna.phw;
import xsna.q630;
import xsna.qq0;
import xsna.qri;
import xsna.rmw;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.wdj0;
import xsna.wkj;
import xsna.wzs;
import xsna.xpy;
import xsna.ylu0;
import xsna.yzs;
import xsna.zoi;

/* compiled from: VideoCardView.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: VideoCardView.kt */
    /* renamed from: com.vk.libvideo.design.compose.video.videocard.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1227a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoCardViewState.Size.values().length];
            try {
                iArr[VideoCardViewState.Size.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoCardViewState.Size.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoCardViewState.Size.Sharp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(VideoCardViewState.c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630.a aVar2;
        boolean z;
        String str;
        androidx.compose.runtime.a M = aVar.M(96826480);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(96826480, i2, -1, "com.vk.libvideo.design.compose.video.videocard.MiddleContentView (VideoCardView.kt:108)");
            }
            dai.c d = cVar.d();
            q630.a aVar3 = q630.a.a;
            q630 g = eai.b(aVar3, d).g(q630Var);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a = j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str2 = cVar.a;
            if (str2 == null) {
                M.K(-477219982);
                M.j();
                aVar2 = aVar3;
                z = true;
            } else {
                M.K(-477219981);
                aVar2 = aVar3;
                M = M;
                z = true;
                ldu0.b(phw.a.a(fwu0.l(null, str2, null, null, M, 0, 61), null, wkj.a.a, null, null, M, 197000, 26), 40, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), null, null, false, null, cVar.a().c, null, M, Tensorflow.FRAME_WIDTH, 376);
                M.j();
            }
            VideoMetaViewState videoMetaViewState = cVar.b;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            com.vk.libvideo.design.compose.base.datacontent.presets.b.l(videoMetaViewState, new xpy(1.0f, z), M, 0);
            rmw rmwVar = cVar.c;
            if (rmwVar == null) {
                M.K(-476699430);
            } else {
                M.K(-476699429);
                boolean z2 = cVar.b().h() != null ? z : false;
                float f = 8;
                q630 H = s200.H(aVar2, 12, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 4);
                kbe kbeVar = cVar.b().c;
                lg90 a2 = rmw.b.a(null, rmwVar, M, 0, 3);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                long j = ylu0Var.getIcon().j;
                mno0 mno0Var = cVar.d;
                if (mno0Var == null) {
                    M.K(1660225636);
                    M.j();
                    str = null;
                } else {
                    M.K(-639180995);
                    String a3 = mno0Var.a(0, M);
                    M.j();
                    str = a3;
                }
                androidx.compose.runtime.a aVar5 = M;
                nzu0.c(kbeVar, a2, str, H, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, z2, null, null, aVar5, 3136, 1744);
                M = aVar5;
            }
            M.j();
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new i7c(cVar, q630Var, i, 5);
        }
    }

    public static final void b(VideoCardViewState.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1144246285);
        if ((i & 6) == 0) {
            i2 = (M.o(size.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-1144246285, i2, -1, "com.vk.libvideo.design.compose.video.videocard.MiddleSkeletonView (VideoCardView.kt:146)");
            }
            q630 a = wdj0.a(q630Var, ckv0.b(null, M, 1));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            k a2 = j.a(lVar, dt1.a.k, M, 0);
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
            Object x = M.x();
            if (x == a.C0011a.a) {
                VideoMetaViewState videoMetaViewState = new VideoMetaViewState(new VideoMetaViewState.f(i3), size == VideoCardViewState.Size.Small ? null : new VideoMetaViewState.f(i3), new VideoMetaViewState.f(0.5f));
                M.R(videoMetaViewState);
                x = videoMetaViewState;
            }
            VideoMetaViewState videoMetaViewState2 = (VideoMetaViewState) x;
            akv0.a(SkeletonType.Circle, txj0.q(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 40), M, 54);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            com.vk.libvideo.design.compose.base.datacontent.presets.b.l(videoMetaViewState2, new xpy(1.0f, true), M, 6);
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new h7c(size, q630Var, i, 3);
        }
    }

    public static final void c(VideoCardViewState.Size size, VideoCardViewState.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1952407961);
        int i2 = (M.o(size.ordinal()) ? 4 : 2) | i | (M.J(bVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(-1952407961, i2, -1, "com.vk.libvideo.design.compose.video.videocard.MiddleView (VideoCardView.kt:97)");
            }
            if (bVar instanceof VideoCardViewState.c) {
                M.K(636664713);
                a((VideoCardViewState.c) bVar, q630Var, M, (i2 >> 3) & 112);
                M.j();
            } else {
                if (!epx.f(bVar, VideoCardViewState.d.a)) {
                    throw alb0.c(636662871, M);
                }
                M.K(636667081);
                b(size, q630Var, M, (i2 & 14) | ((i2 >> 3) & 112));
                M.j();
            }
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new qq0(i, 11, size, bVar, q630Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final VideoCardViewState videoCardViewState, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final q630 q630Var2;
        f s;
        PreviewViewState.Size size;
        q630 x;
        q630 H;
        PreviewViewState previewViewState = videoCardViewState.a;
        androidx.compose.runtime.a M = aVar.M(-749258880);
        int i3 = (M.J(videoCardViewState) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                M.h();
            } else {
                q630.a aVar2 = q630.a.a;
                if (i4 != 0) {
                    q630Var2 = aVar2;
                }
                if (b.d()) {
                    b.f(-749258880, i3, -1, "com.vk.libvideo.design.compose.video.videocard.VideoCardView (VideoCardView.kt:62)");
                }
                VideoCardViewState.Size value = videoCardViewState.d().getValue();
                if (value == null) {
                    value = VideoCardViewState.Size.Medium;
                }
                zoi<PreviewViewState.Size> h = previewViewState.h();
                int[] iArr = C1227a.$EnumSwitchMapping$0;
                int i5 = iArr[value.ordinal()];
                if (i5 == 1) {
                    size = PreviewViewState.Size.VideoMedium16x9;
                } else if (i5 == 2) {
                    size = PreviewViewState.Size.VideoSmall16x9;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    size = PreviewViewState.Size.VideoMedium16x9;
                }
                h.c(size, M, 0);
                int i6 = iArr[value.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        x = txj0.w(q630Var2, 96, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                        q630 E = ahn.E(x, "mvi_video_card");
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c = qri.c(M, E);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (M.N() != null) {
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
                        if (value == VideoCardViewState.Size.Sharp) {
                            float f = 12;
                            H = s200.H(aVar2, f, 8, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                        } else {
                            H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        }
                        com.vk.libvideo.design.compose.base.preview.c.D(previewViewState, null, M, 0, 2);
                        yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, ? extends s3q0> h2 = videoCardViewState.b().h();
                        if (h2 == null) {
                            M.K(2107657787);
                        } else {
                            M.K(1314914950);
                            h2.invoke(aVar2, M, 6);
                        }
                        M.j();
                        c(value, videoCardViewState.b, H, M, 0);
                        M.K(2107777974);
                        M.j();
                        M.G();
                        if (b.d()) {
                            b.e();
                        }
                    } else if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                x = txj0.x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2);
                q630 E2 = ahn.E(x, "mvi_video_card");
                a.m mVar2 = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                c a2 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, E2);
                cri.h7.getClass();
                LayoutNode.a aVar32 = cri.a.b;
                if (M.N() != null) {
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.n8s0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        com.vk.libvideo.design.compose.video.videocard.a.d(VideoCardViewState.this, q630Var2, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 19) == 18)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
