package ee0;

import Ae.C0;
import Sc.s;
import ee0.InterfaceC6350a;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import we0.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.ClusterRenderer$2", f = "ClusterRenderer.kt", l = {66, 72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<u, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f62183d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f62184e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f62185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f62185f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(this.f62185f, dVar);
        dVar2.f62184e = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r1.emit(r3, r6) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        HashMap hashMap2;
        C0 c02;
        C0 c03;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f62183d;
        if (i11 != 0) {
            if (i11 == 1) {
                s.b(obj);
                return Unit.f71690a;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
        s.b(obj);
        u uVar = (u) this.f62184e;
        e eVar = this.f62185f;
        hashMap = eVar.f62192g;
        we0.s sVar = (we0.s) hashMap.get(uVar.e());
        if (sVar == null) {
            hashMap2 = eVar.f62193h;
            u uVar2 = (u) hashMap2.get(uVar.e());
            if (uVar2 != null) {
                c02 = eVar.f62189d;
                InterfaceC6350a.b bVar = new InterfaceC6350a.b(uVar2);
                this.f62183d = 2;
            }
            return Unit.f71690a;
        }
        c03 = eVar.f62189d;
        InterfaceC6350a.C0978a c0978a = new InterfaceC6350a.C0978a(sVar);
        this.f62183d = 1;
        return aVar;
    }
}
