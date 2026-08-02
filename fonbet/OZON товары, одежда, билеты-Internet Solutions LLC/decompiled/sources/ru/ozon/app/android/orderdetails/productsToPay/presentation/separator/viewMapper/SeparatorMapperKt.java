package ru.ozon.app.android.orderdetails.productsToPay.presentation.separator.viewMapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.productsToPay.data.SeparatorDTO;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.separator.viewItem.SeparatorVO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/SeparatorDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/separator/viewItem/SeparatorVO;", "toVO", "(Lru/ozon/app/android/orderdetails/productsToPay/data/SeparatorDTO;Ll20/d;)Lru/ozon/app/android/orderdetails/productsToPay/presentation/separator/viewItem/SeparatorVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SeparatorMapperKt {
    @NotNull
    public static final SeparatorVO toVO(@NotNull SeparatorDTO separatorDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(separatorDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return new SeparatorVO(widgetInfo.d().hashCode(), separatorDTO.getPaddingStart());
    }
}
