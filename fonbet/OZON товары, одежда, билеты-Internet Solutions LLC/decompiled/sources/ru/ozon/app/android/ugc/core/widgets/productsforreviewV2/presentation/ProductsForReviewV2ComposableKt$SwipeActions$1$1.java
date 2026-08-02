package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import B1.B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LB1/B;", "layoutCoordinates", "", "invoke", "(LB1/B;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$SwipeActions$1$1 extends AbstractC7737t implements Function1<B, Unit> {
    final /* synthetic */ Function1<Float, Unit> $onWidthChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsForReviewV2ComposableKt$SwipeActions$1$1(Function1<? super Float, Unit> function1) {
        super(1);
        this.$onWidthChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(B b11) {
        invoke2(b11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(B layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        this.$onWidthChanged.invoke(Float.valueOf((int) (layoutCoordinates.a() >> 32)));
    }
}
