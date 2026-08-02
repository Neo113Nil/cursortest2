package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewPreviewTitleRatingViewHolder$ratingRow$2 extends AbstractC7737t implements Function0<LinearLayout> {
    final /* synthetic */ ReviewPreviewTitleRatingViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPreviewTitleRatingViewHolder$ratingRow$2(ReviewPreviewTitleRatingViewHolder reviewPreviewTitleRatingViewHolder) {
        super(0);
        this.this$0 = reviewPreviewTitleRatingViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        linearLayout = this.this$0.root;
        LinearLayout linearLayout3 = new LinearLayout(linearLayout.getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2 = this.this$0.root;
        linearLayout2.addView(linearLayout3);
        return linearLayout3;
    }
}
