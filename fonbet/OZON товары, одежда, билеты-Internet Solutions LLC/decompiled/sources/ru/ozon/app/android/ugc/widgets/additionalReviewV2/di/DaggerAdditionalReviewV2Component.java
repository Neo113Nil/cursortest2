package ru.ozon.app.android.ugc.widgets.additionalReviewV2.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.core.AdditionalReviewV2Mapper;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.di.AdditionalReviewV2Component;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2ViewModel;

/* loaded from: classes2.dex */
public final class DaggerAdditionalReviewV2Component {

    private static final class AdditionalReviewV2ComponentImpl implements AdditionalReviewV2Component {
        private final ActionComponentApi actionComponentApi;
        private final AdditionalReviewV2ComponentImpl additionalReviewV2ComponentImpl;
        private a<AdditionalReviewV2Mapper> additionalReviewV2MapperProvider;
        private a<AdditionalReviewV2ViewModel> additionalReviewV2ViewModelProvider;
        private a<HandlersInhibitor> handlersInhibitorProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AdditionalReviewV2ComponentImpl additionalReviewV2ComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f94441id;

            SwitchingProvider(AdditionalReviewV2ComponentImpl additionalReviewV2ComponentImpl, int i11) {
                this.additionalReviewV2ComponentImpl = additionalReviewV2ComponentImpl;
                this.f94441id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f94441id;
                if (i11 == 0) {
                    return (T) new AdditionalReviewV2Mapper();
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        return (T) new HandlersInhibitor();
                    }
                    throw new AssertionError(this.f94441id);
                }
                ActionV2Repository actionRepository = this.additionalReviewV2ComponentImpl.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return (T) new AdditionalReviewV2ViewModel(actionRepository);
            }
        }

        /* synthetic */ AdditionalReviewV2ComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi, int i11) {
            this(networkComponentApi, actionComponentApi);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            this.additionalReviewV2MapperProvider = d.b(new SwitchingProvider(this.additionalReviewV2ComponentImpl, 0));
            this.additionalReviewV2ViewModelProvider = new SwitchingProvider(this.additionalReviewV2ComponentImpl, 1);
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.additionalReviewV2ComponentImpl, 2));
        }

        @Override // ru.ozon.app.android.ugc.widgets.additionalReviewV2.di.AdditionalReviewV2Component
        public HandlersInhibitor handlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.widgets.additionalReviewV2.di.AdditionalReviewV2Component
        public AdditionalReviewV2Mapper mapper() {
            return this.additionalReviewV2MapperProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.widgets.additionalReviewV2.di.AdditionalReviewV2Component
        public a<AdditionalReviewV2ViewModel> viewModelProvider() {
            return this.additionalReviewV2ViewModelProvider;
        }

        private AdditionalReviewV2ComponentImpl(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            this.additionalReviewV2ComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            initialize(networkComponentApi, actionComponentApi);
        }
    }

    private static final class Factory implements AdditionalReviewV2Component.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ugc.widgets.additionalReviewV2.di.AdditionalReviewV2Component.Factory
        public AdditionalReviewV2Component create(NetworkComponentApi networkComponentApi, ActionComponentApi actionComponentApi) {
            networkComponentApi.getClass();
            actionComponentApi.getClass();
            return new AdditionalReviewV2ComponentImpl(networkComponentApi, actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AdditionalReviewV2Component.Factory factory() {
        return new Factory(0);
    }
}
