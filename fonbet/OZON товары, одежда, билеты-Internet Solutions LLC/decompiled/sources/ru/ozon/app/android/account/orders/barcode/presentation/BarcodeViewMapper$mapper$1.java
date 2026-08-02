package ru.ozon.app.android.account.orders.barcode.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.account.orders.barcode.data.BarcodeDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/account/orders/barcode/presentation/BarcodeVO;", "invoke", "(Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class BarcodeViewMapper$mapper$1 extends AbstractC7737t implements Function2<BarcodeDTO, d, List<? extends BarcodeVO>> {
    final /* synthetic */ BarcodeViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewMapper$mapper$1(BarcodeViewMapper barcodeViewMapper) {
        super(2);
        this.this$0 = barcodeViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<BarcodeVO> invoke(BarcodeDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.this$0.component().getMapper().invoke(dto, info);
    }
}
