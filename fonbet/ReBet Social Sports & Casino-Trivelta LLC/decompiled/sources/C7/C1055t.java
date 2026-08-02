package C7;

import android.net.Uri;
import android.os.StrictMode;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.request.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p7.C6051b;
import w6.InterfaceC6713d;
import y6.InterfaceC6856a;

/* renamed from: C7.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1055t {

    /* renamed from: n, reason: collision with root package name */
    public static final a f1298n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final CancellationException f1299o = new CancellationException("Prefetching is not enabled");

    /* renamed from: p, reason: collision with root package name */
    public static final CancellationException f1300p = new CancellationException("ImageRequest is null");

    /* renamed from: q, reason: collision with root package name */
    public static final CancellationException f1301q = new CancellationException("Modified URL is null");

    /* renamed from: a, reason: collision with root package name */
    public final W f1302a;

    /* renamed from: b, reason: collision with root package name */
    public final D6.n f1303b;

    /* renamed from: c, reason: collision with root package name */
    public final D6.n f1304c;

    /* renamed from: d, reason: collision with root package name */
    public final J7.e f1305d;

    /* renamed from: e, reason: collision with root package name */
    public final J7.d f1306e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.x f1307f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.x f1308g;

    /* renamed from: h, reason: collision with root package name */
    public final A7.k f1309h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f1310i;

    /* renamed from: j, reason: collision with root package name */
    public final D6.n f1311j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f1312k;

    /* renamed from: l, reason: collision with root package name */
    public final D6.n f1313l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC1057v f1314m;

    /* renamed from: C7.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: C7.t$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.EnumC0484b.values().length];
            try {
                iArr[b.EnumC0484b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC0484b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC0484b.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: C7.t$c */
    public static final class c implements D6.n {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.facebook.imagepipeline.request.b f1316b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f1317c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b.c f1318d;

        public c(com.facebook.imagepipeline.request.b bVar, Object obj, b.c cVar) {
            this.f1316b = bVar;
            this.f1317c = obj;
            this.f1318d = cVar;
        }

        @Override // D6.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public M6.c get() {
            return C1055t.n(C1055t.this, this.f1316b, this.f1317c, this.f1318d, null, null, 24, null);
        }

        public String toString() {
            String aVar = D6.i.b(this).b("uri", this.f1316b.getSourceUri()).toString();
            Intrinsics.checkNotNullExpressionValue(aVar, "toString(...)");
            return aVar;
        }
    }

    public C1055t(W producerSequenceFactory, Set requestListeners, Set requestListener2s, D6.n isPrefetchEnabledSupplier, A7.x bitmapMemoryCache, A7.x encodedMemoryCache, D6.n diskCachesStoreSupplier, A7.k cacheKeyFactory, p0 threadHandoffProducerQueue, D6.n suppressBitmapPrefetchingSupplier, D6.n lazyDataSource, InterfaceC6856a interfaceC6856a, InterfaceC1057v config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f1302a = producerSequenceFactory;
        this.f1303b = isPrefetchEnabledSupplier;
        this.f1304c = diskCachesStoreSupplier;
        this.f1305d = new J7.c(requestListeners);
        this.f1306e = new J7.b(requestListener2s);
        this.f1312k = new AtomicLong();
        this.f1307f = bitmapMemoryCache;
        this.f1308g = encodedMemoryCache;
        this.f1309h = cacheKeyFactory;
        this.f1310i = threadHandoffProducerQueue;
        this.f1311j = suppressBitmapPrefetchingSupplier;
        this.f1313l = lazyDataSource;
        this.f1314m = config;
    }

    public static final boolean B(Uri uri, InterfaceC6713d key) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(key, "key");
        return key.b(uri);
    }

    public static final boolean f(InterfaceC6713d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static /* synthetic */ M6.c n(C1055t c1055t, com.facebook.imagepipeline.request.b bVar, Object obj, b.c cVar, J7.e eVar, String str, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        if ((i10 & 8) != 0) {
            eVar = null;
        }
        if ((i10 & 16) != 0) {
            str = null;
        }
        return c1055t.m(bVar, obj, cVar, eVar, str);
    }

    public final D6.l A(final Uri uri) {
        return new D6.l() { // from class: C7.r
            @Override // D6.l
            public final boolean apply(Object obj) {
                boolean B10;
                B10 = C1055t.B(uri, (InterfaceC6713d) obj);
                return B10;
            }
        };
    }

    public final M6.c C(com.facebook.imagepipeline.request.b bVar, Object obj) {
        return D(bVar, obj, B7.f.f845c, null);
    }

    public final M6.c D(com.facebook.imagepipeline.request.b bVar, Object obj, B7.f priority, J7.e eVar) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (!((Boolean) this.f1303b.get()).booleanValue()) {
            M6.c b10 = M6.d.b(f1299o);
            Intrinsics.checkNotNullExpressionValue(b10, "immediateFailedDataSource(...)");
            return b10;
        }
        if (bVar == null) {
            M6.c b11 = M6.d.b(new NullPointerException("imageRequest is null"));
            Intrinsics.checkNotNull(b11);
            return b11;
        }
        try {
            return G(this.f1302a.G(bVar), bVar, b.c.FULL_FETCH, obj, priority, eVar);
        } catch (Exception e10) {
            return M6.d.b(e10);
        }
    }

    public final M6.c E(d0 d0Var, com.facebook.imagepipeline.request.b bVar, b.c cVar, Object obj, J7.e eVar, String str) {
        return F(d0Var, bVar, cVar, obj, eVar, str, null);
    }

    public final M6.c F(d0 d0Var, com.facebook.imagepipeline.request.b bVar, b.c cVar, Object obj, J7.e eVar, String str, Map map) {
        M6.c b10;
        b.c a10;
        String p10;
        boolean z10;
        boolean z11;
        if (!N7.b.d()) {
            com.facebook.imagepipeline.producers.F f10 = new com.facebook.imagepipeline.producers.F(t(bVar, eVar), this.f1306e);
            try {
                b.c a11 = b.c.a(bVar.getLowestPermittedRequestLevel(), cVar);
                Intrinsics.checkNotNullExpressionValue(a11, "getMax(...)");
                String p11 = p();
                if (!bVar.getProgressiveRenderingEnabled() && com.facebook.common.util.f.p(bVar.getSourceUri())) {
                    z11 = false;
                    l0 l0Var = new l0(bVar, p11, str, f10, obj, a11, false, z11, bVar.getPriority(), this.f1314m);
                    l0Var.m1(map);
                    return D7.c.G(d0Var, l0Var, f10);
                }
                z11 = true;
                l0 l0Var2 = new l0(bVar, p11, str, f10, obj, a11, false, z11, bVar.getPriority(), this.f1314m);
                l0Var2.m1(map);
                return D7.c.G(d0Var, l0Var2, f10);
            } catch (Exception e10) {
                return M6.d.b(e10);
            }
        }
        N7.b.a("ImagePipeline#submitFetchRequest");
        try {
            com.facebook.imagepipeline.producers.F f11 = new com.facebook.imagepipeline.producers.F(t(bVar, eVar), this.f1306e);
            try {
                a10 = b.c.a(bVar.getLowestPermittedRequestLevel(), cVar);
                Intrinsics.checkNotNullExpressionValue(a10, "getMax(...)");
                p10 = p();
            } catch (Exception e11) {
                b10 = M6.d.b(e11);
            }
            if (!bVar.getProgressiveRenderingEnabled() && com.facebook.common.util.f.p(bVar.getSourceUri())) {
                z10 = false;
                l0 l0Var3 = new l0(bVar, p10, str, f11, obj, a10, false, z10, bVar.getPriority(), this.f1314m);
                l0Var3.m1(map);
                b10 = D7.c.G(d0Var, l0Var3, f11);
                N7.b.b();
                return b10;
            }
            z10 = true;
            l0 l0Var32 = new l0(bVar, p10, str, f11, obj, a10, false, z10, bVar.getPriority(), this.f1314m);
            l0Var32.m1(map);
            b10 = D7.c.G(d0Var, l0Var32, f11);
            N7.b.b();
            return b10;
        } catch (Throwable th2) {
            N7.b.b();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r1.getProgressiveRenderingEnabled() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M6.c G(d0 d0Var, com.facebook.imagepipeline.request.b bVar, b.c cVar, Object obj, B7.f fVar, J7.e eVar) {
        boolean z10;
        com.facebook.imagepipeline.producers.F f10 = new com.facebook.imagepipeline.producers.F(t(bVar, eVar), this.f1306e);
        Uri sourceUri = bVar.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        Uri a10 = C6051b.f63104b.a(sourceUri, obj);
        if (a10 == null) {
            M6.c b10 = M6.d.b(f1301q);
            Intrinsics.checkNotNullExpressionValue(b10, "immediateFailedDataSource(...)");
            return b10;
        }
        if (!Intrinsics.areEqual(sourceUri, a10)) {
            bVar = com.facebook.imagepipeline.request.c.b(bVar).R(a10).a();
        }
        com.facebook.imagepipeline.request.b bVar2 = bVar;
        try {
            b.c a11 = b.c.a(bVar2.getLowestPermittedRequestLevel(), cVar);
            Intrinsics.checkNotNullExpressionValue(a11, "getMax(...)");
            String p10 = p();
            x G10 = this.f1314m.G();
            if (G10 != null) {
                z10 = true;
                if (G10.b()) {
                }
            }
            z10 = false;
            return D7.d.f2576j.a(d0Var, new l0(bVar2, p10, f10, obj, a11, true, z10, fVar, this.f1314m), f10);
        } catch (Exception e10) {
            return M6.d.b(e10);
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        Object obj = this.f1304c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1039c interfaceC1039c = (InterfaceC1039c) obj;
        interfaceC1039c.b().h();
        interfaceC1039c.a().h();
        Iterator it = interfaceC1039c.c().entrySet().iterator();
        while (it.hasNext()) {
            ((A7.j) ((Map.Entry) it.next()).getValue()).h();
        }
    }

    public final void e() {
        D6.l lVar = new D6.l() { // from class: C7.s
            @Override // D6.l
            public final boolean apply(Object obj) {
                boolean f10;
                f10 = C1055t.f((InterfaceC6713d) obj);
                return f10;
            }
        };
        this.f1307f.f(lVar);
        this.f1308g.f(lVar);
    }

    public final void g(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        j(uri);
        h(uri);
    }

    public final void h(Uri uri) {
        com.facebook.imagepipeline.request.b fromUri = com.facebook.imagepipeline.request.b.fromUri(uri);
        if (fromUri == null) {
            throw new IllegalStateException("Required value was null.");
        }
        i(fromUri);
    }

    public final void i(com.facebook.imagepipeline.request.b bVar) {
        if (bVar == null) {
            return;
        }
        InterfaceC6713d d10 = this.f1309h.d(bVar, null);
        Object obj = this.f1304c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1039c interfaceC1039c = (InterfaceC1039c) obj;
        A7.j b10 = interfaceC1039c.b();
        Intrinsics.checkNotNull(d10);
        b10.s(d10);
        interfaceC1039c.a().s(d10);
        Iterator it = interfaceC1039c.c().entrySet().iterator();
        while (it.hasNext()) {
            ((A7.j) ((Map.Entry) it.next()).getValue()).s(d10);
        }
    }

    public final void j(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        D6.l A10 = A(uri);
        this.f1307f.f(A10);
        this.f1308g.f(A10);
    }

    public final M6.c k(com.facebook.imagepipeline.request.b bVar, Object obj) {
        return n(this, bVar, obj, null, null, null, 24, null);
    }

    public final M6.c l(com.facebook.imagepipeline.request.b bVar, Object obj, b.c lowestPermittedRequestLevelOnSubmit) {
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return n(this, bVar, obj, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    public final M6.c m(com.facebook.imagepipeline.request.b bVar, Object obj, b.c cVar, J7.e eVar, String str) {
        if (bVar == null) {
            M6.c b10 = M6.d.b(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(b10, "immediateFailedDataSource(...)");
            return b10;
        }
        try {
            d0 E10 = this.f1302a.E(bVar);
            if (cVar == null) {
                cVar = b.c.FULL_FETCH;
            }
            return E(E10, bVar, cVar, obj, eVar, str);
        } catch (Exception e10) {
            return M6.d.b(e10);
        }
    }

    public final M6.c o(com.facebook.imagepipeline.request.b imageRequest, Object obj) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return l(imageRequest, obj, b.c.BITMAP_MEMORY_CACHE);
    }

    public final String p() {
        return String.valueOf(this.f1312k.getAndIncrement());
    }

    public final A7.x q() {
        return this.f1307f;
    }

    public final A7.k r() {
        return this.f1309h;
    }

    public final D6.n s(com.facebook.imagepipeline.request.b imageRequest, Object obj, b.c cVar) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return new c(imageRequest, obj, cVar);
    }

    public final J7.e t(com.facebook.imagepipeline.request.b bVar, J7.e eVar) {
        if (bVar != null) {
            return eVar == null ? bVar.getRequestListener() == null ? this.f1305d : new J7.c(this.f1305d, bVar.getRequestListener()) : bVar.getRequestListener() == null ? new J7.c(this.f1305d, eVar) : new J7.c(this.f1305d, eVar, bVar.getRequestListener());
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean u(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f1307f.e(A(uri));
    }

    public final boolean v(com.facebook.imagepipeline.request.b bVar) {
        if (bVar == null) {
            return false;
        }
        InterfaceC6713d a10 = this.f1309h.a(bVar, null);
        A7.x xVar = this.f1307f;
        Intrinsics.checkNotNull(a10);
        H6.a aVar = xVar.get(a10);
        try {
            return H6.a.isValid(aVar);
        } finally {
            H6.a.U(aVar);
        }
    }

    public final boolean w(Uri uri) {
        return x(uri, b.EnumC0484b.SMALL) || x(uri, b.EnumC0484b.DEFAULT) || x(uri, b.EnumC0484b.DYNAMIC);
    }

    public final boolean x(Uri uri, b.EnumC0484b enumC0484b) {
        com.facebook.imagepipeline.request.b a10 = com.facebook.imagepipeline.request.c.x(uri).A(enumC0484b).a();
        Intrinsics.checkNotNull(a10);
        return y(a10);
    }

    public final boolean y(com.facebook.imagepipeline.request.b imageRequest) {
        boolean k10;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Object obj = this.f1304c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1039c interfaceC1039c = (InterfaceC1039c) obj;
        InterfaceC6713d d10 = this.f1309h.d(imageRequest, null);
        b.EnumC0484b cacheChoice = imageRequest.getCacheChoice();
        Intrinsics.checkNotNullExpressionValue(cacheChoice, "getCacheChoice(...)");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i10 = b.$EnumSwitchMapping$0[cacheChoice.ordinal()];
            if (i10 == 1) {
                A7.j b10 = interfaceC1039c.b();
                Intrinsics.checkNotNull(d10);
                k10 = b10.k(d10);
            } else if (i10 == 2) {
                A7.j a10 = interfaceC1039c.a();
                Intrinsics.checkNotNull(d10);
                k10 = a10.k(d10);
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                k10 = z(imageRequest);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return k10;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z(com.facebook.imagepipeline.request.b bVar) {
        Object obj = this.f1304c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        InterfaceC1039c interfaceC1039c = (InterfaceC1039c) obj;
        InterfaceC6713d d10 = this.f1309h.d(bVar, null);
        String diskCacheId = bVar.getDiskCacheId();
        if (diskCacheId != null) {
            A7.j jVar = (A7.j) interfaceC1039c.c().get(diskCacheId);
            if (jVar == null) {
                return false;
            }
            Intrinsics.checkNotNull(d10);
            return jVar.k(d10);
        }
        Iterator it = interfaceC1039c.c().entrySet().iterator();
        while (it.hasNext()) {
            A7.j jVar2 = (A7.j) ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNull(d10);
            if (jVar2.k(d10)) {
                return true;
            }
        }
        return false;
    }
}
