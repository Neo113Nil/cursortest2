package l0;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: l0.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7775t implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f72146a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f72147b;

    /* renamed from: l0.t$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f72148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f72148b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList arrayList = this.f72148b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                aVar2.d((B1.m0) arrayList.get(i11), 0, 0, 0.0f);
            }
            return Unit.f71690a;
        }
    }

    public C7775t(@NotNull I i11) {
        this.f72146a = i11;
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
        Object obj;
        B1.W z02;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list.get(i11).a0(j11));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int u02 = ((B1.m0) obj).u0();
            int P11 = C7714v.P(arrayList);
            if (1 <= P11) {
                int i12 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    int u03 = ((B1.m0) obj3).u0();
                    if (u02 < u03) {
                        obj = obj3;
                        u02 = u03;
                    }
                    if (i12 == P11) {
                        break;
                    }
                    i12++;
                }
            }
        }
        B1.m0 m0Var = (B1.m0) obj;
        int u04 = m0Var != null ? m0Var.u0() : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int l02 = ((B1.m0) obj2).l0();
            int P12 = C7714v.P(arrayList);
            if (1 <= P12) {
                int i13 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i13);
                    int l03 = ((B1.m0) obj4).l0();
                    if (l02 < l03) {
                        obj2 = obj4;
                        l02 = l03;
                    }
                    if (i13 == P12) {
                        break;
                    }
                    i13++;
                }
            }
        }
        B1.m0 m0Var2 = (B1.m0) obj2;
        int l04 = m0Var2 != null ? m0Var2.l0() : 0;
        boolean R02 = y11.R0();
        I i14 = this.f72146a;
        if (R02) {
            this.f72147b = true;
            i14.a().setValue(Z1.q.a(Z1.r.a(u04, l04)));
        } else if (!this.f72147b) {
            i14.a().setValue(Z1.q.a(Z1.r.a(u04, l04)));
        }
        z02 = y11.z0(u04, l04, kotlin.collections.U.c(), new a(arrayList));
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
