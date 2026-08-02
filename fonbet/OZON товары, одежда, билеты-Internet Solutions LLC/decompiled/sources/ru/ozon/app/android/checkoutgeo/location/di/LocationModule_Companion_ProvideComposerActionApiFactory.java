package ru.ozon.app.android.checkoutgeo.location.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.location.api.LocationApi;

/* loaded from: classes6.dex */
public final class LocationModule_Companion_ProvideComposerActionApiFactory implements e<LocationApi> {
    public static LocationApi provideComposerActionApi(Retrofit retrofit) {
        LocationApi provideComposerActionApi = LocationModule.INSTANCE.provideComposerActionApi(retrofit);
        j.d(provideComposerActionApi);
        return provideComposerActionApi;
    }
}
