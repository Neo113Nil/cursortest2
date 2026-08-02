package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import Ae.w0;
import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.api.AddConsigneeResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewModel;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.utils.Result;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewModel$addConsignee$1", f = "AddConsigneeViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddConsigneeViewModel$addConsignee$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $address;
    final /* synthetic */ String $branch;
    final /* synthetic */ String $kpp;
    int label;
    final /* synthetic */ AddConsigneeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewModel$addConsignee$1(AddConsigneeViewModel addConsigneeViewModel, String str, String str2, String str3, d<? super AddConsigneeViewModel$addConsignee$1> dVar) {
        super(2, dVar);
        this.this$0 = addConsigneeViewModel;
        this.$kpp = str;
        this.$branch = str2;
        this.$address = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddConsigneeViewModel$addConsignee$1(this.this$0, this.$kpp, this.$branch, this.$address, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        AddConsigneeRepository addConsigneeRepository;
        AddConsigneeViewModel$addConsignee$1 addConsigneeViewModel$addConsignee$1;
        x0 x0Var2;
        x0 x0Var3;
        w0 w0Var;
        NotificationDTO notificationBar;
        x0 x0Var4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0._screenState;
            x0Var.setValue(AddConsigneeViewModel.ScreenState.Idle.INSTANCE);
            addConsigneeRepository = this.this$0.addConsigneeRepository;
            String str = this.$kpp;
            String str2 = this.$branch;
            String str3 = str2 == null ? "" : str2;
            String str4 = this.$address;
            String str5 = str4 == null ? "" : str4;
            this.label = 1;
            addConsigneeViewModel$addConsignee$1 = this;
            obj = addConsigneeRepository.addConsignee("b2bAddConsignee", str, str3, str5, addConsigneeViewModel$addConsignee$1);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            addConsigneeViewModel$addConsignee$1 = this;
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            AddConsigneeResponse addConsigneeResponse = (AddConsigneeResponse) ((Result.Success) result).getValue();
            if (addConsigneeResponse.isSuccess()) {
                AddConsigneeResponse.Notification notification = addConsigneeResponse.getNotification();
                if (notification != null && (notificationBar = notification.getNotificationBar()) != null) {
                    x0Var4 = addConsigneeViewModel$addConsignee$1.this$0._screenState;
                    x0Var4.setValue(new AddConsigneeViewModel.ScreenState.Success(notificationBar));
                }
            } else {
                if (addConsigneeResponse.getErrors() != null) {
                    w0Var = addConsigneeViewModel$addConsignee$1.this$0._notFullAddressError;
                    w0Var.tryEmit(addConsigneeResponse.getErrors().get(FormPageDTO.Field.FIELD_TYPE_ADDRESS));
                }
                x0Var3 = addConsigneeViewModel$addConsignee$1.this$0._screenState;
                AddConsigneeResponse.Notification notification2 = addConsigneeResponse.getNotification();
                NotificationDTO notificationBar2 = notification2 != null ? notification2.getNotificationBar() : null;
                x0Var3.setValue(new AddConsigneeViewModel.ScreenState.ValidationError(notificationBar2 != null ? notificationBar2 : null));
            }
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            x0Var2 = addConsigneeViewModel$addConsignee$1.this$0._screenState;
            x0Var2.setValue(AddConsigneeViewModel.ScreenState.Error.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddConsigneeViewModel$addConsignee$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
