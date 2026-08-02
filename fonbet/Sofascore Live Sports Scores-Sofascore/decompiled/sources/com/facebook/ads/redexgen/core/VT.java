package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VT implements View.OnTouchListener {
    public final /* synthetic */ C2136Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(C2136Vz c2136Vz, boolean z, boolean z2) {
        this.A00 = c2136Vz;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2652gi c2652gi;
        if (this.A02) {
            return false;
        }
        if (!this.A01) {
            return true;
        }
        c2652gi = this.A00.A04;
        if (C2102Up.A1X(c2652gi)) {
            return false;
        }
        return true;
    }
}
