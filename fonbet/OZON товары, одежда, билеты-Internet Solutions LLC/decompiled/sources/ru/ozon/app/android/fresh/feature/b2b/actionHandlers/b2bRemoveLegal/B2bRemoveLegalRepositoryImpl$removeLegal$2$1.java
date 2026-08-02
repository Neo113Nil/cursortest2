package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

import Sc.s;
import Wc.a;
import We.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.api.B2bRemoveLegalApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalRepositoryImpl$removeLegal$2$1", f = "B2bRemoveLegalRepository.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bRemoveLegalRepositoryImpl$removeLegal$2$1 extends j implements Function2<M, d<? super B2bRemoveLegalResponse>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $postData;
    final /* synthetic */ B2bRemoveLegalRepositoryImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bRemoveLegalRepositoryImpl$removeLegal$2$1(B2bRemoveLegalRepositoryImpl b2bRemoveLegalRepositoryImpl, String str, String str2, d<? super B2bRemoveLegalRepositoryImpl$removeLegal$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = b2bRemoveLegalRepositoryImpl;
        this.$actionName = str;
        this.$postData = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bRemoveLegalRepositoryImpl$removeLegal$2$1(this.$this_runCatching, this.$actionName, this.$postData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B2bRemoveLegalApi b2bRemoveLegalApi;
        K jsonToRequestBody;
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
        b2bRemoveLegalApi = this.$this_runCatching.removeLegalApi;
        String str = this.$actionName;
        jsonToRequestBody = this.$this_runCatching.jsonToRequestBody(this.$postData);
        this.label = 1;
        Object removeLegal = b2bRemoveLegalApi.removeLegal(str, jsonToRequestBody, this);
        return removeLegal == aVar ? aVar : removeLegal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super B2bRemoveLegalResponse> dVar) {
        return ((B2bRemoveLegalRepositoryImpl$removeLegal$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
