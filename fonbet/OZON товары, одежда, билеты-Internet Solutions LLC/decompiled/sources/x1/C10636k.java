package x1;

import D1.AbstractC2810k0;
import D1.AbstractC2813m;
import D1.C0;
import D1.C2809k;
import D1.C2823x;
import androidx.collection.C5153w;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y1.C10821b;

/* renamed from: x1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10636k extends C10637l {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e.c f104886b;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC2810k0 f104889e;

    /* renamed from: f, reason: collision with root package name */
    private C10638m f104890f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f104891g;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C10821b f104887c = new C10821b();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C5153w<x> f104888d = new C5153w<>(2);

    /* renamed from: h, reason: collision with root package name */
    private boolean f104892h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f104893i = true;

    public C10636k(@NotNull e.c cVar) {
        this.f104886b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // x1.C10637l
    public final boolean a(@NotNull C5153w c5153w, @NotNull C2823x c2823x, @NotNull C10633h c10633h, boolean z11) {
        C5153w<x> c5153w2;
        C10821b c10821b;
        x xVar;
        boolean z12;
        boolean z13;
        C10638m c10638m;
        boolean z14;
        int i11;
        boolean z15;
        int i12;
        int i13;
        boolean a11 = super.a(c5153w, c2823x, c10633h, z11);
        AbstractC2813m abstractC2813m = this.f104886b;
        boolean z16 = true;
        if (!abstractC2813m.isAttached()) {
            return true;
        }
        ?? r82 = 0;
        while (abstractC2813m != 0) {
            if (abstractC2813m instanceof C0) {
                this.f104889e = C2809k.d((C0) abstractC2813m, 16);
            } else if ((abstractC2813m.getKindSet$ui_release() & 16) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                e.c J12 = abstractC2813m.J1();
                int i14 = 0;
                abstractC2813m = abstractC2813m;
                r82 = r82;
                while (J12 != null) {
                    if ((J12.getKindSet$ui_release() & 16) != 0) {
                        i14++;
                        r82 = r82;
                        if (i14 == 1) {
                            abstractC2813m = J12;
                        } else {
                            if (r82 == 0) {
                                r82 = new U0.b(new e.c[16]);
                            }
                            if (abstractC2813m != 0) {
                                r82.b(abstractC2813m);
                                abstractC2813m = 0;
                            }
                            r82.b(J12);
                        }
                    }
                    J12 = J12.getChild$ui_release();
                    abstractC2813m = abstractC2813m;
                    r82 = r82;
                }
                if (i14 == 1) {
                }
            }
            abstractC2813m = C2809k.b(r82);
        }
        int h11 = c5153w.h();
        int i15 = 0;
        while (true) {
            c5153w2 = this.f104888d;
            c10821b = this.f104887c;
            if (i15 >= h11) {
                break;
            }
            long e11 = c5153w.e(i15);
            x xVar2 = (x) c5153w.i(i15);
            if (c10821b.c(e11)) {
                long i16 = xVar2.i();
                z15 = z16;
                long f7 = xVar2.f();
                if (C7459e.i(i16) && C7459e.i(f7)) {
                    ArrayList arrayList = new ArrayList(xVar2.c().size());
                    List<C10631f> c11 = xVar2.c();
                    z14 = a11;
                    int size = c11.size();
                    i11 = h11;
                    int i17 = 0;
                    while (i17 < size) {
                        C10631f c10631f = c11.get(i17);
                        int i18 = size;
                        int i19 = i17;
                        long b11 = c10631f.b();
                        if (C7459e.i(b11)) {
                            long c12 = c10631f.c();
                            i13 = i15;
                            AbstractC2810k0 abstractC2810k0 = this.f104889e;
                            Intrinsics.f(abstractC2810k0);
                            arrayList.add(new C10631f(c12, abstractC2810k0.o2(c2823x, b11), c10631f.a()));
                        } else {
                            i13 = i15;
                        }
                        i17 = i19 + 1;
                        size = i18;
                        i15 = i13;
                    }
                    i12 = i15;
                    AbstractC2810k0 abstractC2810k02 = this.f104889e;
                    Intrinsics.f(abstractC2810k02);
                    long o22 = abstractC2810k02.o2(c2823x, i16);
                    AbstractC2810k0 abstractC2810k03 = this.f104889e;
                    Intrinsics.f(abstractC2810k03);
                    c5153w2.f(e11, x.b(xVar2, abstractC2810k03.o2(c2823x, f7), o22, arrayList));
                    i15 = i12 + 1;
                    z16 = z15;
                    a11 = z14;
                    h11 = i11;
                } else {
                    z14 = a11;
                    i11 = h11;
                }
            } else {
                z14 = a11;
                i11 = h11;
                z15 = z16;
            }
            i12 = i15;
            i15 = i12 + 1;
            z16 = z15;
            a11 = z14;
            h11 = i11;
        }
        boolean z17 = a11;
        boolean z18 = z16;
        if (c5153w2.d()) {
            c10821b.b();
            g().h();
            return z18;
        }
        int e12 = c10821b.e();
        while (true) {
            e12--;
            if (-1 >= e12) {
                break;
            }
            if (c5153w.c(c10821b.d(e12)) < 0) {
                c10821b.h(e12);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5153w2.h());
        int h12 = c5153w2.h();
        for (int i21 = 0; i21 < h12; i21++) {
            arrayList2.add(c5153w2.i(i21));
        }
        C10638m c10638m2 = new C10638m(arrayList2, c10633h);
        List<x> b12 = c10638m2.b();
        int size2 = b12.size();
        int i22 = 0;
        while (true) {
            if (i22 >= size2) {
                xVar = null;
                break;
            }
            xVar = b12.get(i22);
            if (c10633h.a(xVar.d())) {
                break;
            }
            i22++;
        }
        x xVar3 = xVar;
        if (xVar3 != null) {
            if (z11) {
                z12 = false;
                if (!this.f104892h && (xVar3.g() || xVar3.j())) {
                    Intrinsics.f(this.f104889e);
                    this.f104892h = !C10639n.d(xVar3, r4.a());
                }
            } else {
                z12 = false;
                this.f104892h = false;
            }
            if (this.f104892h != this.f104891g && (c10638m2.e() == 3 || c10638m2.e() == 4 || c10638m2.e() == 5)) {
                c10638m2.f(this.f104892h ? 4 : 5);
            } else if (c10638m2.e() == 4 && this.f104891g && !this.f104893i) {
                c10638m2.f(3);
            } else if (c10638m2.e() == 5 && this.f104892h && xVar3.g()) {
                c10638m2.f(3);
            }
        } else {
            z12 = false;
        }
        if (!z17 && c10638m2.e() == 3 && (c10638m = this.f104890f) != null && c10638m.b().size() == c10638m2.b().size()) {
            int size3 = c10638m2.b().size();
            for (?? r52 = z12; r52 < size3; r52++) {
                if (C7459e.d(c10638m.b().get(r52).f(), c10638m2.b().get(r52).f())) {
                }
            }
            z13 = z12;
            this.f104890f = c10638m2;
            return z13;
        }
        z13 = z18;
        this.f104890f = c10638m2;
        return z13;
    }

    @Override // x1.C10637l
    public final void b(@NotNull C10633h c10633h) {
        super.b(c10633h);
        C10638m c10638m = this.f104890f;
        if (c10638m == null) {
            return;
        }
        this.f104891g = this.f104892h;
        List<x> b11 = c10638m.b();
        int size = b11.size();
        for (int i11 = 0; i11 < size; i11++) {
            x xVar = b11.get(i11);
            boolean g10 = xVar.g();
            boolean a11 = c10633h.a(xVar.d());
            boolean z11 = this.f104892h;
            if ((!g10 && !a11) || (!g10 && !z11)) {
                this.f104887c.g(xVar.d());
            }
        }
        this.f104892h = false;
        this.f104893i = c10638m.e() == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [U0.b] */
    @Override // x1.C10637l
    public final void d() {
        U0.b<C10636k> g10 = g();
        int m11 = g10.m();
        if (m11 > 0) {
            C10636k[] l11 = g10.l();
            int i11 = 0;
            do {
                l11[i11].d();
                i11++;
            } while (i11 < m11);
        }
        AbstractC2813m abstractC2813m = this.f104886b;
        ?? r42 = 0;
        while (abstractC2813m != 0) {
            if (abstractC2813m instanceof C0) {
                ((C0) abstractC2813m).r0();
            } else if ((abstractC2813m.getKindSet$ui_release() & 16) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                e.c J12 = abstractC2813m.J1();
                int i12 = 0;
                abstractC2813m = abstractC2813m;
                r42 = r42;
                while (J12 != null) {
                    if ((J12.getKindSet$ui_release() & 16) != 0) {
                        i12++;
                        r42 = r42;
                        if (i12 == 1) {
                            abstractC2813m = J12;
                        } else {
                            if (r42 == 0) {
                                r42 = new U0.b(new e.c[16]);
                            }
                            if (abstractC2813m != 0) {
                                r42.b(abstractC2813m);
                                abstractC2813m = 0;
                            }
                            r42.b(J12);
                        }
                    }
                    J12 = J12.getChild$ui_release();
                    abstractC2813m = abstractC2813m;
                    r42 = r42;
                }
                if (i12 == 1) {
                }
            }
            abstractC2813m = C2809k.b(r42);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // x1.C10637l
    public final boolean e(@NotNull C10633h c10633h) {
        U0.b<C10636k> g10;
        int m11;
        C5153w<x> c5153w = this.f104888d;
        boolean z11 = false;
        int i11 = 0;
        z11 = false;
        if (!c5153w.d()) {
            e.c cVar = this.f104886b;
            if (cVar.isAttached()) {
                C10638m c10638m = this.f104890f;
                Intrinsics.f(c10638m);
                AbstractC2810k0 abstractC2810k0 = this.f104889e;
                Intrinsics.f(abstractC2810k0);
                long a11 = abstractC2810k0.a();
                AbstractC2813m abstractC2813m = cVar;
                ?? r82 = 0;
                while (abstractC2813m != 0) {
                    if (abstractC2813m instanceof C0) {
                        ((C0) abstractC2813m).p1(c10638m, EnumC10640o.Final, a11);
                    } else if ((abstractC2813m.getKindSet$ui_release() & 16) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                        e.c J12 = abstractC2813m.J1();
                        int i12 = 0;
                        abstractC2813m = abstractC2813m;
                        r82 = r82;
                        while (J12 != null) {
                            if ((J12.getKindSet$ui_release() & 16) != 0) {
                                i12++;
                                r82 = r82;
                                if (i12 == 1) {
                                    abstractC2813m = J12;
                                } else {
                                    if (r82 == 0) {
                                        r82 = new U0.b(new e.c[16]);
                                    }
                                    if (abstractC2813m != 0) {
                                        r82.b(abstractC2813m);
                                        abstractC2813m = 0;
                                    }
                                    r82.b(J12);
                                }
                            }
                            J12 = J12.getChild$ui_release();
                            abstractC2813m = abstractC2813m;
                            r82 = r82;
                        }
                        if (i12 == 1) {
                        }
                    }
                    abstractC2813m = C2809k.b(r82);
                }
                if (cVar.isAttached() && (m11 = (g10 = g()).m()) > 0) {
                    C10636k[] l11 = g10.l();
                    do {
                        l11[i11].e(c10633h);
                        i11++;
                    } while (i11 < m11);
                }
                z11 = true;
            }
        }
        b(c10633h);
        c5153w.a();
        this.f104889e = null;
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // x1.C10637l
    public final boolean f(@NotNull C5153w<x> c5153w, @NotNull B1.B b11, @NotNull C10633h c10633h, boolean z11) {
        U0.b<C10636k> g10;
        int m11;
        C5153w<x> c5153w2 = this.f104888d;
        if (!c5153w2.d()) {
            AbstractC2813m abstractC2813m = this.f104886b;
            if (abstractC2813m.isAttached()) {
                C10638m c10638m = this.f104890f;
                Intrinsics.f(c10638m);
                AbstractC2810k0 abstractC2810k0 = this.f104889e;
                Intrinsics.f(abstractC2810k0);
                long a11 = abstractC2810k0.a();
                AbstractC2813m abstractC2813m2 = abstractC2813m;
                ?? r92 = 0;
                while (abstractC2813m2 != 0) {
                    if (abstractC2813m2 instanceof C0) {
                        ((C0) abstractC2813m2).p1(c10638m, EnumC10640o.Initial, a11);
                    } else if ((abstractC2813m2.getKindSet$ui_release() & 16) != 0 && (abstractC2813m2 instanceof AbstractC2813m)) {
                        e.c J12 = abstractC2813m2.J1();
                        int i11 = 0;
                        abstractC2813m2 = abstractC2813m2;
                        r92 = r92;
                        while (J12 != null) {
                            if ((J12.getKindSet$ui_release() & 16) != 0) {
                                i11++;
                                r92 = r92;
                                if (i11 == 1) {
                                    abstractC2813m2 = J12;
                                } else {
                                    if (r92 == 0) {
                                        r92 = new U0.b(new e.c[16]);
                                    }
                                    if (abstractC2813m2 != 0) {
                                        r92.b(abstractC2813m2);
                                        abstractC2813m2 = 0;
                                    }
                                    r92.b(J12);
                                }
                            }
                            J12 = J12.getChild$ui_release();
                            abstractC2813m2 = abstractC2813m2;
                            r92 = r92;
                        }
                        if (i11 == 1) {
                        }
                    }
                    abstractC2813m2 = C2809k.b(r92);
                }
                if (abstractC2813m.isAttached() && (m11 = (g10 = g()).m()) > 0) {
                    C10636k[] l11 = g10.l();
                    int i12 = 0;
                    do {
                        C10636k c10636k = l11[i12];
                        AbstractC2810k0 abstractC2810k02 = this.f104889e;
                        Intrinsics.f(abstractC2810k02);
                        c10636k.f(c5153w2, abstractC2810k02, c10633h, z11);
                        i12++;
                    } while (i12 < m11);
                }
                if (abstractC2813m.isAttached()) {
                    ?? r12 = 0;
                    while (abstractC2813m != 0) {
                        if (abstractC2813m instanceof C0) {
                            ((C0) abstractC2813m).p1(c10638m, EnumC10640o.Main, a11);
                        } else if ((abstractC2813m.getKindSet$ui_release() & 16) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                            e.c J13 = abstractC2813m.J1();
                            int i13 = 0;
                            r12 = r12;
                            abstractC2813m = abstractC2813m;
                            while (J13 != null) {
                                if ((J13.getKindSet$ui_release() & 16) != 0) {
                                    i13++;
                                    r12 = r12;
                                    if (i13 == 1) {
                                        abstractC2813m = J13;
                                    } else {
                                        if (r12 == 0) {
                                            r12 = new U0.b(new e.c[16]);
                                        }
                                        if (abstractC2813m != 0) {
                                            r12.b(abstractC2813m);
                                            abstractC2813m = 0;
                                        }
                                        r12.b(J13);
                                    }
                                }
                                J13 = J13.getChild$ui_release();
                                r12 = r12;
                                abstractC2813m = abstractC2813m;
                            }
                            if (i13 == 1) {
                            }
                        }
                        abstractC2813m = C2809k.b(r12);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // x1.C10637l
    public final void i(long j11, @NotNull androidx.collection.J<C10636k> j12) {
        C10821b c10821b = this.f104887c;
        if (c10821b.c(j11) && j12.a(this) < 0) {
            c10821b.g(j11);
            this.f104888d.g(j11);
        }
        U0.b<C10636k> g10 = g();
        int m11 = g10.m();
        if (m11 > 0) {
            C10636k[] l11 = g10.l();
            int i11 = 0;
            do {
                l11[i11].i(j11, j12);
                i11++;
            } while (i11 < m11);
        }
    }

    @NotNull
    public final e.c j() {
        return this.f104886b;
    }

    @NotNull
    public final C10821b k() {
        return this.f104887c;
    }

    public final void l() {
        this.f104892h = true;
    }

    @NotNull
    public final String toString() {
        return "Node(pointerInputFilter=" + this.f104886b + ", children=" + g() + ", pointerIds=" + this.f104887c + ')';
    }
}
