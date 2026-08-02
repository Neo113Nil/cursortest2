package Rh;

import Rh.n;
import Sh.V;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes5.dex */
public class u extends h {

    /* renamed from: m, reason: collision with root package name */
    public final int f10376m;

    /* renamed from: n, reason: collision with root package name */
    public final d f10377n;

    public u(int i10, d dVar, Function1 function1) {
        super(i10, function1);
        this.f10376m = i10;
        this.f10377n = dVar;
        if (dVar == d.f10307a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(h.class).getSimpleName() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public static /* synthetic */ Object n1(u uVar, Object obj, Continuation continuation) {
        V c10;
        Object p12 = uVar.p1(obj, true);
        if (!(p12 instanceof n.a)) {
            return Unit.INSTANCE;
        }
        n.e(p12);
        Function1 function1 = uVar.f10327b;
        if (function1 == null || (c10 = Sh.z.c(function1, obj, null, 2, null)) == null) {
            throw uVar.i0();
        }
        ExceptionsKt.addSuppressed(c10, uVar.i0());
        throw c10;
    }

    @Override // Rh.h, Rh.B
    public Object h(Object obj) {
        return p1(obj, false);
    }

    @Override // Rh.h, Rh.B
    public Object o(Object obj, Continuation continuation) {
        return n1(this, obj, continuation);
    }

    public final Object o1(Object obj, boolean z10) {
        Function1 function1;
        V c10;
        Object h10 = super.h(obj);
        if (n.i(h10) || n.h(h10)) {
            return h10;
        }
        if (!z10 || (function1 = this.f10327b) == null || (c10 = Sh.z.c(function1, obj, null, 2, null)) == null) {
            return n.f10366b.c(Unit.INSTANCE);
        }
        throw c10;
    }

    public final Object p1(Object obj, boolean z10) {
        return this.f10377n == d.f10309c ? o1(obj, z10) : d1(obj);
    }

    @Override // Rh.h
    public boolean w0() {
        return this.f10377n == d.f10308b;
    }
}
