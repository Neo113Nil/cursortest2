package ru.ozon.app.android.cscore.copybutton.di;

import ru.ozon.app.android.cscore.copybutton.di.CopyButtonComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerCopyButtonComponent {

    private static final class CopyButtonComponentImpl implements CopyButtonComponent {
        private final CopyButtonComponentImpl copyButtonComponentImpl;
        private final NetworkComponentApi networkComponentApi;

        /* synthetic */ CopyButtonComponentImpl(NetworkComponentApi networkComponentApi, int i11) {
            this(networkComponentApi);
        }

        private CopyButtonComponentImpl(NetworkComponentApi networkComponentApi) {
            this.copyButtonComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
        }
    }

    private static final class Factory implements CopyButtonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cscore.copybutton.di.CopyButtonComponent.Factory
        public CopyButtonComponent create(NetworkComponentApi networkComponentApi) {
            networkComponentApi.getClass();
            return new CopyButtonComponentImpl(networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CopyButtonComponent.Factory factory() {
        return new Factory(0);
    }
}
