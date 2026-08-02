package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_ActionHandlerRegistryFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_ActionHandlerRegistryFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static ActionHandlerRegistry actionHandlerRegistry(CoreModule coreModule) {
        return (ActionHandlerRegistry) Gg.d.d(coreModule.actionHandlerRegistry());
    }

    public static CoreModule_ActionHandlerRegistryFactory create(CoreModule coreModule) {
        return new CoreModule_ActionHandlerRegistryFactory(coreModule);
    }

    @Override // javax.inject.Provider
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry(this.module);
    }
}
