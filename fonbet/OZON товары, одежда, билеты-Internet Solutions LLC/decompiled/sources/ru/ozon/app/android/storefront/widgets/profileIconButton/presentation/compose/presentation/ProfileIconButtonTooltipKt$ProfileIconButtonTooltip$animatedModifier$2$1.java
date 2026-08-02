package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

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
    final /* synthetic */ int $beakOffset;
    final /* synthetic */ TooltipDTO.BeakPosition $beakPosition;
    final /* synthetic */ K $leftMarginPx;
    final /* synthetic */ A1<Float> $rotation$delegate;
    final /* synthetic */ A1<Float> $scale$delegate;
    final /* synthetic */ InterfaceC3972m0 $tooltipWidthPx$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$animatedModifier$2$1(TooltipDTO.BeakPosition beakPosition, int i11, K k11, A1<Float> a12, A1<Float> a13, InterfaceC3972m0 interfaceC3972m0) {
        super(1);
        this.$beakPosition = beakPosition;
        this.$beakOffset = i11;
        this.$leftMarginPx = k11;
        this.$scale$delegate = a12;
        this.$rotation$delegate = a13;
        this.$tooltipWidthPx$delegate = interfaceC3972m0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        invoke2(interfaceC7825i0);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC7825i0 graphicsLayer) {
        float ProfileIconButtonTooltip$lambda$7;
        float ProfileIconButtonTooltip$lambda$72;
        float ProfileIconButtonTooltip$lambda$9;
        int intValue;
        long transformOrigin;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        ProfileIconButtonTooltip$lambda$7 = ProfileIconButtonTooltipKt.ProfileIconButtonTooltip$lambda$7(this.$scale$delegate);
        graphicsLayer.j(ProfileIconButtonTooltip$lambda$7);
        ProfileIconButtonTooltip$lambda$72 = ProfileIconButtonTooltipKt.ProfileIconButtonTooltip$lambda$7(this.$scale$delegate);
        graphicsLayer.k(ProfileIconButtonTooltip$lambda$72);
        ProfileIconButtonTooltip$lambda$9 = ProfileIconButtonTooltipKt.ProfileIconButtonTooltip$lambda$9(this.$rotation$delegate);
        graphicsLayer.h(ProfileIconButtonTooltip$lambda$9);
        TooltipDTO.BeakPosition beakPosition = this.$beakPosition;
        int i11 = this.$beakOffset;
        int i12 = this.$leftMarginPx.f71785a;
        intValue = this.$tooltipWidthPx$delegate.getIntValue();
        transformOrigin = ProfileIconButtonTooltipKt.toTransformOrigin(beakPosition, i11, i12, intValue);
        graphicsLayer.g0(transformOrigin);
    }
}
