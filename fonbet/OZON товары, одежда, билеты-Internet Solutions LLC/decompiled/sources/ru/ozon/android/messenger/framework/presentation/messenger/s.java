package ru.ozon.android.messenger.framework.presentation.messenger;

import androidx.lifecycle.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.repository.n0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$startConnection$1", f = "MessengerViewModel.kt", l = {135, 141}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91400d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f91401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(l lVar, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f91401e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new s(this.f91401e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r7.d(r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r7.t(r6) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n0 n0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91400d;
        l lVar = this.f91401e;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC9330a value = lVar.f91368b.l().getValue();
            Intrinsics.checkNotNullParameter(value, "<this>");
            if (!(value instanceof AbstractC9330a.C1590a) && !(value instanceof AbstractC9330a.b)) {
                ru.ozon.android.messenger.framework.domain.repository.b bVar = lVar.f91368b;
                this.f91400d = 1;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.framework.data.local.r value2 = lVar.f91368b.C().getValue();
        if (value2 != ru.ozon.android.messenger.framework.data.local.r.INITIALIZING && value2 != ru.ozon.android.messenger.framework.data.local.r.INITIALIZED) {
            C10727i.c(x0.a(lVar), null, null, new p(lVar, null), 3);
        }
        n0Var = lVar.f91370d;
        this.f91400d = 2;
    }
}
