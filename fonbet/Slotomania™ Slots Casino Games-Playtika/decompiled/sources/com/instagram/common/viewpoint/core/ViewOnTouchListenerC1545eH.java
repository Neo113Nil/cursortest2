package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1545eH implements View.OnTouchListener {
    public final /* synthetic */ C1546eI A00;

    public ViewOnTouchListenerC1545eH(C1546eI c1546eI) {
        this.A00 = c1546eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC1860jd abstractC1860jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1546eI.A00(this.A00);
            va = this.A00.A06;
            abstractC1860jd = this.A00.A03;
            va.ABp(abstractC1860jd.A2E(), new C1352b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
