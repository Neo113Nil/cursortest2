package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoStickyBubbleView$logoImage$2 extends AbstractC7737t implements Function0<ImageView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PromoStickyBubbleView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleView$logoImage$2(Context context, PromoStickyBubbleView promoStickyBubbleView) {
        super(0);
        this.$context = context;
        this.this$0 = promoStickyBubbleView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        int i11;
        int i12;
        int i13;
        int i14;
        ImageView imageView = new ImageView(this.$context);
        PromoStickyBubbleView promoStickyBubbleView = this.this$0;
        imageView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        i11 = promoStickyBubbleView.imageViewId;
        bVar.f41656t = i11;
        i12 = promoStickyBubbleView.imageViewId;
        bVar.f41658v = i12;
        i13 = PromoStickyBubbleView.horizontalLogoMargins;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i13;
        i14 = PromoStickyBubbleView.horizontalLogoMargins;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i14;
        bVar.f41616W = true;
        imageView.setLayoutParams(bVar);
        return imageView;
    }
}
