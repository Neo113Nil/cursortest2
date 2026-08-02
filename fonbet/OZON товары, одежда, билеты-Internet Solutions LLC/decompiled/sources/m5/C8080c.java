package m5;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import B1.InterfaceC2552v;
import B1.J;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.V;
import Sc.s;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;
import w5.C10435g;
import w5.InterfaceC10436h;

/* renamed from: m5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8080c implements InterfaceC10436h, J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<Z1.b> f74442a = O0.a(Z1.b.a(C8086i.a()));

    /* renamed from: m5.c$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f74443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f74443b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f74443b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    /* renamed from: m5.c$b */
    public static final class b implements InterfaceC2395h<C10435g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f74444a;

        /* renamed from: m5.c$b$a */
        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f74445a;

            @kotlin.coroutines.jvm.internal.e(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "AsyncImage.kt", l = {225}, m = "emit")
            /* renamed from: m5.c$b$a$a, reason: collision with other inner class name */
            public static final class C1256a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f74446d;

                /* renamed from: e, reason: collision with root package name */
                int f74447e;

                public C1256a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f74446d = obj;
                    this.f74447e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i) {
                this.f74445a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1256a c1256a;
                int i11;
                C10435g c10435g;
                if (dVar instanceof C1256a) {
                    c1256a = (C1256a) dVar;
                    int i12 = c1256a.f74447e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1256a.f74447e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1256a.f74446d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1256a.f74447e;
                        if (i11 != 0) {
                            s.b(obj2);
                            long p11 = ((Z1.b) obj).p();
                            if (Z1.b.n(p11)) {
                                c10435g = null;
                            } else {
                                c10435g = new C10435g(Z1.b.g(p11) ? new AbstractC10429a.C2245a(Z1.b.k(p11)) : AbstractC10429a.b.f103576a, Z1.b.f(p11) ? new AbstractC10429a.C2245a(Z1.b.j(p11)) : AbstractC10429a.b.f103576a);
                            }
                            if (c10435g != null) {
                                c1256a.f74447e = 1;
                                if (this.f74445a.emit(c10435g, c1256a) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c1256a = new C1256a(dVar);
                Object obj22 = c1256a.f74446d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1256a.f74447e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public b(InterfaceC2395h interfaceC2395h) {
            this.f74444a = interfaceC2395h;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super C10435g> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f74444a.collect(new a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    @Override // B1.J
    public final int A(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return J.a.d(this, v11, interfaceC2552v, i11);
    }

    @Override // B1.J
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        this.f74442a.setValue(Z1.b.a(j11));
        m0 a02 = u11.a0(j11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    @Override // B1.J
    public final int I(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return J.a.a(this, v11, interfaceC2552v, i11);
    }

    @Override // B1.J
    public final int K(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return J.a.c(this, v11, interfaceC2552v, i11);
    }

    @Override // w5.InterfaceC10436h
    public final Object a(@NotNull kotlin.coroutines.d<? super C10435g> dVar) {
        return C2399j.u(new b(this.f74442a), dVar);
    }

    @Override // androidx.compose.ui.e
    @NotNull
    public final androidx.compose.ui.e l0(@NotNull androidx.compose.ui.e eVar) {
        androidx.compose.ui.e l02;
        l02 = super.l0(eVar);
        return l02;
    }

    @Override // androidx.compose.ui.e.b, androidx.compose.ui.e
    public final <R> R t(R r11, @NotNull Function2<? super R, ? super e.b, ? extends R> function2) {
        return function2.invoke(r11, this);
    }

    @Override // B1.J
    public final int u(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return J.a.b(this, v11, interfaceC2552v, i11);
    }

    @Override // androidx.compose.ui.e.b, androidx.compose.ui.e
    public final boolean w(@NotNull Function1<? super e.b, Boolean> function1) {
        boolean w11;
        w11 = super.w(function1);
        return w11;
    }
}
