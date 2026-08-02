package ai.verisoul.sdk.di;

import ai.verisoul.sdk.VerisoulEnvironment;
import ai.verisoul.sdk.data.local.preferences.PreferencesHelper;
import ai.verisoul.sdk.data.local.preferences.PreferencesHelperImpl;
import ai.verisoul.sdk.data.remote.VerisoulHttpService;
import ai.verisoul.sdk.data.remote.interceptors.RetryInterceptor;
import ai.verisoul.sdk.helpers.app_clone.AppCloningHelper;
import ai.verisoul.sdk.helpers.app_clone.AppCloningHelperImpl;
import ai.verisoul.sdk.helpers.app_set_id.AppSetIdHelper;
import ai.verisoul.sdk.helpers.app_set_id.AppSetIdHelperImpl;
import ai.verisoul.sdk.helpers.device.DeviceHelper;
import ai.verisoul.sdk.helpers.device.DeviceHelperImpl;
import ai.verisoul.sdk.helpers.emulator.EmulatorHelper;
import ai.verisoul.sdk.helpers.emulator.EmulatorHelperImpl;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityHelper;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityHelperImp;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityService;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityServiceImpl;
import ai.verisoul.sdk.helpers.location.LocationHelper;
import ai.verisoul.sdk.helpers.location.LocationHelperImpl;
import ai.verisoul.sdk.helpers.nativeDataCollection.AppCloningCollector;
import ai.verisoul.sdk.helpers.nativeDataCollection.AppSetIdCollector;
import ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollector;
import ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandler;
import ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandlerImp;
import ai.verisoul.sdk.helpers.nativeDataCollection.EmulatorChecker;
import ai.verisoul.sdk.helpers.nativeDataCollection.LocationCollector;
import ai.verisoul.sdk.helpers.nativeDataCollection.NetworkDataCollector;
import ai.verisoul.sdk.helpers.nativeDataCollection.SettingsCollector;
import ai.verisoul.sdk.helpers.nativeDataCollection.WebServiceCollector;
import ai.verisoul.sdk.helpers.network.NetworkHelper;
import ai.verisoul.sdk.helpers.network.NetworkHelperImpl;
import ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper;
import ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelperImpl;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelperImpl;
import ai.verisoul.sdk.helpers.sensor.get_all.SensorsHelper;
import ai.verisoul.sdk.helpers.sensor.get_all.SensorsHelperImpl;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.helpers.session.SessionHelperImp;
import ai.verisoul.sdk.helpers.settings.SettingsHelper;
import ai.verisoul.sdk.helpers.settings.SettingsHelperImpl;
import ai.verisoul.sdk.helpers.webview.DefaultWebViewFactory;
import ai.verisoul.sdk.helpers.webview.VerisoulWebView;
import ai.verisoul.sdk.helpers.webview.VerisoulWebViewImpl;
import ai.verisoul.sdk.helpers.webview.WebViewFactory;
import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a(\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0010H\u0086\b¨\u0006\u0011"}, d2 = {"initDeviceNativeDataCollectionDependency", "", "initIntegrityDependency", "context", "Landroid/content/Context;", "initNetworkDependency", "environment", "Lai/verisoul/sdk/VerisoulEnvironment;", "initializeDependencies", "projectId", "", "webViewFactory", "Lai/verisoul/sdk/helpers/webview/WebViewFactory;", "inject", "Lai/verisoul/sdk/di/InjectDelegate;", "T", "", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDependency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n+ 2 Dependency.kt\nai/verisoul/sdk/di/AppContainer\n*L\n1#1,167:1\n75#2,6:168\n72#2,9:174\n75#2,6:183\n75#2,6:189\n75#2,6:195\n75#2,6:201\n75#2,6:207\n75#2,6:213\n75#2,6:219\n75#2,6:225\n75#2,6:231\n75#2,6:237\n75#2,6:243\n75#2,6:249\n75#2,6:255\n72#2,9:261\n75#2,6:270\n75#2,6:276\n75#2,6:282\n75#2,6:288\n75#2,6:294\n75#2,6:300\n75#2,6:306\n75#2,6:312\n75#2,6:318\n75#2,6:324\n*S KotlinDebug\n*F\n+ 1 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n96#1:168,6\n97#1:174,9\n102#1:183,6\n103#1:189,6\n104#1:195,6\n105#1:201,6\n106#1:207,6\n107#1:213,6\n108#1:219,6\n113#1:225,6\n114#1:231,6\n115#1:237,6\n117#1:243,6\n118#1:249,6\n125#1:255,6\n126#1:261,9\n131#1:270,6\n132#1:276,6\n133#1:282,6\n134#1:288,6\n135#1:294,6\n136#1:300,6\n137#1:306,6\n138#1:312,6\n139#1:318,6\n163#1:324,6\n*E\n"})
/* loaded from: classes.dex */
public final class DependencyKt {
    private static final void initDeviceNativeDataCollectionDependency() {
        try {
            AppContainer.INSTANCE.getDependencies().put(DeviceDataCollector.class, new DeviceDataCollector());
        } catch (Exception e10) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e10.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(LocationCollector.class, new LocationCollector());
        } catch (Exception e11) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e11.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(WebServiceCollector.class, new WebServiceCollector());
        } catch (Exception e12) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e12.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(NetworkDataCollector.class, new NetworkDataCollector());
        } catch (Exception e13) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e13.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(SettingsCollector.class, new SettingsCollector());
        } catch (Exception e14) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e14.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(AppCloningCollector.class, new AppCloningCollector());
        } catch (Exception e15) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e15.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(AppSetIdCollector.class, new AppSetIdCollector());
        } catch (Exception e16) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e16.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(EmulatorChecker.class, new EmulatorChecker());
        } catch (Exception e17) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e17.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(DeviceDataCollectorHandler.class, new DeviceDataCollectorHandlerImp());
        } catch (Exception e18) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e18.getMessage());
        }
    }

    private static final void initIntegrityDependency(Context context) {
        try {
            AppContainer.INSTANCE.getDependencies().put(AppIntegrityService.class, new AppIntegrityServiceImpl(context));
        } catch (Exception e10) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e10.getMessage());
        }
        AppContainer appContainer = AppContainer.INSTANCE;
        try {
            appContainer.getDependencies().put(AppIntegrityHelper.class, new AppIntegrityHelperImp((SessionHelper) appContainer.injectClass(SessionHelper.class), (VerisoulHttpService) appContainer.injectClass(VerisoulHttpService.class), (AppIntegrityService) appContainer.injectClass(AppIntegrityService.class)));
        } catch (Exception e11) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e11.getMessage());
        }
    }

    private static final void initNetworkDependency(VerisoulEnvironment verisoulEnvironment) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: d.a
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public final void log(String str) {
                Intrinsics.checkNotNullParameter(str, "it");
            }
        });
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new RetryInterceptor(3, 5000L)).addInterceptor(httpLoggingInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Retrofit build = new Retrofit.Builder().client(addInterceptor.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).build()).baseUrl(VerisoulEnvironment.INSTANCE.getBaseUrl(verisoulEnvironment) + "/").addConverterFactory(GsonConverterFactory.create()).build();
        try {
            AppContainer.INSTANCE.getDependencies().put(VerisoulHttpService.class, build.create(VerisoulHttpService.class));
        } catch (Exception e10) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e10.getMessage());
        }
    }

    public static final void initializeDependencies(@NotNull Context context, @NotNull VerisoulEnvironment environment, @NotNull String projectId, @NotNull WebViewFactory webViewFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        try {
            AppContainer.INSTANCE.getDependencies().put(PreferencesHelper.class, new PreferencesHelperImpl(context));
        } catch (Exception e10) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e10.getMessage());
        }
        AppContainer appContainer = AppContainer.INSTANCE;
        try {
            appContainer.getDependencies().put(SessionHelper.class, new SessionHelperImp((PreferencesHelper) appContainer.injectClass(PreferencesHelper.class)));
        } catch (Exception e11) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e11.getMessage());
        }
        initNetworkDependency(environment);
        initIntegrityDependency(context);
        try {
            AppContainer.INSTANCE.getDependencies().put(WebViewFactory.class, webViewFactory);
        } catch (Exception e12) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e12.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(VerisoulWebView.class, new VerisoulWebViewImpl(context, environment, projectId, webViewFactory));
        } catch (Exception e13) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e13.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(DeviceHelper.class, new DeviceHelperImpl(context));
        } catch (Exception e14) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e14.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(NetworkHelper.class, new NetworkHelperImpl(context));
        } catch (Exception e15) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e15.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(LocationHelper.class, new LocationHelperImpl(context));
        } catch (Exception e16) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e16.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(AccelerometerHelper.class, new AccelerometerHelperImpl(context));
        } catch (Exception e17) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e17.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(GatherUserEventsHelper.class, new GatherUserEventsHelperImpl(projectId));
        } catch (Exception e18) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e18.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(SettingsHelper.class, new SettingsHelperImpl(context));
        } catch (Exception e19) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e19.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(AppCloningHelper.class, new AppCloningHelperImpl(context));
        } catch (Exception e20) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e20.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(AppSetIdHelper.class, new AppSetIdHelperImpl(context));
        } catch (Exception e21) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e21.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(SensorsHelper.class, new SensorsHelperImpl(context));
        } catch (Exception e22) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e22.getMessage());
        }
        try {
            AppContainer.INSTANCE.getDependencies().put(EmulatorHelper.class, new EmulatorHelperImpl(context));
        } catch (Exception e23) {
            Logger.INSTANCE.error("DI", "Failed to register dependency " + e23.getMessage());
        }
        initDeviceNativeDataCollectionDependency();
    }

    public static /* synthetic */ void initializeDependencies$default(Context context, VerisoulEnvironment verisoulEnvironment, String str, WebViewFactory webViewFactory, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            webViewFactory = new DefaultWebViewFactory();
        }
        initializeDependencies(context, verisoulEnvironment, str, webViewFactory);
    }

    public static final /* synthetic */ <T> InjectDelegate<T> inject() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return new InjectDelegate<>(Object.class);
    }
}
