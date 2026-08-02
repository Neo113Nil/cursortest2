package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import WZ.l;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormButtonMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModelImpl;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes2.dex */
public final class DaggerReportAbuseFormComponent {

    private static final class Factory implements ReportAbuseFormComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent.Factory
        public ReportAbuseFormComponent create(NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi, ActionComponentApi actionComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            networkComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            retainComposerComponentApi.getClass();
            actionComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new ReportAbuseFormComponentImpl(networkComponentApi, customActionHandlersComponentApi, retainComposerComponentApi, actionComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class ReportAbuseFormComponentImpl implements ReportAbuseFormComponent {
        private final ActionComponentApi actionComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
        private a<HandlersInhibitor> handlersInhibitorProvider;
        private a<ReportAbuseFormButtonMapper> reportAbuseFormButtonMapperProvider;
        private final ReportAbuseFormComponentImpl reportAbuseFormComponentImpl;
        private a<ReportAbuseFormMapper> reportAbuseFormMapperProvider;
        private a<ReportAbuseFormViewModelImpl> reportAbuseFormViewModelImplProvider;
        private final RetainComposerComponentApi retainComposerComponentApi;
        private a<UgcCachedActionsSharedViewModel> ugcCachedActionsSharedViewModelProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94368id;
            private final ReportAbuseFormComponentImpl reportAbuseFormComponentImpl;

            SwitchingProvider(ReportAbuseFormComponentImpl reportAbuseFormComponentImpl, int i11) {
                this.reportAbuseFormComponentImpl = reportAbuseFormComponentImpl;
                this.f94368id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f94368id;
                if (i11 == 0) {
                    return (T) new HandlersInhibitor();
                }
                if (i11 == 1) {
                    return (T) new UgcCachedActionsSharedViewModel();
                }
                if (i11 == 2) {
                    return (T) new ReportAbuseFormMapper();
                }
                if (i11 == 3) {
                    return (T) new ReportAbuseFormButtonMapper();
                }
                if (i11 != 4) {
                    throw new AssertionError(this.f94368id);
                }
                ActionV2Repository actionRepository = this.reportAbuseFormComponentImpl.actionComponentApi.getActionRepository();
                j.c(actionRepository);
                return (T) new ReportAbuseFormViewModelImpl(actionRepository);
            }
        }

        /* synthetic */ ReportAbuseFormComponentImpl(NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi, ActionComponentApi actionComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(networkComponentApi, customActionHandlersComponentApi, retainComposerComponentApi, actionComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi, ActionComponentApi actionComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.handlersInhibitorProvider = m.a(new SwitchingProvider(this.reportAbuseFormComponentImpl, 0));
            this.ugcCachedActionsSharedViewModelProvider = new SwitchingProvider(this.reportAbuseFormComponentImpl, 1);
            this.reportAbuseFormMapperProvider = d.b(new SwitchingProvider(this.reportAbuseFormComponentImpl, 2));
            this.reportAbuseFormButtonMapperProvider = d.b(new SwitchingProvider(this.reportAbuseFormComponentImpl, 3));
            this.reportAbuseFormViewModelImplProvider = new SwitchingProvider(this.reportAbuseFormComponentImpl, 4);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public ReportAbuseFormButtonMapper buttonMapper() {
            return this.reportAbuseFormButtonMapperProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public AppType getAppType() {
            AppType appType = this.androidPlatformComponentDependencies.getAppType();
            j.c(appType);
            return appType;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public Vg.d getCustomActionHandlersStoreFactory() {
            Vg.d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public HandlersInhibitor getHandlersInhibitor() {
            return this.handlersInhibitorProvider.get();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public a<UgcCachedActionsSharedViewModel> getUgcCachedActionsSharedViewModel() {
            return this.ugcCachedActionsSharedViewModelProvider;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public a<ReportAbuseFormViewModelImpl> getViewModel() {
            return this.reportAbuseFormViewModelImplProvider;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent
        public ReportAbuseFormMapper mapper() {
            return this.reportAbuseFormMapperProvider.get();
        }

        private ReportAbuseFormComponentImpl(NetworkComponentApi networkComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi, ActionComponentApi actionComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.reportAbuseFormComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.retainComposerComponentApi = retainComposerComponentApi;
            initialize(networkComponentApi, customActionHandlersComponentApi, retainComposerComponentApi, actionComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static ReportAbuseFormComponent.Factory factory() {
        return new Factory(0);
    }
}
