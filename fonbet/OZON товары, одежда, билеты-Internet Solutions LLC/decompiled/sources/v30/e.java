package v30;

import Ae.C2399j;
import Ae.C2410o0;
import Ae.C2414q0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.x0;
import B0.S1;
import B90.m0;
import De.C2862e;
import H30.C3133b;
import H30.h;
import Sc.s;
import android.app.Activity$ScreenCaptureCallback;
import android.icu.util.TimeZone;
import android.os.Build;
import android.webkit.WebView;
import c30.C5742a;
import c30.i;
import c30.j;
import com.squareup.moshi.Moshi;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import g30.InterfaceC6618a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.antifraud.internal.domain.data.SecurityDevicesStatus;
import ru.ozon.fintech.antifraud.internal.models.DeviceStatus;
import w30.C10426a;
import w30.i;
import w30.k;
import w30.m;
import w30.n;
import w30.o;
import w30.q;
import w30.r;
import w30.t;
import x30.j;

/* loaded from: classes3.dex */
public final class e implements v30.d {

    /* renamed from: A, reason: collision with root package name */
    private boolean f102006A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final Object f102007B;

    /* renamed from: C, reason: collision with root package name */
    private M0<DeviceStatus> f102008C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final Object f102009D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Boolean> f102010E;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x30.f f102011a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f102012b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Moshi f102013c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10219a f102014d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final S1 f102015e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final n f102016f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final w30.b f102017g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final q f102018h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final c30.b f102019i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final i f102020j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C10426a f102021k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final c30.j f102022l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final k f102023m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f102024n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final R30.a f102025o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final o f102026p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final w30.i f102027q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final t f102028r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final v30.b f102029s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final Q90.c f102030t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final m f102031u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C5742a f102032v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f102033w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final r f102034x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final Object f102035y;

    /* renamed from: z, reason: collision with root package name */
    private final ExecutorService f102036z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<Pair<String, String>> f102037a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<String> f102038b;

        /* renamed from: c, reason: collision with root package name */
        private final DeviceStatus.Location f102039c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final j.a f102040d;

        /* renamed from: e, reason: collision with root package name */
        private final i.a f102041e;

        /* renamed from: f, reason: collision with root package name */
        private final r.a f102042f;

        public a(@NotNull List<Pair<String, String>> deviceIds, @NotNull List<String> foundApps, DeviceStatus.Location location, @NotNull j.a networkState, i.a aVar, r.a aVar2) {
            Intrinsics.checkNotNullParameter(deviceIds, "deviceIds");
            Intrinsics.checkNotNullParameter(foundApps, "foundApps");
            Intrinsics.checkNotNullParameter(networkState, "networkState");
            this.f102037a = deviceIds;
            this.f102038b = foundApps;
            this.f102039c = location;
            this.f102040d = networkState;
            this.f102041e = aVar;
            this.f102042f = aVar2;
        }

        public final i.a a() {
            return this.f102041e;
        }

        @NotNull
        public final List<Pair<String, String>> b() {
            return this.f102037a;
        }

        @NotNull
        public final List<String> c() {
            return this.f102038b;
        }

        public final DeviceStatus.Location d() {
            return this.f102039c;
        }

        @NotNull
        public final j.a e() {
            return this.f102040d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f102037a, aVar.f102037a) && Intrinsics.d(this.f102038b, aVar.f102038b) && Intrinsics.d(this.f102039c, aVar.f102039c) && Intrinsics.d(this.f102040d, aVar.f102040d) && Intrinsics.d(this.f102041e, aVar.f102041e) && Intrinsics.d(this.f102042f, aVar.f102042f);
        }

        public final r.a f() {
            return this.f102042f;
        }

        public final int hashCode() {
            int b11 = G.g.b(this.f102037a.hashCode() * 31, 31, this.f102038b);
            DeviceStatus.Location location = this.f102039c;
            int hashCode = (this.f102040d.hashCode() + ((b11 + (location == null ? 0 : location.hashCode())) * 31)) * 31;
            i.a aVar = this.f102041e;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            r.a aVar2 = this.f102042f;
            return hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "CombinedData(deviceIds=" + this.f102037a + ", foundApps=" + this.f102038b + ", location=" + this.f102039c + ", networkState=" + this.f102040d + ", actualCellsData=" + this.f102041e + ", permissionsInfo=" + this.f102042f + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f102043a;

        /* renamed from: b, reason: collision with root package name */
        private final long f102044b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final a f102045c;

        public b(boolean z11, long j11, @NotNull a newParams) {
            Intrinsics.checkNotNullParameter(newParams, "newParams");
            this.f102043a = z11;
            this.f102044b = j11;
            this.f102045c = newParams;
        }

        @NotNull
        public final a a() {
            return this.f102045c;
        }

        public final long b() {
            return this.f102044b;
        }

        public final boolean c() {
            return this.f102043a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f102043a == bVar.f102043a && this.f102044b == bVar.f102044b && Intrinsics.d(this.f102045c, bVar.f102045c);
        }

        public final int hashCode() {
            return this.f102045c.hashCode() + Pk0.c.a(Boolean.hashCode(this.f102043a) * 31, 31, this.f102044b);
        }

        @NotNull
        public final String toString() {
            return "ManagersData(isActiveScreenCapture=" + this.f102043a + ", screenshotTime=" + this.f102044b + ", newParams=" + this.f102045c + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.FintechAntiFraudInteractorImpl$_devicesStatusHeaderState$2$1", f = "FintechAntiFraudInteractorImpl.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o<Long, Boolean, a, kotlin.coroutines.d<? super b>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ long f102046d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ boolean f102047e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ a f102048f;

        @Override // fd.InterfaceC6512o
        public final Object invoke(Long l11, Boolean bool, a aVar, kotlin.coroutines.d<? super b> dVar) {
            long longValue = l11.longValue();
            boolean booleanValue = bool.booleanValue();
            c cVar = new c(4, dVar);
            cVar.f102046d = longValue;
            cVar.f102047e = booleanValue;
            cVar.f102048f = aVar;
            return cVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            long j11 = this.f102046d;
            boolean z11 = this.f102047e;
            a aVar2 = this.f102048f;
            L80.a.a("AntiFraud", "ManagersData " + aVar2);
            return new b(z11, j11, aVar2);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.FintechAntiFraudInteractorImpl$_devicesStatusHeaderState$2$3", f = "FintechAntiFraudInteractorImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<DeviceStatus, b, kotlin.coroutines.d<? super DeviceStatus>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ DeviceStatus f102049d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ b f102050e;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(DeviceStatus deviceStatus, b bVar, kotlin.coroutines.d<? super DeviceStatus> dVar) {
            d dVar2 = e.this.new d(dVar);
            dVar2.f102049d = deviceStatus;
            dVar2.f102050e = bVar;
            return dVar2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            List<i.b> a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            DeviceStatus deviceStatus = this.f102049d;
            b bVar = this.f102050e;
            e eVar = e.this;
            eVar.f102023m.getClass();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (!deviceStatus.isActiveScreenCapture() || bVar.c()) {
                currentTimeMillis = deviceStatus.getLastScreenCaptureTimeTs();
            }
            long j11 = currentTimeMillis;
            if (deviceStatus.isActiveScreenCapture() != bVar.c()) {
                eVar.f102024n.L1(Boolean.valueOf(bVar.c()), null);
            }
            Pair<Integer, Integer> a12 = eVar.f102031u.a();
            boolean c11 = bVar.c();
            long b11 = bVar.b();
            eVar.f102015e.getClass();
            int rawOffset = TimeZone.getDefault().getRawOffset();
            String b12 = V.e.b(new Object[]{rawOffset >= 0 ? "+" : "-", Integer.valueOf(Math.abs(rawOffset) / 3600000), Integer.valueOf((Math.abs(rawOffset) / 60000) % 60)}, 3, "UTC%s%02d:%02d", "format(...)");
            boolean c12 = eVar.f102016f.c();
            String c13 = eVar.f102017g.c();
            String d11 = eVar.f102017g.d();
            long b13 = eVar.f102017g.b();
            boolean a13 = eVar.f102017g.a();
            DeviceStatus.Location d12 = bVar.a().d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(deviceStatus.getIds());
            U.p(linkedHashMap, bVar.a().b());
            List<String> c14 = bVar.a().c();
            String a14 = bVar.a().e().a();
            boolean b14 = bVar.a().e().b();
            String a15 = eVar.f102018h.a();
            boolean b15 = eVar.f102028r.b();
            i.a a16 = bVar.a().a();
            if (a16 == null || (a11 = a16.a()) == null) {
                arrayList = null;
            } else {
                List<i.b> list = a11;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
                for (i.b bVar2 : list) {
                    arrayList2.add(new DeviceStatus.CellData(bVar2.i(), bVar2.a(), bVar2.c(), bVar2.d(), bVar2.e(), bVar2.g(), bVar2.b(), bVar2.f()));
                }
                arrayList = arrayList2;
            }
            int a17 = eVar.f102032v.a();
            Boolean b16 = eVar.f102031u.b();
            int intValue = a12.e().intValue();
            int intValue2 = a12.f().intValue();
            String value = eVar.f102033w.g().getValue();
            boolean q11 = eVar.f102033w.q();
            r.a f7 = bVar.a().f();
            Boolean valueOf = f7 != null ? Boolean.valueOf(f7.a()) : null;
            r.a f11 = bVar.a().f();
            Boolean valueOf2 = f11 != null ? Boolean.valueOf(f11.b()) : null;
            r.a f12 = bVar.a().f();
            Boolean valueOf3 = f12 != null ? Boolean.valueOf(f12.c()) : null;
            r.a f13 = bVar.a().f();
            Boolean valueOf4 = f13 != null ? Boolean.valueOf(f13.d()) : null;
            r.a f14 = bVar.a().f();
            DeviceStatus copy$default = DeviceStatus.copy$default(deviceStatus, false, c11, "", false, false, false, b11, j11, 0L, 0L, null, null, b12, c13, b13, d11, a13, c12, d12, linkedHashMap, c14, a14, null, b14, a15, arrayList, b15, a17, b16, intValue, intValue2, value, Boolean.valueOf(q11), valueOf, valueOf2, valueOf3, valueOf4, f14 != null ? Boolean.valueOf(f14.e()) : null, eVar.f102033w.j(), 4197888, 0, null);
            L80.a.a("AntiFraud", "Device status - " + copy$default);
            return copy$default;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.FintechAntiFraudInteractorImpl$combinedParams$2$1", f = "FintechAntiFraudInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: v30.e$e, reason: collision with other inner class name */
    static final class C2220e extends kotlin.coroutines.jvm.internal.j implements fd.r<i.a, List<? extends Pair<? extends String, ? extends String>>, List<? extends String>, j.a, i.a, r.a, kotlin.coroutines.d<? super a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ i.a f102052d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ List f102053e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ List f102054f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ j.a f102055g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ i.a f102056h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ r.a f102057i;

        C2220e(kotlin.coroutines.d<? super C2220e> dVar) {
            super(7, dVar);
        }

        @Override // fd.r
        public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
            C2220e c2220e = e.this.new C2220e((kotlin.coroutines.d) serializable);
            c2220e.f102052d = (i.a) obj;
            c2220e.f102053e = (List) obj2;
            c2220e.f102054f = (List) obj3;
            c2220e.f102055g = (j.a) obj4;
            c2220e.f102056h = (i.a) obj5;
            c2220e.f102057i = (r.a) obj6;
            return c2220e.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            DeviceStatus.Location location;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            i.a aVar2 = this.f102052d;
            List list = this.f102053e;
            List list2 = this.f102054f;
            j.a aVar3 = this.f102055g;
            i.a aVar4 = this.f102056h;
            r.a aVar5 = this.f102057i;
            if (aVar2 != null) {
                e.this.getClass();
                location = new DeviceStatus.Location(aVar2.b(), aVar2.c(), aVar2.a(), aVar2.d());
            } else {
                location = null;
            }
            return new a(list, list2, location, aVar3, aVar4, aVar5);
        }
    }

    public e(@NotNull x30.f screenCaptureManager, @NotNull x30.j screenshotManager, @NotNull Moshi moshi, @NotNull C10219a antiFraudConfig, @NotNull S1 timeZoneProvider, @NotNull n emulatorInfoProvider, @NotNull w30.b carrierInfoProvider, @NotNull q ozonIDSessionProvider, @NotNull c30.b deviceIdsProvider, @NotNull c30.i locationProvider, @NotNull C10426a appsInfoProvider, @NotNull c30.j networkInfoProvider, @NotNull k currentTimeProvider, @NotNull InterfaceC6618a analyticInteractor, @NotNull R30.a appCoroutineScopes, @NotNull o keyboardsProvider, @NotNull w30.i cellInfoProvider, @NotNull t rootProvider, @NotNull v30.b checkPermissions, @NotNull Q90.c featureToggles, @NotNull m displayInfoProvider, @NotNull C5742a batteryInfoProvider, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull r permissionsInfoProvider) {
        Intrinsics.checkNotNullParameter(screenCaptureManager, "screenCaptureManager");
        Intrinsics.checkNotNullParameter(screenshotManager, "screenshotManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(antiFraudConfig, "antiFraudConfig");
        Intrinsics.checkNotNullParameter(timeZoneProvider, "timeZoneProvider");
        Intrinsics.checkNotNullParameter(emulatorInfoProvider, "emulatorInfoProvider");
        Intrinsics.checkNotNullParameter(carrierInfoProvider, "carrierInfoProvider");
        Intrinsics.checkNotNullParameter(ozonIDSessionProvider, "ozonIDSessionProvider");
        Intrinsics.checkNotNullParameter(deviceIdsProvider, "deviceIdsProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(appsInfoProvider, "appsInfoProvider");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(keyboardsProvider, "keyboardsProvider");
        Intrinsics.checkNotNullParameter(cellInfoProvider, "cellInfoProvider");
        Intrinsics.checkNotNullParameter(rootProvider, "rootProvider");
        Intrinsics.checkNotNullParameter(checkPermissions, "checkPermissions");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(displayInfoProvider, "displayInfoProvider");
        Intrinsics.checkNotNullParameter(batteryInfoProvider, "batteryInfoProvider");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(permissionsInfoProvider, "permissionsInfoProvider");
        this.f102011a = screenCaptureManager;
        this.f102012b = screenshotManager;
        this.f102013c = moshi;
        this.f102014d = antiFraudConfig;
        this.f102015e = timeZoneProvider;
        this.f102016f = emulatorInfoProvider;
        this.f102017g = carrierInfoProvider;
        this.f102018h = ozonIDSessionProvider;
        this.f102019i = deviceIdsProvider;
        this.f102020j = locationProvider;
        this.f102021k = appsInfoProvider;
        this.f102022l = networkInfoProvider;
        this.f102023m = currentTimeProvider;
        this.f102024n = analyticInteractor;
        this.f102025o = appCoroutineScopes;
        this.f102026p = keyboardsProvider;
        this.f102027q = cellInfoProvider;
        this.f102028r = rootProvider;
        this.f102029s = checkPermissions;
        this.f102030t = featureToggles;
        this.f102031u = displayInfoProvider;
        this.f102032v = batteryInfoProvider;
        this.f102033w = fintechSettings;
        this.f102034x = permissionsInfoProvider;
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f102035y = Sc.k.a(nVar, new m0(this, 8));
        this.f102036z = Executors.newSingleThreadExecutor();
        this.f102007B = Sc.k.a(nVar, new F90.d(this, 6));
        this.f102009D = Sc.k.a(nVar, new K70.c(this, 4));
        this.f102010E = screenCaptureManager.i();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Sc.j, java.lang.Object] */
    public static C2410o0 h(e eVar) {
        x0<Long> e11 = eVar.f102012b.e();
        x30.f fVar = eVar.f102011a;
        C2414q0 i11 = C2399j.i(e11, fVar.i(), (InterfaceC2395h) eVar.f102007B.getValue(), new c(4, null));
        boolean booleanValue = fVar.i().getValue().booleanValue();
        ArrayList a11 = eVar.f102026p.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        U.p(linkedHashMap, eVar.f102019i.g().getValue());
        return new C2410o0(new DeviceStatus(false, booleanValue, null, false, false, false, 0L, 0L, 0L, 0L, null, null, null, null, 0L, null, false, false, null, linkedHashMap, null, null, a11, false, null, null, false, 0, null, 0, 0, null, null, null, null, null, null, null, null, -4718596, 127, null), i11, eVar.new d(null));
    }

    public static h i(e eVar) {
        x0<i.a> f12 = eVar.f102020j.b();
        x0<List<Pair<String, String>>> f22 = eVar.f102019i.g();
        x0<List<String>> f32 = eVar.f102021k.a();
        x0<j.a> f42 = eVar.f102022l.d();
        x0<i.a> f52 = eVar.f102027q.e();
        x0<r.a> f62 = eVar.f102034x.b();
        C2220e transform = eVar.new C2220e(null);
        Intrinsics.checkNotNullParameter(f12, "f1");
        Intrinsics.checkNotNullParameter(f22, "f2");
        Intrinsics.checkNotNullParameter(f32, "f3");
        Intrinsics.checkNotNullParameter(f42, "f4");
        Intrinsics.checkNotNullParameter(f52, "f5");
        Intrinsics.checkNotNullParameter(f62, "f6");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new h(new InterfaceC2395h[]{f12, f22, f32, f42, f52, f62}, transform);
    }

    public static S90.a j(e eVar) {
        return eVar.f102030t.q(S90.c.MOB_ANTIFRAUD_CELLS_INFO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String v(DeviceStatus deviceStatus) {
        Moshi moshi = this.f102013c;
        C10219a c10219a = this.f102014d;
        String a11 = c10219a.a();
        String b11 = c10219a.b();
        this.f102023m.getClass();
        try {
            return moshi.c(SecurityDevicesStatus.class).toJson(new SecurityDevicesStatus(a11, b11, null, 0, null, DeviceStatus.copy$default(deviceStatus, false, false, null, false, false, false, 0L, 0L, 0L, System.currentTimeMillis() / 1000, null, null, null, null, 0L, null, false, false, null, null, null, null, null, false, null, null, false, 0, null, 0, 0, null, null, null, null, null, null, null, null, -513, 127, null), 28, null));
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Sc.j, java.lang.Object] */
    @Override // v30.d
    public final void a(@NotNull androidx.fragment.app.r activity) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f102008C == null) {
            return;
        }
        this.f102021k.b();
        int i11 = Build.VERSION.SDK_INT;
        v30.b bVar = this.f102029s;
        x30.j jVar = this.f102012b;
        if (i11 > 33 && !this.f102006A) {
            try {
                Activity$ScreenCaptureCallback d11 = jVar.d();
                if (d11 != null) {
                    activity.registerScreenCaptureCallback(this.f102036z, d11);
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
            } catch (IllegalStateException e11) {
                L80.a.c("AntiFraud", "Exception while registerScreenCaptureCallback because is registered", e11);
                bool = Boolean.TRUE;
            } catch (Exception e12) {
                L80.a.c("AntiFraud", "Exception while registerScreenCaptureCallback", e12);
                bool = Boolean.FALSE;
            }
            this.f102006A = bool != null ? bool.booleanValue() : false;
        } else if (bVar.c(activity)) {
            jVar.f(activity);
        }
        this.f102011a.k(activity);
        this.f102034x.a(activity);
        if (bVar.b(activity)) {
            this.f102020j.d();
        }
        if (((S90.a) this.f102035y.getValue()).b().isEnabled()) {
            this.f102027q.f(activity);
        }
    }

    @Override // v30.d
    public final f b() {
        M0<DeviceStatus> m02 = this.f102008C;
        if (m02 == null) {
            return null;
        }
        return new f(m02, this);
    }

    @Override // v30.d
    @NotNull
    public final String c() {
        M0<DeviceStatus> m02 = this.f102008C;
        if (m02 == null) {
            return "";
        }
        byte[] bytes = v(m02.getValue()).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return C3133b.a(bytes);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Sc.j, java.lang.Object] */
    @Override // v30.d
    public final void d(@NotNull androidx.fragment.app.r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        x30.f fVar = this.f102011a;
        fVar.h();
        this.f102014d.getClass();
        c30.b bVar = this.f102019i;
        bVar.h("");
        this.f102022l.g();
        InterfaceC2395h interfaceC2395h = (InterfaceC2395h) this.f102009D.getValue();
        C2862e b11 = this.f102025o.b();
        int i11 = I0.f818a;
        I0 c11 = I0.a.c();
        boolean booleanValue = fVar.i().getValue().booleanValue();
        ArrayList a11 = this.f102026p.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        U.p(linkedHashMap, bVar.g().getValue());
        Unit unit = Unit.f71690a;
        this.f102008C = C2399j.M(interfaceC2395h, b11, c11, new DeviceStatus(false, booleanValue, null, false, false, false, 0L, 0L, 0L, 0L, null, null, null, null, 0L, null, false, false, null, linkedHashMap, null, null, a11, false, null, null, false, 0, null, 0, 0, null, null, null, null, null, null, null, null, -4718596, 127, null));
    }

    @Override // v30.d
    public final void e(@NotNull l80.f activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f102008C == null) {
            return;
        }
        if (Build.VERSION.SDK_INT > 33 && this.f102006A) {
            try {
                Activity$ScreenCaptureCallback d11 = this.f102012b.d();
                if (d11 != null) {
                    activity.unregisterScreenCaptureCallback(d11);
                }
            } catch (Exception e11) {
                L80.a.c("AntiFraud", "Exception while unregisterScreenCaptureCallback", e11);
            }
            this.f102006A = false;
        }
        this.f102011a.l(activity);
    }

    @Override // v30.d
    public final void f(@NotNull l80.f activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f102008C == null) {
            return;
        }
        this.f102011a.g();
        this.f102012b.getClass();
        this.f102022l.h();
    }

    protected final void finalize() {
        this.f102011a.g();
        this.f102012b.getClass();
        this.f102022l.h();
    }

    @Override // v30.d
    public final void g(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.f102008C == null) {
            return;
        }
        this.f102014d.getClass();
    }
}
