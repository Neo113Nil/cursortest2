package ru.ozon.app.android.ugc.core.widgets.singlereview.di;

import Jb.j;
import WZ.l;
import android.content.Context;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data.ReviewsMediaMapper;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.di.SingleReviewComponent;
import ru.ozon.app.android.video.di.VideoComponentApi;

/* loaded from: classes2.dex */
public final class DaggerSingleReviewComponent {

    private static final class Factory implements SingleReviewComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.di.SingleReviewComponent.Factory
        public SingleReviewComponent create(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi, VideoComponentApi videoComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, ActionComponentApi actionComponentApi) {
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            retainComposerComponentApi.getClass();
            videoComponentApi.getClass();
            retainComposerPerformanceComponentApi.getClass();
            storageComponentApi.getClass();
            navigationComponentApi.getClass();
            customActionHandlersComponentApi.getClass();
            actionComponentApi.getClass();
            return new SingleReviewComponentImpl(contextComponentDependencies, networkComponentApi, retainComposerComponentApi, retainComposerPerformanceComponentApi, videoComponentApi, storageComponentApi, navigationComponentApi, customActionHandlersComponentApi, actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class SingleReviewComponentImpl implements SingleReviewComponent {
        private final ActionComponentApi actionComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private final NavigationComponentApi navigationComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private final RetainComposerComponentApi retainComposerComponentApi;
        private final SingleReviewComponentImpl singleReviewComponentImpl;
        private final StorageComponentApi storageComponentApi;
        private final VideoComponentApi videoComponentApi;

        /* synthetic */ SingleReviewComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, VideoComponentApi videoComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, ActionComponentApi actionComponentApi, int i11) {
            this(contextComponentDependencies, networkComponentApi, retainComposerComponentApi, retainComposerPerformanceComponentApi, videoComponentApi, storageComponentApi, navigationComponentApi, customActionHandlersComponentApi, actionComponentApi);
        }

        private ReviewsMediaMapper reviewsMediaMapper() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new ReviewsMediaMapper(context);
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.di.SingleReviewComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.di.SingleReviewComponent
        public SingleReviewMapper mapper() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new SingleReviewMapper(context, reviewsMediaMapper());
        }

        private SingleReviewComponentImpl(ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi, RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi, VideoComponentApi videoComponentApi, StorageComponentApi storageComponentApi, NavigationComponentApi navigationComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, ActionComponentApi actionComponentApi) {
            this.singleReviewComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.videoComponentApi = videoComponentApi;
            this.actionComponentApi = actionComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.navigationComponentApi = navigationComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.retainComposerComponentApi = retainComposerComponentApi;
        }
    }

    public static SingleReviewComponent.Factory factory() {
        return new Factory(0);
    }
}
