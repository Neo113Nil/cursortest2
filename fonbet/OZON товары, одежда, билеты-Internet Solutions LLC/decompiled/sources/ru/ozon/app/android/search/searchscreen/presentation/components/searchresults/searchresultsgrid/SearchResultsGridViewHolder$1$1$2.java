package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingDelegate;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "", "invoke", "(LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SearchResultsGridViewHolder$1$1$2 extends AbstractC7737t implements Function1<t, Unit> {
    final /* synthetic */ SearchResultsGridViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultsGridViewHolder$1$1$2(SearchResultsGridViewHolder searchResultsGridViewHolder) {
        super(1);
        this.this$0 = searchResultsGridViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar) {
        PinchToZoomOnboardingDelegate pinchToZoomOnboardingDelegate;
        ComposerReferences composerReferences;
        pinchToZoomOnboardingDelegate = this.this$0.pinchToZoomOnboardingDelegate;
        pinchToZoomOnboardingDelegate.onPinchToZoomUsed();
        if (tVar != null) {
            composerReferences = this.this$0.references;
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences.getTokenizedAnalytics(), tVar, null, 2, null);
        }
    }
}
