package H;

import B.C1027b;
import B.F;
import H.d;
import H.f;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f4285a = a.f4297d;

    /* renamed from: b, reason: collision with root package name */
    public static final F f4286b = new F();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4287c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static f f4288d;

    /* renamed from: e, reason: collision with root package name */
    public static int f4289e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f4290f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f4291g;

    /* renamed from: h, reason: collision with root package name */
    public static List f4292h;

    /* renamed from: i, reason: collision with root package name */
    public static List f4293i;

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReference f4294j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f4295k;

    /* renamed from: l, reason: collision with root package name */
    public static C1027b f4296l;

    static {
        f.a aVar = f.f4274d;
        f4288d = aVar.a();
        f4289e = 2;
        f4290f = new e();
        f4291g = new j();
        f4292h = CollectionsKt.emptyList();
        f4293i = CollectionsKt.emptyList();
        int i10 = f4289e;
        f4289e = i10 + 1;
        H.a aVar2 = new H.a(i10, aVar.a());
        f4288d = f4288d.i(aVar2.a());
        AtomicReference atomicReference = new AtomicReference(aVar2);
        f4294j = atomicReference;
        f4295k = (d) atomicReference.get();
        f4296l = new C1027b(0);
    }

    public static final m c(m mVar) {
        m k10;
        d.a aVar = d.f4267d;
        d a10 = aVar.a();
        m k11 = k(mVar, a10.a(), a10.b());
        if (k11 != null) {
            return k11;
        }
        synchronized (e()) {
            d a11 = aVar.a();
            k10 = k(mVar, a11.a(), a11.b());
        }
        if (k10 != null) {
            return k10;
        }
        j();
        throw new KotlinNothingValueException();
    }

    public static final d d() {
        d dVar = (d) f4286b.a();
        return dVar == null ? (d) f4294j.get() : dVar;
    }

    public static final Object e() {
        return f4287c;
    }

    public static final d f() {
        return f4295k;
    }

    public static final m g(m mVar, k kVar) {
        m n10 = n(kVar);
        if (n10 != null) {
            n10.e(Integer.MAX_VALUE);
            return n10;
        }
        m a10 = mVar.a();
        a10.e(Integer.MAX_VALUE);
        a10.d(kVar.c());
        Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        kVar.b(a10);
        Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return a10;
    }

    public static final void h(d dVar, k kVar) {
        dVar.h(dVar.e() + 1);
        Function1 f10 = dVar.f();
        if (f10 != null) {
            f10.invoke(kVar);
        }
    }

    public static final m i(m mVar, k kVar, d dVar, m mVar2) {
        m g10;
        if (dVar.d()) {
            dVar.g(kVar);
        }
        int a10 = dVar.a();
        if (mVar2.c() == a10) {
            return mVar2;
        }
        synchronized (e()) {
            g10 = g(mVar, kVar);
        }
        g10.e(a10);
        if (mVar2.c() != 1) {
            dVar.g(kVar);
        }
        return g10;
    }

    public static final Void j() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final m k(m mVar, int i10, f fVar) {
        m mVar2 = null;
        while (mVar != null) {
            if (p(mVar, i10, fVar) && (mVar2 == null || mVar2.c() < mVar.c())) {
                mVar2 = mVar;
            }
            mVar = mVar.b();
        }
        if (mVar2 != null) {
            return mVar2;
        }
        return null;
    }

    public static final m l(m mVar, k kVar) {
        m k10;
        d.a aVar = d.f4267d;
        d a10 = aVar.a();
        Function1 c10 = a10.c();
        if (c10 != null) {
            c10.invoke(kVar);
        }
        m k11 = k(mVar, a10.a(), a10.b());
        if (k11 != null) {
            return k11;
        }
        synchronized (e()) {
            d a11 = aVar.a();
            m c11 = kVar.c();
            Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            k10 = k(c11, a11.a(), a11.b());
            if (k10 == null) {
                j();
                throw new KotlinNothingValueException();
            }
        }
        return k10;
    }

    public static final int m(int i10, f fVar) {
        int a10;
        int h10 = fVar.h(i10);
        synchronized (e()) {
            a10 = f4290f.a(h10);
        }
        return a10;
    }

    public static final m n(k kVar) {
        int d10 = f4290f.d(f4289e) - 1;
        f a10 = f.f4274d.a();
        m mVar = null;
        for (m c10 = kVar.c(); c10 != null; c10 = c10.b()) {
            if (c10.c() != 0) {
                if (p(c10, d10, a10)) {
                    if (mVar == null) {
                        mVar = c10;
                    } else if (c10.c() >= mVar.c()) {
                        return mVar;
                    }
                }
            }
            return c10;
        }
        return null;
    }

    public static final boolean o(int i10, int i11, f fVar) {
        return (i11 == 0 || i11 > i10 || fVar.g(i11)) ? false : true;
    }

    public static final boolean p(m mVar, int i10, f fVar) {
        return o(i10, mVar.c(), fVar);
    }

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f4297d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((f) obj);
            return Unit.INSTANCE;
        }

        public final void a(f fVar) {
        }
    }
}
