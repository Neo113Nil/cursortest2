package zendesk.core;

import android.content.Context;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements Gg.b {
    private final Provider<Context> contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ZendeskApplicationModule_ProvideDeviceInfoFactory create(Provider<Context> provider) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(provider);
    }

    public static DeviceInfo provideDeviceInfo(Context context) {
        return (DeviceInfo) Gg.d.d(ZendeskApplicationModule.provideDeviceInfo(context));
    }

    @Override // javax.inject.Provider
    public DeviceInfo get() {
        return provideDeviceInfo(this.contextProvider.get());
    }
}
