package ru.ozon.app.android.orderdetails.trackshipment.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.trackshipment.data.ButtonModel;
import ru.ozon.app.android.orderdetails.trackshipment.data.OrderTrackShipmentDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/orderdetails/trackshipment/presentation/OrderTrackShipmentVO;", "Lru/ozon/app/android/orderdetails/trackshipment/data/OrderTrackShipmentDTO;", "context", "Landroid/content/Context;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackShipmentMapperKt {
    @NotNull
    public static final OrderTrackShipmentVO toVO(@NotNull OrderTrackShipmentDTO orderTrackShipmentDTO, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(orderTrackShipmentDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        long hashCode = orderTrackShipmentDTO.hashCode();
        String prefix = orderTrackShipmentDTO.getPrefix();
        String trackNumber = orderTrackShipmentDTO.getTrackNumber();
        String notificationText = orderTrackShipmentDTO.getNotificationText();
        ButtonModel button = orderTrackShipmentDTO.getButton();
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = button != null ? new ButtonV3Atom.SmallBorderlessButton(OzonSpannableStringKt.toOzonSpannableString(button.getTitle()), button.getAction(), null, null, null, button.getTrackingInfo(), false, 92, null) : null;
        String icon = orderTrackShipmentDTO.getIcon();
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, "textAction");
        return new OrderTrackShipmentVO(hashCode, prefix, trackNumber, notificationText, icon, smallBorderlessButton, parseColor != null ? parseColor.intValue() : ThemeExtKt.themeColorRes(context, R$attr.textAction));
    }
}
