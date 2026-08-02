package com.vk.libvideo.design.compose.base.preview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a6d0;
import xsna.ahn;
import xsna.alb0;
import xsna.anp;
import xsna.azl;
import xsna.b6d0;
import xsna.b8d;
import xsna.bap;
import xsna.bhu0;
import xsna.bta;
import xsna.byc0;
import xsna.cp10;
import xsna.cp8;
import xsna.cri;
import xsna.d370;
import xsna.dai;
import xsna.dt1;
import xsna.dy0;
import xsna.dyn;
import xsna.eai;
import xsna.egi0;
import xsna.epx;
import xsna.f370;
import xsna.frv0;
import xsna.g7c;
import xsna.gly;
import xsna.gzs;
import xsna.h7g;
import xsna.hl1;
import xsna.hr80;
import xsna.hy7;
import xsna.i7c;
import xsna.ijk;
import xsna.io7;
import xsna.izs;
import xsna.ja8;
import xsna.jai;
import xsna.k7c;
import xsna.k9q0;
import xsna.kai;
import xsna.kbe;
import xsna.kka;
import xsna.kqu0;
import xsna.kr;
import xsna.ks3;
import xsna.l5g;
import xsna.lg90;
import xsna.lwj0;
import xsna.mku0;
import xsna.mm2;
import xsna.mno0;
import xsna.msy;
import xsna.n020;
import xsna.n34;
import xsna.n5c;
import xsna.ns70;
import xsna.ny5;
import xsna.nzu0;
import xsna.or;
import xsna.own;
import xsna.pco;
import xsna.pg90;
import xsna.pqv;
import xsna.py5;
import xsna.pzl;
import xsna.pzu0;
import xsna.q020;
import xsna.q5v;
import xsna.q630;
import xsna.qed;
import xsna.qiz;
import xsna.qri;
import xsna.qzu0;
import xsna.ra8;
import xsna.rf5;
import xsna.rmw;
import xsna.rnu0;
import xsna.rrv0;
import xsna.rte0;
import xsna.s200;
import xsna.s3q0;
import xsna.sua;
import xsna.sy90;
import xsna.t3g;
import xsna.txj0;
import xsna.ty6;
import xsna.u67;
import xsna.uco;
import xsna.uez;
import xsna.uog0;
import xsna.ur;
import xsna.us2;
import xsna.uvi;
import xsna.v7d;
import xsna.vog0;
import xsna.w65;
import xsna.w78;
import xsna.wh50;
import xsna.wlb0;
import xsna.wuv0;
import xsna.wzs;
import xsna.x2d;
import xsna.xs2;
import xsna.xyc;
import xsna.y78;
import xsna.yf4;
import xsna.yk8;
import xsna.ylu0;
import xsna.yn7;
import xsna.yqv0;
import xsna.zoi;
import xsna.zx20;

/* compiled from: PreviewView.kt */
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: PreviewView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PreviewViewState.Size.values().length];
            try {
                iArr[PreviewViewState.Size.VideoMedium16x9.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreviewViewState.Size.VideoSmall16x9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreviewViewState.Size.PosterMedium2x3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreviewViewState.Size.PosterSmall2x3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreviewViewState.Size.Clip9x16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PreviewViewState.DurationBadge.IconState.values().length];
            try {
                iArr2[PreviewViewState.DurationBadge.IconState.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PreviewViewState.DurationBadge.IconState.Progress.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PreviewViewState.DurationBadge.IconState.MusicNote.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void A(PreviewViewState.z zVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1995821535);
        int i2 = (M.J(zVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1995821535, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewTopRight (PreviewView.kt:233)");
            }
            if (zVar instanceof PreviewViewState.a) {
                M.K(-1865880514);
                d((PreviewViewState.a) zVar, q630Var, M, i2 & 112);
                M.j();
            } else if (zVar instanceof PreviewViewState.f) {
                M.K(-1865878275);
                i((PreviewViewState.f) zVar, q630Var, M, i2 & 112);
                M.j();
            } else if (zVar instanceof PreviewViewState.j) {
                M.K(-1865875869);
                l((PreviewViewState.j) zVar, q630Var, M, i2 & 112, 0);
                M.j();
            } else {
                if (!(zVar instanceof PreviewViewState.n)) {
                    throw alb0.c(-1865881546, M);
                }
                M.K(-2007491870);
                M.K(-2007251930);
                PreviewViewState.n nVar = (PreviewViewState.n) zVar;
                B(nVar, eai.b(q630Var, nVar.a()), M, 0);
                M.j();
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
            s.d = new hy7(zVar, q630Var, i, 4);
        }
    }

    public static final void B(PreviewViewState.n nVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        l5g l5gVar;
        String a2;
        androidx.compose.runtime.a M = aVar.M(-638994600);
        int i2 = (M.J(nVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-638994600, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewTopRightIcon (PreviewView.kt:550)");
            }
            VkColorToken vkColorToken = nVar.c;
            l5g l5gVar2 = null;
            if (vkColorToken == null) {
                M.K(-992862919);
                M.j();
                l5gVar = null;
            } else {
                M.K(106519496);
                long a3 = vkColorToken.a(0, M);
                M.j();
                l5gVar = new l5g(a3);
            }
            q630 q630Var2 = q630.a.a;
            if (l5gVar != null) {
                q630 m = hr80.m(rte0.d(q630Var2, vog0.b(8)), l5gVar.a, e.a);
                if (m != null) {
                    q630Var2 = m;
                }
            }
            q630 D = s200.D(q630Var.g(q630Var2), 6);
            lg90 a4 = rmw.b.a(null, nVar.a, M, 0, 3);
            mno0 mno0Var = nVar.b;
            if (mno0Var == null) {
                M.K(-992547649);
                M.j();
                a2 = null;
            } else {
                M.K(106529666);
                a2 = mno0Var.a(0, M);
                M.j();
            }
            VkColorToken vkColorToken2 = nVar.d;
            if (vkColorToken2 == null) {
                M.K(-992508775);
                M.j();
            } else {
                M.K(106530920);
                long a5 = vkColorToken2.a(0, M);
                M.j();
                l5gVar2 = new l5g(a5);
            }
            pzu0.b(a4, a2, D, l5gVar2 != null ? l5gVar2.a : l5g.k, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new yf4(nVar, q630Var, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(PreviewViewState.v vVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        PreviewViewState.v vVar2;
        String a2;
        wh50 wh50Var;
        String str;
        PreviewViewState.v vVar3;
        androidx.compose.runtime.a M = aVar.M(-852541634);
        if ((i & 6) == 0) {
            i2 = (M.J(vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-852541634, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewTopText (PreviewView.kt:757)");
            }
            mno0 mno0Var = vVar.a;
            if (mno0Var == null) {
                M.K(-1926053095);
                M.j();
                a2 = null;
            } else {
                M.K(1046247912);
                a2 = mno0Var.a(0, M);
                M.j();
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = k.b(a2 == null ? "" : a2);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            if (a2 != null) {
                wh50Var2.setValue(a2);
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = k.b(null);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = k.b(Boolean.TRUE);
                M.R(x3);
            }
            wh50 wh50Var4 = (wh50) x3;
            int i3 = i2 & 14;
            boolean J = (i3 == 4) | M.J(a2);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                String str2 = a2;
                b bVar = new b(str2, wh50Var4, wh50Var3, vVar, null);
                wh50Var = wh50Var4;
                str = str2;
                vVar3 = vVar;
                M.R(bVar);
                x4 = bVar;
            } else {
                wh50Var = wh50Var4;
                vVar3 = vVar;
                str = a2;
            }
            bap.g(str, (wzs) x4, M, 0);
            s3q0 s3q0Var = s3q0.a;
            boolean z = i3 == 4;
            Object x5 = M.x();
            if (z || x5 == c0012a) {
                x5 = new hl1(29, wh50Var, vVar3);
                M.R(x5);
            }
            bap.c(s3q0Var, (izs) x5, M, 6);
            q630Var2 = q630Var;
            vVar2 = vVar3;
            mm2.f(((Boolean) wh50Var.getValue()).booleanValue(), s200.H(q630Var2, 12, 46, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), anp.e(null, 3), anp.f(null, 3), null, kai.c(1135569942, new uez(wh50Var2, 2), M), M, 200064, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            vVar2 = vVar;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new g7c(vVar2, q630Var2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void D(final PreviewViewState previewViewState, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        final q630 q630Var3;
        f s;
        ?? r19;
        PlaceholderViewState.Size size;
        q630 x;
        q630 q630Var4;
        q020 q020Var = previewViewState.a;
        androidx.compose.runtime.a M = aVar.M(-408355010);
        if ((i & 6) == 0) {
            i3 = (M.J(previewViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar2 = q630.a.a;
                q630Var3 = i4 != 0 ? aVar2 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-408355010, i3, -1, "com.vk.libvideo.design.compose.base.preview.PreviewView (PreviewView.kt:103)");
                }
                PreviewViewState.Size value = previewViewState.h().getValue();
                if (value == null) {
                    value = PreviewViewState.Size.VideoMedium16x9;
                }
                PlaceholderViewState a2 = previewViewState.a();
                zoi zoiVar = a2 != null ? (zoi) a2.f.getValue() : null;
                if (zoiVar == null) {
                    M.K(-1956471583);
                    M.j();
                    r19 = 0;
                } else {
                    r19 = 0;
                    M.K(-1587132640);
                    int i5 = a.$EnumSwitchMapping$0[value.ordinal()];
                    if (i5 == 1) {
                        size = PlaceholderViewState.Size.Medium;
                    } else if (i5 == 2) {
                        size = PlaceholderViewState.Size.Small;
                    } else if (i5 == 3) {
                        size = PlaceholderViewState.Size.Medium;
                    } else if (i5 == 4) {
                        size = PlaceholderViewState.Size.Small;
                    } else {
                        if (i5 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        size = PlaceholderViewState.Size.Small;
                    }
                    zoiVar.c(size, M, 0);
                    M.j();
                }
                PlaceholderViewState a3 = previewViewState.a();
                zoi<PlaceholderViewState.Appearance> a4 = a3 != null ? a3.a() : r19;
                if (a4 == null) {
                    M.K(-1956361533);
                } else {
                    M.K(-1587129090);
                    a4.c(q020Var.a != null ? PlaceholderViewState.Appearance.Overlay : PlaceholderViewState.Appearance.Neutral, M, 0);
                }
                M.j();
                float f = previewViewState.j;
                pco pcoVar = q020Var.f;
                int i6 = a.$EnumSwitchMapping$0[value.ordinal()];
                if (i6 == 1) {
                    x = txj0.x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
                } else if (i6 == 2) {
                    x = txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 1, aVar2);
                } else if (i6 == 3) {
                    x = txj0.x(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
                } else if (i6 == 4) {
                    x = txj0.w(aVar2, 96, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                } else {
                    if (i6 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x = txj0.w(aVar2, 120, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                }
                q630 d = sua.d(f, q630Var3.g(x), false);
                if (pcoVar == null || (q630Var4 = rte0.d(aVar2, vog0.b(pcoVar.b))) == null) {
                    q630Var4 = aVar2;
                }
                q630 g = d.g(q630Var4);
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.b;
                cp10 d2 = ja8.d(ty6Var, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, g);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw r19;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                n020.b(q020Var, f370.P(aVar2, -2.0f), M, 0);
                boolean f2 = epx.f(previewViewState.l().getValue(), Boolean.TRUE);
                b(f2, previewViewState.i, txj0.d(aVar2, 1.0f), kai.c(-2105208135, new xs2(value, 4), M), M, 3456);
                q630 D2 = s200.D(aVar2, kqu0.t);
                PreviewViewState.z zVar = previewViewState.d;
                ra8 ra8Var = ra8.a;
                if (zVar == null) {
                    M.K(-1504045431);
                } else {
                    M.K(-1504045430);
                    A(zVar, ra8Var.b(D2, dt1.a.d), M, 0);
                }
                M.j();
                b(f2, previewViewState.e, ra8Var.b(D2, ty6Var), com.vk.libvideo.design.compose.base.preview.a.a, M, 3072);
                PreviewViewState.e eVar = previewViewState.b;
                if (eVar == null) {
                    M.K(-1503607370);
                } else {
                    M.K(-1503607369);
                    h(eVar, value, ra8Var.b(D2, dt1.a.j), M, 0);
                }
                M.j();
                b(f2, previewViewState.c, ra8Var.b(D2, dt1.a.h), com.vk.libvideo.design.compose.base.preview.a.b, M, 3072);
                PreviewViewState.x xVar = previewViewState.g;
                if (xVar == null) {
                    M.K(-1503140572);
                } else {
                    M.K(-1503140571);
                    y(xVar, ra8Var.b(aVar2, dt1.a.c), M, 0);
                }
                M.j();
                PreviewViewState.c cVar = previewViewState.h;
                if (cVar == null) {
                    M.K(-1502974722);
                } else {
                    M.K(-1502974721);
                    f(cVar, ra8Var.b(aVar2, dt1.a.i), M, 0);
                }
                M.j();
                b(f2, previewViewState.f, txj0.d(aVar2, 1.0f), com.vk.libvideo.design.compose.base.preview.a.c, M, 3456);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.c6d0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        com.vk.libvideo.design.compose.base.preview.c.D(PreviewViewState.this, q630Var3, (androidx.compose.runtime.a) obj, I, i2);
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

    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(721014744);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(721014744, i2, -1, "com.vk.libvideo.design.compose.base.preview.GradientView (PreviewView.kt:736)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                long j = l5g.b;
                x = yk8.a.h(new Pair[]{new Pair(valueOf, new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), new Pair(Float.valueOf(0.15f), new l5g(l5g.c(14, j, 0.02f))), new Pair(Float.valueOf(0.3f), new l5g(l5g.c(14, j, 0.08f))), new Pair(Float.valueOf(0.7f), new l5g(l5g.c(14, j, 0.32f))), new Pair(Float.valueOf(0.85f), new l5g(l5g.c(14, j, 0.38f))), new Pair(Float.valueOf(1.0f), new l5g(l5g.c(14, j, 0.4f)))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                M.R(x);
            }
            ja8.a(hr80.l(q630Var, (yk8) x, null, 6), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new k7c(q630Var, i, 1);
        }
    }

    public static final void b(final boolean z, Object obj, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        jai jaiVar2;
        final q630 q630Var2;
        final Object obj2;
        androidx.compose.runtime.a M = aVar.M(-2071295289);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(obj) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2071295289, i2, -1, "com.vk.libvideo.design.compose.base.preview.OptionalCrossfade (PreviewView.kt:830)");
            }
            if (z) {
                M.K(-162623183);
                jaiVar2 = jaiVar;
                ijk.a(obj, q630Var, null, null, jaiVar2, M, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 24576, 12);
                obj2 = obj;
                q630Var2 = q630Var;
                M.j();
            } else {
                jaiVar2 = jaiVar;
                q630Var2 = q630Var;
                obj2 = obj;
                M.K(-162482319);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                jaiVar2.invoke(obj2, M, Integer.valueOf(((i2 >> 3) & 14) | 48));
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            q630Var2 = q630Var;
            obj2 = obj;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            final jai jaiVar3 = jaiVar2;
            s.d = new wzs() { // from class: xsna.d6d0
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    com.vk.libvideo.design.compose.base.preview.c.b(z, obj2, q630Var2, jaiVar3, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(PreviewViewState.n nVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        l5g l5gVar;
        String a2;
        androidx.compose.runtime.a M = aVar.M(1587043081);
        int i2 = (M.J(nVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1587043081, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewActionIcon (PreviewView.kt:483)");
            }
            VkColorToken vkColorToken = nVar.c;
            l5g l5gVar2 = null;
            if (vkColorToken == null) {
                M.K(600634568);
                M.j();
                l5gVar = null;
            } else {
                M.K(435017305);
                long a3 = vkColorToken.a(0, M);
                M.j();
                l5gVar = new l5g(a3);
            }
            long j = ((l5g) lwj0.b(l5gVar != null ? l5gVar.a : l5g.j, null, null, M, 0, 14).getValue()).a;
            uog0 uog0Var = vog0.a;
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(rte0.d(hr80.m(aVar2, j, uog0Var), uog0Var), 6);
            kbe kbeVar = nVar.a().c;
            lg90 a4 = rmw.b.a(null, nVar.a, M, 0, 3);
            mno0 mno0Var = nVar.b;
            if (mno0Var == null) {
                M.K(601088718);
                M.j();
                a2 = null;
            } else {
                M.K(435031955);
                a2 = mno0Var.a(0, M);
                M.j();
            }
            VkColorToken vkColorToken2 = nVar.d;
            if (vkColorToken2 == null) {
                M.K(601127592);
                M.j();
            } else {
                M.K(435033209);
                long a5 = vkColorToken2.a(0, M);
                M.j();
                l5gVar2 = new l5g(a5);
            }
            String str = a2;
            q630Var2 = aVar2;
            nzu0.c(kbeVar, a4, str, D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l5gVar2 != null ? l5gVar2.a : l5g.k, false, null, false, null, null, M, 64, 2000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        f s = M.s();
        if (s != null) {
            s.d = new yn7(nVar, q630Var2, i, 10);
        }
    }

    public static final void d(PreviewViewState.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(75718761);
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
                androidx.compose.runtime.b.f(75718761, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewActions (PreviewView.kt:462)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = j.a(g, dt1.a.l, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            PreviewViewState.n nVar = aVar.a;
            if (nVar == null) {
                M.K(-596332449);
            } else {
                M.K(-596332448);
                c(nVar, null, M, 0);
            }
            M.j();
            PreviewViewState.n nVar2 = aVar.b;
            if (nVar2 == null) {
                M.K(-596277889);
            } else {
                M.K(-596277888);
                c(nVar2, null, M, 0);
            }
            M.j();
            PreviewViewState.n nVar3 = aVar.c;
            if (nVar3 == null) {
                M.K(-596228289);
            } else {
                M.K(-596228288);
                c(nVar3, null, M, 0);
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
            s.d = new ns70(aVar, q630Var, i, 1);
        }
    }

    public static final void e(PreviewViewState.b bVar, PreviewViewState.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1798972936);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1798972936, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewAfter (PreviewView.kt:303)");
            }
            if (bVar instanceof PreviewViewState.q) {
                M.K(-2058822130);
                com.vk.libvideo.design.compose.base.placeholder.a.a(((PreviewViewState.q) bVar).a, q630Var, M, (i2 >> 3) & 112);
                M.j();
            } else if (bVar instanceof PreviewViewState.w) {
                M.K(601110398);
                com.vk.libvideo.design.compose.base.timeline.a.d(((PreviewViewState.w) bVar).a, f370.P(txj0.d(q630Var, 1.0f), 1.0f), f370.P(txj0.d(q630.a.a, 1.0f), -1.0f), M, 0);
                M.j();
            } else if (bVar instanceof PreviewViewState.r) {
                M.K(-2058808146);
                v((PreviewViewState.r) bVar, size, q630Var, M, i2 & 1008);
                M.j();
            } else if (bVar instanceof PreviewViewState.h) {
                M.K(-2058805624);
                j((PreviewViewState.h) bVar, q630Var, M, (i2 >> 3) & 112);
                M.j();
            } else {
                if (!(bVar instanceof PreviewViewState.i)) {
                    throw alb0.c(-2058823323, M);
                }
                M.K(-2058803024);
                k((PreviewViewState.i) bVar, q630Var, M, (i2 >> 3) & 112);
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
            s.d = new q5v(bVar, size, q630Var, i, 1);
        }
    }

    public static final void f(PreviewViewState.c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-593125217);
        int i2 = (M.J(cVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-593125217, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewBottom (PreviewView.kt:292)");
            }
            if (!(cVar instanceof PreviewViewState.u)) {
                throw alb0.c(1237320702, M);
            }
            M.K(1237322432);
            x((PreviewViewState.u) cVar, q630Var, M, i2 & 112);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new io7(cVar, q630Var, i, 7);
        }
    }

    public static final void g(PreviewViewState.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1352962625);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1352962625, i3, -1, "com.vk.libvideo.design.compose.base.preview.PreviewBottomLeft (PreviewView.kt:214)");
            }
            boolean z = dVar instanceof PreviewViewState.j;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(1178014019);
                l((PreviewViewState.j) dVar, aVar2, M, i3 & 112, 0);
                M.j();
            } else if (dVar instanceof PreviewViewState.n) {
                M.K(-2136193604);
                M.K(-2136069945);
                r((PreviewViewState.n) dVar, M, i3 & 112);
                M.j();
                M.j();
            } else {
                if (!(dVar instanceof PreviewViewState.l)) {
                    throw alb0.c(1178012510, M);
                }
                M.K(1178024129);
                n((PreviewViewState.l) dVar, M, i3 & 112);
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
            s.d = new i7c(dVar, q630Var, i, 3);
        }
    }

    public static final void h(PreviewViewState.e eVar, PreviewViewState.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(130829470);
        int i2 = (M.J(eVar) ? 4 : 2) | i | (M.o(size.ordinal()) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(130829470, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewBottomRight (PreviewView.kt:202)");
            }
            if (eVar instanceof PreviewViewState.j) {
                M.K(1173076162);
                l((PreviewViewState.j) eVar, q630Var, M, (i2 >> 3) & 112, 0);
                M.j();
            } else if (eVar instanceof PreviewViewState.DurationBadge) {
                M.K(1173078787);
                o((PreviewViewState.DurationBadge) eVar, q630Var, M, (i2 >> 3) & 112);
                M.j();
            } else {
                if (!(eVar instanceof PreviewViewState.t)) {
                    throw alb0.c(1173074509, M);
                }
                M.K(1173081416);
                w((PreviewViewState.t) eVar, size, q630Var, M, i2 & 1008);
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
            s.d = new t3g(i, 2, eVar, size, q630Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [xsna.cp8] */
    public static final void i(PreviewViewState.f fVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        com.vk.core.compose.component.semantics.a aVar2;
        ?? a2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(834532031);
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
                androidx.compose.runtime.b.f(834532031, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewButton (PreviewView.kt:508)");
            }
            kbe kbeVar = ((dai.c) fVar.d.getValue()).c;
            int i3 = i2;
            ButtonStyle buttonStyle = fVar.b;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            ButtonSize buttonSize = ButtonSize.Small;
            rmw rmwVar = fVar.c;
            pqv pqvVar = null;
            if (rmwVar == null) {
                M.K(-2021588180);
                M.j();
                aVar2 = null;
            } else {
                M.K(-2021588179);
                float f = 16;
                aVar2 = null;
                pqvVar = cp8.b.a.a(rmw.b.a(new uco(byc0.b(f, f)), rmwVar, M, 6, 2), null, null, null, null, M, 196616, 30);
                M.j();
            }
            mno0 mno0Var = fVar.a;
            if (mno0Var == null) {
                M.K(-2021443720);
                M.j();
                a2 = aVar2;
            } else {
                M.K(-1173586519);
                a2 = mno0Var.a(0, M);
                M.j();
            }
            if (a2 == null) {
                M.K(-2021431258);
                M.j();
                obj = aVar2;
            } else {
                M.K(-2021431257);
                Object a3 = cp8.d.a.a(a2, aVar2, M, 3072, 6);
                M.j();
                obj = a3;
            }
            bhu0.d(kbeVar, buttonStyle, buttonAppearance, q630Var, buttonSize, null, pqvVar, obj, false, null, M, ((i3 << 6) & 7168) | 24960, 3872);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new kka(fVar, q630Var, i, 2);
        }
    }

    public static final void j(PreviewViewState.h hVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1698355809);
        if ((i & 6) == 0) {
            i2 = (M.J(hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1698355809, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewClipMeta (PreviewView.kt:696)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            q630 c2 = txj0.c(txj0.f(aVar3, 1.0f), 0.6f);
            ty6 ty6Var = dt1.a.i;
            ra8 ra8Var = ra8.a;
            a(ra8Var.b(c2, ty6Var), M, 0);
            b8d.b(hVar.a, ra8Var.b(s200.D(aVar3, 8), ty6Var), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new w78(hVar, q630Var, i, 3);
        }
    }

    public static final void k(PreviewViewState.i iVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1473193697);
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
                androidx.compose.runtime.b.f(-1473193697, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewClipMetaCentered (PreviewView.kt:717)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            q630 c2 = txj0.c(txj0.f(aVar3, 1.0f), 0.6f);
            ty6 ty6Var = dt1.a.i;
            ra8 ra8Var = ra8.a;
            a(ra8Var.b(c2, ty6Var), M, 0);
            v7d.a(iVar.a, ra8Var.b(s200.D(aVar3, 8), ty6Var), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new n5c(iVar, q630Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(PreviewViewState.j jVar, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var3;
        f s;
        lg90 a2;
        l5g l5gVar;
        String a3;
        androidx.compose.runtime.a M = aVar.M(1481704511);
        if ((i & 6) == 0) {
            i3 = i | (M.J(jVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1481704511, i3, -1, "com.vk.libvideo.design.compose.base.preview.PreviewContentBadge (PreviewView.kt:416)");
                }
                ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
                int i5 = i3;
                ContentBadgeMode contentBadgeMode = jVar.a;
                ContentBadgeAppearance contentBadgeAppearance = jVar.b;
                rmw rmwVar = jVar.c;
                String str = null;
                if (rmwVar == null) {
                    M.K(2080492707);
                    M.j();
                    a2 = null;
                } else {
                    M.K(-2011097314);
                    float f = 12;
                    a2 = rmw.b.a(new uco(byc0.b(f, f)), rmwVar, M, 6, 2);
                    M.j();
                }
                VkColorToken vkColorToken = jVar.d;
                if (vkColorToken == null) {
                    M.K(2080559698);
                    M.j();
                    l5gVar = null;
                } else {
                    M.K(-2011095153);
                    long a4 = vkColorToken.a(0, M);
                    M.j();
                    l5gVar = new l5g(a4);
                }
                mno0 mno0Var = jVar.e;
                if (mno0Var == null) {
                    M.K(2080604152);
                    M.j();
                    a3 = null;
                } else {
                    M.K(-2011093719);
                    a3 = mno0Var.a(0, M);
                    M.j();
                }
                mno0 mno0Var2 = jVar.f;
                if (mno0Var2 == null) {
                    M.K(2080670616);
                } else {
                    M.K(-2011091575);
                    str = mno0Var2.a(0, M);
                }
                M.j();
                aVar2 = M;
                rnu0.c(contentBadgeSize, contentBadgeMode, contentBadgeAppearance, q630Var4, a2, l5gVar, a3, str, null, null, false, null, false, null, aVar2, ((i5 << 6) & 7168) | 32774, 0, 16128);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new dyn(jVar, q630Var3, i, i2, 1);
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 19) == 18)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void m(PreviewViewState.k kVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(13845697);
        if ((i & 6) == 0) {
            i2 = (M.J(kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(13845697, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewContentBadges (PreviewView.kt:448)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = j.a(g, dt1.a.k, M, 6);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            PreviewViewState.j jVar = kVar.a;
            if (jVar == null) {
                M.K(621893445);
            } else {
                M.K(621893446);
                l(jVar, null, M, 0, 2);
            }
            M.j();
            PreviewViewState.j jVar2 = kVar.b;
            if (jVar2 == null) {
                M.K(621951973);
            } else {
                M.K(621951974);
                l(jVar2, null, M, 0, 2);
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
            s.d = new gly(kVar, q630Var, i, 1);
        }
    }

    public static final void n(PreviewViewState.l lVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1803435615);
        if ((i & 6) == 0) {
            i2 = (M.J(lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1803435615, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewDonutBadge (PreviewView.kt:433)");
            }
            String a2 = lVar.b.a(0, M);
            us2 c = lVar.a.c(M);
            gzs<? extends s3q0> h = lVar.a().h();
            boolean J = M.J(a2);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new rf5(a2, 4);
                M.R(x);
            }
            own.a(c, egi0.b(aVar2, false, (izs) x), h, 0L, M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ny5(lVar, i);
        }
    }

    public static final void o(PreviewViewState.DurationBadge durationBadge, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(620658189);
        if ((i & 6) == 0) {
            i2 = (M.J(durationBadge) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(620658189, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewDurationBadge (PreviewView.kt:328)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = msy.a(LazyThreadSafetyMode.NONE, new dy0(24, context, azlVar));
                M.R(x);
            }
            Lazy lazy = (Lazy) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = msy.a(LazyThreadSafetyMode.NONE, new zx20(context, 1));
                M.R(x2);
            }
            Lazy lazy2 = (Lazy) x2;
            PreviewViewState.DurationBadge.IconState iconState = durationBadge.c;
            int i3 = iconState == null ? -1 : a.$EnumSwitchMapping$1[iconState.ordinal()];
            if (i3 == -1) {
                M.K(195146288);
                M.j();
                lg90Var = null;
            } else if (i3 == 1) {
                M.K(194849650);
                lg90Var = w65.p((Drawable) lazy.getValue(), M, 0);
                M.j();
            } else if (i3 == 2) {
                M.K(194978734);
                lg90Var = w65.p((Drawable) lazy2.getValue(), M, 0);
                M.j();
            } else {
                if (i3 != 3) {
                    throw alb0.c(-547906154, M);
                }
                M.K(-547895176);
                qzu0.a.getClass();
                lg90Var = qzu0.Q0(M);
                M.j();
            }
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            q630 E = ahn.E(q630Var, "mvi_video_card_duration");
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
            ContentBadgeAppearance.Design design = durationBadge.b ? ContentBadgeAppearance.Design.Negative : ContentBadgeAppearance.Design.Overlay;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().c;
            aVar2 = M;
            rnu0.c(contentBadgeSize, contentBadgeMode, design, E, lg90Var, new l5g(j), durationBadge.a.a(0, M), null, null, null, false, null, false, null, aVar2, 12615686, 0, 16128);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new xyc(durationBadge, q630Var, i, 3);
        }
    }

    public static final void p(PreviewViewState.m mVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        l5g l5gVar;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1261541889);
        if ((i & 6) == 0) {
            i2 = (M.J(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1261541889, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewEndVideo (PreviewView.kt:603)");
            }
            VkColorToken vkColorToken = mVar.d;
            if (vkColorToken == null) {
                M.K(-1630412014);
                M.j();
                l5gVar = null;
            } else {
                M.K(-1160972593);
                long a2 = vkColorToken.a(0, M);
                M.j();
                l5gVar = new l5g(a2);
            }
            if (l5gVar == null || (q630Var2 = hr80.m(q630Var, l5gVar.a, e.a)) == null) {
                q630Var2 = q630Var;
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
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
            ty6 ty6Var = dt1.a.f;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 b = ra8Var.b(aVar3, ty6Var);
            androidx.compose.foundation.layout.k a3 = j.a(androidx.compose.foundation.layout.a.g(24), dt1.a.l, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, b);
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
            PreviewViewState.n nVar = mVar.a;
            if (nVar == null) {
                M.K(-999345061);
            } else {
                M.K(-999345060);
                q(nVar, txj0.q(aVar3, 48), M, 48);
            }
            M.j();
            PreviewViewState.n nVar2 = mVar.b;
            if (nVar2 == null) {
                M.K(-999238917);
            } else {
                M.K(-999238916);
                q(nVar2, txj0.q(aVar3, 48), M, 48);
            }
            M.j();
            PreviewViewState.n nVar3 = mVar.c;
            if (nVar3 == null) {
                M.K(-999134757);
            } else {
                M.K(-999134756);
                q(nVar3, txj0.q(aVar3, 48), M, 48);
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new u67(mVar, q630Var, i, 3);
        }
    }

    public static final void q(PreviewViewState.n nVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        String a2;
        androidx.compose.runtime.a M = aVar.M(1866357023);
        int i2 = (M.J(nVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1866357023, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewEndVideoIcon (PreviewView.kt:631)");
            }
            kbe kbeVar = nVar.a().c;
            l5g l5gVar = null;
            lg90 a3 = rmw.b.a(null, nVar.a, M, 0, 3);
            mno0 mno0Var = nVar.b;
            if (mno0Var == null) {
                M.K(-2004242920);
                M.j();
                a2 = null;
            } else {
                M.K(-1727220983);
                a2 = mno0Var.a(0, M);
                M.j();
            }
            VkColorToken vkColorToken = nVar.d;
            if (vkColorToken == null) {
                M.K(-2004204046);
                M.j();
            } else {
                M.K(-1727219729);
                long a4 = vkColorToken.a(0, M);
                M.j();
                l5gVar = new l5g(a4);
            }
            nzu0.c(kbeVar, a3, a2, q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l5gVar != null ? l5gVar.a : l5g.k, false, null, false, null, null, M, 3136, 2000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new bta(nVar, q630Var, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [xsna.q630] */
    public static final void r(PreviewViewState.n nVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        l5g l5gVar;
        String str;
        androidx.compose.runtime.a M = aVar.M(234799007);
        if ((i & 6) == 0) {
            i2 = (M.J(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(234799007, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewIcon (PreviewView.kt:528)");
            }
            q630 b = eai.b(aVar2, nVar.a());
            VkColorToken vkColorToken = nVar.c;
            l5g l5gVar2 = null;
            if (vkColorToken == null) {
                M.K(-1604250222);
                M.j();
                l5gVar = null;
            } else {
                M.K(-1991412657);
                long a2 = vkColorToken.a(0, M);
                M.j();
                l5gVar = new l5g(a2);
            }
            if (l5gVar != null) {
                ?? D = s200.D(hr80.m(rte0.d(aVar2, vog0.b(8)), l5gVar.a, e.a), 6);
                if (D != 0) {
                    aVar2 = D;
                }
            }
            q630 g = b.g(aVar2);
            lg90 a3 = rmw.b.a(null, nVar.a, M, 0, 3);
            mno0 mno0Var = nVar.b;
            if (mno0Var == null) {
                M.K(-1603923048);
                M.j();
                str = null;
            } else {
                M.K(-1991402103);
                String a4 = mno0Var.a(0, M);
                M.j();
                str = a4;
            }
            VkColorToken vkColorToken2 = nVar.d;
            if (vkColorToken2 == null) {
                M.K(-1603884174);
                M.j();
            } else {
                M.K(-1991400849);
                long a5 = vkColorToken2.a(0, M);
                M.j();
                l5gVar2 = new l5g(a5);
            }
            pzu0.b(a3, str, g, l5gVar2 != null ? l5gVar2.a : l5g.k, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new b6d0(nVar, i);
        }
    }

    public static final void s(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(557252855);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(557252855, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewLoading (PreviewView.kt:589)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.j().a, e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            mku0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 30, 0L, M, ra8.a.b(q630.a.a, dt1.a.f));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new py5(q630Var, i, 1);
        }
    }

    public static final void t(PreviewViewState.p pVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(269198687);
        if ((i & 6) == 0) {
            i2 = (M.J(pVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(269198687, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewMiddle (PreviewView.kt:269)");
            }
            if (pVar instanceof PreviewViewState.n) {
                M.K(1001905889);
                u((PreviewViewState.n) pVar, q630Var, M, i2 & 112);
                M.j();
            } else if (epx.f(pVar, PreviewViewState.o.a)) {
                M.K(1001908151);
                s(q630Var, M, (i2 >> 3) & 14);
                M.j();
            } else {
                if (!(pVar instanceof PreviewViewState.m)) {
                    throw alb0.c(1001904448, M);
                }
                M.K(1001910239);
                p((PreviewViewState.m) pVar, q630Var, M, i2 & 112);
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
            s.d = new y78(pVar, q630Var, i, 4);
        }
    }

    public static final void u(PreviewViewState.n nVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        l5g l5gVar;
        q630 q630Var2;
        String a2;
        androidx.compose.runtime.a M = aVar.M(-1581820854);
        if ((i & 6) == 0) {
            i2 = (M.J(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1581820854, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewMiddleIcon (PreviewView.kt:571)");
            }
            VkColorToken vkColorToken = nVar.c;
            l5g l5gVar2 = null;
            if (vkColorToken == null) {
                M.K(356271399);
                M.j();
                l5gVar = null;
            } else {
                M.K(288587290);
                long a3 = vkColorToken.a(0, M);
                M.j();
                l5gVar = new l5g(a3);
            }
            if (l5gVar == null || (q630Var2 = hr80.m(q630Var, l5gVar.a, e.a)) == null) {
                q630Var2 = q630Var;
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 b = ra8.a.b(q630.a.a, dt1.a.f);
            lg90 a4 = rmw.b.a(null, nVar.a, M, 0, 3);
            mno0 mno0Var = nVar.b;
            if (mno0Var == null) {
                M.K(-1575428429);
                M.j();
                a2 = null;
            } else {
                M.K(2027389710);
                a2 = mno0Var.a(0, M);
                M.j();
            }
            VkColorToken vkColorToken2 = nVar.d;
            if (vkColorToken2 == null) {
                M.K(-1575385587);
                M.j();
            } else {
                M.K(2027391092);
                long a5 = vkColorToken2.a(0, M);
                M.j();
                l5gVar2 = new l5g(a5);
            }
            pzu0.b(a4, a2, b, l5gVar2 != null ? l5gVar2.a : l5g.k, M, 8, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ks3(nVar, q630Var, i, 7);
        }
    }

    public static final void v(PreviewViewState.r rVar, PreviewViewState.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 b;
        frv0 frv0Var;
        androidx.compose.runtime.a M = aVar.M(1691811440);
        if ((i & 6) == 0) {
            i2 = (M.J(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1691811440, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewPlaylist (PreviewView.kt:646)");
            }
            int[] iArr = a.$EnumSwitchMapping$0;
            int i3 = iArr[size.ordinal()];
            float f = (i3 == 1 || i3 != 2) ? 28 : 11;
            int i4 = iArr[size.ordinal()];
            float f2 = (i4 == 1 || i4 != 2) ? 8 : 2;
            int i5 = iArr[size.ordinal()];
            if (i5 == 1) {
                M.K(-1961792511);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1195458188, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ListPlayOutline28> (VkSdkIcons.kt:2080)");
                }
                b = or.b(M, 26239954, R.drawable.vk_icon_list_play_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (i5 != 2) {
                M.K(-1961788703);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1195458188, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ListPlayOutline28> (VkSdkIcons.kt:2080)");
                }
                b = or.b(M, 26239954, R.drawable.vk_icon_list_play_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1961790143);
                qzu0.a.getClass();
                b = qzu0.D0(M);
                M.j();
            }
            int i6 = iArr[size.ordinal()];
            if (i6 == 1) {
                M.K(-1961784684);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.T;
                M.j();
            } else if (i6 != 2) {
                M.K(-1961780972);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.T;
                M.j();
            } else {
                M.K(-1961782376);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var3 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var3.s0;
                M.j();
            }
            frv0 frv0Var2 = frv0Var;
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            ty6 ty6Var = dt1.a.g;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(txj0.c(ra8Var.b(aVar3, ty6Var), 1.0f), wlb0.h(M).j().a, e.a));
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            pzu0.b(b, null, null, wlb0.h(M).getIcon().c, M, 56, 4);
            yqv0.c(String.valueOf(rVar.a), s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var2, M, 0, 0, 8184);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new h7g(i, 1, rVar, size, q630Var);
        }
    }

    public static final void w(PreviewViewState.t tVar, PreviewViewState.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String F;
        androidx.compose.runtime.a M = aVar.M(281188816);
        if ((i & 6) == 0) {
            i2 = (M.J(tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(281188816, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewSeasonsBadge (PreviewView.kt:388)");
            }
            boolean z = size == PreviewViewState.Size.VideoSmall16x9;
            Integer num = tVar.b;
            int i3 = tVar.a;
            if (num == null) {
                M.K(1710089934);
                M.j();
                F = null;
            } else {
                M.K(1710089935);
                int intValue = num.intValue();
                F = d370.F(R.plurals.video_seasons_count, intValue, new Object[]{Integer.valueOf(intValue)}, M, 0);
                M.j();
            }
            M.K(-360474437);
            String F2 = d370.F(R.plurals.video_season_episodes_count, i3, new Object[]{Integer.valueOf(i3)}, M, 0);
            M.j();
            M.K(-360470894);
            String F3 = d370.F(R.plurals.video_videos_count, i3, new Object[]{Integer.valueOf(i3)}, M, 0);
            M.j();
            if (num != null && num.intValue() > 0) {
                if (num.intValue() == 1) {
                    F3 = F2;
                } else {
                    if (!z) {
                        F = pzl.b(F, " · ", F2);
                    }
                    F3 = F;
                }
            }
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(954817474, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ListPlayOutline12> (VkSdkIcons.kt:2076)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_list_play_outline_12, 0, M);
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
            l5g l5gVar = new l5g(ylu0Var.getIcon().c);
            M.K(1710979975);
            M.j();
            aVar2 = M;
            rnu0.c(contentBadgeSize, contentBadgeMode, design, q630Var, a2, l5gVar, F3, null, null, null, false, null, false, null, aVar2, ((i2 << 3) & 7168) | 33206, 0, 16128);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new a6d0(tVar, size, q630Var, i, 0);
        }
    }

    public static final void x(PreviewViewState.u uVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1105415269);
        if ((i & 6) == 0) {
            i2 = (M.J(uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1105415269, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewSubtitles (PreviewView.kt:809)");
            }
            float f = 8;
            float f2 = 4;
            aVar2 = M;
            yqv0.c(uVar.a, s200.E(hr80.m(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7), wlb0.h(M).j().a, vog0.b(f2)), f, f2), wlb0.h(aVar2).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).c0, aVar2, 0, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new x2d(uVar, q630Var, i, 1);
        }
    }

    public static final void y(PreviewViewState.x xVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1632518553);
        int i2 = (M.J(xVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1632518553, i2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewTop (PreviewView.kt:281)");
            }
            if (!(xVar instanceof PreviewViewState.v)) {
                throw alb0.c(1187270065, M);
            }
            M.K(1187271640);
            C((PreviewViewState.v) xVar, q630Var, M, i2 & 112);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new qed(xVar, q630Var, i, 10);
        }
    }

    public static final void z(PreviewViewState.y yVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1112781287);
        if ((i & 6) == 0) {
            i2 = (M.J(yVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1112781287, i3, -1, "com.vk.libvideo.design.compose.base.preview.PreviewTopLeft (PreviewView.kt:258)");
            }
            boolean z = yVar instanceof PreviewViewState.k;
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(-64034100);
                m((PreviewViewState.k) yVar, aVar2, M, i3 & 112);
                M.j();
            } else {
                if (!(yVar instanceof PreviewViewState.n)) {
                    throw alb0.c(-64035889, M);
                }
                M.K(-64031741);
                r((PreviewViewState.n) yVar, M, i3 & 112);
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
            s.d = new qiz(yVar, q630Var, i, 1);
        }
    }
}
