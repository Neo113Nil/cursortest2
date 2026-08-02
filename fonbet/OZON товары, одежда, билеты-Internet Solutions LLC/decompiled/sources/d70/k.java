package d70;

import A30.m;
import Ae.C0;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.r;
import Sc.s;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import d70.d;
import g30.InterfaceC6618a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.models.OfflineLocation;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private S80.b f61229a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final V60.a f61230b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f61231c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final R30.a f61232d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final c30.j f61233e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f61234f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final K80.b f61235g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f61236h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Moshi f61237i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61238j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61239k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f61240l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f61241m;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.domain.OfflineManagerImpl$generateSmsAndRedirect$1", f = "OfflineManagerImpl.kt", l = {266}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61242d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f61244f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f61245g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f61246h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f61247i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f61248j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f61249k;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.domain.OfflineManagerImpl$generateSmsAndRedirect$1$smsText$1", f = "OfflineManagerImpl.kt", l = {267}, m = "invokeSuspend")
        /* renamed from: d70.k$a$a, reason: collision with other inner class name */
        static final class C0949a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f61250d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ k f61251e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f61252f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f61253g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f61254h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f61255i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f61256j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0949a(k kVar, String str, String str2, String str3, boolean z11, boolean z12, kotlin.coroutines.d<? super C0949a> dVar) {
                super(2, dVar);
                this.f61251e = kVar;
                this.f61252f = str;
                this.f61253g = str2;
                this.f61254h = str3;
                this.f61255i = z11;
                this.f61256j = z12;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0949a(this.f61251e, this.f61252f, this.f61253g, this.f61254h, this.f61255i, this.f61256j, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
                return ((C0949a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f61250d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                s.b(obj);
                V60.a aVar2 = this.f61251e.f61230b;
                this.f61250d = 1;
                Object g10 = aVar2.g(this.f61252f, this.f61253g, this.f61254h, this.f61255i, this.f61256j, this);
                return g10 == aVar ? aVar : g10;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3, String str4, boolean z11, boolean z12, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f61244f = str;
            this.f61245g = str2;
            this.f61246h = str3;
            this.f61247i = str4;
            this.f61248j = z11;
            this.f61249k = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new a(this.f61244f, this.f61245g, this.f61246h, this.f61247i, this.f61248j, this.f61249k, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61242d;
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                He.b bVar = He.b.f10879b;
                C0949a c0949a = new C0949a(k.this, this.f61245g, this.f61246h, this.f61247i, this.f61248j, this.f61249k, null);
                this.f61242d = 1;
                obj = C10727i.f(bVar, c0949a, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            k kVar = k.this;
            kVar.f61234f.z();
            kVar.f61229a.s0((String) obj, this.f61244f);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.domain.OfflineManagerImpl$refreshOfflineCache$1", f = "OfflineManagerImpl.kt", l = {243, 244, 245, 248}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f61257d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ W60.a f61259f;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61260a;

            static {
                int[] iArr = new int[W60.a.values().length];
                try {
                    iArr[W60.a.MAIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[W60.a.TRANSFER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[W60.a.CBOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f61260a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(W60.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f61259f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k.this.new b(this.f61259f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        
            if (r7 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            if (r7 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        
            if (r7 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        
            if (r7 == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f61257d;
            if (i11 == 0) {
                s.b(obj);
                V60.a aVar2 = k.this.f61230b;
                W60.a aVar3 = this.f61259f;
                if (aVar3 != null) {
                    int i12 = a.f61260a[aVar3.ordinal()];
                    if (i12 == 1) {
                        this.f61257d = 1;
                        obj = aVar2.l(this);
                    } else if (i12 == 2) {
                        this.f61257d = 2;
                        obj = aVar2.k(this);
                    } else {
                        if (i12 != 3) {
                            throw new o();
                        }
                        this.f61257d = 3;
                        obj = aVar2.f(this);
                    }
                } else {
                    this.f61257d = 4;
                    obj = aVar2.o(this);
                }
                return aVar;
            }
            if (i11 == 1) {
                s.b(obj);
            } else if (i11 == 2) {
                s.b(obj);
            } else if (i11 == 3) {
                s.b(obj);
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public k(@NotNull S80.b fintechNavigation, @NotNull V60.a offlineRepository, @NotNull Q90.c featureToggles, @NotNull R30.a appCoroutineScopes, @NotNull c30.j networkInfoProvider, @NotNull InterfaceC6618a analyticsInteractor, @NotNull K80.b fintechLocationManager, @NotNull SharedPreferences sharedPreferences, @NotNull Moshi moshi, @NotNull m fintechAuthInteractor) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(offlineRepository, "offlineRepository");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(fintechLocationManager, "fintechLocationManager");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        this.f61229a = fintechNavigation;
        this.f61230b = offlineRepository;
        this.f61231c = featureToggles;
        this.f61232d = appCoroutineScopes;
        this.f61233e = networkInfoProvider;
        this.f61234f = analyticsInteractor;
        this.f61235g = fintechLocationManager;
        this.f61236h = sharedPreferences;
        this.f61237i = moshi;
        this.f61238j = Sc.k.b(new Q90.l(this, 1));
        this.f61239k = Sc.k.b(new f(this, 0));
        this.f61241m = new LinkedHashMap();
        fintechAuthInteractor.A(new N50.a(this, 2));
        fintechAuthInteractor.B(new g(this, 0));
    }

    public static void k(k kVar, OfflineLocation offlineLocation, List addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Address address = (Address) C7714v.M(addresses);
        kVar.f61234f.M0(offlineLocation.isOffline(), address != null ? address.getCountryName() : null, address != null ? address.getAdminArea() : null, address != null ? address.getSubAdminArea() : null, address != null ? address.getLocality() : null, address != null ? Double.valueOf(address.getLatitude()) : null, address != null ? Double.valueOf(address.getLongitude()) : null);
        SharedPreferences.Editor edit = kVar.f61236h.edit();
        edit.remove("offline_location");
        edit.apply();
    }

    public static Context l(k kVar) {
        Activity c11 = kVar.f61229a.c();
        if (c11 != null) {
            return c11.getBaseContext();
        }
        return null;
    }

    public static JsonAdapter m(k kVar) {
        return kVar.f61237i.c(OfflineLocation.class);
    }

    public static Unit n(k kVar) {
        C10727i.c(kVar.f61232d.b(), null, null, new j(kVar, null), 3);
        return Unit.f71690a;
    }

    public static Unit o(k kVar) {
        C10727i.c(kVar.f61232d.b(), null, null, new j(kVar, null), 3);
        return Unit.f71690a;
    }

    public static void p(k kVar, boolean z11, Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        OfflineLocation offlineLocation = new OfflineLocation(location.getLatitude(), location.getLongitude(), z11);
        SharedPreferences.Editor edit = kVar.f61236h.edit();
        edit.putString("offline_location", ((JsonAdapter) kVar.f61238j.getValue()).toJson(offlineLocation));
        edit.apply();
    }

    @Override // d70.d
    public final long a() {
        return this.f61230b.a();
    }

    @Override // d70.d
    public final void b() {
        this.f61240l = false;
        this.f61229a.b();
    }

    @Override // d70.d
    public final void c(final boolean z11) {
        Context context = (Context) this.f61239k.getValue();
        if (context != null) {
            this.f61235g.b(context, new K80.k() { // from class: d70.h
                @Override // K80.k
                public final void a(Location location) {
                    k.p(k.this, z11, location);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [d70.i] */
    @Override // d70.d
    public final void d() {
        Object a11;
        final OfflineLocation offlineLocation;
        SharedPreferences sharedPreferences = this.f61236h;
        String string = sharedPreferences.getString("offline_location", null);
        if (string == null) {
            offlineLocation = null;
        } else {
            try {
                r.Companion companion = r.INSTANCE;
                a11 = (OfflineLocation) ((JsonAdapter) this.f61238j.getValue()).fromJson(string);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            if (a11 instanceof r.b) {
                a11 = null;
            }
            offlineLocation = (OfflineLocation) a11;
        }
        if (!Geocoder.isPresent() || offlineLocation == null) {
            return;
        }
        try {
            Context context = (Context) this.f61239k.getValue();
            if (context != null) {
                Geocoder geocoder = new Geocoder(context, Locale.getDefault());
                if (Build.VERSION.SDK_INT >= 33) {
                    geocoder.getFromLocation(offlineLocation.getLatitude(), offlineLocation.getLongitude(), 1, new Geocoder.GeocodeListener() { // from class: d70.i
                        @Override // android.location.Geocoder.GeocodeListener
                        public final void onGeocode(List list) {
                            k.k(k.this, offlineLocation, list);
                        }
                    });
                    return;
                }
                List<Address> fromLocation = geocoder.getFromLocation(offlineLocation.getLatitude(), offlineLocation.getLongitude(), 1);
                Address address = fromLocation != null ? (Address) C7714v.M(fromLocation) : null;
                this.f61234f.M0(offlineLocation.isOffline(), address != null ? address.getCountryName() : null, address != null ? address.getAdminArea() : null, address != null ? address.getSubAdminArea() : null, address != null ? address.getLocality() : null, address != null ? Double.valueOf(address.getLatitude()) : null, address != null ? Double.valueOf(address.getLongitude()) : null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove("offline_location");
                edit.apply();
            }
        } catch (Throwable th3) {
            L80.a.a("resolveLocationAndSendAnalytics", "Failed to resolve country from geocoder " + th3);
        }
    }

    @Override // d70.d
    public final void e(@NotNull String amount, @NotNull String phone, @NotNull String bankName, @NotNull String transferPhone, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(transferPhone, "transferPhone");
        C10727i.c(this.f61232d.c(), null, null, new a(transferPhone, amount, phone, bankName, z11, z12, null), 3);
    }

    @Override // d70.d
    public final void f() {
        L80.a.a("PINPADER_OFF", "stopOfflineMode");
        this.f61240l = false;
        C0 J11 = this.f61229a.J();
        if (J11 != null) {
            J11.tryEmit(Boolean.TRUE);
        }
    }

    @Override // d70.d
    public final void g(boolean z11, @NotNull d.a startPoint) {
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        L80.a.a("PINPADER_OFF", "startOfflineMode startPoint=" + startPoint + " offMode=" + this.f61240l);
        if (this.f61240l) {
            return;
        }
        this.f61240l = true;
        this.f61234f.s();
        S80.b bVar = this.f61229a;
        bVar.R0();
        bVar.o0();
        if (z11) {
            c(true);
            bVar.z0();
        } else {
            C0 W11 = bVar.W();
            if (W11 != null) {
                W11.tryEmit(Boolean.TRUE);
            }
        }
    }

    @Override // d70.d
    public final boolean h() {
        return this.f61240l;
    }

    @Override // d70.d
    public final boolean i() {
        boolean f7 = Tl.a.f(this.f61231c, S90.c.MOB_OFFLINE);
        V60.a aVar = this.f61230b;
        boolean d11 = aVar.d();
        boolean z11 = d11 && aVar.m();
        boolean e11 = aVar.e(W60.a.MAIN);
        boolean e12 = aVar.e(W60.a.TRANSFER);
        boolean e13 = aVar.e(W60.a.CBOTTOM);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mobile_feature_enabled", Boolean.valueOf(f7));
        linkedHashMap.put("is_offline_enabled", Boolean.valueOf(d11));
        linkedHashMap.put("is_main_data_cached", Boolean.valueOf(e11));
        linkedHashMap.put("is_transfer_data_cached", Boolean.valueOf(e12));
        linkedHashMap.put("is_cbottom_data_cached", Boolean.valueOf(e13));
        if (!linkedHashMap.equals(this.f61241m)) {
            this.f61241m = linkedHashMap;
            if (!linkedHashMap.isEmpty()) {
                this.f61234f.i1(this.f61241m);
            }
        }
        L80.a.a("OFFLINER", "isFeatureEnabled mobileFeatureEnabled=" + f7 + " frontFeatureEnabled=" + z11);
        return f7 && z11;
    }

    @Override // d70.d
    public final boolean isConnected() {
        return this.f61233e.e();
    }

    @Override // d70.d
    public final void j(W60.a aVar) {
        C10727i.c(this.f61232d.b(), null, null, new b(aVar, null), 3);
    }

    @Override // d70.d
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f61240l = false;
    }
}
