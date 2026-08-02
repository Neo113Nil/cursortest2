package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api.AddEdoApiV2;

/* loaded from: classes12.dex */
public final class AddEdoModuleV2_Companion_ProvideAddEdoApiFactory implements e<AddEdoApiV2> {
    public static AddEdoApiV2 provideAddEdoApi(Retrofit retrofit) {
        AddEdoApiV2 provideAddEdoApi = AddEdoModuleV2.INSTANCE.provideAddEdoApi(retrofit);
        j.d(provideAddEdoApi);
        return provideAddEdoApi;
    }
}
