package com.ironsource;

import android.content.Context;
import defpackage.wzb;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X4 {

    @NotNull
    public static final X4 a = new X4();

    private X4() {
    }

    public final int a(@NotNull Context context) {
        context.getClass();
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final int b(@NotNull Context context) {
        context.getClass();
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    private final int a(Context context, int i) {
        return wzb.b(i / context.getResources().getDisplayMetrics().density);
    }
}
