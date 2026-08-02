package ru.ozon.app.android.storefront.widgets.rateApp.presentation;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.databinding.WidgetNewRateAppBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/databinding/WidgetNewRateAppBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateAppViewHolder$binding$2 extends AbstractC7737t implements Function0<WidgetNewRateAppBinding> {
    final /* synthetic */ RateAppViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateAppViewHolder$binding$2(RateAppViewHolder rateAppViewHolder) {
        super(0);
        this.this$0 = rateAppViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WidgetNewRateAppBinding invoke() {
        LinearLayout view;
        view = this.this$0.getView();
        WidgetNewRateAppBinding bind = WidgetNewRateAppBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return bind;
    }
}
