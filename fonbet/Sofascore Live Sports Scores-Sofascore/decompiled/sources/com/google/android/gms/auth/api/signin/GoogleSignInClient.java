package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    public static int l = 1;

    public final synchronized int i() {
        int i;
        try {
            i = l;
            if (i == 1) {
                Context context = this.a;
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.e;
                int b = googleApiAvailability.b(context, 12451000);
                if (b == 0) {
                    i = 4;
                    l = 4;
                } else if (googleApiAvailability.a(context, b, null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    l = 2;
                } else {
                    i = 3;
                    l = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
