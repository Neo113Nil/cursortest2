package ru.ozon.uni.foundation.components.notificationBar;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationNotificationBarKt$FoundationNotificationBar$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $closeButton;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $firstButton;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $icon;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $secondButton;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ int $subtitleLinesLimit;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ T $subtitleTextStyle;
    final /* synthetic */ String $title;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ int $titleLinesLimit;
    final /* synthetic */ e $titleModifier;
    final /* synthetic */ T $titleTextStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationNotificationBarKt$FoundationNotificationBar$1(String str, String str2, int i11, int i12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, Function2<? super InterfaceC3967k, ? super Integer, Unit> function24, e eVar, T t2, long j11, e eVar2, T t11, long j12, e eVar3, e eVar4, int i13, int i14, int i15) {
        super(2);
        this.$title = str;
        this.$subtitle = str2;
        this.$titleLinesLimit = i11;
        this.$subtitleLinesLimit = i12;
        this.$icon = function2;
        this.$closeButton = function22;
        this.$firstButton = function23;
        this.$secondButton = function24;
        this.$modifier = eVar;
        this.$subtitleTextStyle = t2;
        this.$subtitleColor = j11;
        this.$subtitleModifier = eVar2;
        this.$titleTextStyle = t11;
        this.$titleColor = j12;
        this.$titleModifier = eVar3;
        this.$iconModifier = eVar4;
        this.$$changed = i13;
        this.$$changed1 = i14;
        this.$$default = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationNotificationBarKt.m3025FoundationNotificationBarsGQTBBs(this.$title, this.$subtitle, this.$titleLinesLimit, this.$subtitleLinesLimit, this.$icon, this.$closeButton, this.$firstButton, this.$secondButton, this.$modifier, this.$subtitleTextStyle, this.$subtitleColor, this.$subtitleModifier, this.$titleTextStyle, this.$titleColor, this.$titleModifier, this.$iconModifier, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
