package ru.ozon.app.android.ui.switchingbutton.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponent;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

/* loaded from: classes7.dex */
public final class DaggerSwitchingButtonComponent {

    private static final class Factory implements SwitchingButtonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponent.Factory
        public SwitchingButtonComponent create() {
            return new SwitchingButtonComponentImpl(0);
        }

        private Factory() {
        }
    }

    private static final class SwitchingButtonComponentImpl implements SwitchingButtonComponent {
        private a<SwitchingButtonStateStorage> provideSwitchingButtonsStorageProvider;
        private final SwitchingButtonComponentImpl switchingButtonComponentImpl;

        /* synthetic */ SwitchingButtonComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.provideSwitchingButtonsStorageProvider = d.b(SwitchingButtonModule_ProvideSwitchingButtonsStorageFactory.create());
        }

        @Override // ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi
        public SwitchingButtonStateStorage getSwitchingButtonStorage() {
            return this.provideSwitchingButtonsStorageProvider.get();
        }

        private SwitchingButtonComponentImpl() {
            this.switchingButtonComponentImpl = this;
            initialize();
        }
    }

    public static SwitchingButtonComponent.Factory factory() {
        return new Factory(0);
    }
}
