package com.vk.community.design.view.cover;

import android.content.res.Configuration;
import android.graphics.Color;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.movika.sdk.base.observable.o;
import com.vk.movika.tools.controls.seekbar.t;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.j0;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.alb0;
import xsna.azl;
import xsna.bap;
import xsna.byc0;
import xsna.chs;
import xsna.cl8;
import xsna.cp10;
import xsna.cri;
import xsna.csa0;
import xsna.d370;
import xsna.dd80;
import xsna.dof;
import xsna.dt1;
import xsna.e43;
import xsna.egi0;
import xsna.f870;
import xsna.f9t;
import xsna.fwu0;
import xsna.gzs;
import xsna.hr80;
import xsna.iyk0;
import xsna.izs;
import xsna.j2i;
import xsna.ja8;
import xsna.k60;
import xsna.k9q0;
import xsna.l2l0;
import xsna.l5g;
import xsna.ldv0;
import xsna.lg90;
import xsna.n34;
import xsna.ojc;
import xsna.or;
import xsna.pcg;
import xsna.q630;
import xsna.qri;
import xsna.r490;
import xsna.rdu;
import xsna.rqd;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sv1;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.uvi;
import xsna.vjw;
import xsna.w48;
import xsna.wzs;
import xsna.y7z;
import xsna.yk8;
import xsna.ylu0;
import xsna.yzs;
import xsna.zq0;
import xsna.zra0;

/* compiled from: CommunityStaticCover.kt */
/* loaded from: classes17.dex */
public final class b {
    public static final long a = f870.e(207, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 233);

    public static final void a(final gzs<s3q0> gzsVar, final izs<? super Integer, s3q0> izsVar, final CommunityStaticCover.a aVar, final boolean z, final gzs<Float> gzsVar2, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a M = aVar2.M(443404429);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(aVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(443404429, i2, -1, "com.vk.community.design.view.cover.CommunityStaticCover (CommunityStaticCover.kt:156)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            final int r0 = azlVar.r0(r490.d(R.dimen.pds_internal_community_cover_min_height, M));
            float d = r490.d(R.dimen.pds_internal_community_island_radius, M);
            final int r02 = azlVar.r0(d);
            boolean o = M.o(r0) | M.o(r02);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = new yzs() { // from class: xsna.h2i
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ep10 ep10Var = (ep10) obj;
                        zo10 zo10Var = (zo10) obj2;
                        o6j o6jVar = (o6j) obj3;
                        int i3 = (int) (o6j.i(o6jVar.a) / 2.5f);
                        int i4 = r0;
                        if (i3 < i4) {
                            i3 = i4;
                        }
                        int i5 = i3 + r02;
                        tra0 N = zo10Var.N(o6j.b(0, o6jVar.a, 0, i5, i5, 3));
                        return ep10Var.Q(N.b, N.c, jgp.b, new l2i(N, 0));
                    }
                };
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            q630 i3 = dd80.i(aVar3, (yzs) x);
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new zq0(izsVar, 1);
                M.R(x2);
            }
            q630 z3 = sv1.z(i3, (izs) x2);
            boolean z4 = (57344 & i2) == 16384;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new j2i(0, gzsVar2);
                M.R(x3);
            }
            q630 a2 = rdu.a(z3, (izs) x3);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z5 = aVar instanceof CommunityStaticCover.a.C0723a;
            if (z5) {
                M.K(2061524031);
                b((CommunityStaticCover.a.C0723a) aVar, gzsVar, d, M, ((i2 << 3) & 112) | 3072);
                M.j();
            } else if (aVar instanceof CommunityStaticCover.a.b) {
                M.K(2061828389);
                c((CommunityStaticCover.a.b) aVar, M, 48);
                M.j();
            } else {
                if (!(aVar instanceof CommunityStaticCover.a.c)) {
                    throw alb0.c(-72048053, M);
                }
                M.K(2062042413);
                d((CommunityStaticCover.a.c) aVar, d, M, 384);
                M.j();
            }
            if (z && z5) {
                M.K(2062340695);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.j().b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.d().a;
                Object x4 = M.x();
                if (x4 == c0012a) {
                    y7z y7zVar = new y7z(e43.l(new l5g(j), new l5g(j2)), null, 0L, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L), 0);
                    M.R(y7zVar);
                    x4 = y7zVar;
                }
                f9t.e(hr80.l(txj0.h(txj0.f(aVar3, 1.0f), 56), (yk8) x4, null, 6), M, 6);
            } else {
                M.K(2054688655);
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
            s.d = new wzs(izsVar, aVar, z, gzsVar2, i) { // from class: xsna.k2i
                public final /* synthetic */ izs c;
                public final /* synthetic */ CommunityStaticCover.a d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.community.design.view.cover.b.a(gzs.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final CommunityStaticCover.a.C0723a c0723a, final gzs gzsVar, final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1275383375);
        if ((i & 6) == 0) {
            i2 = (M.J(c0723a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.n(f) ? 256 : 128;
        }
        int i3 = i & 3072;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1275383375, i2, -1, "com.vk.community.design.view.cover.ImageContent (CommunityStaticCover.kt:242)");
            }
            M.K(1577750516);
            int I0 = (int) ((azl) M.r(uvi.h)).I0(((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
            M.j();
            String str = (String) c0723a.a.invoke(Integer.valueOf(I0), Integer.valueOf((int) (I0 / 2.5f)));
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new k60(22);
                M.R(x);
            }
            int i4 = i2;
            Pair m = fwu0.m(null, str, null, null, (izs) x, null, M, 24576, 109);
            chs chsVar = (chs) m.d();
            lg90 lg90Var = (lg90) m.g();
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = new w48(0);
                M.R(x2);
            }
            Object obj2 = (w48) x2;
            boolean y = M.y(obj2);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new pcg(obj2, 7);
                M.R(x3);
            }
            lg90 l = fwu0.l(null, str, (izs) x3, null, M, 0, 45);
            String N = d370.N(R.string.community_cover_accessibility, 0, M);
            q630 d = txj0.d(aVar3, 1.0f);
            boolean J = M.J(N);
            Object x4 = M.x();
            if (J || x4 == obj) {
                x4 = new rqd(N, 2);
                M.R(x4);
            }
            q630 b = egi0.b(d, false, (izs) x4);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            q630 f2 = txj0.f(aVar3, 1.0f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d2 = j0.d(1.0f, f2, true);
            boolean y2 = M.y(obj2);
            Object x5 = M.x();
            if (y2 || x5 == obj) {
                x5 = new o(obj2, 22);
                M.R(x5);
            }
            vjw.a(lg90Var, null, sv1.z(d2, (izs) x5), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            vjw.a(l, null, l2l0.o(txj0.h(txj0.f(aVar3, 1.0f), f), 1.0f, -1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            aVar2 = M;
            aVar2.G();
            boolean J2 = aVar2.J(chsVar) | ((i4 & 112) == 32);
            Object x6 = aVar2.x();
            if (J2 || x6 == obj) {
                x6 = new a(chsVar, gzsVar, null);
                aVar2.R(x6);
            }
            bap.g(chsVar, (wzs) x6, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.m2i
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(i | 1);
                    com.vk.community.design.view.cover.b.b(CommunityStaticCover.a.C0723a.this, gzsVar, f, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(CommunityStaticCover.a.b bVar, androidx.compose.runtime.a aVar, int i) {
        long j = a;
        androidx.compose.runtime.a M = aVar.M(-1785815071);
        int i2 = (M.J(bVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1785815071, i2, -1, "com.vk.community.design.view.cover.PlaceholderContent (CommunityStaticCover.kt:304)");
            }
            boolean J = M.J(bVar.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                try {
                    String str = bVar.a;
                    if (str != null) {
                        j = f870.c(Color.parseColor(str));
                    }
                } catch (Throwable unused) {
                }
                x = new l5g(j);
                M.R(x);
            }
            long j2 = ((l5g) x).a;
            M.K(1818651128);
            boolean p = M.p(j2);
            Object x2 = M.x();
            if (p || x2 == c0012a) {
                l5g l5gVar = new l5g(l5g.c(14, j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                M.R(l5gVar);
                x2 = l5gVar;
            }
            long j3 = ((l5g) x2).a;
            boolean p2 = M.p(j2);
            Object x3 = M.x();
            if (p2 || x3 == c0012a) {
                x3 = new cl8(new y7z(e43.l(new l5g(j2), new l5g(j3)), null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), 0));
                M.R(x3);
            }
            M.j();
            vjw.a((cl8) x3, null, txj0.d(q630.a.a, 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new t(bVar, i, 3);
        }
    }

    public static final void d(final CommunityStaticCover.a.c cVar, final float f, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(940846011);
        int i2 = (M.J(cVar) ? 4 : 2) | i | (M.n(f) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(940846011, i2, -1, "com.vk.community.design.view.cover.UploadPlaceholderContent (CommunityStaticCover.kt:345)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 H = s200.H(hr80.m(d, ylu0Var.getImage().b, e.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 7);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dof(cVar, 9);
                M.R(x);
            }
            q630 c = ojc.c(H, false, null, null, (gzs) x, 15);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 F = s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1143959078, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CameraOutline28> (VkSdkIcons.kt:202)");
            }
            lg90 b = or.b(M, -880424453, R.drawable.vk_icon_camera_outline_28, M, 0);
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
            long j = ylu0Var2.getIcon().l;
            float f2 = 28;
            ldv0.d(F, csa0.a(b, j, byc0.b(f2, f2), null, null, M, 197000, 24), zra0.a.a(null, null, d370.N(R.string.community_cover_add, 0, M), null, M, 196608, 27), null, null, null, false, M, 1572864, 56);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(f, i) { // from class: xsna.i2i
                public final /* synthetic */ float c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    com.vk.community.design.view.cover.b.d(CommunityStaticCover.a.c.this, this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
