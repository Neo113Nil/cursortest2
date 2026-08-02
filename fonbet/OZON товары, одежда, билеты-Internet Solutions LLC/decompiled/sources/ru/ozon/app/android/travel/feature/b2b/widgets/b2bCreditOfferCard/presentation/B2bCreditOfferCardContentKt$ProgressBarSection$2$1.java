package ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation;

import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class B2bCreditOfferCardContentKt$ProgressBarSection$2$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $fraction;
    final /* synthetic */ long $progressColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bCreditOfferCardContentKt$ProgressBarSection$2$1(long j11, long j12, float f7) {
        super(1);
        this.$backgroundColor = j11;
        this.$progressColor = j12;
        this.$fraction = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float v12 = drawBehind.v1(DsSpacings.INSTANCE.m1861getDp8D9Ej5fM());
        long a11 = C7456b.a(v12, v12);
        InterfaceC8412e.p0(drawBehind, this.$backgroundColor, 0L, 0L, a11, null, 246);
        InterfaceC8412e.p0(drawBehind, this.$progressColor, 0L, C7465k.a(C7464j.f(drawBehind.i()) * this.$fraction, C7464j.d(drawBehind.i())), a11, null, 242);
    }
}
