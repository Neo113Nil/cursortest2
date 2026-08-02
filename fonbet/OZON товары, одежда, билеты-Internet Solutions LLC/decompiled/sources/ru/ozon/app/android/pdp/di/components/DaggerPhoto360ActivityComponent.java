package ru.ozon.app.android.pdp.di.components;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import retrofit2.Retrofit;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.di.components.Photo360ActivityComponent;
import ru.ozon.app.android.pdp.di.module.Photo360Module_Companion_ProvideApiFactory;
import ru.ozon.app.android.pdp.di.module.Photo360Module_Companion_ProvideInitInfoFactory;
import ru.ozon.app.android.pdp.view.photo360.api.Photo360Api;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360ContentDataSet;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360Repository;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity_MembersInjector;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel;

/* loaded from: classes13.dex */
public final class DaggerPhoto360ActivityComponent {

    private static final class Factory implements Photo360ActivityComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdp.di.components.Photo360ActivityComponent.Factory
        public Photo360ActivityComponent create(Photo360Activity photo360Activity, NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies) {
            photo360Activity.getClass();
            networkComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new Photo360ActivityComponentImpl(networkComponentApi, contextComponentDependencies, photo360Activity, 0);
        }

        private Factory() {
        }
    }

    private static final class Photo360ActivityComponentImpl implements Photo360ActivityComponent {
        private final ContextComponentDependencies contextComponentDependencies;
        private final NetworkComponentApi networkComponentApi;
        private final Photo360Activity photo360Activity;
        private final Photo360ActivityComponentImpl photo360ActivityComponentImpl;
        private a<Photo360ViewModel> photo360ViewModelProvider;
        private a<Photo360Api> provideApiProvider;
        private a<String> provideInitInfoProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93017id;
            private final Photo360ActivityComponentImpl photo360ActivityComponentImpl;

            SwitchingProvider(Photo360ActivityComponentImpl photo360ActivityComponentImpl, int i11) {
                this.photo360ActivityComponentImpl = photo360ActivityComponentImpl;
                this.f93017id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93017id;
                if (i11 == 0) {
                    return (T) new Photo360ViewModel(this.photo360ActivityComponentImpl.photo360Repository());
                }
                if (i11 == 1) {
                    return (T) Photo360Module_Companion_ProvideInitInfoFactory.provideInitInfo(this.photo360ActivityComponentImpl.photo360Activity);
                }
                if (i11 != 2) {
                    throw new AssertionError(this.f93017id);
                }
                Retrofit retrofit = this.photo360ActivityComponentImpl.networkComponentApi.getRetrofit();
                j.c(retrofit);
                return (T) Photo360Module_Companion_ProvideApiFactory.provideApi(retrofit);
            }
        }

        /* synthetic */ Photo360ActivityComponentImpl(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, Photo360Activity photo360Activity, int i11) {
            this(networkComponentApi, contextComponentDependencies, photo360Activity);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, Photo360Activity photo360Activity) {
            this.provideInitInfoProvider = d.b(new SwitchingProvider(this.photo360ActivityComponentImpl, 1));
            this.provideApiProvider = d.b(new SwitchingProvider(this.photo360ActivityComponentImpl, 2));
            this.photo360ViewModelProvider = new SwitchingProvider(this.photo360ActivityComponentImpl, 0);
        }

        private Photo360Activity injectPhoto360Activity(Photo360Activity photo360Activity) {
            Photo360Activity_MembersInjector.injectPViewModel(photo360Activity, this.photo360ViewModelProvider);
            return photo360Activity;
        }

        private Photo360ContentDataSet photo360ContentDataSet() {
            return new Photo360ContentDataSet(this.provideInitInfoProvider.get(), this.provideApiProvider.get());
        }

        private Photo360ImagesDataSet photo360ImagesDataSet() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new Photo360ImagesDataSet(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Photo360Repository photo360Repository() {
            return new Photo360Repository(photo360ContentDataSet(), photo360ImagesDataSet());
        }

        @Override // ru.ozon.app.android.pdp.di.components.Photo360ActivityComponent
        public void inject(Photo360Activity photo360Activity) {
            injectPhoto360Activity(photo360Activity);
        }

        private Photo360ActivityComponentImpl(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, Photo360Activity photo360Activity) {
            this.photo360ActivityComponentImpl = this;
            this.photo360Activity = photo360Activity;
            this.networkComponentApi = networkComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(networkComponentApi, contextComponentDependencies, photo360Activity);
        }
    }

    public static Photo360ActivityComponent.Factory factory() {
        return new Factory(0);
    }
}
