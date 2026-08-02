package zendesk.core;

import android.content.Context;
import java.io.File;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidesDataDirFactory implements Gg.b {
    private final Provider<Context> contextProvider;

    public ZendeskStorageModule_ProvidesDataDirFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ZendeskStorageModule_ProvidesDataDirFactory create(Provider<Context> provider) {
        return new ZendeskStorageModule_ProvidesDataDirFactory(provider);
    }

    public static File providesDataDir(Context context) {
        return (File) Gg.d.d(ZendeskStorageModule.providesDataDir(context));
    }

    @Override // javax.inject.Provider
    public File get() {
        return providesDataDir(this.contextProvider.get());
    }
}
