package zendesk.core;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public class CoreModule {
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final ApplicationConfiguration applicationConfiguration;
    private final Context applicationContext;
    private final AuthenticationProvider authenticationProvider;
    private final BlipsProvider blipsProvider;
    private final ScheduledExecutorService executor;
    private final MachineIdStorage machineIdStorage;
    private final MemoryCache memoryCache;
    private final NetworkInfoProvider networkInfoProvider;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final RestServiceProvider restServiceProvider;
    private final SessionStorage sessionStorage;
    private final SettingsProvider settingsProvider;

    public CoreModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, Context context, ActionHandlerRegistry actionHandlerRegistry, MemoryCache memoryCache, ScheduledExecutorService scheduledExecutorService, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider, MachineIdStorage machineIdStorage) {
        this.settingsProvider = settingsProvider;
        this.restServiceProvider = restServiceProvider;
        this.blipsProvider = blipsProvider;
        this.sessionStorage = sessionStorage;
        this.networkInfoProvider = networkInfoProvider;
        this.applicationContext = context;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.memoryCache = memoryCache;
        this.executor = scheduledExecutorService;
        this.authenticationProvider = authenticationProvider;
        this.applicationConfiguration = applicationConfiguration;
        this.pushRegistrationProvider = pushRegistrationProvider;
        this.machineIdStorage = machineIdStorage;
    }

    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public ApplicationConfiguration getApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public AuthenticationProvider getAuthenticationProvider() {
        return this.authenticationProvider;
    }

    public BlipsProvider getBlipsProvider() {
        return this.blipsProvider;
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public ExecutorService getExecutorService() {
        return this.executor;
    }

    public MachineIdStorage getMachineIdStorage() {
        return this.machineIdStorage;
    }

    public MemoryCache getMemoryCache() {
        return this.memoryCache;
    }

    public NetworkInfoProvider getNetworkInfoProvider() {
        return this.networkInfoProvider;
    }

    public PushRegistrationProvider getPushRegistrationProvider() {
        return this.pushRegistrationProvider;
    }

    public RestServiceProvider getRestServiceProvider() {
        return this.restServiceProvider;
    }

    public ScheduledExecutorService getScheduledExecutorService() {
        return this.executor;
    }

    public SessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    public SettingsProvider getSettingsProvider() {
        return this.settingsProvider;
    }
}
