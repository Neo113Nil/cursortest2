package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import xsna.fp;

/* loaded from: classes.dex */
public final class p {
    int a = 1;
    int b = -1;

    public o a(Context context) {
        Intent a = fp.a("android.intent.action.BATTERY_CHANGED", context, null);
        if (a == null) {
            return null;
        }
        int intExtra = a.getIntExtra("status", 1);
        int i = -1;
        int intExtra2 = a.getIntExtra("level", -1);
        int intExtra3 = a.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            i = (intExtra2 * 100) / intExtra3;
        }
        return new o(intExtra, i);
    }
}
