package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.text;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutTextBinding;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentItemDTO;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.ChunksMapperKt;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/text/TextOrderShipmentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TextVO;", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutTextBinding;", "binding", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutTextBinding;)V", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "toColoredText", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TextVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutTextBinding;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextOrderShipmentWidgetViewHolder extends k<OrderShipmentItemVO.TextVO> {

    @NotNull
    private final ItemOrderShipmentLayoutTextBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextOrderShipmentWidgetViewHolder(@NotNull ItemOrderShipmentLayoutTextBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        TextView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    private final OzonSpannableString toColoredText(OrderShipmentItemDTO.Line line) {
        return ChunksMapperKt.extractColoredSpannableText$default(line.getChunks(), getContext(), 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderShipmentItemVO.TextVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.textTv.setText(toColoredText(item.getChunks()));
    }
}
