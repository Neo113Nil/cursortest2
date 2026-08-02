package com.vk.location.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.provider.Settings;
import com.vk.core.util.NoLocation;
import kotlin.text.Regex;
import xsna.anj;
import xsna.gwp;
import xsna.nxz;
import xsna.wxz;
import xsna.x7r0;

/* compiled from: LocationCommon.kt */
/* loaded from: classes.dex */
public final class LocationCommon {
    public static final LocationCommon a = new LocationCommon();
    public static final NoLocation b = NoLocation.b;
    public static final gwp c = new gwp();

    /* compiled from: LocationCommon.kt */
    /* loaded from: classes3.dex */
    public static final class GpsLocationReceiver extends BroadcastReceiver {
        public final nxz.c a;

        public GpsLocationReceiver(nxz.c cVar) {
            this.a = cVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (new Regex("android.location.PROVIDERS_CHANGED").f(intent.getAction())) {
                LocationCommon.a.getClass();
                boolean b = LocationCommon.b(context);
                nxz.c cVar = this.a;
                if (b) {
                    nxz.this.a1();
                } else {
                    cVar.getClass();
                }
            }
        }
    }

    public static boolean a(Context context) {
        try {
            return anj.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        int i;
        int i2;
        try {
            Object systemService = context.getSystemService("location");
            Boolean bool = null;
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager != null) {
                int i3 = wxz.a;
                bool = Boolean.valueOf(locationManager.isLocationEnabled());
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            try {
                i2 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
            } catch (Settings.SettingNotFoundException unused) {
                i2 = 0;
            }
            return i2 != 0;
        } catch (Throwable th) {
            x7r0 x7r0Var = c.a;
            if (x7r0Var != null) {
                x7r0Var.invoke(th);
            }
            try {
                i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
            } catch (Settings.SettingNotFoundException unused2) {
                i = 0;
            }
            return i != 0;
        }
    }
}
