package com.vk.libvideo.design.compose.base.timeline;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.chromium.base.TimeUtils;
import xsna.aak0;
import xsna.ahn;
import xsna.alb0;
import xsna.anp;
import xsna.awf;
import xsna.azl;
import xsna.bap;
import xsna.bbk0;
import xsna.be0;
import xsna.c6i0;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.e43;
import xsna.fwu0;
import xsna.gzs;
import xsna.hr80;
import xsna.hxo0;
import xsna.ixh0;
import xsna.izs;
import xsna.j49;
import xsna.ja8;
import xsna.jd4;
import xsna.k9q0;
import xsna.kai;
import xsna.kci;
import xsna.kl60;
import xsna.kxo0;
import xsna.l5g;
import xsna.m5o0;
import xsna.mm2;
import xsna.mtk0;
import xsna.n34;
import xsna.nn4;
import xsna.nwl;
import xsna.o5o0;
import xsna.pm90;
import xsna.q630;
import xsna.qgo;
import xsna.qri;
import xsna.r0v0;
import xsna.ra8;
import xsna.rdu;
import xsna.rrv0;
import xsna.rte0;
import xsna.sua;
import xsna.swe0;
import xsna.sy90;
import xsna.txj0;
import xsna.uvi;
import xsna.wh50;
import xsna.wzs;
import xsna.xq1;
import xsna.xy0;
import xsna.yk8;
import xsna.ylu0;
import xsna.yzs;

/* compiled from: TimelineView.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: TimelineView.kt */
    /* renamed from: com.vk.libvideo.design.compose.base.timeline.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1225a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TimelineViewState.Style.values().length];
            try {
                iArr[TimelineViewState.Style.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineViewState.Style.Live.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TimelineViewState.TrackHeightType.values().length];
            try {
                iArr2[TimelineViewState.TrackHeightType.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TimelineViewState.TrackHeightType.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(final boolean z, final mtk0 mtk0Var, final TimelineViewState timelineViewState, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        mtk0 mtk0Var2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1926598091);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mtk0Var2 = mtk0Var;
            i2 |= M.J(mtk0Var2) ? 32 : 16;
        } else {
            mtk0Var2 = mtk0Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(timelineViewState) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (b.d()) {
                b.f(-1926598091, i3, -1, "com.vk.libvideo.design.compose.base.timeline.DragPreview (TimelineView.kt:145)");
            }
            final long j = timelineViewState.c;
            final TimelineViewState.d dVar = timelineViewState.h;
            final TimelineViewState.c cVar = timelineViewState.i;
            final mtk0 mtk0Var3 = mtk0Var2;
            q630.a aVar2 = q630.a.a;
            mm2.f(z, aVar2, anp.e(null, 3), anp.f(null, 3), null, kai.c(787595533, new yzs() { // from class: xsna.ixo0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x014d  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x025b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
                /* JADX WARN: Type inference failed for: r2v13 */
                /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r2v23 */
                /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Number] */
                /* JADX WARN: Type inference failed for: r3v11 */
                /* JADX WARN: Type inference failed for: r3v13 */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    mtk0 mtk0Var4;
                    cri.a.d dVar2;
                    cri.a.C2678a c2678a;
                    Throwable th;
                    ?? r2;
                    q630.a aVar3;
                    long longValue;
                    String format;
                    androidx.compose.runtime.a aVar4;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(787595533, intValue, -1, "com.vk.libvideo.design.compose.base.timeline.DragPreview.<anonymous> (TimelineView.kt:156)");
                    }
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar5));
                    sy90 D = aVar5.D();
                    q630.a aVar6 = q630.a.a;
                    q630 c = qri.c(aVar5, aVar6);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar7);
                    } else {
                        aVar5.f();
                    }
                    cri.a.c cVar2 = cri.a.f;
                    k9q0.w(aVar5, d, cVar2);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar5, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar5, valueOf, bVar);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(aVar5, c2678a2);
                    cri.a.d dVar3 = cri.a.d;
                    k9q0.w(aVar5, c, dVar3);
                    TimelineViewState.d dVar4 = TimelineViewState.d.this;
                    mtk0 mtk0Var5 = mtk0Var3;
                    if (dVar4 != null) {
                        aVar5.K(94433954);
                        c2678a = c2678a2;
                        dVar2 = dVar3;
                        th = null;
                        com.vk.libvideo.design.compose.base.timeline.a.b(mtk0Var5, j, dVar4, null, aVar5, 0);
                        mtk0Var4 = mtk0Var5;
                    } else {
                        mtk0Var4 = mtk0Var5;
                        dVar2 = dVar3;
                        c2678a = c2678a2;
                        th = null;
                        aVar5.K(87971663);
                    }
                    aVar5.j();
                    q630 h = txj0.h(txj0.f(aVar6, 1.0f), 110);
                    ty6 ty6Var = dt1.a.i;
                    ra8 ra8Var = ra8.a;
                    com.vk.libvideo.design.compose.base.timeline.a.c(ra8Var.b(h, ty6Var), aVar5, 0);
                    q630 b = ra8Var.b(aVar6, ty6Var);
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar5, 48);
                    int hashCode2 = Long.hashCode(n34.n(aVar5));
                    sy90 D2 = aVar5.D();
                    q630 c2 = qri.c(aVar5, b);
                    if (aVar5.N() == null) {
                        n34.r();
                        throw th;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar7);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, a, cVar2);
                    k9q0.w(aVar5, D2, eVar);
                    ur.d(hashCode2, aVar5, bVar, aVar5, c2678a);
                    k9q0.w(aVar5, c2, dVar2);
                    TimelineViewState.c cVar3 = cVar;
                    if (cVar3 != null) {
                        List<TimelineViewState.c.a> list = cVar3.a;
                        long longValue2 = ((Number) mtk0Var4.getValue()).longValue();
                        TimelineViewState.c.a aVar8 = (TimelineViewState.c.a) j5g.k0(list);
                        int b2 = (aVar8 == null || aVar8.b >= longValue2) ? e43.b(list.size(), list, new x830(longValue2, 1)) : e43.h(list);
                        ?? r3 = Integer.valueOf(b2);
                        if (b2 == -1) {
                            r3 = th;
                        }
                        if (r3 != 0) {
                            r2 = list.get(r3.intValue()).c;
                            if (r2 == 0) {
                                aVar5.K(-844824246);
                                float f = 48;
                                q630 H = s200.H(aVar6, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 8, 2);
                                aVar3 = aVar6;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j2 = ylu0Var.getText().d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                }
                                wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                yqv0.c(r2, H, j2, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.l0, aVar5, 0, 0, 8184);
                                aVar5 = aVar5;
                            } else {
                                aVar3 = aVar6;
                                aVar5.K(-851981991);
                            }
                            aVar5.j();
                            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Large;
                            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
                            q630 H2 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 26, 7);
                            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
                            longValue = ((Number) mtk0Var4.getValue()).longValue() / 1000;
                            Locale locale = Locale.getDefault();
                            if (longValue >= TimeUtils.SECONDS_PER_HOUR) {
                                long j3 = 60;
                                format = String.format(locale, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(longValue / j3), Long.valueOf(longValue % j3)}, 2));
                            } else {
                                long j4 = 60;
                                format = String.format(locale, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(longValue / 3600), Long.valueOf((longValue / j4) % j4), Long.valueOf(longValue % j4)}, 3));
                            }
                            aVar4 = aVar5;
                            rnu0.c(contentBadgeSize, contentBadgeMode, design, H2, null, null, format, null, null, null, false, null, false, null, aVar4, 3456, 0, 16304);
                            if (kr.f(aVar4)) {
                                androidx.compose.runtime.b.e();
                            }
                            return s3q0.a;
                        }
                    }
                    r2 = th;
                    if (r2 == 0) {
                    }
                    aVar5.j();
                    ContentBadgeSize contentBadgeSize2 = ContentBadgeSize.Large;
                    ContentBadgeMode contentBadgeMode2 = ContentBadgeMode.Primary;
                    q630 H22 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 26, 7);
                    ContentBadgeAppearance.Design design2 = ContentBadgeAppearance.Design.Overlay;
                    longValue = ((Number) mtk0Var4.getValue()).longValue() / 1000;
                    Locale locale2 = Locale.getDefault();
                    if (longValue >= TimeUtils.SECONDS_PER_HOUR) {
                    }
                    aVar4 = aVar5;
                    rnu0.c(contentBadgeSize2, contentBadgeMode2, design2, H22, null, null, format, null, null, null, false, null, false, null, aVar4, 3456, 0, 16304);
                    if (kr.f(aVar4)) {
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 6) & 112) | (i3 & 14) | 200064, 16);
            if (b.d()) {
                b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jxo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.libvideo.design.compose.base.timeline.a.a(z, mtk0Var, timelineViewState, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(mtk0 mtk0Var, long j, TimelineViewState.d dVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1057901402);
        int i2 = i | (M.J(mtk0Var) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.J(dVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (b.d()) {
                b.f(1057901402, i2, -1, "com.vk.libvideo.design.compose.base.timeline.FramePreview (TimelineView.kt:215)");
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = bbk0.b(new o5o0(j, mtk0Var, dVar));
                M.R(x);
            }
            mtk0 mtk0Var2 = (mtk0) x;
            boolean J = M.J(mtk0Var2);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = bbk0.b(new xq1(13, mtk0Var2, dVar));
                M.R(x2);
            }
            mtk0 mtk0Var3 = (mtk0) x2;
            q630.a aVar2 = q630.a.a;
            q630 m = hr80.m(txj0.d(aVar2, 1.0f), l5g.b, e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            q630 e = rte0.e(ra8.a.b(sua.d(dVar.a / dVar.b, aVar2, false), dt1.a.f));
            boolean J2 = M.J(mtk0Var2) | ((i2 & 896) == 256);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                x3 = new pm90(5, mtk0Var2, dVar);
                M.R(x3);
            }
            q630 a = rdu.a(e, (izs) x3);
            String str = (String) mtk0Var3.getValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new kl60(19);
                M.R(x4);
            }
            r0v0.a(fwu0.l(null, str, (izs) x4, null, M, 24576, 45), a, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            M = M;
            M.G();
            if (b.d()) {
                b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        f s = M.s();
        if (s != null) {
            s.d = new hxo0(mtk0Var, j, dVar, q630Var2, i);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(343026450);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(343026450, i2, -1, "com.vk.libvideo.design.compose.base.timeline.GradientView (TimelineView.kt:263)");
            }
            float I0 = ((azl) M.r(uvi.h)).I0(110);
            Object x = M.x();
            if (x == a.C0011a.a) {
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                long j = l5g.b;
                x = yk8.a.c(new Pair[]{new Pair(valueOf, new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), new Pair(Float.valueOf(0.15f), new l5g(l5g.c(14, j, 0.02f))), new Pair(Float.valueOf(0.3f), new l5g(l5g.c(14, j, 0.08f))), new Pair(Float.valueOf(0.7f), new l5g(l5g.c(14, j, 0.32f))), new Pair(Float.valueOf(0.85f), new l5g(l5g.c(14, j, 0.38f))), new Pair(Float.valueOf(1.0f), new l5g(l5g.c(14, j, 0.4f)))}, 0L, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(I0) & 4294967295L), 0);
                M.R(x);
            }
            ja8.a(hr80.l(q630Var, (yk8) x, null, 6), M, 0);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new jd4(q630Var, i, 14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01eb, code lost:
    
        if (r3 == r0) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(TimelineViewState timelineViewState, q630 q630Var, q630 q630Var2, androidx.compose.runtime.a aVar, int i) {
        float f;
        boolean z;
        mtk0 mtk0Var;
        int i2;
        Object obj;
        wh50 wh50Var;
        Throwable th;
        wh50 wh50Var2;
        mtk0 mtk0Var2;
        wh50 wh50Var3;
        Object obj2;
        long j;
        TimelineViewState.d dVar = timelineViewState.h;
        mtk0<Long> mtk0Var3 = timelineViewState.a;
        androidx.compose.runtime.a M = aVar.M(1223285207);
        int i3 = i | (M.J(timelineViewState) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.J(q630Var2) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (b.d()) {
                b.f(1223285207, i3, -1, "com.vk.libvideo.design.compose.base.timeline.TimelineView (TimelineView.kt:63)");
            }
            Object x = M.x();
            Object obj3 = a.C0011a.a;
            if (x == obj3) {
                x = k.b(null);
                M.R(x);
            }
            wh50 wh50Var4 = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj3) {
                x2 = k.b(qgo.NoState);
                M.R(x2);
            }
            wh50 wh50Var5 = (wh50) x2;
            boolean J = M.J(mtk0Var3);
            Object x3 = M.x();
            if (J || x3 == obj3) {
                x3 = bbk0.b(new xy0(25, wh50Var4, timelineViewState));
                M.R(x3);
            }
            mtk0 mtk0Var4 = (mtk0) x3;
            int i4 = C1225a.$EnumSwitchMapping$1[timelineViewState.f.ordinal()];
            if (i4 == 1) {
                f = 6;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 2;
            }
            float f2 = f;
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object x4 = M.x();
            if (z2 || x4 == obj3) {
                x4 = new kxo0(timelineViewState, wh50Var5, wh50Var4, null);
                M.R(x4);
            }
            bap.g(mtk0Var3, (wzs) x4, M, 0);
            if (dVar != null) {
                M.K(93253711);
                wh50Var = wh50Var5;
                obj = obj3;
                i2 = i5;
                th = null;
                mtk0Var = mtk0Var4;
                z = false;
                mm2.f(wh50Var5.getValue() == qgo.OnlyPreviewBehind, q630Var2, anp.e(new aak0(), 2), anp.f(null, 3), null, kai.c(-289353398, new nwl(2, mtk0Var4, timelineViewState), M), M, ((i3 >> 3) & 112) | 200064, 16);
            } else {
                z = false;
                mtk0Var = mtk0Var4;
                i2 = i5;
                obj = obj3;
                wh50Var = wh50Var5;
                th = null;
                M.K(89383051);
            }
            M.j();
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, z);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
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
            if (dVar != null) {
                M.K(-1943050342);
                boolean z3 = wh50Var.getValue() == qgo.FullOverlay ? true : z;
                wh50Var2 = wh50Var4;
                mtk0Var2 = mtk0Var;
                wh50Var3 = wh50Var;
                a(z3, mtk0Var2, timelineViewState, null, M, (i3 << 6) & 896);
            } else {
                wh50Var2 = wh50Var4;
                mtk0Var2 = mtk0Var;
                wh50Var3 = wh50Var;
                M.K(-1947294459);
            }
            M.j();
            q630 E = ahn.E(kci.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 23, 1, ra8.a.b(txj0.f(q630.a.a, 1.0f), dt1.a.i)), "mvi_video_card_progress");
            boolean J2 = M.J(mtk0Var2);
            Object x5 = M.x();
            if (J2) {
                obj2 = obj;
            } else {
                obj2 = obj;
            }
            x5 = bbk0.b(new ixh0(mtk0Var2, 1));
            M.R(x5);
            mtk0 mtk0Var5 = (mtk0) x5;
            boolean J3 = M.J(timelineViewState.b);
            Object x6 = M.x();
            if (J3 || x6 == obj2) {
                x6 = bbk0.b(new m5o0(timelineViewState, 1));
                M.R(x6);
            }
            mtk0 mtk0Var6 = (mtk0) x6;
            awf awfVar = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, timelineViewState.c);
            boolean z4 = timelineViewState.e;
            boolean z5 = timelineViewState.d;
            int i6 = C1225a.$EnumSwitchMapping$0[timelineViewState.g.ordinal()];
            if (i6 == 1) {
                M.K(-755383315);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                long j2 = ylu0Var.getBackground().b;
                M.j();
                j = j2;
            } else {
                if (i6 != 2) {
                    throw alb0.c(-755386197, M);
                }
                M.K(-755380538);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j = ylu0Var2.q().m;
                M.j();
            }
            int i7 = i2;
            boolean z6 = i7 == 4;
            Object x7 = M.x();
            if (z6 || x7 == obj2) {
                x7 = new nn4(wh50Var2, timelineViewState, wh50Var3, 9);
                M.R(x7);
            }
            izs izsVar = (izs) x7;
            boolean z7 = i7 == 4;
            Object x8 = M.x();
            if (z7 || x8 == obj2) {
                x8 = new j49(wh50Var2, timelineViewState, wh50Var3, 6);
                M.R(x8);
            }
            c6i0.a(mtk0Var5, mtk0Var6, izsVar, E, z5, awfVar, z4, f2, j, (gzs) x8, null, M, 0);
            M = M;
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new be0(i, 6, timelineViewState, q630Var, q630Var2);
        }
    }

    public static final long e(long j, long j2) {
        float f = j2;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float valueOf2 = Float.valueOf(1.0f);
        float f2 = swe0.f(j / f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        Pair pair = new Pair(valueOf, valueOf);
        Pair pair2 = new Pair(Float.valueOf(0.05f), valueOf);
        Float valueOf3 = Float.valueOf(0.1f);
        Pair pair3 = new Pair(valueOf3, valueOf3);
        Float valueOf4 = Float.valueOf(0.9f);
        List l = e43.l(pair, pair2, pair3, new Pair(valueOf4, valueOf4), new Pair(Float.valueOf(0.95f), valueOf2), new Pair(valueOf2, valueOf2));
        Iterator it = l.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Pair pair4 = (Pair) it.next();
            if (((Number) pair4.i()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((Number) pair4.i()).floatValue() >= f2) {
                break;
            }
            i++;
        }
        Pair pair5 = (Pair) l.get(i - 1);
        Pair pair6 = (Pair) l.get(i);
        float floatValue = (f2 - ((Number) pair5.i()).floatValue()) / (((Number) pair6.i()).floatValue() - ((Number) pair5.i()).floatValue());
        float floatValue2 = ((Number) pair5.j()).floatValue();
        return (long) ((((((Number) pair6.j()).floatValue() - floatValue2) * floatValue) + floatValue2) * f);
    }
}
