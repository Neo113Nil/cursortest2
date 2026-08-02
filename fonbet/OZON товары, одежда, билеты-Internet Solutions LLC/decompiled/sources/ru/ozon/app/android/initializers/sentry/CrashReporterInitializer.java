package ru.ozon.app.android.initializers.sentry;

import Sc.o;
import android.content.Context;
import android.content.SharedPreferences;
import io.sentry.K1;
import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.sentry.CrashReporterInitializer;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorage;
import ru.ozon.app.android.sentry.sentryFlags.SentryFlagsStorageImpl;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSourceImpl;
import ru.ozon.app.android.storage.di.module.SharedPreferencesProvider;
import ru.ozon.app.android.utils.ContextUtilsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/initializers/sentry/CrashReporterInitializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "getDsnKey", "(Landroid/content/Context;)Ljava/lang/String;", "getEnvironment", "()Ljava/lang/String;", "", "init", "(Landroid/content/Context;)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CrashReporterInitializer {

    @NotNull
    public static final CrashReporterInitializer INSTANCE = new CrashReporterInitializer();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlavorType.values().length];
            try {
                iArr[FlavorType.f93213QA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlavorType.PROD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CrashReporterInitializer() {
    }

    private final String getDsnKey(Context context) {
        return ContextUtilsKt.isOzonSelectApplication(context) ? "https://a92d9571db0100fa2dd12e7b039ed993@sentry.ozon.ru/2541" : ContextUtilsKt.isOzonTravelApplication(context) ? "https://c7aaf97de1c1a4abafd18229b353eed0@sentry.ozon.ru/2256" : ContextUtilsKt.isOzonFreshApplication(context) ? "https://a981c3a8205bf7b00fdc6f1e515ea431@sentry.ozon.ru/2536" : "https://eb2d03b6b6364529a4b66234aea93ba2@sentry.ozon.ru/441";
    }

    private final String getEnvironment() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[FlavorType.INSTANCE.getCurrentType().ordinal()];
        if (i11 == 1) {
            return "qa";
        }
        if (i11 == 2) {
            return "production";
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(Context context, double d11, SentryFlagsStorage sentryFlagsStorage, SentryAndroidOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        CrashReporterInitializer crashReporterInitializer = INSTANCE;
        options.setDsn(crashReporterInitializer.getDsnKey(context));
        options.setEnvironment(crashReporterInitializer.getEnvironment());
        options.setSampleRate(Double.valueOf(d11));
        options.setTracesSampleRate(Double.valueOf(d11));
        options.setEnableFramesTracking(false);
        options.setEnableAutoActivityLifecycleTracing(false);
        options.setEnableUserInteractionTracing(false);
        options.setEnableSystemEventBreadcrumbs(sentryFlagsStorage.isEnableSystemEventBreadcrumbs());
        options.setEnableAppLifecycleBreadcrumbs(sentryFlagsStorage.isEnableAppLifecycleBreadcrumbs());
        options.setAttachViewHierarchy(false);
        options.setAttachScreenshot(false);
        options.setSendDefaultPii(true);
    }

    public final void init(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences encryptedSharedPreferences = SharedPreferencesProvider.INSTANCE.getEncryptedSharedPreferences(context);
        final double sentrySampleRate = new SentrySampleRateHolder(encryptedSharedPreferences).getSentrySampleRate();
        String uniqueApplicationId = new ApplicationInfoDataSourceImpl(encryptedSharedPreferences).getUniqueApplicationId();
        final SentryFlagsStorageImpl sentryFlagsStorageImpl = new SentryFlagsStorageImpl(encryptedSharedPreferences);
        k0.c(context, new K1.a() { // from class: Vy.a
            @Override // io.sentry.K1.a
            public final void a(W2 w22) {
                CrashReporterInitializer.init$lambda$0(context, sentrySampleRate, sentryFlagsStorageImpl, (SentryAndroidOptions) w22);
            }
        });
        K1.j("appUuid", uniqueApplicationId);
    }
}
