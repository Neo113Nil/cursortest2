package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2312bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC2311bB viewOnClickListenerC2311bB = new ViewOnClickListenerC2311bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC2311bB);
            view.setOnTouchListener(new ViewOnTouchListenerC2310bA(viewOnClickListenerC2311bB));
        }
    }
}
