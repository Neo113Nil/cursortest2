package ru.ozon.app.android.session.userAdultModalMobile.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.session.userAdultModalMobile.domain.ComposerActionsExecutor;

/* loaded from: classes2.dex */
public final class UserAdultConfirmationModule_Companion_ProvideApiFactory implements e<ComposerActionsExecutor> {
    public static ComposerActionsExecutor provideApi(Retrofit retrofit) {
        ComposerActionsExecutor provideApi = UserAdultConfirmationModule.INSTANCE.provideApi(retrofit);
        j.d(provideApi);
        return provideApi;
    }
}
