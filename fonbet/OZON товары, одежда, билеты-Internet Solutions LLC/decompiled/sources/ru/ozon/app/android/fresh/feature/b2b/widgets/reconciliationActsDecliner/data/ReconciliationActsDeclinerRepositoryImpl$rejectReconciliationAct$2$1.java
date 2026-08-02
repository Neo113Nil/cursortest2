package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.ReconciliationActsDeclinerApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.RejectReconciliationActRequestDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.RejectReconciliationActResponseDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActResponseDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActResponseDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$2$1", f = "ReconciliationActsDeclinerRepositoryImpl.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$2$1 extends j implements Function2<M, d<? super RejectReconciliationActResponseDTO>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ RejectReconciliationActRequestDTO $request;
    final /* synthetic */ ReconciliationActsDeclinerRepositoryImpl $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$2$1(ReconciliationActsDeclinerRepositoryImpl reconciliationActsDeclinerRepositoryImpl, String str, RejectReconciliationActRequestDTO rejectReconciliationActRequestDTO, d<? super ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$2$1> dVar) {
        super(2, dVar);
        this.$this_runCatching = reconciliationActsDeclinerRepositoryImpl;
        this.$actionName = str;
        this.$request = rejectReconciliationActRequestDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$2$1(this.$this_runCatching, this.$actionName, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReconciliationActsDeclinerApi reconciliationActsDeclinerApi;
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
        reconciliationActsDeclinerApi = this.$this_runCatching.api;
        String str = this.$actionName;
        RejectReconciliationActRequestDTO rejectReconciliationActRequestDTO = this.$request;
        this.label = 1;
        Object rejectReconciliationAct = reconciliationActsDeclinerApi.rejectReconciliationAct(str, rejectReconciliationActRequestDTO, this);
        return rejectReconciliationAct == aVar ? aVar : rejectReconciliationAct;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super RejectReconciliationActResponseDTO> dVar) {
        return ((ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
