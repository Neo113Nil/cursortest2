package com.google.ads.conversiontracking;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.ads.conversiontracking.g;

/* loaded from: classes3.dex */
public class AdWordsConversionReporter extends GoogleConversionReporter {
    private final Context a;
    private final String b;
    private final String c;
    private final g.d d;
    private final String e;
    private final String f;
    private final boolean g;

    public AdWordsConversionReporter(Context context, String str, String str2, String str3, boolean z) {
        this(context, str, str2, str3, null, z);
    }

    public AdWordsConversionReporter(Context context, String str, String str2, String str3, String str4, boolean z) {
        g.d dVar;
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        if (this instanceof DoubleClickConversionReporter) {
            dVar = g.d.DOUBLECLICK_CONVERSION;
        } else {
            dVar = g.d.GOOGLE_CONVERSION;
        }
        this.d = dVar;
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        boolean z;
        g.c c = new g.c().a(this.b).a(this.d).b(this.c).c(this.e);
        String str = this.f;
        if (str != null) {
            c.d(str);
        }
        if (this.d == g.d.GOOGLE_CONVERSION) {
            c a = c.a(this.a);
            a.c(this.b);
            c.a(a.d(this.b));
        }
        if (g.a(this.a, c, this.g)) {
            try {
                if (this.d == g.d.GOOGLE_CONVERSION) {
                    c.a(g.a(this.a, this.b));
                    z = true;
                } else {
                    z = false;
                }
                a(this.a, c, true, this.g, z);
            } catch (Exception e) {
                Log.e("GoogleConversionReporter", "Error sending ping", e);
            }
        }
    }

    public static boolean registerReferrer(Context context, Uri uri) {
        if (uri == null) {
            Log.e("GoogleConversionReporter", "Failed to register referrer from a null click url");
            return false;
        }
        String valueOf = String.valueOf(uri);
        Log.i("GoogleConversionReporter", new StringBuilder(String.valueOf(valueOf).length() + 13).append("Registering: ").append(valueOf).toString());
        g.b a = g.a(uri);
        if (a == null) {
            String valueOf2 = String.valueOf(uri);
            Log.w("GoogleConversionReporter", new StringBuilder(String.valueOf(valueOf2).length() + 31).append("Failed to parse referrer from: ").append(valueOf2).toString());
            return false;
        }
        boolean a2 = g.a(context, a);
        if (a2) {
            String valueOf3 = String.valueOf(uri);
            Log.i("GoogleConversionReporter", new StringBuilder(String.valueOf(valueOf3).length() + 25).append("Successfully registered: ").append(valueOf3).toString());
            return a2;
        }
        String valueOf4 = String.valueOf(uri);
        Log.w("GoogleConversionReporter", new StringBuilder(String.valueOf(valueOf4).length() + 20).append("Failed to register: ").append(valueOf4).toString());
        return a2;
    }

    public static void reportWithConversionId(Context context, String str, String str2, String str3, boolean z) {
        new AdWordsConversionReporter(context, str, str2, str3, z).report();
    }

    public static void reportWithConversionId(Context context, String str, String str2, String str3, String str4, boolean z) {
        new AdWordsConversionReporter(context, str, str2, str3, str4, z).report();
    }
}
