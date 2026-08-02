package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<b, Unit> $onAction;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ BirthdateStateUi.ConfirmBirthdate $stateUi;
    final /* synthetic */ UserAdultModalV2VO $vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ComposeAdultConfirmationViewHolderKt$AdultOverlayButtonContent$2(BirthdateStateUi.ConfirmBirthdate confirmBirthdate, UserAdultModalV2VO userAdultModalV2VO, Function1<? super b, Unit> function1, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$stateUi = confirmBirthdate;
        this.$vo = userAdultModalV2VO;
        this.$onAction = function1;
        this.$onClick = function0;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ComposeAdultConfirmationViewHolderKt.AdultOverlayButtonContent(this.$stateUi, this.$vo, this.$onAction, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
