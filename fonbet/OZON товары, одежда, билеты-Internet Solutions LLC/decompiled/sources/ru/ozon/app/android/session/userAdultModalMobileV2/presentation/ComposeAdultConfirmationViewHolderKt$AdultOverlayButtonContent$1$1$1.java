package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$1$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function1<b, Unit> $onAction;
    final /* synthetic */ BirthdateStateUi.ConfirmBirthdate $stateUi;
    final /* synthetic */ UserAdultModalV2VO $vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$1$1$1(UserAdultModalV2VO userAdultModalV2VO, BirthdateStateUi.ConfirmBirthdate confirmBirthdate, Function1<? super b, Unit> function1) {
        super(1);
        this.$vo = userAdultModalV2VO;
        this.$stateUi = confirmBirthdate;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        AtomAction.ComposerAction mapAction;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        mapAction = ComposeAdultConfirmationViewHolderKt.mapAction(this.$vo.getPrimaryButton(), this.$stateUi.getBirthDateRequestValue());
        if (mapAction != null) {
            atomAction = mapAction;
        }
        Function1<b, Unit> function1 = this.$onAction;
        if (function1 != null) {
            function1.invoke(atomAction);
        }
    }
}
