package ru.ozon.app.android.checkoutcomposer.discountcode.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.DiscountCodeDTO;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.DiscountCodeModelsKt;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.DiscountCodeVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class DiscountCodeViewMapper$mapper$1 extends AbstractC7737t implements Function2<DiscountCodeDTO, d, List<? extends DiscountCodeVO>> {
    public static final DiscountCodeViewMapper$mapper$1 INSTANCE = new DiscountCodeViewMapper$mapper$1();

    DiscountCodeViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<DiscountCodeVO> invoke(DiscountCodeDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(DiscountCodeModelsKt.toVO(dto, info.d()));
    }
}
