package ru.ozon.app.android.cml.delivery.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.CmlUploadPhotoApi;

/* loaded from: classes11.dex */
public final class CmlDeliveryModule_Companion_ProvideUploadPhotoApiFactory implements e<CmlUploadPhotoApi> {
    public static CmlUploadPhotoApi provideUploadPhotoApi(Retrofit retrofit) {
        CmlUploadPhotoApi provideUploadPhotoApi = CmlDeliveryModule.INSTANCE.provideUploadPhotoApi(retrofit);
        j.d(provideUploadPhotoApi);
        return provideUploadPhotoApi;
    }
}
