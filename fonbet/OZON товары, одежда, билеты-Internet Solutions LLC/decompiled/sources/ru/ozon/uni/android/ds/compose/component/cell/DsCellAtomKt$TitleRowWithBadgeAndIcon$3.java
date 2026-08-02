package ru.ozon.uni.android.ds.compose.component.cell;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsCellAtomKt$TitleRowWithBadgeAndIcon$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BadgeDTO $badgeDTO;
    final /* synthetic */ IconDTO $iconDTO;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ float $spacing;
    final /* synthetic */ TextDTO $titleDTO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsCellAtomKt$TitleRowWithBadgeAndIcon$3(TextDTO textDTO, BadgeDTO badgeDTO, IconDTO iconDTO, Function1<? super AtomAction, Unit> function1, e eVar, float f7, int i11, int i12) {
        super(2);
        this.$titleDTO = textDTO;
        this.$badgeDTO = badgeDTO;
        this.$iconDTO = iconDTO;
        this.$onAction = function1;
        this.$modifier = eVar;
        this.$spacing = f7;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsCellAtomKt.m1699TitleRowWithBadgeAndIconHYR8e34(this.$titleDTO, this.$badgeDTO, this.$iconDTO, this.$onAction, this.$modifier, this.$spacing, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
