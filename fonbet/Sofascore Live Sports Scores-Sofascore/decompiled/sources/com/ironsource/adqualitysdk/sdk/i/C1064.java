package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1064 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C1064 f3359;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList f3362 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList f3361 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1160 f3360 = new C1160(this);

    static {
        StringFog.decrypt("10WDYlxI/u3zWIhoVk3h4fJahGVW\n", "gCztBjM/soQ=\n");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m630(Y y) {
        synchronized (this) {
            try {
                this.f3361.remove(y);
                if (this.f3361.size() == 0) {
                    C0470 m288 = C0470.m288();
                    C1160 c1160 = this.f3360;
                    m288.getClass();
                    AbstractC1008.m611(new C0491(m288, c1160));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m631(Y y) {
        synchronized (this) {
            this.f3361.add(y);
        }
        C0470 m288 = C0470.m288();
        C1160 c1160 = this.f3360;
        m288.getClass();
        AbstractC1008.m611(new C0508(m288, c1160));
        AbstractC1008.m611(new C1114(this, y));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C1064 m629() {
        C1064 c1064;
        synchronized (C1064.class) {
            c1064 = f3359;
            if (c1064 == null) {
                c1064 = new C1064();
                f3359 = c1064;
            }
        }
        return c1064;
    }
}
