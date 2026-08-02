package ru.ozon.uni.ozi.components.notificationBar;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarVisibility;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll1/i0;", "", "invoke", "(Ll1/i0;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$1$1 extends AbstractC7737t implements Function1<InterfaceC7825i0, Unit> {
    final /* synthetic */ InterfaceC3978p0<Float> $contentHeightPx$delegate;
    final /* synthetic */ OziNotificationBarState $notificationBarState;
    final /* synthetic */ InterfaceC3978p0<Boolean> $wasInShowState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicNotificationBarContainerKt$BasicNotificationBarContainer$2$1$1(OziNotificationBarState oziNotificationBarState, InterfaceC3978p0<Boolean> interfaceC3978p0, InterfaceC3978p0<Float> interfaceC3978p02) {
        super(1);
        this.$notificationBarState = oziNotificationBarState;
        this.$wasInShowState$delegate = interfaceC3978p0;
        this.$contentHeightPx$delegate = interfaceC3978p02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7825i0 interfaceC7825i0) {
        invoke2(interfaceC7825i0);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC7825i0 graphicsLayer) {
        boolean BasicNotificationBarContainer$lambda$4;
        float BasicNotificationBarContainer$lambda$1;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        if (this.$notificationBarState.getCurrentValue() == OziNotificationBarVisibility.Shown) {
            BasicNotificationBarContainerKt.BasicNotificationBarContainer$lambda$5(this.$wasInShowState$delegate, true);
        }
        BasicNotificationBarContainer$lambda$4 = BasicNotificationBarContainerKt.BasicNotificationBarContainer$lambda$4(this.$wasInShowState$delegate);
        if (BasicNotificationBarContainer$lambda$4 && this.$notificationBarState.getCurrentValue() == OziNotificationBarVisibility.Hidden) {
            BasicNotificationBarContainerKt.BasicNotificationBarContainer$lambda$5(this.$wasInShowState$delegate, false);
            Function0<Unit> onDismiss$uni_release = this.$notificationBarState.getOnDismiss$uni_release();
            if (onDismiss$uni_release != null) {
                onDismiss$uni_release.invoke();
            }
        }
        float offset = this.$notificationBarState.getOffset();
        BasicNotificationBarContainer$lambda$1 = BasicNotificationBarContainerKt.BasicNotificationBarContainer$lambda$1(this.$contentHeightPx$delegate);
        graphicsLayer.setAlpha(1 - (offset / BasicNotificationBarContainer$lambda$1));
    }
}
