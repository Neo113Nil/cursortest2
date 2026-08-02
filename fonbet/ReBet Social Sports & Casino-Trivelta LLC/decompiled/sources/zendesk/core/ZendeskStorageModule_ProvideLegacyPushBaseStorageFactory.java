package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory implements Gg.b {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(Provider<Context> provider, Provider<Serializer> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory create(Provider<Context> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(provider, provider2);
    }

    public static SharedPreferencesStorage provideLegacyPushBaseStorage(Context context, Object obj) {
        return (SharedPreferencesStorage) Gg.d.d(ZendeskStorageModule.provideLegacyPushBaseStorage(context, (Serializer) obj));
    }

    @Override // javax.inject.Provider
    public SharedPreferencesStorage get() {
        return provideLegacyPushBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
