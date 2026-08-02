package ru.ozon.app.android.account.orders.orderlist.v2.data.mapper;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.OrderDTO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.ProgressiveDiscountVO;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountItemVO;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountViewKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0002¨\u0006\n"}, d2 = {"toVO", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProgressiveDiscountVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/OrderDTO$ProgressiveDiscount;", "context", "Landroid/content/Context;", "mapItems", "", "Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountItemVO;", "mapPrice", "Lru/ozon/uni/atoms/data/price/Price;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressiveDiscountsKt {
    private static final List<ProgressiveDiscountItemVO> mapItems(OrderDTO.ProgressiveDiscount progressiveDiscount, Context context) {
        GradientDrawable gradientDrawable;
        OrderDTO.ProgressiveDiscount.Scale scale = progressiveDiscount.getScale();
        if (scale == null) {
            return null;
        }
        List<OrderDTO.ProgressiveDiscount.Item> items = scale.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            OrderDTO.ProgressiveDiscount.Item item = (OrderDTO.ProgressiveDiscount.Item) obj;
            OrderDTO.ProgressiveDiscount.Item.Index selectedItemIndex = scale.getSelectedItemIndex();
            boolean z11 = selectedItemIndex != null && selectedItemIndex.getIndex() == i11;
            String text = item.getText();
            if (z11) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(ProgressiveDiscountViewKt.getDp8());
                gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.bgAccentPrimary));
            } else {
                gradientDrawable = null;
            }
            arrayList.add(new ProgressiveDiscountItemVO(text, gradientDrawable, z11 ? R$style.TextStyle_Caption_Bold : R$style.TextStyle_Caption, z11 ? R$color.layer_floor_1 : R$color.text_secondary));
            i11 = i12;
        }
        return arrayList;
    }

    private static final Price mapPrice(OrderDTO.ProgressiveDiscount progressiveDiscount) {
        String discountPrice = progressiveDiscount.getDiscountPrice();
        return discountPrice != null ? new Price(null, null, OzonSpannableStringKt.toOzonSpannableString(discountPrice), null, null, OzonSpannableStringKt.toOzonSpannableString(progressiveDiscount.getOriginalPrice()), null, null, null, null, null, null, 4059, null) : new Price(null, null, OzonSpannableStringKt.toOzonSpannableString(progressiveDiscount.getOriginalPrice()), null, null, null, null, null, null, null, null, null, 4091, null);
    }

    @NotNull
    public static final ProgressiveDiscountVO toVO(@NotNull OrderDTO.ProgressiveDiscount progressiveDiscount, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(progressiveDiscount, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ProgressiveDiscountVO(mapPrice(progressiveDiscount), mapItems(progressiveDiscount, context));
    }
}
