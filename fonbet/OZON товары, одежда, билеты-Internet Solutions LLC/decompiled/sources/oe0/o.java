package oe0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import De.C2862e;
import Sc.r;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.C9867b;
import xe.C10720e0;
import xe.C10737n;
import xe.f1;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f78221a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8711b f78222b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final n f78223c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ag.d f78224d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final J f78225e;

    /* renamed from: f, reason: collision with root package name */
    private long f78226f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASE;
        public static final a FUSED;

        static {
            a aVar = new a("BASE", 0);
            BASE = aVar;
            a aVar2 = new a("FUSED", 1);
            FUSED = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78227a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f78227a = iArr;
        }
    }

    public o(Context context, C2862e coroutineScope) {
        C8711b fusedSubscribeLocationUpdates = new C8711b(context, coroutineScope);
        n locationFilter = new n();
        Intrinsics.checkNotNullParameter(context, "context");
        ag.d locationEngine = new ag.d(new ag.g(context.getApplicationContext()));
        J smartLocationPicker = new J();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(fusedSubscribeLocationUpdates, "fusedSubscribeLocationUpdates");
        Intrinsics.checkNotNullParameter(locationFilter, "locationFilter");
        Intrinsics.checkNotNullParameter(locationEngine, "locationEngine");
        Intrinsics.checkNotNullParameter(smartLocationPicker, "smartLocationPicker");
        this.f78221a = context;
        this.f78222b = fusedSubscribeLocationUpdates;
        this.f78223c = locationFilter;
        this.f78224d = locationEngine;
        this.f78225e = smartLocationPicker;
        this.f78226f = 20000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        u frame;
        int i11;
        oVar.getClass();
        if (cVar instanceof u) {
            frame = (u) cVar;
            int i12 = frame.f78249f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f78249f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f78247d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f78249f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    frame.f78249f = 1;
                    C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                    c10737n.o();
                    y yVar = new y(oVar, new AtomicBoolean(false), c10737n);
                    c10737n.q(new w(oVar, yVar));
                    c(oVar, new x(oVar, yVar));
                    obj = c10737n.n();
                    if (obj == aVar) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return ((Sc.r) obj).getF26106a();
            }
        }
        frame = new u(oVar, cVar);
        Object obj2 = frame.f78247d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f78249f;
        if (i11 != 0) {
        }
        return ((Sc.r) obj2).getF26106a();
    }

    public static final void c(o oVar, Function1 function1) {
        oVar.getClass();
        try {
            function1.invoke(oVar.f78224d);
        } catch (SecurityException e11) {
            C9867b.f99466a.a("LocationProviderImp", "permission is not granted to access location services", e11);
        }
    }

    public final void d() {
        this.f78222b.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        Object f7;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i12 = rVar.f78240f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f78240f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f78238d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f78240f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    rVar.f78240f = 1;
                    f7 = f(rVar);
                    if (f7 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    f7 = ((Sc.r) obj).getF26106a();
                }
                r.Companion companion = Sc.r.INSTANCE;
                if (!(f7 instanceof r.b)) {
                    return f7;
                }
                Location location = (Location) f7;
                Intrinsics.checkNotNullParameter(location, "location");
                return new we0.p(new we0.m(location.getLatitude(), location.getLongitude()), Float.valueOf(location.getBearing()), Double.valueOf(location.getAltitude()), Float.valueOf(location.getSpeed()), Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider(), Float.valueOf(location.getAccuracy()));
            }
        }
        rVar = new r(this, cVar);
        Object obj3 = rVar.f78238d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f78240f;
        if (i11 != 0) {
        }
        r.Companion companion2 = Sc.r.INSTANCE;
        if (!(f7 instanceof r.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        s sVar;
        Wc.a aVar;
        int i11;
        o oVar;
        Sc.r rVar;
        Throwable fVar;
        Object a11;
        Throwable th2;
        Location location;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i12 = sVar.f78244g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                sVar.f78244g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = sVar.f78242e;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = sVar.f78244g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    t tVar = new t(this, null);
                    sVar.f78241d = this;
                    sVar.f78244g = 1;
                    obj = f1.c(this.f78226f, tVar, sVar);
                    if (obj != aVar) {
                        oVar = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) sVar.f78241d;
                    Sc.s.b(obj);
                    location = (Location) obj;
                    if (location != null) {
                        r.Companion companion = Sc.r.INSTANCE;
                        return Sc.s.a(th2);
                    }
                    r.Companion companion2 = Sc.r.INSTANCE;
                    return location;
                }
                oVar = (o) sVar.f78241d;
                Sc.s.b(obj);
                rVar = (Sc.r) obj;
                if (rVar == null && !(rVar.getF26106a() instanceof r.b)) {
                    return rVar.getF26106a();
                }
                if (rVar != null || (fVar = Sc.r.b(rVar.getF26106a())) == null) {
                    fVar = new dj.f();
                }
                J j11 = oVar.f78225e;
                sVar.f78241d = fVar;
                sVar.f78244g = 2;
                a11 = j11.a(oVar.f78221a, sVar);
                if (a11 != aVar) {
                    th2 = fVar;
                    obj = a11;
                    location = (Location) obj;
                    if (location != null) {
                    }
                }
                return aVar;
            }
        }
        sVar = new s(this, cVar);
        Object obj2 = sVar.f78242e;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = sVar.f78244g;
        if (i11 != 0) {
        }
        rVar = (Sc.r) obj2;
        if (rVar == null) {
        }
        if (rVar != null) {
        }
        fVar = new dj.f();
        J j112 = oVar.f78225e;
        sVar.f78241d = fVar;
        sVar.f78244g = 2;
        a11 = j112.a(oVar.f78221a, sVar);
        if (a11 != aVar) {
        }
        return aVar;
    }

    @NotNull
    public final InterfaceC2395h g(long j11, @NotNull a providerMode, boolean z11) {
        InterfaceC2395h B11;
        Intrinsics.checkNotNullParameter(providerMode, "providerMode");
        int i11 = b.f78227a[providerMode.ordinal()];
        if (i11 == 1) {
            InterfaceC2395h e11 = C2399j.e(new p(this, j11, null));
            C10720e0 c10720e0 = C10720e0.f105451a;
            B11 = C2399j.B(e11, He.b.f10879b);
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            B11 = this.f78222b.j();
        }
        InterfaceC2395h locationsFlow = B11;
        if (!z11) {
            return locationsFlow;
        }
        n nVar = this.f78223c;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(locationsFlow, "locationsFlow");
        return C2399j.A(new m(locationsFlow, null, new we0.o(3), new kotlin.jvm.internal.K(), nVar));
    }
}
