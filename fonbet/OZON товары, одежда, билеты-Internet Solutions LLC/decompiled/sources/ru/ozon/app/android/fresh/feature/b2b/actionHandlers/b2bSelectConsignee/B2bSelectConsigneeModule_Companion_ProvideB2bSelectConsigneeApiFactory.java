package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.api.B2bSelectConsigneeApi;

/* loaded from: classes12.dex */
public final class B2bSelectConsigneeModule_Companion_ProvideB2bSelectConsigneeApiFactory implements e<B2bSelectConsigneeApi> {
    public static B2bSelectConsigneeApi provideB2bSelectConsigneeApi(Retrofit retrofit) {
        B2bSelectConsigneeApi provideB2bSelectConsigneeApi = B2bSelectConsigneeModule.INSTANCE.provideB2bSelectConsigneeApi(retrofit);
        j.d(provideB2bSelectConsigneeApi);
        return provideB2bSelectConsigneeApi;
    }
}
