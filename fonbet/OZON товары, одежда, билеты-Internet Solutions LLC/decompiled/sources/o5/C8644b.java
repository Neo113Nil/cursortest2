package o5;

import A5.k;
import De.C2862e;
import I0.C3173b;
import Sc.C4001c;
import Sc.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import sf.D;
import sf.F;
import sf.G;
import sf.x;
import sf.z;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8644b implements Closeable, Flushable {

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final Regex f77714q = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f77715r = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D f77716a;

    /* renamed from: b, reason: collision with root package name */
    private final long f77717b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final D f77718c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final D f77719d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final D f77720e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<String, C1315b> f77721f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2862e f77722g;

    /* renamed from: h, reason: collision with root package name */
    private long f77723h;

    /* renamed from: i, reason: collision with root package name */
    private int f77724i;

    /* renamed from: j, reason: collision with root package name */
    private F f77725j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f77726k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f77727l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f77728m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f77729n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f77730o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C8645c f77731p;

    /* renamed from: o5.b$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1315b f77732a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f77733b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final boolean[] f77734c;

        public a(@NotNull C1315b c1315b) {
            this.f77732a = c1315b;
            C8644b.this.getClass();
            this.f77734c = new boolean[2];
        }

        private final void c(boolean z11) {
            C8644b c8644b = C8644b.this;
            synchronized (c8644b) {
                try {
                    if (this.f77733b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (Intrinsics.d(this.f77732a.b(), this)) {
                        C8644b.c(c8644b, this, z11);
                    }
                    this.f77733b = true;
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void a() {
            c(false);
        }

        public final c b() {
            c y11;
            C8644b c8644b = C8644b.this;
            synchronized (c8644b) {
                c(true);
                y11 = c8644b.y(this.f77732a.d());
            }
            return y11;
        }

        public final void d() {
            C1315b c1315b = this.f77732a;
            if (Intrinsics.d(c1315b.b(), this)) {
                c1315b.m();
            }
        }

        @NotNull
        public final D e(int i11) {
            D d11;
            C8644b c8644b = C8644b.this;
            synchronized (c8644b) {
                if (this.f77733b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f77734c[i11] = true;
                D d12 = this.f77732a.c().get(i11);
                C8645c c8645c = c8644b.f77731p;
                D file = d12;
                if (!c8645c.e(file)) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    k.a(c8645c.j(file));
                }
                d11 = d12;
            }
            return d11;
        }

        @NotNull
        public final C1315b f() {
            return this.f77732a;
        }

        @NotNull
        public final boolean[] g() {
            return this.f77734c;
        }
    }

    /* renamed from: o5.b$b, reason: collision with other inner class name */
    public final class C1315b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f77736a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final long[] f77737b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList<D> f77738c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList<D> f77739d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f77740e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f77741f;

        /* renamed from: g, reason: collision with root package name */
        private a f77742g;

        /* renamed from: h, reason: collision with root package name */
        private int f77743h;

        public C1315b(@NotNull String str) {
            this.f77736a = str;
            int i11 = C8644b.f77715r;
            C8644b.this.getClass();
            this.f77737b = new long[2];
            this.f77738c = new ArrayList<>(2);
            this.f77739d = new ArrayList<>(2);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i12 = 0; i12 < 2; i12++) {
                sb2.append(i12);
                this.f77738c.add(C8644b.this.f77716a.g(sb2.toString()));
                sb2.append(".tmp");
                this.f77739d.add(C8644b.this.f77716a.g(sb2.toString()));
                sb2.setLength(length);
            }
        }

        @NotNull
        public final ArrayList<D> a() {
            return this.f77738c;
        }

        public final a b() {
            return this.f77742g;
        }

        @NotNull
        public final ArrayList<D> c() {
            return this.f77739d;
        }

        @NotNull
        public final String d() {
            return this.f77736a;
        }

        @NotNull
        public final long[] e() {
            return this.f77737b;
        }

        public final int f() {
            return this.f77743h;
        }

        public final boolean g() {
            return this.f77740e;
        }

        public final boolean h() {
            return this.f77741f;
        }

        public final void i(a aVar) {
            this.f77742g = aVar;
        }

        public final void j(@NotNull List<String> list) {
            int size = list.size();
            int i11 = C8644b.f77715r;
            C8644b.this.getClass();
            if (size != 2) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    this.f77737b[i12] = Long.parseLong(list.get(i12));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i11) {
            this.f77743h = i11;
        }

        public final void l() {
            this.f77740e = true;
        }

        public final void m() {
            this.f77741f = true;
        }

        public final c n() {
            if (this.f77740e && this.f77742g == null && !this.f77741f) {
                ArrayList<D> arrayList = this.f77738c;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    C8644b c8644b = C8644b.this;
                    if (i11 >= size) {
                        this.f77743h++;
                        return c8644b.new c(this);
                    }
                    if (c8644b.f77731p.e(arrayList.get(i11))) {
                        i11++;
                    } else {
                        try {
                            c8644b.R(this);
                            return null;
                        } catch (IOException unused) {
                        }
                    }
                }
            }
            return null;
        }

        public final void o(@NotNull F f7) {
            for (long j11 : this.f77737b) {
                f7.h0(32);
                f7.Y(j11);
            }
        }
    }

    /* renamed from: o5.b$c */
    public final class c implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1315b f77745a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f77746b;

        public c(@NotNull C1315b c1315b) {
            this.f77745a = c1315b;
        }

        public final a c() {
            a x11;
            C8644b c8644b = C8644b.this;
            synchronized (c8644b) {
                close();
                x11 = c8644b.x(this.f77745a.d());
            }
            return x11;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f77746b) {
                return;
            }
            this.f77746b = true;
            C8644b c8644b = C8644b.this;
            synchronized (c8644b) {
                try {
                    this.f77745a.k(r1.f() - 1);
                    if (this.f77745a.f() == 0 && this.f77745a.h()) {
                        c8644b.R(this.f77745a);
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @NotNull
        public final D d(int i11) {
            if (this.f77746b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.f77745a.a().get(i11);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: o5.b$d */
    static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return C8644b.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            C8644b c8644b = C8644b.this;
            synchronized (c8644b) {
                if (!c8644b.f77727l || c8644b.f77728m) {
                    return Unit.f71690a;
                }
                try {
                    c8644b.W();
                } catch (IOException unused) {
                    c8644b.f77729n = true;
                }
                try {
                    if (C8644b.o(c8644b)) {
                        c8644b.Z();
                    }
                } catch (IOException unused2) {
                    c8644b.f77730o = true;
                    c8644b.f77725j = z.c(z.b());
                }
                return Unit.f71690a;
            }
        }
    }

    public C8644b(long j11, @NotNull He.b bVar, @NotNull x xVar, @NotNull D d11) {
        this.f77716a = d11;
        this.f77717b = j11;
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f77718c = d11.g("journal");
        this.f77719d = d11.g("journal.tmp");
        this.f77720e = d11.g("journal.bkp");
        this.f77721f = new LinkedHashMap<>(0, 0.75f, true);
        this.f77722g = N.a(CoroutineContext.Element.a.d(bVar.w(1), (H0) X0.b()));
        this.f77731p = new C8645c(xVar);
    }

    private final void B() {
        C10727i.c(this.f77722g, null, null, new d(null), 3);
    }

    private final F I() {
        C8645c c8645c = this.f77731p;
        c8645c.getClass();
        D file = this.f77718c;
        Intrinsics.checkNotNullParameter(file, "file");
        return z.c(new C8647e(c8645c.l(file), new C8646d(this)));
    }

    private final void L() {
        Iterator<C1315b> it = this.f77721f.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            C1315b next = it.next();
            int i11 = 0;
            if (next.b() == null) {
                while (i11 < 2) {
                    j11 += next.e()[i11];
                    i11++;
                }
            } else {
                next.i(null);
                while (i11 < 2) {
                    D d11 = next.a().get(i11);
                    C8645c c8645c = this.f77731p;
                    c8645c.d(d11);
                    c8645c.d(next.c().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
        this.f77723h = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void O() {
        Unit unit;
        G d11 = z.d(this.f77731p.k(this.f77718c));
        Throwable th2 = null;
        try {
            String s11 = d11.s(Long.MAX_VALUE);
            String s12 = d11.s(Long.MAX_VALUE);
            String s13 = d11.s(Long.MAX_VALUE);
            String s14 = d11.s(Long.MAX_VALUE);
            String s15 = d11.s(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(s11) || !"1".equals(s12) || !Intrinsics.d(String.valueOf(1), s13) || !Intrinsics.d(String.valueOf(2), s14) || s15.length() > 0) {
                throw new IOException("unexpected journal header: [" + s11 + ", " + s12 + ", " + s13 + ", " + s14 + ", " + s15 + ']');
            }
            int i11 = 0;
            while (true) {
                try {
                    Q(d11.s(Long.MAX_VALUE));
                    i11++;
                } catch (EOFException unused) {
                    this.f77724i = i11 - this.f77721f.size();
                    if (d11.c()) {
                        this.f77725j = I();
                    } else {
                        Z();
                    }
                    unit = Unit.f71690a;
                    try {
                        d11.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    if (th2 == null) {
                        throw th2;
                    }
                    Intrinsics.f(unit);
                    return;
                }
            }
        } catch (Throwable th4) {
            try {
                d11.close();
            } catch (Throwable th5) {
                C4001c.a(th4, th5);
            }
            th2 = th4;
            unit = null;
            if (th2 == null) {
            }
        }
    }

    private final void Q(String str) {
        String substring;
        int I11 = h.I(' ', 0, 6, str);
        if (I11 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i11 = I11 + 1;
        int I12 = h.I(' ', i11, 4, str);
        LinkedHashMap<String, C1315b> linkedHashMap = this.f77721f;
        if (I12 == -1) {
            substring = str.substring(i11);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            if (I11 == 6 && h.e0(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i11, I12);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        C1315b c1315b = linkedHashMap.get(substring);
        if (c1315b == null) {
            c1315b = new C1315b(substring);
            linkedHashMap.put(substring, c1315b);
        }
        C1315b c1315b2 = c1315b;
        if (I12 != -1 && I11 == 5 && h.e0(str, "CLEAN", false)) {
            String substring2 = str.substring(I12 + 1);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            List<String> l11 = h.l(substring2, new char[]{' '}, 0, 6);
            c1315b2.l();
            c1315b2.i(null);
            c1315b2.j(l11);
            return;
        }
        if (I12 == -1 && I11 == 5 && h.e0(str, "DIRTY", false)) {
            c1315b2.i(new a(c1315b2));
        } else if (I12 != -1 || I11 != 4 || !h.e0(str, "READ", false)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(C1315b c1315b) {
        F f7;
        if (c1315b.f() > 0 && (f7 = this.f77725j) != null) {
            f7.h1("DIRTY");
            f7.h0(32);
            f7.h1(c1315b.d());
            f7.h0(10);
            f7.flush();
        }
        if (c1315b.f() > 0 || c1315b.b() != null) {
            c1315b.m();
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f77731p.d(c1315b.a().get(i11));
            this.f77723h -= c1315b.e()[i11];
            c1315b.e()[i11] = 0;
        }
        this.f77724i++;
        F f11 = this.f77725j;
        if (f11 != null) {
            f11.h1("REMOVE");
            f11.h0(32);
            f11.h1(c1315b.d());
            f11.h0(10);
        }
        this.f77721f.remove(c1315b.d());
        if (this.f77724i >= 2000) {
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        R(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        while (this.f77723h > this.f77717b) {
            Iterator<C1315b> it = this.f77721f.values().iterator();
            while (it.hasNext()) {
                C1315b next = it.next();
                if (!next.h()) {
                    break;
                }
            }
            return;
        }
        this.f77729n = false;
    }

    private static void X(String str) {
        if (!f77714q.f(str)) {
            throw new IllegalArgumentException(C3173b.a('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void Z() {
        Unit unit;
        try {
            F f7 = this.f77725j;
            if (f7 != null) {
                f7.close();
            }
            F c11 = z.c(this.f77731p.j(this.f77719d));
            Throwable th2 = null;
            try {
                c11.h1("libcore.io.DiskLruCache");
                c11.h0(10);
                c11.h1("1");
                c11.h0(10);
                c11.Y(1);
                c11.h0(10);
                c11.Y(2);
                c11.h0(10);
                c11.h0(10);
                for (C1315b c1315b : this.f77721f.values()) {
                    if (c1315b.b() != null) {
                        c11.h1("DIRTY");
                        c11.h0(32);
                        c11.h1(c1315b.d());
                        c11.h0(10);
                    } else {
                        c11.h1("CLEAN");
                        c11.h0(32);
                        c11.h1(c1315b.d());
                        c1315b.o(c11);
                        c11.h0(10);
                    }
                }
                unit = Unit.f71690a;
                try {
                    c11.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c11.close();
                } catch (Throwable th5) {
                    C4001c.a(th4, th5);
                }
                unit = null;
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.f(unit);
            if (this.f77731p.e(this.f77718c)) {
                this.f77731p.m(this.f77718c, this.f77720e);
                this.f77731p.m(this.f77719d, this.f77718c);
                this.f77731p.d(this.f77720e);
            } else {
                this.f77731p.m(this.f77719d, this.f77718c);
            }
            this.f77725j = I();
            this.f77724i = 0;
            this.f77726k = false;
            this.f77730o = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if ((r9.f77724i >= 2000) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127 A[Catch: all -> 0x003b, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0013, B:11:0x001c, B:13:0x0024, B:16:0x0036, B:26:0x0044, B:28:0x0060, B:29:0x0084, B:31:0x0096, B:33:0x009d, B:36:0x0066, B:38:0x0078, B:40:0x00c1, B:42:0x00cb, B:45:0x00d0, B:47:0x00e1, B:50:0x00e8, B:51:0x011c, B:53:0x0127, B:59:0x0130, B:60:0x0104, B:63:0x00af, B:65:0x0135, B:66:0x013c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(C8644b c8644b, a aVar, boolean z11) {
        synchronized (c8644b) {
            C1315b f7 = aVar.f();
            if (!Intrinsics.d(f7.b(), aVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z11 || f7.h()) {
                for (int i11 = 0; i11 < 2; i11++) {
                    c8644b.f77731p.d(f7.c().get(i11));
                }
            } else {
                for (int i12 = 0; i12 < 2; i12++) {
                    if (aVar.g()[i12] && !c8644b.f77731p.e(f7.c().get(i12))) {
                        aVar.a();
                        return;
                    }
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    D d11 = f7.c().get(i13);
                    D d12 = f7.a().get(i13);
                    if (c8644b.f77731p.e(d11)) {
                        c8644b.f77731p.m(d11, d12);
                    } else {
                        C8645c c8645c = c8644b.f77731p;
                        D file = f7.a().get(i13);
                        if (!c8645c.e(file)) {
                            Intrinsics.checkNotNullParameter(file, "file");
                            k.a(c8645c.j(file));
                        }
                    }
                    long j11 = f7.e()[i13];
                    Long c11 = c8644b.f77731p.g(d12).c();
                    long longValue = c11 != null ? c11.longValue() : 0L;
                    f7.e()[i13] = longValue;
                    c8644b.f77723h = (c8644b.f77723h - j11) + longValue;
                }
            }
            f7.i(null);
            if (f7.h()) {
                c8644b.R(f7);
                return;
            }
            c8644b.f77724i++;
            F f11 = c8644b.f77725j;
            Intrinsics.f(f11);
            if (!z11 && !f7.g()) {
                c8644b.f77721f.remove(f7.d());
                f11.h1("REMOVE");
                f11.h0(32);
                f11.h1(f7.d());
                f11.h0(10);
                f11.flush();
                if (c8644b.f77723h <= c8644b.f77717b) {
                }
                c8644b.B();
            }
            f7.l();
            f11.h1("CLEAN");
            f11.h0(32);
            f11.h1(f7.d());
            f7.o(f11);
            f11.h0(10);
            f11.flush();
            if (c8644b.f77723h <= c8644b.f77717b) {
            }
            c8644b.B();
        }
    }

    public static final boolean o(C8644b c8644b) {
        return c8644b.f77724i >= 2000;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f77727l && !this.f77728m) {
                for (C1315b c1315b : (C1315b[]) this.f77721f.values().toArray(new C1315b[0])) {
                    a b11 = c1315b.b();
                    if (b11 != null) {
                        b11.d();
                    }
                }
                W();
                N.c(this.f77722g, null);
                F f7 = this.f77725j;
                Intrinsics.f(f7);
                f7.close();
                this.f77725j = null;
                this.f77728m = true;
                return;
            }
            this.f77728m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f77727l) {
            if (this.f77728m) {
                throw new IllegalStateException("cache is closed");
            }
            W();
            F f7 = this.f77725j;
            Intrinsics.f(f7);
            f7.flush();
        }
    }

    public final synchronized a x(@NotNull String str) {
        if (this.f77728m) {
            throw new IllegalStateException("cache is closed");
        }
        X(str);
        z();
        C1315b c1315b = this.f77721f.get(str);
        if ((c1315b != null ? c1315b.b() : null) != null) {
            return null;
        }
        if (c1315b != null && c1315b.f() != 0) {
            return null;
        }
        if (!this.f77729n && !this.f77730o) {
            F f7 = this.f77725j;
            Intrinsics.f(f7);
            f7.h1("DIRTY");
            f7.h0(32);
            f7.h1(str);
            f7.h0(10);
            f7.flush();
            if (this.f77726k) {
                return null;
            }
            if (c1315b == null) {
                c1315b = new C1315b(str);
                this.f77721f.put(str, c1315b);
            }
            a aVar = new a(c1315b);
            c1315b.i(aVar);
            return aVar;
        }
        B();
        return null;
    }

    public final synchronized c y(@NotNull String str) {
        c n11;
        if (this.f77728m) {
            throw new IllegalStateException("cache is closed");
        }
        X(str);
        z();
        C1315b c1315b = this.f77721f.get(str);
        if (c1315b != null && (n11 = c1315b.n()) != null) {
            boolean z11 = true;
            this.f77724i++;
            F f7 = this.f77725j;
            Intrinsics.f(f7);
            f7.h1("READ");
            f7.h0(32);
            f7.h1(str);
            f7.h0(10);
            if (this.f77724i < 2000) {
                z11 = false;
            }
            if (z11) {
                B();
            }
            return n11;
        }
        return null;
    }

    public final synchronized void z() {
        try {
            if (this.f77727l) {
                return;
            }
            this.f77731p.d(this.f77719d);
            if (this.f77731p.e(this.f77720e)) {
                if (this.f77731p.e(this.f77718c)) {
                    this.f77731p.d(this.f77720e);
                } else {
                    this.f77731p.m(this.f77720e, this.f77718c);
                }
            }
            if (this.f77731p.e(this.f77718c)) {
                try {
                    O();
                    L();
                    this.f77727l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        A5.d.a(this.f77731p, this.f77716a);
                        this.f77728m = false;
                    } catch (Throwable th2) {
                        this.f77728m = false;
                        throw th2;
                    }
                }
            }
            Z();
            this.f77727l = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
