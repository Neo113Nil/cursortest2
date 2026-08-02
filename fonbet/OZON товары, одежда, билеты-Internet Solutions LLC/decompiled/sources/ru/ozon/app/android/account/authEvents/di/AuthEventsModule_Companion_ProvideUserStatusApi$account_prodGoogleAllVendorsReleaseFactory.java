package ru.ozon.app.android.account.authEvents.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.account.authEvents.api.OzonIdUserStatusApi;

/* loaded from: classes6.dex */
public final class AuthEventsModule_Companion_ProvideUserStatusApi$account_prodGoogleAllVendorsReleaseFactory implements e<OzonIdUserStatusApi> {
    public static OzonIdUserStatusApi provideUserStatusApi$account_prodGoogleAllVendorsRelease(Retrofit retrofit) {
        OzonIdUserStatusApi provideUserStatusApi$account_prodGoogleAllVendorsRelease = AuthEventsModule.INSTANCE.provideUserStatusApi$account_prodGoogleAllVendorsRelease(retrofit);
        j.d(provideUserStatusApi$account_prodGoogleAllVendorsRelease);
        return provideUserStatusApi$account_prodGoogleAllVendorsRelease;
    }
}
