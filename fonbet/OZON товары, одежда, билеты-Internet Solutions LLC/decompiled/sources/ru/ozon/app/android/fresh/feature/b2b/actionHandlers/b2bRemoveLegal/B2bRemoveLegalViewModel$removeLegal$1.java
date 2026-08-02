package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

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
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalParams;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalResponse;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalViewModel$removeLegal$1", f = "B2bRemoveLegalViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bRemoveLegalViewModel$removeLegal$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ B2bRemoveLegalParams $params;
    int label;
    final /* synthetic */ B2bRemoveLegalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bRemoveLegalViewModel$removeLegal$1(B2bRemoveLegalViewModel b2bRemoveLegalViewModel, String str, B2bRemoveLegalParams b2bRemoveLegalParams, d<? super B2bRemoveLegalViewModel$removeLegal$1> dVar) {
        super(2, dVar);
        this.this$0 = b2bRemoveLegalViewModel;
        this.$actionName = str;
        this.$params = b2bRemoveLegalParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bRemoveLegalViewModel$removeLegal$1(this.this$0, this.$actionName, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        B2bRemoveLegalRepository b2bRemoveLegalRepository;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0._screenState;
            x0Var.setValue(B2bRemoveLegalViewModel.ScreenState.Loading.INSTANCE);
            b2bRemoveLegalRepository = this.this$0.repository;
            String str = this.$actionName;
            String postData = this.$params.getPostData();
            this.label = 1;
            obj = b2bRemoveLegalRepository.removeLegal(str, postData, this);
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
        if (result instanceof Result.Failure) {
            x0Var4 = this.this$0._screenState;
            x0Var4.setValue(new B2bRemoveLegalViewModel.ScreenState.Error(ScreenStateExtKt.toMessage(((Result.Failure) result).getThrowable())));
        } else {
            if (!(result instanceof Result.Success)) {
                throw new o();
            }
            B2bRemoveLegalResponse b2bRemoveLegalResponse = (B2bRemoveLegalResponse) ((Result.Success) result).getValue();
            if (b2bRemoveLegalResponse.isSuccess()) {
                x0Var3 = this.this$0._screenState;
                x0Var3.setValue(new B2bRemoveLegalViewModel.ScreenState.Success(this.$params.getSuccessMessage(), this.$params.getShouldPopToRoot()));
            } else {
                B2bRemoveLegalResponse.Data data = b2bRemoveLegalResponse.getData();
                if (data != null) {
                    x0Var2 = this.this$0._screenState;
                    x0Var2.setValue(new B2bRemoveLegalViewModel.ScreenState.RemoveError(data));
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((B2bRemoveLegalViewModel$removeLegal$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
