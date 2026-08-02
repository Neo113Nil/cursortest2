package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes2.dex */
public class FlashPreferences {
    public static final String PREFERENCES_FILE = "com.facebook.ads.flash";
    public static final String SP_KEY_FLASH_CONFIG = "flash_config";
    public static final String SP_KEY_LAST_CONFIG_UPDATE_TIMESTAMP = "update_timestamp";
    public static final String SP_KEY_LAST_RESULT = "last_result";

    public static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCES_FILE, 0);
    }
}
