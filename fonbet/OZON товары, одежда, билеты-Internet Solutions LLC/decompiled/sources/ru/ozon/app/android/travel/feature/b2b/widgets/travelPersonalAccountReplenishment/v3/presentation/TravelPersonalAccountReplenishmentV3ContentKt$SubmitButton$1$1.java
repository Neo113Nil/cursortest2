package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$SubmitButton$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ String $amountInputText;
    final /* synthetic */ Function0<Unit> $onHideKeyboard;
    final /* synthetic */ TravelPersonalAccountReplenishmentV3VI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelPersonalAccountReplenishmentV3ContentKt$SubmitButton$1$1(Function0<Unit> function0, TravelPersonalAccountReplenishmentV3VI travelPersonalAccountReplenishmentV3VI, Function1<? super AtomAction, Unit> function1, String str) {
        super(1);
        this.$onHideKeyboard = function0;
        this.$state = travelPersonalAccountReplenishmentV3VI;
        this.$actionHandler = function1;
        this.$amountInputText = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        String centsAmountString;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        this.$onHideKeyboard.invoke();
        if (atomAction instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) atomAction;
            Map<String, String> params = composerAction.getParams();
            LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
            CommonInputV2VO.TextInputV2 input = this.$state.getInput();
            if (input != null) {
                String str = this.$amountInputText;
                String name = input.getName();
                centsAmountString = TravelPersonalAccountReplenishmentV3ContentKt.getCentsAmountString(str);
                u11.put(name, centsAmountString);
            }
            atomAction = AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
        }
        this.$actionHandler.invoke(atomAction);
    }
}
