package zendesk.core;

import android.content.Context;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements Gg.b {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationContextFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }

    public static Context provideApplicationContext(ZendeskApplicationModule zendeskApplicationModule) {
        return (Context) Gg.d.d(zendeskApplicationModule.provideApplicationContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideApplicationContext(this.module);
    }
}
