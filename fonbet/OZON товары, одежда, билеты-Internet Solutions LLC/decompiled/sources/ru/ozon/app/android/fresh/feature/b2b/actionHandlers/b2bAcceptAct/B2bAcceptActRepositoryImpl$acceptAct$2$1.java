package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import B0.C2454a;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.api.B2bAcceptActApi;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.data.B2bAcceptActResponseDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActResponseDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActResponseDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActRepositoryImpl$acceptAct$2$1", f = "B2bAcceptActRepository.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bAcceptActRepositoryImpl$acceptAct$2$1 extends j implements Function2<M, d<? super B2bAcceptActResponseDTO>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $documentId;
    final /* synthetic */ B2bAcceptActRepositoryImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bAcceptActRepositoryImpl$acceptAct$2$1(B2bAcceptActRepositoryImpl b2bAcceptActRepositoryImpl, String str, String str2, d<? super B2bAcceptActRepositoryImpl$acceptAct$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = b2bAcceptActRepositoryImpl;
        this.$actionName = str;
        this.$documentId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bAcceptActRepositoryImpl$acceptAct$2$1(this.$this_runCatching, this.$actionName, this.$documentId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B2bAcceptActApi b2bAcceptActApi;
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
        b2bAcceptActApi = this.$this_runCatching.acceptActApi;
        String str = this.$actionName;
        Map<String, String> b11 = C2454a.b("documentId", this.$documentId);
        this.label = 1;
        Object acceptAct = b2bAcceptActApi.acceptAct(str, b11, this);
        return acceptAct == aVar ? aVar : acceptAct;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super B2bAcceptActResponseDTO> dVar) {
        return ((B2bAcceptActRepositoryImpl$acceptAct$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
