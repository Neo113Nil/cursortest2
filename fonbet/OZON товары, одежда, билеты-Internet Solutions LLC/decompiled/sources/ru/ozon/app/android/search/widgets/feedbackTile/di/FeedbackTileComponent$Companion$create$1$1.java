package ru.ozon.app.android.search.widgets.feedbackTile.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackSharedViewModel;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/ozon/app/android/search/widgets/feedbackTile/di/FeedbackTileComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/feedbackTile/di/FeedbackTileComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "sharedViewModel$delegate", "LSc/j;", "getSharedViewModel", "()Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackSharedViewModel;", "sharedViewModel", "Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "analyticDelegate$delegate", "getAnalyticDelegate", "()Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "analyticDelegate", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackTileComponent$Companion$create$1$1 implements FeedbackTileComponent {
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: sharedViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sharedViewModel = k.b(FeedbackTileComponent$Companion$create$1$1$sharedViewModel$2.INSTANCE);

    /* renamed from: analyticDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j analyticDelegate = k.b(new FeedbackTileComponent$Companion$create$1$1$analyticDelegate$2(this));

    FeedbackTileComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackTile.di.FeedbackTileComponent
    public FeedbackAnalyticDelegate getAnalyticDelegate() {
        return (FeedbackAnalyticDelegate) this.analyticDelegate.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackTile.di.FeedbackTileComponent
    public FeedbackSharedViewModel getSharedViewModel() {
        return (FeedbackSharedViewModel) this.sharedViewModel.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.feedbackTile.di.FeedbackTileComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
