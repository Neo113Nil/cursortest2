package re0;

import Ae.C2380A;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import De.C2862e;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import android.location.Location;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oe0.o;
import org.jetbrains.annotations.NotNull;
import se0.AbstractC9672a;
import te0.C9867b;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;

/* renamed from: re0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9260c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2862e f83334a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o f83335b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC9672a f83336c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Location f83337d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f83338e;

    /* renamed from: f, reason: collision with root package name */
    private Location f83339f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private AtomicBoolean f83340g;

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.pulse.LocationPulseListener$startListening$1", f = "LocationPulseListener.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: re0.c$a */
    static final class a extends j implements Function2<InterfaceC2397i<? super Location>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83341d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f83342e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = C9260c.this.new a(dVar);
            aVar.f83342e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super Location> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83341d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f83342e;
                Location location = C9260c.this.f83337d;
                this.f83341d = 1;
                if (interfaceC2397i.emit(location, this) == aVar) {
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

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.pulse.LocationPulseListener$startListening$2", f = "LocationPulseListener.kt", l = {}, m = "invokeSuspend")
    /* renamed from: re0.c$b */
    static final class b extends j implements Function2<Location, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f83344d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = C9260c.this.new b(dVar);
            bVar.f83344d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Location location, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(location, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            Location location = (Location) this.f83344d;
            C9867b.g("Received new coords, proceed pulsing", null, 6);
            C9260c c9260c = C9260c.this;
            C9260c.f(c9260c, true);
            if (Intrinsics.d(location, c9260c.f83337d)) {
                return Unit.f71690a;
            }
            if (c9260c.f83339f == null) {
                c9260c.f83339f = location;
                return Unit.f71690a;
            }
            Location location2 = c9260c.f83339f;
            Intrinsics.f(location2);
            if (location2.getTime() >= location.getTime()) {
                return Unit.f71690a;
            }
            c9260c.f83339f = location;
            return Unit.f71690a;
        }
    }

    @e(c = "ru.ozon.mapsdk.common.locationcontroller.userLocationManager.pulse.LocationPulseListener$startListening$3", f = "LocationPulseListener.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: re0.c$c, reason: collision with other inner class name */
    static final class C1419c extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83346d;

        C1419c(kotlin.coroutines.d<? super C1419c> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C9260c.this.new C1419c(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1419c) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f7;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83346d;
            C9260c c9260c = C9260c.this;
            if (i11 == 0) {
                s.b(obj);
                C9867b.g("Timeout. Dont have new coords 10000 ms", null, 6);
                C9867b.g("Try get current location", null, 6);
                o oVar = c9260c.f83335b;
                this.f83346d = 1;
                f7 = oVar.f(this);
                if (f7 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                f7 = ((r) obj).getF26106a();
            }
            r.Companion companion = r.INSTANCE;
            if (!(f7 instanceof r.b)) {
                Location location = (Location) f7;
                C9867b c9867b = C9867b.f99466a;
                C9867b.g("Received location by getCurrentLocation request - " + location, null, 6);
                if (c9260c.f83339f == null) {
                    C9867b.g("newLock == null || lastKnownLocation == null - stop pulsing", null, 6);
                    C9260c.f(c9260c, false);
                } else {
                    long time = location.getTime();
                    Location location2 = c9260c.f83339f;
                    Intrinsics.f(location2);
                    if (time < location2.getTime()) {
                        C9867b.g("new location fetched before last known location - stop pulsing", null, 6);
                        C9260c.f(c9260c, false);
                    } else {
                        long time2 = location.getTime();
                        Location location3 = c9260c.f83339f;
                        Intrinsics.f(location3);
                        if (time2 - location3.getTime() < 10000) {
                            C9867b.g("while getting direct location - in flow have new value, continue pulsing", null, 6);
                            C9260c.f(c9260c, true);
                        } else {
                            C9867b.g("Received new location ok, continue pulsing", null, 6);
                            C9260c.f(c9260c, true);
                        }
                    }
                }
            }
            Throwable b11 = r.b(f7);
            if (b11 != null) {
                C9867b c9867b2 = C9867b.f99466a;
                C9867b.g("Failure getCurrentLocation request - " + b11.getMessage(), null, 6);
                C9260c.f(c9260c, false);
            }
            return Unit.f71690a;
        }
    }

    public C9260c(@NotNull C2862e scope, @NotNull o locationProvider, @NotNull AbstractC9672a pulsingControl) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(pulsingControl, "pulsingControl");
        this.f83334a = scope;
        this.f83335b = locationProvider;
        this.f83336c = pulsingControl;
        this.f83337d = new Location("stub");
        this.f83340g = new AtomicBoolean(false);
    }

    public static final void f(C9260c c9260c, boolean z11) {
        AtomicBoolean atomicBoolean = c9260c.f83340g;
        if (atomicBoolean.get() == z11) {
            return;
        }
        atomicBoolean.set(z11);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(c9260c.f83334a, De.s.f6650a.x(), null, new C9259b(c9260c, z11, null), 2);
    }

    @SuppressLint({"MissingPermission"})
    public final void g() {
        this.f83338e = C2399j.C(C2399j.B(new C2408n0(C2399j.l(new C2408n0(new C2380A(this.f83335b.g(0L, o.a.FUSED, false), new a(null)), new b(null)), 10000L), new C9258a(new C1419c(null), null)), C10720e0.a()), this.f83334a);
    }

    public final void h() {
        B0 b02 = this.f83338e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }
}
