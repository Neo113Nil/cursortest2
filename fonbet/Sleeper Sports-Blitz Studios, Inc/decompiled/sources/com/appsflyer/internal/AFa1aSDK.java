package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFa1aSDK implements AFb1zSDK {
    private Map<String, String> getMonetizationNetwork = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFb1zSDK
    public final Map<String, String> getCurrencyIso4217Code(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getMonetizationNetwork.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i = resources.getConfiguration().screenLayout & 15;
            this.getMonetizationNetwork.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.getMonetizationNetwork.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.getMonetizationNetwork.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.getMonetizationNetwork.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.getMonetizationNetwork.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.getMonetizationNetwork.put(RRWebVideoEvent.JsonKeys.SIZE, String.valueOf(i));
        }
        return this.getMonetizationNetwork;
    }
}
