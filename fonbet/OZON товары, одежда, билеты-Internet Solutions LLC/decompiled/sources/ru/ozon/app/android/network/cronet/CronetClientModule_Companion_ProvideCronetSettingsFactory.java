package ru.ozon.app.android.network.cronet;

import Jb.e;
import Jb.j;

/* loaded from: classes6.dex */
public final class CronetClientModule_Companion_ProvideCronetSettingsFactory implements e<CronetSettings> {
    public static CronetSettings provideCronetSettings(CronetSettingsProvider cronetSettingsProvider) {
        CronetSettings provideCronetSettings = CronetClientModule.INSTANCE.provideCronetSettings(cronetSettingsProvider);
        j.d(provideCronetSettings);
        return provideCronetSettings;
    }
}
