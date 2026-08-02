package ru.ozon.uni.components.button;

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
/* loaded from: classes4.dex */
final class UniButtonKt$UniButton$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $canShowSubtitle;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ String $data;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isDisabled;
    final /* synthetic */ boolean $isHoverDisabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $rounded;
    final /* synthetic */ UniButtonSize $sizeType;
    final /* synthetic */ UniButtonStyleType $styleType;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniButtonKt$UniButton$3(String str, e eVar, String str2, String str3, AbstractC8972b abstractC8972b, String str4, Function0<Unit> function0, boolean z11, boolean z12, boolean z13, boolean z14, UniButtonStyleType uniButtonStyleType, UniButtonSize uniButtonSize, boolean z15, q qVar, int i11, int i12, int i13) {
        super(2);
        this.$title = str;
        this.$modifier = eVar;
        this.$subtitle = str2;
        this.$data = str3;
        this.$icon = abstractC8972b;
        this.$contentDescription = str4;
        this.$onClick = function0;
        this.$rounded = z11;
        this.$isDisabled = z12;
        this.$isHoverDisabled = z13;
        this.$isLoading = z14;
        this.$styleType = uniButtonStyleType;
        this.$sizeType = uniButtonSize;
        this.$canShowSubtitle = z15;
        this.$interactionSource = qVar;
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
        UniButtonKt.UniButton(this.$title, this.$modifier, this.$subtitle, this.$data, this.$icon, this.$contentDescription, this.$onClick, this.$rounded, this.$isDisabled, this.$isHoverDisabled, this.$isLoading, this.$styleType, this.$sizeType, this.$canShowSubtitle, this.$interactionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
