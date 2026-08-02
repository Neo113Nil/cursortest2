package ru.ozon.app.android.travel.data.storage.offline;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1", f = "OfflineTravelStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1 extends j implements Function2<M, d<? super String>, Object> {
    final /* synthetic */ OfflineTravelWidgetsStateDTO $state;
    int label;
    final /* synthetic */ OfflineTravelStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1(OfflineTravelStorageImpl offlineTravelStorageImpl, OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO, d<? super OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1> dVar) {
        super(2, dVar);
        this.this$0 = offlineTravelStorageImpl;
        this.$state = offlineTravelWidgetsStateDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1(this.this$0, this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonSerializer jsonSerializer;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        jsonSerializer = this.this$0.jsonSerializer;
        return jsonSerializer.toJson((JsonSerializer) this.$state, (Class<JsonSerializer>) OfflineTravelWidgetsStateDTO.class);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super String> dVar) {
        return ((OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
