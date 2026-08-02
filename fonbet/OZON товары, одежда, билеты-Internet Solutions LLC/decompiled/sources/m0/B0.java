package m0;

import S0.C3961h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B0 {
    public static final Object b(float f7, float f11, float f12, @NotNull InterfaceC8002m interfaceC8002m, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        U0 b11 = W0.b();
        Float f13 = new Float(f7);
        Float f14 = new Float(f11);
        V0 v02 = (V0) b11;
        AbstractC8015t abstractC8015t = (AbstractC8015t) v02.a().invoke(new Float(f12));
        if (abstractC8015t == null) {
            abstractC8015t = ((AbstractC8015t) v02.a().invoke(f13)).c();
        }
        AbstractC8015t abstractC8015t2 = abstractC8015t;
        Object c11 = c(new C8006o(b11, f13, abstractC8015t2, 56), new C0(interfaceC8002m, b11, f13, f14, abstractC8015t2), Long.MIN_VALUE, new C8016t0(function2, b11), jVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (c11 != aVar) {
            c11 = Unit.f71690a;
        }
        return c11 == aVar ? c11 : Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0102 A[Catch: CancellationException -> 0x003b, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003b, blocks: (B:13:0x0036, B:15:0x00f5, B:17:0x0102, B:22:0x0125, B:24:0x0138, B:31:0x013d), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, m0.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(@NotNull C8006o c8006o, @NotNull InterfaceC7992h interfaceC7992h, long j11, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C8018u0 c8018u0;
        Wc.a aVar;
        int i11;
        kotlin.jvm.internal.M m11;
        C8006o c8006o2;
        C8006o c8006o3;
        kotlin.jvm.internal.M m12;
        Object v11;
        Function1 function12;
        C8000l c8000l;
        C8000l c8000l2;
        T t2;
        Object v12;
        InterfaceC7992h interfaceC7992h2 = interfaceC7992h;
        if (cVar instanceof C8018u0) {
            c8018u0 = (C8018u0) cVar;
            int i12 = c8018u0.f73873i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8018u0.f73873i = i12 - LinearLayoutManager.INVALID_OFFSET;
                C8018u0 c8018u02 = c8018u0;
                Object obj = c8018u02.f73872h;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8018u02.f73873i;
                if (i11 == 0) {
                    if (i11 == 1) {
                        m11 = c8018u02.f73871g;
                        function12 = c8018u02.f73870f;
                        interfaceC7992h2 = c8018u02.f73869e;
                        c8006o3 = c8018u02.f73868d;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m11 = c8018u02.f73871g;
                        function12 = c8018u02.f73870f;
                        interfaceC7992h2 = c8018u02.f73869e;
                        c8006o3 = c8018u02.f73868d;
                    }
                    try {
                        Sc.s.b(obj);
                    } catch (CancellationException e11) {
                        e = e11;
                        c8000l = (C8000l) m11.f71787a;
                        if (c8000l != null) {
                        }
                        c8000l2 = (C8000l) m11.f71787a;
                        if (c8000l2 != null) {
                            c8006o3.y(false);
                        }
                        throw e;
                    }
                } else {
                    Sc.s.b(obj);
                    Object e12 = interfaceC7992h2.e(0L);
                    AbstractC8015t g10 = interfaceC7992h2.g(0L);
                    m11 = new kotlin.jvm.internal.M();
                    if (j11 == Long.MIN_VALUE) {
                        try {
                            c8006o2 = c8006o;
                        } catch (CancellationException e13) {
                            e = e13;
                            c8006o2 = c8006o;
                        }
                        try {
                            C8022w0 c8022w0 = new C8022w0(m11, e12, interfaceC7992h2, g10, c8006o2, i(c8018u02.getContext()), function1);
                            m12 = m11;
                            try {
                                c8018u02.f73868d = c8006o2;
                                c8018u02.f73869e = interfaceC7992h2;
                                c8018u02.f73870f = function1;
                                c8018u02.f73871g = m12;
                                c8018u02.f73873i = 1;
                                if (interfaceC7992h2.a()) {
                                    v11 = M.a(c8022w0, c8018u02);
                                } else {
                                    v11 = C3961h0.a(c8018u02.getContext()).v(new A0(c8022w0), c8018u02);
                                }
                                if (v11 != aVar) {
                                    function12 = function1;
                                    c8006o3 = c8006o2;
                                }
                                return aVar;
                            } catch (CancellationException e14) {
                                e = e14;
                                c8006o3 = c8006o2;
                                m11 = m12;
                                c8000l = (C8000l) m11.f71787a;
                                if (c8000l != null) {
                                }
                                c8000l2 = (C8000l) m11.f71787a;
                                if (c8000l2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e15) {
                            e = e15;
                            c8006o3 = c8006o2;
                            c8000l = (C8000l) m11.f71787a;
                            if (c8000l != null) {
                            }
                            c8000l2 = (C8000l) m11.f71787a;
                            if (c8000l2 != null) {
                            }
                            throw e;
                        }
                    }
                    m12 = m11;
                    try {
                        ?? c8000l3 = new C8000l(e12, interfaceC7992h2.d(), g10, j11, interfaceC7992h2.f(), j11, new C8024x0(c8006o));
                        h(c8000l3, j11, i(c8018u02.getContext()), interfaceC7992h2, c8006o, function1);
                        m12.f71787a = c8000l3;
                        c8006o3 = c8006o;
                        interfaceC7992h2 = interfaceC7992h;
                        function12 = function1;
                    } catch (CancellationException e16) {
                        e = e16;
                        c8006o3 = c8006o;
                        m11 = m12;
                        c8000l = (C8000l) m11.f71787a;
                        if (c8000l != null) {
                        }
                        c8000l2 = (C8000l) m11.f71787a;
                        if (c8000l2 != null) {
                        }
                        throw e;
                    }
                    m11 = m12;
                }
                do {
                    t2 = m11.f71787a;
                    Intrinsics.f(t2);
                    if (((C8000l) t2).h()) {
                        return Unit.f71690a;
                    }
                    kotlin.jvm.internal.M m13 = m11;
                    Function1 function13 = function12;
                    InterfaceC7992h interfaceC7992h3 = interfaceC7992h2;
                    C8006o c8006o4 = c8006o3;
                    try {
                        C8026y0 c8026y0 = new C8026y0(m13, i(c8018u02.getContext()), interfaceC7992h3, c8006o4, function13);
                        m11 = m13;
                        interfaceC7992h2 = interfaceC7992h3;
                        c8006o3 = c8006o4;
                        function12 = function13;
                        c8018u02.f73868d = c8006o3;
                        c8018u02.f73869e = interfaceC7992h2;
                        c8018u02.f73870f = function12;
                        c8018u02.f73871g = m11;
                        c8018u02.f73873i = 2;
                        if (interfaceC7992h2.a()) {
                            v12 = M.a(c8026y0, c8018u02);
                        } else {
                            v12 = C3961h0.a(c8018u02.getContext()).v(new A0(c8026y0), c8018u02);
                        }
                    } catch (CancellationException e17) {
                        e = e17;
                        m11 = m13;
                        c8006o3 = c8006o4;
                        c8000l = (C8000l) m11.f71787a;
                        if (c8000l != null) {
                            c8000l.k();
                        }
                        c8000l2 = (C8000l) m11.f71787a;
                        if (c8000l2 != null && c8000l2.c() == c8006o3.k()) {
                            c8006o3.y(false);
                        }
                        throw e;
                    }
                } while (v12 != aVar);
                return aVar;
            }
        }
        c8018u0 = new C8018u0(cVar);
        C8018u0 c8018u022 = c8018u0;
        Object obj2 = c8018u022.f73872h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8018u022.f73873i;
        if (i11 == 0) {
        }
        do {
            t2 = m11.f71787a;
            Intrinsics.f(t2);
            if (((C8000l) t2).h()) {
            }
        } while (v12 != aVar);
        return aVar;
    }

    public static /* synthetic */ Object d(float f7, float f11, InterfaceC8002m interfaceC8002m, Function2 function2, kotlin.coroutines.jvm.internal.j jVar, int i11) {
        if ((i11 & 8) != 0) {
            interfaceC8002m = C8004n.c(0.0f, null, 7);
        }
        return b(f7, f11, 0.0f, interfaceC8002m, function2, jVar);
    }

    public static final Object e(@NotNull C8006o c8006o, @NotNull InterfaceC7976A interfaceC7976A, boolean z11, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object c11 = c(c8006o, new C8027z(interfaceC7976A, c8006o.m(), c8006o.getValue(), c8006o.s()), z11 ? c8006o.k() : Long.MIN_VALUE, function1, cVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    public static final Object f(@NotNull C8006o c8006o, Float f7, @NotNull InterfaceC8002m interfaceC8002m, boolean z11, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object c11 = c(c8006o, new C0(interfaceC8002m, c8006o.m(), c8006o.getValue(), f7, c8006o.s()), z11 ? c8006o.k() : Long.MIN_VALUE, function1, cVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    public static /* synthetic */ Object g(C8006o c8006o, Float f7, C8011q0 c8011q0, boolean z11, Function1 function1, kotlin.coroutines.jvm.internal.j jVar, int i11) {
        if ((i11 & 2) != 0) {
            c8011q0 = C8004n.c(0.0f, null, 7);
        }
        C8011q0 c8011q02 = c8011q0;
        if ((i11 & 8) != 0) {
            function1 = C8028z0.f73924b;
        }
        return f(c8006o, f7, c8011q02, z11, function1, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC8015t> void h(C8000l<T, V> c8000l, long j11, float f7, InterfaceC7992h<T, V> interfaceC7992h, C8006o<T, V> c8006o, Function1<? super C8000l<T, V>, Unit> function1) {
        long c11 = f7 == 0.0f ? interfaceC7992h.c() : (long) ((j11 - c8000l.d()) / f7);
        c8000l.j(j11);
        c8000l.l(interfaceC7992h.e(c11));
        c8000l.m(interfaceC7992h.g(c11));
        if (interfaceC7992h.b(c11)) {
            c8000l.i(c8000l.c());
            c8000l.k();
        }
        j(c8000l, c8006o);
        function1.invoke(c8000l);
    }

    public static final float i(@NotNull CoroutineContext coroutineContext) {
        e1.g gVar = (e1.g) coroutineContext.get(e1.g.f61781e0);
        float scaleFactor = gVar != null ? gVar.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        C7985d0.b("negative scale factor");
        throw null;
    }

    public static final <T, V extends AbstractC8015t> void j(@NotNull C8000l<T, V> c8000l, @NotNull C8006o<T, V> c8006o) {
        c8006o.z(c8000l.e());
        V s11 = c8006o.s();
        V g10 = c8000l.g();
        int b11 = s11.b();
        for (int i11 = 0; i11 < b11; i11++) {
            s11.e(g10.a(i11), i11);
        }
        c8006o.w(c8000l.b());
        c8006o.x(c8000l.c());
        c8006o.y(c8000l.h());
    }
}
