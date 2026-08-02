package ru.ozon.app.android.regulardraw.ui;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import Tg.b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import u0.InterfaceC9914x;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CustomBadgeAtomKt$CustomBadgeAtom$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ String $badgeBorderColor;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ BadgeDTO $dto;
    final /* synthetic */ e $modifier;
    final /* synthetic */ InterfaceC9914x $textPadding;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomBadgeAtomKt$CustomBadgeAtom$5(BadgeDTO badgeDTO, e eVar, String str, T t2, InterfaceC9914x interfaceC9914x, float f7, Function1<? super b, Unit> function1, int i11, int i12) {
        super(2);
        this.$dto = badgeDTO;
        this.$modifier = eVar;
        this.$badgeBorderColor = str;
        this.$textStyle = t2;
        this.$textPadding = interfaceC9914x;
        this.$cornerRadius = f7;
        this.$actionHandler = function1;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(this.$dto, this.$modifier, this.$badgeBorderColor, this.$textStyle, this.$textPadding, this.$cornerRadius, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
