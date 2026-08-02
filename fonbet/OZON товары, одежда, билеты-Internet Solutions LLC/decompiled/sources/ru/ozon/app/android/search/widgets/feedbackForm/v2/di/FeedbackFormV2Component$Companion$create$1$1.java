package ru.ozon.app.android.search.widgets.feedbackForm.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.FeedbackFormV2ViewModel;

@Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001e\u001a\u00060\u0019j\u0002`\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010$\u001a\u00060\u001fj\u0002` 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"ru/ozon/app/android/search/widgets/feedbackForm/v2/di/FeedbackFormV2Component$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/di/FeedbackFormV2Component;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "sharedViewModel$delegate", "LSc/j;", "getSharedViewModel", "()Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "sharedViewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "analyticDelegate$delegate", "getAnalyticDelegate", "()Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "analyticDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackFormV2Component$Companion$create$1$1 implements FeedbackFormV2Component {
    private final ComposerComponentApi composerComponentApi;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: sharedViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sharedViewModel = k.b(FeedbackFormV2Component$Companion$create$1$1$sharedViewModel$2.INSTANCE);

    /* renamed from: analyticDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j analyticDelegate = k.b(new FeedbackFormV2Component$Companion$create$1$1$analyticDelegate$2(this));

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new FeedbackFormV2Component$Companion$create$1$1$tokenizedAnalytics$2(this));

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory = k.b(new FeedbackFormV2Component$Companion$create$1$1$customActionHandlersStoreFactory$2(this));

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(FeedbackFormV2Component$Companion$create$1$1$viewModel$2.INSTANCE);

    FeedbackFormV2Component$Companion$create$1$1(C7475g c7475g) {
        this.composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component
    public FeedbackAnalyticDelegate getAnalyticDelegate() {
        return (FeedbackAnalyticDelegate) this.analyticDelegate.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component
    public ComposerNavigator getNavigator() {
        return this.composerComponentApi.getComposerNavigator();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component
    public FeedbackSharedViewModel getSharedViewModel() {
        return (FeedbackSharedViewModel) this.sharedViewModel.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component
    public FeedbackFormV2ViewModel getViewModel() {
        return (FeedbackFormV2ViewModel) this.viewModel.getValue();
    }
}
