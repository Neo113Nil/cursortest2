package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.C0010a0;
import io.appmetrica.analytics.impl.C0036b0;
import io.appmetrica.analytics.impl.C0040b4;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static F0 f11331a = new F0();

    public static void activate(@NonNull Context context) {
        F0 f02 = f11331a;
        if (!f02.f12211a.f12043a.a(context).f14527a) {
            ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null", new Object[0]);
            return;
        }
        Cb cb2 = f02.f12212b;
        Context applicationContext = context.getApplicationContext();
        cb2.getClass();
        C0040b4.l().f13378g.a(applicationContext);
        C0040b4.l().b().a(applicationContext, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        f11331a.a(str, str2, str3);
    }

    public static void setAdvIdentifiersTracking(boolean z5) {
        F0 f02 = f11331a;
        if (f02.f12211a.f12045c.a((Void) null).f14527a) {
            f02.f12212b.getClass();
            ModulesFacade.setAdvIdentifiersTracking(z5);
        }
    }

    public static void setProxy(@NonNull F0 f02) {
        f11331a = f02;
    }

    public static void subscribeForAutoCollectedData(@NonNull Context context, @NonNull String str) {
        F0 f02 = f11331a;
        f02.getClass();
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Subscribe for auto-collected data with api key: " + ApiKeyUtils.createPartialApiKey(str), new Object[0]);
        Bb bb2 = f02.f12211a;
        if (bb2.f12049g.a(str).f14527a && bb2.f12043a.a(context).f14527a) {
            f02.f12212b.getClass();
            C0040b4.l().f13378g.a(context);
            C0036b0 b10 = C0040b4.l().b();
            b10.f13366c.a().executeDelayed(new C0010a0(b10, context), b10.f13367d);
            ModulesFacade.subscribeForAutoCollectedData(context, str);
        }
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        F0 f02 = f11331a;
        Bb bb2 = f02.f12211a;
        if (bb2.f12043a.a(context).f14527a && bb2.f12044b.a(appMetricaLibraryAdapterConfig).f14527a) {
            Cb cb2 = f02.f12212b;
            Context applicationContext = context.getApplicationContext();
            cb2.getClass();
            C0040b4.l().f13378g.a(applicationContext);
            C0040b4.l().b().a(applicationContext, appMetricaLibraryAdapterConfig);
            return;
        }
        ImportantLogger.INSTANCE.info("[AppMetricaLibraryAdapterProxy]", "Activation failed due to context is null or invalid config", new Object[0]);
    }
}
