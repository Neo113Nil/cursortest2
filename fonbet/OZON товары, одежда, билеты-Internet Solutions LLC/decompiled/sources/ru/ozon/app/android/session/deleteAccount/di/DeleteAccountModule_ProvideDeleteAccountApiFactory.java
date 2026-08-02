package ru.ozon.app.android.session.deleteAccount.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApi;

/* loaded from: classes2.dex */
public final class DeleteAccountModule_ProvideDeleteAccountApiFactory implements e<DeleteAccountApi> {
    public static DeleteAccountApi provideDeleteAccountApi(Retrofit retrofit) {
        DeleteAccountApi provideDeleteAccountApi = DeleteAccountModule.provideDeleteAccountApi(retrofit);
        j.d(provideDeleteAccountApi);
        return provideDeleteAccountApi;
    }
}
