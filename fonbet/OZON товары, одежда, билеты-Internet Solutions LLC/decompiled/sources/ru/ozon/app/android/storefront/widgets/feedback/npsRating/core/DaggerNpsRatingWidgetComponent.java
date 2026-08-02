package ru.ozon.app.android.storefront.widgets.feedback.npsRating.core;

import Jb.j;
import Vg.d;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingWidgetComponent;

/* loaded from: classes2.dex */
public final class DaggerNpsRatingWidgetComponent {

    private static final class Factory implements NpsRatingWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingWidgetComponent.Factory
        public NpsRatingWidgetComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            customActionHandlersComponentApi.getClass();
            return new NpsRatingWidgetComponentImpl(customActionHandlersComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class NpsRatingWidgetComponentImpl implements NpsRatingWidgetComponent {
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private final NpsRatingWidgetComponentImpl npsRatingWidgetComponentImpl;

        /* synthetic */ NpsRatingWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, int i11) {
            this(customActionHandlersComponentApi);
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingWidgetComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        private NpsRatingWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi) {
            this.npsRatingWidgetComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
        }
    }

    public static NpsRatingWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
