package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.api.StatusEdoApi;

/* loaded from: classes12.dex */
public final class StatusEdoModule_Companion_ProvideStatusEdoApi$b2b_prodGoogleAllVendorsReleaseFactory implements e<StatusEdoApi> {
    public static StatusEdoApi provideStatusEdoApi$b2b_prodGoogleAllVendorsRelease(Retrofit retrofit) {
        StatusEdoApi provideStatusEdoApi$b2b_prodGoogleAllVendorsRelease = StatusEdoModule.INSTANCE.provideStatusEdoApi$b2b_prodGoogleAllVendorsRelease(retrofit);
        j.d(provideStatusEdoApi$b2b_prodGoogleAllVendorsRelease);
        return provideStatusEdoApi$b2b_prodGoogleAllVendorsRelease;
    }
}
