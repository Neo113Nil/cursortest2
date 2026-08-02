package ru.ozon.app.android.ui.switchingbutton.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

/* loaded from: classes7.dex */
public final class SwitchingButtonModule_ProvideSwitchingButtonsStorageFactory implements e<SwitchingButtonStateStorage> {

    private static final class InstanceHolder {
        private static final SwitchingButtonModule_ProvideSwitchingButtonsStorageFactory INSTANCE = new SwitchingButtonModule_ProvideSwitchingButtonsStorageFactory();
    }

    public static SwitchingButtonModule_ProvideSwitchingButtonsStorageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SwitchingButtonStateStorage provideSwitchingButtonsStorage() {
        SwitchingButtonStateStorage provideSwitchingButtonsStorage = SwitchingButtonModule.INSTANCE.provideSwitchingButtonsStorage();
        j.d(provideSwitchingButtonsStorage);
        return provideSwitchingButtonsStorage;
    }

    @Override // Pc.a
    public SwitchingButtonStateStorage get() {
        return provideSwitchingButtonsStorage();
    }
}
