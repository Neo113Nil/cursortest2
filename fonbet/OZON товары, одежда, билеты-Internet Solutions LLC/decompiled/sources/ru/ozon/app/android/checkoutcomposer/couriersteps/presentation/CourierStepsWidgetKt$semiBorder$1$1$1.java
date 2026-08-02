package ru.ozon.app.android.checkoutcomposer.couriersteps.presentation;

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
/* loaded from: classes11.dex */
final class CourierStepsWidgetKt$semiBorder$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $color;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $strokeWidthPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierStepsWidgetKt$semiBorder$1$1$1(long j11, float f7, float f11) {
        super(1);
        this.$color = j11;
        this.$cornerRadius = f7;
        this.$strokeWidthPx = f11;
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
        float d11 = C7464j.d(drawWithContent.i());
        drawWithContent.U(this.$color, a.a(0.0f, d11), a.a(0.0f, this.$cornerRadius), this.$strokeWidthPx, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        long j11 = this.$color;
        float f11 = 2;
        float f12 = this.$cornerRadius * f11;
        drawWithContent.E1(j11, 180.0f, 90.0f, 0L, C7465k.a(f12, f12), new C8416i(this.$strokeWidthPx, 0.0f, 0, 0, null, 30));
        drawWithContent.U(this.$color, a.a(this.$cornerRadius, 0.0f), a.a(f7 - this.$cornerRadius, 0.0f), this.$strokeWidthPx, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        long j12 = this.$color;
        long a11 = a.a(f7 - (this.$cornerRadius * f11), 0.0f);
        float f13 = this.$cornerRadius * f11;
        drawWithContent.E1(j12, 270.0f, 90.0f, a11, C7465k.a(f13, f13), new C8416i(this.$strokeWidthPx, 0.0f, 0, 0, null, 30));
        drawWithContent.U(this.$color, a.a(f7, d11), a.a(f7, this.$cornerRadius), this.$strokeWidthPx, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
    }
}
