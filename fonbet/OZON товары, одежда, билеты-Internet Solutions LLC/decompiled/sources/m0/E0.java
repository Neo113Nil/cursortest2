package m0;

import S0.C3961h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1227}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class E0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    float f73518d;

    /* renamed from: e, reason: collision with root package name */
    int f73519e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f73520f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ D0<Object> f73521g;

    static final class a extends AbstractC7737t implements Function1<Long, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D0<Object> f73522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f73523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0<Object> d02, float f7) {
            super(1);
            this.f73522b = d02;
            this.f73523c = f7;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l11) {
            long longValue = l11.longValue();
            D0<Object> d02 = this.f73522b;
            if (!d02.p()) {
                d02.r(this.f73523c, longValue);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E0(D0<Object> d02, kotlin.coroutines.d<? super E0> dVar) {
        super(2, dVar);
        this.f73521g = d02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        E0 e02 = new E0(this.f73521g, dVar);
        e02.f73520f = obj;
        return e02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((E0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        float i11;
        xe.M m11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f73519e;
        if (i12 == 0) {
            Sc.s.b(obj);
            xe.M m12 = (xe.M) this.f73520f;
            i11 = B0.i(m12.getCoroutineContext());
            m11 = m12;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f73518d;
            m11 = (xe.M) this.f73520f;
            Sc.s.b(obj);
        }
        while (xe.N.f(m11)) {
            a aVar2 = new a(this.f73521g, i11);
            this.f73520f = m11;
            this.f73518d = i11;
            this.f73519e = 1;
            if (C3961h0.a(getContext()).v(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }
}
