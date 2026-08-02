package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.utils.CharSequenceExtensionKt;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentItemDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"extractColoredSpannableText", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$TextChunk;", "context", "Landroid/content/Context;", "defaultColorRes", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChunksMapperKt {
    @NotNull
    public static final OzonSpannableString extractColoredSpannableText(@NotNull List<OrderShipmentItemDTO.TextChunk> list, @NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<OrderShipmentItemDTO.TextChunk> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (OrderShipmentItemDTO.TextChunk textChunk : list2) {
            arrayList.add(spannableStringBuilder.append(CharSequenceExtensionKt.setColor(textChunk.getText(), StyleParser.INSTANCE.parseColor(context, textChunk.getColor(), i11))));
        }
        return OzonSpannableStringKt.toOzonSpannableString(spannableStringBuilder);
    }

    public static /* synthetic */ OzonSpannableString extractColoredSpannableText$default(List list, Context context, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$color.text_primary;
        }
        return extractColoredSpannableText(list, context, i11);
    }
}
