package ru.ozon.app.android.commonwidgets.widgets.share.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.commonwidgets.widgets.share.data.ShareButtonApi;

/* loaded from: classes11.dex */
public final class ShareButtonModule_Companion_ProvidesShareButtonApiFactory implements e<ShareButtonApi> {
    public static ShareButtonApi providesShareButtonApi(Retrofit retrofit) {
        ShareButtonApi providesShareButtonApi = ShareButtonModule.INSTANCE.providesShareButtonApi(retrofit);
        j.d(providesShareButtonApi);
        return providesShareButtonApi;
    }
}
