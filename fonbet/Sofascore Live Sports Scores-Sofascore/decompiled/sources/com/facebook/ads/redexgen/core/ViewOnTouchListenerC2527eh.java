package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2527eh implements View.OnTouchListener {
    public final /* synthetic */ C1689Ek A00;

    public ViewOnTouchListenerC2527eh(C1689Ek c1689Ek) {
        this.A00 = c1689Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        UM um;
        um = this.A00.A0C;
        um.A02(new C1673Du(view, motionEvent));
        return false;
    }
}
