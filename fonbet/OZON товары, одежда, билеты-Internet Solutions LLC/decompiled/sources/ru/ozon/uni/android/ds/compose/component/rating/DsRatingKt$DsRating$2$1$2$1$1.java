package ru.ozon.uni.android.ds.compose.component.rating;

import S0.InterfaceC3970l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsRatingKt$DsRating$2$1$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ int $iconIndex;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function1<Float, Unit> $onSelected;
    final /* synthetic */ InterfaceC3970l0 $selectedIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsRatingKt$DsRating$2$1$2$1$1(int i11, Function1<? super Float, Unit> function1, Function0<Unit> function0, InterfaceC3970l0 interfaceC3970l0) {
        super(0);
        this.$iconIndex = i11;
        this.$onSelected = function1;
        this.$onClick = function0;
        this.$selectedIndex$delegate = interfaceC3970l0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        float floatValue;
        this.$selectedIndex$delegate.h(this.$iconIndex);
        Function1<Float, Unit> function1 = this.$onSelected;
        if (function1 != null) {
            floatValue = this.$selectedIndex$delegate.getFloatValue();
            function1.invoke(Float.valueOf(floatValue));
        }
        Function0<Unit> function0 = this.$onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
