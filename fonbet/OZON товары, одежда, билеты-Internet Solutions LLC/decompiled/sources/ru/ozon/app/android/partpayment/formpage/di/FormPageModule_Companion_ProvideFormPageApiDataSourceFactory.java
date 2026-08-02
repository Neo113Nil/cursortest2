package ru.ozon.app.android.partpayment.formpage.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;

/* loaded from: classes13.dex */
public final class FormPageModule_Companion_ProvideFormPageApiDataSourceFactory implements e<FormPageApiDataSource> {
    public static FormPageApiDataSource provideFormPageApiDataSource(Retrofit retrofit) {
        FormPageApiDataSource provideFormPageApiDataSource = FormPageModule.INSTANCE.provideFormPageApiDataSource(retrofit);
        j.d(provideFormPageApiDataSource);
        return provideFormPageApiDataSource;
    }
}
