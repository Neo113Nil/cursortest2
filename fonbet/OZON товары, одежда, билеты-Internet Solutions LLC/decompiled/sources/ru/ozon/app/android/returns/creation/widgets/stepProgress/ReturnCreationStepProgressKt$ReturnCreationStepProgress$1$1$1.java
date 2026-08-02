package ru.ozon.app.android.returns.creation.widgets.stepProgress;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ReturnCreationStepProgressKt$ReturnCreationStepProgress$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ ReturnCreationStepProgressVI $item;
    final /* synthetic */ long $selectedColor;
    final /* synthetic */ long $unselectedColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationStepProgressKt$ReturnCreationStepProgress$1$1$1(ReturnCreationStepProgressVI returnCreationStepProgressVI, long j11, long j12) {
        super(1);
        this.$item = returnCreationStepProgressVI;
        this.$selectedColor = j11;
        this.$unselectedColor = j12;
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
        float v12 = Canvas.v1(this.$item.getBetweenSpacing());
        float f7 = (C7464j.f(Canvas.i()) - ((this.$item.getCount() - 1) * v12)) / this.$item.getCount();
        long a11 = C7465k.a(f7, C7464j.d(Canvas.i()));
        float d11 = C7464j.d(Canvas.i()) / 2;
        long a12 = C7456b.a(d11, d11);
        int count = this.$item.getCount();
        ReturnCreationStepProgressVI returnCreationStepProgressVI = this.$item;
        long j11 = this.$selectedColor;
        long j12 = this.$unselectedColor;
        int i11 = 0;
        while (i11 < count) {
            float f11 = (f7 + v12) * i11;
            long j13 = j11;
            if (i11 >= returnCreationStepProgressVI.getCountOfSelected()) {
                j11 = j12;
            }
            InterfaceC8412e.p0(Canvas, j11, a.a(f11, 0.0f), a11, a12, null, 240);
            i11++;
            Canvas = interfaceC8412e;
            j11 = j13;
            j12 = j12;
        }
    }
}
