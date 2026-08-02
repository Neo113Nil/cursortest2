package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.duf;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Yk {
    public static C3872x1 a;

    public static void a(boolean z) {
        C3872x1 c3872x1 = a;
        if (c3872x1 == null) {
            return;
        }
        if (z) {
            c3872x1.b = null;
        } else if (c3872x1.b == null) {
            AbstractC3424fj.g.submit(new defpackage.x(25));
        }
    }

    public static void b() {
        String str;
        try {
            C3872x1 c3872x1 = a;
            if (c3872x1 == null || (str = c3872x1.b) == null) {
                return;
            }
            Xb.a((byte) 2, "Yk", "Publisher device Id is ".concat(str));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void c() {
        boolean z;
        boolean booleanValue;
        C3872x1 c3872x1;
        try {
            Context context = AbstractC3424fj.a;
            if (context != null) {
                C3872x1 c3872x12 = new C3872x1();
                try {
                    duf.a.getOrCreateKotlinClass(AdvertisingIdClient.class).getSimpleName();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        advertisingIdInfo.getClass();
                        c3872x12.b = advertisingIdInfo.getId();
                        c3872x12.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        a = c3872x12;
                        Boolean bool = AbstractC3551kh.b;
                        if (bool == null) {
                            Context context2 = AbstractC3424fj.a;
                            z = false;
                            if (context2 != null) {
                                ConcurrentHashMap concurrentHashMap = Qa.b;
                                AbstractC3551kh.b = Boolean.valueOf(Pa.a(context2, "user_info_store").a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = AbstractC3551kh.b;
                            if (bool2 != null) {
                                booleanValue = bool2.booleanValue();
                            }
                            if (z || (c3872x1 = a) == null) {
                            }
                            c3872x1.b = null;
                            return;
                        }
                        booleanValue = bool.booleanValue();
                        z = booleanValue;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static final void d() {
        c();
    }

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
