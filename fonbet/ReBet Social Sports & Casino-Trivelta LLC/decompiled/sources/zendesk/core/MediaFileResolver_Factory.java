package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class MediaFileResolver_Factory implements Gg.b {
    private final Provider<Context> contextProvider;

    public MediaFileResolver_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static MediaFileResolver_Factory create(Provider<Context> provider) {
        return new MediaFileResolver_Factory(provider);
    }

    public static MediaFileResolver newInstance(Context context) {
        return new MediaFileResolver(context);
    }

    @Override // javax.inject.Provider
    public MediaFileResolver get() {
        return newInstance(this.contextProvider.get());
    }
}
