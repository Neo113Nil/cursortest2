package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory implements Gg.b {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(Provider<Context> provider, Provider<Serializer> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory create(Provider<Context> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(provider, provider2);
    }

    public static BaseStorage provideAdditionalSdkBaseStorage(Context context, Object obj) {
        return (BaseStorage) Gg.d.d(ZendeskStorageModule.provideAdditionalSdkBaseStorage(context, (Serializer) obj));
    }

    @Override // javax.inject.Provider
    public BaseStorage get() {
        return provideAdditionalSdkBaseStorage(this.contextProvider.get(), this.serializerProvider.get());
    }
}
