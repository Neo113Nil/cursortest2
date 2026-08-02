package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zzd;
import defpackage.rln;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf {
    public static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                sharedPreferences = a;
                if (sharedPreferences == null) {
                    sharedPreferences = (SharedPreferences) zzd.a(new rln(context, 1));
                    a = sharedPreferences;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
