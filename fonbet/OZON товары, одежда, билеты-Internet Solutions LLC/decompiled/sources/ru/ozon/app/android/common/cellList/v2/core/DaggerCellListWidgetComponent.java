package ru.ozon.app.android.common.cellList.v2.core;

import Jb.j;
import Pc.a;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel;
import ru.ozon.app.android.common.actionHandlers.applySorting.ApplySortingViewModel_Factory;
import ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent;

/* loaded from: classes11.dex */
public final class DaggerCellListWidgetComponent {

    private static final class CellListWidgetComponentImpl implements CellListWidgetComponent {
        private final CellListWidgetComponentImpl cellListWidgetComponentImpl;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

        /* synthetic */ CellListWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent
        public a<ApplySortingViewModel> getApplySortingViewModelProvider() {
            return ApplySortingViewModel_Factory.create();
        }

        @Override // ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        private CellListWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.cellListWidgetComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    private static final class Factory implements CellListWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent.Factory
        public CellListWidgetComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new CellListWidgetComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CellListWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
