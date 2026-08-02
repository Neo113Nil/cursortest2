package gg;

import eg.f2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s extends h {

    /* renamed from: k, reason: collision with root package name */
    public final a f10099k;

    public s(int i5, a aVar) {
        super(i5);
        this.f10099k = aVar;
        if (aVar != a.f10048a) {
            if (i5 < 1) {
                throw new IllegalArgumentException(d9.e.f(i5, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(h.class).getSimpleName() + " instead").toString());
        }
    }

    public final Object K(Object obj, boolean z5) {
        p pVar;
        s sVar;
        Object obj2;
        if (this.f10099k == a.f10050c) {
            Object g10 = super.g(obj);
            return (!(g10 instanceof n) || (g10 instanceof m)) ? g10 : Unit.f19194a;
        }
        j1.n nVar = j.f10077d;
        p pVar2 = (p) h.f10068f.get(this);
        while (true) {
            long andIncrement = h.f10064b.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean v5 = v(false, andIncrement);
            int i5 = j.f10075b;
            long j6 = i5;
            long j10 = j / j6;
            int i10 = (int) (j % j6);
            if (pVar2.f18527c != j10) {
                p a7 = h.a(this, j10, pVar2);
                if (a7 != null) {
                    pVar = a7;
                    obj2 = obj;
                    sVar = this;
                } else if (v5) {
                    return new m(s());
                }
            } else {
                pVar = pVar2;
                sVar = this;
                obj2 = obj;
            }
            int f6 = h.f(sVar, pVar, i10, obj2, j, nVar, v5);
            pVar2 = pVar;
            if (f6 == 0) {
                pVar2.b();
                return Unit.f19194a;
            }
            if (f6 == 1) {
                return Unit.f19194a;
            }
            if (f6 == 2) {
                if (v5) {
                    pVar2.i();
                    return new m(s());
                }
                f2 f2Var = nVar instanceof f2 ? (f2) nVar : null;
                if (f2Var != null) {
                    f2Var.b(pVar2, i10 + i5);
                }
                n((pVar2.f18527c * j6) + i10);
                return Unit.f19194a;
            }
            if (f6 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (f6 == 4) {
                if (j < h.f10065c.get(this)) {
                    pVar2.b();
                }
                return new m(s());
            }
            if (f6 == 5) {
                pVar2.b();
            }
            obj = obj2;
        }
    }

    @Override // gg.h, gg.z
    public final Object g(Object obj) {
        return K(obj, false);
    }

    @Override // gg.h, gg.z
    public final Object h(Object obj, Continuation continuation) {
        if (K(obj, true) instanceof m) {
            throw s();
        }
        return Unit.f19194a;
    }

    @Override // gg.h
    public final boolean y() {
        return this.f10099k == a.f10049b;
    }
}
