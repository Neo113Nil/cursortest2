package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button;

import P9.a;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.C8416i;
import n1.InterfaceC8410c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ButtonComposableKt$outerRoundedBorder$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ C8416i $arcStyle;
    final /* synthetic */ float $borderDiameter;
    final /* synthetic */ long $color;
    final /* synthetic */ float $halfStrokeWidth;
    final /* synthetic */ float $radius;
    final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonComposableKt$outerRoundedBorder$1$1$1(long j11, float f7, float f11, C8416i c8416i, float f12, float f13) {
        super(1);
        this.$color = j11;
        this.$halfStrokeWidth = f7;
        this.$borderDiameter = f11;
        this.$arcStyle = c8416i;
        this.$radius = f12;
        this.$strokeWidth = f13;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        float f7 = C7464j.f(drawWithContent.i());
        long j11 = this.$color;
        float f11 = -this.$halfStrokeWidth;
        long a11 = a.a(f11, f11);
        float f12 = this.$borderDiameter;
        drawWithContent.E1(j11, 180.0f, 90.0f, a11, C7465k.a(f12, f12), this.$arcStyle);
        drawWithContent.U(this.$color, a.a(this.$radius, -this.$halfStrokeWidth), a.a(f7 - this.$radius, -this.$halfStrokeWidth), this.$strokeWidth, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        long j12 = this.$color;
        float f13 = f7 - this.$borderDiameter;
        float f14 = this.$halfStrokeWidth;
        long a12 = a.a(f13 + f14, -f14);
        float f15 = this.$borderDiameter;
        drawWithContent.E1(j12, 270.0f, 90.0f, a12, C7465k.a(f15, f15), this.$arcStyle);
    }
}
