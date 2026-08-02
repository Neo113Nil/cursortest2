package jd0;

import Sc.InterfaceC4008j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.WebViewCookieSynchronizer$startTimer$1", f = "WebViewCookieSynchronizer.kt", l = {80, 81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class s extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f69809d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f69810e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f69811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(r rVar, kotlin.coroutines.d<? super s> dVar) {
        super(2, dVar);
        this.f69811f = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        s sVar = new s(this.f69811f, dVar);
        sVar.f69810e = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (jd0.r.e(r2, r7) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        M m12;
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f69809d;
        r rVar = this.f69811f;
        if (i11 == 0) {
            Sc.s.b(obj);
            m11 = (M) this.f69810e;
            if (N.f(m11)) {
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m12 = (M) this.f69810e;
                Sc.s.b(obj);
                m11 = m12;
                if (N.f(m11)) {
                    return Unit.f71690a;
                }
                interfaceC4008j = rVar.f69796a;
                long longValue = ((Number) interfaceC4008j.getValue()).longValue();
                this.f69810e = m11;
                this.f69809d = 1;
                if (Y.b(longValue, this) != aVar) {
                    m12 = m11;
                    this.f69810e = m12;
                    this.f69809d = 2;
                }
                return aVar;
            }
            m12 = (M) this.f69810e;
            Sc.s.b(obj);
            this.f69810e = m12;
            this.f69809d = 2;
        }
    }
}
