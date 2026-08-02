package zendesk.core;

/* loaded from: classes5.dex */
public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements Gg.b {

    public static final class InstanceHolder {
        private static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

        private InstanceHolder() {
        }
    }

    public static ActionHandlerRegistry actionHandlerRegistry() {
        return (ActionHandlerRegistry) Gg.d.d(ZendeskProvidersModule.actionHandlerRegistry());
    }

    public static ZendeskProvidersModule_ActionHandlerRegistryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    @Override // javax.inject.Provider
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry();
    }
}
