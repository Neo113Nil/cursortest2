package ru.ozon.app.android.account.orders.barcode.presentation;

import BZ.e;
import GZ.g;
import Ib.b;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.viewmodel.BarcodeViewModel;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes11.dex */
public final class BarcodeFragment_MembersInjector implements b<BarcodeFragment> {
    public static void injectAppType(BarcodeFragment barcodeFragment, AppType appType) {
        barcodeFragment.appType = appType;
    }

    public static void injectBrightnessChanger(BarcodeFragment barcodeFragment, ScreenBrightnessChanger screenBrightnessChanger) {
        barcodeFragment.brightnessChanger = screenBrightnessChanger;
    }

    public static void injectMiniAppConfigHolder(BarcodeFragment barcodeFragment, e eVar) {
        barcodeFragment.miniAppConfigHolder = eVar;
    }

    public static void injectOzonRouter(BarcodeFragment barcodeFragment, g gVar) {
        barcodeFragment.ozonRouter = gVar;
    }

    public static void injectViewModel(BarcodeFragment barcodeFragment, BarcodeViewModel barcodeViewModel) {
        barcodeFragment.viewModel = barcodeViewModel;
    }
}
