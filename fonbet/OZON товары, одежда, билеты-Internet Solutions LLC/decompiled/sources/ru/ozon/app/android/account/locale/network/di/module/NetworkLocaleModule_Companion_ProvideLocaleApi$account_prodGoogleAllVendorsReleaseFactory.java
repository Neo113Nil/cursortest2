package ru.ozon.app.android.account.locale.network.di.module;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.locale.network.api.LocaleApi;

/* loaded from: classes11.dex */
public final class NetworkLocaleModule_Companion_ProvideLocaleApi$account_prodGoogleAllVendorsReleaseFactory implements e<LocaleApi> {
    public static LocaleApi provideLocaleApi$account_prodGoogleAllVendorsRelease(Retrofit retrofit) {
        LocaleApi provideLocaleApi$account_prodGoogleAllVendorsRelease = NetworkLocaleModule.INSTANCE.provideLocaleApi$account_prodGoogleAllVendorsRelease(retrofit);
        j.d(provideLocaleApi$account_prodGoogleAllVendorsRelease);
        return provideLocaleApi$account_prodGoogleAllVendorsRelease;
    }
}
