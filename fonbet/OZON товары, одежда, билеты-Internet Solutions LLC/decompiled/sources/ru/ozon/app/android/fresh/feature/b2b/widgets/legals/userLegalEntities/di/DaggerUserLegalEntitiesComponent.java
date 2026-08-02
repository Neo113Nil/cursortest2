package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.di;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data.UserLegalEntitiesMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.di.UserLegalEntitiesComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes12.dex */
public final class DaggerUserLegalEntitiesComponent {

    private static final class Factory implements UserLegalEntitiesComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.di.UserLegalEntitiesComponent.Factory
        public UserLegalEntitiesComponent create(LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            legalsResultStateHolderComponentApi.getClass();
            networkComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            return new UserLegalEntitiesComponentImpl(legalsResultStateHolderComponentApi, networkComponentApi, customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class UserLegalEntitiesComponentImpl implements UserLegalEntitiesComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi;
        private final UserLegalEntitiesComponentImpl userLegalEntitiesComponentImpl;

        /* synthetic */ UserLegalEntitiesComponentImpl(LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(legalsResultStateHolderComponentApi, networkComponentApi, customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.di.UserLegalEntitiesComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.di.UserLegalEntitiesComponent
        public LegalsResultStateHolder getLegalsResultStateHolder() {
            LegalsResultStateHolder legalsResultStateHolder = this.legalsResultStateHolderComponentApi.getLegalsResultStateHolder();
            j.c(legalsResultStateHolder);
            return legalsResultStateHolder;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.di.UserLegalEntitiesComponent
        public UserLegalEntitiesMapper getUserLegalEntitiesMapper() {
            return new UserLegalEntitiesMapper();
        }

        private UserLegalEntitiesComponentImpl(LegalsResultStateHolderComponentApi legalsResultStateHolderComponentApi, NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.userLegalEntitiesComponentImpl = this;
            this.legalsResultStateHolderComponentApi = legalsResultStateHolderComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    public static UserLegalEntitiesComponent.Factory factory() {
        return new Factory(0);
    }
}
