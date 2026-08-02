package zendesk.core;

import android.content.Context;

/* loaded from: classes5.dex */
public final class CoreModule_GetApplicationContextFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationContextFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }

    public static Context getApplicationContext(CoreModule coreModule) {
        return (Context) Gg.d.d(coreModule.getApplicationContext());
    }

    @Override // javax.inject.Provider
    public Context get() {
        return getApplicationContext(this.module);
    }
}
