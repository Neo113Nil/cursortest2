package com.inmobi.media;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.a70;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Me implements Bj, Ih, InterfaceC3404f {
    public final View a;
    public final MediaView b;
    public final Ni c;
    public final AbstractC3406f1 d;
    public final L4 e;
    public final C3289ad f;
    public final Rc g;
    public final Wc h;

    public Me(View view, MediaView mediaView, Ni ni, AbstractC3406f1 abstractC3406f1, L4 l4, C3289ad c3289ad, Rc rc, Wc wc) {
        ni.getClass();
        abstractC3406f1.getClass();
        l4.getClass();
        c3289ad.getClass();
        rc.getClass();
        wc.getClass();
        this.a = view;
        this.b = mediaView;
        this.c = ni;
        this.d = abstractC3406f1;
        this.e = l4;
        this.f = c3289ad;
        this.g = rc;
        this.h = wc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r9.a(r2, r8, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.InterfaceC3404f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        Ke ke;
        int i;
        if (rq3Var instanceof Ke) {
            ke = (Ke) rq3Var;
            int i2 = ke.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ke.c = i2 - Integer.MIN_VALUE;
                Object obj = ke.a;
                Object obj2 = lu3.a;
                i = ke.c;
                if (i != 0) {
                    y6a.M(obj);
                    AbstractC3406f1 abstractC3406f1 = this.d;
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
                    C3909yc c3909yc = (C3909yc) this.g.g.getValue();
                    ke.c = 1;
                    c3909yc.getClass();
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(rob.a, new C3857wc(c3909yc, null), ke);
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
                this.e.b();
                Wc wc = this.h;
                C3496id c3496id = new C3496id();
                ke.c = 2;
            }
        }
        ke = new Ke(this, (sq3) rq3Var);
        Object obj3 = ke.a;
        Object obj22 = lu3.a;
        i = ke.c;
        if (i != 0) {
        }
        this.e.b();
        Wc wc2 = this.h;
        C3496id c3496id2 = new C3496id();
        ke.c = 2;
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        this.h.a(new He(new Ie(this.c, new C3525jh(inMobiNativeViewData, this.b, this.a), this.e, this.d, this.f, this.g), this.h), this);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        Xh xh;
        C3906y9 c3906y9 = this.g.a.a.c;
        if (c3906y9 == null || (xh = c3906y9.a) == null) {
            return;
        }
        xh.a();
    }
}
