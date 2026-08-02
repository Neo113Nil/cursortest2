package l0;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.E0;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.D0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {756}, m = "invokeSuspend")
/* renamed from: l0.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7777v extends kotlin.coroutines.jvm.internal.j implements Function2<E0<Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f72157d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f72158e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ D0<O> f72159f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f72160g;

    /* renamed from: l0.v$a */
    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D0<O> f72161b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0<O> d02) {
            super(0);
            this.f72161b = d02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            D0<O> d02 = this.f72161b;
            O h11 = d02.h();
            O o11 = O.PostExit;
            return Boolean.valueOf(h11 == o11 && d02.n() == o11);
        }
    }

    /* renamed from: l0.v$b */
    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E0<Boolean> f72162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D0<O> f72163b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f72164c;

        b(E0 e02, D0 d02, InterfaceC3978p0 interfaceC3978p0) {
            this.f72162a = e02;
            this.f72163b = d02;
            this.f72164c = interfaceC3978p0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            boolean z11;
            if (((Boolean) obj).booleanValue()) {
                Function2 function2 = (Function2) this.f72164c.getValue();
                D0<O> d02 = this.f72163b;
                z11 = ((Boolean) function2.invoke(d02.h(), d02.n())).booleanValue();
            } else {
                z11 = false;
            }
            this.f72162a.setValue(Boolean.valueOf(z11));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7777v(D0 d02, InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f72159f = d02;
        this.f72160g = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C7777v c7777v = new C7777v(this.f72159f, this.f72160g, dVar);
        c7777v.f72158e = obj;
        return c7777v;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E0<Boolean> e02, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7777v) create(e02, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f72157d;
        if (i11 == 0) {
            Sc.s.b(obj);
            E0 e02 = (E0) this.f72158e;
            D0<O> d02 = this.f72159f;
            InterfaceC2395h m11 = n1.m(new a(d02));
            b bVar = new b(e02, d02, this.f72160g);
            this.f72157d = 1;
            if (((AbstractC2381a) m11).collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
