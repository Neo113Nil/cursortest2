package ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewHolder", f = "CommonBarcodeViewHolder.kt", l = {88}, m = "bindBarcode")
/* loaded from: classes11.dex */
final class CommonBarcodeViewHolder$bindBarcode$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonBarcodeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeViewHolder$bindBarcode$1(CommonBarcodeViewHolder commonBarcodeViewHolder, d<? super CommonBarcodeViewHolder$bindBarcode$1> dVar) {
        super(dVar);
        this.this$0 = commonBarcodeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object bindBarcode;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        bindBarcode = this.this$0.bindBarcode(null, this);
        return bindBarcode;
    }
}
