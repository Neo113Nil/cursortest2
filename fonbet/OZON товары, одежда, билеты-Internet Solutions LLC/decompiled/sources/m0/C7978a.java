package m0;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {312}, m = "invokeSuspend")
/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7978a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super C7998k<Object, AbstractC8015t>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    C8006o f73648d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.jvm.internal.I f73649e;

    /* renamed from: f, reason: collision with root package name */
    int f73650f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7980b<Object, AbstractC8015t> f73651g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Object f73652h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC7992h<Object, AbstractC8015t> f73653i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f73654j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function1<C7980b<Object, AbstractC8015t>, Unit> f73655k;

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    static final class C1249a extends AbstractC7737t implements Function1<C8000l<Object, AbstractC8015t>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7980b<Object, AbstractC8015t> f73656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8006o<Object, AbstractC8015t> f73657c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C7980b<Object, AbstractC8015t>, Unit> f73658d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.I f73659e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1249a(C7980b<Object, AbstractC8015t> c7980b, C8006o<Object, AbstractC8015t> c8006o, Function1<? super C7980b<Object, AbstractC8015t>, Unit> function1, kotlin.jvm.internal.I i11) {
            super(1);
            this.f73656b = c7980b;
            this.f73657c = c8006o;
            this.f73658d = function1;
            this.f73659e = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C8000l<Object, AbstractC8015t> c8000l) {
            C8000l<Object, AbstractC8015t> c8000l2 = c8000l;
            C7980b<Object, AbstractC8015t> c7980b = this.f73656b;
            B0.j(c8000l2, c7980b.h());
            Object a11 = C7980b.a(c7980b, c8000l2.e());
            boolean d11 = Intrinsics.d(a11, c8000l2.e());
            Function1<C7980b<Object, AbstractC8015t>, Unit> function1 = this.f73658d;
            if (!d11) {
                c7980b.h().z(a11);
                this.f73657c.z(a11);
                if (function1 != null) {
                    function1.invoke(c7980b);
                }
                c8000l2.a();
                this.f73659e.f71783a = true;
            } else if (function1 != null) {
                function1.invoke(c7980b);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C7978a(C7980b<Object, AbstractC8015t> c7980b, Object obj, InterfaceC7992h<Object, AbstractC8015t> interfaceC7992h, long j11, Function1<? super C7980b<Object, AbstractC8015t>, Unit> function1, kotlin.coroutines.d<? super C7978a> dVar) {
        super(1, dVar);
        this.f73651g = c7980b;
        this.f73652h = obj;
        this.f73653i = interfaceC7992h;
        this.f73654j = j11;
        this.f73655k = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C7978a(this.f73651g, this.f73652h, this.f73653i, this.f73654j, this.f73655k, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super C7998k<Object, AbstractC8015t>> dVar) {
        return ((C7978a) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C8006o c8006o;
        kotlin.jvm.internal.I i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f73650f;
        C7980b<Object, AbstractC8015t> c7980b = this.f73651g;
        try {
            if (i12 == 0) {
                Sc.s.b(obj);
                c7980b.h().A(c7980b.j().a().invoke(this.f73652h));
                InterfaceC7992h<Object, AbstractC8015t> interfaceC7992h = this.f73653i;
                C7980b.d(c7980b, interfaceC7992h.f());
                C7980b.c(c7980b);
                C8006o<Object, AbstractC8015t> h11 = c7980b.h();
                C8006o c8006o2 = new C8006o(h11.m(), h11.getValue(), C8017u.a(h11.s()), h11.k(), Long.MIN_VALUE, h11.v());
                kotlin.jvm.internal.I i13 = new kotlin.jvm.internal.I();
                long j11 = this.f73654j;
                C1249a c1249a = new C1249a(c7980b, c8006o2, this.f73655k, i13);
                this.f73648d = c8006o2;
                this.f73649e = i13;
                this.f73650f = 1;
                if (B0.c(c8006o2, interfaceC7992h, j11, c1249a, this) == aVar) {
                    return aVar;
                }
                c8006o = c8006o2;
                i11 = i13;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f73649e;
                c8006o = this.f73648d;
                Sc.s.b(obj);
            }
            EnumC7994i enumC7994i = i11.f71783a ? EnumC7994i.BoundReached : EnumC7994i.Finished;
            C7980b.b(c7980b);
            return new C7998k(c8006o, enumC7994i);
        } catch (CancellationException e11) {
            C7980b.b(c7980b);
            throw e11;
        }
    }
}
