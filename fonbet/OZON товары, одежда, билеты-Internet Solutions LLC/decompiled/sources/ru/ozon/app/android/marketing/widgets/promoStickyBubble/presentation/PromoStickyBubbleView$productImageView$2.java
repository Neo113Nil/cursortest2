package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.image.Image;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/image/Image;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoStickyBubbleView$productImageView$2 extends AbstractC7737t implements Function0<Image> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PromoStickyBubbleView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleView$productImageView$2(Context context, PromoStickyBubbleView promoStickyBubbleView) {
        super(0);
        this.$context = context;
        this.this$0 = promoStickyBubbleView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Image invoke() {
        int i11;
        int i12;
        int i13;
        Image image = new Image(this.$context, null, 0, 6, null);
        PromoStickyBubbleView promoStickyBubbleView = this.this$0;
        image.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        i11 = promoStickyBubbleView.imageViewId;
        bVar.f41656t = i11;
        i12 = promoStickyBubbleView.imageViewId;
        bVar.f41658v = i12;
        bVar.f41636i = 0;
        i13 = promoStickyBubbleView.imageViewId;
        bVar.f41642l = i13;
        bVar.f41616W = true;
        image.setLayoutParams(bVar);
        return image;
    }
}
