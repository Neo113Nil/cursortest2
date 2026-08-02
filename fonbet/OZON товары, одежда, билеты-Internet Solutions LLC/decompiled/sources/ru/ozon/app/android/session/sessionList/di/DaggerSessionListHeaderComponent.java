package ru.ozon.app.android.session.sessionList.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.session.sessionList.mapper.SessionListHeaderMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListHeaderMapper_Factory;

/* loaded from: classes2.dex */
public final class DaggerSessionListHeaderComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public SessionListHeaderComponent build() {
            return new SessionListHeaderComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class SessionListHeaderComponentImpl implements SessionListHeaderComponent {
        private final SessionListHeaderComponentImpl sessionListHeaderComponentImpl;
        private a<SessionListHeaderMapper> sessionListHeaderMapperProvider;

        /* synthetic */ SessionListHeaderComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.sessionListHeaderMapperProvider = d.b(SessionListHeaderMapper_Factory.create());
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListHeaderComponent
        public SessionListHeaderMapper getMapper() {
            return this.sessionListHeaderMapperProvider.get();
        }

        private SessionListHeaderComponentImpl() {
            this.sessionListHeaderComponentImpl = this;
            initialize();
        }
    }

    public static SessionListHeaderComponent create() {
        return new Builder(0).build();
    }
}
