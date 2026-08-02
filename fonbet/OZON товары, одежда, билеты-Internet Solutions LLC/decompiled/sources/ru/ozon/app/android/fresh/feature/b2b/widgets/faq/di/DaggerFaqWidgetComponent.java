package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di;

import Jb.j;
import WZ.l;
import android.content.Context;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di.FaqWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqViewModel;

/* loaded from: classes12.dex */
public final class DaggerFaqWidgetComponent {

    private static final class Factory implements FaqWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di.FaqWidgetComponent.Factory
        public FaqWidgetComponent create(ContextComponentDependencies contextComponentDependencies, RetainComposerComponentApi retainComposerComponentApi) {
            contextComponentDependencies.getClass();
            retainComposerComponentApi.getClass();
            return new FaqWidgetComponentImpl(contextComponentDependencies, retainComposerComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class FaqWidgetComponentImpl implements FaqWidgetComponent {
        private final ContextComponentDependencies contextComponentDependencies;
        private final FaqWidgetComponentImpl faqWidgetComponentImpl;
        private final RetainComposerComponentApi retainComposerComponentApi;

        /* synthetic */ FaqWidgetComponentImpl(ContextComponentDependencies contextComponentDependencies, RetainComposerComponentApi retainComposerComponentApi, int i11) {
            this(contextComponentDependencies, retainComposerComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di.FaqWidgetComponent
        public FaqMapper getMapper() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new FaqMapper(context);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di.FaqWidgetComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di.FaqWidgetComponent
        public FaqViewModel getViewModel() {
            return new FaqViewModel();
        }

        private FaqWidgetComponentImpl(ContextComponentDependencies contextComponentDependencies, RetainComposerComponentApi retainComposerComponentApi) {
            this.faqWidgetComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.retainComposerComponentApi = retainComposerComponentApi;
        }
    }

    public static FaqWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
