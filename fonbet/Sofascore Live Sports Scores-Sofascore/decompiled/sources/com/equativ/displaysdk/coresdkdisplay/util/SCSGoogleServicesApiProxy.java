package com.equativ.displaysdk.coresdkdisplay.util;

import android.content.Context;
import android.location.Location;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.identity.zzbi;
import com.google.android.gms.tasks.Task;
import defpackage.a8p;
import defpackage.fjg;
import defpackage.hkg;
import defpackage.pff;
import defpackage.wje;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class SCSGoogleServicesApiProxy {
    public static final String TAG = "SCSGoogleServicesApiProxy";
    public static AdvertisingIdClient.Info a;
    public static Location b;
    public static zzbi c;

    public SCSGoogleServicesApiProxy(@NonNull Context context) {
        hkg.T().post(new a8p(this, context, false, 20));
    }

    @Nullable
    public synchronized String getAdvertisingID(@NonNull Context context) {
        AdvertisingIdClient.Info info = a;
        if (info != null) {
            return info.getId();
        }
        try {
            return Settings.Secure.getString(context.getContentResolver(), "advertising_id");
        } catch (Exception e) {
            fjg c2 = fjg.c();
            e.getMessage();
            c2.f(3);
            return null;
        }
    }

    @Nullable
    public synchronized Location getPlatformLocation() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            zzbi zzbiVar = c;
            if (zzbiVar != null) {
                TaskApiCall.Builder a2 = TaskApiCall.a();
                a2.a = wje.c;
                a2.d = 2414;
                Task h = zzbiVar.h(0, a2.a());
                if (h != null) {
                    h.addOnSuccessListener(new pff(currentTimeMillis));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public synchronized boolean isLimitAdTrackingEnabled(@NonNull Context context) {
        AdvertisingIdClient.Info info = a;
        if (info != null) {
            return info.isLimitAdTrackingEnabled();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking") != 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
