package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.di;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.data.UserLegalEntitiesMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.di.UserLegalEntitiesComponentV2;

/* loaded from: classes12.dex */
public final class DaggerUserLegalEntitiesComponentV2 {

    private static final class Factory implements UserLegalEntitiesComponentV2.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.di.UserLegalEntitiesComponentV2.Factory
        public UserLegalEntitiesComponentV2 create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new UserLegalEntitiesComponentV2Impl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class UserLegalEntitiesComponentV2Impl implements UserLegalEntitiesComponentV2 {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final UserLegalEntitiesComponentV2Impl userLegalEntitiesComponentV2Impl;

        /* synthetic */ UserLegalEntitiesComponentV2Impl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.di.UserLegalEntitiesComponentV2
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.di.UserLegalEntitiesComponentV2
        public UserLegalEntitiesMapperV2 getUserLegalEntitiesMapperV2() {
            return new UserLegalEntitiesMapperV2();
        }

        private UserLegalEntitiesComponentV2Impl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.userLegalEntitiesComponentV2Impl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    public static UserLegalEntitiesComponentV2.Factory factory() {
        return new Factory(0);
    }
}
