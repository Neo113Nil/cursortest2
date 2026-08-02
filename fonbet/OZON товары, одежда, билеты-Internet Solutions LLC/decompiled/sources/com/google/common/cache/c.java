package com.google.common.cache;

import Bl0.k0;
import O7.g;
import O7.p;
import O7.q;
import O7.s;
import com.google.common.cache.f;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c<K, V> {

    /* renamed from: o, reason: collision with root package name */
    static final p<? extends com.google.common.cache.a> f58868o = q.b(new a());

    /* renamed from: p, reason: collision with root package name */
    static final s f58869p = new b();

    /* renamed from: e, reason: collision with root package name */
    n<? super K, ? super V> f58874e;

    /* renamed from: f, reason: collision with root package name */
    f.r f58875f;

    /* renamed from: g, reason: collision with root package name */
    f.r f58876g;

    /* renamed from: j, reason: collision with root package name */
    O7.d<Object> f58879j;

    /* renamed from: k, reason: collision with root package name */
    O7.d<Object> f58880k;

    /* renamed from: l, reason: collision with root package name */
    l<? super K, ? super V> f58881l;

    /* renamed from: m, reason: collision with root package name */
    s f58882m;

    /* renamed from: a, reason: collision with root package name */
    boolean f58870a = true;

    /* renamed from: b, reason: collision with root package name */
    int f58871b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f58872c = -1;

    /* renamed from: d, reason: collision with root package name */
    long f58873d = -1;

    /* renamed from: h, reason: collision with root package name */
    long f58877h = -1;

    /* renamed from: i, reason: collision with root package name */
    long f58878i = -1;

    /* renamed from: n, reason: collision with root package name */
    p<? extends com.google.common.cache.a> f58883n = f58868o;

    final class a implements com.google.common.cache.a {
        @Override // com.google.common.cache.a
        public final void a() {
        }

        @Override // com.google.common.cache.a
        public final void b(long j11) {
        }

        @Override // com.google.common.cache.a
        public final void c() {
        }

        @Override // com.google.common.cache.a
        public final void d(long j11) {
        }

        @Override // com.google.common.cache.a
        public final void e() {
        }
    }

    final class b extends s {
        b() {
        }

        @Override // O7.s
        public final long a() {
            return 0L;
        }
    }

    /* renamed from: com.google.common.cache.c$c, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    private static final class C0894c {

        /* renamed from: a, reason: collision with root package name */
        static final Logger f58884a = Logger.getLogger(c.class.getName());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class d implements l<Object, Object> {
        private static final /* synthetic */ d[] $VALUES;
        public static final d INSTANCE;

        static {
            d dVar = new d("INSTANCE", 0);
            INSTANCE = dVar;
            $VALUES = new d[]{dVar};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class e implements n<Object, Object> {
        private static final /* synthetic */ e[] $VALUES;
        public static final e INSTANCE;

        static {
            e eVar = new e("INSTANCE", 0);
            INSTANCE = eVar;
            $VALUES = new e[]{eVar};
        }

        private e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    private c() {
    }

    public static c<Object, Object> c() {
        return new c<>();
    }

    public final <K1 extends K, V1 extends V> com.google.common.cache.b<K1, V1> a() {
        if (this.f58874e == null) {
            k0.l("maximumWeight requires weigher", this.f58873d == -1);
        } else if (this.f58870a) {
            k0.l("weigher requires maximumWeight", this.f58873d != -1);
        } else if (this.f58873d == -1) {
            C0894c.f58884a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
        return new f.m(this);
    }

    public final void b(long j11) {
        long j12 = this.f58872c;
        k0.j(j12, "maximum size was already set to %s", j12 == -1);
        long j13 = this.f58873d;
        k0.j(j13, "maximum weight was already set to %s", j13 == -1);
        k0.l("maximum size can not be combined with weigher", this.f58874e == null);
        k0.d("maximum size must not be negative", j11 >= 0);
        this.f58872c = j11;
    }

    public final String toString() {
        g.a b11 = O7.g.b(this);
        int i11 = this.f58871b;
        if (i11 != -1) {
            b11.a(i11, "concurrencyLevel");
        }
        long j11 = this.f58872c;
        if (j11 != -1) {
            b11.b(j11, "maximumSize");
        }
        long j12 = this.f58873d;
        if (j12 != -1) {
            b11.b(j12, "maximumWeight");
        }
        if (this.f58877h != -1) {
            b11.c("expireAfterWrite", P4.f.a(this.f58877h, "ns", new StringBuilder()));
        }
        if (this.f58878i != -1) {
            b11.c("expireAfterAccess", P4.f.a(this.f58878i, "ns", new StringBuilder()));
        }
        f.r rVar = this.f58875f;
        if (rVar != null) {
            b11.c("keyStrength", O7.b.b(rVar.toString()));
        }
        f.r rVar2 = this.f58876g;
        if (rVar2 != null) {
            b11.c("valueStrength", O7.b.b(rVar2.toString()));
        }
        if (this.f58879j != null) {
            b11.d("keyEquivalence");
        }
        if (this.f58880k != null) {
            b11.d("valueEquivalence");
        }
        if (this.f58881l != null) {
            b11.d("removalListener");
        }
        return b11.toString();
    }
}
