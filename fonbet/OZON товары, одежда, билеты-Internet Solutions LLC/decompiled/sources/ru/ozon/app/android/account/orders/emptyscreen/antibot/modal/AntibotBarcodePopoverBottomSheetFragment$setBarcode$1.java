package ru.ozon.app.android.account.orders.emptyscreen.antibot.modal;

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
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewModel;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverWidgetView;
import ru.ozon.app.android.account.orders.barcodePopover.v1.viewObject.BarcodePopoverVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.emptyscreen.antibot.modal.AntibotBarcodePopoverBottomSheetFragment$setBarcode$1", f = "AntibotBarcodePopoverBottomSheetFragment.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AntibotBarcodePopoverBottomSheetFragment$setBarcode$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ BarcodePopoverVO $item;
    final /* synthetic */ BarcodePopoverWidgetView $view;
    int label;
    final /* synthetic */ AntibotBarcodePopoverBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AntibotBarcodePopoverBottomSheetFragment$setBarcode$1(AntibotBarcodePopoverBottomSheetFragment antibotBarcodePopoverBottomSheetFragment, BarcodePopoverVO barcodePopoverVO, BarcodePopoverWidgetView barcodePopoverWidgetView, d<? super AntibotBarcodePopoverBottomSheetFragment$setBarcode$1> dVar) {
        super(2, dVar);
        this.this$0 = antibotBarcodePopoverBottomSheetFragment;
        this.$item = barcodePopoverVO;
        this.$view = barcodePopoverWidgetView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AntibotBarcodePopoverBottomSheetFragment$setBarcode$1(this.this$0, this.$item, this.$view, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BarcodePopoverViewModel viewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            viewModel = this.this$0.getViewModel();
            String code = this.$item.getCode();
            Context context = this.$view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.label = 1;
            obj = viewModel.createBarcodeDrawable(code, context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.$view.getBarcodeImageView().setImageDrawable((Drawable) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AntibotBarcodePopoverBottomSheetFragment$setBarcode$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
