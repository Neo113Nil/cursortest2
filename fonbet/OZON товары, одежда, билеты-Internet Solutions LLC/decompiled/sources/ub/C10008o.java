package ub;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.ipc.DelayedAction$actionWithDelay$1", f = "DelayedAction.kt", l = {17}, m = "invokeSuspend")
/* renamed from: ub.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10008o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f100488d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f100489e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f100490f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10009p<Object> f100491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10008o(long j11, C10009p c10009p, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f100490f = j11;
        this.f100491g = c10009p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C10008o c10008o = new C10008o(this.f100490f, this.f100491g, dVar);
        c10008o.f100489e = obj;
        return c10008o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10008o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        Function1 function1;
        Function1 function12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f100488d;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m12 = (M) this.f100489e;
            this.f100489e = m12;
            this.f100488d = 1;
            if (Y.b(this.f100490f, this) == aVar) {
                return aVar;
            }
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.f100489e;
            Sc.s.b(obj);
        }
        N.e(m11);
        if (N.f(m11)) {
            C10009p<Object> c10009p = this.f100491g;
            function1 = ((C10009p) c10009p).f100493b;
            if (((Boolean) function1.invoke(null)).booleanValue()) {
                function12 = ((C10009p) c10009p).f100494c;
                function12.invoke(null);
            }
        }
        return Unit.f71690a;
    }
}
