package com.playtika.pras.a;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class l {
    public static void a(Context context, String str) {
        context.getApplicationContext().getSharedPreferences("com.braintreepayament.browserswitch.persistentstore", 0).edit().putString("browserSwitch.request", str).apply();
    }

    public static void a(Context context) {
        context.getApplicationContext().getSharedPreferences("com.braintreepayament.browserswitch.persistentstore", 0).edit().remove("browserSwitch.request").apply();
    }
}
