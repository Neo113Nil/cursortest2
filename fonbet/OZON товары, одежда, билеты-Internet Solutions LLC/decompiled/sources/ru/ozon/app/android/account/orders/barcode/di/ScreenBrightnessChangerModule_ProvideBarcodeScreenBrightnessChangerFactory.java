package ru.ozon.app.android.account.orders.barcode.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.FloorBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.MaxBrightnessChanger;
import ru.ozon.app.android.account.orders.barcode.presentation.utils.ScreenBrightnessChanger;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes11.dex */
public final class ScreenBrightnessChangerModule_ProvideBarcodeScreenBrightnessChangerFactory implements e<ScreenBrightnessChanger> {
    public static ScreenBrightnessChanger provideBarcodeScreenBrightnessChanger(ScreenBrightnessChangerModule screenBrightnessChangerModule, FeatureChecker featureChecker, MaxBrightnessChanger maxBrightnessChanger, FloorBrightnessChanger floorBrightnessChanger) {
        ScreenBrightnessChanger provideBarcodeScreenBrightnessChanger = screenBrightnessChangerModule.provideBarcodeScreenBrightnessChanger(featureChecker, maxBrightnessChanger, floorBrightnessChanger);
        j.d(provideBarcodeScreenBrightnessChanger);
        return provideBarcodeScreenBrightnessChanger;
    }
}
