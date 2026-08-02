package com.vk.superapp.vkpay.checkout.feature.verification.keyboard.dots;

import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import xsna.r5o;
import xsna.t4c;
import xsna.u5o;

/* compiled from: CheckoutDotsFactory.kt */
@Keep
/* loaded from: classes6.dex */
public final class CheckoutDotsFactory extends u5o {
    @Override // xsna.u5o
    public r5o createDot(Context context) {
        t4c t4cVar = new t4c(context);
        int ceil = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 12);
        int ceil2 = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ceil, ceil);
        layoutParams.setMargins(ceil2, ceil2, ceil2, ceil2);
        t4cVar.setLayoutParams(layoutParams);
        return t4cVar;
    }
}
