package e;

import Ae.C2399j;
import Ae.C2425z;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.activity.C5035b;
import fd.InterfaceC6511n;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;
import ze.C11115c;
import ze.EnumC11113a;

/* renamed from: e.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6237l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f61706a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C11115c f61707b = ze.k.a(-2, 4, EnumC11113a.SUSPEND);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B0 f61708c;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {156}, m = "invokeSuspend")
    /* renamed from: e.l$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        I f61709d;

        /* renamed from: e, reason: collision with root package name */
        int f61710e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC2395h<C5035b>, kotlin.coroutines.d<? super Unit>, Object> f61711f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C6237l f61712g;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
        /* renamed from: e.l$a$a, reason: collision with other inner class name */
        static final class C0962a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super C5035b>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ I f61713d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0962a(I i11, kotlin.coroutines.d<? super C0962a> dVar) {
                super(3, dVar);
                this.f61713d = i11;
            }

            @Override // fd.InterfaceC6511n
            public final Object invoke(InterfaceC2397i<? super C5035b> interfaceC2397i, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
                return new C0962a(this.f61713d, dVar).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f61713d.f71783a = true;
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super InterfaceC2395h<C5035b>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, C6237l c6237l, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f61711f = function2;
            this.f61712g = c6237l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f61711f, this.f61712g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            I i11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i12 = this.f61710e;
            if (i12 == 0) {
                s.b(obj);
                I i13 = new I();
                C2425z c2425z = new C2425z(C2399j.k(this.f61712g.c()), new C0962a(i13, null));
                this.f61709d = i13;
                this.f61710e = 1;
                if (this.f61711f.invoke(c2425z, this) == aVar) {
                    return aVar;
                }
                i11 = i13;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f61709d;
                s.b(obj);
            }
            if (i11.f71783a) {
                return Unit.f71690a;
            }
            throw new IllegalStateException("You must collect the progress flow");
        }
    }

    public C6237l(@NotNull M m11, boolean z11, @NotNull Function2<? super InterfaceC2395h<C5035b>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f61706a = z11;
        this.f61708c = C10727i.c(m11, null, null, new a(function2, this, null), 3);
    }

    public final void a() {
        this.f61707b.j(new CancellationException("onBack cancelled"));
        ((H0) this.f61708c).j(null);
    }

    public final void b() {
        this.f61707b.l(null);
    }

    @NotNull
    public final C11115c c() {
        return this.f61707b;
    }

    public final boolean d() {
        return this.f61706a;
    }

    @NotNull
    public final void e(@NotNull C5035b c5035b) {
        this.f61707b.b(c5035b);
    }

    public final void f() {
        this.f61706a = false;
    }
}
