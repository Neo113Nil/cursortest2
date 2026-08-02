package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓹ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0707 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2382 = StringFog.decrypt("ZWtzpzvj5k9zanm4NvatTH9g\n", "FgQcyleCyCg=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m406(Context context) {
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), StringFog.decrypt("br5pXkZpfB1mtA==\n", "D9ANLCkAGEI=\n"));
        if (string != null) {
            return string;
        }
        AbstractC0420.m243(StringFog.decrypt("kw26Fr8n1XOVPIIwjwPxN4k2kCGfFcQhvziUIZ8f9zap\n", "2l7xU/pxlFM=\n"), StringFog.decrypt("3vV2o3dQWg+9/Ga7cFZdOtPeUYBaeiIy2bQjmmBXExy9/WahdkwcD/j+I6Z3EA==\n", "nZoDzxM+fXs=\n"));
        SharedPreferences sharedPreferences = context.getSharedPreferences(StringFog.decrypt("J1fPTIOpLaN6R8I=\n", "VCOgPuaHRtU=\n"), 0);
        String str = f2382;
        String string2 = sharedPreferences.getString(str, null);
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        String uuid = UUID.randomUUID().toString();
        sharedPreferences.edit().putString(str, uuid).commit();
        return uuid;
    }
}
