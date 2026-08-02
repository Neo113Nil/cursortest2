package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.title;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutTitleBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/title/TitleOrderShipmentViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TitleOrderShipmentViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TitleOrderShipmentViewHolder> {
    public static final TitleOrderShipmentViewMapper$holderProducer$1 INSTANCE = new TitleOrderShipmentViewMapper$holderProducer$1();

    TitleOrderShipmentViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TitleOrderShipmentViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ItemOrderShipmentLayoutTitleBinding bind = ItemOrderShipmentLayoutTitleBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new TitleOrderShipmentViewHolder(bind, ref);
    }
}
