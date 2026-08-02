package C7;

import C7.C1047k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047k implements D6.n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1053q f1277a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.L f1278b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1052p f1279c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.t f1280d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1281e;

    /* renamed from: f, reason: collision with root package name */
    public final x6.d f1282f;

    /* renamed from: g, reason: collision with root package name */
    public final x6.d f1283g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f1284h;

    /* renamed from: i, reason: collision with root package name */
    public final Lazy f1285i;

    /* renamed from: C7.k$a */
    public static final class a implements InterfaceC1039c {

        /* renamed from: a, reason: collision with root package name */
        public final Lazy f1286a;

        /* renamed from: b, reason: collision with root package name */
        public final Lazy f1287b;

        /* renamed from: c, reason: collision with root package name */
        public final Lazy f1288c;

        /* renamed from: d, reason: collision with root package name */
        public final Lazy f1289d;

        /* renamed from: e, reason: collision with root package name */
        public final Lazy f1290e;

        /* renamed from: f, reason: collision with root package name */
        public final Lazy f1291f;

        public a(final C1047k c1047k) {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            this.f1286a = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: C7.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    x6.k p10;
                    p10 = C1047k.a.p(C1047k.this);
                    return p10;
                }
            });
            this.f1287b = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: C7.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    A7.j o10;
                    o10 = C1047k.a.o(C1047k.a.this, c1047k);
                    return o10;
                }
            });
            this.f1288c = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: C7.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    x6.k r10;
                    r10 = C1047k.a.r(C1047k.this);
                    return r10;
                }
            });
            this.f1289d = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: C7.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    A7.j q10;
                    q10 = C1047k.a.q(C1047k.a.this, c1047k);
                    return q10;
                }
            });
            this.f1290e = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: C7.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Map k10;
                    k10 = C1047k.a.k(C1047k.this, this);
                    return k10;
                }
            });
            this.f1291f = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: C7.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    D6.g j10;
                    j10 = C1047k.a.j(C1047k.a.this, c1047k);
                    return j10;
                }
            });
        }

        public static final D6.g j(a this$0, C1047k this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map l10 = this$0.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(l10.size()));
            for (Map.Entry entry : l10.entrySet()) {
                Object key = entry.getKey();
                x6.k kVar = (x6.k) entry.getValue();
                G6.i i10 = this$1.f1278b.i(this$1.f1281e);
                Intrinsics.checkNotNullExpressionValue(i10, "getPooledByteBufferFactory(...)");
                G6.l j10 = this$1.f1278b.j();
                Intrinsics.checkNotNullExpressionValue(j10, "getPooledByteStreams(...)");
                Executor f10 = this$1.f1279c.f();
                Intrinsics.checkNotNullExpressionValue(f10, "forLocalStorageRead(...)");
                Executor b10 = this$1.f1279c.b();
                Intrinsics.checkNotNullExpressionValue(b10, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new A7.j(kVar, i10, j10, f10, b10, this$1.f1280d));
            }
            return D6.g.a(linkedHashMap);
        }

        public static final Map k(C1047k this$0, a this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map map = this$0.f1284h;
            if (map == null) {
                return MapsKt.emptyMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), this$0.f1277a.a((x6.d) entry.getValue()));
            }
            return linkedHashMap;
        }

        public static final A7.j o(a this$0, C1047k this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            x6.k m10 = this$0.m();
            G6.i i10 = this$1.f1278b.i(this$1.f1281e);
            Intrinsics.checkNotNullExpressionValue(i10, "getPooledByteBufferFactory(...)");
            G6.l j10 = this$1.f1278b.j();
            Intrinsics.checkNotNullExpressionValue(j10, "getPooledByteStreams(...)");
            Executor f10 = this$1.f1279c.f();
            Intrinsics.checkNotNullExpressionValue(f10, "forLocalStorageRead(...)");
            Executor b10 = this$1.f1279c.b();
            Intrinsics.checkNotNullExpressionValue(b10, "forLocalStorageWrite(...)");
            return new A7.j(m10, i10, j10, f10, b10, this$1.f1280d);
        }

        public static final x6.k p(C1047k this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f1277a.a(this$0.f1282f);
        }

        public static final A7.j q(a this$0, C1047k this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            x6.k n10 = this$0.n();
            G6.i i10 = this$1.f1278b.i(this$1.f1281e);
            Intrinsics.checkNotNullExpressionValue(i10, "getPooledByteBufferFactory(...)");
            G6.l j10 = this$1.f1278b.j();
            Intrinsics.checkNotNullExpressionValue(j10, "getPooledByteStreams(...)");
            Executor f10 = this$1.f1279c.f();
            Intrinsics.checkNotNullExpressionValue(f10, "forLocalStorageRead(...)");
            Executor b10 = this$1.f1279c.b();
            Intrinsics.checkNotNullExpressionValue(b10, "forLocalStorageWrite(...)");
            return new A7.j(n10, i10, j10, f10, b10, this$1.f1280d);
        }

        public static final x6.k r(C1047k this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.f1277a.a(this$0.f1283g);
        }

        @Override // C7.InterfaceC1039c
        public A7.j a() {
            return (A7.j) this.f1289d.getValue();
        }

        @Override // C7.InterfaceC1039c
        public A7.j b() {
            return (A7.j) this.f1287b.getValue();
        }

        @Override // C7.InterfaceC1039c
        public D6.g c() {
            Object value = this.f1291f.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (D6.g) value;
        }

        public Map l() {
            return (Map) this.f1290e.getValue();
        }

        public x6.k m() {
            return (x6.k) this.f1286a.getValue();
        }

        public x6.k n() {
            return (x6.k) this.f1288c.getValue();
        }
    }

    public C1047k(InterfaceC1053q fileCacheFactory, K7.L poolFactory, InterfaceC1052p executorSupplier, A7.t imageCacheStatsTracker, int i10, x6.d mainDiskCacheConfig, x6.d smallImageDiskCacheConfig, Map map) {
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        Intrinsics.checkNotNullParameter(mainDiskCacheConfig, "mainDiskCacheConfig");
        Intrinsics.checkNotNullParameter(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f1277a = fileCacheFactory;
        this.f1278b = poolFactory;
        this.f1279c = executorSupplier;
        this.f1280d = imageCacheStatsTracker;
        this.f1281e = i10;
        this.f1282f = mainDiskCacheConfig;
        this.f1283g = smallImageDiskCacheConfig;
        this.f1284h = map;
        this.f1285i = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: C7.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C1047k.a j10;
                j10 = C1047k.j(C1047k.this);
                return j10;
            }
        });
    }

    public static final a j(C1047k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new a(this$0);
    }

    @Override // D6.n
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC1039c get() {
        return l();
    }

    public final InterfaceC1039c l() {
        return (InterfaceC1039c) this.f1285i.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1047k(InterfaceC1053q fileCacheFactory, InterfaceC1057v config) {
        this(fileCacheFactory, config.t(), config.H(), config.B(), config.u(), config.d(), config.j(), config.i());
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
