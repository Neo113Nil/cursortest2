package he;

import ce.AbstractC2916a;
import ie.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public static final AbstractC2916a a(ie.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof b.d) {
            return new AbstractC2916a.d(bVar.c());
        }
        if (bVar instanceof b.f) {
            return new AbstractC2916a.f(bVar.c());
        }
        if (bVar instanceof b.e) {
            return new AbstractC2916a.e(bVar.c());
        }
        if (bVar instanceof b.h) {
            return new AbstractC2916a.n(bVar.c());
        }
        if (bVar instanceof b.i) {
            return new AbstractC2916a.o(bVar.c());
        }
        if (bVar instanceof b.a) {
            return new AbstractC2916a.C0448a(String.valueOf(bVar.a()));
        }
        if (bVar instanceof b.C0726b) {
            return new AbstractC2916a.b(String.valueOf(bVar.a()));
        }
        if (bVar instanceof b.g) {
            return new AbstractC2916a.l();
        }
        if (bVar instanceof b.j) {
            return new AbstractC2916a.p(bVar.b());
        }
        if (bVar instanceof b.c) {
            return new AbstractC2916a.c(bVar.c());
        }
        if (bVar instanceof b.m) {
            return new AbstractC2916a.w(bVar.c());
        }
        if (bVar instanceof b.k) {
            return new AbstractC2916a.t(bVar.b());
        }
        if (bVar instanceof b.o) {
            return new AbstractC2916a.y(bVar.c());
        }
        if (bVar instanceof b.n) {
            return new AbstractC2916a.x(bVar.c());
        }
        if (bVar instanceof b.l) {
            return new AbstractC2916a.v(bVar.c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
