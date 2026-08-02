package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewMapper;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di.PinnedReviewComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewViewModelImpl;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/ugc/payout/widgets/pinnedReview/di/PinnedReviewComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/di/PinnedReviewComponent;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "LSc/j;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/core/PinnedReviewMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModelImpl;", "viewModel", "LPc/a;", "getViewModel", "()LPc/a;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewComponent$Companion$create$1$1 implements PinnedReviewComponent {
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(PinnedReviewComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(PinnedReviewComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<PinnedReviewViewModelImpl> viewModel;

    PinnedReviewComponent$Companion$create$1$1(final ActionComponentApi actionComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
        this.$retainComposerApi = retainComposerComponentApi;
        this.viewModel = new a() { // from class: MV.a
            @Override // Pc.a
            public final Object get() {
                PinnedReviewViewModelImpl viewModel$lambda$0;
                viewModel$lambda$0 = PinnedReviewComponent$Companion$create$1$1.viewModel$lambda$0(ActionComponentApi.this);
                return viewModel$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PinnedReviewViewModelImpl viewModel$lambda$0(ActionComponentApi actionComponentApi) {
        return new PinnedReviewViewModelImpl(actionComponentApi.getActionRepository());
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di.PinnedReviewComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di.PinnedReviewComponent
    public PinnedReviewMapper getMapper() {
        return (PinnedReviewMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di.PinnedReviewComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di.PinnedReviewComponent
    public a<PinnedReviewViewModelImpl> getViewModel() {
        return this.viewModel;
    }
}
