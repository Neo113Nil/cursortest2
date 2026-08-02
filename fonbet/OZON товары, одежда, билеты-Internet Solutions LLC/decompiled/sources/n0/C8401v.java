package n0;

import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.C9718g;
import xe.B0;
import xe.C10727i;
import xe.InterfaceC10724g0;

/* renamed from: n0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8401v extends e.c {

    /* renamed from: a, reason: collision with root package name */
    private t0.q f76232a;

    /* renamed from: b, reason: collision with root package name */
    private C9717f f76233b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {309}, m = "invokeSuspend")
    /* renamed from: n0.v$a */
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76234d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ t0.q f76235e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t0.n f76236f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC10724g0 f76237g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0.q qVar, t0.n nVar, InterfaceC10724g0 interfaceC10724g0, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f76235e = qVar;
            this.f76236f = nVar;
            this.f76237g = interfaceC10724g0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f76235e, this.f76236f, this.f76237g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f76234d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f76234d = 1;
                if (this.f76235e.emit(this.f76236f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            InterfaceC10724g0 interfaceC10724g0 = this.f76237g;
            if (interfaceC10724g0 != null) {
                interfaceC10724g0.dispose();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: n0.v$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0.q f76238b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t0.n f76239c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t0.q qVar, t0.n nVar) {
            super(1);
            this.f76238b = qVar;
            this.f76239c = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f76238b.tryEmit(this.f76239c);
            return Unit.f71690a;
        }
    }

    public C8401v(t0.q qVar) {
        this.f76232a = qVar;
    }

    private final void I1(t0.q qVar, t0.n nVar) {
        if (!isAttached()) {
            qVar.tryEmit(nVar);
        } else {
            B0 b02 = (B0) getCoroutineScope().getCoroutineContext().get(B0.f105374o0);
            C10727i.c(getCoroutineScope(), null, null, new a(qVar, nVar, b02 != null ? b02.y(new b(qVar, nVar)) : null, null), 3);
        }
    }

    public final void J1(boolean z11) {
        t0.q qVar = this.f76232a;
        if (qVar != null) {
            if (!z11) {
                C9717f c9717f = this.f76233b;
                if (c9717f != null) {
                    I1(qVar, new C9718g(c9717f));
                    this.f76233b = null;
                    return;
                }
                return;
            }
            C9717f c9717f2 = this.f76233b;
            if (c9717f2 != null) {
                I1(qVar, new C9718g(c9717f2));
                this.f76233b = null;
            }
            C9717f c9717f3 = new C9717f();
            I1(qVar, c9717f3);
            this.f76233b = c9717f3;
        }
    }

    public final void K1(t0.q qVar) {
        C9717f c9717f;
        if (Intrinsics.d(this.f76232a, qVar)) {
            return;
        }
        t0.q qVar2 = this.f76232a;
        if (qVar2 != null && (c9717f = this.f76233b) != null) {
            qVar2.tryEmit(new C9718g(c9717f));
        }
        this.f76233b = null;
        this.f76232a = qVar;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}
