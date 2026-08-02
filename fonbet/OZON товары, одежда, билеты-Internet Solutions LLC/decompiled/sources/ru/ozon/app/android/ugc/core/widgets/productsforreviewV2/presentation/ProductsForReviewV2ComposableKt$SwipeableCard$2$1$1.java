package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import S0.InterfaceC3970l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import m0.C7980b;
import m0.C8008p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/i0;", "", "invoke", "(Ll1/i0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$SwipeableCard$2$1$1 extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {
    final /* synthetic */ InterfaceC3970l0 $actionsWidthPx$delegate;
    final /* synthetic */ C7980b<Float, C8008p> $offsetX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewV2ComposableKt$SwipeableCard$2$1$1(C7980b<Float, C8008p> c7980b, InterfaceC3970l0 interfaceC3970l0) {
        super(1);
        this.$offsetX = c7980b;
        this.$actionsWidthPx$delegate = interfaceC3970l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        invoke2(interfaceC7825i0);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC7825i0 graphicsLayer) {
        float floatValue;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        float floatValue2 = this.$offsetX.k().floatValue();
        floatValue = this.$actionsWidthPx$delegate.getFloatValue();
        graphicsLayer.n(floatValue + floatValue2);
    }
}
