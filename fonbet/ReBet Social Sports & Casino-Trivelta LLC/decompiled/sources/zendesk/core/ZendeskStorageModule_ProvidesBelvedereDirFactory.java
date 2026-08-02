package zendesk.core;

import android.content.Context;
import java.io.File;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidesBelvedereDirFactory implements Gg.b {
    private final Provider<Context> contextProvider;

    public ZendeskStorageModule_ProvidesBelvedereDirFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ZendeskStorageModule_ProvidesBelvedereDirFactory create(Provider<Context> provider) {
        return new ZendeskStorageModule_ProvidesBelvedereDirFactory(provider);
    }

    public static File providesBelvedereDir(Context context) {
        return (File) Gg.d.d(ZendeskStorageModule.providesBelvedereDir(context));
    }

    @Override // javax.inject.Provider
    public File get() {
        return providesBelvedereDir(this.contextProvider.get());
    }
}
