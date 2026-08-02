package ru.ozon.uni.android.ds.compose.component.button;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsIconButtonAtomKt$DsIconButtonAtom$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ IconButtonV3DTO $dto;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsIconButtonAtomKt$DsIconButtonAtom$2$1(IconButtonV3DTO iconButtonV3DTO, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$dto = iconButtonV3DTO;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction atomAction;
        Function1<AtomAction, Unit> function1;
        CommonControlSettings common = this.$dto.getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null || (function1 = this.$onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }
}
