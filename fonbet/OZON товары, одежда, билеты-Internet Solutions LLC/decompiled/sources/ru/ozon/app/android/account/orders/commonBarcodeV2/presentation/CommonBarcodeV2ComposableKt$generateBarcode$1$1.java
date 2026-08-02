package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l1.InterfaceC7829k0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ComposableKt$generateBarcode$1$1", f = "CommonBarcodeV2Composable.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CommonBarcodeV2ComposableKt$generateBarcode$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ InterfaceC3978p0<InterfaceC7829k0> $state;
    final /* synthetic */ CommonBarcodeV2ViewModel $this_generateBarcode;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeV2ComposableKt$generateBarcode$1$1(InterfaceC3978p0<InterfaceC7829k0> interfaceC3978p0, CommonBarcodeV2ViewModel commonBarcodeV2ViewModel, String str, d<? super CommonBarcodeV2ComposableKt$generateBarcode$1$1> dVar) {
        super(2, dVar);
        this.$state = interfaceC3978p0;
        this.$this_generateBarcode = commonBarcodeV2ViewModel;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonBarcodeV2ComposableKt$generateBarcode$1$1(this.$state, this.$this_generateBarcode, this.$code, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3978p0 interfaceC3978p0;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC3978p0<InterfaceC7829k0> interfaceC3978p02 = this.$state;
            CommonBarcodeV2ViewModel commonBarcodeV2ViewModel = this.$this_generateBarcode;
            String str = this.$code;
            this.L$0 = interfaceC3978p02;
            this.label = 1;
            Object createBarcodeImageBitmap = commonBarcodeV2ViewModel.createBarcodeImageBitmap(str, this);
            if (createBarcodeImageBitmap == aVar) {
                return aVar;
            }
            interfaceC3978p0 = interfaceC3978p02;
            obj = createBarcodeImageBitmap;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3978p0 = (InterfaceC3978p0) this.L$0;
            s.b(obj);
        }
        interfaceC3978p0.setValue(obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommonBarcodeV2ComposableKt$generateBarcode$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
