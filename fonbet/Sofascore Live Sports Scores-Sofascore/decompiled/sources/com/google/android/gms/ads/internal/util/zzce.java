package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzce {
    public static zzce b;
    public String a;

    private zzce() {
    }

    public static zzce zza() {
        zzce zzceVar = b;
        if (zzceVar != null) {
            return zzceVar;
        }
        zzce zzceVar2 = new zzce();
        b = zzceVar2;
        return zzceVar2;
    }

    public final void zzb(Context context) {
        Context context2;
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.a)) {
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.a = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
