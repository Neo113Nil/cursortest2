package com.vk.libvideo.design.compose.video.videocell;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.preview.c;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.a73;
import xsna.alb0;
import xsna.cri;
import xsna.dt1;
import xsna.eai;
import xsna.epx;
import xsna.h0k;
import xsna.h750;
import xsna.ir;
import xsna.k9q0;
import xsna.kbe;
import xsna.lg90;
import xsna.n34;
import xsna.nzu0;
import xsna.pg90;
import xsna.pvi;
import xsna.pzu0;
import xsna.q630;
import xsna.qri;
import xsna.ra5;
import xsna.rmw;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sy90;
import xsna.tpg0;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.wzs;
import xsna.ylu0;
import xsna.zko0;
import xsna.zoi;

/* compiled from: VideoCellView.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: VideoCellView.kt */
    /* renamed from: com.vk.libvideo.design.compose.video.videocell.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1228a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoCellViewState.Size.values().length];
            try {
                iArr[VideoCellViewState.Size.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoCellViewState.Size.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(VideoCellViewState.c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1884169490);
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
                b.f(1884169490, i2, -1, "com.vk.libvideo.design.compose.video.videocell.AfterIconView (VideoCellView.kt:179)");
            }
            boolean z = cVar.a().h() != null;
            q630 value = cVar.b().getValue();
            if (value == null) {
                value = q630.a.a;
            }
            q630 g = q630Var.g(value);
            kbe kbeVar = cVar.a().c;
            lg90 a = rmw.b.a(null, cVar.a, M, 0, 3);
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            long j = ylu0Var.getIcon().j;
            M.K(366134853);
            M.j();
            aVar2 = M;
            nzu0.c(kbeVar, a, null, g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, z, null, null, aVar2, 64, 1744);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new pvi(cVar, q630Var, i, 3);
        }
    }

    public static final void b(VideoCellViewState.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar2.M(-917162944);
        int i4 = (M.J(aVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (M.J(q630Var) ? 32 : 16);
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                q630Var = q630.a.a;
            }
            if (b.d()) {
                b.f(-917162944, i3, -1, "com.vk.libvideo.design.compose.video.videocell.AfterView (VideoCellView.kt:137)");
            }
            if (!(aVar instanceof VideoCellViewState.c)) {
                throw alb0.c(-925289736, M);
            }
            M.K(-925288130);
            a((VideoCellViewState.c) aVar, q630Var, M, i3 & 112);
            M.j();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ra5(aVar, q630Var, i, i2);
        }
    }

    public static final void c(VideoCellViewState.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1403184526);
        int i2 = (M.J(bVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-1403184526, i2, -1, "com.vk.libvideo.design.compose.video.videocell.BottomView (VideoCellView.kt:157)");
            }
            if (bVar instanceof VideoCellViewState.g) {
                M.K(159407093);
                com.vk.libvideo.design.compose.base.datacontent.presets.b.l(((VideoCellViewState.g) bVar).a, q630Var, M, 48);
                M.j();
            } else {
                if (!epx.f(bVar, VideoCellViewState.f.a)) {
                    throw alb0.c(159405363, M);
                }
                M.K(159409480);
                f(q630Var, M, 6);
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
            s.d = new h0k(bVar, q630Var, i, 9);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1430479765);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-1430479765, i2, -1, "com.vk.libvideo.design.compose.video.videocell.DraggableIcon (VideoCellView.kt:144)");
            }
            if (b.d()) {
                b.f(-953489174, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MenuOutline24> (VkSdkIcons.kt:2546)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_menu_outline_24, 0, M);
            if (b.d()) {
                b.e();
            }
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            q630Var2 = q630Var;
            pzu0.b(a, "DragIcon", q630Var2, ylu0Var.getIcon().l, M, 56 | ((i2 << 6) & 896), 0);
            if (b.d()) {
                b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new h750(q630Var2, i, 2);
        }
    }

    public static final void e(VideoCellViewState.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-584513358);
        int i2 = (M.J(dVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-584513358, i2, -1, "com.vk.libvideo.design.compose.video.videocell.MiddleView (VideoCellView.kt:126)");
            }
            if (dVar instanceof VideoCellViewState.g) {
                M.K(923384373);
                com.vk.libvideo.design.compose.base.datacontent.presets.b.l(((VideoCellViewState.g) dVar).a, q630Var, M, i2 & 112);
                M.j();
            } else {
                if (!epx.f(dVar, VideoCellViewState.f.a)) {
                    throw alb0.c(923382643, M);
                }
                M.K(923386760);
                f(q630Var, M, (i2 >> 3) & 14);
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
            s.d = new a73(dVar, q630Var, i, 7);
        }
    }

    public static final void f(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1835171043);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(1835171043, i2, -1, "com.vk.libvideo.design.compose.video.videocell.SkeletonView (VideoCellView.kt:167)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new VideoMetaViewState(new VideoMetaViewState.f(i3), new VideoMetaViewState.f(i3), new VideoMetaViewState.f(0.5f));
                M.R(x);
            }
            com.vk.libvideo.design.compose.base.datacontent.presets.b.l((VideoMetaViewState) x, q630Var, M, ((i2 << 3) & 112) | 6);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new zko0(q630Var, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final VideoCellViewState videoCellViewState, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final q630 q630Var2;
        f s;
        PreviewViewState.Size size;
        int i3;
        int i4;
        int i5;
        VideoCellViewState.d dVar;
        int i6;
        boolean z;
        q630 q630Var3;
        VideoCellViewState.d dVar2 = videoCellViewState.b;
        VideoCellViewState.b bVar = videoCellViewState.d;
        PreviewViewState previewViewState = videoCellViewState.a;
        VideoCellViewState.a aVar2 = videoCellViewState.c;
        androidx.compose.runtime.a M = aVar.M(579822308);
        int i7 = i | (M.J(videoCellViewState) ? 4 : 2);
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i7 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i7 & 1, (i7 & 19) == 18)) {
                M.h();
            } else {
                q630.a aVar3 = q630.a.a;
                if (i8 != 0) {
                    q630Var2 = aVar3;
                }
                if (b.d()) {
                    b.f(579822308, i7, -1, "com.vk.libvideo.design.compose.video.videocell.VideoCellView (VideoCellView.kt:44)");
                }
                VideoCellViewState.Size value = videoCellViewState.f().getValue();
                if (value == null) {
                    value = VideoCellViewState.Size.Small;
                }
                zoi<PreviewViewState.Size> h = previewViewState.h();
                int[] iArr = C1228a.$EnumSwitchMapping$0;
                int i9 = iArr[value.ordinal()];
                if (i9 == 1) {
                    size = PreviewViewState.Size.VideoMedium16x9;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    size = PreviewViewState.Size.VideoSmall16x9;
                }
                h.c(size, M, 0);
                int i10 = iArr[value.ordinal()];
                if (i10 == 1) {
                    i3 = 16;
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 12;
                }
                float f = i3;
                int i11 = iArr[value.ordinal()];
                if (i11 == 1) {
                    i4 = 170;
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = 80;
                }
                float f2 = i4;
                int i12 = iArr[value.ordinal()];
                if (i12 == 1) {
                    i5 = Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = 142;
                }
                float f3 = i5;
                q630 q630Var4 = q630Var2;
                q630 j = txj0.j(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var2, 1.0f));
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = ir.h(M);
                }
                q630 a = eai.a(j, (sg50) x, videoCellViewState.d());
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                ty6.a aVar4 = dt1.a.n;
                a.j h2 = androidx.compose.foundation.layout.a.h(f, aVar4);
                ty6.b bVar2 = dt1.a.k;
                k a2 = j.a(h2, bVar2, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, a);
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
                k9q0.w(M, a2, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar3 = cri.a.g;
                k9q0.w(M, valueOf, bVar3);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar3 = cri.a.d;
                k9q0.w(M, c, dVar3);
                VideoCellViewState.e eVar2 = videoCellViewState.e;
                tpg0 tpg0Var = tpg0.a;
                if (eVar2 == null) {
                    M.K(1444262566);
                    M.j();
                    dVar = dVar2;
                    i6 = 0;
                } else {
                    dVar = dVar2;
                    M.K(1444262567);
                    q630 value2 = eVar2.a.getValue();
                    if (value2 == null) {
                        value2 = aVar3;
                    }
                    i6 = 0;
                    d(txj0.q(tpg0Var.a(value2, dt1.a.l), 24), M, 0);
                    s3q0 s3q0Var = s3q0.a;
                    M.j();
                }
                c.D(previewViewState, txj0.v(aVar3, f3), M, i6, i6);
                VideoCellViewState.Size size2 = VideoCellViewState.Size.Medium;
                if (value != size2 || bVar == null) {
                    VideoCellViewState.d dVar4 = dVar;
                    M.K(1445249111);
                    if (value != size2) {
                        bVar2 = dt1.a.l;
                    }
                    if (value == size2) {
                        z = true;
                        q630Var3 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar3);
                    } else {
                        z = true;
                        q630Var3 = aVar3;
                    }
                    e(dVar4, tpg0Var.a(tpg0Var.b(1.0f, aVar3, z), bVar2).g(q630Var3), M, 0);
                    if (aVar2 == null) {
                        M.K(1445811946);
                    } else {
                        M.K(1445811947);
                        b(aVar2, tpg0Var.a(aVar3, bVar2).g(q630Var3), M, 0, 0);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    M.j();
                    M.j();
                } else {
                    M.K(1444587881);
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar4, M, i6);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, aVar3);
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
                    k9q0.w(M, a3, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar3, M, c2678a);
                    k9q0.w(M, c2, dVar3);
                    float f4 = 8;
                    q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    k a4 = j.a(androidx.compose.foundation.layout.a.a, bVar2, M, 48);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c3 = qri.c(M, H);
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
                    k9q0.w(M, a4, cVar);
                    k9q0.w(M, D3, eVar);
                    ur.d(hashCode3, M, bVar3, M, c2678a);
                    k9q0.w(M, c3, dVar3);
                    e(dVar, tpg0Var.b(1.0f, aVar3, true), M, 0);
                    if (aVar2 == null) {
                        M.K(-197698958);
                    } else {
                        M.K(-197698957);
                        b(aVar2, null, M, 0, 2);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                    M.j();
                    M.G();
                    c(bVar, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 5), M, 48);
                    M.G();
                    M.j();
                    s3q0 s3q0Var4 = s3q0.a;
                }
                M.G();
                if (b.d()) {
                    b.e();
                }
                q630Var2 = q630Var4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.was0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        com.vk.libvideo.design.compose.video.videocell.a.g(VideoCellViewState.this, q630Var2, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i7 & 1, (i7 & 19) == 18)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
