package y0;

import B1.AbstractC2531a;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import s0.InterfaceC9574q;

/* loaded from: classes8.dex */
public final class N implements InterfaceC10793C, B1.W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f105687a;

    /* renamed from: b, reason: collision with root package name */
    private final int f105688b;

    /* renamed from: c, reason: collision with root package name */
    private final int f105689c;

    /* renamed from: d, reason: collision with root package name */
    private final int f105690d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f105691e;

    /* renamed from: f, reason: collision with root package name */
    private final int f105692f;

    /* renamed from: g, reason: collision with root package name */
    private final int f105693g;

    /* renamed from: h, reason: collision with root package name */
    private final int f105694h;

    /* renamed from: i, reason: collision with root package name */
    private final C10806m f105695i;

    /* renamed from: j, reason: collision with root package name */
    private final C10806m f105696j;

    /* renamed from: k, reason: collision with root package name */
    private float f105697k;

    /* renamed from: l, reason: collision with root package name */
    private int f105698l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f105699m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC9574q.a f105700n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f105701o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final List<C10806m> f105702p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final List<C10806m> f105703q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final xe.M f105704r;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ B1.W f105705s;

    public N(@NotNull List list, int i11, int i12, int i13, @NotNull EnumC9142v enumC9142v, int i14, int i15, int i16, C10806m c10806m, C10806m c10806m2, float f7, int i17, boolean z11, @NotNull InterfaceC9574q.a aVar, @NotNull B1.W w11, boolean z12, @NotNull List list2, @NotNull List list3, @NotNull xe.M m11) {
        this.f105687a = list;
        this.f105688b = i11;
        this.f105689c = i12;
        this.f105690d = i13;
        this.f105691e = enumC9142v;
        this.f105692f = i14;
        this.f105693g = i15;
        this.f105694h = i16;
        this.f105695i = c10806m;
        this.f105696j = c10806m2;
        this.f105697k = f7;
        this.f105698l = i17;
        this.f105699m = z11;
        this.f105700n = aVar;
        this.f105701o = z12;
        this.f105702p = list2;
        this.f105703q = list3;
        this.f105704r = m11;
        this.f105705s = w11;
    }

    @Override // y0.InterfaceC10793C
    public final long a() {
        B1.W w11 = this.f105705s;
        return Z1.r.a(w11.getWidth(), w11.getHeight());
    }

    @Override // y0.InterfaceC10793C
    public final int b() {
        return this.f105690d;
    }

    @Override // y0.InterfaceC10793C
    public final int c() {
        return -this.f105692f;
    }

    @Override // y0.InterfaceC10793C
    @NotNull
    public final InterfaceC9574q d() {
        return this.f105700n;
    }

    @Override // y0.InterfaceC10793C
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<y0.m>] */
    @Override // y0.InterfaceC10793C
    @NotNull
    public final List<C10806m> f() {
        return this.f105687a;
    }

    @Override // y0.InterfaceC10793C
    public final int g() {
        return this.f105689c;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f105705s.getHeight();
    }

    @Override // y0.InterfaceC10793C
    @NotNull
    public final EnumC9142v getOrientation() {
        return this.f105691e;
    }

    @Override // y0.InterfaceC10793C
    public final int getPageSize() {
        return this.f105688b;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f105705s.getWidth();
    }

    public final int h() {
        return this.f105694h;
    }

    public final boolean i() {
        C10806m c10806m = this.f105695i;
        return ((c10806m != null ? c10806m.getIndex() : 0) == 0 && this.f105698l == 0) ? false : true;
    }

    public final boolean j() {
        return this.f105699m;
    }

    public final C10806m k() {
        return this.f105696j;
    }

    public final float l() {
        return this.f105697k;
    }

    public final C10806m m() {
        return this.f105695i;
    }

    public final int n() {
        return this.f105698l;
    }

    public final int o() {
        return this.f105693g;
    }

    public final int p() {
        return this.f105692f;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final boolean q(int i11) {
        int i12;
        int i13 = this.f105688b + this.f105689c;
        if (!this.f105701o) {
            ?? r12 = this.f105687a;
            if (!r12.isEmpty() && this.f105695i != null && (i12 = this.f105698l - i11) >= 0 && i12 < i13) {
                float f7 = i13 != 0 ? i11 / i13 : 0.0f;
                float f11 = this.f105697k - f7;
                if (this.f105696j != null && f11 < 0.5f && f11 > -0.5f) {
                    C10806m c10806m = (C10806m) C7714v.K(r12);
                    C10806m c10806m2 = (C10806m) C7714v.X(r12);
                    int i14 = this.f105693g;
                    int i15 = this.f105692f;
                    if (i11 >= 0 ? Math.min(i15 - c10806m.getOffset(), i14 - c10806m2.getOffset()) > i11 : Math.min((c10806m.getOffset() + i13) - i15, (c10806m2.getOffset() + i13) - i14) > (-i11)) {
                        this.f105697k -= f7;
                        this.f105698l -= i11;
                        int size = r12.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            ((C10806m) r12.get(i16)).a(i11);
                        }
                        List<C10806m> list = this.f105702p;
                        int size2 = list.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            list.get(i17).a(i11);
                        }
                        List<C10806m> list2 = this.f105703q;
                        int size3 = list2.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            list2.get(i18).a(i11);
                        }
                        if (!this.f105699m && i11 > 0) {
                            this.f105699m = true;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f105705s.s();
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return this.f105705s.t();
    }

    @Override // B1.W
    public final void u() {
        this.f105705s.u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N(kotlin.collections.K k11, int i11, int i12, int i13, EnumC9142v enumC9142v, int i14, int i15, int i16, InterfaceC9574q.a aVar, B1.W w11, xe.M m11) {
        this(k11, i11, i12, i13, enumC9142v, i14, i15, i16, null, null, 0.0f, 0, false, aVar, w11, false, r17, r17, m11);
        kotlin.collections.K k12 = kotlin.collections.K.f71697a;
    }
}
