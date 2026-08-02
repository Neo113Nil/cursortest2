package ru.ozon.uni.android.ds.compose.component.button;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsButtonKt$DsButton$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $accessibilityContentDescription;
    final /* synthetic */ boolean $canShowSubtitle;
    final /* synthetic */ String $dataText;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $hoverDisabled;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $loader;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ DsButtonStyle $style;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ String $title;
    final /* synthetic */ e $titleModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsButtonKt$DsButton$4(String str, DsButtonStyle dsButtonStyle, boolean z11, e eVar, String str2, String str3, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z12, boolean z13, e eVar2, e eVar3, String str4, q qVar, Function0<Unit> function0, int i11, int i12, int i13) {
        super(2);
        this.$title = str;
        this.$style = dsButtonStyle;
        this.$canShowSubtitle = z11;
        this.$modifier = eVar;
        this.$subtitle = str2;
        this.$dataText = str3;
        this.$icon = abstractC8972b;
        this.$loader = function2;
        this.$enabled = z12;
        this.$hoverDisabled = z13;
        this.$titleModifier = eVar2;
        this.$subtitleModifier = eVar3;
        this.$accessibilityContentDescription = str4;
        this.$interactionSource = qVar;
        this.$onClick = function0;
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
        DsButtonKt.DsButton(this.$title, this.$style, this.$canShowSubtitle, this.$modifier, this.$subtitle, this.$dataText, this.$icon, this.$loader, this.$enabled, this.$hoverDisabled, this.$titleModifier, this.$subtitleModifier, this.$accessibilityContentDescription, this.$interactionSource, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
