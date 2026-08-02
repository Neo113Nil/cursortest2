package ru.ozon.app.android.action.sheet.di;

import Jb.j;
import Pc.a;
import WZ.l;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.ActionSheetFragment;
import ru.ozon.app.android.action.sheet.ActionSheetFragment_MembersInjector;
import ru.ozon.app.android.action.sheet.ActionSheetViewModelImpl;
import ru.ozon.app.android.action.sheet.di.ActionSheetFragmentComponent;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.ComposerComponentApi;

/* loaded from: classes11.dex */
public final class DaggerActionSheetFragmentComponent {

    private static final class ActionSheetFragmentComponentImpl implements ActionSheetFragmentComponent {
        private final ActionComponentApi actionComponentApi;
        private final ActionSheetFragmentComponentImpl actionSheetFragmentComponentImpl;
        private a<ActionSheetViewModelImpl> actionSheetViewModelImplProvider;
        private final ComposerComponentApi composerComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ActionSheetFragmentComponentImpl actionSheetFragmentComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92137id;

            SwitchingProvider(ActionSheetFragmentComponentImpl actionSheetFragmentComponentImpl, int i11) {
                this.actionSheetFragmentComponentImpl = actionSheetFragmentComponentImpl;
                this.f92137id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92137id != 0) {
                    throw new AssertionError(this.f92137id);
                }
                ActionV2Repository actionRepository = this.actionSheetFragmentComponentImpl.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return (T) new ActionSheetViewModelImpl(actionRepository);
            }
        }

        /* synthetic */ ActionSheetFragmentComponentImpl(ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, int i11) {
            this(composerComponentApi, actionComponentApi);
        }

        private void initialize(ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi) {
            this.actionSheetViewModelImplProvider = new SwitchingProvider(this.actionSheetFragmentComponentImpl, 0);
        }

        private ActionSheetFragment injectActionSheetFragment(ActionSheetFragment actionSheetFragment) {
            l tokenizedAnalytics = this.composerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            ActionSheetFragment_MembersInjector.injectTokenizedAnalytics(actionSheetFragment, tokenizedAnalytics);
            ActionSheetEventHandler actionSheetEventHandler = this.actionComponentApi.getActionSheetEventHandler();
            j.c(actionSheetEventHandler);
            ActionSheetFragment_MembersInjector.injectHandler(actionSheetFragment, actionSheetEventHandler);
            ActionSheetFragment_MembersInjector.injectProvider(actionSheetFragment, this.actionSheetViewModelImplProvider);
            return actionSheetFragment;
        }

        @Override // ru.ozon.app.android.action.sheet.di.ActionSheetFragmentComponent
        public void inject(ActionSheetFragment actionSheetFragment) {
            injectActionSheetFragment(actionSheetFragment);
        }

        private ActionSheetFragmentComponentImpl(ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi) {
            this.actionSheetFragmentComponentImpl = this;
            this.composerComponentApi = composerComponentApi;
            this.actionComponentApi = actionComponentApi;
            initialize(composerComponentApi, actionComponentApi);
        }
    }

    private static final class Factory implements ActionSheetFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.action.sheet.di.ActionSheetFragmentComponent.Factory
        public ActionSheetFragmentComponent create(ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi) {
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            return new ActionSheetFragmentComponentImpl(composerComponentApi, actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static ActionSheetFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
