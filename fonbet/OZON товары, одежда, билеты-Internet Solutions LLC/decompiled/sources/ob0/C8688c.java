package ob0;

import Vb0.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ob0.s;
import wb0.C10469a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotActionHandler$onAntibotResponse$result$1", f = "AntibotActionHandler.kt", l = {78, 277}, m = "invokeSuspend")
/* renamed from: ob0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8688c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super s>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Je.d f77923d;

    /* renamed from: e, reason: collision with root package name */
    l f77924e;

    /* renamed from: f, reason: collision with root package name */
    int f77925f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ l f77926g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10469a f77927h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8688c(l lVar, C10469a c10469a, kotlin.coroutines.d<? super C8688c> dVar) {
        super(2, dVar);
        this.f77926g = lVar;
        this.f77927h = c10469a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C8688c(this.f77926g, this.f77927h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super s> dVar) {
        return ((C8688c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r15.a(r14) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Je.d dVar;
        Je.d dVar2;
        Je.d dVar3;
        s sVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f77925f;
        C10469a c10469a = this.f77927h;
        l lVar = this.f77926g;
        try {
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    dVar2 = lVar.f77965k;
                    if (dVar2.tryLock()) {
                        this.f77925f = 1;
                        obj = l.g(lVar, c10469a, this);
                        if (obj == aVar) {
                        }
                        lVar.f77966l = (s) obj;
                        return (s) obj;
                    }
                    dVar3 = lVar.f77965k;
                    this.f77923d = dVar3;
                    this.f77924e = lVar;
                    this.f77925f = 2;
                    return aVar;
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    lVar.f77966l = (s) obj;
                    return (s) obj;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = this.f77924e;
                Je.d dVar4 = this.f77923d;
                Sc.s.b(obj);
                dVar3 = dVar4;
                try {
                    sVar = lVar.f77966l;
                    if (sVar != null) {
                        return sVar;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                } finally {
                    dVar3.c(null);
                }
            } catch (Throwable th2) {
                b.a.c(Vb0.b.f28514a, th2);
                s sVar2 = new s(c10469a.f(), false, s.a.BlockAntibot, new s.e(s.f.FingerprintChallengeNoNeed), new s.g(s.h.JsChallengeNoUrl, (s.d) null, 6), new s.b(s.c.CaptchaChallengeNoUrl, null));
                lVar.f77966l = sVar2;
                return sVar2;
            }
            b.a.c(Vb0.b.f28514a, th2);
            s sVar22 = new s(c10469a.f(), false, s.a.BlockAntibot, new s.e(s.f.FingerprintChallengeNoNeed), new s.g(s.h.JsChallengeNoUrl, (s.d) null, 6), new s.b(s.c.CaptchaChallengeNoUrl, null));
            lVar.f77966l = sVar22;
            return sVar22;
        } finally {
            dVar = lVar.f77965k;
            dVar.c(null);
        }
    }
}
