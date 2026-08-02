package ru.ozon.app.android.saleBadge.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8008p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/b;", "", "Lm0/p;", "", "invoke", "(Lm0/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$2$1 extends AbstractC7737t implements Function1<C7980b<Float, C8008p>, Unit> {
    final /* synthetic */ SaleBadgeViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaleBadgeWidgetKt$SaleBadgeContent$1$1$1$2$1(SaleBadgeViewModel saleBadgeViewModel) {
        super(1);
        this.$viewModel = saleBadgeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C7980b<Float, C8008p> c7980b) {
        invoke2(c7980b);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C7980b<Float, C8008p> animateTo) {
        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
        this.$viewModel.saveAnimAlpha(animateTo.k().floatValue());
    }
}
