package ru.ozon.app.android.cdn.host.manager.di.module;

import Jb.e;
import Jb.j;
import We.E;
import YY.a;
import android.content.Context;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

/* loaded from: classes6.dex */
public final class CdnHostManagerModule_Companion_ProvideCdnChooserHostApiFactory implements e<a> {
    public static a provideCdnChooserHostApi(Context context, E e11, NetworkComponentConfig networkComponentConfig) {
        a provideCdnChooserHostApi = CdnHostManagerModule.INSTANCE.provideCdnChooserHostApi(context, e11, networkComponentConfig);
        j.d(provideCdnChooserHostApi);
        return provideCdnChooserHostApi;
    }
}
