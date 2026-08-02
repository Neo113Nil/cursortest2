package l0;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import java.util.List;
import kd.C7665d;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l0.C7774s;
import org.jetbrains.annotations.NotNull;

/* renamed from: l0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7771o implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7774s<?> f72126a;

    /* renamed from: l0.o$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.m0[] f72127b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7771o f72128c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f72129d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f72130e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.m0[] m0VarArr, C7771o c7771o, int i11, int i12) {
            super(1);
            this.f72127b = m0VarArr;
            this.f72128c = c7771o;
            this.f72129d = i11;
            this.f72130e = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            for (B1.m0 m0Var : this.f72127b) {
                if (m0Var != null) {
                    long a11 = this.f72128c.a().e().a(Z1.r.a(m0Var.u0(), m0Var.l0()), Z1.r.a(this.f72129d, this.f72130e), Z1.s.Ltr);
                    aVar2.d(m0Var, (int) (a11 >> 32), (int) (a11 & 4294967295L), 0.0f);
                }
            }
            return Unit.f71690a;
        }
    }

    public C7771o(@NotNull C7774s<?> c7774s) {
        this.f72126a = c7774s;
    }

    @NotNull
    public final C7774s<?> a() {
        return this.f72126a;
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).D(i11));
            int P11 = C7714v.P(list);
            int i12 = 1;
            if (1 <= P11) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).D(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == P11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).Y(i11));
            int P11 = C7714v.P(list);
            int i12 = 1;
            if (1 <= P11) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).Y(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == P11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.m0 m0Var;
        B1.m0 m0Var2;
        int u02;
        B1.W z02;
        int size = list.size();
        B1.m0[] m0VarArr = new B1.m0[size];
        int size2 = list.size();
        long j12 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            m0Var = null;
            if (i12 >= size2) {
                break;
            }
            B1.U u11 = list.get(i12);
            Object m11 = u11.m();
            C7774s.a aVar = m11 instanceof C7774s.a ? (C7774s.a) m11 : null;
            if (aVar != null && aVar.a()) {
                B1.m0 a02 = u11.a0(j11);
                long a11 = Z1.r.a(a02.u0(), a02.l0());
                Unit unit = Unit.f71690a;
                m0VarArr[i12] = a02;
                j12 = a11;
            }
            i12++;
        }
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            B1.U u12 = list.get(i13);
            if (m0VarArr[i13] == null) {
                m0VarArr[i13] = u12.a0(j11);
            }
        }
        if (y11.R0()) {
            u02 = (int) (j12 >> 32);
        } else {
            if (size == 0) {
                m0Var2 = null;
            } else {
                m0Var2 = m0VarArr[0];
                Intrinsics.checkNotNullParameter(m0VarArr, "<this>");
                int i14 = size - 1;
                if (i14 != 0) {
                    int u03 = m0Var2 != null ? m0Var2.u0() : 0;
                    C7665d it = new IntRange(1, i14, 1).iterator();
                    while (it.hasNext()) {
                        B1.m0 m0Var3 = m0VarArr[it.b()];
                        int u04 = m0Var3 != null ? m0Var3.u0() : 0;
                        if (u03 < u04) {
                            m0Var2 = m0Var3;
                            u03 = u04;
                        }
                    }
                }
            }
            u02 = m0Var2 != null ? m0Var2.u0() : 0;
        }
        if (y11.R0()) {
            i11 = (int) (4294967295L & j12);
        } else {
            if (size != 0) {
                m0Var = m0VarArr[0];
                Intrinsics.checkNotNullParameter(m0VarArr, "<this>");
                int i15 = size - 1;
                if (i15 != 0) {
                    int l02 = m0Var != null ? m0Var.l0() : 0;
                    C7665d it2 = new IntRange(1, i15, 1).iterator();
                    while (it2.hasNext()) {
                        B1.m0 m0Var4 = m0VarArr[it2.b()];
                        int l03 = m0Var4 != null ? m0Var4.l0() : 0;
                        if (l02 < l03) {
                            m0Var = m0Var4;
                            l02 = l03;
                        }
                    }
                }
            }
            if (m0Var != null) {
                i11 = m0Var.l0();
            }
        }
        if (!y11.R0()) {
            this.f72126a.h(Z1.r.a(u02, i11));
        }
        z02 = y11.z0(u02, i11, kotlin.collections.U.c(), new a(m0VarArr, this, u02, i11));
        return z02;
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).O(i11));
            int P11 = C7714v.P(list);
            int i12 = 1;
            if (1 <= P11) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).O(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == P11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).T(i11));
            int P11 = C7714v.P(list);
            int i12 = 1;
            if (1 <= P11) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i12).T(i11));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i12 == P11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
