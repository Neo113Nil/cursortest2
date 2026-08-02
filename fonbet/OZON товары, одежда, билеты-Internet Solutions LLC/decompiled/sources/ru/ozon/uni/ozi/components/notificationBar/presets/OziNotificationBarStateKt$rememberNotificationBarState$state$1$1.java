package ru.ozon.uni.ozi.components.notificationBar.presets;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import m0.InterfaceC7976A;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziNotificationBarStateKt$rememberNotificationBarState$state$1$1 extends AbstractC7737t implements Function0<OziNotificationBarState> {
    final /* synthetic */ InterfaceC7976A<Float> $decayAnimationSpec;
    final /* synthetic */ boolean $isInspectionMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNotificationBarStateKt$rememberNotificationBarState$state$1$1(InterfaceC7976A<Float> interfaceC7976A, boolean z11) {
        super(0);
        this.$decayAnimationSpec = interfaceC7976A;
        this.$isInspectionMode = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OziNotificationBarState invoke() {
        return new OziNotificationBarState(this.$decayAnimationSpec, this.$isInspectionMode ? OziNotificationBarVisibility.Shown : OziNotificationBarVisibility.Hidden, null, 4, null);
    }
}
