package ru.ozon.app.android.account.orders.barcode.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.barcodecache.cache.BarcodeCacheManager;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes11.dex */
public final class BarcodeViewModelModule_ProvideBarcodeViewModelFactory implements e<BarcodeViewModel> {
    public static BarcodeViewModel provideBarcodeViewModel(BarcodeViewModelModule barcodeViewModelModule, a<BarcodeCacheManager> aVar, ConnectionHandler connectionHandler, AppType appType) {
        BarcodeViewModel provideBarcodeViewModel = barcodeViewModelModule.provideBarcodeViewModel(aVar, connectionHandler, appType);
        j.d(provideBarcodeViewModel);
        return provideBarcodeViewModel;
    }
}
