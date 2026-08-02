package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.AbstractC0361ni;
import io.appmetrica.analytics.impl.C0152fd;
import io.appmetrica.analytics.impl.C0204hd;
import io.appmetrica.analytics.impl.C0230id;
import io.appmetrica.analytics.impl.C0255jd;
import io.appmetrica.analytics.impl.C0281kd;
import io.appmetrica.analytics.impl.C0306ld;
import io.appmetrica.analytics.impl.C0331md;
import io.appmetrica.analytics.impl.C0356nd;
import io.appmetrica.analytics.impl.C0642z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ModulesFacade {
    public static final int EXTERNAL_ATTRIBUTION_ADJUST = 2;
    public static final int EXTERNAL_ATTRIBUTION_AIRBRIDGE = 5;
    public static final int EXTERNAL_ATTRIBUTION_APPSFLYER = 1;
    public static final int EXTERNAL_ATTRIBUTION_KOCHAVA = 3;
    public static final int EXTERNAL_ATTRIBUTION_SINGULAR = 6;
    public static final int EXTERNAL_ATTRIBUTION_TENJIN = 4;

    /* renamed from: a, reason: collision with root package name */
    private static C0356nd f11354a = new C0356nd();

    @NonNull
    public static IModuleReporter getModuleReporter(@NonNull Context context, @NonNull String str) {
        C0356nd c0356nd = f11354a;
        C0152fd c0152fd = c0356nd.f14346b;
        c0152fd.f13732b.a(context);
        c0152fd.f13734d.a(str);
        c0356nd.f14347c.f14727a.a(context.getApplicationContext().getApplicationContext());
        return AbstractC0361ni.f14365a.a(context.getApplicationContext(), str);
    }

    public static boolean isActivatedForApp() {
        C0356nd c0356nd = f11354a;
        c0356nd.f14346b.getClass();
        c0356nd.f14347c.getClass();
        c0356nd.f14345a.getClass();
        return C0642z0.a();
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, Boolean.TRUE);
    }

    public static void reportEvent(@NonNull ModuleEvent moduleEvent) {
        C0356nd c0356nd = f11354a;
        c0356nd.f14346b.f13731a.a(null);
        c0356nd.f14347c.getClass();
        c0356nd.f14348d.execute(new C0230id(c0356nd, moduleEvent));
    }

    public static void reportExternalAttribution(int i5, @NonNull String str) {
        C0356nd c0356nd = f11354a;
        c0356nd.f14346b.getClass();
        c0356nd.f14347c.getClass();
        c0356nd.f14348d.execute(new C0255jd(c0356nd, i5, str));
    }

    public static void sendEventsBuffer() {
        C0356nd c0356nd = f11354a;
        c0356nd.f14346b.getClass();
        c0356nd.f14347c.getClass();
        AppMetrica.sendEventsBuffer();
    }

    public static void setAdvIdentifiersTracking(boolean z5) {
        C0356nd c0356nd = f11354a;
        c0356nd.f14346b.getClass();
        c0356nd.f14347c.getClass();
        c0356nd.f14348d.execute(new C0281kd(c0356nd, z5));
    }

    public static void setProxy(@NonNull C0356nd c0356nd) {
        f11354a = c0356nd;
    }

    public static void setSessionExtra(@NonNull String str, byte[] bArr) {
        C0356nd c0356nd = f11354a;
        c0356nd.f14346b.f13733c.a(str);
        c0356nd.f14347c.getClass();
        c0356nd.f14348d.execute(new C0306ld(c0356nd, str, bArr));
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        C0356nd c0356nd = f11354a;
        C0152fd c0152fd = c0356nd.f14346b;
        c0152fd.f13732b.a(context);
        c0152fd.f13734d.a(str);
        c0356nd.f14347c.f14727a.a(context.getApplicationContext());
        c0356nd.f14348d.execute(new C0331md(str));
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue, @NonNull Boolean bool) {
        C0356nd c0356nd = f11354a;
        boolean booleanValue = bool.booleanValue();
        c0356nd.f14346b.getClass();
        c0356nd.f14347c.getClass();
        c0356nd.f14348d.execute(new C0204hd(c0356nd, adRevenue, booleanValue));
    }
}
