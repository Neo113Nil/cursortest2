package ru.ozon.app.android.rfbs.deliverycomplain.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.csma.api.models.SendComplainResponse;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.models.SendComplainParams;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/csma/api/models/SendComplainResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/csma/api/models/SendComplainResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.rfbs.deliverycomplain.presentation.ComplainViewModel$sendComplain$1$1$1", f = "ComplainViewModel.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComplainViewModel$sendComplain$1$1$1 extends j implements Function2<M, d<? super SendComplainResponse>, Object> {
    final /* synthetic */ SendComplainParams $params;
    int label;
    final /* synthetic */ ComplainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplainViewModel$sendComplain$1$1$1(ComplainViewModel complainViewModel, SendComplainParams sendComplainParams, d<? super ComplainViewModel$sendComplain$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = complainViewModel;
        this.$params = sendComplainParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ComplainViewModel$sendComplain$1$1$1(this.this$0, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerActionApi composerActionApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        composerActionApi = this.this$0.api;
        String actionName = this.$params.getActionName();
        String jSONObject = new JSONObject(this.$params.getRequestParams()).toString();
        this.label = 1;
        Object sendComplain = composerActionApi.sendComplain(actionName, jSONObject, this);
        return sendComplain == aVar ? aVar : sendComplain;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super SendComplainResponse> dVar) {
        return ((ComplainViewModel$sendComplain$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
