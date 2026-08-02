package zendesk.core;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory implements Gg.b {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory(zendeskApplicationModule);
    }

    public static ZendeskLocaleConverter provideZendeskLocaleConverter(ZendeskApplicationModule zendeskApplicationModule) {
        return (ZendeskLocaleConverter) Gg.d.d(zendeskApplicationModule.provideZendeskLocaleConverter());
    }

    @Override // javax.inject.Provider
    public ZendeskLocaleConverter get() {
        return provideZendeskLocaleConverter(this.module);
    }
}
