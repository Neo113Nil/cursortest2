package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Ae.x0;
import Sc.o;
import Sc.s;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.userAdultModalMobileV2.presentation.AdultConfirmationViewModelV2$setDate$1", f = "AdultConfirmationViewModelV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdultConfirmationViewModelV2$setDate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Bundle $data;
    int label;
    final /* synthetic */ AdultConfirmationViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultConfirmationViewModelV2$setDate$1(Bundle bundle, AdultConfirmationViewModelV2 adultConfirmationViewModelV2, d<? super AdultConfirmationViewModelV2$setDate$1> dVar) {
        super(2, dVar);
        this.$data = bundle;
        this.this$0 = adultConfirmationViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdultConfirmationViewModelV2$setDate$1(this.$data, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Object value;
        BirthdateStateUi.ConfirmBirthdate confirmBirthdate;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Serializable serializable = this.$data.getSerializable("DATE_ARG");
        LocalDate localDate = serializable instanceof LocalDate ? (LocalDate) serializable : null;
        if (localDate == null) {
            return Unit.f71690a;
        }
        x0Var = this.this$0.state;
        do {
            value = x0Var.getValue();
            BirthdateStateUi birthdateStateUi = (BirthdateStateUi) value;
            if (birthdateStateUi instanceof BirthdateStateUi.ConfirmBirthdate) {
                String E11 = localDate.E("dd MMMM yyyy");
                Intrinsics.checkNotNullExpressionValue(E11, "toString(...)");
                String E12 = localDate.E("yyyy-MM-dd");
                Intrinsics.checkNotNullExpressionValue(E12, "toString(...)");
                confirmBirthdate = ((BirthdateStateUi.ConfirmBirthdate) birthdateStateUi).copy(E11, E12, null);
            } else {
                if (!(birthdateStateUi instanceof BirthdateStateUi.Loading)) {
                    throw new o();
                }
                String E13 = localDate.E("dd MMMM yyyy");
                Intrinsics.checkNotNullExpressionValue(E13, "toString(...)");
                String E14 = localDate.E("yyyy-MM-dd");
                Intrinsics.checkNotNullExpressionValue(E14, "toString(...)");
                confirmBirthdate = new BirthdateStateUi.ConfirmBirthdate(E13, E14, null);
            }
        } while (!x0Var.b(value, confirmBirthdate));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdultConfirmationViewModelV2$setDate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
