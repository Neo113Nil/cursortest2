package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕝ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0750 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object f2476 = new Object();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public volatile C0332 f2477;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2475 = StringFog.decrypt("ZAzHhNbRJKxnC5WD04wl+GVZwdODgnSsZAnHj4eEc/xiWsHT0YIl+2cLlYGD13agNw3Hh9CFefth\nWsHU0owk+GJcx9TWgnehYlrN1YOMdvtgXszXg41x+GQAwdfahyOgZV6Q1NSCJKxhWZKC1tcl/WIL\nkdOAjSP9MgvB19DVeaptDg==\n", "VDj0tuK0QZk=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final C0750 f2474 = new C0750();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m418(Context context, String str) {
        synchronized (this.f2476) {
            try {
                if (this.f2477 != null) {
                    return;
                }
                C0332 c0332 = new C0332(new C0848(IronSourceAdQuality.getSDKVersion(), AbstractC1067.m632(str)));
                c0332.f820.f1515.put(1, C0480.m297(f2475));
                c0332.m191(context);
                this.f2477 = c0332;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m417() {
        synchronized (this.f2476) {
            this.f2477 = null;
            C1074.f3373.m643();
        }
    }
}
