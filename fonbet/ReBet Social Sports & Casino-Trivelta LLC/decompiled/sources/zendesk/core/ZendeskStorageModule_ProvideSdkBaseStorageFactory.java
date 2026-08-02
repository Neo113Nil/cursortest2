package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSdkBaseStorageFactory implements Gg.b {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideSdkBaseStorageFactory(Provider<Context> provider, Provider<Serializer> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static ZendeskStorageModule_ProvideSdkBaseStorageFactory create(Provider<Context> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvideSdkBaseStorageFactory(provider, provider2);
    }

    public static BaseStorage provideSdkBaseStorage(Context context, Object obj) {
        return (BaseStorage) Gg.d.d(ZendeskStorageModule.provideSdkBaseStorage(context, (Serializer) obj));
    }

    @Override // javax.inject.Provider
    public BaseStorage get() {
        return provideSdkBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
