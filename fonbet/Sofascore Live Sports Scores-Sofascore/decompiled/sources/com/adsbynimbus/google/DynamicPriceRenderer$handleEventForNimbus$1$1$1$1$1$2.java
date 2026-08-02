package com.adsbynimbus.google;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import defpackage.a70;
import defpackage.fhh;
import defpackage.fka;
import defpackage.fsf;
import defpackage.hcd;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lcd;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.ml4;
import defpackage.n4o;
import defpackage.nf;
import defpackage.of;
import defpackage.qcd;
import defpackage.qyf;
import defpackage.rik;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import defpackage.z9a;
import defpackage.zf;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {1, 8, 0})
@il4(c = "com.adsbynimbus.google.DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2", f = "DynamicPriceRenderer.kt", l = {410, MBSupportMuteAdType.REWARD_VIDEO}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    public AdManagerAdView r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ AdManagerAdView u;
    public final /* synthetic */ lcd v;
    public final /* synthetic */ hcd w;
    public final /* synthetic */ RenderEvent x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2(AdManagerAdView adManagerAdView, lcd lcdVar, hcd hcdVar, RenderEvent renderEvent, rq3<? super DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2> rq3Var) {
        super(2, rq3Var);
        this.u = adManagerAdView;
        this.v = lcdVar;
        this.w = hcdVar;
        this.x = renderEvent;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2 dynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2 = new DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2(this.u, this.v, this.w, this.x, rq3Var);
        dynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2.t = obj;
        return dynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        of ofVar;
        String asErrorMessage;
        Object q;
        final ku3 ku3Var;
        AdManagerAdView adManagerAdView;
        of ofVar2;
        lu3 lu3Var = lu3.a;
        ?? r2 = this.s;
        AdManagerAdView adManagerAdView2 = this.u;
        try {
            try {
                if (r2 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var2 = (ku3) this.t;
                    lcd lcdVar = this.v;
                    hcd hcdVar = this.w;
                    this.t = ku3Var2;
                    this.r = adManagerAdView2;
                    this.s = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(this));
                    lj2Var.t();
                    fsf fsfVar = new fsf();
                    fhh fhhVar = qyf.a;
                    rik.t(hcdVar, lcdVar, new DynamicPriceRenderer$render$2$1(lj2Var, fsfVar));
                    lj2Var.v(new DynamicPriceRenderer$render$2$2(fsfVar));
                    q = lj2Var.q();
                    if (q == lu3Var) {
                        return lu3Var;
                    }
                    ku3Var = ku3Var2;
                    adManagerAdView = adManagerAdView2;
                } else {
                    if (r2 != 1) {
                        if (r2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        throw new fka();
                    }
                    adManagerAdView = this.r;
                    ku3 ku3Var3 = (ku3) this.t;
                    y6a.M(obj);
                    ku3Var = ku3Var3;
                    q = obj;
                }
                ofVar2 = (of) q;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            ofVar = null;
        } catch (Throwable th2) {
            th = th2;
            r2 = 0;
        }
        try {
            ofVar2.d.add(new AdManagerControllerListener(this.x, null, null, adManagerAdView2.getAdListener(), 6, null));
            ofVar2.d.add(new nf() { // from class: com.adsbynimbus.google.DynamicPriceRenderer$handleEventForNimbus$1$1$1$1$1$2$1$1
                @Override // defpackage.nf
                public void onAdEvent(zf adEvent) {
                    adEvent.getClass();
                    if (adEvent == zf.j) {
                        s9a.o(ku3.this, ml4.e("Ad Destroyed", null));
                    }
                }

                @Override // defpackage.pcd
                public void onError(qcd error) {
                    error.getClass();
                    String message = error.getMessage();
                    if (message == null) {
                        message = "AdController error";
                    }
                    s9a.o(ku3.this, ml4.e(message, null));
                }
            });
            adManagerAdView.setTag(com.sofascore.results.R.id.controller, (of) q);
            ofVar = null;
            try {
                this.t = null;
                this.r = null;
                this.s = 2;
                n4o.u(this);
                return lu3Var;
            } catch (Exception e2) {
                e = e2;
                if (!(e instanceof CancellationException)) {
                    AdListener adListener = adManagerAdView2.getAdListener();
                    asErrorMessage = DynamicPriceRenderer.getAsErrorMessage("Error Rendering Ad");
                    adListener.onAdFailedToLoad(new LoadAdError(-8, asErrorMessage, "Adsbynimbus", null, null));
                }
                Object tag = adManagerAdView2.getTag(com.sofascore.results.R.id.controller);
                of ofVar3 = tag instanceof of ? (of) tag : ofVar;
                if (ofVar3 != null) {
                    ofVar3.a();
                }
                return Unit.a;
            }
        } catch (Exception e3) {
            e = e3;
            ofVar = null;
        } catch (Throwable th3) {
            th = th3;
            r2 = 0;
            Object tag2 = adManagerAdView2.getTag(com.sofascore.results.R.id.controller);
            of ofVar4 = tag2 instanceof of ? (of) tag2 : r2;
            if (ofVar4 != null) {
                ofVar4.a();
            }
            throw th;
        }
    }
}
