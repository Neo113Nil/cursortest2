package ru.ozon.app.android.account.orders.orderProduct.presentation.item;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImagesAdapter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OrderProductItemViewHolder$onAttachViewModel$1 extends C7719a implements Function2<List<ImageVO>, d<? super Unit>, Object> {
    OrderProductItemViewHolder$onAttachViewModel$1(Object obj) {
        super(2, obj, ImagesAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<ImageVO> list, d<? super Unit> dVar) {
        Object onAttachViewModel$submitList;
        onAttachViewModel$submitList = OrderProductItemViewHolder.onAttachViewModel$submitList((ImagesAdapter) this.receiver, list, dVar);
        return onAttachViewModel$submitList;
    }
}
