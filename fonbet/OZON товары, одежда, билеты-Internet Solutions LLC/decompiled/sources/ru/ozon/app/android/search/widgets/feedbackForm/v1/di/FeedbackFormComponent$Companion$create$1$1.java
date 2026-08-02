package ru.ozon.app.android.search.widgets.feedbackForm.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.FeedbackFormViewModel;

@Metadata(d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010 \u001a\u00060\u001bj\u0002`\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"ru/ozon/app/android/search/widgets/feedbackForm/v1/di/FeedbackFormComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/di/FeedbackFormComponent;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;", "viewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "sharedViewModel$delegate", "getSharedViewModel", "()Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "sharedViewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "analyticDelegate$delegate", "getAnalyticDelegate", "()Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "analyticDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackFormComponent$Companion$create$1$1 implements FeedbackFormComponent {
    private final ComposerComponentApi composerComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(FeedbackFormComponent$Companion$create$1$1$viewModel$2.INSTANCE);

    /* renamed from: sharedViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sharedViewModel = k.b(FeedbackFormComponent$Companion$create$1$1$sharedViewModel$2.INSTANCE);

    /* renamed from: analyticDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j analyticDelegate = k.b(new FeedbackFormComponent$Companion$create$1$1$analyticDelegate$2(this));

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new FeedbackFormComponent$Companion$create$1$1$tokenizedAnalytics$2(this));

    FeedbackFormComponent$Companion$create$1$1(C7475g c7475g) {
        this.composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v1.di.FeedbackFormComponent
    public FeedbackAnalyticDelegate getAnalyticDelegate() {
        return (FeedbackAnalyticDelegate) this.analyticDelegate.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v1.di.FeedbackFormComponent
    public ComposerNavigator getNavigator() {
        return this.composerComponentApi.getComposerNavigator();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v1.di.FeedbackFormComponent
    public FeedbackSharedViewModel getSharedViewModel() {
        return (FeedbackSharedViewModel) this.sharedViewModel.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v1.di.FeedbackFormComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v1.di.FeedbackFormComponent
    public FeedbackFormViewModel getViewModel() {
        return (FeedbackFormViewModel) this.viewModel.getValue();
    }
}
