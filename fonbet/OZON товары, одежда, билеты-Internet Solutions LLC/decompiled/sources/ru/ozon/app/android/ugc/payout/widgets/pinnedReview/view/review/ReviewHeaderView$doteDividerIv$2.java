package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.R$drawable;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/appcompat/widget/AppCompatImageView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewHeaderView$doteDividerIv$2 extends AbstractC7737t implements Function0<AppCompatImageView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewHeaderView$doteDividerIv$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppCompatImageView invoke() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(this.$context);
        appCompatImageView.setId(R$id.reviewDoteDividerView);
        Dimens dimens = Dimens.INSTANCE;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(dimens.getDP_4(), dimens.getDP_4()));
        appCompatImageView.setImageResource(R$drawable.ic_dot);
        return appCompatImageView;
    }
}
