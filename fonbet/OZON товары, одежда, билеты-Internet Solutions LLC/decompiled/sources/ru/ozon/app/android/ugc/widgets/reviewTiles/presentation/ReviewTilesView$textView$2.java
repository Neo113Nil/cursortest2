package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import Bi.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewTilesView$textView$2 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewTilesView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTilesView$textView$2(Context context, ReviewTilesView reviewTilesView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewTilesView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.reviewTilesText, 0, -2);
        d11.f41642l = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        d11.setMargins(dimens.getDP_8(), ((ViewGroup.MarginLayoutParams) d11).topMargin, dimens.getDP_8(), dimens.getDP_8());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setZ(1.0f);
        this.this$0.addView(textAtomV2View);
        return textAtomV2View;
    }
}
