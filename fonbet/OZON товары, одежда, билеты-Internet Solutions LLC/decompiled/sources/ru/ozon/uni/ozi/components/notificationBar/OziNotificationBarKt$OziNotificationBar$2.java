package ru.ozon.uni.ozi.components.notificationBar;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarStatus;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziNotificationBarKt$OziNotificationBar$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> $firstButton;
    final /* synthetic */ InterfaceC6511n<OziNotificationBarIconScope, InterfaceC3967k, Integer, Unit> $icon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ InterfaceC6511n<OziNotificationBarButtonScope, InterfaceC3967k, Integer, Unit> $secondButton;
    final /* synthetic */ OziNotificationBarStatus $status;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ int $subtitleLinesLimit;
    final /* synthetic */ String $title;
    final /* synthetic */ int $titleLinesLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziNotificationBarKt$OziNotificationBar$2(String str, String str2, e eVar, InterfaceC6511n<? super OziNotificationBarIconScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, int i11, int i12, Function0<Unit> function0, OziNotificationBarStatus oziNotificationBarStatus, InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, InterfaceC6511n<? super OziNotificationBarButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3, int i13, int i14) {
        super(2);
        this.$title = str;
        this.$subtitle = str2;
        this.$modifier = eVar;
        this.$icon = interfaceC6511n;
        this.$titleLinesLimit = i11;
        this.$subtitleLinesLimit = i12;
        this.$onCloseClick = function0;
        this.$status = oziNotificationBarStatus;
        this.$firstButton = interfaceC6511n2;
        this.$secondButton = interfaceC6511n3;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziNotificationBarKt.OziNotificationBar(this.$title, this.$subtitle, this.$modifier, this.$icon, this.$titleLinesLimit, this.$subtitleLinesLimit, this.$onCloseClick, this.$status, this.$firstButton, this.$secondButton, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
