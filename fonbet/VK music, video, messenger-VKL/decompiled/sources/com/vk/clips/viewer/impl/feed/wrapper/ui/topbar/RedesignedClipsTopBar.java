package com.vk.clips.viewer.impl.feed.wrapper.ui.topbar;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.compose.component.topbar.k;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.am20;
import xsna.bhu0;
import xsna.blk;
import xsna.bu00;
import xsna.cp10;
import xsna.cri;
import xsna.cx9;
import xsna.dt1;
import xsna.e43;
import xsna.emf0;
import xsna.fko;
import xsna.fxc0;
import xsna.gmf0;
import xsna.gor0;
import xsna.gp;
import xsna.gzs;
import xsna.ipi;
import xsna.iyk0;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.kai;
import xsna.kg50;
import xsna.kqu0;
import xsna.kr;
import xsna.l5g;
import xsna.lg90;
import xsna.m7p0;
import xsna.mq;
import xsna.n34;
import xsna.nfp;
import xsna.p2u;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sif;
import xsna.sy90;
import xsna.txj0;
import xsna.u890;
import xsna.ur;
import xsna.wh50;
import xsna.wow;
import xsna.wzs;
import xsna.ylu0;
import xsna.yu50;
import xsna.zak0;
import xsna.znk0;

/* compiled from: RedesignedClipsTopBar.kt */
/* loaded from: classes17.dex */
public class RedesignedClipsTopBar extends VkTopBar {
    public static final /* synthetic */ int N = 0;
    public final wh50 J;
    public final wh50 K;
    public final wh50 L;
    public final wh50 M;

    public RedesignedClipsTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.J = k.b(new p2u(20));
        this.K = k.b(new wow(EmptyList.b));
        this.L = k.b(0);
        this.M = k.b(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.vk.core.compose.component.semantics.SemanticsConfiguration] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.vk.core.compose.component.semantics.SemanticsConfiguration] */
    @Override // com.vk.core.view.components.topbar.VkTopBar, xsna.rpo0
    public final void A(int i, a aVar) {
        TopBar$Before.e eVar;
        l5g l5gVar;
        l5g l5gVar2;
        a aVar2 = aVar;
        aVar2.K(1897252592);
        if (b.d()) {
            b.f(1897252592, 8, -1, "com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar.ThemedContent (RedesignedClipsTopBar.kt:54)");
        }
        List m79getTabssCxhJsk = m79getTabssCxhJsk();
        int currentTabIndex = getCurrentTabIndex();
        q630 f = txj0.f(q630.a.a, 1.0f);
        if (b.d()) {
            b.f(274440426, 8, -1, "com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar.buildBack (RedesignedClipsTopBar.kt:67)");
        }
        VkTopBar.b back = getBack();
        if (back != null) {
            aVar2.K(-1762858512);
            String I = blk.I(back.b, aVar2);
            ipi ipiVar = back.d;
            if (ipiVar == null) {
                aVar2.K(-1762750137);
                aVar2.j();
                l5gVar2 = null;
            } else {
                aVar2.K(1744252410);
                long a = ipiVar.a(0, aVar2);
                aVar2.j();
                l5gVar2 = new l5g(a);
            }
            gzs<s3q0> gzsVar = back.a;
            SemanticsConfiguration semanticsConfiguration = back.e;
            if (semanticsConfiguration == null) {
                semanticsConfiguration = null;
            }
            TopBar$Before.e a2 = e.a.a(gzsVar, I, null, l5gVar2, semanticsConfiguration, aVar, 196608, 4);
            aVar2 = aVar;
            aVar2.j();
            eVar = a2;
        } else {
            aVar2.K(-1762582861);
            aVar2.j();
            eVar = null;
        }
        if (b.d()) {
            b.e();
        }
        aVar2.K(-1733274758);
        if (b.d()) {
            b.f(-1733274758, 8, -1, "com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar.buildRight (RedesignedClipsTopBar.kt:81)");
        }
        if (fxc0.B().J().N0()) {
            VkTopBar.a after = getAfter();
            VkTopBar.a.c b = after != null ? after.b() : null;
            VkTopBar.a.c.f fVar = b instanceof VkTopBar.a.c.f ? (VkTopBar.a.c.f) b : null;
            if (fVar == null) {
                aVar2.K(-1891216806);
                aVar2.j();
            } else {
                aVar2.K(-1891216805);
                lg90 a3 = fko.a(fVar.a, aVar2);
                ipi ipiVar2 = fVar.e;
                if (ipiVar2 == null) {
                    aVar2.K(1894363675);
                    aVar2.j();
                    l5gVar = null;
                } else {
                    aVar2.K(476750502);
                    long a4 = ipiVar2.a(0, aVar2);
                    aVar2.j();
                    l5gVar = new l5g(a4);
                }
                String I2 = blk.I(fVar.b, aVar2);
                gzs<s3q0> gzsVar2 = fVar.c;
                ?? r0 = fVar.f;
                r14 = d.a.a(d.c.C0760d.a.a(a3, I2, gzsVar2, null, l5gVar, r0 != 0 ? r0 : null, aVar2, 1572872, 8), null, null, null, aVar, 24576, 14);
                aVar.j();
            }
            if (b.d()) {
                b.e();
            }
            aVar.j();
        } else {
            if (b.d()) {
                b.e();
            }
            aVar2.j();
        }
        I(m79getTabssCxhJsk, currentTabIndex, f, eVar, r14, getOnTabClicked(), getShowSingleTab(), aVar, 16777600);
        if (b.d()) {
            b.e();
        }
        aVar.j();
    }

    public final void G(int i, a aVar, String str, gzs gzsVar, q630 q630Var, boolean z) {
        int i2;
        a aVar2;
        q630 q630Var2;
        a M = aVar.M(653885463);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (b.d()) {
                b.f(653885463, i3, -1, "com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar.ClipTab (RedesignedClipsTopBar.kt:177)");
            }
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            u890 m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            boolean z2 = (i3 & 7168) == 2048;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new cx9(1, gzsVar);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            aVar2 = M;
            bhu0.c((gzs) x, buttonSize, buttonStyle, buttonAppearance, aVar3, null, m, false, null, null, null, false, kai.c(1293511410, new nfp(z, str), M), aVar2, ((i3 << 6) & 57344) | 1576368, 384, 4000);
            if (b.d()) {
                b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new am20(this, str, z, q630Var2, gzsVar, i);
        }
    }

    public final void H(List list, int i, q630 q630Var, izs izsVar, a aVar, int i2) {
        int i3;
        RedesignedClipsTopBar redesignedClipsTopBar = this;
        a M = aVar.M(-495080186);
        if ((i2 & 6) == 0) {
            i3 = (M.J(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? M.J(redesignedClipsTopBar) : M.y(redesignedClipsTopBar) ? 16384 : 8192;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (b.d()) {
                b.f(-495080186, i4, -1, "com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar.ClipsTabs (RedesignedClipsTopBar.kt:155)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = j.a(g, dt1.a.l, M, 54);
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
            Iterator a2 = yu50.a(M, c, cri.a.d, 380301363, list);
            int i5 = 0;
            while (a2.hasNext()) {
                Object next = a2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                String str = (String) next;
                boolean z = i5 == i;
                boolean o = ((i4 & 7168) == 2048) | M.o(i5);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new sif(i5, 2, izsVar);
                    M.R(x);
                }
                redesignedClipsTopBar.G((57344 & i4) | 32768, M, str, (gzs) x, null, z);
                redesignedClipsTopBar = this;
                i5 = i6;
            }
            if (gp.d(M)) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new gmf0(this, list, i, q630Var, izsVar, i2);
        }
    }

    public final void I(final List list, final int i, final q630 q630Var, final TopBar$Before topBar$Before, final d dVar, final izs izsVar, final boolean z, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        izs izsVar2;
        s3q0 s3q0Var;
        s3q0 s3q0Var2;
        androidx.compose.runtime.a M = aVar.M(-1126265535);
        if ((i2 & 6) == 0) {
            i3 = (M.J(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(topBar$Before != null ? new e(topBar$Before) : null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            izsVar2 = izsVar;
            i3 |= M.y(izsVar2) ? 131072 : 65536;
        } else {
            izsVar2 = izsVar;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (16777216 & i2) == 0 ? M.J(this) : M.y(this) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (b.d()) {
                b.f(-1126265535, i4, -1, "com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar.RedesignedClipsTopBar (RedesignedClipsTopBar.kt:108)");
            }
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (b.d()) {
                b.e();
            }
            long j = ylu0Var.d().a;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (b.d()) {
                b.e();
            }
            float e = l5g.e(ylu0Var2.getHeader().a);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.d.a(e);
                M.R(x);
            }
            kg50 kg50Var = (kg50) x;
            boolean p = M.p(j);
            Object x2 = M.x();
            if (p || x2 == obj) {
                x2 = new emf0(j, kg50Var);
                M.R(x2);
            }
            q630.a aVar2 = q630.a.a;
            q630 g = bu00.e(aVar2, (izs) x2).g(q630Var);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 1, txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, m7p0.a, 1, s200.C(txj0.f(aVar2, 1.0f), znk0.z().g(k.b.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))));
            androidx.compose.foundation.layout.k a = j.a(androidx.compose.foundation.layout.a.g, dt1.a.k, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, F);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar2);
            if (topBar$Before == null) {
                M.K(1020443417);
                M.j();
                s3q0Var = null;
            } else {
                M.K(-1629650456);
                e.a(topBar$Before, aVar2, M, ((i4 >> 6) & 112) | 6, 0);
                M.j();
                s3q0Var = s3q0.a;
            }
            if (s3q0Var == null) {
                M.K(-1629649772);
                mq.d(aVar2, 44, M, 6);
            } else {
                M.K(-1629650609);
                M.j();
            }
            if (list.size() > 1 || (z && !list.isEmpty())) {
                M.K(1020579818);
                H(list, i, s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2).g(new gor0(dt1.a.l)), izsVar2, M, (i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 >> 6) & 7168) | 32768 | ((i4 >> 9) & 57344));
            } else {
                M.K(1015219019);
            }
            M.j();
            if (dVar == null) {
                M.K(1020974137);
                M.j();
                s3q0Var2 = null;
            } else {
                M.K(-1629633336);
                dVar.a(aVar2, M, ((i4 >> 9) & 112) | 6);
                M.j();
                s3q0Var2 = s3q0.a;
            }
            if (s3q0Var2 == null) {
                M.K(-1629632652);
                mq.d(aVar2, 44, M, 6);
            } else {
                M.K(-1629633520);
                M.j();
            }
            if (kr.f(M)) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fmf0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    ((Integer) obj3).getClass();
                    int i5 = RedesignedClipsTopBar.N;
                    RedesignedClipsTopBar.this.I(list, i, q630Var, topBar$Before, dVar, izsVar, z, aVar4, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final int getCurrentTabIndex() {
        return ((Number) ((zak0) this.L).getValue()).intValue();
    }

    public final izs<Integer, s3q0> getOnTabClicked() {
        return (izs) ((zak0) this.J).getValue();
    }

    public final boolean getShowSingleTab() {
        return ((Boolean) ((zak0) this.M).getValue()).booleanValue();
    }

    /* renamed from: getTabs-sCxhJsk, reason: not valid java name */
    public final List m79getTabssCxhJsk() {
        return ((wow) ((zak0) this.K).getValue()).b;
    }

    public final void setCurrentTabIndex(int i) {
        ((zak0) this.L).setValue(Integer.valueOf(i));
    }

    public final void setOnTabClicked(izs<? super Integer, s3q0> izsVar) {
        ((zak0) this.J).setValue(izsVar);
    }

    public final void setShowSingleTab(boolean z) {
        ((zak0) this.M).setValue(Boolean.valueOf(z));
    }

    /* renamed from: setTabs-56N2U88, reason: not valid java name */
    public final void m80setTabs56N2U88(List list) {
        ((zak0) this.K).setValue(new wow(list));
    }
}
