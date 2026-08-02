package com.google.android.gms.ads.internal.adaptersettings;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbip;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
class AdapterSettings {

    @Nullable
    private static volatile AdapterSettings instance;
    private final zzbip adapterSettingsInternal = zzba.zzd();

    @KeepForSdk
    private boolean getBoolean(String str, boolean z) {
        zzbip zzbipVar = this.adapterSettingsInternal;
        zzbipVar.getClass();
        return !str.startsWith("adapter:") ? z : zzbipVar.c.optBoolean(str, z);
    }

    @KeepForSdk
    private float getFloat(String str, float f) {
        zzbip zzbipVar = this.adapterSettingsInternal;
        zzbipVar.getClass();
        return !str.startsWith("adapter:") ? f : (float) zzbipVar.c.optDouble(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @KeepForSdk
    private int getInt(String str, int i) {
        zzbip zzbipVar = this.adapterSettingsInternal;
        zzbipVar.getClass();
        return !str.startsWith("adapter:") ? i : zzbipVar.c.optInt(str, i);
    }

    @KeepForSdk
    private long getLong(String str, long j) {
        zzbip zzbipVar = this.adapterSettingsInternal;
        zzbipVar.getClass();
        return !str.startsWith("adapter:") ? j : zzbipVar.c.optLong(str, j);
    }

    @KeepForSdk
    private String getString(String str, String str2) {
        zzbip zzbipVar = this.adapterSettingsInternal;
        zzbipVar.getClass();
        return !str.startsWith("adapter:") ? str2 : zzbipVar.c.optString(str, str2);
    }
}
