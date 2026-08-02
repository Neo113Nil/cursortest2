package ru.ozon.uni.android.ds.compose.component.disclaimer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsDisclaimerAtomKt$asVo$2$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ DisclaimerDTO.AdditionalButton $this_asVo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsDisclaimerAtomKt$asVo$2$1$1(DisclaimerDTO.AdditionalButton additionalButton, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$this_asVo = additionalButton;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        AtomAction atomAction;
        Function1<AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(it, "it");
        CommonControlSettings common = this.$this_asVo.getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null || (function1 = this.$onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }
}
