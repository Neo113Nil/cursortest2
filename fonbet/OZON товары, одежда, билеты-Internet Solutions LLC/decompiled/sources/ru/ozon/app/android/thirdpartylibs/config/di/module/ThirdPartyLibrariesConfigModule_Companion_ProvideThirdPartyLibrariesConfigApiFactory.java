package ru.ozon.app.android.thirdpartylibs.config.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigApi;

/* loaded from: classes7.dex */
public final class ThirdPartyLibrariesConfigModule_Companion_ProvideThirdPartyLibrariesConfigApiFactory implements e<ThirdPartyLibrariesConfigApi> {
    public static ThirdPartyLibrariesConfigApi provideThirdPartyLibrariesConfigApi(Retrofit retrofit) {
        ThirdPartyLibrariesConfigApi provideThirdPartyLibrariesConfigApi = ThirdPartyLibrariesConfigModule.INSTANCE.provideThirdPartyLibrariesConfigApi(retrofit);
        j.d(provideThirdPartyLibrariesConfigApi);
        return provideThirdPartyLibrariesConfigApi;
    }
}
