package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewPreviewTitleRatingViewHolder$ratingIcon$2 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ ReviewPreviewTitleRatingViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPreviewTitleRatingViewHolder$ratingIcon$2(ReviewPreviewTitleRatingViewHolder reviewPreviewTitleRatingViewHolder) {
        super(0);
        this.this$0 = reviewPreviewTitleRatingViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        LinearLayout linearLayout;
        LinearLayout ratingRow;
        linearLayout = this.this$0.root;
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(Dimens.INSTANCE.getDP_2());
        iconView.setLayoutParams(layoutParams);
        ratingRow = this.this$0.getRatingRow();
        ratingRow.addView(iconView);
        return iconView;
    }
}
