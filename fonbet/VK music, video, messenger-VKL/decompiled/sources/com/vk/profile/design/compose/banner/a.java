package com.vk.profile.design.compose.banner;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.compose.banner.VkBannerDefaults;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cp10;
import xsna.cri;
import xsna.d7u0;
import xsna.dci0;
import xsna.drm0;
import xsna.dt1;
import xsna.e7u0;
import xsna.egi0;
import xsna.ev60;
import xsna.f9t;
import xsna.frv0;
import xsna.gzs;
import xsna.hr80;
import xsna.ir;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.kdw;
import xsna.kqu0;
import xsna.kr;
import xsna.l4k0;
import xsna.l5g;
import xsna.lg90;
import xsna.m200;
import xsna.n34;
import xsna.nmo0;
import xsna.nzu0;
import xsna.ojc;
import xsna.or;
import xsna.plg0;
import xsna.q630;
import xsna.qer0;
import xsna.qq;
import xsna.qri;
import xsna.r18;
import xsna.ra8;
import xsna.rrv0;
import xsna.rte0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sua;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.ty6;
import xsna.uog0;
import xsna.ur;
import xsna.vjw;
import xsna.vog0;
import xsna.wh50;
import xsna.wjo0;
import xsna.wkj;
import xsna.wlb0;
import xsna.wss0;
import xsna.wzs;
import xsna.xjo0;
import xsna.xpy;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zzs0;

/* compiled from: VkAdBanner.kt */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: VkAdBanner.kt */
    /* renamed from: com.vk.profile.design.compose.banner.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1652a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkBannerDefaults.BackgroundMode.values().length];
            try {
                iArr[VkBannerDefaults.BackgroundMode.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, q630 q630Var, final String str2, final wzs wzsVar, final int i, final int i2, final int i3, final lg90 lg90Var, final l5g l5gVar, VkBannerDefaults.BackgroundMode backgroundMode, final lg90 lg90Var2, final lg90 lg90Var3, final gzs gzsVar, final wzs wzsVar2, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i4, final int i5) {
        int i6;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final VkBannerDefaults.BackgroundMode backgroundMode2;
        long j;
        long j2;
        int i7;
        long j3;
        nmo0 nmo0Var;
        androidx.compose.runtime.a aVar3;
        int i8;
        q630.a aVar4;
        int i9;
        LayoutNode.a aVar5;
        cri.a.C2678a c2678a;
        cri.a.e eVar;
        int i10;
        q630.a aVar6;
        cri.a.b bVar;
        androidx.compose.runtime.a aVar7;
        boolean z;
        q630.a aVar8;
        Integer num;
        cri.a.c cVar;
        q630 q630Var3;
        int i11;
        LayoutNode.a aVar9;
        a.C0011a.C0012a c0012a;
        cri.a.C2678a c2678a2;
        cri.a.d dVar;
        Integer num2;
        q630.a aVar10;
        cri.a.b bVar2;
        cri.a.c cVar2;
        cri.a.e eVar2;
        q630.a aVar11;
        a.C0011a.C0012a c0012a2;
        q630.a aVar12;
        androidx.compose.runtime.a M = aVar.M(-1037268780);
        int i12 = i4 | (M.J(str) ? 4 : 2) | 48 | (M.J(str2) ? 256 : 128) | (M.y(wzsVar) ? 2048 : 1024) | (M.o(i) ? 16384 : 8192) | (M.y(lg90Var) ? 8388608 : 4194304) | (M.J(l5gVar) ? 67108864 : 33554432);
        int i13 = i5 & 512;
        if (i13 != 0) {
            i6 = i12 | 805306368;
        } else {
            i6 = i12 | (M.o(backgroundMode == null ? -1 : backgroundMode.ordinal()) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        }
        int i14 = 72 | (M.y(lg90Var2) ? 4 : 2) | (M.y(lg90Var3) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(wzsVar2) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192);
        if (M.t(i6 & 1, ((i6 & 306783379) == 306783378 && (i14 & 9363) == 9362) ? false : true)) {
            VkBannerDefaults.BackgroundMode backgroundMode3 = i13 != 0 ? VkBannerDefaults.BackgroundMode.Light : backgroundMode;
            if (b.d()) {
                b.f(-1037268780, i6, i14, "com.vk.profile.design.compose.banner.VkAdBanner (VkAdBanner.kt:79)");
            }
            VkBannerDefaults.BackgroundMode backgroundMode4 = lg90Var != null ? backgroundMode3 : VkBannerDefaults.BackgroundMode.Light;
            int[] iArr = C1652a.$EnumSwitchMapping$0;
            VkBannerDefaults.BackgroundMode backgroundMode5 = backgroundMode4;
            if (iArr[backgroundMode4.ordinal()] == 1) {
                M.K(-382852480);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j = ylu0Var.getText().d;
                M.j();
            } else {
                M.K(-382850913);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j = ylu0Var2.getText().m;
                M.j();
            }
            long j4 = j;
            if (iArr[backgroundMode5.ordinal()] == 1) {
                M.K(-382846720);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j2 = ylu0Var3.getIcon().c;
                M.j();
            } else {
                M.K(-382845146);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j2 = ylu0Var4.getIcon().m;
                M.j();
            }
            long j5 = j2;
            wjo0 a = xjo0.a(0, 1, M);
            nmo0 nmo0Var2 = wlb0.l(M).M.a;
            nmo0 nmo0Var3 = wlb0.l(M).e0.a;
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (x == c0012a3) {
                i7 = i14;
                x = qq.h(i2, M);
            } else {
                i7 = i14;
            }
            wh50 wh50Var = (wh50) x;
            M.K(-382818137);
            M.K(-382832502);
            uog0 uog0Var = VkBannerDefaults.b;
            q630.a aVar13 = q630.a.a;
            q630 d = rte0.d(aVar13, uog0Var);
            if (l5gVar != null || lg90Var == null) {
                if (l5gVar == null) {
                    M.K(-177114182);
                    j3 = wlb0.h(M).getBackground().g;
                    M.j();
                } else {
                    M.K(-177116197);
                    M.j();
                    j3 = l5gVar.a;
                }
                nmo0Var = nmo0Var3;
                d = d.g(r18.a((float) 0.5d, wlb0.h(M).getImage().a, hr80.m(aVar13, j3, e.a), uog0Var));
            } else {
                nmo0Var = nmo0Var3;
            }
            M.j();
            if (gzsVar2 != null) {
                Object x2 = M.x();
                if (x2 == c0012a3) {
                    x2 = ir.h(M);
                }
                aVar3 = M;
                i8 = i6;
                aVar4 = aVar13;
                i9 = i7;
                q630 g = d.g(ojc.b(aVar4, (sg50) x2, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), true, new plg0(0), gzsVar2, 8));
                if (g != null) {
                    d = g;
                }
            } else {
                aVar3 = M;
                i8 = i6;
                aVar4 = aVar13;
                i9 = i7;
            }
            aVar3.j();
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.j, false);
            int hashCode = Long.hashCode(n34.n(aVar3));
            sy90 D = aVar3.D();
            q630 c = qri.c(aVar3, d);
            cri.h7.getClass();
            LayoutNode.a aVar14 = cri.a.b;
            if (aVar3.N() == null) {
                n34.r();
                throw null;
            }
            aVar3.H();
            if (aVar3.L()) {
                aVar3.I(aVar14);
            } else {
                aVar3.f();
            }
            cri.a.c cVar3 = cri.a.f;
            k9q0.w(aVar3, d2, cVar3);
            cri.a.e eVar3 = cri.a.e;
            k9q0.w(aVar3, D, eVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(aVar3, valueOf, bVar3);
            cri.a.C2678a c2678a3 = cri.a.h;
            k9q0.t(aVar3, c2678a3);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(aVar3, c, dVar2);
            ra8 ra8Var = ra8.a;
            if (lg90Var == null) {
                aVar3.K(-2075759754);
                aVar3.j();
                aVar7 = aVar3;
                aVar5 = aVar14;
                i10 = i9;
                aVar6 = aVar4;
                eVar = eVar3;
                c2678a = c2678a3;
                bVar = bVar3;
            } else {
                aVar3.K(-2075759753);
                androidx.compose.runtime.a aVar15 = aVar3;
                aVar5 = aVar14;
                c2678a = c2678a3;
                eVar = eVar3;
                i10 = i9;
                aVar6 = aVar4;
                bVar = bVar3;
                vjw.a(lg90Var, null, ra8Var.a(aVar4), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar15, 56, 120);
                aVar7 = aVar15;
                s3q0 s3q0Var = s3q0.a;
                aVar7.j();
            }
            q630 u = m200.u(aVar6, IntrinsicSize.Min);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            ty6.b bVar4 = dt1.a.k;
            k a2 = j.a(lVar, bVar4, aVar7, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar7));
            sy90 D2 = aVar7.D();
            q630 c2 = qri.c(aVar7, u);
            if (aVar7.N() == null) {
                n34.r();
                throw null;
            }
            aVar7.H();
            if (aVar7.L()) {
                aVar7.I(aVar5);
            } else {
                aVar7.f();
            }
            k9q0.w(aVar7, a2, cVar3);
            k9q0.w(aVar7, D2, eVar);
            ur.d(hashCode2, aVar7, bVar, aVar7, c2678a);
            k9q0.w(aVar7, c2, dVar2);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f = kqu0.v;
            q630 G = s200.G(xpyVar, f, f, f, (wzsVar2 == null || gzsVar == null) ? f : 7);
            k a3 = j.a(androidx.compose.foundation.layout.a.g(f), bVar4, aVar7, 48);
            int hashCode3 = Long.hashCode(n34.n(aVar7));
            sy90 D3 = aVar7.D();
            q630 c3 = qri.c(aVar7, G);
            if (aVar7.N() == null) {
                n34.r();
                throw null;
            }
            aVar7.H();
            if (aVar7.L()) {
                aVar7.I(aVar5);
            } else {
                aVar7.f();
            }
            k9q0.w(aVar7, a3, cVar3);
            k9q0.w(aVar7, D3, eVar);
            ur.d(hashCode3, aVar7, bVar, aVar7, c2678a);
            k9q0.w(aVar7, c3, dVar2);
            if (lg90Var2 == null) {
                aVar7.K(1041303872);
                aVar7.j();
                z = false;
            } else {
                aVar7.K(1041303873);
                q630 d3 = rte0.d(txj0.q(aVar6, 98), vog0.b(16));
                Object x3 = aVar7.x();
                if (x3 == c0012a3) {
                    x3 = new kdw(29);
                    aVar7.R(x3);
                }
                z = false;
                androidx.compose.runtime.a aVar16 = aVar7;
                vjw.a(lg90Var2, null, egi0.b(d3, false, (izs) x3), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar16, 56 | (i10 & 14), 120);
                aVar7 = aVar16;
                s3q0 s3q0Var2 = s3q0.a;
                aVar7.j();
            }
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar2 = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Object x4 = aVar7.x();
            if (x4 == c0012a3) {
                x4 = new dci0(2, wh50Var);
                aVar7.R(x4);
            }
            izs izsVar = (izs) x4;
            cri.a.C2678a c2678a4 = c2678a;
            q630.a aVar17 = aVar6;
            cri.a.b bVar5 = bVar;
            boolean z2 = z;
            LayoutNode.a aVar18 = aVar5;
            cri.a.e eVar4 = eVar;
            q630 g2 = xpyVar2.g(new d7u0(str2, a, str, nmo0Var2, i2, i, izsVar, nmo0Var, i3));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            ty6.a aVar19 = dt1.a.n;
            c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar19, aVar7, z2 ? 1 : 0);
            int hashCode4 = Long.hashCode(n34.n(aVar7));
            sy90 D4 = aVar7.D();
            q630 c4 = qri.c(aVar7, g2);
            if (aVar7.N() == null) {
                n34.r();
                throw null;
            }
            aVar7.H();
            if (aVar7.L()) {
                aVar7.I(aVar18);
            } else {
                aVar7.f();
            }
            k9q0.w(aVar7, a4, cVar3);
            k9q0.w(aVar7, D4, eVar4);
            ur.d(hashCode4, aVar7, bVar5, aVar7, c2678a4);
            k9q0.w(aVar7, c4, dVar2);
            if (wzsVar == null) {
                aVar7.K(-227589249);
                aVar7.j();
                num = 0;
                aVar8 = aVar17;
            } else {
                aVar7.K(-227589248);
                cp10 d4 = ja8.d(dt1.a.b, z2);
                int hashCode5 = Long.hashCode(n34.n(aVar7));
                sy90 D5 = aVar7.D();
                aVar8 = aVar17;
                q630 c5 = qri.c(aVar7, aVar8);
                if (aVar7.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar7.H();
                if (aVar7.L()) {
                    aVar7.I(aVar18);
                } else {
                    aVar7.f();
                }
                k9q0.w(aVar7, d4, cVar3);
                k9q0.w(aVar7, D5, eVar4);
                ur.d(hashCode5, aVar7, bVar5, aVar7, c2678a4);
                k9q0.w(aVar7, c5, dVar2);
                num = 0;
                wzsVar.invoke(aVar7, null);
                aVar7.G();
                f9t.e(txj0.h(aVar8, kqu0.r), aVar7, z2 ? 1 : 0);
                s3q0 s3q0Var3 = s3q0.a;
                aVar7.j();
            }
            if (gzsVar == null) {
                cVar = cVar3;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630Var3 = new xpy(1.0f, true);
            } else {
                cVar = cVar3;
                q630Var3 = aVar8;
            }
            c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar19, aVar7, 0);
            int hashCode6 = Long.hashCode(n34.n(aVar7));
            sy90 D6 = aVar7.D();
            q630 c6 = qri.c(aVar7, q630Var3);
            if (aVar7.N() == null) {
                n34.r();
                throw null;
            }
            aVar7.H();
            if (aVar7.L()) {
                aVar7.I(aVar18);
            } else {
                aVar7.f();
            }
            k9q0.w(aVar7, a5, cVar);
            k9q0.w(aVar7, D6, eVar4);
            ur.d(hashCode6, aVar7, bVar5, aVar7, c2678a4);
            k9q0.w(aVar7, c6, dVar2);
            int intValue = ((Number) wh50Var.getValue()).intValue();
            frv0 frv0Var = wlb0.l(aVar7).M;
            Object x5 = aVar7.x();
            if (x5 == c0012a3) {
                i11 = 2;
                x5 = new zzs0(2);
                aVar7.R(x5);
            } else {
                i11 = 2;
            }
            androidx.compose.runtime.a aVar20 = aVar7;
            yqv0.c(str, egi0.b(aVar8, false, (izs) x5), j4, null, null, 0, 0, null, 2, false, 0, intValue, null, frv0Var, aVar20, (i8 & 14) | 100663296, 0, 5880);
            aVar2 = aVar20;
            if (str2 == null || drm0.N(str2)) {
                aVar9 = aVar18;
                c0012a = c0012a3;
                c2678a2 = c2678a4;
                dVar = dVar2;
                num2 = num;
                aVar10 = aVar8;
                bVar2 = bVar5;
                cVar2 = cVar;
                eVar2 = eVar4;
                aVar2.K(549225908);
            } else {
                aVar2.K(557728805);
                f9t.e(txj0.h(aVar8, i11), aVar2, 6);
                frv0 frv0Var2 = wlb0.l(aVar2).e0;
                Object x6 = aVar2.x();
                if (x6 == c0012a3) {
                    x6 = new wss0(3);
                    aVar2.R(x6);
                }
                aVar9 = aVar18;
                num2 = num;
                cVar2 = cVar;
                c0012a = c0012a3;
                eVar2 = eVar4;
                bVar2 = bVar5;
                c2678a2 = c2678a4;
                dVar = dVar2;
                aVar10 = aVar8;
                yqv0.c(str2, egi0.b(aVar8, false, (izs) x6), j4, null, null, 0, 0, null, 2, false, 0, i3, null, frv0Var2, aVar2, ((i8 >> 6) & 14) | 100663296, 48, 5880);
            }
            aVar2.j();
            aVar2.G();
            if (wzsVar2 == null) {
                aVar2.K(-225973126);
                aVar2.j();
                aVar11 = aVar10;
            } else {
                aVar2.K(-225973125);
                aVar11 = aVar10;
                f9t.e(txj0.h(aVar11, 12), aVar2, 6);
                wzsVar2.invoke(aVar2, num2);
                s3q0 s3q0Var4 = s3q0.a;
                aVar2.j();
            }
            aVar2.G();
            aVar2.G();
            if (lg90Var3 == null && gzsVar == null) {
                aVar2.K(-1487325660);
                aVar2.j();
                aVar12 = aVar11;
            } else {
                aVar2.K(-1477926429);
                q630 c7 = txj0.c(new e7u0(), 1.0f);
                cp10 d5 = ja8.d(dt1.a.b, false);
                int hashCode7 = Long.hashCode(n34.n(aVar2));
                sy90 D7 = aVar2.D();
                q630 c8 = qri.c(aVar2, c7);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar9);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d5, cVar2);
                k9q0.w(aVar2, D7, eVar2);
                ur.d(hashCode7, aVar2, bVar2, aVar2, c2678a2);
                k9q0.w(aVar2, c8, dVar);
                if (lg90Var3 == null) {
                    aVar2.K(-1417278587);
                    aVar2.j();
                    c0012a2 = c0012a;
                } else {
                    aVar2.K(-1417278586);
                    q630 d6 = sua.d(1.0f, txj0.c(aVar11, 1.0f), true);
                    Object x7 = aVar2.x();
                    c0012a2 = c0012a;
                    if (x7 == c0012a2) {
                        x7 = new l4k0(11);
                        aVar2.R(x7);
                    }
                    vjw.a(lg90Var3, null, egi0.b(d6, false, (izs) x7), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 24632, 104);
                    s3q0 s3q0Var5 = s3q0.a;
                    aVar2.j();
                }
                if (gzsVar == null) {
                    aVar2.K(-1416675141);
                    aVar2.j();
                    aVar12 = aVar11;
                } else {
                    aVar2.K(-1416675140);
                    q630 D8 = s200.D(ra8Var.b(aVar11, dt1.a.d), 14);
                    Object x8 = aVar2.x();
                    if (x8 == c0012a2) {
                        x8 = new ev60(19);
                        aVar2.R(x8);
                    }
                    q630 b = egi0.b(D8, false, (izs) x8);
                    float f2 = VkBannerDefaults.a;
                    if (b.d()) {
                        b.f(-1624152604, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DismissDark24> (VkSdkIcons.kt:656)");
                    }
                    lg90 b2 = or.b(aVar2, 1971505535, R.drawable.vk_icon_dismiss_dark_24, aVar2, 0);
                    if (b.d()) {
                        b.e();
                    }
                    aVar12 = aVar11;
                    nzu0.c(gzsVar, b2, null, b, f2, j5, false, null, false, null, null, aVar2, 25024, 1984);
                    s3q0 s3q0Var6 = s3q0.a;
                    aVar2.j();
                }
                aVar2.G();
                aVar2.j();
            }
            if (kr.f(aVar2)) {
                b.e();
            }
            backgroundMode2 = backgroundMode3;
            q630Var2 = aVar12;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            backgroundMode2 = backgroundMode;
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, q630Var2, str2, wzsVar, i, i2, i3, lg90Var, l5gVar, backgroundMode2, lg90Var2, lg90Var3, gzsVar, wzsVar2, gzsVar2, i4, i5) { // from class: xsna.c7u0
                public final /* synthetic */ String b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ int f;
                public final /* synthetic */ int g;
                public final /* synthetic */ int h;
                public final /* synthetic */ lg90 i;
                public final /* synthetic */ l5g j;
                public final /* synthetic */ VkBannerDefaults.BackgroundMode k;
                public final /* synthetic */ lg90 l;
                public final /* synthetic */ lg90 m;
                public final /* synthetic */ gzs n;
                public final /* synthetic */ wzs o;
                public final /* synthetic */ gzs p;
                public final /* synthetic */ int q;

                {
                    this.q = i5;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(18546689);
                    com.vk.profile.design.compose.banner.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (androidx.compose.runtime.a) obj, I, this.q);
                    return s3q0.a;
                }
            };
        }
    }
}
