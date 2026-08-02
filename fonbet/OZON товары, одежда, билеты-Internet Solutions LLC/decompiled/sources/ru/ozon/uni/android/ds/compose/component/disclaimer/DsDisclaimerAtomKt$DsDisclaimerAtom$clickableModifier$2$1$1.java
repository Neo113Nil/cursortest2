package ru.ozon.uni.android.ds.compose.component.disclaimer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsDisclaimerAtomKt$DsDisclaimerAtom$clickableModifier$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DisclaimerDTO $dto;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsDisclaimerAtomKt$DsDisclaimerAtom$clickableModifier$2$1$1(DisclaimerDTO disclaimerDTO, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$dto = disclaimerDTO;
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
        CommonControlSettings common = this.$dto.getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        Function1<AtomAction, Unit> function1 = this.$onAction;
        Intrinsics.f(function1);
        function1.invoke(atomAction);
    }
}
