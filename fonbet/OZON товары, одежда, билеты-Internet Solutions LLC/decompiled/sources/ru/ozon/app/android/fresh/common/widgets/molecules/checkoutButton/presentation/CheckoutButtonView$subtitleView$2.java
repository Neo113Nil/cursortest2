package ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation;

import Bi.b;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckoutButtonView$subtitleView$2 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CheckoutButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutButtonView$subtitleView$2(Context context, CheckoutButtonView checkoutButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = checkoutButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.checkoutButtonSubtitle, -2, -2);
        d11.f41598E = 0.0f;
        int i11 = R$id.checkoutButtonTitle;
        d11.f41638j = i11;
        d11.f41628e = i11;
        d11.f41642l = 0;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setClickable(false);
        textAtomV2View.setFocusable(false);
        this.this$0.addView(textAtomV2View);
        return textAtomV2View;
    }
}
