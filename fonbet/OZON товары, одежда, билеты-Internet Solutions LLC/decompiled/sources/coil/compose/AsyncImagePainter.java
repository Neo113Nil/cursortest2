package coil.compose;

import Ae.C2399j;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import B1.InterfaceC2547p;
import Be.m;
import De.C2862e;
import S0.C3991w0;
import S0.D1;
import S0.V0;
import S0.n1;
import Sc.InterfaceC4003e;
import Sc.o;
import Sc.s;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.painter.ColorPainter;
import coil.compose.g;
import com.google.accompanist.drawablepainter.DrawablePainter;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import l1.C7811b0;
import l1.C7848y;
import m5.C8079b;
import m5.C8086i;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import q1.C8971a;
import v5.AbstractC10235i;
import v5.C10232f;
import v5.C10234h;
import v5.C10243q;
import w5.EnumC10431c;
import w5.EnumC10434f;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;
import z5.InterfaceC10985c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcoil/compose/AsyncImagePainter;", "Lq1/b;", "LS0/V0;", "State", "coil-compose-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AsyncImagePainter extends AbstractC8972b implements V0 {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final Function1<State, State> f57212p = a.f57231b;

    /* renamed from: a, reason: collision with root package name */
    private C2862e f57213a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<C7464j> f57214b = O0.a(C7464j.a(0));

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57215c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57216d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57217e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private State f57218f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC8972b f57219g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f57220h;

    /* renamed from: i, reason: collision with root package name */
    private Function1<? super State, Unit> f57221i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private InterfaceC2547p f57222j;

    /* renamed from: k, reason: collision with root package name */
    private int f57223k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57224l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57225m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57226n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C3991w0 f57227o;

    public static abstract class State {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Error;", "Lcoil/compose/AsyncImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "coil-compose-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class Error extends State {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final C10232f f57228a;
            private final AbstractC8972b painter;

            public Error(AbstractC8972b abstractC8972b, @NotNull C10232f c10232f) {
                super(0);
                this.painter = abstractC8972b;
                this.f57228a = c10232f;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final C10232f getF57228a() {
                return this.f57228a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.d(this.painter, error.painter) && Intrinsics.d(this.f57228a, error.f57228a);
            }

            public final int hashCode() {
                AbstractC8972b abstractC8972b = this.painter;
                return this.f57228a.hashCode() + ((abstractC8972b == null ? 0 : abstractC8972b.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.f57228a + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Loading;", "Lcoil/compose/AsyncImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "coil-compose-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class Loading extends State {
            private final AbstractC8972b painter;

            public Loading(AbstractC8972b abstractC8972b) {
                super(0);
                this.painter = abstractC8972b;
            }

            @Override // coil.compose.AsyncImagePainter.State
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.d(this.painter, ((Loading) obj).painter);
            }

            public final int hashCode() {
                AbstractC8972b abstractC8972b = this.painter;
                if (abstractC8972b == null) {
                    return 0;
                }
                return abstractC8972b.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Loading(painter=" + this.painter + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/compose/AsyncImagePainter$State$Success;", "Lcoil/compose/AsyncImagePainter$State;", "Lq1/b;", "painter", "Lq1/b;", "a", "()Lq1/b;", "coil-compose-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class Success extends State {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final C10243q f57229a;

            @NotNull
            private final AbstractC8972b painter;

            public Success(@NotNull AbstractC8972b abstractC8972b, @NotNull C10243q c10243q) {
                super(0);
                this.painter = abstractC8972b;
                this.f57229a = c10243q;
            }

            @Override // coil.compose.AsyncImagePainter.State
            @NotNull
            /* renamed from: a, reason: from getter */
            public final AbstractC8972b getPainter() {
                return this.painter;
            }

            @NotNull
            /* renamed from: b, reason: from getter */
            public final C10243q getF57229a() {
                return this.f57229a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.d(this.painter, success.painter) && Intrinsics.d(this.f57229a, success.f57229a);
            }

            public final int hashCode() {
                return this.f57229a.hashCode() + (this.painter.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.f57229a + ')';
            }
        }

        public static final class a extends State {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f57230a = new a(0);

            @Override // coil.compose.AsyncImagePainter.State
            /* renamed from: a */
            public final AbstractC8972b getPainter() {
                return null;
            }
        }

        public /* synthetic */ State(int i11) {
            this();
        }

        /* renamed from: a */
        public abstract AbstractC8972b getPainter();

        private State() {
        }
    }

    static final class a extends AbstractC7737t implements Function1<State, State> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f57231b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final State invoke(State state) {
            return state;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {246}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f57232d;

        static final class a extends AbstractC7737t implements Function0<C10234h> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f57234b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AsyncImagePainter asyncImagePainter) {
                super(0);
                this.f57234b = asyncImagePainter;
            }

            @Override // kotlin.jvm.functions.Function0
            public final C10234h invoke() {
                return this.f57234b.k();
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {245}, m = "invokeSuspend")
        /* renamed from: coil.compose.AsyncImagePainter$b$b, reason: collision with other inner class name */
        static final class C0870b extends j implements Function2<C10234h, kotlin.coroutines.d<? super State>, Object> {

            /* renamed from: d, reason: collision with root package name */
            AsyncImagePainter f57235d;

            /* renamed from: e, reason: collision with root package name */
            int f57236e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f57237f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0870b(AsyncImagePainter asyncImagePainter, kotlin.coroutines.d<? super C0870b> dVar) {
                super(2, dVar);
                this.f57237f = asyncImagePainter;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0870b(this.f57237f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C10234h c10234h, kotlin.coroutines.d<? super State> dVar) {
                return ((C0870b) create(c10234h, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                AsyncImagePainter asyncImagePainter;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f57236e;
                if (i11 == 0) {
                    s.b(obj);
                    AsyncImagePainter asyncImagePainter2 = this.f57237f;
                    l5.g j11 = asyncImagePainter2.j();
                    C10234h h11 = AsyncImagePainter.h(asyncImagePainter2, asyncImagePainter2.k());
                    this.f57235d = asyncImagePainter2;
                    this.f57236e = 1;
                    Object c11 = j11.c(h11, this);
                    if (c11 == aVar) {
                        return aVar;
                    }
                    asyncImagePainter = asyncImagePainter2;
                    obj = c11;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncImagePainter = this.f57235d;
                    s.b(obj);
                }
                return AsyncImagePainter.g(asyncImagePainter, (AbstractC10235i) obj);
            }
        }

        /* synthetic */ class c implements InterfaceC2397i, InterfaceC7732n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AsyncImagePainter f57238a;

            c(AsyncImagePainter asyncImagePainter) {
                this.f57238a = asyncImagePainter;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                this.f57238a.t((State) obj);
                Unit unit = Unit.f71690a;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                return unit;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                    return getFunctionDelegate().equals(((InterfaceC7732n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC7732n
            @NotNull
            public final InterfaceC4003e<?> getFunctionDelegate() {
                return new C7719a(2, this.f57238a, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return AsyncImagePainter.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f57232d;
            if (i11 == 0) {
                s.b(obj);
                AsyncImagePainter asyncImagePainter = AsyncImagePainter.this;
                m D11 = C2399j.D(n1.m(new a(asyncImagePainter)), new C0870b(asyncImagePainter, null));
                c cVar = new c(asyncImagePainter);
                this.f57232d = 1;
                if (D11.collect(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public AsyncImagePainter(@NotNull C10234h c10234h, @NotNull l5.g gVar) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        C3991w0 f15;
        f7 = n1.f(null, D1.f25195a);
        this.f57215c = f7;
        f11 = n1.f(Float.valueOf(1.0f), D1.f25195a);
        this.f57216d = f11;
        f12 = n1.f(null, D1.f25195a);
        this.f57217e = f12;
        State.a aVar = State.a.f57230a;
        this.f57218f = aVar;
        this.f57220h = (AbstractC7737t) f57212p;
        this.f57222j = InterfaceC2547p.a.d();
        this.f57223k = 1;
        f13 = n1.f(aVar, D1.f25195a);
        this.f57225m = f13;
        f14 = n1.f(c10234h, D1.f25195a);
        this.f57226n = f14;
        f15 = n1.f(gVar, D1.f25195a);
        this.f57227o = f15;
    }

    public static final State g(AsyncImagePainter asyncImagePainter, AbstractC10235i abstractC10235i) {
        asyncImagePainter.getClass();
        if (abstractC10235i instanceof C10243q) {
            C10243q c10243q = (C10243q) abstractC10235i;
            return new State.Success(asyncImagePainter.s(c10243q.a()), c10243q);
        }
        if (!(abstractC10235i instanceof C10232f)) {
            throw new o();
        }
        Drawable a11 = abstractC10235i.a();
        return new State.Error(a11 == null ? null : asyncImagePainter.s(a11), (C10232f) abstractC10235i);
    }

    public static final C10234h h(AsyncImagePainter asyncImagePainter, C10234h c10234h) {
        C10234h.a Q11 = C10234h.Q(c10234h);
        Q11.i(new C8079b(asyncImagePainter));
        if (c10234h.q().m() == null) {
            Q11.g(new f(asyncImagePainter));
        }
        if (c10234h.q().l() == null) {
            InterfaceC2547p interfaceC2547p = asyncImagePainter.f57222j;
            int i11 = C8086i.f74462b;
            Q11.f(Intrinsics.d(interfaceC2547p, InterfaceC2547p.a.d()) ? true : Intrinsics.d(interfaceC2547p, InterfaceC2547p.a.e()) ? EnumC10434f.FIT : EnumC10434f.FILL);
        }
        if (c10234h.q().k() != EnumC10431c.EXACT) {
            Q11.e(EnumC10431c.INEXACT);
        }
        return Q11.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC8972b s(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? C8971a.a(new C7848y(((BitmapDrawable) drawable).getBitmap()), this.f57223k) : drawable instanceof ColorDrawable ? new ColorPainter(C7811b0.b(((ColorDrawable) drawable).getColor())) : new DrawablePainter(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(State state) {
        AbstractC10235i f57228a;
        Function1<? super State, Unit> function1;
        V0 v02;
        V0 v03;
        g.a aVar;
        State state2 = this.f57218f;
        State state3 = (State) this.f57220h.invoke(state);
        this.f57218f = state3;
        this.f57225m.setValue(state3);
        if (!(state3 instanceof State.Success)) {
            if (state3 instanceof State.Error) {
                f57228a = ((State.Error) state3).getF57228a();
            }
            AbstractC8972b painter = state3.getPainter();
            this.f57219g = painter;
            this.f57215c.setValue(painter);
            if (this.f57213a != null && state2.getPainter() != state3.getPainter()) {
                Object painter2 = state2.getPainter();
                v02 = !(painter2 instanceof V0) ? (V0) painter2 : null;
                if (v02 != null) {
                    v02.e();
                }
                Object painter3 = state3.getPainter();
                v03 = painter3 instanceof V0 ? (V0) painter3 : null;
                if (v03 != null) {
                    v03.b();
                }
            }
            function1 = this.f57221i;
            if (function1 != null) {
                return;
            }
            ((h) function1).invoke(state3);
            return;
        }
        f57228a = ((State.Success) state3).getF57229a();
        InterfaceC10985c P11 = f57228a.b().P();
        aVar = g.f57283a;
        P11.a(aVar, f57228a);
        AbstractC8972b painter4 = state3.getPainter();
        this.f57219g = painter4;
        this.f57215c.setValue(painter4);
        if (this.f57213a != null) {
            Object painter22 = state2.getPainter();
            if (!(painter22 instanceof V0)) {
            }
            if (v02 != null) {
            }
            Object painter32 = state3.getPainter();
            if (painter32 instanceof V0) {
            }
            if (v03 != null) {
            }
        }
        function1 = this.f57221i;
        if (function1 != null) {
        }
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyAlpha(float f7) {
        this.f57216d.setValue(Float.valueOf(f7));
        return true;
    }

    @Override // q1.AbstractC8972b
    protected final boolean applyColorFilter(C7809a0 c7809a0) {
        this.f57217e.setValue(c7809a0);
        return true;
    }

    @Override // S0.V0
    public final void b() {
        if (this.f57213a != null) {
            return;
        }
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(CoroutineContext.Element.a.d(De.s.f6650a.x(), (H0) b11));
        this.f57213a = a11;
        Object obj = this.f57219g;
        V0 v02 = obj instanceof V0 ? (V0) obj : null;
        if (v02 != null) {
            v02.b();
        }
        if (!this.f57224l) {
            C10727i.c(a11, null, null, new b(null), 3);
            return;
        }
        C10234h.a Q11 = C10234h.Q(k());
        Q11.c(j().b());
        Drawable F11 = Q11.a().F();
        t(new State.Loading(F11 != null ? s(F11) : null));
    }

    @Override // S0.V0
    public final void d() {
        C2862e c2862e = this.f57213a;
        if (c2862e != null) {
            N.c(c2862e, null);
        }
        this.f57213a = null;
        Object obj = this.f57219g;
        V0 v02 = obj instanceof V0 ? (V0) obj : null;
        if (v02 == null) {
            return;
        }
        v02.d();
    }

    @Override // S0.V0
    public final void e() {
        C2862e c2862e = this.f57213a;
        if (c2862e != null) {
            N.c(c2862e, null);
        }
        this.f57213a = null;
        Object obj = this.f57219g;
        V0 v02 = obj instanceof V0 ? (V0) obj : null;
        if (v02 == null) {
            return;
        }
        v02.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF40457d() {
        AbstractC8972b abstractC8972b = (AbstractC8972b) this.f57215c.getValue();
        C7464j a11 = abstractC8972b == null ? null : C7464j.a(abstractC8972b.getF40457d());
        if (a11 == null) {
            return 9205357640488583168L;
        }
        return a11.i();
    }

    @NotNull
    public final l5.g j() {
        return (l5.g) this.f57227o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final C10234h k() {
        return (C10234h) this.f57226n.getValue();
    }

    public final void l(@NotNull InterfaceC2547p interfaceC2547p) {
        this.f57222j = interfaceC2547p;
    }

    public final void m() {
        this.f57223k = 1;
    }

    public final void n(@NotNull l5.g gVar) {
        this.f57227o.setValue(gVar);
    }

    public final void o(Function1<? super State, Unit> function1) {
        this.f57221i = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.AbstractC8972b
    protected final void onDraw(@NotNull InterfaceC8412e interfaceC8412e) {
        this.f57214b.setValue(C7464j.a(interfaceC8412e.i()));
        AbstractC8972b abstractC8972b = (AbstractC8972b) this.f57215c.getValue();
        if (abstractC8972b == null) {
            return;
        }
        abstractC8972b.m444drawx_KDEd0(interfaceC8412e, interfaceC8412e.i(), ((Number) this.f57216d.getValue()).floatValue(), (C7809a0) this.f57217e.getValue());
    }

    public final void p(boolean z11) {
        this.f57224l = z11;
    }

    public final void q(@NotNull C10234h c10234h) {
        this.f57226n.setValue(c10234h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(@NotNull Function1<? super State, ? extends State> function1) {
        this.f57220h = (AbstractC7737t) function1;
    }
}
