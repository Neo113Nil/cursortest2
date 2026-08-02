package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class SkuThinScrollItemViewHolder$onAttach$1$onCreate$2 extends C7719a implements Function2<SkuThinScrollVO.ItemVO, d<? super Unit>, Object> {
    SkuThinScrollItemViewHolder$onAttach$1$onCreate$2(Object obj) {
        super(2, obj, SkuThinScrollItemViewHolder.class, "bindIcon", "bindIcon(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkuThinScrollVO.ItemVO itemVO, d<? super Unit> dVar) {
        Object onCreate$bindIcon;
        onCreate$bindIcon = SkuThinScrollItemViewHolder$onAttach$1.onCreate$bindIcon((SkuThinScrollItemViewHolder) this.receiver, itemVO, dVar);
        return onCreate$bindIcon;
    }
}
