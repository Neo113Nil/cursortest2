package pZ;

import Je.InterfaceC3394a;
import Sc.s;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pZ.C8882c;
import xe.C10720e0;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.compass.destination.AsyncRedirectDestination$NavHandler$redirectInternal$1", f = "AsyncRedirectDestination.kt", l = {72, 51, 59}, m = "invokeSuspend")
/* renamed from: pZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8881b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC3394a f80351d;

    /* renamed from: e, reason: collision with root package name */
    EZ.e f80352e;

    /* renamed from: f, reason: collision with root package name */
    int f80353f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C8882c.a f80354g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ EZ.e<C8882c> f80355h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f80356i;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.compass.destination.AsyncRedirectDestination$NavHandler$redirectInternal$1$1", f = "AsyncRedirectDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pZ.b$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C8882c.a f80357d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EZ.e<C8882c> f80358e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f80359f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f80360g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C8882c.a aVar, EZ.e<C8882c> eVar, f fVar, int i11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80357d = aVar;
            this.f80358e = eVar;
            this.f80359f = fVar;
            this.f80360g = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f80357d, this.f80358e, this.f80359f, this.f80360g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            this.f80357d.redirect(this.f80358e.e(this.f80359f), this.f80360g);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8881b(C8882c.a aVar, EZ.e<C8882c> eVar, int i11, kotlin.coroutines.d<? super C8881b> dVar) {
        super(2, dVar);
        this.f80354g = aVar;
        this.f80355h = eVar;
        this.f80356i = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C8881b(this.f80354g, this.f80355h, this.f80356i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8881b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (xe.C10727i.f(r12, r2, r11) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[Catch: all -> 0x0025, CancellationException -> 0x0029, Exception -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0025, blocks: (B:15:0x0021, B:16:0x0067, B:18:0x006c, B:27:0x009f, B:29:0x0099), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Je.a] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Je.d dVar;
        EZ.e<C8882c> eVar;
        InterfaceC3394a interfaceC3394a;
        Function1 function1;
        f fVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f80353f;
        EZ.e<C8882c> eVar2 = this.f80355h;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (r12 == 0) {
                s.b(obj);
                dVar = this.f80354g.f80363a;
                this.f80351d = dVar;
                this.f80352e = eVar2;
                this.f80353f = 1;
                if (dVar.a(this) != aVar) {
                    eVar = eVar2;
                }
                return aVar;
            }
            if (r12 == 1) {
                eVar = this.f80352e;
                ?? r32 = this.f80351d;
                s.b(obj);
                dVar = r32;
            } else {
                if (r12 != 2) {
                    if (r12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC3394a = this.f80351d;
                try {
                    s.b(obj);
                    fVar = (f) obj;
                    if (fVar != null) {
                        Unit unit = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit;
                    }
                    interfaceC3394a.c(null);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    a aVar2 = new a(this.f80354g, eVar2, fVar, this.f80356i, null);
                    this.f80351d = null;
                    this.f80353f = 3;
                } catch (CancellationException e11) {
                    e = e11;
                    throw e;
                } catch (Exception unused) {
                    Unit unit2 = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return unit2;
                }
            }
            function1 = eVar.b().f80361a;
            this.f80351d = dVar;
            this.f80352e = null;
            this.f80353f = 2;
            Object invoke = function1.invoke(this);
            if (invoke != aVar) {
                interfaceC3394a = dVar;
                obj = invoke;
                fVar = (f) obj;
                if (fVar != null) {
                }
            }
            return aVar;
        } catch (CancellationException e12) {
            e = e12;
            throw e;
        } catch (Exception unused2) {
            interfaceC3394a = dVar;
            Unit unit22 = Unit.f71690a;
            interfaceC3394a.c(null);
            return unit22;
        } catch (Throwable th3) {
            th = th3;
            r12 = dVar;
            Throwable th4 = th;
            r12.c(null);
            throw th4;
        }
    }
}
