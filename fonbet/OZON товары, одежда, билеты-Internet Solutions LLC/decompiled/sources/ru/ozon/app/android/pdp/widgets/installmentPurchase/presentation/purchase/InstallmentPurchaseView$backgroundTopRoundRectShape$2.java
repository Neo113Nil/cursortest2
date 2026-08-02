package ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InstallmentPurchaseView$backgroundTopRoundRectShape$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPurchaseView$backgroundTopRoundRectShape$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        return ContextExtKt.createRoundRectShape$default(this.$context, Dimens.INSTANCE.getDPF_16(), CornersConfig.TOP, 0, 0, null, 28, null);
    }
}
