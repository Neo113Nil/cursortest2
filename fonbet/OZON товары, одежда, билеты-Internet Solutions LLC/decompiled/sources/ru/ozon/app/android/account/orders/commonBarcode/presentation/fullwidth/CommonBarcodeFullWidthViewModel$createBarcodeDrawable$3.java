package ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth;

import N9.b;
import Sc.s;
import Wc.a;
import android.content.Context;
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
import ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewModel;
import ru.ozon.app.android.barcodecache.drawable.BarcodeBitmapUtils;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Landroidx/core/graphics/drawable/d;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lxe/M;)Landroidx/core/graphics/drawable/d;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3", f = "CommonBarcodeFullWidthViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3 extends j implements Function2<M, d<? super androidx.core.graphics.drawable.d>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ CommonBarcodeFullWidthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3(CommonBarcodeFullWidthViewModel commonBarcodeFullWidthViewModel, String str, Context context, d<? super CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3> dVar) {
        super(2, dVar);
        this.this$0 = commonBarcodeFullWidthViewModel;
        this.$code = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3(this.this$0, this.$code, this.$context, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CommonBarcodeFullWidthViewModel.Companion companion;
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
        androidx.core.graphics.drawable.d a11 = androidx.core.graphics.drawable.e.a(this.$context.getResources(), BarcodeBitmapUtils.INSTANCE.removeWhiteSpaces(b.a(str, enumC6876a, 320, 80, i11)));
        companion = CommonBarcodeFullWidthViewModel.Companion;
        a11.c(companion.getBARCODE_RADIUS());
        return a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super androidx.core.graphics.drawable.d> dVar) {
        return ((CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
