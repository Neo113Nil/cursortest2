package com.vk.clips.sdk.shared.item.market_ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.component.ads.ClipMarketCardView;
import com.vk.clips.sdk.facade.api.MyTargetFacadeClickTarget;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemAction;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.clips.sdk.shared.item.market_ads.view.models.CarouselMode;
import com.vk.clips.sdk.shared.item.market_ads.view.models.OverscrollMode;
import com.vk.mvi.MviLazyViewContainer;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.Cnew;
import xsna.aaz;
import xsna.ao50;
import xsna.ap00;
import xsna.ar00;
import xsna.b1h;
import xsna.bp00;
import xsna.br00;
import xsna.bzj;
import xsna.cp00;
import xsna.cpq;
import xsna.cr00;
import xsna.cu0;
import xsna.dg1;
import xsna.dp00;
import xsna.dr00;
import xsna.e43;
import xsna.emi;
import xsna.ep00;
import xsna.epx;
import xsna.fh9;
import xsna.fot;
import xsna.gm50;
import xsna.gp00;
import xsna.gr00;
import xsna.gxp0;
import xsna.gzs;
import xsna.gzv;
import xsna.i4;
import xsna.iah0;
import xsna.ip00;
import xsna.ir00;
import xsna.ixp0;
import xsna.jp00;
import xsna.js50;
import xsna.kaf;
import xsna.ki0;
import xsna.km50;
import xsna.kq00;
import xsna.kr00;
import xsna.ks50;
import xsna.lkh0;
import xsna.ls50;
import xsna.mk50;
import xsna.mq00;
import xsna.msy;
import xsna.mxc;
import xsna.nly;
import xsna.ojh0;
import xsna.omf;
import xsna.p2b;
import xsna.p5y;
import xsna.po00;
import xsna.pp00;
import xsna.pw0;
import xsna.q20;
import xsna.qq00;
import xsna.r5i;
import xsna.rop;
import xsna.rp00;
import xsna.rq00;
import xsna.s3q0;
import xsna.s6y;
import xsna.sfz;
import xsna.sq00;
import xsna.su;
import xsna.tq00;
import xsna.ugm;
import xsna.uq00;
import xsna.uvx;
import xsna.uw4;
import xsna.v3n;
import xsna.vk50;
import xsna.vo00;
import xsna.vq00;
import xsna.vw4;
import xsna.wih0;
import xsna.wp50;
import xsna.wq00;
import xsna.wzs;
import xsna.x4u;
import xsna.xn50;
import xsna.xod;
import xsna.xp50;
import xsna.xq00;
import xsna.yof;
import xsna.yp00;
import xsna.yq00;
import xsna.yt0;
import xsna.zq00;
import xsna.zr50;

/* compiled from: MarketAdsItemMviView.kt */
/* loaded from: classes17.dex */
public final class b extends MviLazyViewContainer<a, dr00, MarketAdsItemAction> implements ip00 {
    public static final /* synthetic */ int G = 0;
    public final Object A;
    public final Object B;
    public final rp00 C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final SchemeStat$TypeClipViewerItem.ScreenType g;
    public final yof h;
    public final xod i;
    public final gxp0 j;
    public final q20 k;
    public final jp00 l;
    public final ki0 m;
    public final mxc n;
    public final kaf o;
    public wp50 p;
    public final Object q;
    public final ugm r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final cpq w;
    public final Object x;
    public final Object y;
    public final dg1 z;

    /* JADX WARN: Type inference failed for: r2v23, types: [xsna.rp00] */
    public b(final Context context, SchemeStat$TypeClipViewerItem.ScreenType screenType, final int i, uvx uvxVar, emi emiVar, yof yofVar, xod xodVar, gxp0 gxp0Var, q20 q20Var, jp00 jp00Var, ki0 ki0Var, mxc mxcVar) {
        super(context);
        this.g = screenType;
        this.h = yofVar;
        this.i = xodVar;
        this.j = gxp0Var;
        this.k = q20Var;
        this.l = jp00Var;
        this.m = ki0Var;
        this.n = mxcVar;
        this.o = kaf.a;
        nly nlyVar = new nly(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, nlyVar);
        this.r = new ugm(this, 15);
        this.s = msy.a(lazyThreadSafetyMode, new i4(9, context, this));
        this.t = msy.a(lazyThreadSafetyMode, new s6y(this, 2));
        this.u = msy.a(lazyThreadSafetyMode, new gzv(this, 5));
        this.v = msy.a(lazyThreadSafetyMode, new x4u(this, 4));
        this.w = new cpq(new Cnew(this, 3), new b1h(this, 28), new p5y(this, 5));
        this.x = msy.a(lazyThreadSafetyMode, new r5i(this, 26));
        this.y = msy.a(lazyThreadSafetyMode, new bzj(this, 24));
        this.z = new dg1(this, 25);
        this.A = msy.a(lazyThreadSafetyMode, new v3n(this, 16));
        this.B = msy.a(lazyThreadSafetyMode, new p2b(this, uvxVar, emiVar, 2));
        this.C = new gxp0.a() { // from class: xsna.rp00
            @Override // xsna.gxp0.a
            public final void X2(ixp0 ixp0Var) {
                com.vk.clips.sdk.shared.item.market_ads.b.this.z.a(new MarketAdsItemViewEvent.f(ixp0Var));
            }
        };
        this.D = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.sp00
            @Override // xsna.gzs
            public final Object invoke() {
                final com.vk.clips.sdk.shared.item.market_ads.b bVar = com.vk.clips.sdk.shared.item.market_ads.b.this;
                final int i2 = i;
                gzs gzsVar = new gzs() { // from class: xsna.qp00
                    @Override // xsna.gzs
                    public final Object invoke() {
                        com.vk.clips.sdk.shared.item.market_ads.b bVar2 = com.vk.clips.sdk.shared.item.market_ads.b.this;
                        return new cq00(bVar2, i2, bVar2.l.d(), bVar2.h, bVar2.z);
                    }
                };
                LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
                Lazy a = msy.a(lazyThreadSafetyMode2, gzsVar);
                return new fq00(msy.a(lazyThreadSafetyMode2, new y4(14, bVar, context)), msy.a(lazyThreadSafetyMode2, new cm(17, a, bVar)), a, new fn4(22));
            }
        });
        this.E = msy.a(lazyThreadSafetyMode, new sfz(this, i, context, 1));
        this.F = msy.a(lazyThreadSafetyMode, new pp00(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final cu0 getAnalyticsStaticAdsDelegate() {
        return (cu0) this.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final fot getGestureDetector() {
        return (fot) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final cr00 getImmediateHandler() {
        return (cr00) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final aaz getLinkHelper() {
        return (aaz) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final po00 getMarketAdEventsDelegate() {
        return (po00) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final yp00 getNavigationEventHandler() {
        return (yp00) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kq00 getOverlayRenderLayer() {
        return (kq00) this.F.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final gr00 getRenderEventsHandler() {
        return (gr00) this.A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kq00 getRenderLayerDefault() {
        return (kq00) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kq00 getRenderLayerRedesign() {
        return (kq00) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final lkh0 getReportScreenRouter() {
        return (lkh0) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final qq00 getViewContainer() {
        return (qq00) this.q.getValue();
    }

    public static s3q0 k(b bVar, mq00 mq00Var) {
        bVar.getOverlayRenderLayer().getRenderer().getValue().a(mq00Var);
        return s3q0.a;
    }

    public static kq00 l(b bVar) {
        return bVar.getRenderLayerDefault();
    }

    public static void m(b bVar, MarketAdsItemViewEvent marketAdsItemViewEvent) {
        wp50 wp50Var;
        wp50 wp50Var2;
        wp50 wp50Var3;
        wp50 wp50Var4;
        wp50 wp50Var5;
        wp50 wp50Var6;
        wp50 wp50Var7;
        wp50 wp50Var8;
        wp50 wp50Var9;
        cr00 immediateHandler = bVar.getImmediateHandler();
        js50 js50Var = immediateHandler.b;
        zr50 zr50Var = immediateHandler.c;
        boolean z = marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.b;
        if (z) {
            if (js50Var != null) {
                MarketAdsItemViewEvent.b bVar2 = (MarketAdsItemViewEvent.b) marketAdsItemViewEvent;
                js50Var.a(bVar2.f, bVar2.i);
            }
        } else if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.c) {
            if (js50Var != null) {
                ls50 ls50Var = js50Var.a.b;
                if ((ls50Var instanceof ls50.a) && (wp50Var9 = ((ls50.a) ls50Var).b) != null) {
                    wp50Var9.f(xp50.l.a);
                }
            }
        } else if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.d) {
            if (js50Var != null) {
                ls50 ls50Var2 = js50Var.a.b;
                if ((ls50Var2 instanceof ls50.a) && (wp50Var8 = ((ls50.a) ls50Var2).b) != null) {
                    wp50Var8.f(xp50.n.a);
                }
            }
        } else if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.h) {
            if (js50Var != null) {
                ks50 ks50Var = js50Var.a;
                ks50Var.getClass();
                ls50.b bVar3 = ls50.b.a;
                ls50 ls50Var3 = ks50Var.b;
                if (bVar3 != ls50Var3) {
                    Iterator it = ks50Var.a.iterator();
                    while (it.hasNext()) {
                        ((wzs) it.next()).invoke(ls50Var3, bVar3);
                    }
                }
                ks50Var.b = bVar3;
            }
        } else if (marketAdsItemViewEvent instanceof uq00) {
            if (zr50Var != null) {
                uq00 uq00Var = (uq00) marketAdsItemViewEvent;
                String str = uq00Var.b;
                ViewGroup viewGroup = uq00Var.c;
                ls50 ls50Var4 = zr50Var.a.b;
                if ((ls50Var4 instanceof ls50.a) && (wp50Var7 = ((ls50.a) ls50Var4).b) != null) {
                    wp50Var7.f(new xp50.m(viewGroup, str));
                }
            }
        } else if (marketAdsItemViewEvent instanceof vq00) {
            if (zr50Var != null) {
                String str2 = ((vq00) marketAdsItemViewEvent).b;
                ls50 ls50Var5 = zr50Var.a.b;
                if ((ls50Var5 instanceof ls50.a) && (wp50Var6 = ((ls50.a) ls50Var5).b) != null) {
                    wp50Var6.f(new xp50.o(str2));
                }
            }
        } else if (marketAdsItemViewEvent instanceof sq00) {
            if (zr50Var != null) {
                sq00 sq00Var = (sq00) marketAdsItemViewEvent;
                String str3 = sq00Var.b.a;
                View view = sq00Var.c;
                ls50 ls50Var6 = zr50Var.a.b;
                if ((ls50Var6 instanceof ls50.a) && (wp50Var5 = ((ls50.a) ls50Var6).b) != null) {
                    wp50Var5.f(new xp50.i(view, str3, MyTargetFacadeClickTarget.BACKGROUND));
                }
            }
        } else if (marketAdsItemViewEvent instanceof rq00) {
            if (zr50Var != null) {
                rq00 rq00Var = (rq00) marketAdsItemViewEvent;
                String str4 = rq00Var.b.a;
                View view2 = rq00Var.c;
                ls50 ls50Var7 = zr50Var.a.b;
                if ((ls50Var7 instanceof ls50.a) && (wp50Var4 = ((ls50.a) ls50Var7).b) != null) {
                    wp50Var4.f(new xp50.i(view2, str4, MyTargetFacadeClickTarget.CTA_BUTTON));
                }
            }
        } else if ((marketAdsItemViewEvent instanceof xq00) || (marketAdsItemViewEvent instanceof wq00)) {
            if (zr50Var != null) {
                ls50 ls50Var8 = zr50Var.a.b;
                if (ls50Var8 instanceof ls50.a) {
                    ls50.a aVar = (ls50.a) ls50Var8;
                    View r = r((b) ((Cnew) zr50Var.c.b).c);
                    if (r != null && (wp50Var = aVar.b) != null) {
                        wp50Var.f(new xp50.j(r, MyTargetFacadeClickTarget.DESCRIPTION));
                    }
                }
            }
        } else if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.a) {
            if (zr50Var != null) {
                ls50 ls50Var9 = zr50Var.a.b;
                if (ls50Var9 instanceof ls50.a) {
                    ls50.a aVar2 = (ls50.a) ls50Var9;
                    View n = n((b) ((p5y) zr50Var.c.d).c);
                    if (n != null && (wp50Var3 = aVar2.b) != null) {
                        wp50Var3.f(new xp50.j(n, MyTargetFacadeClickTarget.CTA_BUTTON));
                    }
                }
            }
        } else if ((marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.g) && zr50Var != null) {
            ls50 ls50Var10 = zr50Var.a.b;
            if (ls50Var10 instanceof ls50.a) {
                ls50.a aVar3 = (ls50.a) ls50Var10;
                View t = t((b) ((b1h) zr50Var.c.c).c);
                if (t != null && (wp50Var2 = aVar3.b) != null) {
                    wp50Var2.f(new xp50.j(t, MyTargetFacadeClickTarget.TITLE));
                }
            }
        }
        if (z) {
            MarketAdsItemViewEvent.b bVar4 = (MarketAdsItemViewEvent.b) marketAdsItemViewEvent;
            ImageUrl imageUrl = bVar4.b;
            wih0.b.a aVar4 = bVar4.c;
            SdkActionLink sdkActionLink = bVar4.d;
            String str5 = bVar4.e;
            ixp0 c = bVar.j.c();
            String str6 = bVar4.f;
            String str7 = bVar4.g;
            ArrayList arrayList = bVar4.h;
            mxc mxcVar = bVar.n;
            xn50.a.c(bVar, new MarketAdsItemAction.a.C0676a(imageUrl, aVar4, sdkActionLink, str5, c, str6, str7, arrayList, mxcVar != null ? ((Number) mxcVar.invoke()).intValue() : 0, bVar4.i));
            return;
        }
        if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.g) {
            MarketAdsItemAction.g gVar = MarketAdsItemAction.g.b;
            if (bVar.p == null) {
                xn50.a.c(bVar, gVar);
                return;
            }
            return;
        }
        if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.a) {
            MarketAdsItemAction.d dVar = MarketAdsItemAction.d.b;
            if (bVar.p == null) {
                xn50.a.c(bVar, dVar);
                return;
            }
            return;
        }
        if (marketAdsItemViewEvent instanceof wq00) {
            xn50.a.c(bVar, MarketAdsItemAction.b.a.b);
            return;
        }
        if (marketAdsItemViewEvent instanceof xq00) {
            xn50.a.c(bVar, MarketAdsItemAction.b.C0677b.b);
            return;
        }
        if (marketAdsItemViewEvent instanceof yq00) {
            xn50.a.c(bVar, new MarketAdsItemAction.b.c(((yq00) marketAdsItemViewEvent).b));
            return;
        }
        if (marketAdsItemViewEvent instanceof ar00) {
            xn50.a.c(bVar, MarketAdsItemAction.c.b.b);
            return;
        }
        if (marketAdsItemViewEvent instanceof zq00) {
            xn50.a.c(bVar, MarketAdsItemAction.c.a.b);
            return;
        }
        if (marketAdsItemViewEvent instanceof br00) {
            xn50.a.c(bVar, dp00.b);
            return;
        }
        if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.h) {
            xn50.a.c(bVar, MarketAdsItemAction.a.b.b);
            return;
        }
        if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.f) {
            xn50.a.c(bVar, new MarketAdsItemAction.f(((MarketAdsItemViewEvent.f) marketAdsItemViewEvent).b));
            return;
        }
        if (marketAdsItemViewEvent instanceof rq00) {
            ap00 ap00Var = new ap00(((rq00) marketAdsItemViewEvent).b);
            if (bVar.p == null) {
                xn50.a.c(bVar, ap00Var);
                return;
            }
            return;
        }
        if (marketAdsItemViewEvent instanceof sq00) {
            bp00 bp00Var = new bp00(((sq00) marketAdsItemViewEvent).b);
            if (bVar.p == null) {
                xn50.a.c(bVar, bp00Var);
                return;
            }
            return;
        }
        if (marketAdsItemViewEvent instanceof tq00) {
            tq00 tq00Var = (tq00) marketAdsItemViewEvent;
            cp00 cp00Var = new cp00(tq00Var.b, tq00Var.c);
            if (bVar.p == null) {
                xn50.a.c(bVar, cp00Var);
                return;
            }
            return;
        }
        if (marketAdsItemViewEvent == MarketAdsItemViewEvent.OnItemViewFocusChanged.FOCUSED) {
            xn50.a.c(bVar, MarketAdsItemAction.HandleItemViewFocusChanged.FOCUSED);
            return;
        }
        if (marketAdsItemViewEvent == MarketAdsItemViewEvent.OnItemViewFocusChanged.UNFOCUSED) {
            xn50.a.c(bVar, MarketAdsItemAction.HandleItemViewFocusChanged.UNFOCUSED);
            return;
        }
        if (marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.e) {
            MarketAdsItemViewEvent.e eVar = (MarketAdsItemViewEvent.e) marketAdsItemViewEvent;
            xn50.a.c(bVar, new MarketAdsItemAction.e(eVar.c, eVar.b));
        } else if (!(marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.c) && !(marketAdsItemViewEvent instanceof MarketAdsItemViewEvent.d) && !(marketAdsItemViewEvent instanceof uq00) && !(marketAdsItemViewEvent instanceof vq00)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static View n(b bVar) {
        return bVar.getOverlayRenderLayer().c().getValue().g();
    }

    public static s3q0 o(b bVar, final dr00.b bVar2) {
        final gp00 gp00Var = bVar.getRenderEventsHandler().c;
        qq00 qq00Var = gp00Var.b;
        String str = bVar2.a;
        if (!epx.f(gp00Var.h, bVar2)) {
            dr00.b bVar3 = gp00Var.h;
            if (!epx.f(bVar3 != null ? bVar3.a : null, str)) {
                qq00Var.b.o0(str, null);
            }
            ep00 ep00Var = gp00Var.k;
            final ImageView c = gp00Var.c.getValue().c();
            final int a = bVar2.g ? iah0.a(92) : iah0.a(50);
            c.post(new Runnable() { // from class: xsna.fp00
                /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
                @Override // java.lang.Runnable
                public final void run() {
                    q7d q7dVar;
                    CarouselMode carouselMode;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    q7d q7dVar2;
                    int i;
                    int i2;
                    int i3;
                    int top = c.getTop() - a;
                    gp00 gp00Var2 = gp00Var;
                    bcr0<ImageView> bcr0Var = gp00Var2.e;
                    ?? r4 = gp00Var2.g;
                    dg1 dg1Var = gp00Var2.d;
                    qq00 qq00Var2 = gp00Var2.b;
                    dr00.b bVar4 = bVar2;
                    ArrayList<cle> arrayList = bVar4.b;
                    int i4 = top - bVar4.c;
                    boolean z5 = bVar4.f;
                    int size = arrayList.size();
                    if (size == 1) {
                        q7dVar2 = new q7d(ClipMarketCardView.ImageSize.SIZE_NORMAL, (size < 3 || size == 4) ? OverscrollMode.NONE : (size == 3 || size == 5) ? OverscrollMode.SINGLE : OverscrollMode.FULL, CarouselMode.SINGLE, 0, 56);
                    } else {
                        if (size <= 3) {
                            q7dVar = new q7d(ClipMarketCardView.ImageSize.SIZE_SMALL, (size < 3 || size == 4) ? OverscrollMode.NONE : (size == 3 || size == 5) ? OverscrollMode.SINGLE : OverscrollMode.FULL, CarouselMode.SINGLE, 0, 56);
                        } else {
                            int i5 = (size < 5 || size % 2 == 0) ? 17 : 8388611;
                            ClipMarketCardView.ImageSize imageSize = ClipMarketCardView.ImageSize.SIZE_SMALL;
                            OverscrollMode overscrollMode = (size < 3 || size == 4) ? OverscrollMode.NONE : (size == 3 || size == 5) ? OverscrollMode.SINGLE : OverscrollMode.FULL;
                            if (z5) {
                                carouselMode = CarouselMode.SINGLE;
                            } else {
                                if (!arrayList.isEmpty()) {
                                    for (cle cleVar : arrayList) {
                                        if (myc0.f(cleVar.k) || myc0.f(cleVar.l)) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (!arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        if (myc0.f(((cle) it.next()).b)) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (myc0.f(((cle) it2.next()).f)) {
                                            z3 = true;
                                            break;
                                        }
                                    }
                                }
                                z3 = false;
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        if (myc0.f(((cle) it3.next()).e)) {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                }
                                z4 = false;
                                int a2 = (z2 || z4) ? iah0.a(36) : 0;
                                if (z3) {
                                    a2 += iah0.a(36);
                                }
                                if (z) {
                                    a2 += iah0.a(34);
                                }
                                carouselMode = iah0.a((float) 18) + (iah0.a((float) 8) + ((iah0.a((float) 160) + a2) * 2)) > i4 ? CarouselMode.SINGLE : CarouselMode.DOUBLE;
                            }
                            q7dVar = new q7d(imageSize, overscrollMode, carouselMode, i5, 48);
                        }
                        q7dVar2 = q7dVar;
                    }
                    boolean f = epx.f(gp00Var2.i, arrayList);
                    CarouselMode carouselMode2 = q7dVar2.c;
                    if (f) {
                        i = i4;
                    } else {
                        RecyclerView recyclerView = qq00Var2.d;
                        recyclerView.getContext();
                        qq00Var2.c.setGravity(q7dVar2.d);
                        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                        to00 to00Var = new to00(bcr0Var, q7dVar2, dg1Var);
                        recyclerView.setAdapter(to00Var);
                        we10 we10Var = new we10(q7dVar2.e, q7dVar2.f);
                        int itemDecorationCount = recyclerView.getItemDecorationCount();
                        for (int i6 = 0; i6 < itemDecorationCount; i6++) {
                            recyclerView.removeItemDecorationAt(i6);
                        }
                        recyclerView.addItemDecoration(we10Var);
                        int[] iArr = p7d.$EnumSwitchMapping$0;
                        OverscrollMode overscrollMode2 = q7dVar2.b;
                        int i7 = iArr[overscrollMode2.ordinal()];
                        i = i4;
                        if (i7 == 1 || i7 == 2) {
                            i2 = 1;
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = 2;
                        }
                        recyclerView.setOverScrollMode(i2);
                        int i8 = gp00.b.$EnumSwitchMapping$0[carouselMode2.ordinal()];
                        if (i8 == 1) {
                            to00Var.setItems(arrayList);
                            to00 to00Var2 = gp00Var2.j;
                            if (to00Var2 != null) {
                                to00Var2.f.clear();
                                to00Var2.notifyDataSetChanged();
                            }
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List p = p4g.p((arrayList.size() % 2) + (arrayList.size() / 2), arrayList);
                            to00Var.setItems((List) p.get(0));
                            List<cle> list = (List) p.get(1);
                            RecyclerView a3 = qq00Var2.a();
                            a3.getContext();
                            a3.setLayoutManager(new LinearLayoutManager(0, false));
                            to00 to00Var3 = new to00(bcr0Var, q7dVar2, dg1Var);
                            a3.setAdapter(to00Var3);
                            int itemDecorationCount2 = a3.getItemDecorationCount();
                            for (int i9 = 0; i9 < itemDecorationCount2; i9++) {
                                a3.removeItemDecorationAt(i9);
                            }
                            a3.addItemDecoration(we10Var);
                            int i10 = iArr[overscrollMode2.ordinal()];
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    i3 = 1;
                                    a3.setOverScrollMode(i3);
                                    a3.setOnTouchListener(gp00Var2);
                                    a3.removeOnItemTouchListener((gp00.a) r4.getValue());
                                    a3.addOnItemTouchListener((gp00.a) r4.getValue());
                                    gp00Var2.j = to00Var3;
                                    to00Var3.setItems(list);
                                } else if (i10 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            i3 = 2;
                            a3.setOverScrollMode(i3);
                            a3.setOnTouchListener(gp00Var2);
                            a3.removeOnItemTouchListener((gp00.a) r4.getValue());
                            a3.addOnItemTouchListener((gp00.a) r4.getValue());
                            gp00Var2.j = to00Var3;
                            to00Var3.setItems(list);
                        }
                        gp00Var2.i = arrayList;
                    }
                    if (bVar4.e) {
                        eu00 eu00Var = new eu00(dg1Var, 0);
                        RecyclerView recyclerView2 = qq00Var2.d;
                        recyclerView2.clearOnScrollListeners();
                        recyclerView2.addOnScrollListener(eu00Var);
                        eu00Var.onScrollStateChanged(recyclerView2, 0);
                        if (carouselMode2 == CarouselMode.DOUBLE) {
                            eu00 eu00Var2 = new eu00(dg1Var, 1);
                            qq00Var2.a().clearOnScrollListeners();
                            qq00Var2.a().addOnScrollListener(eu00Var2);
                            eu00Var2.onScrollStateChanged(qq00Var2.a(), 0);
                        }
                    } else {
                        qq00Var2.a().clearOnScrollListeners();
                        qq00Var2.d.clearOnScrollListeners();
                    }
                    RecyclerView recyclerView3 = qq00Var2.d;
                    recyclerView3.setOnTouchListener(gp00Var2);
                    recyclerView3.removeOnItemTouchListener((gp00.a) r4.getValue());
                    recyclerView3.addOnItemTouchListener((gp00.a) r4.getValue());
                    qq00Var2.c.setY(((i / 2) + r9) - (qq00Var2.c.getHeight() / 2));
                }
            });
            qq00Var.c.removeOnLayoutChangeListener(ep00Var);
            qq00Var.c.addOnLayoutChangeListener(ep00Var);
            qq00Var.a.setKeepScreenOn(true);
            gp00Var.h = bVar2;
        }
        return s3q0.a;
    }

    public static gr00 p(b bVar) {
        return new gr00(bVar.getViewContainer(), bVar.getOverlayRenderLayer().c(), bVar.z, bVar.l.d());
    }

    public static cr00 q(b bVar) {
        return new cr00(new fh9(bVar, bVar.getLinkHelper()), bVar.h, bVar.w);
    }

    public static View r(b bVar) {
        return bVar.getOverlayRenderLayer().c().getValue().getDescriptionView();
    }

    public static s3q0 s(b bVar, yt0 yt0Var) {
        if (bVar.p == null) {
            bVar.getAnalyticsStaticAdsDelegate().getClass();
            bVar.getAnalyticsStaticAdsDelegate().a(cu0.b(yt0Var));
        }
        return s3q0.a;
    }

    public static View t(b bVar) {
        return bVar.getOverlayRenderLayer().c().getValue().b();
    }

    public static final void u(b bVar, String str, SdkAdsChoices sdkAdsChoices) {
        if (bVar.h.z()) {
            bVar.l.c().a(new kr00(sdkAdsChoices, str));
        } else {
            bVar.getReportScreenRouter().a(bVar.getContext());
        }
    }

    @Override // xsna.xn50
    @SuppressLint({"WrongThread"})
    public final mk50 Fl() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fullscreen_market_ads_item, (ViewGroup) null, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.fullscreen_market_ads_item_controls_stub);
        viewStub.setLayoutResource(getOverlayRenderLayer().b());
        viewStub.inflate();
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        dr00 dr00Var = (dr00) ao50Var;
        getOverlayRenderLayer().c().getValue().a();
        gm50.a.b(this, dr00Var.a, new omf(this, 29));
        gm50.a.b(this, dr00Var.b, new rop(this, 13));
    }

    @Override // com.vk.mvi.MviLazyViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        a aVar = (a) vk50Var;
        aVar.i.a(new uw4(1, getNavigationEventHandler(), yp00.class, "onNewEventReceived", "onNewEventReceived(Lcom/vk/clips/sdk/shared/item/market_ads/events/navigation/MarketAdsItemNavigationEvent;)V", 0, 10), getViewOwner());
        aVar.j.a(new vw4(1, getMarketAdEventsDelegate(), po00.class, "onNewEventReceived", "onNewEventReceived(Lcom/vk/clips/sdk/shared/item/market_ads/events/MarketAdsItemEvent;)V", 0, 7), getViewOwner());
    }

    @Override // xsna.ip00
    public final void a() {
        this.z.a(MarketAdsItemViewEvent.h.b);
        this.p = null;
    }

    @Override // xsna.ip00
    public final void c(boolean z) {
        this.z.a(z ? MarketAdsItemViewEvent.OnItemViewFocusChanged.FOCUSED : MarketAdsItemViewEvent.OnItemViewFocusChanged.UNFOCUSED);
    }

    @Override // xsna.ip00
    public final void e(vo00 vo00Var) {
        this.z.a(new MarketAdsItemViewEvent.b(vo00Var.b, vo00Var.d, vo00Var.e, vo00Var.f, vo00Var.g, vo00Var.a, vo00Var.h, vo00Var.c));
        this.p = vo00Var.h;
    }

    @Override // xsna.ip00
    public wp50 getMyTargetFacade() {
        return this.p;
    }

    @Override // xsna.ip00
    public gxp0.a getUiVisibilityConfigChangedListener() {
        return this.C;
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z.a(MarketAdsItemViewEvent.c.b);
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z.a(MarketAdsItemViewEvent.d.b);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getGestureDetector().a(motionEvent);
        return true;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        c cVar = new c(getOverlayRenderLayer().a().getValue());
        jp00 jp00Var = this.l;
        ojh0 h = jp00Var.h();
        su suVar = new su(jp00Var.h());
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new a(cVar, h, suVar, new ir00(context, new pw0(this.i)), this.r, this.h);
    }

    private static /* synthetic */ void getRenderLayerRedesign$annotations() {
    }
}
