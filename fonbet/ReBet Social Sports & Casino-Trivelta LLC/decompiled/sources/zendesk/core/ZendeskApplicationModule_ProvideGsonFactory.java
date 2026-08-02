package zendesk.core;

import com.google.gson.Gson;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideGsonFactory implements Gg.b {

    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideGsonFactory INSTANCE = new ZendeskApplicationModule_ProvideGsonFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideGsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Gson provideGson() {
        return (Gson) Gg.d.d(ZendeskApplicationModule.provideGson());
    }

    @Override // javax.inject.Provider
    public Gson get() {
        return provideGson();
    }
}
