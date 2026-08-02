package ru.ozon.app.android.account.orders.barcodePopover.v1.presentation;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.barcodePopover.v1.viewObject.BarcodePopoverVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewHolder$setBarcode$1", f = "BarcodePopoverViewHolder.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BarcodePopoverViewHolder$setBarcode$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ BarcodePopoverVO $item;
    int label;
    final /* synthetic */ BarcodePopoverViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodePopoverViewHolder$setBarcode$1(BarcodePopoverViewHolder barcodePopoverViewHolder, BarcodePopoverVO barcodePopoverVO, d<? super BarcodePopoverViewHolder$setBarcode$1> dVar) {
        super(2, dVar);
        this.this$0 = barcodePopoverViewHolder;
        this.$item = barcodePopoverVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BarcodePopoverViewHolder$setBarcode$1(this.this$0, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BarcodePopoverViewModel barcodePopoverViewModel;
        BarcodePopoverWidgetView barcodePopoverWidgetView;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            barcodePopoverViewModel = this.this$0.viewModel;
            String code = this.$item.getCode();
            Context context = this.this$0.getContext();
            this.label = 1;
            obj = barcodePopoverViewModel.createBarcodeDrawable(code, context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        barcodePopoverWidgetView = this.this$0.barcodeView;
        barcodePopoverWidgetView.getBarcodeImageView().setImageDrawable((Drawable) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BarcodePopoverViewHolder$setBarcode$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
