package v10;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ext.FlowExtKt$launchInUnconfined$1", f = "FlowExt.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f101661d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2408n0 f101662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C2408n0 c2408n0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f101662e = c2408n0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f101662e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f101661d;
        if (i11 == 0) {
            s.b(obj);
            this.f101661d = 1;
            if (C2399j.g(this.f101662e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
