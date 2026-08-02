package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetSessionStorageFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSessionStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }

    public static SessionStorage getSessionStorage(CoreModule coreModule) {
        return (SessionStorage) Gg.d.d(coreModule.getSessionStorage());
    }

    @Override // javax.inject.Provider
    public SessionStorage get() {
        return getSessionStorage(this.module);
    }
}
