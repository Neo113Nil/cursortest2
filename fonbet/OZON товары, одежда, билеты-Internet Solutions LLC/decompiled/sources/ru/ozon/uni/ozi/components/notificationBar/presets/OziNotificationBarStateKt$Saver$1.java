package ru.ozon.uni.ozi.components.notificationBar.presets;

import b1.InterfaceC5518u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb1/u;", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;", "it", "Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "invoke", "(Lb1/u;Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarState;)Lru/ozon/uni/ozi/components/notificationBar/presets/OziNotificationBarVisibility;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNotificationBarStateKt$Saver$1 extends AbstractC7737t implements Function2<InterfaceC5518u, OziNotificationBarState, OziNotificationBarVisibility> {
    public static final OziNotificationBarStateKt$Saver$1 INSTANCE = new OziNotificationBarStateKt$Saver$1();

    OziNotificationBarStateKt$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final OziNotificationBarVisibility invoke(InterfaceC5518u Saver, OziNotificationBarState it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAnchoredDraggableState$uni_release().l();
    }
}
