package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.api.B2bDeleteConsigneeApi;

/* loaded from: classes12.dex */
public final class B2bDeleteConsigneeModule_Companion_ProvideB2bDeleteConsigneeApiFactory implements e<B2bDeleteConsigneeApi> {
    public static B2bDeleteConsigneeApi provideB2bDeleteConsigneeApi(Retrofit retrofit) {
        B2bDeleteConsigneeApi provideB2bDeleteConsigneeApi = B2bDeleteConsigneeModule.INSTANCE.provideB2bDeleteConsigneeApi(retrofit);
        j.d(provideB2bDeleteConsigneeApi);
        return provideB2bDeleteConsigneeApi;
    }
}
