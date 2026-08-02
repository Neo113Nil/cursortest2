package u4;

import N3.C3659j;
import N3.H;
import N3.InterfaceC3665p;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.o;
import m3.C8049B;
import m3.C8050C;
import m3.C8056I;
import m3.N;
import u4.J;

/* loaded from: classes.dex */
public final class I implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final int f99933a;

    /* renamed from: b, reason: collision with root package name */
    private final int f99934b;

    /* renamed from: c, reason: collision with root package name */
    private final List<C8056I> f99935c;

    /* renamed from: d, reason: collision with root package name */
    private final C8050C f99936d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseIntArray f99937e;

    /* renamed from: f, reason: collision with root package name */
    private final C9955i f99938f;

    /* renamed from: g, reason: collision with root package name */
    private final o.a f99939g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseArray<J> f99940h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f99941i;

    /* renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f99942j;

    /* renamed from: k, reason: collision with root package name */
    private final G f99943k;

    /* renamed from: l, reason: collision with root package name */
    private F f99944l;

    /* renamed from: m, reason: collision with root package name */
    private N3.r f99945m;

    /* renamed from: n, reason: collision with root package name */
    private int f99946n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f99947o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f99948p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f99949q;

    /* renamed from: r, reason: collision with root package name */
    private J f99950r;

    /* renamed from: s, reason: collision with root package name */
    private int f99951s;

    /* renamed from: t, reason: collision with root package name */
    private int f99952t;

    private class a implements C {

        /* renamed from: a, reason: collision with root package name */
        private final C8049B f99953a = new C8049B(4, new byte[4]);

        public a() {
        }

        @Override // u4.C
        public final void a(C8056I c8056i, N3.r rVar, J.d dVar) {
        }

        @Override // u4.C
        public final void c(C8050C c8050c) {
            I i11;
            if (c8050c.E() == 0 && (c8050c.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                c8050c.S(6);
                int a11 = c8050c.a() / 4;
                int i12 = 0;
                while (true) {
                    i11 = I.this;
                    if (i12 >= a11) {
                        break;
                    }
                    C8049B c8049b = this.f99953a;
                    c8050c.n(0, 4, c8049b.f74257a);
                    c8049b.n(0);
                    int h11 = c8049b.h(16);
                    c8049b.p(3);
                    if (h11 == 0) {
                        c8049b.p(13);
                    } else {
                        int h12 = c8049b.h(13);
                        if (i11.f99940h.get(h12) == null) {
                            i11.f99940h.put(h12, new D(i11.new b(h12)));
                            I.l(i11);
                        }
                    }
                    i12++;
                }
                if (i11.f99933a != 2) {
                    i11.f99940h.remove(0);
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    private class b implements C {

        /* renamed from: a, reason: collision with root package name */
        private final C8049B f99955a = new C8049B(5, new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<J> f99956b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f99957c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f99958d;

        public b(int i11) {
            this.f99958d = i11;
        }

        @Override // u4.C
        public final void a(C8056I c8056i, N3.r rVar, J.d dVar) {
        }

        @Override // u4.C
        public final void c(C8050C c8050c) {
            C8056I c8056i;
            int i11;
            C8049B c8049b;
            int i12;
            if (c8050c.E() != 2) {
                return;
            }
            I i13 = I.this;
            int i14 = 0;
            if (i13.f99933a == 1 || i13.f99933a == 2 || i13.f99946n == 1) {
                c8056i = (C8056I) i13.f99935c.get(0);
            } else {
                c8056i = new C8056I(((C8056I) i13.f99935c.get(0)).d());
                i13.f99935c.add(c8056i);
            }
            if ((c8050c.E() & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return;
            }
            c8050c.S(1);
            int L11 = c8050c.L();
            int i15 = 3;
            c8050c.S(3);
            C8049B c8049b2 = this.f99955a;
            c8050c.n(0, 2, c8049b2.f74257a);
            c8049b2.n(0);
            c8049b2.p(3);
            int i16 = 13;
            i13.f99952t = c8049b2.h(13);
            c8050c.n(0, 2, c8049b2.f74257a);
            c8049b2.n(0);
            int i17 = 4;
            c8049b2.p(4);
            int i18 = 12;
            c8050c.S(c8049b2.h(12));
            if (i13.f99933a == 2 && i13.f99950r == null) {
                i13.f99950r = ((C9955i) i13.f99938f).a(21, new J.b(21, null, 0, null, N.f74291c));
                if (i13.f99950r != null) {
                    i13.f99950r.a(c8056i, i13.f99945m, new J.d(L11, 21, 8192));
                }
            }
            SparseArray<J> sparseArray = this.f99956b;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.f99957c;
            sparseIntArray.clear();
            int a11 = c8050c.a();
            while (a11 > 0) {
                int i19 = 5;
                c8050c.n(i14, 5, c8049b2.f74257a);
                c8049b2.n(i14);
                int h11 = c8049b2.h(8);
                c8049b2.p(i15);
                int h12 = c8049b2.h(i16);
                c8049b2.p(i17);
                int h13 = c8049b2.h(i18);
                int f7 = c8050c.f();
                int i21 = f7 + h13;
                int i22 = -1;
                String str = null;
                ArrayList arrayList = null;
                int i23 = 0;
                while (c8050c.f() < i21) {
                    int E11 = c8050c.E();
                    int f11 = c8050c.f() + c8050c.E();
                    if (f11 > i21) {
                        break;
                    }
                    if (E11 == i19) {
                        long G11 = c8050c.G();
                        if (G11 == 1094921523) {
                            i22 = 129;
                        } else if (G11 == 1161904947) {
                            i22 = 135;
                        } else {
                            if (G11 != 1094921524) {
                                if (G11 == 1212503619) {
                                    i22 = 36;
                                }
                            }
                            i22 = 172;
                        }
                        i11 = f11;
                        c8049b = c8049b2;
                        i12 = a11;
                    } else if (E11 == 106) {
                        i11 = f11;
                        c8049b = c8049b2;
                        i12 = a11;
                        i22 = 129;
                    } else if (E11 == 122) {
                        c8049b = c8049b2;
                        i12 = a11;
                        i22 = 135;
                        i11 = f11;
                    } else if (E11 == 127) {
                        int E12 = c8050c.E();
                        if (E12 != 21) {
                            if (E12 == 14) {
                                i22 = 136;
                            } else if (E12 == 33) {
                                i22 = 139;
                            }
                            i11 = f11;
                            c8049b = c8049b2;
                            i12 = a11;
                        }
                        i22 = 172;
                        i11 = f11;
                        c8049b = c8049b2;
                        i12 = a11;
                    } else {
                        if (E11 == 123) {
                            i11 = f11;
                            c8049b = c8049b2;
                            i22 = 138;
                        } else if (E11 == 10) {
                            String trim = c8050c.C(3, StandardCharsets.UTF_8).trim();
                            i23 = c8050c.E();
                            i11 = f11;
                            c8049b = c8049b2;
                            str = trim;
                        } else {
                            if (E11 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c8050c.f() < f11) {
                                    String trim2 = c8050c.C(3, StandardCharsets.UTF_8).trim();
                                    c8050c.E();
                                    C8049B c8049b3 = c8049b2;
                                    byte[] bArr = new byte[4];
                                    c8050c.n(0, 4, bArr);
                                    arrayList2.add(new J.a(trim2, bArr));
                                    c8049b2 = c8049b3;
                                    f11 = f11;
                                    a11 = a11;
                                }
                                i11 = f11;
                                c8049b = c8049b2;
                                i12 = a11;
                                arrayList = arrayList2;
                                i22 = 89;
                            } else {
                                i11 = f11;
                                c8049b = c8049b2;
                                i12 = a11;
                                if (E11 == 111) {
                                    i22 = 257;
                                }
                            }
                            c8050c.S(i11 - c8050c.f());
                            c8049b2 = c8049b;
                            a11 = i12;
                            i19 = 5;
                        }
                        i12 = a11;
                    }
                    c8050c.S(i11 - c8050c.f());
                    c8049b2 = c8049b;
                    a11 = i12;
                    i19 = 5;
                }
                C8049B c8049b4 = c8049b2;
                int i24 = a11;
                c8050c.R(i21);
                J.b bVar = new J.b(i22, str, i23, arrayList, Arrays.copyOfRange(c8050c.e(), f7, i21));
                if (h11 == 6 || h11 == 5) {
                    h11 = i22;
                }
                a11 = i24 - (h13 + 5);
                int i25 = i13.f99933a == 2 ? h11 : h12;
                if (!i13.f99941i.get(i25)) {
                    J a12 = (i13.f99933a == 2 && h11 == 21) ? i13.f99950r : ((C9955i) i13.f99938f).a(h11, bVar);
                    if (i13.f99933a != 2 || h12 < sparseIntArray.get(i25, 8192)) {
                        sparseIntArray.put(i25, h12);
                        sparseArray.put(i25, a12);
                    }
                }
                i17 = 4;
                c8049b2 = c8049b4;
                i14 = 0;
                i15 = 3;
                i16 = 13;
                i18 = 12;
            }
            int size = sparseIntArray.size();
            for (int i26 = 0; i26 < size; i26++) {
                int keyAt = sparseIntArray.keyAt(i26);
                int valueAt = sparseIntArray.valueAt(i26);
                i13.f99941i.put(keyAt, true);
                i13.f99942j.put(valueAt, true);
                J valueAt2 = sparseArray.valueAt(i26);
                if (valueAt2 != null) {
                    if (valueAt2 != i13.f99950r) {
                        valueAt2.a(c8056i, i13.f99945m, new J.d(L11, keyAt, 8192));
                    }
                    i13.f99940h.put(valueAt, valueAt2);
                }
            }
            if (i13.f99933a == 2) {
                if (i13.f99947o) {
                    return;
                }
                i13.f99945m.endTracks();
                i13.f99946n = 0;
                i13.f99947o = true;
                return;
            }
            i13.f99940h.remove(this.f99958d);
            i13.f99946n = i13.f99933a == 1 ? 0 : i13.f99946n - 1;
            if (i13.f99946n == 0) {
                i13.f99945m.endTracks();
                i13.f99947o = true;
            }
        }
    }

    public I(int i11, int i12, o.a aVar, C8056I c8056i, C9955i c9955i) {
        this.f99938f = c9955i;
        this.f99933a = i11;
        this.f99934b = i12;
        this.f99939g = aVar;
        if (i11 == 1 || i11 == 2) {
            this.f99935c = Collections.singletonList(c8056i);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f99935c = arrayList;
            arrayList.add(c8056i);
        }
        this.f99936d = new C8050C(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f99941i = sparseBooleanArray;
        this.f99942j = new SparseBooleanArray();
        SparseArray<J> sparseArray = new SparseArray<>();
        this.f99940h = sparseArray;
        this.f99937e = new SparseIntArray();
        this.f99943k = new G();
        this.f99945m = N3.r.f18647V;
        this.f99952t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i13 = 0; i13 < size; i13++) {
            sparseArray.put(sparseArray2.keyAt(i13), (J) sparseArray2.valueAt(i13));
        }
        sparseArray.put(0, new D(new a()));
        this.f99950r = null;
    }

    static /* synthetic */ void l(I i11) {
        i11.f99946n++;
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        F f7;
        G10.a.h(this.f99933a != 2);
        List<C8056I> list = this.f99935c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C8056I c8056i = list.get(i11);
            boolean z11 = c8056i.f() == -9223372036854775807L;
            if (!z11) {
                long d11 = c8056i.d();
                z11 = (d11 == -9223372036854775807L || d11 == 0 || d11 == j12) ? false : true;
            }
            if (z11) {
                c8056i.h(j12);
            }
        }
        if (j12 != 0 && (f7 = this.f99944l) != null) {
            f7.e(j12);
        }
        this.f99936d.O(0);
        this.f99937e.clear();
        int i12 = 0;
        while (true) {
            SparseArray<J> sparseArray = this.f99940h;
            if (i12 >= sparseArray.size()) {
                this.f99951s = 0;
                return;
            } else {
                sparseArray.valueAt(i12).b();
                i12++;
            }
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        if ((this.f99934b & 1) == 0) {
            rVar = new k4.p(rVar, this.f99939g);
        }
        this.f99945m = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(N3.q qVar) throws IOException {
        byte[] e11 = this.f99936d.e();
        C3659j c3659j = (C3659j) qVar;
        c3659j.d(e11, 0, 940, false);
        int i11 = 0;
        while (i11 < 188) {
            for (int i12 = 0; i12 < 5; i12++) {
                if (e11[(i12 * 188) + i11] != 71) {
                    break;
                }
            }
            c3659j.m(i11, false);
            return true;
        }
        return false;
    }

    @Override // N3.InterfaceC3665p
    public final int f(N3.q qVar, N3.G g10) throws IOException {
        long j11;
        C3659j c3659j = (C3659j) qVar;
        long length = c3659j.getLength();
        int i11 = this.f99933a;
        boolean z11 = i11 == 2;
        if (this.f99947o) {
            G g11 = this.f99943k;
            if (length != -1 && !z11 && !g11.d()) {
                return g11.e(c3659j, g10, this.f99952t);
            }
            if (!this.f99948p) {
                this.f99948p = true;
                if (g11.b() != -9223372036854775807L) {
                    F f7 = new F(g11.c(), g11.b(), length, this.f99952t);
                    this.f99944l = f7;
                    this.f99945m.seekMap(f7.a());
                } else {
                    this.f99945m.seekMap(new H.b(g11.b()));
                }
            }
            if (this.f99949q) {
                this.f99949q = false;
                a(0L, 0L);
                if (c3659j.getPosition() != 0) {
                    g10.f18501a = 0L;
                    return 1;
                }
            }
            F f11 = this.f99944l;
            if (f11 != null && f11.c()) {
                return this.f99944l.b(c3659j, g10);
            }
        }
        C8050C c8050c = this.f99936d;
        byte[] e11 = c8050c.e();
        int i12 = 188;
        if (9400 - c8050c.f() < 188) {
            int a11 = c8050c.a();
            if (a11 > 0) {
                System.arraycopy(e11, c8050c.f(), e11, 0, a11);
            }
            c8050c.P(a11, e11);
        }
        while (true) {
            int a12 = c8050c.a();
            SparseArray<J> sparseArray = this.f99940h;
            if (a12 >= i12) {
                int f12 = c8050c.f();
                int i13 = c8050c.i();
                int c11 = O7.h.c(f12, i13, c8050c.e());
                c8050c.R(c11);
                int i14 = c11 + 188;
                if (i14 > i13) {
                    int i15 = (c11 - f12) + this.f99951s;
                    this.f99951s = i15;
                    if (i11 == 2 && i15 > 376) {
                        throw j3.v.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    this.f99951s = 0;
                }
                int i16 = c8050c.i();
                if (i14 > i16) {
                    return 0;
                }
                int p11 = c8050c.p();
                if ((8388608 & p11) != 0) {
                    c8050c.R(i14);
                    return 0;
                }
                int i17 = (4194304 & p11) != 0 ? 1 : 0;
                int i18 = (2096896 & p11) >> 8;
                boolean z12 = (p11 & 32) != 0;
                J j12 = (p11 & 16) != 0 ? sparseArray.get(i18) : null;
                if (j12 == null) {
                    c8050c.R(i14);
                    return 0;
                }
                if (i11 != 2) {
                    int i19 = p11 & 15;
                    SparseIntArray sparseIntArray = this.f99937e;
                    j11 = -1;
                    int i21 = sparseIntArray.get(i18, i19 - 1);
                    sparseIntArray.put(i18, i19);
                    if (i21 == i19) {
                        c8050c.R(i14);
                        return 0;
                    }
                    if (i19 != ((i21 + 1) & 15)) {
                        j12.b();
                    }
                } else {
                    j11 = -1;
                }
                if (z12) {
                    int E11 = c8050c.E();
                    i17 |= (c8050c.E() & 64) != 0 ? 2 : 0;
                    c8050c.S(E11 - 1);
                }
                boolean z13 = this.f99947o;
                if (i11 == 2 || z13 || !this.f99942j.get(i18, false)) {
                    c8050c.Q(i14);
                    j12.c(i17, c8050c);
                    c8050c.Q(i16);
                }
                if (i11 != 2 && !z13 && this.f99947o && length != j11) {
                    this.f99949q = true;
                }
                c8050c.R(i14);
                return 0;
            }
            int i22 = c8050c.i();
            int read = c3659j.read(e11, i22, 9400 - i22);
            if (read == -1) {
                for (int i23 = 0; i23 < sparseArray.size(); i23++) {
                    J valueAt = sparseArray.valueAt(i23);
                    if (valueAt instanceof x) {
                        x xVar = (x) valueAt;
                        if (xVar.d(z11)) {
                            xVar.c(1, new C8050C());
                        }
                    }
                }
                return -1;
            }
            c8050c.Q(i22 + read);
            i12 = 188;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
