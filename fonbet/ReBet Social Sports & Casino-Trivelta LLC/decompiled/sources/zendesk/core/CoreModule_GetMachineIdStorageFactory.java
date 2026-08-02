package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetMachineIdStorageFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetMachineIdStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMachineIdStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetMachineIdStorageFactory(coreModule);
    }

    public static MachineIdStorage getMachineIdStorage(CoreModule coreModule) {
        return (MachineIdStorage) Gg.d.d(coreModule.getMachineIdStorage());
    }

    @Override // javax.inject.Provider
    public MachineIdStorage get() {
        return getMachineIdStorage(this.module);
    }
}
