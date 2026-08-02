package ru.ozon.app.android.ui.start;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.platform.deeplink.ExternalDeeplinkProcessorDelegate;

/* loaded from: classes7.dex */
public final class AppHostActivity_MembersInjector implements b<AppHostActivity> {
    public static void injectExternalDeeplinkDelegate(AppHostActivity appHostActivity, ExternalDeeplinkProcessorDelegate externalDeeplinkProcessorDelegate) {
        appHostActivity.externalDeeplinkDelegate = externalDeeplinkProcessorDelegate;
    }

    public static void injectPViewModel(AppHostActivity appHostActivity, a<AppHostViewModel> aVar) {
        appHostActivity.pViewModel = aVar;
    }
}
