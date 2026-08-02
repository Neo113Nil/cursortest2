package ru.ozon.app.android.core.navigation.interceptors.predicate.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponent;
import ru.ozon.app.android.core.navigation.interceptors.predicate.multiple.AtMostEmployeeUserPredicate;
import ru.ozon.app.android.core.navigation.interceptors.predicate.multiple.AtMostQaUserPredicate;
import ru.ozon.app.android.core.navigation.interceptors.predicate.single.AutoTestUserPredicate;
import ru.ozon.app.android.core.navigation.interceptors.predicate.single.DebugBuildPredicate;
import ru.ozon.app.android.core.navigation.interceptors.predicate.single.EmployeeUserPredicate;
import ru.ozon.app.android.core.navigation.interceptors.predicate.single.QaFlavorPredicate;
import ru.ozon.app.android.core.navigation.interceptors.predicate.single.QaUserPredicate;
import ru.ozon.app.android.injection.IDaggerComponentDependencies;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorMultiplePredicate;
import ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorPredicate;
import ru.ozon.app.android.network.abtool.NetworkAtMostQaUserPredicate;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.UserStatusStorage;

/* loaded from: classes6.dex */
public final class DaggerInterceptorPredicatesComponent {

    private static final class Factory implements InterceptorPredicatesComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponent.Factory
        public InterceptorPredicatesComponent create(IDaggerComponentDependencies iDaggerComponentDependencies, StorageComponentApi storageComponentApi) {
            iDaggerComponentDependencies.getClass();
            storageComponentApi.getClass();
            return new InterceptorPredicatesComponentImpl(iDaggerComponentDependencies, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class InterceptorPredicatesComponentImpl implements InterceptorPredicatesComponent {
        private a<AtMostEmployeeUserPredicate> atMostEmployeeUserPredicateProvider;
        private a<AtMostQaUserPredicate> atMostQaUserPredicateProvider;
        private a<AutoTestUserPredicate> autoTestUserPredicateProvider;
        private a<DebugBuildPredicate> debugBuildPredicateProvider;
        private a<EmployeeUserPredicate> employeeUserPredicateProvider;
        private final IDaggerComponentDependencies iDaggerComponentDependencies;
        private final InterceptorPredicatesComponentImpl interceptorPredicatesComponentImpl;
        private a<QaFlavorPredicate> qaFlavorPredicateProvider;
        private a<QaUserPredicate> qaUserPredicateProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92483id;
            private final InterceptorPredicatesComponentImpl interceptorPredicatesComponentImpl;

            SwitchingProvider(InterceptorPredicatesComponentImpl interceptorPredicatesComponentImpl, int i11) {
                this.interceptorPredicatesComponentImpl = interceptorPredicatesComponentImpl;
                this.f92483id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92483id) {
                    case 0:
                        return (T) new AtMostQaUserPredicate((InterceptorPredicate) this.interceptorPredicatesComponentImpl.debugBuildPredicateProvider.get(), (InterceptorPredicate) this.interceptorPredicatesComponentImpl.qaFlavorPredicateProvider.get(), (InterceptorPredicate) this.interceptorPredicatesComponentImpl.autoTestUserPredicateProvider.get(), (InterceptorPredicate) this.interceptorPredicatesComponentImpl.qaUserPredicateProvider.get());
                    case 1:
                        return (T) new DebugBuildPredicate();
                    case 2:
                        FlavorType flavorType = this.interceptorPredicatesComponentImpl.iDaggerComponentDependencies.getFlavorType();
                        j.c(flavorType);
                        return (T) new QaFlavorPredicate(flavorType);
                    case 3:
                        UserStatusStorage userStatusStorage = this.interceptorPredicatesComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage);
                        return (T) new AutoTestUserPredicate(userStatusStorage);
                    case 4:
                        UserStatusStorage userStatusStorage2 = this.interceptorPredicatesComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage2);
                        return (T) new QaUserPredicate(userStatusStorage2);
                    case 5:
                        return (T) new AtMostEmployeeUserPredicate((InterceptorMultiplePredicate) this.interceptorPredicatesComponentImpl.atMostQaUserPredicateProvider.get(), (InterceptorPredicate) this.interceptorPredicatesComponentImpl.employeeUserPredicateProvider.get());
                    case 6:
                        UserStatusStorage userStatusStorage3 = this.interceptorPredicatesComponentImpl.storageComponentApi.getUserStatusStorage();
                        j.c(userStatusStorage3);
                        return (T) new EmployeeUserPredicate(userStatusStorage3);
                    default:
                        throw new AssertionError(this.f92483id);
                }
            }
        }

        /* synthetic */ InterceptorPredicatesComponentImpl(IDaggerComponentDependencies iDaggerComponentDependencies, StorageComponentApi storageComponentApi, int i11) {
            this(iDaggerComponentDependencies, storageComponentApi);
        }

        private void initialize(IDaggerComponentDependencies iDaggerComponentDependencies, StorageComponentApi storageComponentApi) {
            this.debugBuildPredicateProvider = d.b(new SwitchingProvider(this.interceptorPredicatesComponentImpl, 1));
            this.qaFlavorPredicateProvider = d.b(new SwitchingProvider(this.interceptorPredicatesComponentImpl, 2));
            this.autoTestUserPredicateProvider = d.b(new SwitchingProvider(this.interceptorPredicatesComponentImpl, 3));
            this.qaUserPredicateProvider = d.b(new SwitchingProvider(this.interceptorPredicatesComponentImpl, 4));
            this.atMostQaUserPredicateProvider = d.b(new SwitchingProvider(this.interceptorPredicatesComponentImpl, 0));
            this.employeeUserPredicateProvider = d.b(new SwitchingProvider(this.interceptorPredicatesComponentImpl, 6));
            this.atMostEmployeeUserPredicateProvider = d.b(new SwitchingProvider(this.interceptorPredicatesComponentImpl, 5));
        }

        @Override // ru.ozon.app.android.network.di.NetworkUserDependencies
        public NetworkAtMostQaUserPredicate atMostQaUserPredicate() {
            return this.atMostQaUserPredicateProvider.get();
        }

        @Override // ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponentApi
        public InterceptorMultiplePredicate bindAtMostEmployeeUserPredicate() {
            return this.atMostEmployeeUserPredicateProvider.get();
        }

        @Override // ru.ozon.app.android.core.navigation.interceptors.predicate.di.InterceptorPredicatesComponentApi
        public InterceptorMultiplePredicate bindAtMostQaUserPredicate() {
            return this.atMostQaUserPredicateProvider.get();
        }

        private InterceptorPredicatesComponentImpl(IDaggerComponentDependencies iDaggerComponentDependencies, StorageComponentApi storageComponentApi) {
            this.interceptorPredicatesComponentImpl = this;
            this.iDaggerComponentDependencies = iDaggerComponentDependencies;
            this.storageComponentApi = storageComponentApi;
            initialize(iDaggerComponentDependencies, storageComponentApi);
        }
    }

    public static InterceptorPredicatesComponent.Factory factory() {
        return new Factory(0);
    }
}
