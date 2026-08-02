package zendesk.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.zendesk.service.ZendeskDateTypeAdapter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Named;
import javax.inject.Singleton;
import ld.AbstractC5459a;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
class ZendeskApplicationModule {
    static final String APPLICATION_CONTEXT = "application_context";
    static final String BASE_64_SERIALIZER = "base_64_serializer";
    private static final int THREAD_POOL_SIZE = 5;
    private ApplicationConfiguration applicationConfiguration;
    private Context context;

    public ZendeskApplicationModule(@NonNull Context context, @NonNull ApplicationConfiguration applicationConfiguration) {
        this.context = context.getApplicationContext();
        this.applicationConfiguration = applicationConfiguration;
    }

    @Singleton
    public static DeviceInfo provideDeviceInfo(@Named("application_context") Context context) {
        return new DeviceInfo(context);
    }

    @Singleton
    public static ScheduledExecutorService provideExecutor() {
        return Executors.newScheduledThreadPool(5, new ThreadFactory() { // from class: zendesk.core.ZendeskApplicationModule.1
            final AtomicInteger atomicInteger = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull Runnable runnable) {
                Thread thread = new Thread(runnable, String.format(Locale.ENGLISH, "ZendeskThread-%d", Integer.valueOf(this.atomicInteger.getAndIncrement())));
                thread.setPriority(10);
                return thread;
            }
        });
    }

    @Singleton
    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService;
    }

    public static Gson provideGson() {
        return new com.google.gson.d().j(com.google.gson.b.f38074e).e(128, 8).f(Date.class, new ZendeskDateTypeAdapter()).b();
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(AbstractC5459a.f() ? HttpLoggingInterceptor.Level.BASIC : HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

    @Singleton
    public static ZendeskShadow provideZendesk(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return new ZendeskShadow(storage, legacyIdentityMigrator, identityManager, blipsCoreProvider, pushRegistrationProvider, coreModule, providerStore);
    }

    @Singleton
    public ApplicationConfiguration provideApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    @Singleton
    @Named(APPLICATION_CONTEXT)
    public Context provideApplicationContext() {
        return this.context;
    }

    @Named(BASE_64_SERIALIZER)
    public Serializer provideBase64Serializer(@Named("gson_serializer") Serializer serializer) {
        return new ZendeskBase64Serializer(serializer);
    }

    @Singleton
    public ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }
}
