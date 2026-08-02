package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.image.Image;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/image/Image;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoStickyBubbleView$imageView$2 extends AbstractC7737t implements Function0<Image> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PromoStickyBubbleView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleView$imageView$2(Context context, PromoStickyBubbleView promoStickyBubbleView) {
        super(0);
        this.$context = context;
        this.this$0 = promoStickyBubbleView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Image invoke() {
        int i11;
        Image productImageView;
        int i12;
        PromoStickyBubbleView$outlineProvider$1 outlineProvider;
        Image image = new Image(this.$context, null, 0, 6, null);
        PromoStickyBubbleView promoStickyBubbleView = this.this$0;
        i11 = promoStickyBubbleView.imageViewId;
        image.setId(i11);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, C6915b.c(image.getWidth() * 1.2f));
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        productImageView = promoStickyBubbleView.getProductImageView();
        bVar.f41642l = productImageView.getId();
        i12 = PromoStickyBubbleView.rightImageViewMargin;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i12;
        outlineProvider = promoStickyBubbleView.outlineProvider();
        image.setOutlineProvider(outlineProvider);
        image.setClipToOutline(true);
        bVar.f41600G = "1:1.2";
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setLayoutParams(bVar);
        return image;
    }
}
