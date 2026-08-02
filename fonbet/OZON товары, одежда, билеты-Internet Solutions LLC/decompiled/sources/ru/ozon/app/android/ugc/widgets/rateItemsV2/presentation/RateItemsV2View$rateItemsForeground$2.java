package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import B3.D;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.DrawableExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2View$rateItemsForeground$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    public static final RateItemsV2View$rateItemsForeground$2 INSTANCE = new RateItemsV2View$rateItemsForeground$2();

    RateItemsV2View$rateItemsForeground$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        GradientDrawable b11 = D.b(0);
        Dimens dimens = Dimens.INSTANCE;
        b11.setCornerRadii(DrawableExtKt.createCornerRadii(dimens.getDPF_24(), dimens.getDPF_24(), dimens.getDPF_24(), dimens.getDPF_24()));
        return b11;
    }
}
