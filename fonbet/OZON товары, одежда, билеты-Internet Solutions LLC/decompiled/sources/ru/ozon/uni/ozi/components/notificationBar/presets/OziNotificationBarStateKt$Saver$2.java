package ru.ozon.uni.ozi.components.notificationBar.presets;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.InterfaceC7976A;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "visibility", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziNotificationBarStateKt$Saver$2 extends AbstractC7737t implements Function1<OziNotificationBarVisibility, OziNotificationBarState> {
    final /* synthetic */ InterfaceC7976A<Float> $decayAnimationSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNotificationBarStateKt$Saver$2(InterfaceC7976A<Float> interfaceC7976A) {
        super(1);
        this.$decayAnimationSpec = interfaceC7976A;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OziNotificationBarState invoke(OziNotificationBarVisibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new OziNotificationBarState(this.$decayAnimationSpec, visibility, null, 4, null);
    }
}
