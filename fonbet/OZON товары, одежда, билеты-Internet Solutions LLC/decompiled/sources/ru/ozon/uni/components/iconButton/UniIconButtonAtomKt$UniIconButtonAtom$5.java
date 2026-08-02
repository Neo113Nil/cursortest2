package ru.ozon.uni.components.iconButton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniIconButtonAtomKt$UniIconButtonAtom$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ IconButtonV3DTO $dto;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ UniIconButtonResizing $resizing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UniIconButtonAtomKt$UniIconButtonAtom$5(IconButtonV3DTO iconButtonV3DTO, e eVar, UniIconButtonResizing uniIconButtonResizing, boolean z11, Function1<? super AtomAction, Unit> function1, int i11, int i12) {
        super(2);
        this.$dto = iconButtonV3DTO;
        this.$modifier = eVar;
        this.$resizing = uniIconButtonResizing;
        this.$isLoading = z11;
        this.$onAction = function1;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniIconButtonAtomKt.UniIconButtonAtom(this.$dto, this.$modifier, this.$resizing, this.$isLoading, this.$onAction, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
