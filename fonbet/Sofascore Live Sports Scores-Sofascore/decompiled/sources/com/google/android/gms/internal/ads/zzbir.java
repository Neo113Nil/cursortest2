package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbir {
    public static void a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static int b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }
}
