package com.google.ads.conversiontracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.conversiontracking.g;
import java.util.Map;

/* loaded from: classes7.dex */
public class DoubleClickAudienceReporter extends GoogleConversionReporter {
    private final Context a;
    private String b;
    private Map<String, String> c;

    private DoubleClickAudienceReporter(Context context, String str, Map<String, String> map) {
        this.a = context;
        this.b = str;
        this.c = map;
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        if (TextUtils.isEmpty(this.b)) {
            Log.e("GoogleConversionReporter", "Error sending activity ping with empty ad unit id.");
            return;
        }
        try {
            a(this.a, new g.c().a(g.d.DOUBLECLICK_AUDIENCE).a(this.c).c(this.b), false, true, false);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }

    public static void reportActivity(Context context, String str, Map<String, String> map) {
        new DoubleClickAudienceReporter((Context) g.a(context), g.a(str), map).report();
    }
}
