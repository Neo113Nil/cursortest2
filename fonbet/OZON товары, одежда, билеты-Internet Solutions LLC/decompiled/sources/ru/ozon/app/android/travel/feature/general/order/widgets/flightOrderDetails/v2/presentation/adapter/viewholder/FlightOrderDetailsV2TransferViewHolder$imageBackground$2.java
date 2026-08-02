package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCounterView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlightOrderDetailsV2TransferViewHolder$imageBackground$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ FlightOrderDetailsV2TransferViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightOrderDetailsV2TransferViewHolder$imageBackground$2(FlightOrderDetailsV2TransferViewHolder flightOrderDetailsV2TransferViewHolder) {
        super(0);
        this.this$0 = flightOrderDetailsV2TransferViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        CellWithSubtitle24IconCounterView cellWithSubtitle24IconCounterView;
        cellWithSubtitle24IconCounterView = this.this$0.view;
        Context context = cellWithSubtitle24IconCounterView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new RoundedBackgroundProducer().produce(0, ResourceExtKt.toPxF(16, context));
    }
}
