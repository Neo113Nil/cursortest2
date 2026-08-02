package ru.ozon.uni.components.button;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.C7807Z;
import q1.AbstractC8972b;
import t0.q;
import u0.InterfaceC9914x;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniButtonKt$BasicButton$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$changed3;
    final /* synthetic */ String $accessibilityContentDescription;
    final /* synthetic */ AbstractC7799Q $backgroundColor;
    final /* synthetic */ boolean $canShowSubtitle;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ C7807Z $customHoverColor;
    final /* synthetic */ long $dataBackgroundColor;
    final /* synthetic */ String $dataContent;
    final /* synthetic */ float $dataCornerRadius;
    final /* synthetic */ float $dataHorizontalPadding;
    final /* synthetic */ float $dataPaddingOffset;
    final /* synthetic */ AbstractC7799Q $dataTextColor;
    final /* synthetic */ T $dataTextStyle;
    final /* synthetic */ float $dataVerticalPadding;
    final /* synthetic */ float $height;
    final /* synthetic */ AbstractC8972b $icon;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ AbstractC7799Q $iconGradientColor;
    final /* synthetic */ float $iconTitleGap;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isCustomHoverColorEnabled;
    final /* synthetic */ boolean $isDisabled;
    final /* synthetic */ boolean $isHoverDisabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $loader;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ InterfaceC9914x $paddings;
    final /* synthetic */ String $subtitleContent;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ AbstractC7799Q $subtitleTextColor;
    final /* synthetic */ T $subtitleTextStyle;
    final /* synthetic */ String $titleContent;
    final /* synthetic */ e $titleModifier;
    final /* synthetic */ AbstractC7799Q $titleTextColor;
    final /* synthetic */ T $titleTextStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UniButtonKt$BasicButton$5(e eVar, e eVar2, e eVar3, String str, String str2, String str3, AbstractC8972b abstractC8972b, boolean z11, boolean z12, boolean z13, boolean z14, C7807Z c7807z, boolean z15, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, AbstractC7799Q abstractC7799Q3, AbstractC7799Q abstractC7799Q4, long j11, AbstractC7799Q abstractC7799Q5, long j12, T t2, T t11, T t12, float f7, float f11, float f12, InterfaceC9914x interfaceC9914x, float f13, float f14, float f15, float f16, String str4, q qVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function0<Unit> function0, int i11, int i12, int i13, int i14) {
        super(2);
        this.$modifier = eVar;
        this.$titleModifier = eVar2;
        this.$subtitleModifier = eVar3;
        this.$titleContent = str;
        this.$subtitleContent = str2;
        this.$dataContent = str3;
        this.$icon = abstractC8972b;
        this.$canShowSubtitle = z11;
        this.$isDisabled = z12;
        this.$isHoverDisabled = z13;
        this.$isCustomHoverColorEnabled = z14;
        this.$customHoverColor = c7807z;
        this.$isLoading = z15;
        this.$titleTextColor = abstractC7799Q;
        this.$subtitleTextColor = abstractC7799Q2;
        this.$dataTextColor = abstractC7799Q3;
        this.$backgroundColor = abstractC7799Q4;
        this.$iconColor = j11;
        this.$iconGradientColor = abstractC7799Q5;
        this.$dataBackgroundColor = j12;
        this.$titleTextStyle = t2;
        this.$subtitleTextStyle = t11;
        this.$dataTextStyle = t12;
        this.$height = f7;
        this.$cornerRadius = f11;
        this.$dataCornerRadius = f12;
        this.$paddings = interfaceC9914x;
        this.$dataVerticalPadding = f13;
        this.$dataHorizontalPadding = f14;
        this.$dataPaddingOffset = f15;
        this.$iconTitleGap = f16;
        this.$accessibilityContentDescription = str4;
        this.$interactionSource = qVar;
        this.$loader = function2;
        this.$onClick = function0;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$changed2 = i13;
        this.$$changed3 = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniButtonKt.m1884BasicButtonCi1iAhw(this.$modifier, this.$titleModifier, this.$subtitleModifier, this.$titleContent, this.$subtitleContent, this.$dataContent, this.$icon, this.$canShowSubtitle, this.$isDisabled, this.$isHoverDisabled, this.$isCustomHoverColorEnabled, this.$customHoverColor, this.$isLoading, this.$titleTextColor, this.$subtitleTextColor, this.$dataTextColor, this.$backgroundColor, this.$iconColor, this.$iconGradientColor, this.$dataBackgroundColor, this.$titleTextStyle, this.$subtitleTextStyle, this.$dataTextStyle, this.$height, this.$cornerRadius, this.$dataCornerRadius, this.$paddings, this.$dataVerticalPadding, this.$dataHorizontalPadding, this.$dataPaddingOffset, this.$iconTitleGap, this.$accessibilityContentDescription, this.$interactionSource, this.$loader, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), C2652m.e(this.$$changed3));
    }
}
