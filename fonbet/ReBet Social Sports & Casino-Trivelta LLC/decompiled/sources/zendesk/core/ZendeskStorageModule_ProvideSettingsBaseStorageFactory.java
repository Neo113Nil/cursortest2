package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSettingsBaseStorageFactory implements Gg.b {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSettingsBaseStorageFactory(Provider<Context> provider, Provider<Serializer> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static ZendeskStorageModule_ProvideSettingsBaseStorageFactory create(Provider<Context> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvideSettingsBaseStorageFactory(provider, provider2);
    }

    public static BaseStorage provideSettingsBaseStorage(Context context, Object obj) {
        return (BaseStorage) Gg.d.d(ZendeskStorageModule.provideSettingsBaseStorage(context, (Serializer) obj));
    }

    @Override // javax.inject.Provider
    public BaseStorage get() {
        return provideSettingsBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
