package y00;

import A00.a;
import D00.e;
import R00.f;
import i10.C6997c;
import i10.d;
import i10.h;
import i10.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import y00.AbstractC10819a;

/* loaded from: classes7.dex */
public final class b<I extends C7854a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D00.a f105896a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f105897b;

    public b(@NotNull D00.a frequencyLoadChecker, @NotNull e incidentsNotifier) {
        Intrinsics.checkNotNullParameter(frequencyLoadChecker, "frequencyLoadChecker");
        Intrinsics.checkNotNullParameter(incidentsNotifier, "incidentsNotifier");
        this.f105896a = frequencyLoadChecker;
        this.f105897b = incidentsNotifier;
    }

    private static AbstractC10819a.f a(C6997c c6997c) {
        List<I> a11;
        k.b<I> h11 = c6997c.h();
        if (h11 != null && (a11 = h11.a()) != null) {
            List<I> list = a11;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C7854a) it.next()).j()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return new AbstractC10819a.f(arrayList);
            }
        }
        return null;
    }

    private static AbstractC10819a.g b(C6997c c6997c, A00.e eVar) {
        int u02;
        k.a<I> e11 = c6997c.e();
        if (d.a(e11) || (u02 = eVar.f().u0(e11.a())) == -1) {
            return null;
        }
        return new AbstractC10819a.g(u02, eVar);
    }

    private static List c(P00.k kVar) {
        List<f> c11 = kVar.c();
        if (((ArrayList) c11).isEmpty()) {
            return null;
        }
        RZ.b g10 = kVar.f().g();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            ((f) it.next()).f(g10);
        }
        return c11;
    }

    @NotNull
    public final List<AbstractC10819a> d(@NotNull A00.a event, @NotNull C6997c<I> state) {
        P00.k<? extends C7854a> b11;
        List<? extends f> c11;
        P00.k<I> b12;
        List<? extends f> c12;
        AbstractC10819a.b b13;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        if (event instanceof a.u) {
            ArrayList arrayList = new ArrayList();
            AbstractC10819a.f a11 = a(state);
            if (a11 != null) {
                arrayList.add(a11);
            }
            if (!(event instanceof a.u.c) && !state.n() && (b13 = this.f105896a.b(state.l().d(), state.f())) != null) {
                arrayList.add(b13);
            }
            return arrayList;
        }
        if (event instanceof A00.d) {
            if (((A00.d) event).d().getF71842a() != 1) {
                return K.f71697a;
            }
            ArrayList arrayList2 = new ArrayList();
            AbstractC10819a.f a12 = a(state);
            if (a12 != null) {
                arrayList2.add(a12);
            }
            return arrayList2;
        }
        boolean z11 = event instanceof a.o;
        e eVar = this.f105897b;
        if (z11) {
            a.o oVar = (a.o) event;
            a.C2369j<I> d11 = oVar.d();
            if (d11 != null && (b12 = d11.b()) != null && (c12 = c(b12)) != null) {
                eVar.a(c12);
            }
            P00.k<I> f7 = oVar.f();
            List<? extends f> c13 = c(f7);
            AbstractC10819a.c cVar = c13 != null ? new AbstractC10819a.c(f7.h(), c13, eVar.a(c13)) : null;
            if (cVar != null) {
                return C7714v.a0(cVar);
            }
        } else {
            if (event instanceof a.p) {
                ArrayList m02 = C7714v.m0(AbstractC10819a.C2288a.f105881a);
                a.C2369j<? extends C7854a> d12 = ((a.p) event).d();
                if (d12 != null && (b11 = d12.b()) != null && (c11 = c(b11)) != null) {
                    eVar.a(c11);
                }
                i10.f j11 = state.j();
                if (j11 != null && !state.s()) {
                    m02.add(new AbstractC10819a.e(j11.a(), j11.c(), j11.b()));
                }
                return m02;
            }
            if (event instanceof a.C2372m) {
                if (!((a.C2372m) event).d() && !state.o().f()) {
                    h.b c14 = state.l().c();
                    A00.e b14 = c14 != null ? c14.b() : null;
                    if (b14 != null) {
                        return C7714v.c0(b(state, b14));
                    }
                }
            } else {
                if (event instanceof a.E) {
                    return C7714v.a0(AbstractC10819a.d.f105889a);
                }
                if (event instanceof A00.e) {
                    return C7714v.c0(b(state, (A00.e) event));
                }
            }
        }
        return K.f71697a;
    }
}
