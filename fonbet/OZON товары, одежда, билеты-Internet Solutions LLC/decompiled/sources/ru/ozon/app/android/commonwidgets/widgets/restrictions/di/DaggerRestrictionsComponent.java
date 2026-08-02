package ru.ozon.app.android.commonwidgets.widgets.restrictions.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsAppStore;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsAppStore_Factory;

/* loaded from: classes6.dex */
public final class DaggerRestrictionsComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public RestrictionsComponent build() {
            return new RestrictionsComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class RestrictionsComponentImpl implements RestrictionsComponent {
        private a<RestrictionsAppStore> restrictionsAppStoreProvider;
        private final RestrictionsComponentImpl restrictionsComponentImpl;

        /* synthetic */ RestrictionsComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.restrictionsAppStoreProvider = d.b(RestrictionsAppStore_Factory.create());
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.restrictions.di.RestrictionsComponentApi
        public RestrictionsAppStore getRestrictionsAppStore() {
            return this.restrictionsAppStoreProvider.get();
        }

        private RestrictionsComponentImpl() {
            this.restrictionsComponentImpl = this;
            initialize();
        }
    }

    public static RestrictionsComponent create() {
        return new Builder(0).build();
    }
}
