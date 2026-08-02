package ru.ozon.app.android.push.di.module;

import Jb.e;
import Jb.j;
import Ld0.c;
import Zg0.g;
import android.content.Context;
import androidx.core.app.n;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.push.di.PushComponentConfig;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;

/* loaded from: classes7.dex */
public final class OzonPushModule_Companion_ProvidePushConfigurationFactory implements e<g> {
    public static g providePushConfiguration(Context context, PushComponentConfig pushComponentConfig, Zg0.e eVar, ApplicationInfoDataSource applicationInfoDataSource, n nVar, FeatureChecker featureChecker, c cVar) {
        g providePushConfiguration = OzonPushModule.INSTANCE.providePushConfiguration(context, pushComponentConfig, eVar, applicationInfoDataSource, nVar, featureChecker, cVar);
        j.d(providePushConfiguration);
        return providePushConfiguration;
    }
}
