package ru.ozon.app.android.saleBadge.presentation;

import S0.A1;
import k1.C7456b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n1.InterfaceC8412e;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeVO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SaleBadgeWidgetKt$SaleBadgeContent$3$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ C7807Z $foregroundColor;
    final /* synthetic */ float $foregroundRadiusPx;
    final /* synthetic */ A1<Float> $savedAnimProgress$delegate;
    final /* synthetic */ SaleBadgeVO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaleBadgeWidgetKt$SaleBadgeContent$3$1(C7807Z c7807z, SaleBadgeVO saleBadgeVO, float f7, A1<Float> a12) {
        super(1);
        this.$foregroundColor = c7807z;
        this.$state = saleBadgeVO;
        this.$foregroundRadiusPx = f7;
        this.$savedAnimProgress$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        Float SaleBadgeContent$lambda$11;
        float floatValue;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        C7807Z c7807z = this.$foregroundColor;
        if (c7807z != null) {
            SaleBadgeVO saleBadgeVO = this.$state;
            float f7 = this.$foregroundRadiusPx;
            A1<Float> a12 = this.$savedAnimProgress$delegate;
            float f11 = C7464j.f(drawBehind.i());
            SaleBadgeContent$lambda$11 = SaleBadgeWidgetKt.SaleBadgeContent$lambda$11(a12);
            if (SaleBadgeContent$lambda$11 != null) {
                floatValue = SaleBadgeContent$lambda$11.floatValue();
            } else {
                SaleBadgeVO.BackgroundOverlay backgroundOverlay = saleBadgeVO.getBackgroundOverlay();
                Float valueOf = backgroundOverlay != null ? Float.valueOf(backgroundOverlay.getOverlayProgress()) : null;
                floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
            }
            InterfaceC8412e.p0(drawBehind, c7807z.w(), 0L, C7465k.a(f11 * floatValue, C7464j.d(drawBehind.i())), C7456b.a(f7, f7), null, 240);
        }
    }
}
