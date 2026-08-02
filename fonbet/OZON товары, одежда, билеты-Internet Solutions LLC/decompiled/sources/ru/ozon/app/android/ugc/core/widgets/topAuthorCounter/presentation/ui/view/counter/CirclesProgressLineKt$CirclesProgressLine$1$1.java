package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.counter;

import P9.a;
import java.util.List;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l1.AbstractC7799Q;
import l1.C7807Z;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class CirclesProgressLineKt$CirclesProgressLine$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ List<C7807Z> $activeGradient;
    final /* synthetic */ long $inactiveColor;
    final /* synthetic */ float $lastStepProgress;
    final /* synthetic */ int $progressCount;
    final /* synthetic */ int $totalCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CirclesProgressLineKt$CirclesProgressLine$1$1(int i11, int i12, float f7, long j11, List<C7807Z> list) {
        super(1);
        this.$totalCount = i11;
        this.$progressCount = i12;
        this.$lastStepProgress = f7;
        this.$inactiveColor = j11;
        this.$activeGradient = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f7 = 2;
        float f11 = C7464j.f(Canvas.i());
        float d11 = C7464j.d(Canvas.i()) / f7;
        int i11 = this.$totalCount;
        float f12 = f11 / (i11 - 1);
        int i12 = this.$progressCount;
        boolean z11 = i12 == i11;
        if (z11) {
            i12--;
        }
        float d12 = h.d(((i12 - 1) * f12) + (z11 ? f12 * this.$lastStepProgress : 0.0f), 0.0f, f11);
        Canvas.U(this.$inactiveColor, a.a(0.0f, d11), a.a(f11, d11), Canvas.v1(f7), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
        List list = this.$activeGradient;
        if (list == null) {
            list = K.f71697a;
        }
        Canvas.h0(AbstractC7799Q.a.a(aVar, list, 0.0f, 0.0f, 14), a.a(0.0f, d11), a.a(d12, d11), Canvas.v1(f7), (r17 & 64) != 0 ? 1.0f : 0.0f);
    }
}
