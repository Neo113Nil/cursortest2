package zendesk.core;

import com.google.gson.Gson;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSerializerFactory implements Gg.b {
    private final Provider<Gson> gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(Provider<Gson> provider) {
        this.gsonProvider = provider;
    }

    public static ZendeskStorageModule_ProvideSerializerFactory create(Provider<Gson> provider) {
        return new ZendeskStorageModule_ProvideSerializerFactory(provider);
    }

    public static Serializer provideSerializer(Gson gson) {
        return (Serializer) Gg.d.d(ZendeskStorageModule.provideSerializer(gson));
    }

    @Override // javax.inject.Provider
    public Serializer get() {
        return provideSerializer(this.gsonProvider.get());
    }
}
