package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeEvent;
import ru.ozon.app.android.account.orders.onorderchangenew.OrderChangeManager;
import ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientException;
import ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientRepository;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModelImpl$changeRecipient$1", f = "RecipientViewModel.kt", l = {68, 77}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class RecipientViewModelImpl$changeRecipient$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Pair<String, String> $firstAndLastName;
    final /* synthetic */ RecipientVO $item;
    final /* synthetic */ String $phone;
    Object L$0;
    int label;
    final /* synthetic */ RecipientViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecipientViewModelImpl$changeRecipient$1(RecipientViewModelImpl recipientViewModelImpl, RecipientVO recipientVO, Pair<String, String> pair, String str, d<? super RecipientViewModelImpl$changeRecipient$1> dVar) {
        super(2, dVar);
        this.this$0 = recipientViewModelImpl;
        this.$item = recipientVO;
        this.$firstAndLastName = pair;
        this.$phone = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RecipientViewModelImpl$changeRecipient$1(this.this$0, this.$item, this.$firstAndLastName, this.$phone, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (r11.putEvent(r1, r10) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        V<Boolean> loader;
        P changeRecipientResult;
        ChangeRecipientRepository changeRecipientRepository;
        String deleteAllExceptNumbers;
        OrderChangeManager orderChangeManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            try {
            } catch (Exception e11) {
                Lm0.a.f17149a.e(e11);
                ChangeRecipientException.ErrorData errorData = ((ChangeRecipientException) e11).getErrorData();
                this.this$0.getChangeRecipientResult().setValue(new RecipientViewModel.ChangeRecipientResult.Error(errorData.getToastMessage()));
                this.this$0.getErrorForName().setValue(errorData.getNameValidationError());
                this.this$0.getErrorForPhone().setValue(errorData.getPhoneValidationError());
                loader = this.this$0.getLoader();
            }
            if (i11 == 0) {
                s.b(obj);
                this.this$0.getLoader().setValue(Boolean.TRUE);
                changeRecipientResult = this.this$0.getChangeRecipientResult();
                changeRecipientRepository = this.this$0.repository;
                String regularId = this.$item.getRegularId();
                String orderNumber = this.$item.getOrderNumber();
                String e12 = this.$firstAndLastName.e();
                String f7 = this.$firstAndLastName.f();
                deleteAllExceptNumbers = RecipientViewModelKt.deleteAllExceptNumbers(this.$phone);
                ChangeRecipientModel changeRecipientModel = new ChangeRecipientModel(regularId, orderNumber, e12, f7, deleteAllExceptNumbers);
                this.L$0 = changeRecipientResult;
                this.label = 1;
                obj = changeRecipientRepository.changeRecipient(changeRecipientModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    loader = this.this$0.getLoader();
                    loader.setValue(Boolean.FALSE);
                    return Unit.f71690a;
                }
                changeRecipientResult = (SingleLiveEvent) this.L$0;
                s.b(obj);
            }
            changeRecipientResult.setValue(obj);
            orderChangeManager = this.this$0.orderChangeManager;
            OrderChangeEvent.RefreshScreen refreshScreen = OrderChangeEvent.RefreshScreen.INSTANCE;
            this.L$0 = null;
            this.label = 2;
        } catch (Throwable th2) {
            this.this$0.getLoader().setValue(Boolean.FALSE);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RecipientViewModelImpl$changeRecipient$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
