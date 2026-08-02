package ru.ozon.app.android.session.sessionList.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionMapper;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionMapper_Factory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListItemViewFactory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListItemViewFactory_Factory;

/* loaded from: classes2.dex */
public final class DaggerCurrentSessionComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public CurrentSessionComponent build() {
            return new CurrentSessionComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class CurrentSessionComponentImpl implements CurrentSessionComponent {
        private final CurrentSessionComponentImpl currentSessionComponentImpl;
        private a<CurrentSessionMapper> currentSessionMapperProvider;
        private a<SessionListItemViewFactory> sessionListItemViewFactoryProvider;

        /* synthetic */ CurrentSessionComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.currentSessionMapperProvider = d.b(CurrentSessionMapper_Factory.create());
            this.sessionListItemViewFactoryProvider = d.b(SessionListItemViewFactory_Factory.create());
        }

        @Override // ru.ozon.app.android.session.sessionList.di.CurrentSessionComponent
        public CurrentSessionMapper getMapper() {
            return this.currentSessionMapperProvider.get();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.CurrentSessionComponent
        public SessionListItemViewFactory getViewFactory() {
            return this.sessionListItemViewFactoryProvider.get();
        }

        private CurrentSessionComponentImpl() {
            this.currentSessionComponentImpl = this;
            initialize();
        }
    }

    public static CurrentSessionComponent create() {
        return new Builder(0).build();
    }
}
