package ru.ozon.app.android.storefront.widgets.appOnboarding.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingStorage;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingStorage_Factory;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponent;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;

/* loaded from: classes7.dex */
public final class DaggerAppOnboardingComponent {

    private static final class AppOnboardingComponentImpl implements AppOnboardingComponent {
        private final AppOnboardingComponentImpl appOnboardingComponentImpl;
        private a<AppOnboardingStorage> appOnboardingStorageProvider;
        private a<Context> getContextProvider;

        private static final class GetContextProvider implements a<Context> {
            private final ContextComponentDependencies contextComponentDependencies;

            GetContextProvider(ContextComponentDependencies contextComponentDependencies) {
                this.contextComponentDependencies = contextComponentDependencies;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Context get() {
                Context context = this.contextComponentDependencies.getContext();
                j.c(context);
                return context;
            }
        }

        /* synthetic */ AppOnboardingComponentImpl(ContextComponentDependencies contextComponentDependencies, int i11) {
            this(contextComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies) {
            GetContextProvider getContextProvider = new GetContextProvider(contextComponentDependencies);
            this.getContextProvider = getContextProvider;
            this.appOnboardingStorageProvider = d.b(AppOnboardingStorage_Factory.create(getContextProvider));
        }

        @Override // ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi
        public AppOnboardingViewModel appOnboardingViewModel() {
            return new AppOnboardingViewModel(this.appOnboardingStorageProvider.get());
        }

        private AppOnboardingComponentImpl(ContextComponentDependencies contextComponentDependencies) {
            this.appOnboardingComponentImpl = this;
            initialize(contextComponentDependencies);
        }
    }

    private static final class Factory implements AppOnboardingComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponent.Factory
        public AppOnboardingComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new AppOnboardingComponentImpl(contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    public static AppOnboardingComponent.Factory factory() {
        return new Factory(0);
    }
}
