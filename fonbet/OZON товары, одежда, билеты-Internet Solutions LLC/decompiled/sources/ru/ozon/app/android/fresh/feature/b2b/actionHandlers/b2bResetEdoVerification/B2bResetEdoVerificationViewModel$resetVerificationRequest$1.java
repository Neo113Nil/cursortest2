package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification;

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
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data.B2bResetEdoVerificationRepository;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data.B2bResetVerificationResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoStatusStorage;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationViewModel$resetVerificationRequest$1", f = "B2bResetEdoVerificationViewModel.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bResetEdoVerificationViewModel$resetVerificationRequest$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ B2bResetEdoVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bResetEdoVerificationViewModel$resetVerificationRequest$1(B2bResetEdoVerificationViewModel b2bResetEdoVerificationViewModel, String str, String str2, d<? super B2bResetEdoVerificationViewModel$resetVerificationRequest$1> dVar) {
        super(2, dVar);
        this.this$0 = b2bResetEdoVerificationViewModel;
        this.$actionName = str;
        this.$id = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bResetEdoVerificationViewModel$resetVerificationRequest$1(this.this$0, this.$actionName, this.$id, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B2bResetEdoVerificationRepository b2bResetEdoVerificationRepository;
        x0 x0Var;
        x0 x0Var2;
        AddEdoStatusStorage addEdoStatusStorage;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            b2bResetEdoVerificationRepository = this.this$0.repository;
            String str = this.$actionName;
            String str2 = this.$id;
            this.label = 1;
            obj = b2bResetEdoVerificationRepository.resetVerificationRequestApi(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            x0Var2 = this.this$0._screenState;
            x0Var2.setValue(new B2bResetEdoVerificationViewModel.ScreenState.Success(((B2bResetVerificationResponse) ((Result.Success) result).getValue()).isSuccess()));
            addEdoStatusStorage = this.this$0.addEdoStatusStorage;
            addEdoStatusStorage.updateStatusEdo();
        } else {
            if (!(result instanceof Result.Failure)) {
                throw new o();
            }
            x0Var = this.this$0._screenState;
            x0Var.setValue(B2bResetEdoVerificationViewModel.ScreenState.Error.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((B2bResetEdoVerificationViewModel$resetVerificationRequest$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
