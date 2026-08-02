package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԍ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0430 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static AbstractC0430 f1223;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1225 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashSet f1224 = new HashSet();

    static {
        StringFog.decrypt("NvHkQyYlT0gX+OhYJCVmbRju/0QpLHFyFO/9SCQs\n", "cZ2LIUdJAyE=\n");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized AbstractC0430 m262() {
        AbstractC0430 abstractC0430;
        synchronized (AbstractC0430.class) {
            abstractC0430 = f1223;
            if (abstractC0430 == null) {
                abstractC0430 = new C0441();
                f1223 = abstractC0430;
            }
        }
        return abstractC0430;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo263();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ArrayList m264() {
        return new ArrayList(this.f1224);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract Activity mo265();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo266(Application application, Activity activity);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m267(C0958 c0958) {
        this.f1224.add(c0958);
    }
}
