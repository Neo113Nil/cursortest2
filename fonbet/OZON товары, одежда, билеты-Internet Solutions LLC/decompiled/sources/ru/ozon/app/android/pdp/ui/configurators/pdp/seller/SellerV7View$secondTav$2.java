package ru.ozon.app.android.pdp.ui.configurators.pdp.seller;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7View$secondTav$2 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SellerV7View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7View$secondTav$2(Context context, SellerV7View sellerV7View) {
        super(0);
        this.$context = context;
        this.this$0 = sellerV7View;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        textAtomV2View.setId(R$id.sellerSecondTav);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(Dimens.INSTANCE.getDP_48(), -2));
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setElevation(1.0f);
        this.this$0.addView(textAtomV2View);
        return textAtomV2View;
    }
}
