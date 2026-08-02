package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.composable;

import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ProductsComposableKt$ProductImage$2$2$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $gradientColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsComposableKt$ProductImage$2$2$1(long j11) {
        super(1);
        this.$gradientColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        float f7;
        long j11;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        f7 = ProductsComposableKt.DP_40;
        float v12 = drawWithContent.v1(f7);
        AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
        j11 = C7807Z.f72258l;
        InterfaceC8412e.k0(drawWithContent, AbstractC7799Q.a.a(aVar, C7714v.b0(C7807Z.m(j11), C7807Z.m(this.$gradientColor)), C7464j.f(drawWithContent.i()) - v12, C7464j.f(drawWithContent.i()), 8), 0L, 0L, 0.0f, null, 0, 126);
    }
}
