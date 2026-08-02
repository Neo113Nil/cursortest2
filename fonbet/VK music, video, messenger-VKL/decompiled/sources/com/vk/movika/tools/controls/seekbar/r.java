package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.notifications.core.item.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.ahn;
import xsna.cef0;
import xsna.ck70;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.dz;
import xsna.e2h0;
import xsna.f2h0;
import xsna.f5x;
import xsna.f9n0;
import xsna.f9t;
import xsna.fgb0;
import xsna.gzs;
import xsna.h5x;
import xsna.hei;
import xsna.hr80;
import xsna.ir;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.kef0;
import xsna.kqu0;
import xsna.kyj;
import xsna.l7k0;
import xsna.lgs0;
import xsna.muv0;
import xsna.n34;
import xsna.ne7;
import xsna.ojc;
import xsna.olg;
import xsna.q630;
import xsna.qri;
import xsna.rnu0;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sy90;
import xsna.tat0;
import xsna.txj0;
import xsna.u7n0;
import xsna.uno0;
import xsna.ur;
import xsna.v76;
import xsna.wdn0;
import xsna.wh50;
import xsna.wuv0;
import xsna.wvq;
import xsna.wzs;
import xsna.x3i;
import xsna.xh2;
import xsna.y3i;
import xsna.yak0;
import xsna.yat0;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, xsna.h5x] */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.runtime.a] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        androidx.compose.runtime.a aVar;
        int i = this.b;
        q630.a aVar2 = q630.a.a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView.a aVar3 = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).h = Color.parseColor((String) obj2);
                return Boolean.TRUE;
            case 1:
                ((Integer) obj2).getClass();
                int i2 = com.vk.attachpicker.collages.a.k1;
                ((com.vk.attachpicker.collages.a) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((olg) obj3).a(ne7.I(55), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                kyj kyjVar = (kyj) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-71230557, intValue, -1, "com.vk.clips.design.compose.counters.CountersBlock.<anonymous> (CountersBlock.kt:57)");
                    }
                    Object x = aVar4.x();
                    if (x == c0012a) {
                        x = new dz(18);
                        aVar4.R(x);
                    }
                    xh2.a(kyjVar, null, null, null, null, (izs) x, hei.a, aVar4, 1769472, 30);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                View view = ((FaveFeedFragment) obj3).d0;
                if (view != null) {
                    view.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((wvq) obj3).e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ?? r12 = (h5x) obj3;
                ?? r14 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (r14.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(443053111, intValue2, -1, "com.vk.core.tool.view.InspectorControlsView.ThemedContent.<anonymous> (InspectorControlsView.kt:64)");
                    }
                    q630 f = txj0.f(aVar2, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) r14.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, 1, hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a));
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(r14));
                    sy90 D = r14.D();
                    q630 c = qri.c(r14, F);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (r14.N() == null) {
                        n34.r();
                        throw null;
                    }
                    r14.H();
                    if (r14.L()) {
                        r14.I(aVar5);
                    } else {
                        r14.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(r14, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(r14, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(r14, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(r14, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(r14, c, dVar);
                    q630 f2 = txj0.f(aVar2, 1.0f);
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, r14, 0);
                    int hashCode2 = Long.hashCode(n34.n(r14));
                    sy90 D2 = r14.D();
                    q630 c2 = qri.c(r14, f2);
                    if (r14.N() == null) {
                        n34.r();
                        throw null;
                    }
                    r14.H();
                    if (r14.L()) {
                        r14.I(aVar5);
                    } else {
                        r14.f();
                    }
                    k9q0.w(r14, a, cVar);
                    k9q0.w(r14, D2, eVar);
                    ur.d(hashCode2, r14, bVar, r14, c2678a);
                    k9q0.w(r14, c2, dVar);
                    muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Design Inspector", null, null, null, null, r14, 196614, 30), null, null, null, r14, 14), null, null, null, null, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r14, 0, 0, 8190);
                    boolean booleanValue2 = ((Boolean) ((zak0) r12.m).getValue()).booleanValue();
                    boolean y = r14.y(r12);
                    Object x2 = r14.x();
                    int i3 = 19;
                    Object obj4 = x2;
                    if (y || x2 == c0012a) {
                        x3i x3iVar = new x3i(r12, i3);
                        r14.R(x3iVar);
                        obj4 = x3iVar;
                    }
                    r12.B(32774, 8, r14, "Включён", null, (gzs) obj4, booleanValue2);
                    boolean areViewsClickable = r12.getAreViewsClickable();
                    boolean y2 = r14.y(r12);
                    Object x3 = r14.x();
                    Object obj5 = x3;
                    if (y2 || x3 == c0012a) {
                        y3i y3iVar = new y3i((Object) r12, i3);
                        r14.R(y3iVar);
                        obj5 = y3iVar;
                    }
                    r12.B(35846, 0, r14, "Кликабельные view", "Открывать отчёт по клику на view", (gzs) obj5, areViewsClickable);
                    boolean booleanValue3 = ((Boolean) ((zak0) r12.o).getValue()).booleanValue();
                    boolean y3 = r14.y(r12);
                    Object x4 = r14.x();
                    Object obj6 = x4;
                    if (y3 || x4 == c0012a) {
                        f5x f5xVar = new f5x((Object) r12, r10 ? 1 : 0);
                        r14.R(f5xVar);
                        obj6 = f5xVar;
                    }
                    r12.B(32774, 8, r14, "Иконка", null, (gzs) obj6, booleanValue3);
                    r12.D(8, r14);
                    f9t.e(txj0.h(aVar2, kqu0.w), r14, 0);
                    r12.C(8, r14);
                    r14.G();
                    r14.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    r14.h();
                }
                return s3q0.a;
            case 7:
                a.C1441a c1441a = (a.C1441a) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2022087402, intValue3, -1, "com.vk.notifications.design.compose.list.common.NotificationBubbleContent.<anonymous> (NotificationBubbleContent.kt:40)");
                    }
                    q630.a aVar7 = q630.a.a;
                    q630 E = s200.E(aVar7, 12, 8);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar6, 0);
                    int hashCode3 = Long.hashCode(n34.n(aVar6));
                    sy90 D3 = aVar6.D();
                    q630 c3 = qri.c(aVar6, E);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (aVar6.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar6.H();
                    if (aVar6.L()) {
                        aVar6.I(aVar8);
                    } else {
                        aVar6.f();
                    }
                    k9q0.w(aVar6, a2, cri.a.f);
                    k9q0.w(aVar6, D3, cri.a.e);
                    k9q0.w(aVar6, Integer.valueOf(hashCode3), cri.a.g);
                    k9q0.t(aVar6, cri.a.h);
                    k9q0.w(aVar6, c3, cri.a.d);
                    CharSequence charSequence = c1441a.a;
                    String str2 = c1441a.b;
                    if (charSequence == null) {
                        aVar6.K(483663238);
                        aVar6.j();
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    } else {
                        aVar6.K(483663239);
                        aVar6.K(-918352993);
                        String obj7 = charSequence.toString();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        long j = ylu0Var2.getText().m;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.c(obj7, aVar7, j, null, null, 0, 5, null, 2, false, 0, 4, null, wuv0Var.e0, aVar6, 100663344, 48, 5816);
                        aVar6.j();
                        aVar6.j();
                    }
                    if (c1441a.a == null || str2 == null) {
                        aVar6.K(481978606);
                        aVar6.j();
                    } else {
                        aVar6.K(484637414);
                        ck70.b(aVar7, 2, aVar6, 6);
                    }
                    if (str2 == null) {
                        aVar6.K(484750904);
                        aVar6.j();
                        aVar = aVar6;
                    } else {
                        aVar6.K(484750905);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var3.getText().p;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var2 = (wuv0) aVar6.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar = aVar6;
                        yqv0.c(str2, aVar7, j2, null, null, 0, 1, null, 0, false, 0, 1, null, wuv0Var2.m0, aVar, 48, 48, 6072);
                        aVar.j();
                    }
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((fgb0) obj3).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                cef0.b((kef0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                e2h0 e2h0Var = (e2h0) obj3;
                f2h0 f2h0Var = (f2h0) obj;
                wh50 wh50Var = (wh50) obj2;
                if (!(wh50Var instanceof yak0)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                yak0 yak0Var = (yak0) wh50Var;
                Object i4 = e2h0Var.i(f2h0Var, yak0Var.getValue());
                if (i4 != null) {
                    return androidx.compose.runtime.k.a(i4, yak0Var.d());
                }
                return null;
            case 11:
                return ((v76) obj3).getBottomControlPanel().k((Throwable) obj, (izs) obj2);
            case 12:
                wdn0 wdn0Var = (wdn0) obj3;
                ((Integer) obj).getClass();
                WebAction webAction = (WebAction) obj2;
                u7n0 u7n0Var = wdn0Var.p;
                Context context = wdn0Var.itemView.getContext();
                Object obj8 = wdn0Var.l;
                Object obj9 = obj8;
                if (obj8 == null) {
                    obj9 = null;
                }
                u7n0Var.b(context, webAction, (f9n0) obj9, null);
                return s3q0.a;
            case 13:
                uno0 uno0Var = (uno0) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(839963017, intValue4, -1, "com.vk.video.profile.presentation.views.TextWithAgeBadge.<anonymous> (TextWithAgeBadge.kt:35)");
                    }
                    ContentBadgeSize contentBadgeSize = ContentBadgeSize.Small;
                    ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
                    ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Neutral;
                    String str3 = uno0Var.c;
                    q630 B = txj0.B(aVar2, null, 3);
                    Object x5 = aVar9.x();
                    if (x5 == c0012a) {
                        x5 = ir.h(aVar9);
                    }
                    rnu0.c(contentBadgeSize, contentBadgeMode, design, ahn.E(ojc.b(B, (sg50) x5, null, false, null, uno0Var.e, 28), "video_channel_age_mark_badge"), null, null, str3, null, null, null, true, null, false, null, aVar9, 438, 6, 15280);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 14:
                yat0 yat0Var = (yat0) obj3;
                lgs0.a aVar10 = (lgs0.a) obj;
                String str4 = (String) obj2;
                int i5 = aVar10.f;
                VideoRecommendationVideosType videoRecommendationVideosType = aVar10.c;
                return videoRecommendationVideosType == VideoRecommendationVideosType.OFFLINE ? yat0Var.i.b(aVar10.b, i5, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.OFFLINE), AboutVideoItem.SimilarVideoRedesign.Style.NORMAL, DonutVideoCardSource.LARGE_CARD, false) : tat0.c(yat0Var.i, aVar10.b, i5, videoRecommendationVideosType, null, null, null, false, str4, 120);
            default:
                return Float.valueOf(((Float) obj2).floatValue() * ((l7k0) obj3).d);
        }
    }

    public /* synthetic */ r(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
