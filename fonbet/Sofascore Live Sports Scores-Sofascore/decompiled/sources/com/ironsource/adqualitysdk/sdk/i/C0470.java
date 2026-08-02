package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ة, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0470 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static C0470 f1519;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public C0596 f1520;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public ChoreographerFrameCallbackC0482 f1521;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1524;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f1523 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f1522 = new Handler(Looper.getMainLooper());

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m289(C0470 c0470) {
        if (c0470.f1524 || new HashMap(c0470.f1523).isEmpty()) {
            return;
        }
        c0470.f1524 = true;
        AbstractC1008.m611(new C0481(c0470));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0470 m288() {
        C0470 c0470;
        synchronized (C0470.class) {
            c0470 = f1519;
            if (c0470 == null) {
                c0470 = new C0470();
                f1519 = c0470;
            }
        }
        return c0470;
    }
}
