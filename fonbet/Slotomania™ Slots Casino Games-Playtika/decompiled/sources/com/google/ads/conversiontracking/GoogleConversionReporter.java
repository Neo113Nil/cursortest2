package com.google.ads.conversiontracking;

import android.content.Context;
import android.util.Log;
import com.google.ads.conversiontracking.g;

/* loaded from: classes.dex */
public abstract class GoogleConversionReporter {
    public abstract void report();

    protected void a(final Context context, final g.c cVar, final boolean z, final boolean z2, final boolean z3) {
        new Thread(new Runnable() { // from class: com.google.ads.conversiontracking.GoogleConversionReporter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String a = g.a(context, cVar);
                    if (a != null) {
                        g.a(context).a(a, cVar, z, z2, z3);
                    }
                } catch (Exception e) {
                    Log.e("GoogleConversionReporter", "Error sending ping", e);
                }
            }
        }).start();
    }
}
