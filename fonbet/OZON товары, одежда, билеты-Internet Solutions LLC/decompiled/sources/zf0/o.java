package zf0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qf0.EnumC9053a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.PeriodicPingInteractor$retryPingLaterIfNeed$1", f = "PeriodicPingInteractor.kt", l = {197, 198}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<h, kotlin.coroutines.d<? super EnumC9053a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f109047d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f109048e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f109049f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f109050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(k kVar, long j11, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f109049f = kVar;
        this.f109050g = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        o oVar = new o(this.f109049f, this.f109050g, dVar);
        oVar.f109048e = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h hVar, kotlin.coroutines.d<? super EnumC9053a> dVar) {
        return ((o) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (xe.Y.c(r7, r12) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        boolean d11;
        ru.ozon.android.ozonLogger.core.h a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109047d;
        k kVar = this.f109049f;
        if (i11 == 0) {
            s.b(obj);
            hVar = (h) this.f109048e;
            Af0.a aVar2 = kVar.f109013c;
            d11 = aVar2.d();
            long j11 = this.f109050g;
            if (d11 && (a11 = Af0.a.a(aVar2)) != null) {
                a11.b(Sh.b.c("Повторный запрос к ", hVar.g(), " через ", kotlin.time.b.p(j11)), null, null);
            }
            this.f109048e = hVar;
            this.f109047d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            hVar = (h) this.f109048e;
            s.b(obj);
        }
        this.f109048e = null;
        this.f109047d = 2;
        Enum d12 = k.d(kVar, hVar, this);
        return d12 == aVar ? aVar : d12;
    }
}
