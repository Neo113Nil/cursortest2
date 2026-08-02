package ru.ozon.app.android.session.sessionList.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.session.sessionList.mapper.SessionListAnnotationMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListAnnotationMapper_Factory;

/* loaded from: classes2.dex */
public final class DaggerSessionListAnnotationComponent {

    public static final class Builder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public SessionListAnnotationComponent build() {
            return new SessionListAnnotationComponentImpl(0);
        }

        private Builder() {
        }
    }

    private static final class SessionListAnnotationComponentImpl implements SessionListAnnotationComponent {
        private final SessionListAnnotationComponentImpl sessionListAnnotationComponentImpl;
        private a<SessionListAnnotationMapper> sessionListAnnotationMapperProvider;

        /* synthetic */ SessionListAnnotationComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            this.sessionListAnnotationMapperProvider = d.b(SessionListAnnotationMapper_Factory.create());
        }

        @Override // ru.ozon.app.android.session.sessionList.di.SessionListAnnotationComponent
        public SessionListAnnotationMapper getMapper() {
            return this.sessionListAnnotationMapperProvider.get();
        }

        private SessionListAnnotationComponentImpl() {
            this.sessionListAnnotationComponentImpl = this;
            initialize();
        }
    }

    public static SessionListAnnotationComponent create() {
        return new Builder(0).build();
    }
}
