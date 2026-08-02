package ru.ozon.app.android.analytics.firebase.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponent;
import ru.ozon.app.android.analytics.firebase.di.module.FirebaseAnalyticsModule_ProvideFirebaseAnalyticsFactory;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

/* loaded from: classes6.dex */
public final class DaggerFirebaseAnalyticsComponent {

    private static final class Factory implements FirebaseAnalyticsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponent.Factory
        public FirebaseAnalyticsComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new FirebaseAnalyticsComponentImpl(contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class FirebaseAnalyticsComponentImpl implements FirebaseAnalyticsComponent {
        private final ContextComponentDependencies contextComponentDependencies;
        private final FirebaseAnalyticsComponentImpl firebaseAnalyticsComponentImpl;
        private a<FirebaseAnalytics> provideFirebaseAnalyticsProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final FirebaseAnalyticsComponentImpl firebaseAnalyticsComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92160id;

            SwitchingProvider(FirebaseAnalyticsComponentImpl firebaseAnalyticsComponentImpl, int i11) {
                this.firebaseAnalyticsComponentImpl = firebaseAnalyticsComponentImpl;
                this.f92160id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92160id != 0) {
                    throw new AssertionError(this.f92160id);
                }
                Context context = this.firebaseAnalyticsComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                return (T) FirebaseAnalyticsModule_ProvideFirebaseAnalyticsFactory.provideFirebaseAnalytics(context);
            }
        }

        /* synthetic */ FirebaseAnalyticsComponentImpl(ContextComponentDependencies contextComponentDependencies, int i11) {
            this(contextComponentDependencies);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies) {
            this.provideFirebaseAnalyticsProvider = d.b(new SwitchingProvider(this.firebaseAnalyticsComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi
        public FirebaseAnalytics getFirebaseAnalytics() {
            return this.provideFirebaseAnalyticsProvider.get();
        }

        private FirebaseAnalyticsComponentImpl(ContextComponentDependencies contextComponentDependencies) {
            this.firebaseAnalyticsComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(contextComponentDependencies);
        }
    }

    public static FirebaseAnalyticsComponent.Factory factory() {
        return new Factory(0);
    }
}
