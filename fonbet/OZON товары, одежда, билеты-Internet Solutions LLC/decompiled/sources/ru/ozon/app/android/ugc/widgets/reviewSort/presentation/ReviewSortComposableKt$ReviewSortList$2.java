package ru.ozon.app.android.ugc.widgets.reviewSort.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewSortComposableKt$ReviewSortList$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $backgroundColor;
    final /* synthetic */ List<CellDTO> $cells;
    final /* synthetic */ CornerRadius $cornerRadius;
    final /* synthetic */ boolean $isSelect;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewSortComposableKt$ReviewSortList$2(List<CellDTO> list, String str, CornerRadius cornerRadius, boolean z11, Function1<? super AtomAction, Unit> function1, e eVar, int i11, int i12) {
        super(2);
        this.$cells = list;
        this.$backgroundColor = str;
        this.$cornerRadius = cornerRadius;
        this.$isSelect = z11;
        this.$onAction = function1;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ReviewSortComposableKt.ReviewSortList(this.$cells, this.$backgroundColor, this.$cornerRadius, this.$isSelect, this.$onAction, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
