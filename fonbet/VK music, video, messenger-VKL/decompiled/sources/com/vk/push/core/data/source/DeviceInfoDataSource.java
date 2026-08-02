package com.vk.push.core.data.source;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.TimeZone;
import xsna.vu5;

/* compiled from: DeviceInfoDataSource.kt */
/* loaded from: classes.dex */
public final class DeviceInfoDataSource {
    public final Context a;

    public DeviceInfoDataSource(Context context) {
        this.a = context;
    }

    public final String getCountryId() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService(TelephonyManager.class);
        if (telephonyManager != null) {
            try {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null) {
                    return networkCountryIso.toUpperCase(Locale.ROOT);
                }
            } catch (UnsupportedOperationException unused) {
                String id = TimeZone.getDefault().getID();
                try {
                    return android.icu.util.TimeZone.getRegion(id);
                } catch (Throwable unused2) {
                    return id;
                }
            }
        }
        String id2 = TimeZone.getDefault().getID();
        try {
            return android.icu.util.TimeZone.getRegion(id2);
        } catch (Throwable unused3) {
            return id2;
        }
    }

    public final String getDefaultLocale() {
        return Locale.getDefault().getDisplayName();
    }

    public final String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public final String getDeviceModel() {
        return Build.MODEL;
    }

    public final String getOSVersion() {
        StringBuilder sb = new StringBuilder("Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (SDK ");
        return vu5.b(sb, Build.VERSION.SDK_INT, ')');
    }

    public final String getRegionId() {
        String id = TimeZone.getDefault().getID();
        try {
            return android.icu.util.TimeZone.getRegion(id);
        } catch (Throwable unused) {
            return id;
        }
    }

    public final String getTimeZone() {
        return TimeZone.getDefault().getID();
    }
}
