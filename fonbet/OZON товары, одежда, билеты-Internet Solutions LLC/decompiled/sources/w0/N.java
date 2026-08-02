package w0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import x0.C10600e;

/* loaded from: classes8.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10394j f103193a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<a> f103194b;

    /* renamed from: c, reason: collision with root package name */
    private int f103195c;

    /* renamed from: d, reason: collision with root package name */
    private int f103196d;

    /* renamed from: e, reason: collision with root package name */
    private int f103197e;

    /* renamed from: f, reason: collision with root package name */
    private int f103198f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f103199g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private Object f103200h;

    /* renamed from: i, reason: collision with root package name */
    private int f103201i;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f103202a;

        /* renamed from: b, reason: collision with root package name */
        private final int f103203b;

        public a(int i11, int i12) {
            this.f103202a = i11;
            this.f103203b = i12;
        }

        public final int a() {
            return this.f103202a;
        }

        public final int b() {
            return this.f103203b;
        }
    }

    private static final class b implements InterfaceC10402s {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f103204a = new b();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f103205a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Object f103206b;

        public c(int i11, @NotNull List<C10387c> list) {
            this.f103205a = i11;
            this.f103206b = list;
        }

        public final int a() {
            return this.f103205a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<w0.c>] */
        @NotNull
        public final List<C10387c> b() {
            return this.f103206b;
        }
    }

    static final class d extends AbstractC7737t implements Function1<a, Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f103207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f103207b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.a() - this.f103207b);
        }
    }

    public N(@NotNull C10394j c10394j) {
        this.f103193a = c10394j;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0));
        this.f103194b = arrayList;
        this.f103198f = -1;
        this.f103199g = new ArrayList();
        this.f103200h = kotlin.collections.K.f71697a;
    }

    private final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.f103201i)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r9 < r7) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c b(int i11) {
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        boolean z11 = true;
        if (!this.f103193a.i()) {
            int i15 = this.f103201i;
            int i16 = i11 * i15;
            int d11 = d() - i16;
            if (i15 > d11) {
                i15 = d11;
            }
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 == this.f103200h.size()) {
                arrayList = this.f103200h;
            } else {
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i17 = 0; i17 < i15; i17++) {
                    arrayList2.add(C10387c.a(1));
                }
                this.f103200h = arrayList2;
                arrayList = arrayList2;
            }
            return new c(i16, arrayList);
        }
        int a11 = i11 / a();
        ArrayList<a> arrayList3 = this.f103194b;
        int min = Math.min(a11, arrayList3.size() - 1);
        int a12 = a() * min;
        int a13 = arrayList3.get(min).a();
        int b11 = arrayList3.get(min).b();
        int i18 = this.f103195c;
        ArrayList arrayList4 = this.f103199g;
        if (a12 <= i18 && i18 <= i11) {
            a13 = this.f103196d;
            b11 = this.f103197e;
            a12 = i18;
        } else if (min == this.f103198f && (i12 = i11 - a12) < arrayList4.size()) {
            a13 = ((Number) arrayList4.get(i12)).intValue();
            a12 = i11;
            b11 = 0;
        }
        if (a12 % a() == 0) {
            int a14 = a();
            int i19 = i11 - a12;
            if (2 <= i19) {
            }
        }
        z11 = false;
        if (z11) {
            this.f103198f = min;
            arrayList4.clear();
        }
        if (a12 > i11) {
            throw new IllegalStateException("currentLine > lineIndex");
        }
        while (a12 < i11 && a13 < d()) {
            if (z11) {
                arrayList4.add(Integer.valueOf(a13));
            }
            int i21 = 0;
            while (i21 < this.f103201i && a13 < d()) {
                if (b11 == 0) {
                    i14 = b11;
                    b11 = f(a13);
                } else {
                    i14 = 0;
                }
                i21 += b11;
                if (i21 > this.f103201i) {
                    break;
                }
                a13++;
                b11 = i14;
            }
            a12++;
            if (a12 % a() == 0 && a13 < d()) {
                if (arrayList3.size() != a12 / a()) {
                    throw new IllegalStateException("invalid starting point");
                }
                arrayList3.add(new a(a13, b11));
            }
        }
        this.f103195c = i11;
        this.f103196d = a13;
        this.f103197e = b11;
        ArrayList arrayList5 = new ArrayList();
        int i22 = 0;
        int i23 = a13;
        while (i22 < this.f103201i && i23 < d()) {
            if (b11 == 0) {
                int i24 = b11;
                b11 = f(i23);
                i13 = i24;
            } else {
                i13 = 0;
            }
            i22 += b11;
            if (i22 > this.f103201i) {
                break;
            }
            i23++;
            if (b11 <= 0) {
                throw new IllegalArgumentException("The span value should be higher than 0");
            }
            arrayList5.add(C10387c.a(b11));
            b11 = i13;
        }
        return new c(a13, arrayList5);
    }

    public final int c(int i11) {
        if (d() <= 0) {
            return 0;
        }
        if (i11 >= d()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.f103193a.i()) {
            return i11 / this.f103201i;
        }
        ArrayList<a> arrayList = this.f103194b;
        int b11 = C7714v.b(arrayList, new d(i11));
        if (b11 < 0) {
            b11 = (-b11) - 2;
        }
        int a11 = a() * b11;
        int a12 = arrayList.get(b11).a();
        if (a12 > i11) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i12 = 0;
        while (true) {
            if (a12 >= i11) {
                break;
            }
            int i13 = a12 + 1;
            int f7 = f(a12);
            i12 += f7;
            int i14 = this.f103201i;
            if (i12 >= i14) {
                if (i12 == i14) {
                    a11++;
                    i12 = 0;
                } else {
                    a11++;
                    i12 = f7;
                }
            }
            if (a11 % a() == 0 && a11 / a() >= arrayList.size()) {
                arrayList.add(new a(i13 - (i12 <= 0 ? 0 : 1), 0));
            }
            a12 = i13;
        }
        return f(i11) + i12 > this.f103201i ? a11 + 1 : a11;
    }

    public final int d() {
        return this.f103193a.j().e();
    }

    public final void e(int i11) {
        if (i11 != this.f103201i) {
            this.f103201i = i11;
            ArrayList<a> arrayList = this.f103194b;
            arrayList.clear();
            arrayList.add(new a(0, 0));
            this.f103195c = 0;
            this.f103196d = 0;
            this.f103197e = 0;
            this.f103198f = -1;
            this.f103199g.clear();
        }
    }

    public final int f(int i11) {
        b bVar = b.f103204a;
        C10600e<C10393i> d11 = this.f103193a.j().d(i11);
        return (int) d11.c().b().invoke(bVar, Integer.valueOf(i11 - d11.b())).b();
    }
}
