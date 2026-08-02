package g70;

import Sc.o;
import Sc.s;
import e70.InterfaceC6317d;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.main.OfflineMainViewModel$loadMainData$1", f = "OfflineMainViewModel.kt", l = {124, 134}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63952d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f63953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f63953e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f63953e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r7 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002d, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        V60.a aVar;
        V60.a aVar2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63952d;
        f fVar = this.f63953e;
        if (i11 == 0) {
            s.b(obj);
            aVar = fVar.f63957d;
            this.f63952d = 1;
            obj = aVar.n(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                InterfaceC6317d interfaceC6317d = (InterfaceC6317d) obj;
                if (interfaceC6317d instanceof InterfaceC6317d.b) {
                    fVar.f63962i = (TransferData) ((InterfaceC6317d.b) interfaceC6317d).a();
                } else {
                    if (!(interfaceC6317d instanceof InterfaceC6317d.a)) {
                        throw new o();
                    }
                    L80.a.b("OFFLINER", "loadTransferData cant load transferData");
                }
                f.g0(fVar);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        InterfaceC6317d interfaceC6317d2 = (InterfaceC6317d) obj;
        if (interfaceC6317d2 instanceof InterfaceC6317d.b) {
            fVar.f63961h = (MainData) ((InterfaceC6317d.b) interfaceC6317d2).a();
        } else {
            if (!(interfaceC6317d2 instanceof InterfaceC6317d.a)) {
                throw new o();
            }
            L80.a.b("OFFLINER", "loadMainData cant load mainData");
        }
        aVar2 = fVar.f63957d;
        this.f63952d = 2;
        obj = aVar2.j(this);
    }
}
