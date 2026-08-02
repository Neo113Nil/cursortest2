package ru.ozon.uni.ozi.components.notificationBar;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarContainerLocation;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziNotificationBarContainerKt$OziNotificationBarContainer$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Long $autoHideDelay;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ Object $key;
    final /* synthetic */ OziNotificationBarContainerLocation $location;
    final /* synthetic */ e $modifier;
    final /* synthetic */ OziNotificationBarState $notificationBarState;
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziNotificationBarContainerKt$OziNotificationBarContainer$3(Object obj, e eVar, Long l11, OziNotificationBarState oziNotificationBarState, OziNotificationBarContainerLocation oziNotificationBarContainerLocation, Function0<Unit> function0, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i11, int i12) {
        super(2);
        this.$key = obj;
        this.$modifier = eVar;
        this.$autoHideDelay = l11;
        this.$notificationBarState = oziNotificationBarState;
        this.$location = oziNotificationBarContainerLocation;
        this.$onDismiss = function0;
        this.$content = function2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziNotificationBarContainerKt.OziNotificationBarContainer(this.$key, this.$modifier, this.$autoHideDelay, this.$notificationBarState, this.$location, this.$onDismiss, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
