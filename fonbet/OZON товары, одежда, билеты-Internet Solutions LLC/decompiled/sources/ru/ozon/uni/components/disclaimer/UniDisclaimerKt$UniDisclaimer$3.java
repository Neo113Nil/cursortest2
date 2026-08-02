package ru.ozon.uni.components.disclaimer;

import Bl0.C2652m;
import K1.C3422b;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import ru.ozon.uni.components.disclaimer.addons.UniDisclaimerAdditionalButtonScope;
import ru.ozon.uni.components.disclaimer.addons.UniDisclaimerMainButtonScope;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniDisclaimerKt$UniDisclaimer$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6511n<UniDisclaimerAdditionalButtonScope, InterfaceC3967k, Integer, Unit> $additionalButton;
    final /* synthetic */ boolean $hasIcon;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ InterfaceC6511n<UniDisclaimerMainButtonScope, InterfaceC3967k, Integer, Unit> $mainButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onCloseButtonClick;
    final /* synthetic */ UniDisclaimerTheme $style;
    final /* synthetic */ C3422b $subtitle;
    final /* synthetic */ Integer $subtitleLinesLimit;
    final /* synthetic */ boolean $tagSupported;
    final /* synthetic */ C3422b $title;
    final /* synthetic */ Integer $titleLinesLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UniDisclaimerKt$UniDisclaimer$3(e eVar, C3422b c3422b, C3422b c3422b2, UniDisclaimerTheme uniDisclaimerTheme, boolean z11, AbstractC8972b abstractC8972b, Integer num, Integer num2, InterfaceC6511n<? super UniDisclaimerMainButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, Function0<Unit> function0, Function0<Unit> function02, boolean z12, int i11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$title = c3422b;
        this.$subtitle = c3422b2;
        this.$style = uniDisclaimerTheme;
        this.$hasIcon = z11;
        this.$icon = abstractC8972b;
        this.$titleLinesLimit = num;
        this.$subtitleLinesLimit = num2;
        this.$mainButton = interfaceC6511n;
        this.$additionalButton = interfaceC6511n2;
        this.$onCloseButtonClick = function0;
        this.$onClick = function02;
        this.$tagSupported = z12;
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
        UniDisclaimerKt.UniDisclaimer(this.$modifier, this.$title, this.$subtitle, this.$style, this.$hasIcon, this.$icon, this.$titleLinesLimit, this.$subtitleLinesLimit, this.$mainButton, this.$additionalButton, this.$onCloseButtonClick, this.$onClick, this.$tagSupported, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
