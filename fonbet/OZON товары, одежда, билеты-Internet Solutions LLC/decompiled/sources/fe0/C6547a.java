package fe0;

import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.A0;
import De.C2862e;
import Sc.o;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce0.C5818b;
import ce0.InterfaceC5817a;
import de0.C6193b;
import de0.InterfaceC6192a;
import ee0.InterfaceC6350a;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.SphericalUtil;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.PreCachingAlgorithmDecorator;
import we0.C10551g;
import we0.k;
import we0.m;
import we0.u;
import xe.AbstractC10711a;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;
import xe.C10745r0;
import xe.E0;
import xe.H0;
import xe.L0;
import xe.M;
import xe.N;
import xe.X0;

/* renamed from: fe0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6547a<ALGO extends Algorithm<u>> implements de0.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63271a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ALGO f63272b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f63273c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ee0.e f63274d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ee0.i f63275e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C6193b f63276f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private k f63277g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final B0<InterfaceC6350a> f63278h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final x0<InterfaceC6192a> f63279i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final M0<InterfaceC6192a> f63280j;

    /* renamed from: k, reason: collision with root package name */
    private long f63281k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2862e f63282l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C10745r0 f63283m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C10745r0 f63284n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final c<b> f63285o;

    /* renamed from: p, reason: collision with root package name */
    private float f63286p;

    /* renamed from: q, reason: collision with root package name */
    private xe.B0 f63287q;

    /* renamed from: r, reason: collision with root package name */
    private xe.B0 f63288r;

    /* renamed from: s, reason: collision with root package name */
    private xe.B0 f63289s;

    /* renamed from: t, reason: collision with root package name */
    private we0.i f63290t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private volatile de0.c f63291u;

    /* renamed from: fe0.a$a, reason: collision with other inner class name */
    static final class C1012a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6547a<ALGO> f63292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1012a(C6547a<ALGO> c6547a) {
            super(0);
            this.f63292b = c6547a;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C6547a<ALGO> c6547a = this.f63292b;
            if (Intrinsics.d(((C6547a) c6547a).f63279i.getValue(), InterfaceC6192a.C0959a.f61611a)) {
                C6547a.j(c6547a, ((C6547a) c6547a).f63279i);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: fe0.a$b */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final d f63293a;

        /* renamed from: fe0.a$b$a, reason: collision with other inner class name */
        public static final class C1013a extends b {

            /* renamed from: b, reason: collision with root package name */
            private final C10551g f63294b;

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final k f63295c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f63296d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1013a(@NotNull d updateSource, C10551g c10551g, @NotNull k options, boolean z11) {
                super(updateSource);
                Intrinsics.checkNotNullParameter(updateSource, "updateSource");
                Intrinsics.checkNotNullParameter(options, "options");
                this.f63294b = c10551g;
                this.f63295c = options;
                this.f63296d = z11;
            }

            public final C10551g b() {
                return this.f63294b;
            }

            @NotNull
            public final k c() {
                return this.f63295c;
            }

            public final boolean d() {
                return this.f63296d;
            }
        }

        /* renamed from: fe0.a$b$b, reason: collision with other inner class name */
        public static final class C1014b extends b {

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final kotlin.coroutines.jvm.internal.j f63297b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1014b(@NotNull d updateSource, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> renderAction) {
                super(updateSource);
                Intrinsics.checkNotNullParameter(updateSource, "updateSource");
                Intrinsics.checkNotNullParameter(renderAction, "renderAction");
                this.f63297b = (kotlin.coroutines.jvm.internal.j) renderAction;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object>] */
            @NotNull
            public final Function1<kotlin.coroutines.d<? super Unit>, Object> b() {
                return this.f63297b;
            }
        }

        public b(d dVar) {
            this.f63293a = dVar;
        }

        @NotNull
        public final d a() {
            return this.f63293a;
        }
    }

    /* renamed from: fe0.a$c */
    public static final class c<T extends b> {

        /* renamed from: a, reason: collision with root package name */
        private final int f63298a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C7704k<T> f63299b = new C7704k<>();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ReentrantLock f63300c = new ReentrantLock();

        /* renamed from: d, reason: collision with root package name */
        private int f63301d;

        /* renamed from: e, reason: collision with root package name */
        private int f63302e;

        /* renamed from: f, reason: collision with root package name */
        private C10737n f63303f;

        /* renamed from: fe0.a$c$a, reason: collision with other inner class name */
        static final class C1015a extends AbstractC7737t implements Function1<Throwable, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<T> f63304b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1015a(c<T> cVar) {
                super(1);
                this.f63304b = cVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Throwable th2) {
                ((c) this.f63304b).f63303f = null;
                return Unit.f71690a;
            }
        }

        public c(int i11) {
            this.f63298a = i11;
            this.f63301d = i11;
        }

        private final void c() {
            int i11;
            C7704k<T> c7704k = this.f63299b;
            ListIterator<T> listIterator = c7704k.listIterator(c7704k.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i11 = -1;
                    break;
                } else if (listIterator.previous().a() == d.USER) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            }
            if (i11 == -1) {
                d();
                return;
            }
            if (i11 == C7714v.P(c7704k)) {
                this.f63301d += this.f63298a;
                return;
            }
            b bVar = (b) C7714v.Q(i11 + 1, c7704k);
            if (bVar != null) {
                c7704k.remove(bVar);
            }
        }

        private final T d() {
            int i11;
            C7704k<T> c7704k = this.f63299b;
            T A11 = c7704k.A();
            if (A11 == null) {
                return null;
            }
            if (A11.a() == d.USER) {
                int i12 = this.f63302e - 1;
                this.f63302e = i12;
                if (i12 == 0) {
                    while (true) {
                        int f26995b = c7704k.getF26995b();
                        i11 = this.f63298a;
                        if (f26995b <= i11) {
                            break;
                        }
                        d();
                    }
                    this.f63301d = i11;
                }
            }
            return A11;
        }

        public final void b(@NotNull T element) {
            C7704k<T> c7704k = this.f63299b;
            Intrinsics.checkNotNullParameter(element, "element");
            ReentrantLock reentrantLock = this.f63300c;
            reentrantLock.lock();
            try {
                C10737n c10737n = this.f63303f;
                if (c10737n != null) {
                    r.Companion companion = r.INSTANCE;
                    c10737n.resumeWith(element);
                    this.f63303f = null;
                } else {
                    if (c7704k.getF26995b() >= this.f63301d) {
                        c();
                    }
                    if (element.a() == d.USER) {
                        this.f63302e++;
                    }
                    c7704k.addLast(element);
                    Unit unit = Unit.f71690a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final Object e(@NotNull kotlin.coroutines.d<? super T> frame) {
            C10737n c10737n = new C10737n(1, Wc.b.b(frame));
            c10737n.o();
            ReentrantLock reentrantLock = this.f63300c;
            reentrantLock.lock();
            try {
                T d11 = d();
                if (d11 != null) {
                    r.Companion companion = r.INSTANCE;
                    c10737n.resumeWith(d11);
                } else {
                    c10737n.q(new C1015a(this));
                    this.f63303f = c10737n;
                }
                Unit unit = Unit.f71690a;
                reentrantLock.unlock();
                Object n11 = c10737n.n();
                if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return n11;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: fe0.a$d */
    public static final class d {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d SYSTEM;
        public static final d USER;

        static {
            d dVar = new d("SYSTEM", 0);
            SYSTEM = dVar;
            d dVar2 = new d("USER", 1);
            USER = dVar2;
            d[] dVarArr = {dVar, dVar2};
            $VALUES = dVarArr;
            $ENTRIES = Xc.b.a(dVarArr);
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$dispose$1", f = "BasePlacemarkClusterizer.kt", l = {217, 218, 219, 220, 221, 224, 226}, m = "invokeSuspend")
    /* renamed from: fe0.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63305d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6547a<ALGO> f63306e;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$dispose$1$1", f = "BasePlacemarkClusterizer.kt", l = {}, m = "invokeSuspend")
        /* renamed from: fe0.a$e$a, reason: collision with other inner class name */
        static final class C1016a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f63307d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C6547a<ALGO> f63308e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1016a(C6547a<ALGO> c6547a, kotlin.coroutines.d<? super C1016a> dVar) {
                super(2, dVar);
                this.f63308e = c6547a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C1016a c1016a = new C1016a(this.f63308e, dVar);
                c1016a.f63307d = obj;
                return c1016a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1016a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                M m11 = (M) this.f63307d;
                try {
                    E0.b(((C6547a) this.f63308e).f63283m, null);
                    E0.b(m11.getCoroutineContext(), null);
                } catch (Exception unused) {
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C6547a<ALGO> c6547a, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f63306e = c6547a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f63306e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x00b6, code lost:
        
            if (xe.C10727i.f(r5, r1, r4) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00b8, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
        
            if (r3.F(r4) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            if (r5.l(r4) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        
            if (r5.k(r4) != r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        
            if (xe.E0.c(r5, r4) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
        
            if (xe.E0.c(r5, r4) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0040, code lost:
        
            if (xe.E0.c(r5, r4) == r0) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            xe.B0 b02;
            xe.B0 z11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63305d;
            C6547a<ALGO> c6547a = this.f63306e;
            switch (i11) {
                case 0:
                    s.b(obj);
                    xe.B0 b03 = ((C6547a) c6547a).f63289s;
                    if (b03 != null) {
                        this.f63305d = 1;
                        break;
                    }
                    b02 = ((C6547a) c6547a).f63287q;
                    if (b02 != null) {
                        this.f63305d = 2;
                        break;
                    }
                    z11 = c6547a.z();
                    if (z11 != null) {
                        this.f63305d = 3;
                        break;
                    }
                    ee0.e eVar = ((C6547a) c6547a).f63274d;
                    this.f63305d = 4;
                    break;
                case 1:
                    s.b(obj);
                    b02 = ((C6547a) c6547a).f63287q;
                    if (b02 != null) {
                    }
                    z11 = c6547a.z();
                    if (z11 != null) {
                    }
                    ee0.e eVar2 = ((C6547a) c6547a).f63274d;
                    this.f63305d = 4;
                    break;
                case 2:
                    s.b(obj);
                    z11 = c6547a.z();
                    if (z11 != null) {
                    }
                    ee0.e eVar22 = ((C6547a) c6547a).f63274d;
                    this.f63305d = 4;
                    break;
                case 3:
                    s.b(obj);
                    ee0.e eVar222 = ((C6547a) c6547a).f63274d;
                    this.f63305d = 4;
                    break;
                case 4:
                    s.b(obj);
                    ee0.e eVar3 = ((C6547a) c6547a).f63274d;
                    this.f63305d = 5;
                    break;
                case 5:
                    s.b(obj);
                    c6547a.b().clearItems();
                    ALGO b11 = c6547a.b();
                    PreCachingAlgorithmDecorator preCachingAlgorithmDecorator = b11 instanceof PreCachingAlgorithmDecorator ? (PreCachingAlgorithmDecorator) b11 : null;
                    if (preCachingAlgorithmDecorator != null) {
                        preCachingAlgorithmDecorator.dispose();
                    }
                    this.f63305d = 6;
                    break;
                case 6:
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    C1016a c1016a = new C1016a(c6547a, null);
                    this.f63305d = 7;
                    break;
                case 7:
                    s.b(obj);
                    return Unit.f71690a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$emitOnClusterScope$1", f = "BasePlacemarkClusterizer.kt", l = {514}, m = "invokeSuspend")
    /* renamed from: fe0.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63309d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x0<InterfaceC6192a> f63310e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6192a f63311f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x0<InterfaceC6192a> x0Var, InterfaceC6192a interfaceC6192a, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f63310e = x0Var;
            this.f63311f = interfaceC6192a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f63310e, this.f63311f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63309d;
            if (i11 == 0) {
                s.b(obj);
                this.f63309d = 1;
                if (this.f63310e.emit(this.f63311f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$setUpZoomListenerJob$1", f = "BasePlacemarkClusterizer.kt", l = {249, 253, 259}, m = "invokeSuspend")
    /* renamed from: fe0.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super we0.h>, we0.h, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63312d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f63313e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ we0.h f63314f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<C10551g> f63315g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C6547a<ALGO> f63316h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.jvm.internal.M<C10551g> m11, C6547a<ALGO> c6547a, kotlin.coroutines.d<? super g> dVar) {
            super(3, dVar);
            this.f63315g = m11;
            this.f63316h = c6547a;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super we0.h> interfaceC2397i, we0.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
            g gVar = new g(this.f63315g, this.f63316h, dVar);
            gVar.f63313e = interfaceC2397i;
            gVar.f63314f = hVar;
            return gVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
        
            if (r4.emit(r1, r12) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            if (xe.Y.b(r5, r12) == r0) goto L25;
         */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, we0.g] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            we0.h hVar;
            InterfaceC2397i interfaceC2397i;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63312d;
            kotlin.jvm.internal.M<C10551g> m11 = this.f63315g;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i2 = this.f63313e;
                hVar = this.f63314f;
                C10551g c10551g = m11.f71787a;
                float e11 = hVar.a().e();
                if (c10551g != null) {
                    float e12 = c10551g.e();
                    C6547a<ALGO> c6547a = this.f63316h;
                    ((C6547a) c6547a).f63276f.getClass();
                    if (((C6547a) c6547a).f63276f.a() > 0 && e12 != e11) {
                        long a11 = ((C6547a) c6547a).f63276f.a();
                        this.f63313e = interfaceC2397i2;
                        this.f63314f = hVar;
                        this.f63312d = 2;
                    }
                }
                interfaceC2397i = interfaceC2397i2;
            } else {
                if (i11 != 1 && i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                hVar = this.f63314f;
                interfaceC2397i = this.f63313e;
                s.b(obj);
            }
            m11.f71787a = hVar.a();
            this.f63313e = null;
            this.f63314f = null;
            this.f63312d = 3;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$setUpZoomListenerJob$2", f = "BasePlacemarkClusterizer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fe0.a$h */
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<we0.h, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f63317d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6547a<ALGO> f63318e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C6547a<ALGO> c6547a, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f63318e = c6547a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f63318e, dVar);
            hVar.f63317d = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(we0.h hVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            we0.h hVar = (we0.h) this.f63317d;
            C6547a<ALGO> c6547a = this.f63318e;
            c6547a.E(hVar);
            C6547a.h(c6547a, C6547a.w(c6547a, d.SYSTEM, hVar.a()));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$setupClusterizerState$1", f = "BasePlacemarkClusterizer.kt", l = {173, 174, 178}, m = "invokeSuspend")
    /* renamed from: fe0.a$i */
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63319d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6547a<ALGO> f63320e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ de0.c f63321f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$setupClusterizerState$1$1", f = "BasePlacemarkClusterizer.kt", l = {}, m = "invokeSuspend")
        /* renamed from: fe0.a$i$a, reason: collision with other inner class name */
        static final class C1017a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C6547a<ALGO> f63322d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1017a(C6547a<ALGO> c6547a, kotlin.coroutines.d<? super C1017a> dVar) {
                super(2, dVar);
                this.f63322d = c6547a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1017a(this.f63322d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1017a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f63322d.d();
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$setupClusterizerState$1$2", f = "BasePlacemarkClusterizer.kt", l = {186}, m = "invokeSuspend")
        /* renamed from: fe0.a$i$b */
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f63323d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C6547a<ALGO> f63324e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C6547a<ALGO> c6547a, kotlin.coroutines.d<? super b> dVar) {
                super(1, dVar);
                this.f63324e = c6547a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new b(this.f63324e, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f63323d;
                if (i11 == 0) {
                    s.b(obj);
                    ee0.e eVar = ((C6547a) this.f63324e).f63274d;
                    this.f63323d = 1;
                    if (eVar.w(false, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$setupClusterizerState$1$3", f = "BasePlacemarkClusterizer.kt", l = {192}, m = "invokeSuspend")
        /* renamed from: fe0.a$i$c */
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f63325d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C6547a<ALGO> f63326e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C6547a<ALGO> c6547a, kotlin.coroutines.d<? super c> dVar) {
                super(1, dVar);
                this.f63326e = c6547a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new c(this.f63326e, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f63325d;
                if (i11 == 0) {
                    s.b(obj);
                    ee0.e eVar = ((C6547a) this.f63326e).f63274d;
                    this.f63325d = 1;
                    if (eVar.w(true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C6547a<ALGO> c6547a, de0.c cVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f63320e = c6547a;
            this.f63321f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f63320e, this.f63321f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            if (xe.E0.c(r9, r8) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        
            if (xe.E0.c(r9, r8) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        
            if (xe.C10727i.f(r9, r1, r8) == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            xe.B0 z11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63319d;
            de0.c cVar = this.f63321f;
            C6547a<ALGO> c6547a = this.f63320e;
            if (i11 == 0) {
                s.b(obj);
                if (((C6547a) c6547a).f63291u.c(cVar)) {
                    xe.B0 b02 = ((C6547a) c6547a).f63287q;
                    if (b02 != null) {
                        this.f63319d = 1;
                    }
                    z11 = c6547a.z();
                    if (z11 != null) {
                    }
                    if (((C6547a) c6547a).f63291u.e(cVar)) {
                    }
                    return Unit.f71690a;
                }
                if (((C6547a) c6547a).f63291u.d(cVar)) {
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    C1017a c1017a = new C1017a(c6547a, null);
                    this.f63319d = 3;
                }
                if (((C6547a) c6547a).f63291u.e(cVar)) {
                }
                return Unit.f71690a;
                return aVar;
            }
            if (i11 == 1) {
                s.b(obj);
                z11 = c6547a.z();
                if (z11 != null) {
                    this.f63319d = 2;
                }
                if (((C6547a) c6547a).f63291u.e(cVar)) {
                }
                return Unit.f71690a;
            }
            if (i11 == 2) {
                s.b(obj);
                if (((C6547a) c6547a).f63291u.e(cVar)) {
                }
                return Unit.f71690a;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            c6547a.H();
            if (((C6547a) c6547a).f63291u.e(cVar)) {
                C6547a.h(c6547a, new b.C1014b(d.USER, new b(c6547a, null)));
            } else if (((C6547a) c6547a).f63291u.f(cVar)) {
                C6547a.h(c6547a, new b.C1014b(d.USER, new c(c6547a, null)));
            }
            return Unit.f71690a;
        }
    }

    public C6547a(@NotNull String id2, @NotNull ALGO algorithm, @NotNull k clusteringOptions, @NotNull InterfaceC5817a cameraController, @NotNull ee0.e render, @NotNull ee0.i customProjection, @NotNull C6193b clusterizerMode) {
        de0.c cVar;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(clusteringOptions, "clusteringOptions");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(render, "render");
        Intrinsics.checkNotNullParameter(customProjection, "customProjection");
        Intrinsics.checkNotNullParameter(clusterizerMode, "clusterizerMode");
        this.f63271a = id2;
        this.f63272b = algorithm;
        this.f63273c = cameraController;
        this.f63274d = render;
        this.f63275e = customProjection;
        this.f63276f = clusterizerMode;
        this.f63277g = clusteringOptions;
        this.f63278h = render.m();
        x0<InterfaceC6192a> a11 = O0.a(InterfaceC6192a.b.f61612a);
        this.f63279i = a11;
        this.f63280j = C2399j.b(a11);
        this.f63281k = 10000L;
        C2862e a12 = N.a(CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b()));
        this.f63282l = a12;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f63283m = new C10745r0(newSingleThreadExecutor);
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor2, "newSingleThreadExecutor(...)");
        this.f63284n = new C10745r0(newSingleThreadExecutor2);
        this.f63285o = new c<>(clusterizerMode.b());
        cVar = de0.c.f61616c;
        this.f63291u = cVar;
        H();
        xe.B0 b02 = this.f63289s;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f63289s = C10727i.c(a12, null, null, new C6550d(this, null), 3);
        }
        render.s(new C1012a(this));
    }

    private final we0.i D(C10551g c10551g, boolean z11) {
        we0.i a11 = this.f63275e.a((int) c10551g.e(), c10551g.c(), c10551g.b(), c10551g.d());
        we0.i iVar = this.f63290t;
        if (iVar != null && iVar.b(a11) && !z11) {
            return null;
        }
        if (((int) c10551g.e()) > 4) {
            double computeDistanceBetween = SphericalUtil.computeDistanceBetween(a11.f(), a11.e());
            List b02 = C7714v.b0(Double.valueOf(315.0d), Double.valueOf(45.0d), Double.valueOf(135.0d), Double.valueOf(225.0d));
            ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
            Iterator it = b02.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf((((Number) it.next()).doubleValue() + c10551g.b()) % 360.0d));
            }
            m computeOffset = SphericalUtil.computeOffset(c10551g.c(), computeDistanceBetween, ((Number) arrayList.get(0)).doubleValue());
            Intrinsics.checkNotNullExpressionValue(computeOffset, "computeOffset(...)");
            m computeOffset2 = SphericalUtil.computeOffset(c10551g.c(), computeDistanceBetween, ((Number) arrayList.get(1)).doubleValue());
            Intrinsics.checkNotNullExpressionValue(computeOffset2, "computeOffset(...)");
            m computeOffset3 = SphericalUtil.computeOffset(c10551g.c(), computeDistanceBetween, ((Number) arrayList.get(2)).doubleValue());
            Intrinsics.checkNotNullExpressionValue(computeOffset3, "computeOffset(...)");
            m computeOffset4 = SphericalUtil.computeOffset(c10551g.c(), computeDistanceBetween, ((Number) arrayList.get(3)).doubleValue());
            Intrinsics.checkNotNullExpressionValue(computeOffset4, "computeOffset(...)");
            a11 = new we0.i(computeOffset, computeOffset2, computeOffset3, computeOffset4);
        }
        this.f63290t = a11;
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r7.f63274d.v(r8, (ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult) r10, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(we0.i iVar, k kVar, float f7, kotlin.coroutines.jvm.internal.c cVar) {
        fe0.h hVar;
        int i11;
        we0.i iVar2;
        C6547a<ALGO> c6547a;
        if (cVar instanceof fe0.h) {
            hVar = (fe0.h) cVar;
            int i12 = hVar.f63358h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f63358h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f63356f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f63358h;
                if (i11 != 0) {
                    s.b(obj);
                    y(this.f63279i, InterfaceC6192a.c.f61613a);
                    hVar.f63354d = this;
                    hVar.f63355e = iVar;
                    hVar.f63358h = 1;
                    obj = A(f7, kVar, hVar);
                    if (obj != aVar) {
                        iVar2 = iVar;
                        c6547a = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6547a = hVar.f63354d;
                    s.b(obj);
                    if (!(c6547a.f63274d.o() instanceof Ne0.b)) {
                        c6547a.y(c6547a.f63279i, InterfaceC6192a.b.f61612a);
                    }
                    return Unit.f71690a;
                }
                we0.i iVar3 = hVar.f63355e;
                C6547a<ALGO> c6547a2 = hVar.f63354d;
                s.b(obj);
                iVar2 = iVar3;
                c6547a = c6547a2;
                c6547a.y(c6547a.f63279i, InterfaceC6192a.C0959a.f61611a);
                hVar.f63354d = c6547a;
                hVar.f63355e = null;
                hVar.f63358h = 2;
            }
        }
        hVar = new fe0.h(this, cVar);
        Object obj2 = hVar.f63356f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f63358h;
        if (i11 != 0) {
        }
        c6547a.y(c6547a.f63279i, InterfaceC6192a.C0959a.f61611a);
        hVar.f63354d = c6547a;
        hVar.f63355e = null;
        hVar.f63358h = 2;
    }

    public static final void h(C6547a c6547a, b bVar) {
        c6547a.getClass();
        C10727i.c(c6547a.f63282l, null, null, new C6548b(c6547a, bVar, null), 3);
    }

    public static final /* synthetic */ void j(C6547a c6547a, x0 x0Var) {
        c6547a.y(x0Var, InterfaceC6192a.b.f61612a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r10.I(r12, r11, r2, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        r11 = r10;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (r10.v(r12, r11, r2, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0075, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
    
        if (r10.invoke(r0) == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(C6547a c6547a, b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        fe0.f fVar;
        int i11;
        float e11;
        we0.i iVar;
        if (cVar instanceof fe0.f) {
            fVar = (fe0.f) cVar;
            int i12 = fVar.f63349i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f63349i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f63347g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f63349i;
                if (i11 != 0) {
                    s.b(obj);
                    if (bVar instanceof b.C1013a) {
                        fVar.f63344d = c6547a;
                        fVar.f63345e = (b.C1013a) bVar;
                        fVar.f63349i = 1;
                        obj = ((b.C1013a) bVar).b();
                        if (obj == null) {
                            C10720e0 c10720e0 = C10720e0.f105451a;
                            obj = C10727i.f(De.s.f6650a.x(), new C6551e(c6547a, null), fVar);
                        }
                    } else {
                        if (!(bVar instanceof b.C1014b)) {
                            throw new o();
                        }
                        Function1<kotlin.coroutines.d<? super Unit>, Object> b11 = ((b.C1014b) bVar).b();
                        fVar.f63349i = 4;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    float f7 = fVar.f63346f;
                    C6547a c6547a2 = fVar.f63344d;
                    s.b(obj);
                    e11 = f7;
                    c6547a = c6547a2;
                    c6547a.f63286p = e11;
                    return Unit.f71690a;
                }
                bVar = fVar.f63345e;
                c6547a = fVar.f63344d;
                s.b(obj);
                C10551g c10551g = (C10551g) obj;
                e11 = c10551g.e();
                b.C1013a c1013a = (b.C1013a) bVar;
                if (!c1013a.d()) {
                    float f11 = c6547a.f63286p;
                    if (((int) f11) == ((int) e11)) {
                        if (f11 == e11 || ((iVar = c6547a.f63290t) != null && !iVar.c(c10551g.c()))) {
                            we0.i D11 = c6547a.D(c10551g, false);
                            if (D11 == null) {
                                return Unit.f71690a;
                            }
                            k c11 = c1013a.c();
                            fVar.f63344d = c6547a;
                            fVar.f63345e = null;
                            fVar.f63346f = e11;
                            fVar.f63349i = 3;
                        }
                        c6547a.f63286p = e11;
                        return Unit.f71690a;
                    }
                }
                we0.i D12 = c6547a.D(c10551g, true);
                if (D12 == null) {
                    return Unit.f71690a;
                }
                k c12 = c1013a.c();
                fVar.f63344d = c6547a;
                fVar.f63345e = null;
                fVar.f63346f = e11;
                fVar.f63349i = 2;
            }
        }
        fVar = new fe0.f(c6547a, cVar);
        Object obj2 = fVar.f63347g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f63349i;
        if (i11 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r7.f63274d.q(r8, (ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult) r10, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(we0.i iVar, k kVar, float f7, kotlin.coroutines.jvm.internal.c cVar) {
        C6549c c6549c;
        int i11;
        we0.i iVar2;
        C6547a<ALGO> c6547a;
        if (cVar instanceof C6549c) {
            c6549c = (C6549c) cVar;
            int i12 = c6549c.f63333h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6549c.f63333h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6549c.f63331f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6549c.f63333h;
                if (i11 != 0) {
                    s.b(obj);
                    y(this.f63279i, InterfaceC6192a.c.f61613a);
                    c6549c.f63329d = this;
                    c6549c.f63330e = iVar;
                    c6549c.f63333h = 1;
                    obj = this.f63272b.getClusters(f7, kVar, c6549c);
                    if (obj != aVar) {
                        iVar2 = iVar;
                        c6547a = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6547a = c6549c.f63329d;
                    s.b(obj);
                    if (!(c6547a.f63274d.o() instanceof Ne0.b)) {
                        c6547a.y(c6547a.f63279i, InterfaceC6192a.b.f61612a);
                    }
                    return Unit.f71690a;
                }
                we0.i iVar3 = c6549c.f63330e;
                C6547a<ALGO> c6547a2 = c6549c.f63329d;
                s.b(obj);
                iVar2 = iVar3;
                c6547a = c6547a2;
                c6547a.y(c6547a.f63279i, InterfaceC6192a.C0959a.f61611a);
                c6549c.f63329d = c6547a;
                c6549c.f63330e = null;
                c6549c.f63333h = 2;
            }
        }
        c6549c = new C6549c(this, cVar);
        Object obj2 = c6549c.f63331f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6549c.f63333h;
        if (i11 != 0) {
        }
        c6547a.y(c6547a.f63279i, InterfaceC6192a.C0959a.f61611a);
        c6549c.f63329d = c6547a;
        c6549c.f63330e = null;
        c6549c.f63333h = 2;
    }

    static b.C1013a w(C6547a c6547a, d dVar, C10551g c10551g) {
        k kVar = c6547a.f63277g;
        c6547a.getClass();
        return new b.C1013a(dVar, c10551g, kVar, false);
    }

    private final void y(x0<InterfaceC6192a> x0Var, InterfaceC6192a interfaceC6192a) {
        C10727i.c(this.f63282l, null, null, new f(x0Var, interfaceC6192a, null), 3);
    }

    protected Object A(float f7, @NotNull k kVar, @NotNull kotlin.coroutines.d<? super ClusterizingResult<u>> dVar) {
        return null;
    }

    public final long B() {
        return this.f63281k;
    }

    @NotNull
    protected final C2862e C() {
        return this.f63282l;
    }

    protected void E(@NotNull we0.h cameraPositionUpdate) {
        Intrinsics.checkNotNullParameter(cameraPositionUpdate, "cameraPositionUpdate");
    }

    protected Object F(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f63274d.j();
        return Unit.f71690a;
    }

    public final void G(xe.B0 b02) {
        this.f63288r = b02;
    }

    public final void H() {
        xe.B0 b02 = this.f63287q;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f63287q = C2399j.C(C2399j.B(new C2408n0(C2399j.Q(C5818b.a(this.f63273c), new g(new kotlin.jvm.internal.M(), this, null)), new h(this, null)), this.f63284n), this.f63282l);
    }

    @Override // de0.d
    @NotNull
    public final List<we0.s> a() {
        return this.f63274d.n();
    }

    @Override // de0.d
    @NotNull
    public final ALGO b() {
        return this.f63272b;
    }

    @Override // de0.d
    public final void c(@NotNull de0.c clusterizerState) {
        Intrinsics.checkNotNullParameter(clusterizerState, "clusterizerState");
        if (Intrinsics.d(this.f63291u, clusterizerState)) {
            return;
        }
        de0.c cVar = this.f63291u;
        this.f63291u = clusterizerState;
        C10727i.c(this.f63282l, null, null, new i(this, cVar, null), 3);
    }

    @Override // de0.d
    public final void d() {
        k options = this.f63277g;
        Intrinsics.checkNotNullParameter(options, "options");
        this.f63277g = options;
        C10727i.c(this.f63282l, null, null, new C6548b(this, new b.C1013a(d.USER, null, options, true), null), 3);
    }

    @Override // de0.d
    public final void e(@NotNull u updatedPlacemark) {
        Object obj;
        Intrinsics.checkNotNullParameter(updatedPlacemark, "updatedPlacemark");
        ALGO algo = this.f63272b;
        Iterator it = algo.getItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((u) obj).e(), updatedPlacemark.e())) {
                    break;
                }
            }
        }
        u uVar = (u) obj;
        if (uVar == null) {
            throw new Exception(A0.b("Placemark with ", updatedPlacemark.e(), " id not exist"));
        }
        algo.removeItem(uVar);
        algo.addItem(updatedPlacemark);
        C10727i.c(this.f63282l, null, null, new C6548b(this, new b.C1014b(d.USER, new fe0.g(this, uVar, updatedPlacemark, null)), null), 3);
    }

    @Override // de0.d
    @NotNull
    public final B0<InterfaceC6350a> f() {
        return this.f63278h;
    }

    @Override // de0.d
    @NotNull
    public final ArrayList g() {
        return this.f63274d.p(this.f63275e.a(r0.e(), this.f63273c.getCurrentPosition().c(), r0.b(), r0.d()));
    }

    @Override // de0.d
    @NotNull
    public final String getId() {
        return this.f63271a;
    }

    public final void x() {
        C10727i.c(this.f63282l, this.f63283m, null, new e(this, null), 2);
    }

    public final xe.B0 z() {
        return this.f63288r;
    }
}
