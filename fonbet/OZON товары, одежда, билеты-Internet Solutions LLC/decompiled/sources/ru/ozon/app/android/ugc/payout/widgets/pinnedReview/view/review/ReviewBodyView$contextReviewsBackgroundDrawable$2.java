package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewBodyView$contextReviewsBackgroundDrawable$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewBodyView$contextReviewsBackgroundDrawable$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        return ContextExtKt.createRoundRectShape$default(this.$context, Dimens.INSTANCE.getDPF_16(), CornersConfig.ALL, R$color.bg_secondary, 0, null, 24, null);
    }
}
