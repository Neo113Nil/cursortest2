package ru.ozon.uni.utils;

import k1.C7460f;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import l1.C7790H;
import n1.C8416i;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class VisualEffectsKt$ThreeSideBorder$1$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ long $borderColor;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ float $cornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VisualEffectsKt$ThreeSideBorder$1$1(float f7, float f11, long j11) {
        super(1);
        this.$borderWidth = f7;
        this.$cornerRadius = f11;
        this.$borderColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float v12 = Canvas.v1(this.$borderWidth);
        float v13 = Canvas.v1(this.$cornerRadius);
        float f7 = C7464j.f(Canvas.i());
        float d11 = C7464j.d(Canvas.i());
        C7786D a11 = C7790H.a();
        a11.a(0.0f, d11);
        a11.b(0.0f, v13);
        float f11 = 2 * v13;
        a11.w(new C7460f(0.0f, 0.0f, f11, f11), 180.0f, 90.0f);
        a11.b(f7 - v13, 0.0f);
        a11.w(new C7460f(f7 - f11, 0.0f, f7, f11), 270.0f, 90.0f);
        a11.b(f7, d11);
        InterfaceC8412e.X(Canvas, a11, this.$borderColor, new C8416i(v12, 0.0f, 0, 0, null, 30), 52);
    }
}
