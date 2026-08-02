package ru.ozon.app.android.regulardraw.ui.tooltip;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadge;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TooltipView$rightCurrencyBadge$2 extends AbstractC7737t implements Function0<MorkovskCurrencyBadge> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipView$rightCurrencyBadge$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MorkovskCurrencyBadge invoke() {
        MorkovskCurrencyBadge morkovskCurrencyBadge = new MorkovskCurrencyBadge(this.$context, null, 0, 0, 14, null);
        morkovskCurrencyBadge.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMarginStart(Dimens.INSTANCE.getDP_5());
        morkovskCurrencyBadge.setLayoutParams(layoutParams);
        return morkovskCurrencyBadge;
    }
}
