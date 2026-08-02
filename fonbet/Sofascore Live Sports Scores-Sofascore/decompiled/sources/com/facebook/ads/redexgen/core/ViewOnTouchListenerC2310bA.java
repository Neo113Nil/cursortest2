package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2310bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC2311bB A00;

    public ViewOnTouchListenerC2310bA(ViewOnClickListenerC2311bB viewOnClickListenerC2311bB) {
        this.A00 = viewOnClickListenerC2311bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
