package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1aSDK implements AFg1ySDK {

    @NotNull
    private Map<String, String> d = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFg1ySDK
    @NotNull
    public final Map<String, String> registerClient(@NotNull Context context) {
        context.getClass();
        if (this.d.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i = resources.getConfiguration().screenLayout & 15;
            this.d.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.d.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.d.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.d.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.d.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.d.put("size", String.valueOf(i));
        }
        return this.d;
    }
}
