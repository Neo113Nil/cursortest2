package ff0;

import B4.M;
import B4.d0;
import D4.C2844t;
import a1.C4912a;
import df0.C6194a;
import df0.C6195b;
import df0.C6196c;
import gf0.AbstractC6729a;
import hf0.AbstractC6947b;
import if0.C7071a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jf0.AbstractC7421a;
import kf0.C7674a;
import kf0.InterfaceC7675b;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ff0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6557d implements kf0.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f63397a;

    public C6557d(@NotNull M navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "navGraphBuilder");
        this.f63397a = navGraphBuilder;
    }

    @Override // kf0.c
    public final void a(@NotNull InterfaceC7675b destination) {
        String c11;
        Intrinsics.checkNotNullParameter(destination, "destination");
        boolean z11 = destination instanceof C7674a;
        M m11 = this.f63397a;
        String str = null;
        if (z11) {
            C7674a c7674a = (C7674a) destination;
            AbstractC6729a c12 = c7674a.c();
            if (c12 != null && (c11 = lf0.g.c(c12)) != null) {
                str = c11;
            }
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            d0 h11 = m11.h();
            AbstractC7421a a11 = c7674a.a();
            Intrinsics.checkNotNullParameter(a11, "<this>");
            M m12 = new M(h11, str, a11.a());
            c7674a.b().invoke(new C6557d(m12));
            m11.g(m12);
            return;
        }
        if (!(destination instanceof C6195b)) {
            if (destination instanceof C6194a) {
                lf0.g.c(null);
                throw null;
            }
            if (destination instanceof C6196c) {
                lf0.g.c(null);
                throw null;
            }
            return;
        }
        C6195b c6195b = (C6195b) destination;
        String c13 = lf0.g.c(c6195b.b());
        LinkedHashSet a12 = c6195b.b().a();
        ArrayList arrayList = new ArrayList(C7714v.z(a12, 10));
        Iterator it = a12.iterator();
        if (it.hasNext()) {
            lf0.g.b((AbstractC6947b) it.next());
            throw null;
        }
        LinkedHashSet c14 = c6195b.b().c();
        ArrayList arrayList2 = new ArrayList(C7714v.z(c14, 10));
        Iterator it2 = c14.iterator();
        while (it2.hasNext()) {
            arrayList2.add(lf0.g.a((C7071a) it2.next()));
        }
        c6195b.c().getClass();
        c6195b.c().getClass();
        c6195b.c().getClass();
        c6195b.c().getClass();
        C2844t.a(m11, c13, arrayList, arrayList2, new C4912a(true, -16606814, new C6556c(c6195b)));
    }
}
