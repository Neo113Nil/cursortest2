package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import defpackage.a70;
import defpackage.f1d;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class He extends AbstractC3896y implements Bj, InterfaceC3323bl, InterfaceC3404f {
    public final Ie b;
    public final Wc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public He(Ie ie, Wc wc) {
        super(ie.g.a);
        ie.getClass();
        wc.getClass();
        this.b = ie;
        this.c = wc;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeRenderedState", "Initialize Called");
        }
        Bj bj = this.b.g.c.c;
        I i = bj instanceof I ? (I) bj : null;
        if (i != null) {
            i.g();
        }
        Ie ie = this.b;
        Ni ni = ie.b;
        if (!ni.a) {
            ni.a = true;
            AbstractC3406f1 abstractC3406f1 = ie.e;
            AdSession adSession = abstractC3406f1.c;
            InterfaceC3880x9 interfaceC3880x9 = abstractC3406f1.b;
            if (adSession != null) {
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "startAdSession");
                }
                X4.a(abstractC3406f1.a, new C3329c1(abstractC3406f1, null));
            } else if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "Failed to startAdSession. adSession is null");
            }
            Ie ie2 = this.b;
            AbstractC3406f1 abstractC3406f12 = ie2.e;
            ViewGroup parentView = ie2.c.a.getParentView();
            abstractC3406f12.getClass();
            parentView.getClass();
            AdSession adSession2 = abstractC3406f12.c;
            InterfaceC3880x9 interfaceC3880x92 = abstractC3406f12.b;
            if (adSession2 != null) {
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).a(AbstractC3406f1.f, "registerAdView");
                }
                X4.a(abstractC3406f12.a, new Z0(abstractC3406f12, parentView, null));
            } else if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a(AbstractC3406f1.f, "Failed to registerAdView. adSession is null");
            }
            G g = this.a.b;
            g.getClass();
            MetaInfo metaInfo = g.d;
            boolean c = Intrinsics.c(metaInfo != null ? metaInfo.getCreativeType() : null, "video");
            Ie ie3 = this.b;
            if (c) {
                ie3.e.a(true);
            } else {
                ie3.e.a();
            }
        }
        InterfaceC3880x9 l2 = l();
        if (l2 != null) {
            ((C3906y9) l2).a("NativeRenderedState", "listenMediaEvents - setting up media event listener");
        }
        xw3.L(this.b.h, null, null, new C3781te(((C3909yc) this.b.g.g.getValue()).e, null, this), 3);
        X4.a(this.b.h, new C3704qe(this, null));
        Ie ie4 = this.b;
        if (ie4.b.b) {
            InterfaceC3880x9 l3 = l();
            if (l3 != null) {
                ((C3906y9) l3).a("NativeRenderedState", "Track Views Attached to Telemetry - Already triggered, skipping");
            }
        } else {
            xw3.L(ie4.h, null, null, new Fe(this, null), 3);
        }
        if (this.b.b.c) {
            InterfaceC3880x9 l4 = l();
            if (l4 != null) {
                ((C3906y9) l4).a("NativeRenderedState", "Impression Tracking - Already triggered, skipping");
            }
        } else {
            G g2 = this.a.b;
            g2.getClass();
            if (g2.m.a == 0) {
                InterfaceC3880x9 l5 = l();
                if (l5 != null) {
                    ((C3906y9) l5).a("NativeRenderedState", "Impression Event Occurred - Load (immediate fire)");
                }
                m();
            } else {
                xw3.L(this.b.h, null, null, new Be(this, null), 3);
            }
        }
        if (!this.b.b.d) {
            if (H4.a(this.a.b, "mrc50").isEmpty()) {
                InterfaceC3880x9 l6 = l();
                if (l6 != null) {
                    ((C3906y9) l6).a("NativeRenderedState", "MRC50 Trackers unavailable");
                }
            } else {
                Map a = Hk.a(((Qc) this.b.g.f.getValue()).a);
                C3839vk c3839vk = C3839vk.a;
                C3839vk.b("MRCViewable50Started", a, EnumC3943zk.SDK);
                xw3.L(this.b.h, null, null, new De(this, null), 3);
            }
        }
        C3909yc c3909yc = (C3909yc) this.b.g.g.getValue();
        f1d f1dVar = ((Xo) this.b.l.getValue()).b;
        c3909yc.getClass();
        f1dVar.getClass();
        C3906y9 c3906y9 = c3909yc.a;
        if (c3906y9 != null) {
            c3906y9.a("MediaViewManager", "attachWindowLifecycleObserver called");
        }
        AbstractC3640o2 abstractC3640o2 = c3909yc.b;
        if (abstractC3640o2 != null) {
            abstractC3640o2.a(f1dVar);
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeRenderedState", "Finalize Called");
        }
        X4.a(this.b.k(), new C3729re(this, null));
        N3.a(this.b.h);
        ((Sd) this.b.k.getValue()).a.a();
        ((C3754sd) this.b.j.getValue()).a();
        P6.a(((Xo) this.b.l.getValue()).a);
    }

    @Override // com.inmobi.media.InterfaceC3323bl
    public final void d() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeRenderedState", "unTrackViews");
        }
        C3909yc c3909yc = (C3909yc) this.b.g.g.getValue();
        C3906y9 c3906y9 = c3909yc.a;
        if (c3906y9 != null) {
            c3906y9.a("MediaViewManager", "detachObserversAndPause called");
        }
        AbstractC3640o2 abstractC3640o2 = c3909yc.b;
        if (abstractC3640o2 != null) {
            abstractC3640o2.b();
        }
        Ie ie = this.b;
        C3525jh c3525jh = ie.c;
        this.c.a(new Me(c3525jh.c, c3525jh.b, ie.b, ie.e, ie.d, ie.f, ie.g, this.c), this);
    }

    public final void m() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeRenderedState", "fireNativeImpression - Starting impression fire");
        }
        Ie ie = this.b;
        ie.b.c = true;
        Map a = Hk.a(((Qc) ie.g.f.getValue()).a);
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("AdImpressionSuccessful", a, EnumC3943zk.SDK);
        this.b.g.c.g();
        this.b.f.b.f.a(C3472hf.a);
        AbstractC3406f1 abstractC3406f1 = this.b.e;
        AdEvents adEvents = abstractC3406f1.e;
        InterfaceC3880x9 interfaceC3880x9 = abstractC3406f1.b;
        if (adEvents == null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "Failed to registerImpression: AdEvent is null");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "registerImpression");
        }
        X4.a(abstractC3406f1.a, new C3277a1(abstractC3406f1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0116, code lost:
    
        if (r9.a(r2, r8, r0) != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0118, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.InterfaceC3404f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        C3833ve c3833ve;
        int i;
        if (rq3Var instanceof C3833ve) {
            c3833ve = (C3833ve) rq3Var;
            int i2 = c3833ve.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3833ve.c = i2 - Integer.MIN_VALUE;
                Object obj = c3833ve.a;
                Object obj2 = lu3.a;
                i = c3833ve.c;
                if (i != 0) {
                    y6a.M(obj);
                    InterfaceC3880x9 l = l();
                    if (l != null) {
                        ((C3906y9) l).a("NativeRenderedState", "onDestroy");
                    }
                    AbstractC3406f1 abstractC3406f1 = this.b.e;
                    AdSession adSession = abstractC3406f1.c;
                    InterfaceC3880x9 interfaceC3880x9 = abstractC3406f1.b;
                    if (adSession != null) {
                        if (interfaceC3880x9 != null) {
                            ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "stopAdSession");
                        }
                        X4.a(abstractC3406f1.a, new C3355d1(abstractC3406f1, null));
                    } else if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "Failed to stopAdSession. adSession is null");
                    }
                    C3577lh c3577lh = (C3577lh) this.b.o.getValue();
                    C3525jh c3525jh = this.b.c;
                    c3577lh.getClass();
                    c3525jh.getClass();
                    c3525jh.a.getParentView().setOnClickListener(null);
                    View titleView = c3525jh.a.getTitleView();
                    if (titleView != null) {
                        titleView.setOnClickListener(null);
                    }
                    View descriptionView = c3525jh.a.getDescriptionView();
                    if (descriptionView != null) {
                        descriptionView.setOnClickListener(null);
                    }
                    ImageView iconView = c3525jh.a.getIconView();
                    if (iconView != null) {
                        iconView.setOnClickListener(null);
                    }
                    View ctaView = c3525jh.a.getCtaView();
                    if (ctaView != null) {
                        ctaView.setOnClickListener(null);
                    }
                    View advertiserView = c3525jh.a.getAdvertiserView();
                    if (advertiserView != null) {
                        advertiserView.setOnClickListener(null);
                    }
                    View ratingView = c3525jh.a.getRatingView();
                    if (ratingView != null) {
                        ratingView.setOnClickListener(null);
                    }
                    View view = c3525jh.c;
                    if (view != null) {
                        view.setOnClickListener(null);
                    }
                    C3909yc c3909yc = (C3909yc) this.b.g.g.getValue();
                    c3833ve.c = 1;
                    c3909yc.getClass();
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(rob.a, new C3857wc(c3909yc, null), c3833ve);
                    if (R != obj2) {
                        R = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.b.d.b();
                Wc wc = this.c;
                C3496id c3496id = new C3496id();
                c3833ve.c = 2;
            }
        }
        c3833ve = new C3833ve(this, (sq3) rq3Var);
        Object obj3 = c3833ve.a;
        Object obj22 = lu3.a;
        i = c3833ve.c;
        if (i != 0) {
        }
        this.b.d.b();
        Wc wc2 = this.c;
        C3496id c3496id2 = new C3496id();
        c3833ve.c = 2;
    }
}
