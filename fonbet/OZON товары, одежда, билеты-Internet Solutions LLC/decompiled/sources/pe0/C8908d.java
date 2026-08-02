package pe0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oe0.o;
import org.jetbrains.annotations.NotNull;
import te0.C9867b;
import we0.m;
import we0.p;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* renamed from: pe0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8908d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f80433a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o f80434b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<p> f80435c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f80436d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f80437e;

    /* renamed from: pe0.d$a */
    public static final class a implements InterfaceC2395h<p> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f80438a;

        /* renamed from: pe0.d$a$a, reason: collision with other inner class name */
        public static final class C1357a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f80439a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.InternalLocationListener$start$$inlined$map$1$2", f = "InternalLocationListener.kt", l = {223}, m = "emit")
            /* renamed from: pe0.d$a$a$a, reason: collision with other inner class name */
            public static final class C1358a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f80440d;

                /* renamed from: e, reason: collision with root package name */
                int f80441e;

                public C1358a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f80440d = obj;
                    this.f80441e |= LinearLayoutManager.INVALID_OFFSET;
                    return C1357a.this.emit(null, this);
                }
            }

            public C1357a(InterfaceC2397i interfaceC2397i) {
                this.f80439a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C1358a c1358a;
                int i11;
                if (dVar instanceof C1358a) {
                    c1358a = (C1358a) dVar;
                    int i12 = c1358a.f80441e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1358a.f80441e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1358a.f80440d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1358a.f80441e;
                        if (i11 != 0) {
                            s.b(obj2);
                            Location location = (Location) obj;
                            Intrinsics.checkNotNullParameter(location, "location");
                            p pVar = new p(new m(location.getLatitude(), location.getLongitude()), Float.valueOf(location.getBearing()), Double.valueOf(location.getAltitude()), Float.valueOf(location.getSpeed()), Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider(), Float.valueOf(location.getAccuracy()));
                            c1358a.f80441e = 1;
                            if (this.f80439a.emit(pVar, c1358a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c1358a = new C1358a(dVar);
                Object obj22 = c1358a.f80440d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1358a.f80441e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public a(InterfaceC2395h interfaceC2395h) {
            this.f80438a = interfaceC2395h;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super p> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f80438a.collect(new C1357a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.InternalLocationListener$start$1", f = "InternalLocationListener.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32}, m = "invokeSuspend")
    /* renamed from: pe0.d$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f80443d;

        /* renamed from: e, reason: collision with root package name */
        int f80444e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8908d.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (r2.emit((we0.p) r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object e11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80444e;
            C8908d c8908d = C8908d.this;
            if (i11 == 0) {
                s.b(obj);
                o a11 = c8908d.a();
                this.f80444e = 1;
                e11 = a11.e(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                e11 = ((r) obj).getF26106a();
            }
            r.Companion companion = r.INSTANCE;
            if (!(e11 instanceof r.b)) {
                x0<p> b11 = c8908d.b();
                this.f80443d = e11;
                this.f80444e = 2;
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.InternalLocationListener$start$3", f = "InternalLocationListener.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: pe0.d$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<p, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f80446d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f80447e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = C8908d.this.new c(dVar);
            cVar.f80447e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p pVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(pVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80446d;
            if (i11 == 0) {
                s.b(obj);
                p pVar = (p) this.f80447e;
                C9867b c9867b = C9867b.f99466a;
                C9867b.g("InternalListener: New location - " + pVar, null, 6);
                x0<p> b11 = C8908d.this.b();
                this.f80446d = 1;
                if (b11.emit(pVar, this) == aVar) {
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

    public C8908d(@NotNull C2862e scope, @NotNull o locationProvider) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        this.f80433a = scope;
        this.f80434b = locationProvider;
        this.f80435c = O0.a(null);
    }

    @NotNull
    public final o a() {
        return this.f80434b;
    }

    @NotNull
    public final x0<p> b() {
        return this.f80435c;
    }

    @SuppressLint({"MissingPermission"})
    public final void c(boolean z11) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b bVar = He.b.f10879b;
        b bVar2 = new b(null);
        C2862e c2862e = this.f80433a;
        this.f80437e = C10727i.c(c2862e, bVar, null, bVar2, 2);
        this.f80436d = C2399j.C(C2399j.B(new C2408n0(new a(this.f80434b.g(5000L, o.a.FUSED, z11)), new c(null)), bVar), c2862e);
    }

    public final void d() {
        B0 b02 = this.f80436d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        B0 b03 = this.f80437e;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
    }
}
