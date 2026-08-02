package ru.ozon.app.android.pdp.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.pdp.view.photo360.api.Photo360Api;

/* loaded from: classes13.dex */
public final class Photo360Module_Companion_ProvideApiFactory implements e<Photo360Api> {
    public static Photo360Api provideApi(Retrofit retrofit) {
        Photo360Api provideApi = Photo360Module.INSTANCE.provideApi(retrofit);
        j.d(provideApi);
        return provideApi;
    }
}
