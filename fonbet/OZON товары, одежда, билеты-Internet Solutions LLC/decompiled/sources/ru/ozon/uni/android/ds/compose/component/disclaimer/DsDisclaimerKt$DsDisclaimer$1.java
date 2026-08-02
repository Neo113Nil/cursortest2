package ru.ozon.uni.android.ds.compose.component.disclaimer;

import Bl0.C2652m;
import K1.C3422b;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsDisclaimerKt$DsDisclaimer$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $additionalButton;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $closeButton;
    final /* synthetic */ boolean $hasIcon;
    final /* synthetic */ String $icon;
    final /* synthetic */ e $iconModifier;
    final /* synthetic */ boolean $isClickable;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $mainButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ DsDisclaimerStyle $style;
    final /* synthetic */ C3422b $subtitle;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ C3422b $title;
    final /* synthetic */ e $titleModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsDisclaimerKt$DsDisclaimer$1(e eVar, C3422b c3422b, C3422b c3422b2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, boolean z11, boolean z12, String str, DsDisclaimerStyle dsDisclaimerStyle, e eVar2, e eVar3, e eVar4, int i11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$title = c3422b;
        this.$subtitle = c3422b2;
        this.$mainButton = function2;
        this.$additionalButton = function22;
        this.$closeButton = function23;
        this.$isClickable = z11;
        this.$hasIcon = z12;
        this.$icon = str;
        this.$style = dsDisclaimerStyle;
        this.$titleModifier = eVar2;
        this.$subtitleModifier = eVar3;
        this.$iconModifier = eVar4;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsDisclaimerKt.DsDisclaimer(this.$modifier, this.$title, this.$subtitle, this.$mainButton, this.$additionalButton, this.$closeButton, this.$isClickable, this.$hasIcon, this.$icon, this.$style, this.$titleModifier, this.$subtitleModifier, this.$iconModifier, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
