package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import N9.b;
import Sc.s;
import Wc.a;
import h9.EnumC6876a;
import h9.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l1.C7848y;
import l1.InterfaceC7829k0;
import ru.ozon.app.android.barcodecache.drawable.BarcodeBitmapUtils;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Ll1/k0;", "<anonymous>", "(Lxe/M;)Ll1/k0;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.CommonBarcodeV2ViewModel$createBarcodeImageBitmap$3", f = "CommonBarcodeV2ViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CommonBarcodeV2ViewModel$createBarcodeImageBitmap$3 extends j implements Function2<M, d<? super InterfaceC7829k0>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ CommonBarcodeV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeV2ViewModel$createBarcodeImageBitmap$3(CommonBarcodeV2ViewModel commonBarcodeV2ViewModel, String str, d<? super CommonBarcodeV2ViewModel$createBarcodeImageBitmap$3> dVar) {
        super(2, dVar);
        this.this$0 = commonBarcodeV2ViewModel;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonBarcodeV2ViewModel$createBarcodeImageBitmap$3(this.this$0, this.$code, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b bVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        bVar = this.this$0.barcodeEncoder;
        String str = this.$code;
        EnumC6876a enumC6876a = EnumC6876a.CODE_128;
        Map i11 = U.i(new Pair(g.MARGIN, new Integer(0)));
        bVar.getClass();
        C7848y c7848y = new C7848y(BarcodeBitmapUtils.INSTANCE.removeWhiteSpaces(b.a(str, enumC6876a, 320, 160, i11)));
        this.this$0.lastBarcode = new Pair(this.$code, c7848y);
        return c7848y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super InterfaceC7829k0> dVar) {
        return ((CommonBarcodeV2ViewModel$createBarcodeImageBitmap$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
