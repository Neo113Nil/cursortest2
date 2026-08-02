package yi;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import C.C2697q;
import C.I;
import C.InterfaceC2689i;
import C.Y;
import Qi.InterfaceC3877a;
import Sc.r;
import Sc.s;
import W.C4851w;
import W.K;
import W.W;
import W.f0;
import W.r;
import W.t0;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import androidx.camera.core.impl.L0;
import androidx.lifecycle.D;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x2.InterfaceC10646a;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;
import yi.c;
import yi.e;

/* loaded from: classes10.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f106697a;

    /* renamed from: b, reason: collision with root package name */
    private final String f106698b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f106699c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC3877a f106700d;

    /* renamed from: e, reason: collision with root package name */
    private J f106701e;

    /* renamed from: f, reason: collision with root package name */
    private D f106702f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final yi.c f106703g;

    /* renamed from: h, reason: collision with root package name */
    private C.I f106704h;

    /* renamed from: i, reason: collision with root package name */
    private f0<K> f106705i;

    /* renamed from: j, reason: collision with root package name */
    private W f106706j;

    /* renamed from: k, reason: collision with root package name */
    private V.b f106707k;

    /* renamed from: l, reason: collision with root package name */
    private V.g f106708l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f106709m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f106710n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C0 f106711o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final B0<e> f106712p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final x0<f> f106713q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final M0<f> f106714r;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl", f = "CameraStateProvider.kt", l = {208, 217}, m = "bindCamera")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        k f106715d;

        /* renamed from: e, reason: collision with root package name */
        h f106716e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106717f;

        /* renamed from: h, reason: collision with root package name */
        int f106719h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f106717f = obj;
            this.f106719h |= LinearLayoutManager.INVALID_OFFSET;
            return k.this.e(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl$takeVideo$1$recording$2$1", f = "CameraStateProvider.kt", l = {343, 353}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106720d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ File f106722f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f106722f = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new b(this.f106722f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            if (r1.emit(r2, r5) == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106720d;
            k kVar = k.this;
            try {
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion = r.INSTANCE;
                a11 = s.a(th2);
            }
            if (i11 == 0) {
                s.b(obj);
                File file = this.f106722f;
                r.Companion companion2 = r.INSTANCE;
                Context context = kVar.f106697a;
                this.f106720d = 1;
                obj = Fi.c.d(context, file, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            a11 = (Uri) obj;
            r.Companion companion3 = r.INSTANCE;
            Throwable b11 = r.b(a11);
            if (b11 != null) {
                k.A(kVar, b11, "takeVideo scanFileToMediaStore exception");
                a11 = null;
            }
            Uri uri = (Uri) a11;
            if (uri != null) {
                C0 c02 = kVar.f106711o;
                e.f fVar = new e.f(uri);
                this.f106720d = 2;
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl$takeVideo$1$recording$2$2", f = "CameraStateProvider.kt", l = {358}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106723d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106723d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = k.this.f106711o;
                e.C2307e c2307e = e.C2307e.f106679a;
                this.f106723d = 1;
                if (c02.emit(c2307e, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.data.CameraStateProviderImpl$takeVideo$1$recording$2$3", f = "CameraStateProvider.kt", l = {362}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106725d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106725d;
            if (i11 == 0) {
                s.b(obj);
                C0 c02 = k.this.f106711o;
                e.C2307e c2307e = e.C2307e.f106679a;
                this.f106725d = 1;
                if (c02.emit(c2307e, this) == aVar) {
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

    public k(Context context, String str, InterfaceC3877a logger) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b dispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f106697a = context;
        this.f106698b = str;
        this.f106699c = dispatcher;
        this.f106700d = logger;
        this.f106703g = new yi.c(logger);
        C0 b11 = E0.b(0, 10, null, 5);
        this.f106711o = b11;
        this.f106712p = C2399j.a(b11);
        x0<f> a11 = O0.a(new f(0));
        this.f106713q = a11;
        this.f106714r = C2399j.b(a11);
    }

    static /* synthetic */ void A(k kVar, Throwable th2, String str) {
        kVar.z(th2, str, U.c());
    }

    private final void B(V.b bVar, h hVar) {
        Object a11;
        if (this.f106710n && hVar.d() == 1) {
            try {
                r.Companion companion = r.INSTANCE;
                ((L0) bVar.a()).e(true);
                a11 = Unit.f71690a;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            Throwable b11 = r.b(a11);
            if (b11 == null) {
                return;
            }
            z(b11, "restoreTorchIfNeeded exception", C(hVar));
        }
    }

    private static Tc.d C(h hVar) {
        Tc.d builder = new Tc.d();
        builder.put("lens_facing", Integer.valueOf(hVar.d()));
        builder.put("lens", hVar.c().name());
        builder.put("capture_mode", hVar.a().name());
        builder.put("flash_mode", Integer.valueOf(hVar.b()));
        builder.put("zoom_level", Float.valueOf(hVar.f()));
        Object e11 = hVar.e();
        if (e11 == null) {
            e11 = "null";
        }
        builder.put("surface_provider", e11);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    public static void l(k kVar, File file, t0 t0Var) {
        if (t0Var instanceof t0.a) {
            if (((t0.a) t0Var).c() != 0) {
                file.delete();
                D d11 = kVar.f106702f;
                if (d11 != null) {
                    C10727i.c(d11, null, null, kVar.new d(null), 3);
                    return;
                }
                return;
            }
            if (!kVar.f106709m) {
                D d12 = kVar.f106702f;
                if (d12 != null) {
                    C10727i.c(d12, null, null, kVar.new b(file, null), 3);
                    return;
                }
                return;
            }
            file.delete();
            D d13 = kVar.f106702f;
            if (d13 != null) {
                C10727i.c(d13, null, null, kVar.new c(null), 3);
            }
        }
    }

    private final V.b u(V.g gVar, J j11, C2697q c2697q, Y y11, h hVar) {
        I.b bVar = new I.b();
        bVar.f();
        bVar.h(hVar.b());
        C.I c11 = bVar.c();
        Intrinsics.checkNotNullExpressionValue(c11, "build(...)");
        this.f106704h = c11;
        this.f106705i = null;
        return gVar.f(j11, c2697q, y11, c11);
    }

    private final V.b w(V.g gVar, J j11, C2697q c2697q, Y y11) {
        K a11 = new K.h().a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        f0<K> o02 = f0.o0(a11);
        Intrinsics.checkNotNullExpressionValue(o02, "withOutput(...)");
        this.f106705i = o02;
        this.f106704h = null;
        return gVar.f(j11, c2697q, y11, o02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (r1.emit(r5, r2) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        if (r1.emit(r6, r2) == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(c.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        f value;
        k kVar;
        c.b bVar2;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f106731h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f106731h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f106729f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f106731h;
                if (i11 != 0) {
                    s.b(obj);
                    x0<f> x0Var = this.f106713q;
                    do {
                        value = x0Var.getValue();
                    } while (!x0Var.b(value, f.a(value, bVar.c(), bVar.b(), bVar.e(), bVar.d(), 0.0f, bVar.f(), bVar.a(), 33)));
                    C0 c02 = this.f106711o;
                    e.a aVar2 = new e.a(bVar.c(), bVar.b());
                    lVar.f106727d = this;
                    lVar.f106728e = bVar;
                    lVar.f106731h = 1;
                    if (c02.emit(aVar2, lVar) != aVar) {
                        kVar = this;
                        bVar2 = bVar;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                bVar2 = lVar.f106728e;
                kVar = lVar.f106727d;
                s.b(obj);
                if (bVar2.a() == null) {
                    kVar.f106700d.a(ru.ozon.android.ozonLogger.core.c.ERROR);
                    C0 c03 = kVar.f106711o;
                    e.b bVar3 = new e.b(bVar2.a());
                    lVar.f106727d = null;
                    lVar.f106728e = null;
                    lVar.f106731h = 2;
                } else {
                    C0 c04 = kVar.f106711o;
                    e.c cVar2 = new e.c(bVar2.e(), bVar2.d());
                    lVar.f106727d = null;
                    lVar.f106728e = null;
                    lVar.f106731h = 3;
                }
                return aVar;
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f106729f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f106731h;
        if (i11 != 0) {
        }
        if (bVar2.a() == null) {
        }
        return aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|(1:(1:9)(2:25|26))(7:27|(1:29)(1:40)|30|31|(1:32)|36|(1:38)(1:39))|10|11|12|(1:14)|15|16))|41|6|(0)(0)|10|11|12|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r0 = Sc.r.INSTANCE;
        r15 = Sc.s.a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v2, types: [C.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(V.b bVar, h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        f value;
        h hVar2;
        k kVar;
        Throwable b11;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f106737i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f106737i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mVar.f106735g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f106737i;
                if (i11 != 0) {
                    s.b(obj);
                    Float f7 = (Float) B.h.a(bVar.b()).b(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
                    float floatValue = f7 != null ? f7.floatValue() : 1.0f;
                    x0<f> x0Var = this.f106713q;
                    do {
                        value = x0Var.getValue();
                    } while (!x0Var.b(value, f.a(value, false, false, false, false, floatValue, 0.0f, null, 95)));
                    C0 c02 = this.f106711o;
                    e.d dVar = new e.d(floatValue);
                    mVar.f106732d = this;
                    mVar.f106733e = bVar;
                    hVar2 = hVar;
                    mVar.f106734f = hVar2;
                    mVar.f106737i = 1;
                    if (c02.emit(dVar, mVar) == aVar) {
                        return aVar;
                    }
                    kVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h hVar3 = mVar.f106734f;
                    ?? r22 = mVar.f106733e;
                    kVar = mVar.f106732d;
                    s.b(obj);
                    hVar2 = hVar3;
                    bVar = r22;
                }
                r.Companion companion = r.INSTANCE;
                bVar.a().d(hVar2.f());
                Object a11 = Unit.f71690a;
                b11 = r.b(a11);
                if (b11 != null) {
                    kVar.getClass();
                    kVar.z(b11, "emitUpdatedCapabilities exception", C(hVar2));
                }
                return Unit.f71690a;
            }
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f106735g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f106737i;
        if (i11 != 0) {
        }
        r.Companion companion2 = r.INSTANCE;
        bVar.a().d(hVar2.f());
        Object a112 = Unit.f71690a;
        b11 = r.b(a112);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    private final void z(Throwable th2, String str, Map<String, ? extends Object> map) {
        if (th2 instanceof CancellationException) {
            throw th2;
        }
        this.f106700d.b(th2, "ozon_gallery", "camera_state_provider ".concat(str), map);
    }

    @Override // yi.i
    public final void a() {
        W w11 = this.f106706j;
        if (w11 != null) {
            w11.close();
        }
        this.f106706j = null;
    }

    @Override // yi.i
    public final void b(int i11) {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            C.I i12 = this.f106704h;
            if (i12 != null) {
                i12.c0(i11);
            }
            a11 = Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 == null) {
            return;
        }
        z(b11, "setFlashMode exception", U.i(new Pair("flash_mode", Integer.valueOf(i11))));
    }

    @Override // yi.i
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C10727i.f(this.f106699c, new p(this, null), cVar);
    }

    @Override // yi.i
    public final void d() {
        Object a11;
        f0<K> f0Var = this.f106705i;
        if (f0Var == null) {
            return;
        }
        final File b11 = Fi.c.b(this.f106698b);
        W.r a12 = new r.a(b11).a();
        Intrinsics.checkNotNullExpressionValue(a12, "build(...)");
        Context context = this.f106697a;
        boolean z11 = androidx.core.content.a.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
        this.f106709m = false;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            C4851w C11 = f0Var.i0().C(context, a12);
            if (z11) {
                C11.j();
            }
            W i11 = C11.i(androidx.core.content.a.getMainExecutor(context), new InterfaceC10646a() { // from class: yi.j
                @Override // x2.InterfaceC10646a
                public final void accept(Object obj) {
                    k.l(k.this, b11, (t0) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(i11, "start(...)");
            this.f106706j = i11;
            a11 = Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b12 = Sc.r.b(a11);
        if (b12 == null) {
            return;
        }
        A(this, b12, "takeVideo exception");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x012e, code lost:
    
        if (r0.emit(r2, r7) == r8) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4, types: [yi.q] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [yi.h] */
    @Override // yi.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull h hVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        h hVar2;
        k kVar;
        Y c11;
        C2697q c12;
        C2697q c2697q;
        J j11;
        h hVar3;
        Object obj;
        V.b w11;
        h hVar4;
        Throwable b11;
        f value;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i12 = aVar.f106719h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f106719h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    a aVar2 = aVar;
                    Object obj2 = aVar2.f106717f;
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = aVar2.f106719h;
                    if (i11 != 0) {
                        s.b(obj2);
                        V.g gVar = this.f106708l;
                        if (gVar == null) {
                            return Unit.f71690a;
                        }
                        try {
                            r.Companion companion = Sc.r.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            c11 = new Y.a().c();
                            Intrinsics.checkNotNullExpressionValue(c11, "build(...)");
                            Y.c e11 = hVar.e();
                            if (e11 != null) {
                                c11.X(e11);
                            }
                            if (hVar.c() == g.WIDE) {
                                C2697q.a aVar4 = new C2697q.a();
                                aVar4.c(hVar.d());
                                c12 = aVar4.b();
                            } else {
                                c12 = this.f106703g.c(gVar, this.f106697a, hVar.d(), hVar.c());
                            }
                            c2697q = c12;
                            gVar.j();
                            j11 = this.f106701e;
                        } catch (Throwable th3) {
                            th = th3;
                            hVar2 = hVar;
                            kVar = this;
                            hVar4 = hVar2;
                            r.Companion companion2 = Sc.r.INSTANCE;
                            obj = s.a(th);
                            hVar3 = hVar4;
                            b11 = Sc.r.b(obj);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                        if (j11 == null) {
                            kVar = this;
                            hVar3 = hVar;
                            obj = null;
                            r.Companion companion3 = Sc.r.INSTANCE;
                            b11 = Sc.r.b(obj);
                            if (b11 != null) {
                                kVar.getClass();
                                kVar.z(b11, "bindCamera exception", C(hVar3));
                                x0<f> x0Var = kVar.f106713q;
                                do {
                                    value = x0Var.getValue();
                                } while (!x0Var.b(value, f.a(value, false, false, false, false, 0.0f, 0.0f, "camera start error", 127)));
                                C0 c02 = kVar.f106711o;
                                e.b bVar = new e.b("camera start error");
                                aVar2.f106715d = null;
                                aVar2.f106716e = null;
                                aVar2.f106719h = 2;
                            }
                            return Unit.f71690a;
                        }
                        q a11 = hVar.a();
                        h hVar5 = q.PHOTO;
                        try {
                            if (a11 == hVar5) {
                                h hVar6 = hVar;
                                w11 = u(gVar, j11, c2697q, c11, hVar6);
                                hVar5 = hVar6;
                            } else {
                                hVar5 = hVar;
                                w11 = w(gVar, j11, c2697q, c11);
                            }
                            this.f106707k = w11;
                            this.f106706j = null;
                            this.f106709m = false;
                            B(w11, hVar5);
                            aVar2.f106715d = this;
                            aVar2.f106716e = hVar5;
                            aVar2.f106719h = 1;
                            if (y(w11, hVar5, aVar2) != aVar3) {
                                kVar = this;
                                hVar3 = hVar5;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            hVar2 = hVar5;
                            kVar = this;
                            hVar4 = hVar2;
                            r.Companion companion22 = Sc.r.INSTANCE;
                            obj = s.a(th);
                            hVar3 = hVar4;
                            b11 = Sc.r.b(obj);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                        return aVar3;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return Unit.f71690a;
                    }
                    hVar3 = aVar2.f106716e;
                    kVar = aVar2.f106715d;
                    try {
                        s.b(obj2);
                    } catch (Throwable th5) {
                        th = th5;
                        hVar4 = hVar3;
                        r.Companion companion222 = Sc.r.INSTANCE;
                        obj = s.a(th);
                        hVar3 = hVar4;
                        b11 = Sc.r.b(obj);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    obj = Unit.f71690a;
                    r.Companion companion32 = Sc.r.INSTANCE;
                    b11 = Sc.r.b(obj);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            obj = Unit.f71690a;
            r.Companion companion322 = Sc.r.INSTANCE;
            b11 = Sc.r.b(obj);
            if (b11 != null) {
            }
            return Unit.f71690a;
        } catch (CancellationException e12) {
            throw e12;
        }
        aVar = new a(dVar);
        a aVar22 = aVar;
        Object obj22 = aVar22.f106717f;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar22.f106719h;
    }

    @Override // yi.i
    public final boolean f() {
        return androidx.core.content.a.checkSelfPermission(this.f106697a, "android.permission.RECORD_AUDIO") == 0;
    }

    @Override // yi.i
    public final void g(boolean z11) {
        Object a11;
        InterfaceC2689i a12;
        this.f106710n = z11;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            V.b bVar = this.f106707k;
            if (bVar != null && (a12 = bVar.a()) != null) {
                ((L0) a12).e(z11);
            }
            a11 = Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 == null) {
            return;
        }
        z(b11, "setTorchEnabled exception", U.i(new Pair("torch_enabled", Boolean.valueOf(z11))));
    }

    @Override // yi.i
    @NotNull
    public final B0<e> getEvents() {
        return this.f106712p;
    }

    @Override // yi.i
    public final void h() {
        this.f106709m = true;
        W w11 = this.f106706j;
        if (w11 != null) {
            w11.close();
        }
        this.f106706j = null;
    }

    @Override // yi.i
    @NotNull
    public final M0<f> i() {
        return this.f106714r;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:3|(15:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(9:19|20|21|(1:22)|25|26|(3:28|(1:29)|32)|14|15))(11:38|39|40|(2:42|34)|21|(1:22)|25|26|(0)|14|15))(2:43|44))(5:48|49|50|(1:52)|34)|45|(2:47|34)|40|(0)|21|(1:22)|25|26|(0)|14|15))|7|(0)(0)|45|(0)|40|(0)|21|(1:22)|25|26|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
    
        if (r0.emit(r4, r2) == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0044, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [yi.k] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // yi.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        Object obj;
        Wc.a aVar;
        ?? r42;
        Object a11;
        k kVar;
        Throwable b11;
        f value;
        k kVar2;
        k kVar3;
        Object x11;
        x0<f> x0Var;
        f value2;
        try {
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i11 = nVar.f106741g;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    nVar.f106741g = i11 - LinearLayoutManager.INVALID_OFFSET;
                    obj = nVar.f106739e;
                    aVar = Wc.a.COROUTINE_SUSPENDED;
                    r42 = nVar.f106741g;
                    if (r42 != 0) {
                        s.b(obj);
                        try {
                            r.Companion companion = Sc.r.INSTANCE;
                            xe.I i12 = this.f106699c;
                            o oVar = new o(this, null);
                            nVar.f106738d = this;
                            nVar.f106741g = 1;
                            obj = C10727i.f(i12, oVar, nVar);
                            if (obj != aVar) {
                                kVar2 = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r42 = this;
                            r.Companion companion2 = Sc.r.INSTANCE;
                            a11 = s.a(th);
                            kVar = r42;
                            b11 = Sc.r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                        return aVar;
                    }
                    if (r42 != 1) {
                        if (r42 == 2) {
                            k kVar4 = nVar.f106738d;
                            s.b(obj);
                            kVar3 = kVar4;
                            nVar.f106738d = kVar3;
                            nVar.f106741g = 3;
                            x11 = kVar3.x((c.b) obj, nVar);
                            r42 = kVar3;
                            if (x11 == aVar) {
                                return aVar;
                            }
                            x0Var = r42.f106713q;
                            do {
                                value2 = x0Var.getValue();
                            } while (!x0Var.b(value2, f.a(value2, false, false, false, false, 0.0f, 0.0f, null, 254)));
                            a11 = Unit.f71690a;
                            r.Companion companion3 = Sc.r.INSTANCE;
                            kVar = r42;
                            b11 = Sc.r.b(a11);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                        if (r42 != 3) {
                            if (r42 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        k kVar5 = nVar.f106738d;
                        s.b(obj);
                        r42 = kVar5;
                        x0Var = r42.f106713q;
                        do {
                            value2 = x0Var.getValue();
                        } while (!x0Var.b(value2, f.a(value2, false, false, false, false, 0.0f, 0.0f, null, 254)));
                        a11 = Unit.f71690a;
                        r.Companion companion32 = Sc.r.INSTANCE;
                        kVar = r42;
                        b11 = Sc.r.b(a11);
                        if (b11 != null) {
                            A(kVar, b11, "initialize exception");
                            x0<f> x0Var2 = kVar.f106713q;
                            do {
                                value = x0Var2.getValue();
                            } while (!x0Var2.b(value, f.a(value, false, false, false, false, 0.0f, 0.0f, "No access to camera", 127)));
                            C0 c02 = kVar.f106711o;
                            e.b bVar = new e.b("No access to camera");
                            nVar.f106738d = null;
                            nVar.f106741g = 4;
                        }
                        return Unit.f71690a;
                    }
                    k kVar6 = nVar.f106738d;
                    s.b(obj);
                    kVar2 = kVar6;
                    kVar2.f106708l = (V.g) obj;
                    yi.c cVar2 = kVar2.f106703g;
                    Context context = kVar2.f106697a;
                    nVar.f106738d = kVar2;
                    nVar.f106741g = 2;
                    cVar2.getClass();
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    obj = C10727i.f(He.b.f10879b, new yi.d(cVar2, context, null), nVar);
                    kVar3 = kVar2;
                    if (obj == aVar) {
                        return aVar;
                    }
                    nVar.f106738d = kVar3;
                    nVar.f106741g = 3;
                    x11 = kVar3.x((c.b) obj, nVar);
                    r42 = kVar3;
                    if (x11 == aVar) {
                    }
                    x0Var = r42.f106713q;
                    do {
                        value2 = x0Var.getValue();
                    } while (!x0Var.b(value2, f.a(value2, false, false, false, false, 0.0f, 0.0f, null, 254)));
                    a11 = Unit.f71690a;
                    r.Companion companion322 = Sc.r.INSTANCE;
                    kVar = r42;
                    b11 = Sc.r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            }
            if (r42 != 0) {
            }
            kVar2.f106708l = (V.g) obj;
            yi.c cVar22 = kVar2.f106703g;
            Context context2 = kVar2.f106697a;
            nVar.f106738d = kVar2;
            nVar.f106741g = 2;
            cVar22.getClass();
            C10720e0 c10720e02 = C10720e0.f105451a;
            obj = C10727i.f(He.b.f10879b, new yi.d(cVar22, context2, null), nVar);
            kVar3 = kVar2;
            if (obj == aVar) {
            }
            nVar.f106738d = kVar3;
            nVar.f106741g = 3;
            x11 = kVar3.x((c.b) obj, nVar);
            r42 = kVar3;
            if (x11 == aVar) {
            }
            x0Var = r42.f106713q;
            do {
                value2 = x0Var.getValue();
            } while (!x0Var.b(value2, f.a(value2, false, false, false, false, 0.0f, 0.0f, null, 254)));
            a11 = Unit.f71690a;
            r.Companion companion3222 = Sc.r.INSTANCE;
            kVar = r42;
            b11 = Sc.r.b(a11);
            if (b11 != null) {
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        }
        nVar = new n(this, cVar);
        obj = nVar.f106739e;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        r42 = nVar.f106741g;
    }

    @Override // yi.i
    public final void k(float f7) {
        Object a11;
        InterfaceC2689i a12;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            V.b bVar = this.f106707k;
            if (bVar != null && (a12 = bVar.a()) != null) {
                ((L0) a12).d(f7);
            }
            a11 = Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 == null) {
            return;
        }
        z(b11, "setZoom exception", U.i(new Pair("zoom_level", Float.valueOf(f7))));
    }

    @Override // yi.i
    public final void release() {
        Object a11;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            V.g gVar = this.f106708l;
            if (gVar != null) {
                gVar.j();
                a11 = Unit.f71690a;
            } else {
                a11 = null;
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            A(this, b11, "release exception");
        }
        this.f106706j = null;
        this.f106704h = null;
        this.f106705i = null;
        this.f106707k = null;
        this.f106708l = null;
    }

    public final void v(@NotNull J lifecycleOwner, @NotNull D scope) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f106701e = lifecycleOwner;
        this.f106702f = scope;
    }
}
