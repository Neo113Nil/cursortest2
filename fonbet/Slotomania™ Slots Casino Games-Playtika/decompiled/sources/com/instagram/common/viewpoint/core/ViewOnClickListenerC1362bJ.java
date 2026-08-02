package com.instagram.common.viewpoint.core;

import android.view.View;
import androidx.compose.foundation.BasicTooltipDefaults;

/* renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1362bJ implements View.OnClickListener {
    public final /* synthetic */ LK A00;

    public ViewOnClickListenerC1362bJ(LK lk) {
        this.A00 = lk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0I.getVisibility() != 8) {
                this.A00.A0W();
                this.A00.A0G.removeCallbacks(this.A00.A0X);
                this.A00.A0t(8);
            } else {
                this.A00.A0t(0);
                this.A00.A0G.postDelayed(this.A00.A0X, BasicTooltipDefaults.TooltipDuration);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
