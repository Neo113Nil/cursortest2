package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation;

import Ae.w0;
import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.VerificationEdoRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.api.VerificationEdoResponse;
import ru.ozon.app.android.utils.Result;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation.VerificationEdoCheckingOperatorViewModel$createVerificationRequest$1", f = "VerificationEdoCheckingOperatorViewModel.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 43}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VerificationEdoCheckingOperatorViewModel$createVerificationRequest$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $position;
    final /* synthetic */ String $type;
    Object L$0;
    int label;
    final /* synthetic */ VerificationEdoCheckingOperatorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationEdoCheckingOperatorViewModel$createVerificationRequest$1(VerificationEdoCheckingOperatorViewModel verificationEdoCheckingOperatorViewModel, String str, String str2, String str3, d<? super VerificationEdoCheckingOperatorViewModel$createVerificationRequest$1> dVar) {
        super(2, dVar);
        this.this$0 = verificationEdoCheckingOperatorViewModel;
        this.$actionName = str;
        this.$position = str2;
        this.$type = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VerificationEdoCheckingOperatorViewModel$createVerificationRequest$1(this.this$0, this.$actionName, this.$position, this.$type, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VerificationEdoRepository verificationEdoRepository;
        w0 w0Var;
        NotificationDTO defaultNotificationDTO;
        w0 w0Var2;
        Result result;
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            verificationEdoRepository = this.this$0.repository;
            String str = this.$actionName;
            String str2 = this.$position;
            String str3 = this.$type;
            this.label = 1;
            obj = verificationEdoRepository.createVerificationRequest(str, str2, str3, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                result = (Result) this.L$0;
                s.b(obj);
                x0Var = this.this$0._verificationStarted;
                Boolean isSuccess = ((VerificationEdoResponse) ((Result.Success) result).getValue()).isSuccess();
                x0Var.setValue(Boolean.valueOf(isSuccess == null ? isSuccess.booleanValue() : false));
                return Unit.f71690a;
            }
            s.b(obj);
        }
        Result result2 = (Result) obj;
        if (result2 instanceof Result.Success) {
            w0Var2 = this.this$0._notificationBar;
            VerificationEdoResponse.Notification notification = ((VerificationEdoResponse) ((Result.Success) result2).getValue()).getNotification();
            NotificationDTO notificationBar = notification != null ? notification.getNotificationBar() : null;
            this.L$0 = result2;
            this.label = 2;
            if (w0Var2.emit(notificationBar, this) != aVar) {
                result = result2;
                x0Var = this.this$0._verificationStarted;
                Boolean isSuccess2 = ((VerificationEdoResponse) ((Result.Success) result).getValue()).isSuccess();
                x0Var.setValue(Boolean.valueOf(isSuccess2 == null ? isSuccess2.booleanValue() : false));
                return Unit.f71690a;
            }
        } else {
            if (!(result2 instanceof Result.Failure)) {
                throw new o();
            }
            w0Var = this.this$0._notificationBar;
            defaultNotificationDTO = this.this$0.getDefaultNotificationDTO();
            this.label = 3;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VerificationEdoCheckingOperatorViewModel$createVerificationRequest$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
