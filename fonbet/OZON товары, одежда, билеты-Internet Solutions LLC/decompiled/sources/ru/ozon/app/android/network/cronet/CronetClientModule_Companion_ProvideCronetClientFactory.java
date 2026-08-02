package ru.ozon.app.android.network.cronet;

import Ib.a;
import Jb.e;
import Jb.j;
import android.content.Context;
import com.vk.knet.cornet.b;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricListenersManager;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.version.AppVersionService;

/* loaded from: classes6.dex */
public final class CronetClientModule_Companion_ProvideCronetClientFactory implements e<CronetClient> {
    public static CronetClient provideCronetClient(Context context, CronetMetricListenersManager cronetMetricListenersManager, AppVersionService appVersionService, NetworkComponentConfig networkComponentConfig, CronetSettings cronetSettings, a<b> aVar, FeatureService featureService) {
        CronetClient provideCronetClient = CronetClientModule.INSTANCE.provideCronetClient(context, cronetMetricListenersManager, appVersionService, networkComponentConfig, cronetSettings, aVar, featureService);
        j.d(provideCronetClient);
        return provideCronetClient;
    }
}
