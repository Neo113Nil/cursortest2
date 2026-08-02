package zendesk.core;

import android.content.Context;
import java.io.File;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidesCacheDirFactory implements Gg.b {
    private final Provider<Context> contextProvider;

    public ZendeskStorageModule_ProvidesCacheDirFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ZendeskStorageModule_ProvidesCacheDirFactory create(Provider<Context> provider) {
        return new ZendeskStorageModule_ProvidesCacheDirFactory(provider);
    }

    public static File providesCacheDir(Context context) {
        return (File) Gg.d.d(ZendeskStorageModule.providesCacheDir(context));
    }

    @Override // javax.inject.Provider
    public File get() {
        return providesCacheDir(this.contextProvider.get());
    }
}
