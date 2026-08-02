package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

import S0.A1;
import S0.InterfaceC3972m0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import l1.InterfaceC7825i0;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/i0;", "", "invoke", "(Ll1/i0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$animatedModifier$2$1 extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {
    final /* synthetic */ A1<Integer> $beakOffset$delegate;
    final /* synthetic */ TooltipDTO.BeakPosition $beakPosition;
    final /* synthetic */ K $leftMarginPx;
    final /* synthetic */ A1<Float> $rotation$delegate;
    final /* synthetic */ A1<Float> $scale$delegate;
    final /* synthetic */ InterfaceC3972m0 $tooltipWidthPx$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$animatedModifier$2$1(TooltipDTO.BeakPosition beakPosition, K k11, A1<Float> a12, A1<Float> a13, A1<Integer> a14, InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.$beakPosition = beakPosition;
        this.$leftMarginPx = k11;
        this.$scale$delegate = a12;
        this.$rotation$delegate = a13;
        this.$beakOffset$delegate = a14;
        this.$tooltipWidthPx$delegate = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        invoke2(interfaceC7825i0);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC7825i0 graphicsLayer) {
        float ProfileIconButtonTooltip$lambda$13;
        float ProfileIconButtonTooltip$lambda$132;
        float ProfileIconButtonTooltip$lambda$15;
        int ProfileIconButtonTooltip$lambda$8;
        int intValue;
        long transformOrigin;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        ProfileIconButtonTooltip$lambda$13 = ProfileIconButtonTooltipKt.ProfileIconButtonTooltip$lambda$13(this.$scale$delegate);
        graphicsLayer.j(ProfileIconButtonTooltip$lambda$13);
        ProfileIconButtonTooltip$lambda$132 = ProfileIconButtonTooltipKt.ProfileIconButtonTooltip$lambda$13(this.$scale$delegate);
        graphicsLayer.k(ProfileIconButtonTooltip$lambda$132);
        ProfileIconButtonTooltip$lambda$15 = ProfileIconButtonTooltipKt.ProfileIconButtonTooltip$lambda$15(this.$rotation$delegate);
        graphicsLayer.h(ProfileIconButtonTooltip$lambda$15);
        TooltipDTO.BeakPosition beakPosition = this.$beakPosition;
        ProfileIconButtonTooltip$lambda$8 = ProfileIconButtonTooltipKt.ProfileIconButtonTooltip$lambda$8(this.$beakOffset$delegate);
        int i11 = this.$leftMarginPx.f71785a;
        intValue = this.$tooltipWidthPx$delegate.getIntValue();
        transformOrigin = ProfileIconButtonTooltipKt.toTransformOrigin(beakPosition, ProfileIconButtonTooltip$lambda$8, i11, intValue);
        graphicsLayer.g0(transformOrigin);
    }
}
