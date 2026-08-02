package ru.ozon.app.android.checkoutcomposer.couriersteps.composable;

import P9.a;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;
import ru.ozon.uni.atoms.data.common.Spacings;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SegmentedProgressBarKt$SegmentedProgressBar$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ int $progress;
    final /* synthetic */ long $progressColor;
    final /* synthetic */ long $segmentColor;
    final /* synthetic */ int $segmentCount;
    final /* synthetic */ float $spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedProgressBarKt$SegmentedProgressBar$1$1(float f7, int i11, int i12, long j11, long j12) {
        super(1);
        this.$spacing = f7;
        this.$segmentCount = i11;
        this.$progress = i12;
        this.$progressColor = j11;
        this.$segmentColor = j12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e Canvas = interfaceC8412e;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f7 = C7464j.f(Canvas.i());
        float v12 = Canvas.v1(this.$spacing);
        float f11 = (f7 - (v12 * (r4 - 1))) / this.$segmentCount;
        int i11 = 0;
        while (i11 < this.$segmentCount) {
            float v13 = (Canvas.v1(this.$spacing) + f11) * i11;
            long j11 = i11 < this.$progress ? this.$progressColor : this.$segmentColor;
            long a11 = a.a(v13, 0.0f);
            long a12 = C7465k.a(f11, C7464j.d(Canvas.i()));
            float v14 = Canvas.v1(Spacings.SPACING_2.getPx());
            InterfaceC8412e.p0(Canvas, j11, a11, a12, C7456b.a(v14, v14), null, 240);
            i11++;
            Canvas = interfaceC8412e;
        }
    }
}
