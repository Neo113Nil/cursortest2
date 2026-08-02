package ru.ozon.app.android.button.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.csma.api.ComposerActionApi;

/* loaded from: classes11.dex */
public final class CsmaButtonCommonModule_ProvideComposerActionApiFactory implements e<ComposerActionApi> {
    public static ComposerActionApi provideComposerActionApi(CsmaButtonCommonModule csmaButtonCommonModule, Retrofit retrofit) {
        ComposerActionApi provideComposerActionApi = csmaButtonCommonModule.provideComposerActionApi(retrofit);
        j.d(provideComposerActionApi);
        return provideComposerActionApi;
    }
}
