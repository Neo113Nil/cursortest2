package com.google.ads.conversiontracking;

import android.content.Context;
import android.util.Log;
import com.google.ads.conversiontracking.g;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AdWordsRemarketingReporter extends GoogleConversionReporter {
    private final Context a;
    private final String b;
    private final Map<String, Object> c;

    public AdWordsRemarketingReporter(Context context, String str, Map<String, Object> map) {
        this.a = context;
        this.b = str;
        this.c = map;
    }

    public AdWordsRemarketingReporter(Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = null;
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        c a = c.a(this.a);
        a.c(this.b);
        try {
            a(this.a, new g.c().a(this.b).a().a(this.c).a(a.d(this.b)), false, true, true);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }

    public static void reportWithConversionId(Context context, String str, Map<String, Object> map) {
        new AdWordsRemarketingReporter(context, str, map).report();
    }

    public static void reportWithConversionId(Context context, String str) {
        reportWithConversionId(context, str, null);
    }
}
