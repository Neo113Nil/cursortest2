package gf;

import bf.AbstractC5657a;
import gf.f;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;

/* loaded from: classes6.dex */
public final class j extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f.d f64395e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ s f64396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, f.d dVar, s sVar) {
        super(str, true);
        this.f64395e = dVar;
        this.f64396f = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, gf.s] */
    @Override // bf.AbstractC5657a
    public final long f() {
        int i11;
        T t2;
        bf.c cVar;
        f.d dVar = this.f64395e;
        s settings = this.f64396f;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        L l11 = new L();
        M m11 = new M();
        M m12 = new M();
        synchronized (dVar.f64370b.s0()) {
            synchronized (dVar.f64370b) {
                try {
                    s b02 = dVar.f64370b.b0();
                    ?? sVar = new s();
                    sVar.g(b02);
                    sVar.g(settings);
                    Unit unit = Unit.f71690a;
                    m12.f71787a = sVar;
                    long c11 = sVar.c() - b02.c();
                    l11.f71786a = c11;
                    if (c11 != 0 && !dVar.f64370b.l0().isEmpty()) {
                        Object[] array = dVar.f64370b.l0().values().toArray(new n[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        t2 = (n[]) array;
                        m11.f71787a = t2;
                        dVar.f64370b.W0((s) m12.f71787a);
                        cVar = dVar.f64370b.f64341k;
                        cVar.j(new g(dVar.f64370b.Q() + " onSettings", dVar, m12), 0L);
                    }
                    t2 = 0;
                    m11.f71787a = t2;
                    dVar.f64370b.W0((s) m12.f71787a);
                    cVar = dVar.f64370b.f64341k;
                    cVar.j(new g(dVar.f64370b.Q() + " onSettings", dVar, m12), 0L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                dVar.f64370b.s0().c((s) m12.f71787a);
            } catch (IOException e11) {
                f.c(dVar.f64370b, e11);
            }
            Unit unit2 = Unit.f71690a;
        }
        n[] nVarArr = (n[]) m11.f71787a;
        if (nVarArr == null) {
            return -1L;
        }
        for (n nVar : nVarArr) {
            synchronized (nVar) {
                nVar.a(l11.f71786a);
                Unit unit3 = Unit.f71690a;
            }
        }
        return -1L;
    }
}
