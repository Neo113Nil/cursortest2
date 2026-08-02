package ru.ozon.app.android.returns.ui.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractor;
import ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractorImpl;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;

/* loaded from: classes7.dex */
public final class DaggerRmsComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public RmsComponent build() {
            return new RmsComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class RmsComponentImpl implements RmsComponent {
        private a<ReturnUpdateInteractor> bindReturnChangedInteractorProvider;
        private a<ReturnCreationEventManager> provideReturnCreationEventManagerProvider;
        private a<ReturnUpdateInteractorImpl> returnUpdateInteractorImplProvider;
        private final RmsComponentImpl rmsComponentImpl;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f93371id;
            private final RmsComponentImpl rmsComponentImpl;

            SwitchingProvider(RmsComponentImpl rmsComponentImpl, int i11) {
                this.rmsComponentImpl = rmsComponentImpl;
                this.f93371id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f93371id;
                if (i11 == 0) {
                    return (T) new ReturnUpdateInteractorImpl();
                }
                if (i11 == 1) {
                    return (T) RmsModule_Companion_ProvideReturnCreationEventManagerFactory.provideReturnCreationEventManager();
                }
                throw new AssertionError(this.f93371id);
            }
        }

        /* synthetic */ RmsComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.rmsComponentImpl, 0);
            this.returnUpdateInteractorImplProvider = switchingProvider;
            this.bindReturnChangedInteractorProvider = d.b(switchingProvider);
            this.provideReturnCreationEventManagerProvider = d.b(new SwitchingProvider(this.rmsComponentImpl, 1));
        }

        @Override // ru.ozon.app.android.returns.ui.di.RmsComponentApi
        public ReturnUpdateInteractor getReturnChangeInteractor() {
            return this.bindReturnChangedInteractorProvider.get();
        }

        @Override // ru.ozon.app.android.returns.ui.di.RmsComponentApi
        public ReturnCreationEventManager getReturnCreationEventManager() {
            return this.provideReturnCreationEventManagerProvider.get();
        }

        private RmsComponentImpl() {
            this.rmsComponentImpl = this;
            initialize();
        }
    }

    public static RmsComponent create() {
        return new Builder(0).build();
    }
}
