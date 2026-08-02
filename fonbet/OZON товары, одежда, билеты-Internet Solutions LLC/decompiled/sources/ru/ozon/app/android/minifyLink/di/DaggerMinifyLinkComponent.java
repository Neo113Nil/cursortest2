package ru.ozon.app.android.minifyLink.di;

import Jb.j;
import Jb.m;
import Pc.a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.minifyLink.data.MinifyLinkRepository;
import ru.ozon.app.android.minifyLink.data.MinifyLinkRepositoryImpl;
import ru.ozon.app.android.minifyLink.data.MinifyLinkRepositoryImpl_Factory;
import ru.ozon.app.android.minifyLink.di.MinifyLinkComponent;

/* loaded from: classes6.dex */
public final class DaggerMinifyLinkComponent {

    private static final class Factory implements MinifyLinkComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.minifyLink.di.MinifyLinkComponent.Factory
        public MinifyLinkComponent create(ActionComponentApi actionComponentApi) {
            actionComponentApi.getClass();
            return new MinifyLinkComponentImpl(actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class MinifyLinkComponentImpl implements MinifyLinkComponent {
        private a<MinifyLinkRepository> bindMinifyLinkRepositoryProvider;
        private a<ActionV2Repository> getActionRepositoryProvider;
        private final MinifyLinkComponentImpl minifyLinkComponentImpl;
        private a<MinifyLinkRepositoryImpl> minifyLinkRepositoryImplProvider;

        private static final class GetActionRepositoryProvider implements a<ActionV2Repository> {
            private final ActionComponentApi actionComponentApi;

            GetActionRepositoryProvider(ActionComponentApi actionComponentApi) {
                this.actionComponentApi = actionComponentApi;
            }

            @Override // Pc.a
            public ActionV2Repository get() {
                ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return actionRepository;
            }
        }

        /* synthetic */ MinifyLinkComponentImpl(ActionComponentApi actionComponentApi, int i11) {
            this(actionComponentApi);
        }

        private void initialize(ActionComponentApi actionComponentApi) {
            GetActionRepositoryProvider getActionRepositoryProvider = new GetActionRepositoryProvider(actionComponentApi);
            this.getActionRepositoryProvider = getActionRepositoryProvider;
            MinifyLinkRepositoryImpl_Factory create = MinifyLinkRepositoryImpl_Factory.create(getActionRepositoryProvider);
            this.minifyLinkRepositoryImplProvider = create;
            this.bindMinifyLinkRepositoryProvider = m.a(create);
        }

        @Override // ru.ozon.app.android.minifyLink.di.MinifyLinkComponentApi
        public MinifyLinkRepository getMinifyLinkRepository() {
            return this.bindMinifyLinkRepositoryProvider.get();
        }

        private MinifyLinkComponentImpl(ActionComponentApi actionComponentApi) {
            this.minifyLinkComponentImpl = this;
            initialize(actionComponentApi);
        }
    }

    public static MinifyLinkComponent.Factory factory() {
        return new Factory(0);
    }
}
