package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.api.B2bResetEdoVerificationApi;

/* loaded from: classes12.dex */
public final class B2bResetEdoVerificationModule_Companion_ProvideB2bResetEdoVerificationApiFactory implements e<B2bResetEdoVerificationApi> {
    public static B2bResetEdoVerificationApi provideB2bResetEdoVerificationApi(Retrofit retrofit) {
        B2bResetEdoVerificationApi provideB2bResetEdoVerificationApi = B2bResetEdoVerificationModule.INSTANCE.provideB2bResetEdoVerificationApi(retrofit);
        j.d(provideB2bResetEdoVerificationApi);
        return provideB2bResetEdoVerificationApi;
    }
}
