package ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.TopAuthorDrawableCellViewBinder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/TopAuthorDrawableCellViewBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SingleReviewSocialHeaderDecorator$topAuthorDrawableBinder$2 extends AbstractC7737t implements Function0<TopAuthorDrawableCellViewBinder> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewSocialHeaderDecorator$topAuthorDrawableBinder$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TopAuthorDrawableCellViewBinder invoke() {
        return new TopAuthorDrawableCellViewBinder(this.$context);
    }
}
