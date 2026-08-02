package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideMachineIdStorageFactory implements Gg.b {
    private final Provider<Context> contextProvider;

    public ZendeskStorageModule_ProvideMachineIdStorageFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ZendeskStorageModule_ProvideMachineIdStorageFactory create(Provider<Context> provider) {
        return new ZendeskStorageModule_ProvideMachineIdStorageFactory(provider);
    }

    public static MachineIdStorage provideMachineIdStorage(Context context) {
        return (MachineIdStorage) Gg.d.d(ZendeskStorageModule.provideMachineIdStorage(context));
    }

    @Override // javax.inject.Provider
    public MachineIdStorage get() {
        return provideMachineIdStorage(this.contextProvider.get());
    }
}
