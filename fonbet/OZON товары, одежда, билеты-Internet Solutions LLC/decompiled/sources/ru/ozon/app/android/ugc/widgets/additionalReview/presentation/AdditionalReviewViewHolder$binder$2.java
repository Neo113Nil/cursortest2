package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.ugc.databinding.WidgetAdditionalReviewBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AdditionalReviewViewHolder$binder$2 extends AbstractC7737t implements Function0<AdditionalReviewBinder> {
    final /* synthetic */ AdditionalReviewViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReviewViewHolder$binder$2(AdditionalReviewViewHolder additionalReviewViewHolder) {
        super(0);
        this.this$0 = additionalReviewViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdditionalReviewBinder invoke() {
        WidgetAdditionalReviewBinding widgetAdditionalReviewBinding;
        Function1 actionHandler;
        l lVar;
        FeatureChecker featureChecker;
        widgetAdditionalReviewBinding = this.this$0.binding;
        actionHandler = this.this$0.getActionHandler();
        lVar = this.this$0.tokenizedAnalytics;
        featureChecker = this.this$0.featureChecker;
        return new AdditionalReviewBinder(widgetAdditionalReviewBinding, actionHandler, lVar, featureChecker);
    }
}
