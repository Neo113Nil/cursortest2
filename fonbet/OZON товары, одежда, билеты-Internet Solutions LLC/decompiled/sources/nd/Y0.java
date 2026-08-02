package nd;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC7724f;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.AbstractC7739v;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.InterfaceC7726h;
import kotlin.jvm.internal.InterfaceC7733o;
import ld.C7925f;
import md.C8132e;

/* loaded from: classes.dex */
public class Y0 extends kotlin.jvm.internal.O {
    private static AbstractC8537f0 l(AbstractC7724f abstractC7724f) {
        kotlin.reflect.g owner = abstractC7724f.getOwner();
        return owner instanceof AbstractC8537f0 ? (AbstractC8537f0) owner : C8546k.f76996c;
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.h a(C7734p c7734p) {
        return new C8545j0(l(c7734p), c7734p.getName(), c7734p.getSignature(), c7734p.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.d b(Class cls) {
        return C8540h.b(cls);
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.g c(Class cls, String str) {
        return C8540h.c(cls);
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.j d(AbstractC7739v abstractC7739v) {
        return new C8549l0(l(abstractC7739v), abstractC7739v.getName(), abstractC7739v.getSignature(), abstractC7739v.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.k e(kotlin.jvm.internal.x xVar) {
        return new C8553n0(l(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.n f(kotlin.jvm.internal.B b11) {
        return new C0(l(b11), b11.getName(), b11.getSignature(), b11.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.o g(kotlin.jvm.internal.D d11) {
        return new F0(l(d11), d11.getName(), d11.getSignature(), d11.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.p h(kotlin.jvm.internal.F f7) {
        return new I0(l(f7), f7.getName(), f7.getSignature());
    }

    @Override // kotlin.jvm.internal.O
    public final String i(InterfaceC7733o interfaceC7733o) {
        C8545j0 b11;
        C8545j0 a11 = C8132e.a(interfaceC7733o);
        if (a11 == null || (b11 = g1.b(a11)) == null) {
            return super.i(interfaceC7733o);
        }
        int i11 = b1.f76953b;
        return b1.c(b11.t());
    }

    @Override // kotlin.jvm.internal.O
    public final String j(AbstractC7737t abstractC7737t) {
        return i(abstractC7737t);
    }

    @Override // kotlin.jvm.internal.O
    public final kotlin.reflect.q k(kotlin.reflect.d dVar, List list) {
        return dVar instanceof InterfaceC7726h ? C8540h.a(((InterfaceC7726h) dVar).c(), list) : C7925f.a(dVar, list, false, Collections.EMPTY_LIST);
    }
}
