package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.uni.android.controls.button.UncontainedIconLabelButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFooterView$additionalButton$2 extends AbstractC7737t implements Function0<UncontainedIconLabelButtonView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFooterView$additionalButton$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UncontainedIconLabelButtonView invoke() {
        UncontainedIconLabelButtonView uncontainedIconLabelButtonView = new UncontainedIconLabelButtonView(this.$context, null, 0, 0, 14, null);
        uncontainedIconLabelButtonView.setId(R$id.reviewFooterAdditionalButton);
        uncontainedIconLabelButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return uncontainedIconLabelButtonView;
    }
}
