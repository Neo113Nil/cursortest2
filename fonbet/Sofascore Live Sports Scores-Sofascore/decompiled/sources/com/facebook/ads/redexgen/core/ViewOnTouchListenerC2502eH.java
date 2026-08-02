package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2502eH implements View.OnTouchListener {
    public final /* synthetic */ C2503eI A00;

    public ViewOnTouchListenerC2502eH(C2503eI c2503eI) {
        this.A00 = c2503eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC2817jd abstractC2817jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C2503eI.A00(this.A00);
            va = this.A00.A06;
            abstractC2817jd = this.A00.A03;
            va.ABp(abstractC2817jd.A2E(), new C2309b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
