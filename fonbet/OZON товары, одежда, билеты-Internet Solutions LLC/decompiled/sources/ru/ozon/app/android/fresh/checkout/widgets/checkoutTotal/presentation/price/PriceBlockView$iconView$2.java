package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.price;

import Kk.C3531a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PriceBlockView$iconView$2 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PriceBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceBlockView$iconView$2(Context context, PriceBlockView priceBlockView) {
        super(0);
        this.$context = context;
        this.this$0 = priceBlockView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        IconView iconView = new IconView(this.$context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.priceBlockIcon, -2, -2);
        int i11 = R$id.priceBlockTitle;
        a11.f41636i = i11;
        a11.f41642l = i11;
        a11.f41630f = i11;
        iconView.setLayoutParams(a11);
        this.this$0.addView(iconView);
        return iconView;
    }
}
