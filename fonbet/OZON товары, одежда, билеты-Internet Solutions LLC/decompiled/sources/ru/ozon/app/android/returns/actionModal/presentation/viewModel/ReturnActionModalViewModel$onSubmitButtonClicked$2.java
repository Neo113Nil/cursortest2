package ru.ozon.app.android.returns.actionModal.presentation.viewModel;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.returns.actionModal.data.ReturnActionModalRepository;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionRequestDto;
import ru.ozon.app.android.returns.actionModal.data.dto.processReturnAction.ProcessReturnActionResponseDto;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.actionModal.presentation.viewModel.ReturnActionModalViewModel$onSubmitButtonClicked$2", f = "ReturnActionModalViewModel.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnActionModalViewModel$onSubmitButtonClicked$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ ProcessReturnActionRequestDto $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReturnActionModalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnActionModalViewModel$onSubmitButtonClicked$2(ReturnActionModalViewModel returnActionModalViewModel, String str, ProcessReturnActionRequestDto processReturnActionRequestDto, d<? super ReturnActionModalViewModel$onSubmitButtonClicked$2> dVar) {
        super(2, dVar);
        this.this$0 = returnActionModalViewModel;
        this.$actionName = str;
        this.$request = processReturnActionRequestDto;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ReturnActionModalViewModel$onSubmitButtonClicked$2 returnActionModalViewModel$onSubmitButtonClicked$2 = new ReturnActionModalViewModel$onSubmitButtonClicked$2(this.this$0, this.$actionName, this.$request, dVar);
        returnActionModalViewModel$onSubmitButtonClicked$2.L$0 = obj;
        return returnActionModalViewModel$onSubmitButtonClicked$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ReturnActionModalRepository returnActionModalRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                ReturnActionModalViewModel returnActionModalViewModel = this.this$0;
                String str = this.$actionName;
                ProcessReturnActionRequestDto processReturnActionRequestDto = this.$request;
                r.Companion companion = r.INSTANCE;
                returnActionModalRepository = returnActionModalViewModel.repository;
                this.label = 1;
                obj = returnActionModalRepository.processAction(str, processReturnActionRequestDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (ProcessReturnActionResponseDto) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        ReturnActionModalViewModel returnActionModalViewModel2 = this.this$0;
        if (!(a11 instanceof r.b)) {
            returnActionModalViewModel2.onSuccessResponse((ProcessReturnActionResponseDto) a11);
        }
        ReturnActionModalViewModel returnActionModalViewModel3 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            returnActionModalViewModel3.onErrorResponse(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReturnActionModalViewModel$onSubmitButtonClicked$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
