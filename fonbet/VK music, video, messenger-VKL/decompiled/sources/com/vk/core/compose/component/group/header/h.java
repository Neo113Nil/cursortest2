package com.vk.core.compose.component.group.header;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.b;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ckv0;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.epx;
import xsna.iku;
import xsna.ja8;
import xsna.jdj0;
import xsna.jgz;
import xsna.k9q0;
import xsna.kai;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.rx;
import xsna.sy90;
import xsna.txj0;
import xsna.vku;
import xsna.wku;
import xsna.yzs;

/* compiled from: VkGroupHeaderSkeleton.kt */
/* loaded from: classes17.dex */
public final class h {
    public static final void a(q630 q630Var, iku ikuVar, final wku wkuVar, final vku vkuVar, final b bVar, jdj0 jdj0Var, androidx.compose.runtime.a aVar, int i, int i2) {
        iku ikuVar2;
        int i3;
        androidx.compose.runtime.a aVar2;
        iku ikuVar3;
        float f;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1842139318);
        int i5 = i | (M.J(q630Var) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            ikuVar2 = ikuVar;
        } else {
            ikuVar2 = ikuVar;
            i3 = i5 | (M.J(ikuVar2) ? 32 : 16);
        }
        int i7 = (M.y(jdj0Var) ? 131072 : 65536) | i3 | (M.J(wkuVar) ? 256 : 128) | (M.J(vkuVar) ? 2048 : 1024) | (M.J(bVar) ? 16384 : 8192);
        if (M.t(i7 & 1, (74899 & i7) != 74898)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            } else if (i6 != 0) {
                ikuVar2 = null;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1842139318, i7, -1, "com.vk.core.compose.component.group.header.VkGroupHeaderSkeleton (VkGroupHeaderSkeleton.kt:37)");
            }
            if (wkuVar == null || vkuVar == null) {
                M.K(-769321165);
                f = jgz.s().f;
                M.j();
            } else {
                M.K(1920242667);
                if (epx.f(bVar, b.a.a)) {
                    i4 = 62;
                } else if (epx.f(bVar, b.C0749b.a)) {
                    i4 = 60;
                } else if (epx.f(bVar, b.c.a)) {
                    i4 = 53;
                } else {
                    if (!epx.f(bVar, b.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = 50;
                }
                f = i4;
                M.j();
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            final iku ikuVar4 = ikuVar2;
            final float f2 = f;
            aVar2 = M;
            ckv0.a(txj0.f(q630.a.a, 1.0f), jdj0Var, kai.c(1146359979, new yzs() { // from class: xsna.jxu0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1146359979, intValue, -1, "com.vk.core.compose.component.group.header.VkGroupHeaderSkeleton.<anonymous>.<anonymous> (VkGroupHeaderSkeleton.kt:65)");
                        }
                        q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, q630.a.a));
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, aVar4, 48);
                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c2 = qri.c(aVar4, F);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar5);
                        } else {
                            aVar4.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar4, a, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar4, D2, eVar);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        cri.a.b bVar2 = cri.a.g;
                        k9q0.w(aVar4, valueOf, bVar2);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar4, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar4, c2, dVar);
                        iku ikuVar5 = ikuVar4;
                        if (ikuVar5 == null) {
                            aVar4.K(1127875481);
                        } else {
                            aVar4.K(1127875482);
                            ikuVar5.a(6, aVar4);
                        }
                        aVar4.j();
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        xpy xpyVar = new xpy(1.0f, true);
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar4, 0);
                        int hashCode3 = Long.hashCode(n34.n(aVar4));
                        sy90 D3 = aVar4.D();
                        q630 c3 = qri.c(aVar4, xpyVar);
                        if (aVar4.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar4.H();
                        if (aVar4.L()) {
                            aVar4.I(aVar5);
                        } else {
                            aVar4.f();
                        }
                        k9q0.w(aVar4, a2, cVar);
                        k9q0.w(aVar4, D3, eVar);
                        ur.d(hashCode3, aVar4, bVar2, aVar4, c2678a);
                        k9q0.w(aVar4, c3, dVar);
                        wku wkuVar2 = wkuVar;
                        com.vk.core.compose.component.group.header.b bVar3 = bVar;
                        if (wkuVar2 == null) {
                            aVar4.K(1149262205);
                        } else {
                            aVar4.K(1149262206);
                            wkuVar2.a(bVar3, aVar4, 6);
                        }
                        aVar4.j();
                        vku vkuVar2 = vkuVar;
                        if (vkuVar2 == null) {
                            aVar4.K(1149323709);
                        } else {
                            aVar4.K(1149323710);
                            vkuVar2.a(bVar3, aVar4, 6);
                        }
                        aVar4.j();
                        if (kr.f(aVar4)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i7 >> 12) & 112) | 390, 0);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ikuVar3 = ikuVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            ikuVar3 = ikuVar2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rx(q630Var, ikuVar3, wkuVar, vkuVar, bVar, jdj0Var, i, i2);
        }
    }
}
