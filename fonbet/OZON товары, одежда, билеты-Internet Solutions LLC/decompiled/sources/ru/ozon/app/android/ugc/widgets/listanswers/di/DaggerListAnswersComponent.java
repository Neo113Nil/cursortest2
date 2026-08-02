package ru.ozon.app.android.ugc.widgets.listanswers.di;

import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.ugc.widgets.listanswers.core.answer.AnswerMapper;
import ru.ozon.app.android.ugc.widgets.listanswers.core.answer.ListAnswersMapper;
import ru.ozon.app.android.ugc.widgets.listanswers.di.ListAnswersComponent;

/* loaded from: classes2.dex */
public final class DaggerListAnswersComponent {

    private static final class Factory implements ListAnswersComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ugc.widgets.listanswers.di.ListAnswersComponent.Factory
        public ListAnswersComponent create(ContextComponentDependencies contextComponentDependencies) {
            contextComponentDependencies.getClass();
            return new ListAnswersComponentImpl(contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class ListAnswersComponentImpl implements ListAnswersComponent {
        private final ListAnswersComponentImpl listAnswersComponentImpl;

        /* synthetic */ ListAnswersComponentImpl(ContextComponentDependencies contextComponentDependencies, int i11) {
            this(contextComponentDependencies);
        }

        @Override // ru.ozon.app.android.ugc.widgets.listanswers.di.ListAnswersComponent
        public ListAnswersMapper getListAnswersMapper() {
            return new ListAnswersMapper(new AnswerMapper());
        }

        private ListAnswersComponentImpl(ContextComponentDependencies contextComponentDependencies) {
            this.listAnswersComponentImpl = this;
        }
    }

    public static ListAnswersComponent.Factory factory() {
        return new Factory(0);
    }
}
