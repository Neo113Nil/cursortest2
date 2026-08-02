package com.ironsource;

import android.content.Context;
import xsna.an10;

/* loaded from: classes13.dex */
public final class Z4 {
    public static final Z4 a = new Z4();

    private Z4() {
    }

    private final int a(Context context, int i) {
        return an10.b(i / context.getResources().getDisplayMetrics().density);
    }

    public final int b(Context context) {
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(Context context) {
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
