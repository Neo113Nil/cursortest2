package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.di;

import Jb.e;
import Jb.j;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.ReconciliationActsDeclinerApi;

/* loaded from: classes12.dex */
public final class ReconciliationActsDeclinerModule_Companion_ProvideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsReleaseFactory implements e<ReconciliationActsDeclinerApi> {
    public static ReconciliationActsDeclinerApi provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsRelease(Retrofit retrofit) {
        ReconciliationActsDeclinerApi provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsRelease = ReconciliationActsDeclinerModule.INSTANCE.provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsRelease(retrofit);
        j.d(provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsRelease);
        return provideReconciliationActsDeclinerApi$b2b_prodGoogleAllVendorsRelease;
    }
}
