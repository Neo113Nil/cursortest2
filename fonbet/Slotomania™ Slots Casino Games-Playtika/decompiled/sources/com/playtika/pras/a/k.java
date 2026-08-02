package com.playtika.pras.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;

/* loaded from: classes2.dex */
public abstract class k {
    public static boolean a(Context context) {
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION).setPackage("com.android.chrome");
        j jVar = new j();
        boolean bindService = context.bindService(intent, jVar, 33);
        context.unbindService(jVar);
        return bindService;
    }

    public static void a(Context context, Intent intent) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
            intent.putExtras(bundle);
            intent.addFlags(134250496);
        }
    }
}
