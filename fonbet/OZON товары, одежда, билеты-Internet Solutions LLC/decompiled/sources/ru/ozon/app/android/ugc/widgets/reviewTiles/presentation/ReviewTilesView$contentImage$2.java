package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import android.content.Context;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.image.Image;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/image/Image;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewTilesView$contentImage$2 extends AbstractC7737t implements Function0<Image> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewTilesView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTilesView$contentImage$2(Context context, ReviewTilesView reviewTilesView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewTilesView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Image invoke() {
        Image image = new Image(this.$context, null, 0, 6, null);
        image.setId(R$id.reviewTilesImage);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        image.setLayoutParams(bVar);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setZ(1.0f);
        this.this$0.addView(image);
        return image;
    }
}
