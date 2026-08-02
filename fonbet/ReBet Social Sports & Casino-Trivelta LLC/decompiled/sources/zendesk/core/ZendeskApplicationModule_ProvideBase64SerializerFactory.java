package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements Gg.b {
    private final Provider<Serializer> gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, Provider<Serializer> provider) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = provider;
    }

    public static ZendeskApplicationModule_ProvideBase64SerializerFactory create(ZendeskApplicationModule zendeskApplicationModule, Provider<Serializer> provider) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, provider);
    }

    public static Serializer provideBase64Serializer(ZendeskApplicationModule zendeskApplicationModule, Object obj) {
        return (Serializer) Gg.d.d(zendeskApplicationModule.provideBase64Serializer((Serializer) obj));
    }

    @Override // javax.inject.Provider
    public Serializer get() {
        return provideBase64Serializer(this.module, this.gsonSerializerProvider.get());
    }
}
