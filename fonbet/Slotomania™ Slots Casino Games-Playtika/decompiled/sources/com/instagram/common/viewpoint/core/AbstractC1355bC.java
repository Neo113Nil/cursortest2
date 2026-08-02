package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1355bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC1354bB viewOnClickListenerC1354bB = new ViewOnClickListenerC1354bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1354bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1353bA(viewOnClickListenerC1354bB));
        }
    }
}
