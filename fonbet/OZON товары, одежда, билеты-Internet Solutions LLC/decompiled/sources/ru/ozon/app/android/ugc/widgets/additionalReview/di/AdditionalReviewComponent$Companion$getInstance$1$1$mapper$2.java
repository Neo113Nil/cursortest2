package ru.ozon.app.android.ugc.widgets.additionalReview.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.ugc.widgets.additionalReview.core.AdditionalReviewMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/additionalReview/core/AdditionalReviewMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AdditionalReviewComponent$Companion$getInstance$1$1$mapper$2 extends AbstractC7737t implements Function0<AdditionalReviewMapper> {
    final /* synthetic */ AdditionalReviewComponent$Companion$getInstance$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReviewComponent$Companion$getInstance$1$1$mapper$2(AdditionalReviewComponent$Companion$getInstance$1$1 additionalReviewComponent$Companion$getInstance$1$1) {
        super(0);
        this.this$0 = additionalReviewComponent$Companion$getInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdditionalReviewMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        return new AdditionalReviewMapper(contextComponentDependencies.getContext());
    }
}
