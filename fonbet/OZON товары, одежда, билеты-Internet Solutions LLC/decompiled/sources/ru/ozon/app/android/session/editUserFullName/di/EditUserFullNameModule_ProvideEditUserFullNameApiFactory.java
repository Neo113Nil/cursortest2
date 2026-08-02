package ru.ozon.app.android.session.editUserFullName.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameApi;

/* loaded from: classes2.dex */
public final class EditUserFullNameModule_ProvideEditUserFullNameApiFactory implements e<EditUserFullNameApi> {
    public static EditUserFullNameApi provideEditUserFullNameApi(Retrofit retrofit) {
        EditUserFullNameApi provideEditUserFullNameApi = EditUserFullNameModule.provideEditUserFullNameApi(retrofit);
        j.d(provideEditUserFullNameApi);
        return provideEditUserFullNameApi;
    }
}
