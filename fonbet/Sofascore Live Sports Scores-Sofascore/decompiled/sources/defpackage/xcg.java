package defpackage;

import com.equativ.displaysdk.adadapter.SASDefaultInterstitialAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xcg implements wag {
    public final /* synthetic */ SASDefaultInterstitialAdapter a;

    public xcg(SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter) {
        this.a = sASDefaultInterstitialAdapter;
    }

    @Override // defpackage.wag
    public final void b(hdg hdgVar) {
        sbg sbgVar = sbg.a;
        SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter = this.a;
        sASDefaultInterstitialAdapter.h = sbgVar;
        vdg interstitialAdapterListener = sASDefaultInterstitialAdapter.getInterstitialAdapterListener();
        if (interstitialAdapterListener != null) {
            ((beg) interstitialAdapterListener).c(hdgVar);
        }
    }

    @Override // defpackage.wag
    public final void e() {
        pgg pggVar;
        sbg sbgVar = sbg.d;
        SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter = this.a;
        sASDefaultInterstitialAdapter.h = sbgVar;
        pggVar = sASDefaultInterstitialAdapter.j;
        if (pggVar != null) {
            ((qgg) pggVar).g();
        }
        vdg interstitialAdapterListener = sASDefaultInterstitialAdapter.getInterstitialAdapterListener();
        if (interstitialAdapterListener != null) {
            beg begVar = (beg) interstitialAdapterListener;
            begVar.g.post(new xdg(begVar, 5));
        }
    }

    @Override // defpackage.wag
    public final void f() {
        sbg sbgVar = sbg.a;
        SASDefaultInterstitialAdapter sASDefaultInterstitialAdapter = this.a;
        sASDefaultInterstitialAdapter.h = sbgVar;
        vdg interstitialAdapterListener = sASDefaultInterstitialAdapter.getInterstitialAdapterListener();
        if (interstitialAdapterListener != null) {
            beg begVar = (beg) interstitialAdapterListener;
            begVar.g.post(new xdg(begVar, 4));
            wdg wdgVar = begVar.d;
            if (wdgVar != null) {
                wdgVar.onDestroy();
            }
            begVar.d = null;
        }
        sASDefaultInterstitialAdapter.f = null;
    }
}
