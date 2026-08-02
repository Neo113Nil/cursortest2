package com.vk.clips.sdk.shared.item.static_ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.clips.sdk.shared.item.static_ads.a;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.core.ui.image.VKImageController;
import com.vk.movika.sdk.base.flow.binding.l;
import com.vk.mvi.MviLazyViewContainer;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.aaz;
import xsna.ajd0;
import xsna.ao50;
import xsna.axk0;
import xsna.bvk0;
import xsna.bxk0;
import xsna.cu0;
import xsna.cxk0;
import xsna.dac0;
import xsna.dxk0;
import xsna.e43;
import xsna.emi;
import xsna.epx;
import xsna.exk0;
import xsna.f0z;
import xsna.fh9;
import xsna.fm20;
import xsna.fot;
import xsna.fxk0;
import xsna.gl6;
import xsna.gm50;
import xsna.gxp0;
import xsna.hvk0;
import xsna.hwk0;
import xsna.ivk0;
import xsna.ixk0;
import xsna.jcf0;
import xsna.js50;
import xsna.jvk0;
import xsna.jwk0;
import xsna.kaf;
import xsna.ki0;
import xsna.km50;
import xsna.ks50;
import xsna.kvk0;
import xsna.kxk0;
import xsna.l340;
import xsna.l850;
import xsna.ls50;
import xsna.lvk0;
import xsna.mk;
import xsna.mk50;
import xsna.msy;
import xsna.mx4;
import xsna.nit;
import xsna.nxk0;
import xsna.ojh0;
import xsna.pb;
import xsna.pw0;
import xsna.q20;
import xsna.rp1;
import xsna.rvk0;
import xsna.rwk0;
import xsna.s3q0;
import xsna.su;
import xsna.swk0;
import xsna.twk0;
import xsna.ume0;
import xsna.un9;
import xsna.uvx;
import xsna.uwk0;
import xsna.vk50;
import xsna.vwk0;
import xsna.wg1;
import xsna.wp40;
import xsna.wp50;
import xsna.wvk0;
import xsna.wwk0;
import xsna.wzs;
import xsna.xd40;
import xsna.xn50;
import xsna.xod;
import xsna.xp50;
import xsna.xwk0;
import xsna.ye80;
import xsna.ylj;
import xsna.yof;
import xsna.yt0;
import xsna.ywk0;
import xsna.zwk0;

/* compiled from: StaticAdsItemMviView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class c extends MviLazyViewContainer<b, fxk0, a> implements kvk0 {
    public static final /* synthetic */ int F = 0;
    public final Object A;
    public final l340 B;
    public final nit C;
    public final Object D;
    public final Object E;
    public final yof g;
    public final SchemeStat$TypeClipViewerItem.ScreenType h;
    public final int i;
    public final xod j;
    public final q20 k;
    public final gxp0 l;
    public final lvk0 m;
    public final ki0 n;
    public final kaf o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final rvk0 v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* JADX WARN: Type inference failed for: r3v6, types: [xsna.rvk0] */
    public c(Context context, pb pbVar, uvx uvxVar, emi emiVar, yof yofVar, SchemeStat$TypeClipViewerItem.ScreenType screenType, int i, xod xodVar, q20 q20Var, gxp0 gxp0Var, lvk0 lvk0Var, ki0 ki0Var) {
        super(context);
        this.g = yofVar;
        this.h = screenType;
        this.i = i;
        this.j = xodVar;
        this.k = q20Var;
        this.l = gxp0Var;
        this.m = lvk0Var;
        this.n = ki0Var;
        this.o = kaf.a;
        dac0 dac0Var = new dac0(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p = msy.a(lazyThreadSafetyMode, dac0Var);
        this.q = msy.a(lazyThreadSafetyMode, new ajd0(uvxVar, 7));
        this.r = msy.a(lazyThreadSafetyMode, new jcf0(this, 4));
        this.s = msy.a(lazyThreadSafetyMode, new un9(this, uvxVar, emiVar, 2));
        this.t = msy.a(lazyThreadSafetyMode, new wp40(this, 22));
        this.u = msy.a(lazyThreadSafetyMode, new ye80(this, 18));
        this.v = new gxp0.a() { // from class: xsna.rvk0
            @Override // xsna.gxp0.a
            public final void X2(ixp0 ixp0Var) {
                com.vk.clips.sdk.shared.item.static_ads.c.this.B.a(new StaticAdsItemViewEvent.f(ixp0Var));
            }
        };
        this.w = msy.a(lazyThreadSafetyMode, new ume0(5, this, context));
        this.x = msy.a(lazyThreadSafetyMode, new l(19, this, context));
        this.y = msy.a(lazyThreadSafetyMode, new fm20(this, 28));
        this.z = msy.a(lazyThreadSafetyMode, new com.vk.catalog2.common.ui.holders.b(24, context, this));
        this.A = msy.a(lazyThreadSafetyMode, new com.vk.voip.a(26, this, context));
        this.B = new l340(this, 12);
        this.C = new nit(this, 19);
        this.D = msy.a(lazyThreadSafetyMode, new rp1(22, pbVar, this));
        this.E = msy.a(lazyThreadSafetyMode, new mk(22, context, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final cu0 getAnalyticsStaticAdsDelegate() {
        return (cu0) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final hvk0 getContentMetricsRepository() {
        return (hvk0) this.q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final fot getGestureDetector() {
        return (fot) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final exk0 getImmediateHandler() {
        return (exk0) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final aaz getLinkHelper() {
        return (aaz) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final wvk0 getNavigationEventHandler() {
        return (wvk0) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final hwk0 getOverlayRenderLayer() {
        return (hwk0) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ixk0 getRenderEventsHandler() {
        return (ixk0) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final hwk0 getRenderLayerDefault() {
        return (hwk0) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final hwk0 getRenderLayerRedesign() {
        return (hwk0) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.clips.sdk.shared.item.static_ads.events.a getStaticAdEventsDelegate() {
        return (com.vk.clips.sdk.shared.item.static_ads.events.a) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final nxk0 getSubscriptionEventsDelegate() {
        return (nxk0) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final rwk0 getViewContainer() {
        return (rwk0) this.p.getValue();
    }

    public static exk0 k(c cVar) {
        return new exk0(new fh9(cVar, cVar.getLinkHelper()), cVar.g);
    }

    public static s3q0 l(c cVar, jwk0 jwk0Var) {
        cVar.getOverlayRenderLayer().getRenderer().getValue().a(jwk0Var);
        return s3q0.a;
    }

    public static void m(c cVar, StaticAdsItemViewEvent staticAdsItemViewEvent) {
        wp50 wp50Var;
        wp50 wp50Var2;
        js50 js50Var = cVar.getImmediateHandler().b;
        boolean z = staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.b;
        if (z) {
            if (js50Var != null) {
                StaticAdsItemViewEvent.b bVar = (StaticAdsItemViewEvent.b) staticAdsItemViewEvent;
                js50Var.a(bVar.f, bVar.h);
            }
        } else if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.d) {
            if (js50Var != null) {
                ls50 ls50Var = js50Var.a.b;
                if ((ls50Var instanceof ls50.a) && (wp50Var2 = ((ls50.a) ls50Var).b) != null) {
                    wp50Var2.f(xp50.l.a);
                }
            }
        } else if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.e) {
            if (js50Var != null) {
                ls50 ls50Var2 = js50Var.a.b;
                if ((ls50Var2 instanceof ls50.a) && (wp50Var = ((ls50.a) ls50Var2).b) != null) {
                    wp50Var.f(xp50.n.a);
                }
            }
        } else if ((staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.h) && js50Var != null) {
            ks50 ks50Var = js50Var.a;
            ks50Var.getClass();
            ls50.b bVar2 = ls50.b.a;
            ls50 ls50Var3 = ks50Var.b;
            if (bVar2 != ls50Var3) {
                Iterator it = ks50Var.a.iterator();
                while (it.hasNext()) {
                    ((wzs) it.next()).invoke(ls50Var3, bVar2);
                }
            }
            ks50Var.b = bVar2;
        }
        if (z) {
            StaticAdsItemViewEvent.b bVar3 = (StaticAdsItemViewEvent.b) staticAdsItemViewEvent;
            xn50.a.c(cVar, new a.InterfaceC0687a.C0688a(bVar3.b, bVar3.c, bVar3.d, bVar3.e, cVar.l.c(), bVar3.f, bVar3.g));
            return;
        }
        if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.a) {
            xn50.a.c(cVar, a.d.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof swk0) {
            xn50.a.c(cVar, a.b.C0689a.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof twk0) {
            xn50.a.c(cVar, a.b.C0690b.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof uwk0) {
            xn50.a.c(cVar, new a.b.c(((uwk0) staticAdsItemViewEvent).b));
            return;
        }
        if (staticAdsItemViewEvent instanceof wwk0) {
            xn50.a.c(cVar, a.c.b.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof vwk0) {
            xn50.a.c(cVar, a.c.C0691a.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof bxk0) {
            xn50.a.c(cVar, ivk0.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.f) {
            xn50.a.c(cVar, new a.h(((StaticAdsItemViewEvent.f) staticAdsItemViewEvent).b));
            return;
        }
        if (staticAdsItemViewEvent == StaticAdsItemViewEvent.OnItemViewFocusChanged.FOCUSED) {
            xn50.a.c(cVar, new a.f.C0693a(SystemClock.elapsedRealtime()));
            return;
        }
        if (staticAdsItemViewEvent == StaticAdsItemViewEvent.OnItemViewFocusChanged.UNFOCUSED) {
            xn50.a.c(cVar, a.f.b.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.g) {
            xn50.a.c(cVar, a.i.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.c) {
            xn50.a.c(cVar, a.g.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.h) {
            xn50.a.c(cVar, a.InterfaceC0687a.b.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof zwk0) {
            xn50.a.c(cVar, a.l.C0694a.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof axk0) {
            xn50.a.c(cVar, a.l.b.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof cxk0) {
            xn50.a.c(cVar, a.m.C0695a.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof dxk0) {
            xn50.a.c(cVar, a.m.b.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.i) {
            xn50.a.c(cVar, a.j.b);
            return;
        }
        if (staticAdsItemViewEvent instanceof xwk0) {
            xn50.a.c(cVar, a.e.b.b);
        } else if (staticAdsItemViewEvent instanceof ywk0) {
            xn50.a.c(cVar, new a.e.C0692a(((ywk0) staticAdsItemViewEvent).b));
        } else if (!(staticAdsItemViewEvent instanceof StaticAdsItemViewEvent.d) && !staticAdsItemViewEvent.equals(StaticAdsItemViewEvent.e.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static s3q0 n(c cVar, ylj yljVar) {
        jvk0 jvk0Var = cVar.getRenderEventsHandler().a;
        rwk0 rwk0Var = jvk0Var.a;
        float f = yljVar.b;
        String str = yljVar.a;
        if (!epx.f(jvk0Var.c, yljVar)) {
            ylj yljVar2 = jvk0Var.c;
            boolean f2 = epx.f(yljVar2 != null ? yljVar2.a : null, str);
            ylj yljVar3 = jvk0Var.c;
            boolean d = epx.d(yljVar3 != null ? Float.valueOf(yljVar3.b) : null, f);
            if (!f2 || !d) {
                VKImageController<ImageView> vKImageController = rwk0Var.b;
                FrameLayout frameLayout = rwk0Var.a;
                vKImageController.d(str, VKImageController.b.a(VKImageController.b.q, null, ((double) ((((float) frameLayout.getHeight()) / ((float) frameLayout.getWidth())) - f)) <= 0.2d ? VKImageController.ScaleType.CENTER_CROP : VKImageController.ScaleType.FIT_CENTER, null, 65407), jvk0Var.d);
            }
            rwk0Var.a.setKeepScreenOn(true);
            jvk0Var.c = yljVar;
        }
        return s3q0.a;
    }

    public static hwk0 o(c cVar) {
        return cVar.getRenderLayerDefault();
    }

    public static s3q0 p(c cVar, yt0 yt0Var) {
        cVar.getAnalyticsStaticAdsDelegate().getClass();
        cVar.getAnalyticsStaticAdsDelegate().a(cu0.b(yt0Var));
        return s3q0.a;
    }

    public static ixk0 q(c cVar) {
        return new ixk0(cVar.getViewContainer(), cVar.B);
    }

    public static s3q0 r(c cVar, yt0.h hVar) {
        cVar.getAnalyticsStaticAdsDelegate().getClass();
        cVar.getAnalyticsStaticAdsDelegate().a(cu0.b(hVar));
        return s3q0.a;
    }

    @Override // xsna.xn50
    @SuppressLint({"WrongThread"})
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fullscreen_static_ads_item, (ViewGroup) null, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.fullscreen_static_ads_item_controls_stub);
        viewStub.setLayoutResource(getOverlayRenderLayer().b());
        viewStub.inflate();
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        fxk0 fxk0Var = (fxk0) ao50Var;
        getOverlayRenderLayer().c().getValue().a();
        gm50.a.b(this, fxk0Var.a, new l850(this, 14));
        gm50.a.b(this, fxk0Var.b, new f0z(this, 28));
    }

    @Override // com.vk.mvi.MviLazyViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        b bVar = (b) vk50Var;
        int i = 0;
        int i2 = 1;
        bVar.j.a(new mx4(i2, getNavigationEventHandler(), wvk0.class, "onNewEventReceived", "onNewEventReceived(Lcom/vk/clips/sdk/shared/item/static_ads/events/navigation/StaticAdsItemNavigationEvent;)V", i, 7), getViewOwner());
        bVar.k.a(new gl6(i2, getStaticAdEventsDelegate(), com.vk.clips.sdk.shared.item.static_ads.events.a.class, "onNewEventReceived", "onNewEventReceived(Lcom/vk/clips/sdk/shared/item/static_ads/events/StaticAdsItemEvent;)V", i, 11), getViewOwner());
        bVar.l.a(new wg1(1, getSubscriptionEventsDelegate(), nxk0.class, "onNewEventReceived", "onNewEventReceived(Lcom/vk/clips/sdk/shared/item/static_ads/events/StaticAdsItemSubscriptionEvent;)V", 0, 17), getViewOwner());
    }

    @Override // xsna.kvk0
    public final void a() {
        this.B.a(StaticAdsItemViewEvent.h.b);
    }

    @Override // xsna.kvk0
    public final void c(boolean z) {
        this.B.a(z ? StaticAdsItemViewEvent.OnItemViewFocusChanged.FOCUSED : StaticAdsItemViewEvent.OnItemViewFocusChanged.UNFOCUSED);
    }

    @Override // xsna.kvk0
    public gxp0.a getUiVisibilityConfigChangedListener() {
        return this.v;
    }

    @Override // xsna.kvk0
    public final void h(bvk0 bvk0Var) {
        this.B.a(new StaticAdsItemViewEvent.b(bvk0Var.a, bvk0Var.c, bvk0Var.d, bvk0Var.e, bvk0Var.f, bvk0Var.g, bvk0Var.b));
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B.a(StaticAdsItemViewEvent.d.b);
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.a(StaticAdsItemViewEvent.e.b);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getGestureDetector().a(motionEvent);
        return true;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        d dVar = new d(getOverlayRenderLayer().a().getValue());
        lvk0 lvk0Var = this.m;
        ojh0 h = lvk0Var.h();
        su suVar = new su(lvk0Var.h());
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new b(dVar, h, suVar, new kxk0(context, new pw0(this.j)), getContentMetricsRepository(), getAnalyticsStaticAdsDelegate(), new xd40(this, 19));
    }

    private static /* synthetic */ void getRenderLayerRedesign$annotations() {
    }
}
