package ru.ozon.app.android.session.sessionList.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionTitleMapper;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionTitleMapper_Factory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListTitleViewFactory;
import ru.ozon.app.android.session.sessionList.presentation.viewFactory.SessionListTitleViewFactory_Factory;

/* loaded from: classes2.dex */
public final class DaggerCurrentSessionTitleComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public CurrentSessionTitleComponent build() {
            return new CurrentSessionTitleComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class CurrentSessionTitleComponentImpl implements CurrentSessionTitleComponent {
        private final CurrentSessionTitleComponentImpl currentSessionTitleComponentImpl;
        private a<CurrentSessionTitleMapper> currentSessionTitleMapperProvider;
        private a<SessionListTitleViewFactory> sessionListTitleViewFactoryProvider;

        /* synthetic */ CurrentSessionTitleComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.currentSessionTitleMapperProvider = d.b(CurrentSessionTitleMapper_Factory.create());
            this.sessionListTitleViewFactoryProvider = d.b(SessionListTitleViewFactory_Factory.create());
        }

        @Override // ru.ozon.app.android.session.sessionList.di.CurrentSessionTitleComponent
        public CurrentSessionTitleMapper getMapper() {
            return this.currentSessionTitleMapperProvider.get();
        }

        @Override // ru.ozon.app.android.session.sessionList.di.CurrentSessionTitleComponent
        public SessionListTitleViewFactory getViewFactory() {
            return this.sessionListTitleViewFactoryProvider.get();
        }

        private CurrentSessionTitleComponentImpl() {
            this.currentSessionTitleComponentImpl = this;
            initialize();
        }
    }

    public static CurrentSessionTitleComponent create() {
        return new Builder(0).build();
    }
}
