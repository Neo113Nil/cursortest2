package ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SingleReviewHeaderInfoView$special$$inlined$lazyView$1 extends AbstractC7737t implements Function0<RatingView> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewHeaderInfoView$special$$inlined$lazyView$1(ViewGroup viewGroup, Context context) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RatingView invoke() {
        RatingView ratingView = new RatingView(this.$context$inlined, null, 0, 0, 14, null);
        ratingView.setId(R$id.ratingView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(Dimens.INSTANCE.getDP_8());
        ratingView.setLayoutParams(layoutParams);
        ratingView.setRatingSize(RatingDTO.RatingSize.SIZE_300);
        ratingView.setSeparateClickable(false);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(ratingView);
        }
        return ratingView;
    }
}
