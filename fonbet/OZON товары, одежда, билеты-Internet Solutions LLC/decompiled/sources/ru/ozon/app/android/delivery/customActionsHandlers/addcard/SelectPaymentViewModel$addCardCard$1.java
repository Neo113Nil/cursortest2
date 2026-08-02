package ru.ozon.app.android.delivery.customActionsHandlers.addcard;

import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.AddCardResponse;
import ru.ozon.app.android.navigation.LinkGenerator;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel$addCardCard$1", f = "SelectPaymentViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SelectPaymentViewModel$addCardCard$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Map<String, String> $body;
    int label;
    final /* synthetic */ SelectPaymentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectPaymentViewModel$addCardCard$1(SelectPaymentViewModel selectPaymentViewModel, String str, Map<String, String> map, d<? super SelectPaymentViewModel$addCardCard$1> dVar) {
        super(2, dVar);
        this.this$0 = selectPaymentViewModel;
        this.$actionName = str;
        this.$body = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SelectPaymentViewModel$addCardCard$1(this.this$0, this.$actionName, this.$body, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SelectPaymentRepository selectPaymentRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                selectPaymentRepository = this.this$0.repository;
                String str = this.$actionName;
                Map<String, String> map = this.$body;
                this.label = 1;
                obj = selectPaymentRepository.addCard(str, map, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            V<SelectPaymentViewModel.Action> singleAction = this.this$0.getSingleAction();
            String uri = LinkGenerator.payment$default(LinkGenerator.INSTANCE, ((AddCardResponse) obj).getUrl(), null, 2, null).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            Map<String, String> map2 = this.$body;
            String str2 = map2 != null ? map2.get("successRefreshDeeplink") : null;
            if (str2 == null) {
                str2 = "";
            }
            singleAction.setValue(new SelectPaymentViewModel.Action.Success(uri, str2));
        } catch (Exception e11) {
            this.this$0.handleAddCardException(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SelectPaymentViewModel$addCardCard$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
