package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VT implements View.OnTouchListener {
    public final /* synthetic */ C1179Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(C1179Vz c1179Vz, boolean z, boolean z2) {
        this.A00 = c1179Vz;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1695gi c1695gi;
        if (this.A02) {
            return false;
        }
        if (!this.A01) {
            return true;
        }
        c1695gi = this.A00.A04;
        if (C1145Up.A1X(c1695gi)) {
            return false;
        }
        return true;
    }
}
