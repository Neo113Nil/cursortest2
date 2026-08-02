package ru.ozon.app.android.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.push.di.PushComponentConfig;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class ApplicationModule_ProvidePushComponentConfigFactory implements e<PushComponentConfig> {
    public static PushComponentConfig providePushComponentConfig(ApplicationModule applicationModule, String str, String str2, int i11, Fb0.e eVar, AppType appType) {
        PushComponentConfig providePushComponentConfig = applicationModule.providePushComponentConfig(str, str2, i11, eVar, appType);
        j.d(providePushComponentConfig);
        return providePushComponentConfig;
    }
}
