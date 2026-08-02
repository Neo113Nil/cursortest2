package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import Kk.C3532b;
import k1.C7455a;
import k1.C7456b;
import k1.C7460f;
import k1.C7461g;
import k1.C7462h;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.s0;
import n1.C8408a;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class RoundStartProgressBarKt$RoundStartProgressBar$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ s0 $path;
    final /* synthetic */ float $progress;
    final /* synthetic */ int $strokeCap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoundStartProgressBarKt$RoundStartProgressBar$1$1(s0 s0Var, long j11, int i11, float f7, long j12) {
        super(1);
        this.$path = s0Var;
        this.$backgroundColor = j11;
        this.$strokeCap = i11;
        this.$progress = f7;
        this.$color = j12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float d11 = C7464j.d(Canvas.i());
        s0 s0Var = this.$path;
        C7460f a11 = C7461g.a(0L, Canvas.i());
        float f7 = d11 / 2;
        long a12 = C7456b.a(f7, f7);
        float d12 = C7455a.d(a12);
        float e11 = C7455a.e(a12);
        float n11 = a11.n();
        float q11 = a11.q();
        float o11 = a11.o();
        float h11 = a11.h();
        long a13 = C7456b.a(d12, e11);
        s0Var.s(new C7462h(n11, q11, o11, h11, a13, a13, a13, a13), s0.a.CounterClockwise);
        s0 s0Var2 = this.$path;
        long j11 = this.$backgroundColor;
        int i11 = this.$strokeCap;
        float f11 = this.$progress;
        long j12 = this.$color;
        C8408a.b w02 = Canvas.w0();
        long e12 = w02.e();
        w02.a().save();
        try {
            w02.f().a(s0Var2);
            RoundStartProgressBarKt.m1539drawLinearIndicatorBackgroundAZGd3zU(Canvas, j11, d11, i11);
            RoundStartProgressBarKt.m1538drawLinearIndicatorqYKTg0g(Canvas, 0.0f, f11, j12, d11, i11);
        } finally {
            C3532b.b(w02, e12);
        }
    }
}
