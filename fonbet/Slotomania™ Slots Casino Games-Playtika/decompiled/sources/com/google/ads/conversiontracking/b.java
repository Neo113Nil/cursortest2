package com.google.ads.conversiontracking;

import android.content.Context;
import android.util.Log;
import com.google.ads.conversiontracking.g;

/* loaded from: classes5.dex */
public class b extends GoogleConversionReporter {
    private Context a;

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
    }

    public b(Context context) {
        this.a = context;
    }

    public void a(String str, long j) {
        try {
            a(this.a, new g.c().a(str).a(true).b().a(j), false, true, true);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }
}
