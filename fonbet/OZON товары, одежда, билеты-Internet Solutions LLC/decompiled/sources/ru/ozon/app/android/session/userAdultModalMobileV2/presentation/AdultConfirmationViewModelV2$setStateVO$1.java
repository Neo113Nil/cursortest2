package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Ae.x0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.joda.time.LocalDate;
import ru.ozon.app.android.session.userAdultModalMobileV2.data.models.UserAdultModalV2DTO;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.userAdultModalMobileV2.presentation.AdultConfirmationViewModelV2$setStateVO$1", f = "AdultConfirmationViewModelV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdultConfirmationViewModelV2$setStateVO$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ UserAdultModalV2VO $dto;
    int label;
    final /* synthetic */ AdultConfirmationViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultConfirmationViewModelV2$setStateVO$1(AdultConfirmationViewModelV2 adultConfirmationViewModelV2, UserAdultModalV2VO userAdultModalV2VO, d<? super AdultConfirmationViewModelV2$setStateVO$1> dVar) {
        super(2, dVar);
        this.this$0 = adultConfirmationViewModelV2;
        this.$dto = userAdultModalV2VO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdultConfirmationViewModelV2$setStateVO$1(this.this$0, this.$dto, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Object value;
        String str;
        String str2;
        UserAdultModalV2DTO.Input input;
        String prevValue;
        String prevValue2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        x0Var = this.this$0.state;
        UserAdultModalV2VO userAdultModalV2VO = this.$dto;
        do {
            value = x0Var.getValue();
            UserAdultModalV2DTO.Input input2 = userAdultModalV2VO.getInput();
            str = "";
            if (input2 == null || (prevValue2 = input2.getPrevValue()) == null || (str2 = LocalDate.B(prevValue2).E("dd MMMM yyyy")) == null) {
                str2 = "";
            }
            UserAdultModalV2DTO.Input input3 = userAdultModalV2VO.getInput();
            if (input3 != null && (prevValue = input3.getPrevValue()) != null) {
                str = prevValue;
            }
            input = userAdultModalV2VO.getInput();
        } while (!x0Var.b(value, new BirthdateStateUi.ConfirmBirthdate(str2, str, input != null ? input.getError() : null)));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdultConfirmationViewModelV2$setStateVO$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
