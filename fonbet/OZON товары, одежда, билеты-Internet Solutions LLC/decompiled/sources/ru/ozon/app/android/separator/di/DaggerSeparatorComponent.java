package ru.ozon.app.android.separator.di;

import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.separator.di.SeparatorComponent;

/* loaded from: classes7.dex */
public final class DaggerSeparatorComponent {

    private static final class Factory implements SeparatorComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.separator.di.SeparatorComponent.Factory
        public SeparatorComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new SeparatorComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SeparatorComponentImpl implements SeparatorComponent {
        private final SeparatorComponentImpl separatorComponentImpl;

        /* synthetic */ SeparatorComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private SeparatorComponentImpl(NetworkComponentApi networkComponentApi) {
            this.separatorComponentImpl = this;
        }
    }

    public static SeparatorComponent.Factory factory() {
        return new Factory(0);
    }
}
